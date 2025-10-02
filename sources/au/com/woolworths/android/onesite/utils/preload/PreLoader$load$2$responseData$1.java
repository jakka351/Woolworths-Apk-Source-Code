package au.com.woolworths.android.onesite.utils.preload;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.utils.preload.PreLoader$load$2$responseData$1", f = "PreLoader.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PreLoader$load$2$responseData$1 extends SuspendLambda implements Function1<Continuation<Object>, Object> {
    public int p;
    public final /* synthetic */ PreLoader q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreLoader$load$2$responseData$1(PreLoader preLoader, Continuation continuation) {
        super(1, continuation);
        this.q = preLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PreLoader$load$2$responseData$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PreLoader$load$2$responseData$1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        this.p = 1;
        Object objT = this.q.T(this);
        return objT == coroutineSingletons ? coroutineSingletons : objT;
    }
}
