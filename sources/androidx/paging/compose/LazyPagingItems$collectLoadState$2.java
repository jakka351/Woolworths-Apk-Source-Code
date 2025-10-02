package androidx.paging.compose;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.paging.CombinedLoadStates;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "it", "Landroidx/paging/CombinedLoadStates;", "emit", "(Landroidx/paging/CombinedLoadStates;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LazyPagingItems$collectLoadState$2<T> implements FlowCollector {
    public final /* synthetic */ LazyPagingItems d;

    public LazyPagingItems$collectLoadState$2(LazyPagingItems lazyPagingItems) {
        this.d = lazyPagingItems;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        ((SnapshotMutableStateImpl) this.d.e).setValue((CombinedLoadStates) obj);
        return Unit.f24250a;
    }
}
