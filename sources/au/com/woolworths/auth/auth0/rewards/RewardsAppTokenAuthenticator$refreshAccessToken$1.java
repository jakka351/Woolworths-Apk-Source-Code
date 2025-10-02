package au.com.woolworths.auth.auth0.rewards;

import au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenAndCardInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsTokenAndCardInfo;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator$refreshAccessToken$1", f = "RewardsAppTokenAuthenticator.kt", l = {226, 238, 240}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsAppTokenAuthenticator$refreshAccessToken$1 extends SuspendLambda implements Function2<FlowCollector<? super RewardsTokenAndCardInfo>, Continuation<? super Unit>, Object> {
    public RewardsAppTokenAuthenticator p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ RewardsAppTokenAuthenticator s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsAppTokenAuthenticator$refreshAccessToken$1(RewardsAppTokenAuthenticator rewardsAppTokenAuthenticator, Continuation continuation) {
        super(2, continuation);
        this.s = rewardsAppTokenAuthenticator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RewardsAppTokenAuthenticator$refreshAccessToken$1 rewardsAppTokenAuthenticator$refreshAccessToken$1 = new RewardsAppTokenAuthenticator$refreshAccessToken$1(this.s, continuation);
        rewardsAppTokenAuthenticator$refreshAccessToken$1.r = obj;
        return rewardsAppTokenAuthenticator$refreshAccessToken$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsAppTokenAuthenticator$refreshAccessToken$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r10.q
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator r6 = r10.s
            if (r1 == 0) goto L37
            if (r1 == r5) goto L2d
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r10.r
            au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator r0 = (au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator) r0
            kotlin.ResultKt.b(r11)
            goto La7
        L1b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L23:
            au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator r6 = r10.p
            java.lang.Object r1 = r10.r
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r11)
            goto L81
        L2d:
            java.lang.Object r1 = r10.r
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r11)     // Catch: au.com.woolworths.auth.auth0.Auth0CredentialException -> L35
            goto L4c
        L35:
            r11 = move-exception
            goto L4f
        L37:
            kotlin.ResultKt.b(r11)
            java.lang.Object r11 = r10.r
            r1 = r11
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            au.com.woolworths.auth.api.AuthManagerApi r11 = r6.g     // Catch: au.com.woolworths.auth.auth0.Auth0CredentialException -> L35
            r10.r = r1     // Catch: au.com.woolworths.auth.auth0.Auth0CredentialException -> L35
            r10.q = r5     // Catch: au.com.woolworths.auth.auth0.Auth0CredentialException -> L35
            java.lang.Object r11 = r11.b(r10)     // Catch: au.com.woolworths.auth.auth0.Auth0CredentialException -> L35
            if (r11 != r0) goto L4c
            goto L91
        L4c:
            java.lang.String r11 = (java.lang.String) r11     // Catch: au.com.woolworths.auth.auth0.Auth0CredentialException -> L35
            goto L72
        L4f:
            boolean r5 = r11.a()
            java.lang.String r7 = "]."
            if (r5 == 0) goto Laa
            au.com.woolworths.foundation.bark.Bark$Companion r5 = au.com.woolworths.foundation.bark.Bark.f8483a
            java.lang.String r11 = r11.b()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Failed to get Auth0 token due to unrecoverable error ["
            r8.<init>(r9)
            r8.append(r11)
            r8.append(r7)
            java.lang.String r11 = r8.toString()
            r5.a(r11)
            r11 = r2
        L72:
            if (r11 == 0) goto L9d
            r10.r = r1
            r10.p = r6
            r10.q = r4
            java.lang.Object r11 = au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator.b(r6, r11, r10)
            if (r11 != r0) goto L81
            goto L91
        L81:
            au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenAndCardInfo r11 = (au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenAndCardInfo) r11
            if (r11 == 0) goto L92
            r10.r = r6
            r10.p = r2
            r10.q = r3
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto La7
        L91:
            return r0
        L92:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Failed to exchange token"
            r11.<init>(r0)
            r6.d(r11)
            goto La7
        L9d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Failed to retrieve auth0 token"
            r11.<init>(r0)
            r6.d(r11)
        La7:
            kotlin.Unit r11 = kotlin.Unit.f24250a
            return r11
        Laa:
            timber.log.Timber$Forest r0 = timber.log.Timber.f27013a
            java.lang.String r1 = r11.b()
            java.lang.String r2 = "]. Will be retried."
            java.lang.String r3 = "Failed to get Auth0 token due to error ["
            java.lang.String r1 = YU.a.h(r3, r1, r2)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.o(r1, r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r11 = r11.b()
            java.lang.String r11 = YU.a.h(r3, r11, r7)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator$refreshAccessToken$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
