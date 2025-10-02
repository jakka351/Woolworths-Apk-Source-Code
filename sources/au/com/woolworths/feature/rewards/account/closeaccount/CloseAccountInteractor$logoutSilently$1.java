package au.com.woolworths.feature.rewards.account.closeaccount;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountInteractor$logoutSilently$1", f = "CloseAccountInteractor.kt", l = {33, 37, 37, 37}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CloseAccountInteractor$logoutSilently$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Throwable p;
    public int q;
    public final /* synthetic */ CloseAccountInteractor r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseAccountInteractor$logoutSilently$1(CloseAccountInteractor closeAccountInteractor, Continuation continuation) {
        super(2, continuation);
        this.r = closeAccountInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CloseAccountInteractor$logoutSilently$1(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CloseAccountInteractor$logoutSilently$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r8.completeLogout(r7) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r8.completeLogout(r7) != r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.q
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountInteractor r6 = r7.r
            if (r1 == 0) goto L2e
            if (r1 == r5) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L22
            if (r1 == r2) goto L1c
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            java.lang.Throwable r0 = r7.p
            kotlin.ResultKt.b(r8)
            goto L6d
        L22:
            kotlin.ResultKt.b(r8)
            goto L5c
        L26:
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            goto L3c
        L2a:
            r8 = move-exception
            goto L5f
        L2c:
            r8 = move-exception
            goto L47
        L2e:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor r8 = r6.b     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r7.q = r5     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            java.lang.Object r8 = r8.logout(r7)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            if (r8 != r0) goto L3c
            goto L6b
        L3c:
            au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor r8 = r6.b
            r7.q = r4
            java.lang.Object r8 = r8.completeLogout(r7)
            if (r8 != r0) goto L5c
            goto L6b
        L47:
            timber.log.Timber$Forest r1 = timber.log.Timber.f27013a     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = "Failed to logout"
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2a
            r1.d(r4, r8, r5)     // Catch: java.lang.Throwable -> L2a
            au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor r8 = r6.b
            r7.q = r3
            java.lang.Object r8 = r8.completeLogout(r7)
            if (r8 != r0) goto L5c
            goto L6b
        L5c:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        L5f:
            au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor r1 = r6.b
            r7.p = r8
            r7.q = r2
            java.lang.Object r1 = r1.completeLogout(r7)
            if (r1 != r0) goto L6c
        L6b:
            return r0
        L6c:
            r0 = r8
        L6d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountInteractor$logoutSilently$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
