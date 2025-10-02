package androidx.paging;

import androidx.paging.PagingDataEvent;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Landroidx/paging/PlaceholderPaddedDiffResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1", f = "AsyncPagingDataDiffer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PlaceholderPaddedDiffResult>, Object> {
    public final /* synthetic */ PagingDataEvent.Refresh p;
    public final /* synthetic */ AsyncPagingDataDiffer q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1(PagingDataEvent.Refresh refresh, AsyncPagingDataDiffer asyncPagingDataDiffer, Continuation continuation) {
        super(2, continuation);
        this.p = refresh;
        this.q = asyncPagingDataDiffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        PagingDataEvent.Refresh refresh = this.p;
        return PlaceholderPaddedListDiffHelperKt.a(refresh.b, refresh.f3578a, this.q.f3527a);
    }
}
