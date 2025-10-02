package au.com.woolworths.android.onesite.utils.preload;

import au.com.woolworths.android.onesite.utils.coroutines.ControlledRunner;
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

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.utils.preload.PreLoader$load$2", f = "PreLoader.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PreLoader$load$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public int p;
    public final /* synthetic */ PreLoader q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreLoader$load$2(PreLoader preLoader, Continuation continuation) {
        super(2, continuation);
        this.q = preLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PreLoader$load$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PreLoader$load$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        PreLoader preLoader = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            ControlledRunner controlledRunner = preLoader.b;
            PreLoader$load$2$responseData$1 preLoader$load$2$responseData$1 = new PreLoader$load$2$responseData$1(preLoader, null);
            this.p = 1;
            obj = controlledRunner.b(preLoader$load$2$responseData$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        if (!preLoader.d.get()) {
            preLoader.c = obj;
        }
        return obj;
    }
}
