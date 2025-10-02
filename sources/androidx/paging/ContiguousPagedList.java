package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.camera.camera2.interop.d;
import androidx.paging.LegacyPageFetcher;
import androidx.paging.LoadState;
import androidx.paging.PagedList;
import androidx.paging.PagedStorage;
import androidx.paging.PagingSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.GlobalScope;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u00052\b\u0012\u0004\u0012\u00028\u00010\u0006:\u0001\u0007¨\u0006\b"}, d2 = {"Landroidx/paging/ContiguousPagedList;", "", "K", "V", "Landroidx/paging/PagedList;", "Landroidx/paging/PagedStorage$Callback;", "Landroidx/paging/LegacyPageFetcher$PageConsumer;", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension
/* loaded from: classes2.dex */
public class ContiguousPagedList<K, V> extends PagedList<V> implements PagedStorage.Callback, LegacyPageFetcher.PageConsumer<V> {
    public static final /* synthetic */ int y = 0;
    public final PagingSource n;
    public final Object o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean v;
    public final boolean w;
    public final LegacyPageFetcher x;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/ContiguousPagedList$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContiguousPagedList(PagingSource pagingSource, GlobalScope coroutineScope, CoroutineDispatcher notifyDispatcher, CoroutineDispatcher backgroundDispatcher, PagedList.Config config, PagingSource.LoadResult.Page initialPage, Object obj) {
        super(pagingSource, coroutineScope, notifyDispatcher, new PagedStorage(), config);
        Intrinsics.h(coroutineScope, "coroutineScope");
        Intrinsics.h(notifyDispatcher, "notifyDispatcher");
        Intrinsics.h(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.h(config, "config");
        Intrinsics.h(initialPage, "initialPage");
        int i = initialPage.g;
        this.n = pagingSource;
        this.o = obj;
        this.t = Integer.MAX_VALUE;
        this.u = Integer.MIN_VALUE;
        boolean z = false;
        this.w = false;
        PagedStorage pagedStorage = this.g;
        Intrinsics.f(pagedStorage, "null cannot be cast to non-null type androidx.paging.LegacyPageFetcher.KeyProvider<K of androidx.paging.ContiguousPagedList>");
        this.x = new LegacyPageFetcher(coroutineScope, config, pagingSource, notifyDispatcher, backgroundDispatcher, this, pagedStorage);
        if (!config.c) {
            this.g.j(0, initialPage, 0, i != Integer.MIN_VALUE ? i : 0, this, false);
            return;
        }
        PagedStorage pagedStorage2 = this.g;
        int i2 = i != Integer.MIN_VALUE ? i : 0;
        int i3 = initialPage.h;
        int i4 = i3 != Integer.MIN_VALUE ? i3 : 0;
        if (i != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE) {
            z = true;
        }
        pagedStorage2.j(i2, initialPage, i4, 0, this, z);
    }

    @Override // androidx.paging.PagedList
    public final void d(Function2 callback) {
        Intrinsics.h(callback, "callback");
        LegacyPageFetcher$loadStateManager$1 legacyPageFetcher$loadStateManager$1 = this.x.i;
        legacyPageFetcher$loadStateManager$1.getClass();
        callback.invoke(LoadType.d, legacyPageFetcher$loadStateManager$1.f3570a);
        callback.invoke(LoadType.e, legacyPageFetcher$loadStateManager$1.b);
        callback.invoke(LoadType.f, legacyPageFetcher$loadStateManager$1.c);
    }

    @Override // androidx.paging.PagedList
    public final Object g() {
        Object objB;
        PagedStorage pagedStorage = this.g;
        pagedStorage.getClass();
        PagedList.Config config = this.h;
        Intrinsics.h(config, "config");
        ArrayList arrayList = pagedStorage.d;
        PagingState pagingState = arrayList.isEmpty() ? null : new PagingState(CollectionsKt.G0(arrayList), Integer.valueOf(pagedStorage.e + pagedStorage.j), new PagingConfig(config.f3568a, config.b, config.d, 32, config.c), pagedStorage.e);
        return (pagingState == null || (objB = this.n.b(pagingState)) == null) ? this.o : objB;
    }

    @Override // androidx.paging.PagedList
    /* renamed from: h, reason: from getter */
    public final PagingSource getN() {
        return this.n;
    }

    @Override // androidx.paging.PagedList
    public final boolean i() {
        return this.x.h.get();
    }

    @Override // androidx.paging.PagedList
    public final void l(int i) {
        int i2 = this.h.b;
        PagedStorage pagedStorage = this.g;
        int i3 = pagedStorage.e;
        int i4 = i2 - (i - i3);
        int i5 = ((i2 + i) + 1) - (i3 + pagedStorage.i);
        int iMax = Math.max(i4, this.p);
        this.p = iMax;
        LegacyPageFetcher legacyPageFetcher = this.x;
        if (iMax > 0) {
            LoadState loadState = legacyPageFetcher.i.b;
            if ((loadState instanceof LoadState.NotLoading) && !loadState.f3546a) {
                legacyPageFetcher.c();
            }
        }
        int iMax2 = Math.max(i5, this.q);
        this.q = iMax2;
        if (iMax2 > 0) {
            LoadState loadState2 = legacyPageFetcher.i.c;
            if ((loadState2 instanceof LoadState.NotLoading) && !loadState2.f3546a) {
                legacyPageFetcher.b();
            }
        }
        this.t = Math.min(this.t, i);
        this.u = Math.max(this.u, i);
        u(true);
    }

    @Override // androidx.paging.PagedList
    public final void o() throws SecurityException, IllegalArgumentException {
        d dVar;
        LegacyPageFetcher legacyPageFetcher = this.x;
        LegacyPageFetcher$loadStateManager$1 legacyPageFetcher$loadStateManager$1 = legacyPageFetcher.i;
        if (legacyPageFetcher$loadStateManager$1.b instanceof LoadState.Error) {
            legacyPageFetcher.c();
        }
        if (legacyPageFetcher$loadStateManager$1.c instanceof LoadState.Error) {
            legacyPageFetcher.b();
        }
        if (!(legacyPageFetcher.i.f3570a instanceof LoadState.Error) || (dVar = this.i) == null) {
            return;
        }
        dVar.run();
    }

    @Override // androidx.paging.PagedList
    public final void q(LoadState loadState) {
        b(LoadType.d, loadState);
    }

    public final void s(boolean z, boolean z2) {
        PagedStorage pagedStorage = this.g;
        if (z) {
            Intrinsics.e(null);
            Object itemAtFront = CollectionsKt.D(((PagingSource.LoadResult.Page) CollectionsKt.D(pagedStorage.d)).d);
            Intrinsics.h(itemAtFront, "itemAtFront");
        }
        if (z2) {
            Intrinsics.e(null);
            Object itemAtEnd = CollectionsKt.O(((PagingSource.LoadResult.Page) CollectionsKt.O(pagedStorage.d)).d);
            Intrinsics.h(itemAtEnd, "itemAtEnd");
        }
    }

    public final void t(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        Iterator it = CollectionsKt.l0(this.k).iterator();
        while (it.hasNext()) {
            PagedList.Callback callback = (PagedList.Callback) ((WeakReference) it.next()).get();
            if (callback != null) {
                callback.c(i, i2);
            }
        }
    }

    public final void u(boolean z) {
        boolean z2 = this.r;
        PagedList.Config config = this.h;
        boolean z3 = z2 && this.t <= config.b;
        boolean z4 = this.s && this.u >= (this.g.getSize() - 1) - config.b;
        if (z3 || z4) {
            if (z3) {
                this.r = false;
            }
            if (z4) {
                this.s = false;
            }
            if (z) {
                BuildersKt.c(this.e, this.f, null, new ContiguousPagedList$tryDispatchBoundaryCallbacks$1(this, z3, z4, null), 2);
            } else {
                s(z3, z4);
            }
        }
    }
}
