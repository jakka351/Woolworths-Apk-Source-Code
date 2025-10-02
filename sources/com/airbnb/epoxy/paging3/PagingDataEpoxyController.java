package com.airbnb.epoxy.paging3;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.camera2.interop.d;
import androidx.paging.AsyncPagingDataDiffer;
import androidx.paging.AsyncPagingDataDiffer$presenter$1;
import androidx.paging.CombinedLoadStates;
import androidx.paging.ItemSnapshotList;
import androidx.paging.MutableCombinedLoadStateCollection;
import androidx.paging.PagingData;
import androidx.paging.PagingLogger;
import androidx.recyclerview.widget.DiffUtil;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 1*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u00011B)\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u001a\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00140\u0016J\u001a\u0010\u0017\u001a\u00020\u00142\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u0019H\u0016J#\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0014H\u0004J2\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#2\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010%\u001a\u00020\u001d2\f\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001aH\u0014J\u0006\u0010'\u001a\u00020\u0014J\u001a\u0010(\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00140\u0016J\u0006\u0010)\u001a\u00020\u0014J\u0006\u0010*\u001a\u00020\u0014J\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000,J\u001f\u0010-\u001a\u00020\u00142\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0096@ø\u0001\u0000¢\u0006\u0002\u00100R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/airbnb/epoxy/EpoxyController;", "modelBuildingHandler", "Landroid/os/Handler;", "diffingHandler", "itemDiffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroid/os/Handler;Landroid/os/Handler;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "loadStateFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/CombinedLoadStates;", "getLoadStateFlow", "()Lkotlinx/coroutines/flow/Flow;", "modelCache", "Lcom/airbnb/epoxy/paging3/PagedDataModelCache;", "getModelCache", "()Lcom/airbnb/epoxy/paging3/PagedDataModelCache;", "addLoadStateListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "addModels", "models", "", "Lcom/airbnb/epoxy/EpoxyModel;", "buildItemModel", "currentPosition", "", "item", "(ILjava/lang/Object;)Lcom/airbnb/epoxy/EpoxyModel;", "buildModels", "onModelBound", "holder", "Lcom/airbnb/epoxy/EpoxyViewHolder;", "boundModel", "position", "previouslyBoundModel", "refresh", "removeLoadStateListener", "requestForcedModelBuild", "retry", "snapshot", "Landroidx/paging/ItemSnapshotList;", "submitData", "pagingData", "Landroidx/paging/PagingData;", "(Landroidx/paging/PagingData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "epoxy-paging3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class PagingDataEpoxyController<T> extends EpoxyController {

    @NotNull
    private static final DiffUtil.ItemCallback<Object> DEFAULT_ITEM_DIFF_CALLBACK = new PagingDataEpoxyController$Companion$DEFAULT_ITEM_DIFF_CALLBACK$1();

    @NotNull
    private final PagedDataModelCache<T> modelCache;

    public PagingDataEpoxyController() {
        this(null, null, null, 7, null);
    }

    public static <T> Object submitData$suspendImpl(PagingDataEpoxyController<T> pagingDataEpoxyController, PagingData<T> pagingData, Continuation<? super Unit> continuation) {
        Object objB = ((PagingDataEpoxyController) pagingDataEpoxyController).modelCache.b(pagingData, continuation);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }

    public final void addLoadStateListener(@NotNull Function1<? super CombinedLoadStates, Unit> listener) {
        Intrinsics.h(listener, "listener");
        PagedDataModelCache<T> pagedDataModelCache = this.modelCache;
        pagedDataModelCache.getClass();
        pagedDataModelCache.g.a(listener);
    }

    public void addModels(@NotNull List<? extends EpoxyModel<?>> models) {
        Intrinsics.h(models, "models");
        super.add(models);
    }

    @NotNull
    public abstract EpoxyModel<?> buildItemModel(int currentPosition, @Nullable T item);

    @Override // com.airbnb.epoxy.EpoxyController
    public final void buildModels() {
        ArrayList arrayList;
        PagedDataModelCache<T> pagedDataModelCache = this.modelCache;
        synchronized (pagedDataModelCache) {
            try {
                ItemSnapshotList itemSnapshotListB = pagedDataModelCache.g.b();
                int i = 0;
                if (Intrinsics.c(Looper.myLooper(), pagedDataModelCache.c.getLooper())) {
                    IntProgressionIterator it = RangesKt.o(0, pagedDataModelCache.d.size()).iterator();
                    while (it.f) {
                        int iNextInt = it.nextInt();
                        if (pagedDataModelCache.d.get(iNextInt) == null) {
                            pagedDataModelCache.d.set(iNextInt, ((PagingDataEpoxyController$modelCache$1) pagedDataModelCache.f13332a).invoke(Integer.valueOf(iNextInt), itemSnapshotListB.get(iNextInt)));
                        }
                    }
                    Integer num = pagedDataModelCache.e;
                    if (num != null) {
                        pagedDataModelCache.c(num.intValue());
                    }
                    arrayList = pagedDataModelCache.d;
                    Intrinsics.f(arrayList, "null cannot be cast to non-null type kotlin.collections.List<com.airbnb.epoxy.EpoxyModel<*>>");
                } else {
                    arrayList = new ArrayList(CollectionsKt.s(itemSnapshotListB, 10));
                    Iterator it2 = itemSnapshotListB.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        arrayList.add((EpoxyModel) ((PagingDataEpoxyController$modelCache$1) pagedDataModelCache.f13332a).invoke(Integer.valueOf(i), next));
                        i = i2;
                    }
                }
                addModels(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NotNull
    public final Flow<CombinedLoadStates> getLoadStateFlow() {
        return this.modelCache.g.i;
    }

    @NotNull
    public final PagedDataModelCache<T> getModelCache() {
        return this.modelCache;
    }

    @Override // com.airbnb.epoxy.EpoxyController
    public void onModelBound(@NotNull EpoxyViewHolder holder, @NotNull EpoxyModel<?> boundModel, int position, @Nullable EpoxyModel<?> previouslyBoundModel) {
        Intrinsics.h(holder, "holder");
        Intrinsics.h(boundModel, "boundModel");
        PagedDataModelCache<T> pagedDataModelCache = this.modelCache;
        pagedDataModelCache.c(position);
        pagedDataModelCache.e = Integer.valueOf(position);
    }

    public final void refresh() {
        AsyncPagingDataDiffer$presenter$1 asyncPagingDataDiffer$presenter$1 = this.modelCache.g.g;
        asyncPagingDataDiffer$presenter$1.getClass();
        if (PagingLogger.a(3)) {
            PagingLogger.b(3, "Refresh signal received");
        }
        asyncPagingDataDiffer$presenter$1.c.h();
    }

    public final void removeLoadStateListener(@NotNull Function1<? super CombinedLoadStates, Unit> listener) {
        Function1 function1;
        Intrinsics.h(listener, "listener");
        PagedDataModelCache<T> pagedDataModelCache = this.modelCache;
        pagedDataModelCache.getClass();
        AsyncPagingDataDiffer asyncPagingDataDiffer = pagedDataModelCache.g;
        CopyOnWriteArrayList copyOnWriteArrayList = asyncPagingDataDiffer.l;
        copyOnWriteArrayList.remove(listener);
        if (!copyOnWriteArrayList.isEmpty() || (function1 = (Function1) asyncPagingDataDiffer.k.get()) == null) {
            return;
        }
        AsyncPagingDataDiffer$presenter$1 asyncPagingDataDiffer$presenter$1 = asyncPagingDataDiffer.g;
        asyncPagingDataDiffer$presenter$1.getClass();
        MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection = asyncPagingDataDiffer$presenter$1.e;
        mutableCombinedLoadStateCollection.getClass();
        mutableCombinedLoadStateCollection.f3549a.remove(function1);
    }

    public final void requestForcedModelBuild() {
        PagedDataModelCache<T> pagedDataModelCache = this.modelCache;
        pagedDataModelCache.c.post(new d(pagedDataModelCache, 24));
        requestModelBuild();
    }

    public final void retry() {
        AsyncPagingDataDiffer$presenter$1 asyncPagingDataDiffer$presenter$1 = this.modelCache.g.g;
        asyncPagingDataDiffer$presenter$1.getClass();
        if (PagingLogger.a(3)) {
            PagingLogger.b(3, "Retry signal received");
        }
        asyncPagingDataDiffer$presenter$1.c.g();
    }

    @NotNull
    public final ItemSnapshotList<T> snapshot() {
        return this.modelCache.g.b();
    }

    @Nullable
    public Object submitData(@NotNull PagingData<T> pagingData, @NotNull Continuation<? super Unit> continuation) {
        return submitData$suspendImpl(this, pagingData, continuation);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PagingDataEpoxyController(Handler defaultModelBuildingHandler, Handler defaultDiffingHandler, DiffUtil.ItemCallback itemCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            defaultModelBuildingHandler = EpoxyController.defaultModelBuildingHandler;
            Intrinsics.g(defaultModelBuildingHandler, "defaultModelBuildingHandler");
        }
        if ((i & 2) != 0) {
            defaultDiffingHandler = EpoxyController.defaultDiffingHandler;
            Intrinsics.g(defaultDiffingHandler, "defaultDiffingHandler");
        }
        if ((i & 4) != 0) {
            itemCallback = DEFAULT_ITEM_DIFF_CALLBACK;
            Intrinsics.f(itemCallback, "null cannot be cast to non-null type androidx.recyclerview.widget.DiffUtil.ItemCallback<T of com.airbnb.epoxy.paging3.PagingDataEpoxyController>");
        }
        this(defaultModelBuildingHandler, defaultDiffingHandler, itemCallback);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingDataEpoxyController(@NotNull Handler modelBuildingHandler, @NotNull Handler diffingHandler, @NotNull DiffUtil.ItemCallback<T> itemDiffCallback) {
        super(modelBuildingHandler, diffingHandler);
        Intrinsics.h(modelBuildingHandler, "modelBuildingHandler");
        Intrinsics.h(diffingHandler, "diffingHandler");
        Intrinsics.h(itemDiffCallback, "itemDiffCallback");
        this.modelCache = new PagedDataModelCache<>(new PagingDataEpoxyController$modelCache$1(this), new PagingDataEpoxyController$modelCache$2(this), itemDiffCallback, modelBuildingHandler);
    }
}
