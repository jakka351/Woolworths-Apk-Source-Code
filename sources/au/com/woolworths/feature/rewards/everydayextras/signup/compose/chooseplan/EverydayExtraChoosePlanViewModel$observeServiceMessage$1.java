package au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanViewModel$observeServiceMessage$1", f = "EverydayExtraChoosePlanViewModel.kt", l = {127, 130}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EverydayExtraChoosePlanViewModel$observeServiceMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ EverydayExtraChoosePlanViewModel r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayExtraChoosePlanViewModel$observeServiceMessage$1(EverydayExtraChoosePlanViewModel everydayExtraChoosePlanViewModel, Continuation continuation) {
        super(2, continuation);
        this.r = everydayExtraChoosePlanViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EverydayExtraChoosePlanViewModel$observeServiceMessage$1 everydayExtraChoosePlanViewModel$observeServiceMessage$1 = new EverydayExtraChoosePlanViewModel$observeServiceMessage$1(this.r, continuation);
        everydayExtraChoosePlanViewModel$observeServiceMessage$1.q = obj;
        return everydayExtraChoosePlanViewModel$observeServiceMessage$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((EverydayExtraChoosePlanViewModel$observeServiceMessage$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (((kotlinx.coroutines.flow.StateFlow) r7).collect(r1, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.p
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanViewModel r2 = r6.r
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 == r3) goto L16
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L16:
            kotlin.ResultKt.b(r7)
            goto L42
        L1a:
            kotlin.ResultKt.b(r7)
            goto L32
        L1e:
            kotlin.ResultKt.b(r7)
            java.lang.Object r7 = r6.q
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl r1 = r2.g
            au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage$ScreenType r5 = au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage.ScreenType.d
            r6.p = r4
            java.lang.Object r7 = r1.b(r7)
            if (r7 != r0) goto L32
            goto L41
        L32:
            kotlinx.coroutines.flow.StateFlow r7 = (kotlinx.coroutines.flow.StateFlow) r7
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanViewModel$observeServiceMessage$1$1 r1 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanViewModel$observeServiceMessage$1$1
            r1.<init>()
            r6.p = r3
            java.lang.Object r7 = r7.collect(r1, r6)
            if (r7 != r0) goto L42
        L41:
            return r0
        L42:
            kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanViewModel$observeServiceMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
