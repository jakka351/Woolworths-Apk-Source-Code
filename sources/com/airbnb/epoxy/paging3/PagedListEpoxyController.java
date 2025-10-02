package com.airbnb.epoxy.paging3;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.camera2.interop.d;
import androidx.camera.core.processing.g;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.DiffUtil;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 #*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001#B)\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u001a\u0010\u000e\u001a\u00020\u000f2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0011H\u0016J#\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u000fH\u0004J2\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u001d\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012H\u0014J\u0006\u0010\u001f\u001a\u00020\u000fJ\u0016\u0010 \u001a\u00020\u000f2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006$"}, d2 = {"Lcom/airbnb/epoxy/paging3/PagedListEpoxyController;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/airbnb/epoxy/EpoxyController;", "modelBuildingHandler", "Landroid/os/Handler;", "diffingHandler", "itemDiffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroid/os/Handler;Landroid/os/Handler;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "modelCache", "Lcom/airbnb/epoxy/paging3/PagedListModelCache;", "getModelCache", "()Lcom/airbnb/epoxy/paging3/PagedListModelCache;", "addModels", "", "models", "", "Lcom/airbnb/epoxy/EpoxyModel;", "buildItemModel", "currentPosition", "", "item", "(ILjava/lang/Object;)Lcom/airbnb/epoxy/EpoxyModel;", "buildModels", "onModelBound", "holder", "Lcom/airbnb/epoxy/EpoxyViewHolder;", "boundModel", "position", "previouslyBoundModel", "requestForcedModelBuild", "submitList", "newList", "Landroidx/paging/PagedList;", "Companion", "epoxy-paging3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class PagedListEpoxyController<T> extends EpoxyController {

    @NotNull
    private static final DiffUtil.ItemCallback<Object> DEFAULT_ITEM_DIFF_CALLBACK = new PagedListEpoxyController$Companion$DEFAULT_ITEM_DIFF_CALLBACK$1();

    @NotNull
    private final PagedListModelCache<T> modelCache;

    public PagedListEpoxyController() {
        this(null, null, null, 7, null);
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
        PagedListModelCache<T> pagedListModelCache = this.modelCache;
        synchronized (pagedListModelCache) {
            try {
                List listA = pagedListModelCache.g.a();
                if (listA == null) {
                    listA = EmptyList.d;
                }
                int i = 0;
                if (Intrinsics.c(Looper.myLooper(), pagedListModelCache.c.getLooper())) {
                    IntProgressionIterator it = RangesKt.o(0, pagedListModelCache.d.size()).iterator();
                    while (it.f) {
                        int iNextInt = it.nextInt();
                        if (pagedListModelCache.d.get(iNextInt) == null) {
                            pagedListModelCache.d.set(iNextInt, ((PagedListEpoxyController$modelCache$1) pagedListModelCache.f13333a).invoke(Integer.valueOf(iNextInt), listA.get(iNextInt)));
                        }
                    }
                    Integer num = pagedListModelCache.e;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        PagedList pagedListA = pagedListModelCache.g.a();
                        if (pagedListA != null) {
                            if (pagedListA.g.getSize() > 0) {
                                pagedListA.k(Math.min(iIntValue, r3.getSize() - 1));
                            }
                        }
                    }
                    arrayList = pagedListModelCache.d;
                    Intrinsics.f(arrayList, "null cannot be cast to non-null type kotlin.collections.List<com.airbnb.epoxy.EpoxyModel<*>>");
                } else {
                    List list = listA;
                    arrayList = new ArrayList(CollectionsKt.s(list, 10));
                    for (T t : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        arrayList.add((EpoxyModel) ((PagedListEpoxyController$modelCache$1) pagedListModelCache.f13333a).invoke(Integer.valueOf(i), t));
                        i = i2;
                    }
                    pagedListModelCache.c.post(new g(15, pagedListModelCache, listA, arrayList));
                }
                addModels(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NotNull
    public final PagedListModelCache<T> getModelCache() {
        return this.modelCache;
    }

    @Override // com.airbnb.epoxy.EpoxyController
    public void onModelBound(@NotNull EpoxyViewHolder holder, @NotNull EpoxyModel<?> boundModel, int position, @Nullable EpoxyModel<?> previouslyBoundModel) {
        Intrinsics.h(holder, "holder");
        Intrinsics.h(boundModel, "boundModel");
        PagedListModelCache<T> pagedListModelCache = this.modelCache;
        PagedList pagedListA = pagedListModelCache.g.a();
        if (pagedListA != null) {
            if (pagedListA.g.getSize() > 0) {
                pagedListA.k(Math.min(position, r5.getSize() - 1));
            }
        }
        pagedListModelCache.e = Integer.valueOf(position);
    }

    public final void requestForcedModelBuild() {
        PagedListModelCache<T> pagedListModelCache = this.modelCache;
        pagedListModelCache.c.post(new d(pagedListModelCache, 25));
        requestModelBuild();
    }

    public final void submitList(@Nullable PagedList<T> newList) {
        PagedListModelCache<T> pagedListModelCache = this.modelCache;
        synchronized (pagedListModelCache) {
            pagedListModelCache.f = true;
            pagedListModelCache.g.e(newList);
            pagedListModelCache.f = false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PagedListEpoxyController(Handler defaultModelBuildingHandler, Handler defaultDiffingHandler, DiffUtil.ItemCallback itemCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
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
            Intrinsics.f(itemCallback, "null cannot be cast to non-null type androidx.recyclerview.widget.DiffUtil.ItemCallback<T of com.airbnb.epoxy.paging3.PagedListEpoxyController>");
        }
        this(defaultModelBuildingHandler, defaultDiffingHandler, itemCallback);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagedListEpoxyController(@NotNull Handler modelBuildingHandler, @NotNull Handler diffingHandler, @NotNull DiffUtil.ItemCallback<T> itemDiffCallback) {
        super(modelBuildingHandler, diffingHandler);
        Intrinsics.h(modelBuildingHandler, "modelBuildingHandler");
        Intrinsics.h(diffingHandler, "diffingHandler");
        Intrinsics.h(itemDiffCallback, "itemDiffCallback");
        this.modelCache = new PagedListModelCache<>(new PagedListEpoxyController$modelCache$1(this), new PagedListEpoxyController$modelCache$2(this), itemDiffCallback, modelBuildingHandler);
    }
}
