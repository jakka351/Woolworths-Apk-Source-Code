package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/LegacyPageFetcher;", "", "K", "V", "KeyProvider", "PageConsumer", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LegacyPageFetcher<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f3544a;
    public final PagedList.Config b;
    public final PagingSource c;
    public final CoroutineDispatcher d;
    public final CoroutineDispatcher e;
    public final ContiguousPagedList f;
    public final KeyProvider g;
    public final AtomicBoolean h;
    public final LegacyPageFetcher$loadStateManager$1 i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/paging/LegacyPageFetcher$KeyProvider;", "", "K", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface KeyProvider<K> {
        Object h();

        Object i();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/paging/LegacyPageFetcher$PageConsumer;", "", "V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface PageConsumer<V> {
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.paging.LegacyPageFetcher$loadStateManager$1] */
    public LegacyPageFetcher(CoroutineScope pagedListScope, PagedList.Config config, PagingSource pagingSource, CoroutineDispatcher notifyDispatcher, CoroutineDispatcher fetchDispatcher, ContiguousPagedList contiguousPagedList, KeyProvider keyProvider) {
        Intrinsics.h(pagedListScope, "pagedListScope");
        Intrinsics.h(config, "config");
        Intrinsics.h(notifyDispatcher, "notifyDispatcher");
        Intrinsics.h(fetchDispatcher, "fetchDispatcher");
        Intrinsics.h(keyProvider, "keyProvider");
        this.f3544a = pagedListScope;
        this.b = config;
        this.c = pagingSource;
        this.d = notifyDispatcher;
        this.e = fetchDispatcher;
        this.f = contiguousPagedList;
        this.g = keyProvider;
        this.h = new AtomicBoolean(false);
        this.i = new PagedList.LoadStateManager() { // from class: androidx.paging.LegacyPageFetcher$loadStateManager$1
            @Override // androidx.paging.PagedList.LoadStateManager
            public final void a(LoadType type, LoadState state) {
                Intrinsics.h(type, "type");
                Intrinsics.h(state, "state");
                ContiguousPagedList contiguousPagedList2 = this.d.f;
                BuildersKt.c(contiguousPagedList2.e, contiguousPagedList2.f, null, new PagedList$dispatchStateChangeAsync$1(contiguousPagedList2, type, state, null), 2);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[PHI: r17
  0x00ab: PHI (r17v1 boolean) = (r17v0 boolean), (r17v5 boolean) binds: [B:50:0x0102, B:33:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.paging.LoadType r19, androidx.paging.PagingSource.LoadResult.Page r20) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.LegacyPageFetcher.a(androidx.paging.LoadType, androidx.paging.PagingSource$LoadResult$Page):void");
    }

    public final void b() {
        Object objH = this.g.h();
        LoadType loadType = LoadType.f;
        if (objH == null) {
            PagingSource.LoadResult.Page page = PagingSource.LoadResult.Page.i;
            Intrinsics.f(page, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Page<Key of androidx.paging.PagingSource.LoadResult.Page.Companion.empty, Value of androidx.paging.PagingSource.LoadResult.Page.Companion.empty>");
            a(loadType, page);
        } else {
            b(loadType, LoadState.Loading.b);
            PagedList.Config config = this.b;
            BuildersKt.c(this.f3544a, this.e, null, new LegacyPageFetcher$scheduleLoad$1(this, new PagingSource.LoadParams.Append(objH, config.c, config.f3568a), loadType, null), 2);
        }
    }

    public final void c() {
        Object objI = this.g.i();
        LoadType loadType = LoadType.e;
        if (objI == null) {
            PagingSource.LoadResult.Page page = PagingSource.LoadResult.Page.i;
            Intrinsics.f(page, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Page<Key of androidx.paging.PagingSource.LoadResult.Page.Companion.empty, Value of androidx.paging.PagingSource.LoadResult.Page.Companion.empty>");
            a(loadType, page);
        } else {
            b(loadType, LoadState.Loading.b);
            PagedList.Config config = this.b;
            BuildersKt.c(this.f3544a, this.e, null, new LegacyPageFetcher$scheduleLoad$1(this, new PagingSource.LoadParams.Prepend(objI, config.c, config.f3568a), loadType, null), 2);
        }
    }
}
