package au.com.woolworths.feature.shared.instore.wifi.ui;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$wrapOpenRoamingCall$2", f = "InStoreWifiInteractorImpl.kt", l = {206}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class InStoreWifiInteractorImpl$wrapOpenRoamingCall$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public Function1 p;
    public int q;
    public final /* synthetic */ Function1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InStoreWifiInteractorImpl$wrapOpenRoamingCall$2(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.r = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InStoreWifiInteractorImpl$wrapOpenRoamingCall$2(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InStoreWifiInteractorImpl$wrapOpenRoamingCall$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function1 function1 = this.p;
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        Function1 function12 = this.r;
        this.p = function12;
        this.q = 1;
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.b(this));
        try {
            function12.invoke(new Function1<Object, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$wrapOpenRoamingCall$2$1$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    SafeContinuation safeContinuation2 = safeContinuation;
                    try {
                        safeContinuation2.resumeWith(obj2);
                    } catch (Throwable th) {
                        safeContinuation2.resumeWith(ResultKt.a(th));
                    }
                    return Unit.f24250a;
                }
            });
        } catch (Throwable th) {
            safeContinuation.resumeWith(ResultKt.a(th));
        }
        Object objA = safeContinuation.a();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.d;
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
