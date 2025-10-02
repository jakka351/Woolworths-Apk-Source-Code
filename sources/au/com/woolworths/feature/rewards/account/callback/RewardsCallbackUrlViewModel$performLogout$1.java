package au.com.woolworths.feature.rewards.account.callback;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlViewModel$performLogout$1", f = "RewardsCallbackUrlViewModel.kt", l = {110, 113, 113, 116}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsCallbackUrlViewModel$performLogout$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Throwable p;
    public int q;
    public final /* synthetic */ RewardsCallbackUrlViewModel r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsCallbackUrlViewModel$performLogout$1(RewardsCallbackUrlViewModel rewardsCallbackUrlViewModel, Continuation continuation) {
        super(2, continuation);
        this.r = rewardsCallbackUrlViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsCallbackUrlViewModel$performLogout$1(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsCallbackUrlViewModel$performLogout$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r14.emit(r0, r13) != r8) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlViewModel r0 = r13.r
            au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor r7 = r0.f
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r13.q
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = 1
            if (r1 == 0) goto L33
            if (r1 == r12) goto L2c
            if (r1 == r11) goto L28
            if (r1 == r10) goto L22
            if (r1 != r9) goto L1a
            kotlin.ResultKt.b(r14)
            goto L73
        L1a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L22:
            java.lang.Throwable r0 = r13.p
            kotlin.ResultKt.b(r14)
            goto L81
        L28:
            kotlin.ResultKt.b(r14)
            goto L58
        L2c:
            kotlin.ResultKt.b(r14)     // Catch: java.lang.Throwable -> L30
            goto L4a
        L30:
            r0 = move-exception
            r14 = r0
            goto L76
        L33:
            kotlin.ResultKt.b(r14)
            androidx.lifecycle.MutableLiveData r1 = r0.g
            r5 = 0
            r6 = 14
            r2 = 1
            r3 = 0
            r4 = 0
            au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlViewModel.p6(r0, r1, r2, r3, r4, r5, r6)
            r13.q = r12     // Catch: java.lang.Throwable -> L30
            java.lang.Object r14 = r7.logout(r13)     // Catch: java.lang.Throwable -> L30
            if (r14 != r8) goto L4a
            goto L80
        L4a:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> L30
            r14.getClass()     // Catch: java.lang.Throwable -> L30
            r13.q = r11
            java.lang.Object r14 = r7.completeLogout(r13)
            if (r14 != r8) goto L58
            goto L80
        L58:
            androidx.lifecycle.MutableLiveData r1 = r0.g
            r5 = 0
            r6 = 14
            r2 = 0
            r3 = 0
            r4 = 0
            au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlViewModel.p6(r0, r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.flow.SharedFlowImpl r14 = r0.i
            au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlContract$Actions$CloseScreen r0 = new au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlContract$Actions$CloseScreen
            r0.<init>()
            r13.q = r9
            java.lang.Object r14 = r14.emit(r0, r13)
            if (r14 != r8) goto L73
            goto L80
        L73:
            kotlin.Unit r14 = kotlin.Unit.f24250a
            return r14
        L76:
            r13.p = r0
            r13.q = r10
            java.lang.Object r14 = r7.completeLogout(r13)
            if (r14 != r8) goto L81
        L80:
            return r8
        L81:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlViewModel$performLogout$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
