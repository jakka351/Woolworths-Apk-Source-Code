package au.com.woolworths.feature.shared.instore.wifi.ui;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$wrapVoidOpenRoamingCall$2", f = "InStoreWifiInteractorImpl.kt", l = {BERTags.FLAGS}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InStoreWifiInteractorImpl$wrapVoidOpenRoamingCall$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Function1 p;
    public int q;
    public final /* synthetic */ Function1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InStoreWifiInteractorImpl$wrapVoidOpenRoamingCall$2(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.r = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InStoreWifiInteractorImpl$wrapVoidOpenRoamingCall$2(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InStoreWifiInteractorImpl$wrapVoidOpenRoamingCall$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            Function1 function1 = this.r;
            this.p = function1;
            this.q = 1;
            final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.b(this));
            try {
                function1.invoke(new Function0<Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$wrapVoidOpenRoamingCall$2$1$1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit = Unit.f24250a;
                        SafeContinuation safeContinuation2 = safeContinuation;
                        try {
                            safeContinuation2.resumeWith(unit);
                            return unit;
                        } catch (Throwable th) {
                            safeContinuation2.resumeWith(ResultKt.a(th));
                            return unit;
                        }
                    }
                });
            } catch (Throwable th) {
                safeContinuation.resumeWith(ResultKt.a(th));
            }
            Object objA = safeContinuation.a();
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.d;
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function1 function12 = this.p;
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
