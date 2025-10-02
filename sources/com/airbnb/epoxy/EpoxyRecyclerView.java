package com.airbnb.epoxy;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.Px;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.feature.rewards.account.settings.e;
import com.airbnb.epoxy.preload.EpoxyPreloader;
import com.airbnb.epoxy.preload.PreloadRequestHolder;
import com.airbnb.epoxy.preload.ViewMetadata;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001:\u00056789:B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\b\b\u0001\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u0011J\u0017\u0010\u001d\u001a\u00020\f2\b\b\u0001\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u0011J\u0019\u0010\u001f\u001a\u00020\f2\b\b\u0001\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0011J!\u0010#\u001a\u00020\f2\u0010\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0 H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\f2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b)\u0010(J\u001d\u0010,\u001a\u00020\f2\f\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010/R\u001a\u00105\u001a\u0002008\u0004X\u0084\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u0006;"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "removeAdapterWhenDetachedFromWindow", "", "setRemoveAdapterWhenDetachedFromWindow", "(Z)V", "delayMsWhenRemovingAdapterOnDetach", "setDelayMsWhenRemovingAdapterOnDetach", "(I)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "setLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "layout", "setLayoutManager", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V", "itemSpacingRes", "setItemSpacingRes", "dp", "setItemSpacingDp", "spacingPx", "setItemSpacingPx", "", "Lcom/airbnb/epoxy/EpoxyModel;", "models", "setModels", "(Ljava/util/List;)V", "Lcom/airbnb/epoxy/EpoxyController;", "controller", "setController", "(Lcom/airbnb/epoxy/EpoxyController;)V", "setControllerAndBuildModels", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "getContextForSharedViewPool", "()Landroid/content/Context;", "Lcom/airbnb/epoxy/EpoxyItemSpacingDecorator;", "R0", "Lcom/airbnb/epoxy/EpoxyItemSpacingDecorator;", "getSpacingDecorator", "()Lcom/airbnb/epoxy/EpoxyItemSpacingDecorator;", "spacingDecorator", "Companion", "ModelBuilderCallback", "ModelBuilderCallbackController", "PreloadConfig", "WithModelsController", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class EpoxyRecyclerView extends RecyclerView {
    public static final ActivityRecyclerPool a1 = new ActivityRecyclerPool();

    /* renamed from: R0, reason: from kotlin metadata */
    public final EpoxyItemSpacingDecorator spacingDecorator;
    public EpoxyController S0;
    public RecyclerView.Adapter T0;
    public boolean U0;
    public int V0;
    public boolean W0;
    public final e X0;
    public final ArrayList Y0;
    public final ArrayList Z0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$Companion;", "", "Lcom/airbnb/epoxy/ActivityRecyclerPool;", "ACTIVITY_RECYCLER_POOL", "Lcom/airbnb/epoxy/ActivityRecyclerPool;", "", "DEFAULT_ADAPTER_REMOVAL_DELAY_MS", "I", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;", "", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ModelBuilderCallback {
        void a(EpoxyController epoxyController);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController;", "Lcom/airbnb/epoxy/EpoxyController;", "()V", "callback", "Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;", "getCallback", "()Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;", "setCallback", "(Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;)V", "buildModels", "", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ModelBuilderCallbackController extends EpoxyController {

        @NotNull
        private ModelBuilderCallback callback = new EpoxyRecyclerView$ModelBuilderCallbackController$callback$1();

        @Override // com.airbnb.epoxy.EpoxyController
        public void buildModels() {
            this.callback.a(this);
        }

        @NotNull
        public final ModelBuilderCallback getCallback() {
            return this.callback;
        }

        public final void setCallback(@NotNull ModelBuilderCallback modelBuilderCallback) {
            Intrinsics.h(modelBuilderCallback, "<set-?>");
            this.callback = modelBuilderCallback;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\n\b\u0001\u0010\u0004*\u0004\u0018\u00010\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$PreloadConfig;", "Lcom/airbnb/epoxy/EpoxyModel;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/airbnb/epoxy/preload/ViewMetadata;", "U", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "P", "", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PreloadConfig<T extends EpoxyModel<?>, U extends ViewMetadata, P extends PreloadRequestHolder> {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0014R+\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController;", "Lcom/airbnb/epoxy/EpoxyController;", "()V", "callback", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "setCallback", "(Lkotlin/jvm/functions/Function1;)V", "buildModels", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WithModelsController extends EpoxyController {

        @NotNull
        private Function1<? super EpoxyController, Unit> callback = EpoxyRecyclerView$WithModelsController$callback$1.h;

        @Override // com.airbnb.epoxy.EpoxyController
        public void buildModels() {
            this.callback.invoke(this);
        }

        @NotNull
        public final Function1<EpoxyController, Unit> getCallback() {
            return this.callback;
        }

        public final void setCallback(@NotNull Function1<? super EpoxyController, Unit> function1) {
            Intrinsics.h(function1, "<set-?>");
            this.callback = function1;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EpoxyRecyclerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    private final Context getContextForSharedViewPool() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return context;
            }
        }
        Context context2 = getContext();
        Intrinsics.g(context2, "this.context");
        return context2;
    }

    public void A0() {
        setClipToPadding(false);
        Context context = getContextForSharedViewPool();
        ActivityRecyclerPool activityRecyclerPool = a1;
        activityRecyclerPool.getClass();
        Intrinsics.h(context, "context");
        ArrayList arrayList = activityRecyclerPool.f13303a;
        Iterator it = arrayList.iterator();
        Intrinsics.g(it, "pools.iterator()");
        PoolReference poolReference = null;
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.g(next, "iterator.next()");
            PoolReference poolReference2 = (PoolReference) next;
            WeakReference weakReference = poolReference2.f;
            if (((Context) weakReference.get()) == context) {
                if (poolReference != null) {
                    throw new IllegalStateException("A pool was already found");
                }
                poolReference = poolReference2;
            } else if (ActivityRecyclerPoolKt.a((Context) weakReference.get())) {
                poolReference2.d.a();
                it.remove();
            }
        }
        if (poolReference == null) {
            poolReference = new PoolReference(context, new UnboundedViewPool(), activityRecyclerPool);
            Lifecycle lifecycleA = ActivityRecyclerPool.a(context);
            if (lifecycleA != null) {
                lifecycleA.a(poolReference);
            }
            arrayList.add(poolReference);
        }
        setRecycledViewPool(poolReference.d);
    }

    public final int B0(int i) {
        return getResources().getDimensionPixelOffset(i);
    }

    public final void C0(RecyclerView.Adapter adapter, boolean z) {
        setLayoutFrozen(false);
        p0(adapter, true, z);
        f0(true);
        requestLayout();
        y0();
        E0();
    }

    public final void D0() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        EpoxyController epoxyController = this.S0;
        if (!(layoutManager instanceof GridLayoutManager) || epoxyController == null) {
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        if (epoxyController.getSpanCount() == gridLayoutManager.F && gridLayoutManager.K == epoxyController.getSpanSizeLookup()) {
            return;
        }
        epoxyController.setSpanCount(gridLayoutManager.F);
        gridLayoutManager.K = epoxyController.getSpanSizeLookup();
    }

    public final void E0() {
        ArrayList arrayList = this.Y0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EpoxyPreloader epoxyPreloader = (EpoxyPreloader) it.next();
            ArrayList arrayList2 = this.n0;
            if (arrayList2 != null) {
                arrayList2.remove(epoxyPreloader);
            }
        }
        arrayList.clear();
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            return;
        }
        Iterator it2 = this.Z0.iterator();
        while (it2.hasNext()) {
            PreloadConfig preloadConfig = (PreloadConfig) it2.next();
            if (adapter instanceof EpoxyAdapter) {
                preloadConfig.getClass();
                List listQ = CollectionsKt.Q(null);
                Intrinsics.h(null, "requestHolderFactory");
                Intrinsics.h(null, "errorHandler");
                new EpoxyPreloader((EpoxyAdapter) adapter, listQ);
                throw null;
            }
            EpoxyController epoxyController = this.S0;
            if (epoxyController != null) {
                preloadConfig.getClass();
                List listQ2 = CollectionsKt.Q(null);
                Intrinsics.h(null, "requestHolderFactory");
                Intrinsics.h(null, "errorHandler");
                EpoxyControllerAdapter adapter2 = epoxyController.getAdapter();
                Intrinsics.g(adapter2, "epoxyController.adapter");
                new EpoxyPreloader(adapter2, listQ2);
                throw null;
            }
        }
    }

    public final void F0(Function1 function1) {
        EpoxyController epoxyController = this.S0;
        WithModelsController withModelsController = epoxyController instanceof WithModelsController ? (WithModelsController) epoxyController : null;
        if (withModelsController == null) {
            withModelsController = new WithModelsController();
            setController(withModelsController);
        }
        withModelsController.setCallback(function1);
        withModelsController.requestModelBuild();
    }

    @NotNull
    public final EpoxyItemSpacingDecorator getSpacingDecorator() {
        return this.spacingDecorator;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView.Adapter adapter = this.T0;
        if (adapter != null) {
            C0(adapter, false);
        }
        y0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator it = this.Y0.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((EpoxyPreloader) it.next()).f.f13335a.iterator();
            while (it2.hasNext()) {
                ((PreloadRequestHolder) it2.next()).clear();
            }
        }
        if (this.U0) {
            int i = this.V0;
            if (i > 0) {
                this.W0 = true;
                postDelayed(this.X0, i);
            } else {
                RecyclerView.Adapter adapter = getAdapter();
                if (adapter != null) {
                    C0(null, true);
                    this.T0 = adapter;
                }
                if (ActivityRecyclerPoolKt.a(getContext())) {
                    getRecycledViewPool().a();
                }
            }
        }
        if (ActivityRecyclerPoolKt.a(getContext())) {
            getRecycledViewPool().a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        D0();
        super.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(@Nullable RecyclerView.Adapter<?> adapter) {
        super.setAdapter(adapter);
        y0();
        E0();
    }

    public final void setController(@NotNull EpoxyController controller) {
        Intrinsics.h(controller, "controller");
        this.S0 = controller;
        setAdapter(controller.getAdapter());
        D0();
    }

    public final void setControllerAndBuildModels(@NotNull EpoxyController controller) {
        Intrinsics.h(controller, "controller");
        controller.requestModelBuild();
        setController(controller);
    }

    public final void setDelayMsWhenRemovingAdapterOnDetach(int delayMsWhenRemovingAdapterOnDetach) {
        this.V0 = delayMsWhenRemovingAdapterOnDetach;
    }

    public final void setItemSpacingDp(@Dimension int dp) {
        setItemSpacingPx(z0(dp));
    }

    public void setItemSpacingPx(@Px int spacingPx) {
        EpoxyItemSpacingDecorator epoxyItemSpacingDecorator = this.spacingDecorator;
        k0(epoxyItemSpacingDecorator);
        epoxyItemSpacingDecorator.f13315a = spacingPx;
        if (spacingPx > 0) {
            i(epoxyItemSpacingDecorator);
        }
    }

    public final void setItemSpacingRes(@DimenRes int itemSpacingRes) {
        setItemSpacingPx(B0(itemSpacingRes));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(@Nullable RecyclerView.LayoutManager layout) {
        super.setLayoutManager(layout);
        D0();
    }

    @Override // android.view.View
    public void setLayoutParams(@NotNull ViewGroup.LayoutParams params) {
        LinearLayoutManager linearLayoutManager;
        Intrinsics.h(params, "params");
        boolean z = getLayoutParams() == null;
        super.setLayoutParams(params);
        if (z && getLayoutManager() == null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int i = layoutParams.height;
            if (i == -1 || i == 0) {
                int i2 = layoutParams.width;
                if (i2 == -1 || i2 == 0) {
                    setHasFixedSize(true);
                }
                linearLayoutManager = new LinearLayoutManager(getContext());
            } else {
                getContext();
                linearLayoutManager = new LinearLayoutManager(0);
            }
            setLayoutManager(linearLayoutManager);
        }
    }

    public void setModels(@NotNull List<? extends EpoxyModel<?>> models) {
        Intrinsics.h(models, "models");
        EpoxyController epoxyController = this.S0;
        SimpleEpoxyController simpleEpoxyController = epoxyController instanceof SimpleEpoxyController ? (SimpleEpoxyController) epoxyController : null;
        if (simpleEpoxyController == null) {
            simpleEpoxyController = new SimpleEpoxyController();
            setController(simpleEpoxyController);
        }
        simpleEpoxyController.setModels(models);
    }

    public final void setRemoveAdapterWhenDetachedFromWindow(boolean removeAdapterWhenDetachedFromWindow) {
        this.U0 = removeAdapterWhenDetachedFromWindow;
    }

    public final void y0() {
        this.T0 = null;
        if (this.W0) {
            removeCallbacks(this.X0);
            this.W0 = false;
        }
    }

    public final int z0(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EpoxyRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ EpoxyRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EpoxyRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        EpoxyItemSpacingDecorator epoxyItemSpacingDecorator = new EpoxyItemSpacingDecorator();
        epoxyItemSpacingDecorator.f13315a = 0;
        this.spacingDecorator = epoxyItemSpacingDecorator;
        this.U0 = true;
        this.V0 = 2000;
        this.X0 = new e(this, 1);
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.airbnb.viewmodeladapter.R.styleable.f13485a, i, 0);
            Intrinsics.g(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…tyleAttr, 0\n            )");
            setItemSpacingPx(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
        A0();
    }
}
