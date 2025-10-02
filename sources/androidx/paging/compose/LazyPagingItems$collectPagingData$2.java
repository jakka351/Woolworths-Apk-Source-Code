package androidx.paging.compose;

import androidx.paging.PagingData;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "it", "Landroidx/paging/PagingData;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", f = "LazyPagingItems.kt", l = {179}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LazyPagingItems$collectPagingData$2 extends SuspendLambda implements Function2<PagingData<Object>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ LazyPagingItems r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPagingItems$collectPagingData$2(LazyPagingItems lazyPagingItems, Continuation continuation) {
        super(2, continuation);
        this.r = lazyPagingItems;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LazyPagingItems$collectPagingData$2 lazyPagingItems$collectPagingData$2 = new LazyPagingItems$collectPagingData$2(this.r, continuation);
        lazyPagingItems$collectPagingData$2.q = obj;
        return lazyPagingItems$collectPagingData$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyPagingItems$collectPagingData$2) create((PagingData) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            PagingData pagingData = (PagingData) this.q;
            LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1 = this.r.c;
            this.p = 1;
            if (lazyPagingItems$pagingDataPresenter$1.b(pagingData, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
