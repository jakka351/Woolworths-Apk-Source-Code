package au.com.woolworths.feature.shop.ask.olive.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel$retryChatbotSessionId$1", f = "AskOliveViewModel.kt", l = {274, 275}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AskOliveViewModel$retryChatbotSessionId$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AskOliveViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskOliveViewModel$retryChatbotSessionId$1(AskOliveViewModel askOliveViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = askOliveViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AskOliveViewModel$retryChatbotSessionId$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AskOliveViewModel$retryChatbotSessionId$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r6.emit(au.com.woolworths.feature.shop.ask.olive.ui.AskOliveContract.Actions.RetryChatbotSessionId.f6618a, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r5.p
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r6)
            goto L39
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.b(r6)
            goto L2a
        L1c:
            kotlin.ResultKt.b(r6)
            r5.p = r3
            r3 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.b(r3, r5)
            if (r6 != r0) goto L2a
            goto L38
        L2a:
            au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel r6 = r5.q
            kotlinx.coroutines.flow.SharedFlowImpl r6 = r6.q
            r5.p = r2
            au.com.woolworths.feature.shop.ask.olive.ui.AskOliveContract$Actions$RetryChatbotSessionId r1 = au.com.woolworths.feature.shop.ask.olive.ui.AskOliveContract.Actions.RetryChatbotSessionId.f6618a
            java.lang.Object r6 = r6.emit(r1, r5)
            if (r6 != r0) goto L39
        L38:
            return r0
        L39:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel$retryChatbotSessionId$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
