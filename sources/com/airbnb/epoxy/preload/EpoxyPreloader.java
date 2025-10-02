package com.airbnb.epoxy.preload;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.BaseEpoxyAdapter;
import com.airbnb.epoxy.BoundViewHolders;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.preload.PreloadRequestHolder;
import com.airbnb.epoxy.preload.PreloadableViewDataProvider;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/airbnb/epoxy/preload/EpoxyPreloader;", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "P", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "Companion", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class EpoxyPreloader<P extends PreloadRequestHolder> extends RecyclerView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final BaseEpoxyAdapter f13334a;
    public IntRange b;
    public IntProgression c;
    public int d;
    public final LinkedHashMap e;
    public final PreloadTargetProvider f;
    public final PreloadableViewDataProvider g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/airbnb/epoxy/preload/EpoxyPreloader$Companion;", "", "", "FLING_THRESHOLD_PX", "I", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public EpoxyPreloader(BaseEpoxyAdapter baseEpoxyAdapter, List list) {
        this.f13334a = baseEpoxyAdapter;
        IntRange intRange = IntRange.g;
        this.b = intRange;
        this.c = intRange;
        this.d = -1;
        List list2 = list;
        int iH = MapsKt.h(CollectionsKt.s(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        for (Object obj : list2) {
            ((EpoxyModelPreloader) obj).getClass();
            linkedHashMap.put(null, obj);
        }
        this.e = linkedHashMap;
        this.f = new PreloadTargetProvider();
        this.g = new PreloadableViewDataProvider(this.f13334a);
        throw new IllegalArgumentException("maxItemsToPreload must be greater than 0. Was 0".toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void a(int i, RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void d(RecyclerView recyclerView, int i, int i2) {
        int i3;
        EpoxyViewHolder next;
        if (!(i == 0 && i2 == 0) && Math.abs(i) <= 75 && Math.abs(i2) <= 75) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            this.d = adapter != null ? adapter.i() : 0;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int iB1 = linearLayoutManager.b1();
            int iD1 = linearLayoutManager.d1();
            if (iB1 == -1 || iB1 >= (i3 = this.d) || iD1 == -1 || iD1 >= i3) {
                IntRange intRange = IntRange.g;
                this.b = intRange;
                this.c = intRange;
                return;
            }
            IntRange intRange2 = new IntRange(iB1, iD1, 1);
            if (intRange2.equals(this.b)) {
                return;
            }
            IntRange intRange3 = this.b;
            boolean z = iB1 > intRange3.d || intRange2.e > intRange3.e;
            int i4 = z ? iD1 + 1 : iB1 - 1;
            IntProgression intProgression = new IntProgression(Math.min(this.d - 1, Math.max(i4, 0)), Math.min(this.d - 1, Math.max((z ? -1 : 1) + i4, 0)), z ? 1 : -1);
            Iterator it = CollectionsKt.v0(intProgression, this.c).iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                EpoxyModel epoxyModelI = this.f13334a.I(iIntValue);
                if (epoxyModelI == null) {
                    epoxyModelI = null;
                }
                if (epoxyModelI != null) {
                    Object obj = this.e.get(epoxyModelI.getClass());
                    EpoxyModelPreloader epoxyModelPreloader = obj instanceof EpoxyModelPreloader ? (EpoxyModelPreloader) obj : null;
                    if (epoxyModelPreloader == null) {
                        continue;
                    } else {
                        PreloadableViewDataProvider preloadableViewDataProvider = this.g;
                        preloadableViewDataProvider.getClass();
                        PreloadableViewDataProvider.CacheKey cacheKeyA = preloadableViewDataProvider.a(epoxyModelPreloader, epoxyModelI, iIntValue);
                        LinkedHashMap linkedHashMap = preloadableViewDataProvider.b;
                        Object obj2 = linkedHashMap.get(cacheKeyA);
                        if (obj2 == null) {
                            BoundViewHolders boundViewHoldersG = preloadableViewDataProvider.f13336a.G();
                            Intrinsics.g(boundViewHoldersG, "adapter.boundViewHoldersInternal()");
                            Iterator<EpoxyViewHolder> it2 = boundViewHoldersG.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                EpoxyViewHolder epoxyViewHolder = next;
                                epoxyViewHolder.c();
                                EpoxyModel epoxyModel = epoxyViewHolder.f13318a;
                                if (epoxyModel.getClass() == epoxyModelI.getClass()) {
                                    View view = epoxyViewHolder.itemView;
                                    WeakHashMap weakHashMap = ViewCompat.f2488a;
                                    if (view.isAttachedToWindow() && epoxyViewHolder.itemView.isLaidOut() && preloadableViewDataProvider.a(epoxyModelPreloader, epoxyModel, epoxyViewHolder.getAdapterPosition()).equals(cacheKeyA)) {
                                        break;
                                    }
                                }
                            }
                            EpoxyViewHolder epoxyViewHolder2 = next;
                            if (epoxyViewHolder2 != null && epoxyViewHolder2.itemView != null) {
                                Intrinsics.g(epoxyViewHolder2.e(), "objectToBind()");
                                throw null;
                            }
                            linkedHashMap.put(cacheKeyA, null);
                            obj2 = null;
                        }
                        List list = obj2 instanceof List ? (List) obj2 : null;
                        if (list == null) {
                            list = EmptyList.d;
                        }
                        Iterator it3 = list.iterator();
                        if (it3.hasNext()) {
                            ViewData viewData = (ViewData) it3.next();
                            ArrayDeque arrayDeque = this.f.f13335a;
                            PreloadRequestHolder preloadRequestHolder = (PreloadRequestHolder) arrayDeque.poll();
                            arrayDeque.offer(preloadRequestHolder);
                            preloadRequestHolder.clear();
                            epoxyModelPreloader.a(epoxyModelI, preloadRequestHolder, viewData);
                            throw null;
                        }
                    }
                }
            }
            this.b = intRange2;
            this.c = intProgression;
        }
    }
}
