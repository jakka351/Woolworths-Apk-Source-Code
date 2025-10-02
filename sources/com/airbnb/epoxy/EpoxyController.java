package com.airbnb.epoxy;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.AsyncEpoxyDiffer;
import com.airbnb.epoxy.AsyncEpoxyDiffer.AnonymousClass2;
import com.airbnb.epoxy.BoundViewHolders;
import com.airbnb.epoxy.BoundViewHolders.HolderIterator;
import com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public abstract class EpoxyController implements ModelCollector, StickyHeaderCallbacks {
    private static final int DELAY_TO_CHECK_ADAPTER_COUNT_MS = 3000;
    private static final Timer NO_OP_TIMER = new NoOpTimer();
    public static Handler defaultDiffingHandler;
    public static Handler defaultModelBuildingHandler;
    private static boolean filterDuplicatesDefault;
    private static boolean globalDebugLoggingEnabled;
    private static ExceptionHandler globalExceptionHandler;
    private final EpoxyControllerAdapter adapter;
    private final Runnable buildModelsRunnable;
    private EpoxyDiffLogger debugObserver;
    private volatile boolean filterDuplicates;
    private volatile boolean hasBuiltModelsEver;
    private final ControllerHelper helper;
    private final List<Interceptor> interceptors;
    private final Handler modelBuildHandler;
    private List<ModelInterceptorCallback> modelInterceptorCallbacks;
    private ControllerModelList modelsBeingBuilt;
    private int recyclerViewAttachCount;
    private volatile int requestedModelBuildType;
    private EpoxyModel<?> stagedModel;
    private volatile Thread threadBuildingModels;
    private Timer timer;

    /* renamed from: com.airbnb.epoxy.EpoxyController$2, reason: invalid class name */
    public class AnonymousClass2 implements ExceptionHandler {
    }

    public interface ExceptionHandler {
    }

    public interface Interceptor {
        void a();
    }

    public interface ModelInterceptorCallback {
        void a();

        void b();
    }

    static {
        Handler handler = MainThreadExecutor.e.d;
        defaultModelBuildingHandler = handler;
        defaultDiffingHandler = handler;
        filterDuplicatesDefault = false;
        globalDebugLoggingEnabled = false;
        globalExceptionHandler = new AnonymousClass2();
    }

    public EpoxyController() {
        this(defaultModelBuildingHandler, defaultDiffingHandler);
    }

    public static int access$300(EpoxyController epoxyController) {
        int i = epoxyController.adapter.o;
        if (i != 0) {
            return i;
        }
        return 25;
    }

    public static void access$700(EpoxyController epoxyController) {
        if (!epoxyController.interceptors.isEmpty()) {
            List<ModelInterceptorCallback> list = epoxyController.modelInterceptorCallbacks;
            if (list != null) {
                Iterator<ModelInterceptorCallback> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
            epoxyController.timer.a("Interceptors executed");
            Iterator<Interceptor> it2 = epoxyController.interceptors.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
            epoxyController.timer.stop();
            List<ModelInterceptorCallback> list2 = epoxyController.modelInterceptorCallbacks;
            if (list2 != null) {
                Iterator<ModelInterceptorCallback> it3 = list2.iterator();
                while (it3.hasNext()) {
                    it3.next().b();
                }
            }
        }
        epoxyController.modelInterceptorCallbacks = null;
    }

    public static void access$800(EpoxyController epoxyController, List list) {
        if (epoxyController.filterDuplicates) {
            epoxyController.timer.a("Duplicates filtered");
            HashSet hashSet = new HashSet(list.size());
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                EpoxyModel epoxyModel = (EpoxyModel) listIterator.next();
                if (!hashSet.add(Long.valueOf(epoxyModel.d))) {
                    int iPreviousIndex = listIterator.previousIndex();
                    listIterator.remove();
                    int size = list.size();
                    int i = 0;
                    while (i < size) {
                        if (((EpoxyModel) list.get(i)).d == epoxyModel.d) {
                            EpoxyModel epoxyModel2 = (EpoxyModel) list.get(i);
                            if (iPreviousIndex <= i) {
                                i++;
                            }
                            epoxyController.onExceptionSwallowed(new IllegalEpoxyUsage("Two models have the same ID. ID's must be unique!\nOriginal has position " + i + ":\n" + epoxyModel2 + "\nDuplicate has position " + iPreviousIndex + ":\n" + epoxyModel));
                        } else {
                            i++;
                        }
                    }
                    throw new IllegalArgumentException("No duplicates in list");
                }
            }
            epoxyController.timer.stop();
        }
    }

    public static void setGlobalDebugLoggingEnabled(boolean z) {
        globalDebugLoggingEnabled = z;
    }

    public static void setGlobalDuplicateFilteringDefault(boolean z) {
        filterDuplicatesDefault = z;
    }

    public static void setGlobalExceptionHandler(@NonNull ExceptionHandler exceptionHandler) {
        globalExceptionHandler = exceptionHandler;
    }

    public final void a() {
        if (!isBuildingModels()) {
            throw new IllegalEpoxyUsage("Can only call this when inside the `buildModels` method");
        }
    }

    @Override // com.airbnb.epoxy.ModelCollector
    public void add(@NonNull EpoxyModel<?> epoxyModel) {
        epoxyModel.c(this);
    }

    public void addAfterInterceptorCallback(ModelInterceptorCallback modelInterceptorCallback) {
        a();
        if (this.modelInterceptorCallbacks == null) {
            this.modelInterceptorCallbacks = new ArrayList();
        }
        this.modelInterceptorCallbacks.add(modelInterceptorCallback);
    }

    public void addCurrentlyStagedModelIfExists() {
        EpoxyModel<?> epoxyModel = this.stagedModel;
        if (epoxyModel != null) {
            epoxyModel.c(this);
        }
        this.stagedModel = null;
    }

    public void addInterceptor(@NonNull Interceptor interceptor) {
        this.interceptors.add(interceptor);
    }

    public void addInternal(EpoxyModel<?> epoxyModel) {
        a();
        if (epoxyModel.k) {
            throw new IllegalEpoxyUsage("You must set an id on a model before adding it. Use the @AutoModel annotation if you want an id to be automatically generated for you.");
        }
        if (!epoxyModel.f) {
            throw new IllegalEpoxyUsage("You cannot hide a model in an EpoxyController. Use `addIf` to conditionally add a model instead.");
        }
        clearModelFromStaging(epoxyModel);
        epoxyModel.h = null;
        this.modelsBeingBuilt.add(epoxyModel);
    }

    public void addModelBuildListener(OnModelBuildFinishedListener onModelBuildFinishedListener) {
        this.adapter.p.add(onModelBuildFinishedListener);
    }

    public abstract void buildModels();

    public synchronized void cancelPendingModelBuild() {
        if (this.requestedModelBuildType != 0) {
            this.requestedModelBuildType = 0;
            this.modelBuildHandler.removeCallbacks(this.buildModelsRunnable);
        }
    }

    public void clearModelFromStaging(EpoxyModel<?> epoxyModel) {
        if (this.stagedModel != epoxyModel) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = null;
    }

    @NonNull
    public EpoxyControllerAdapter getAdapter() {
        return this.adapter;
    }

    public int getFirstIndexOfModelInBuildingList(EpoxyModel<?> epoxyModel) {
        a();
        int size = this.modelsBeingBuilt.size();
        for (int i = 0; i < size; i++) {
            if (this.modelsBeingBuilt.get(i) == epoxyModel) {
                return i;
            }
        }
        return -1;
    }

    public int getModelCountBuiltSoFar() {
        a();
        return this.modelsBeingBuilt.size();
    }

    public int getSpanCount() {
        return this.adapter.g;
    }

    @NonNull
    public GridLayoutManager.SpanSizeLookup getSpanSizeLookup() {
        return this.adapter.k;
    }

    public boolean hasPendingModelBuild() {
        boolean z;
        if (this.requestedModelBuildType == 0 && this.threadBuildingModels == null) {
            AsyncEpoxyDiffer.GenerationTracker generationTracker = this.adapter.m.d;
            synchronized (generationTracker) {
                z = generationTracker.f13306a > generationTracker.b;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public boolean isBuildingModels() {
        return this.threadBuildingModels == Thread.currentThread();
    }

    public boolean isDebugLoggingEnabled() {
        return this.timer != NO_OP_TIMER;
    }

    public boolean isDuplicateFilteringEnabled() {
        return this.filterDuplicates;
    }

    public boolean isModelAddedMultipleTimes(EpoxyModel<?> epoxyModel) {
        a();
        int size = this.modelsBeingBuilt.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.modelsBeingBuilt.get(i2) == epoxyModel) {
                i++;
            }
        }
        return i > 1;
    }

    public boolean isMultiSpan() {
        return this.adapter.g > 1;
    }

    public boolean isStickyHeader(int i) {
        return false;
    }

    public void moveModel(int i, int i2) {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call this from inside `buildModels`");
        }
        EpoxyControllerAdapter epoxyControllerAdapter = this.adapter;
        epoxyControllerAdapter.getClass();
        ArrayList arrayList = new ArrayList(epoxyControllerAdapter.m.f);
        arrayList.add(i2, (EpoxyModel) arrayList.remove(i));
        epoxyControllerAdapter.l.f13324a = true;
        epoxyControllerAdapter.p(i, i2);
        epoxyControllerAdapter.l.f13324a = false;
        if (epoxyControllerAdapter.m.a(arrayList)) {
            epoxyControllerAdapter.n.requestModelBuild();
        }
        requestDelayedModelBuild(500);
    }

    public void notifyModelChanged(int i) {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call this from inside `buildModels`");
        }
        EpoxyControllerAdapter epoxyControllerAdapter = this.adapter;
        epoxyControllerAdapter.getClass();
        ArrayList arrayList = new ArrayList(epoxyControllerAdapter.m.f);
        epoxyControllerAdapter.l.f13324a = true;
        epoxyControllerAdapter.m(i);
        epoxyControllerAdapter.l.f13324a = false;
        if (epoxyControllerAdapter.m.a(arrayList)) {
            epoxyControllerAdapter.n.requestModelBuild();
        }
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
    }

    public void onAttachedToRecyclerViewInternal(RecyclerView recyclerView) {
        int i = this.recyclerViewAttachCount + 1;
        this.recyclerViewAttachCount = i;
        if (i > 1) {
            MainThreadExecutor.e.d.postDelayed(new Runnable() { // from class: com.airbnb.epoxy.EpoxyController.3
                @Override // java.lang.Runnable
                public final void run() {
                    EpoxyController epoxyController = EpoxyController.this;
                    if (epoxyController.recyclerViewAttachCount > 1) {
                        epoxyController.onExceptionSwallowed(new IllegalStateException("This EpoxyController had its adapter added to more than one ReyclerView. Epoxy does not support attaching an adapter to multiple RecyclerViews because saved state will not work properly. If you did not intend to attach your adapter to multiple RecyclerViews you may be leaking a reference to a previous RecyclerView. Make sure to remove the adapter from any previous RecyclerViews (eg if the adapter is reused in a Fragment across multiple onCreateView/onDestroyView cycles). See https://github.com/airbnb/epoxy/wiki/Avoiding-Memory-Leaks for more information."));
                    }
                }
            }, 3000L);
        }
        onAttachedToRecyclerView(recyclerView);
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
    }

    public void onDetachedFromRecyclerViewInternal(RecyclerView recyclerView) {
        this.recyclerViewAttachCount--;
        onDetachedFromRecyclerView(recyclerView);
    }

    public void onExceptionSwallowed(@NonNull RuntimeException runtimeException) {
        globalExceptionHandler.getClass();
    }

    public void onModelBound(@NonNull EpoxyViewHolder epoxyViewHolder, @NonNull EpoxyModel<?> epoxyModel, int i, @Nullable EpoxyModel<?> epoxyModel2) {
    }

    public void onModelUnbound(@NonNull EpoxyViewHolder epoxyViewHolder, @NonNull EpoxyModel<?> epoxyModel) {
    }

    public void onRestoreInstanceState(@Nullable Bundle bundle) {
        EpoxyControllerAdapter epoxyControllerAdapter = this.adapter;
        if (epoxyControllerAdapter.i.d.j() > 0) {
            throw new IllegalStateException("State cannot be restored once views have been bound. It should be done before adding the adapter to the recycler view.");
        }
        if (bundle != null) {
            ViewHolderState viewHolderState = (ViewHolderState) bundle.getParcelable("saved_state_view_holders");
            epoxyControllerAdapter.j = viewHolderState;
            if (viewHolderState == null) {
                throw new IllegalStateException("Tried to restore instance state, but onSaveInstanceState was never called.");
            }
        }
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        EpoxyControllerAdapter epoxyControllerAdapter = this.adapter;
        BoundViewHolders boundViewHolders = epoxyControllerAdapter.i;
        boundViewHolders.getClass();
        BoundViewHolders.HolderIterator holderIterator = boundViewHolders.new HolderIterator();
        while (holderIterator.hasNext()) {
            epoxyControllerAdapter.j.m((EpoxyViewHolder) holderIterator.next());
        }
        if (epoxyControllerAdapter.j.j() > 0 && !epoxyControllerAdapter.e) {
            throw new IllegalStateException("Must have stable ids when saving view holder state");
        }
        bundle.putParcelable("saved_state_view_holders", epoxyControllerAdapter.j);
    }

    public void onViewAttachedToWindow(@NonNull EpoxyViewHolder epoxyViewHolder, @NonNull EpoxyModel<?> epoxyModel) {
    }

    public void onViewDetachedFromWindow(@NonNull EpoxyViewHolder epoxyViewHolder, @NonNull EpoxyModel<?> epoxyModel) {
    }

    public void removeInterceptor(@NonNull Interceptor interceptor) {
        this.interceptors.remove(interceptor);
    }

    public void removeModelBuildListener(OnModelBuildFinishedListener onModelBuildFinishedListener) {
        this.adapter.p.remove(onModelBuildFinishedListener);
    }

    public synchronized void requestDelayedModelBuild(int i) {
        try {
            if (isBuildingModels()) {
                throw new IllegalEpoxyUsage("Cannot call `requestDelayedModelBuild` from inside `buildModels`");
            }
            if (this.requestedModelBuildType == 2) {
                cancelPendingModelBuild();
            } else if (this.requestedModelBuildType == 1) {
                return;
            }
            this.requestedModelBuildType = i != 0 ? 2 : 1;
            this.modelBuildHandler.postDelayed(this.buildModelsRunnable, i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void requestModelBuild() {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call `requestModelBuild` from inside `buildModels`");
        }
        if (this.hasBuiltModelsEver) {
            requestDelayedModelBuild(0);
        } else {
            this.buildModelsRunnable.run();
        }
    }

    public void setDebugLoggingEnabled(boolean z) {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call this from inside `buildModels`");
        }
        if (z) {
            this.timer = new DebugTimer(getClass().getSimpleName());
            if (this.debugObserver == null) {
                this.debugObserver = new EpoxyDiffLogger(getClass().getSimpleName());
            }
            this.adapter.D(this.debugObserver);
            return;
        }
        this.timer = NO_OP_TIMER;
        EpoxyDiffLogger epoxyDiffLogger = this.debugObserver;
        if (epoxyDiffLogger != null) {
            this.adapter.F(epoxyDiffLogger);
        }
    }

    public void setFilterDuplicates(boolean z) {
        this.filterDuplicates = z;
    }

    public void setSpanCount(int i) {
        this.adapter.g = i;
    }

    public void setStagedModel(EpoxyModel<?> epoxyModel) {
        if (epoxyModel != this.stagedModel) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = epoxyModel;
    }

    public void setupStickyHeaderView(@NotNull View view) {
    }

    public void teardownStickyHeaderView(@NotNull View view) {
    }

    public EpoxyController(Handler handler, Handler handler2) {
        ControllerHelper controllerHelper;
        this.recyclerViewAttachCount = 0;
        this.interceptors = new CopyOnWriteArrayList();
        this.filterDuplicates = filterDuplicatesDefault;
        this.threadBuildingModels = null;
        this.timer = NO_OP_TIMER;
        LinkedHashMap linkedHashMap = ControllerHelperLookup.f13308a;
        Constructor constructorA = ControllerHelperLookup.a(getClass());
        if (constructorA == null) {
            controllerHelper = ControllerHelperLookup.b;
        } else {
            try {
                controllerHelper = (ControllerHelper) constructorA.newInstance(this);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Unable to invoke " + constructorA, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Unable to invoke " + constructorA, e2);
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (!(cause instanceof Error)) {
                    throw new RuntimeException("Unable to get Epoxy helper class.", cause);
                }
                throw ((Error) cause);
            }
        }
        this.helper = controllerHelper;
        this.requestedModelBuildType = 0;
        this.buildModelsRunnable = new Runnable() { // from class: com.airbnb.epoxy.EpoxyController.1
            @Override // java.lang.Runnable
            public final void run() {
                final int i;
                final List list;
                EpoxyController.this.threadBuildingModels = Thread.currentThread();
                EpoxyController.this.cancelPendingModelBuild();
                EpoxyController.this.helper.resetAutoModels();
                EpoxyController epoxyController = EpoxyController.this;
                ControllerModelList controllerModelList = new ControllerModelList(EpoxyController.access$300(EpoxyController.this));
                if (controllerModelList.d) {
                    throw new IllegalStateException("Notifications already paused");
                }
                controllerModelList.d = true;
                epoxyController.modelsBeingBuilt = controllerModelList;
                EpoxyController.this.timer.a("Models built");
                try {
                    EpoxyController.this.buildModels();
                    EpoxyController.this.addCurrentlyStagedModelIfExists();
                    EpoxyController.this.timer.stop();
                    EpoxyController.access$700(EpoxyController.this);
                    EpoxyController epoxyController2 = EpoxyController.this;
                    EpoxyController.access$800(epoxyController2, epoxyController2.modelsBeingBuilt);
                    ControllerModelList controllerModelList2 = EpoxyController.this.modelsBeingBuilt;
                    controllerModelList2.e = ControllerModelList.f;
                    if (!controllerModelList2.d) {
                        throw new IllegalStateException("Notifications already resumed");
                    }
                    controllerModelList2.d = false;
                    EpoxyController.this.timer.a("Models diffed");
                    EpoxyControllerAdapter epoxyControllerAdapter = EpoxyController.this.adapter;
                    final ControllerModelList controllerModelList3 = EpoxyController.this.modelsBeingBuilt;
                    List list2 = epoxyControllerAdapter.m.f;
                    if (!list2.isEmpty() && ((EpoxyModel) list2.get(0)).g != null) {
                        for (int i2 = 0; i2 < list2.size(); i2++) {
                            ((EpoxyModel) list2.get(i2)).B(i2, "The model was changed between being bound and when models were rebuilt");
                        }
                    }
                    final AsyncEpoxyDiffer asyncEpoxyDiffer = epoxyControllerAdapter.m;
                    synchronized (asyncEpoxyDiffer) {
                        AsyncEpoxyDiffer.GenerationTracker generationTracker = asyncEpoxyDiffer.d;
                        synchronized (generationTracker) {
                            i = generationTracker.f13306a + 1;
                            generationTracker.f13306a = i;
                        }
                        list = asyncEpoxyDiffer.e;
                    }
                    if (controllerModelList3 == list) {
                        if (list == null) {
                            list = Collections.EMPTY_LIST;
                        }
                        MainThreadExecutor.f.execute(asyncEpoxyDiffer.new AnonymousClass2(controllerModelList3, i, new DiffResult(list, list, null)));
                    } else if (controllerModelList3 == null || controllerModelList3.isEmpty()) {
                        MainThreadExecutor.f.execute(asyncEpoxyDiffer.new AnonymousClass2(null, i, (list == null || list.isEmpty()) ? null : new DiffResult(list, Collections.EMPTY_LIST, null)));
                    } else if (list == null || list.isEmpty()) {
                        MainThreadExecutor.f.execute(asyncEpoxyDiffer.new AnonymousClass2(controllerModelList3, i, new DiffResult(Collections.EMPTY_LIST, controllerModelList3, null)));
                    } else {
                        final AsyncEpoxyDiffer.DiffCallback diffCallback = new AsyncEpoxyDiffer.DiffCallback(list, controllerModelList3, asyncEpoxyDiffer.c);
                        ((HandlerExecutor) asyncEpoxyDiffer.f13304a).execute(new Runnable() { // from class: com.airbnb.epoxy.AsyncEpoxyDiffer.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                DiffUtil.DiffResult diffResultA = DiffUtil.a(diffCallback, true);
                                List list3 = list;
                                List list4 = controllerModelList3;
                                DiffResult diffResult = new DiffResult(list3, list4, diffResultA);
                                AsyncEpoxyDiffer asyncEpoxyDiffer2 = AsyncEpoxyDiffer.this;
                                asyncEpoxyDiffer2.getClass();
                                MainThreadExecutor.f.execute(asyncEpoxyDiffer2.new AnonymousClass2(list4, i, diffResult));
                            }
                        });
                    }
                    EpoxyController.this.timer.stop();
                    EpoxyController.this.modelsBeingBuilt = null;
                    EpoxyController.this.hasBuiltModelsEver = true;
                    EpoxyController.this.threadBuildingModels = null;
                } catch (Throwable th) {
                    EpoxyController.this.timer.stop();
                    EpoxyController.this.modelsBeingBuilt = null;
                    EpoxyController.this.hasBuiltModelsEver = true;
                    EpoxyController.this.threadBuildingModels = null;
                    EpoxyController.this.stagedModel = null;
                    throw th;
                }
            }
        };
        this.adapter = new EpoxyControllerAdapter(this, handler2);
        this.modelBuildHandler = handler;
        setDebugLoggingEnabled(globalDebugLoggingEnabled);
    }

    public void add(@NonNull EpoxyModel<?>... epoxyModelArr) {
        ControllerModelList controllerModelList = this.modelsBeingBuilt;
        controllerModelList.ensureCapacity(controllerModelList.size() + epoxyModelArr.length);
        for (EpoxyModel<?> epoxyModel : epoxyModelArr) {
            add(epoxyModel);
        }
    }

    public void add(@NonNull List<? extends EpoxyModel<?>> list) {
        ControllerModelList controllerModelList = this.modelsBeingBuilt;
        controllerModelList.ensureCapacity(list.size() + controllerModelList.size());
        Iterator<? extends EpoxyModel<?>> it = list.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }
}
