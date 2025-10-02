package androidx.paging.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidUiDispatcher;
import androidx.paging.CombinedLoadStates;
import androidx.paging.ItemSnapshotList;
import androidx.paging.LoadStates;
import androidx.paging.PagingData;
import androidx.paging.PagingDataEvent;
import androidx.paging.PagingDataPresenter;
import androidx.paging.PagingLogger;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/paging/compose/LazyPagingItems;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "paging-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyPagingItems<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Flow f3593a;
    public final CoroutineContext b;
    public final LazyPagingItems$pagingDataPresenter$1 c;
    public final MutableState d;
    public final MutableState e;

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.paging.PagingDataPresenter, androidx.paging.compose.LazyPagingItems$pagingDataPresenter$1] */
    public LazyPagingItems(Flow flow) {
        Intrinsics.h(flow, "flow");
        this.f3593a = flow;
        final CoroutineContext coroutineContext = (CoroutineContext) AndroidUiDispatcher.p.getD();
        this.b = coroutineContext;
        final PagingData pagingData = flow instanceof SharedFlow ? (PagingData) CollectionsKt.F(((SharedFlow) flow).a()) : null;
        ?? r1 = new PagingDataPresenter<Object>(coroutineContext, pagingData) { // from class: androidx.paging.compose.LazyPagingItems$pagingDataPresenter$1
            @Override // androidx.paging.PagingDataPresenter
            public final Object d(PagingDataEvent pagingDataEvent, ContinuationImpl continuationImpl) {
                LazyPagingItems lazyPagingItems = this.m;
                ((SnapshotMutableStateImpl) lazyPagingItems.d).setValue(lazyPagingItems.c.e());
                return Unit.f24250a;
            }
        };
        this.c = r1;
        this.d = SnapshotStateKt.f(r1.e());
        CombinedLoadStates combinedLoadStates = (CombinedLoadStates) r1.k.getValue();
        if (combinedLoadStates == null) {
            LoadStates loadStates = LazyPagingItemsKt.f3594a;
            combinedLoadStates = new CombinedLoadStates(loadStates.f3547a, loadStates.b, loadStates.c, loadStates, null);
        }
        this.e = SnapshotStateKt.f(combinedLoadStates);
    }

    public final Object a(int i) {
        c(i);
        return c().get(i);
    }

    public final int b() {
        return c().getE();
    }

    public final ItemSnapshotList c() {
        return (ItemSnapshotList) ((SnapshotMutableStateImpl) this.d).getD();
    }

    public final CombinedLoadStates d() {
        return (CombinedLoadStates) ((SnapshotMutableStateImpl) this.e).getD();
    }

    public final void e() {
        LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1 = this.c;
        lazyPagingItems$pagingDataPresenter$1.getClass();
        if (PagingLogger.a(3)) {
            PagingLogger.b(3, "Retry signal received");
        }
        lazyPagingItems$pagingDataPresenter$1.c.g();
    }
}
