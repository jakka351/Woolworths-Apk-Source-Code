package au.com.woolworths.rewards.base.coachmark.legacy;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor", f = "HomepageCoachMarkInteractor.kt", l = {28, 31}, m = "parseJwtToCoachMarkContent")
/* loaded from: classes4.dex */
final class HomepageCoachMarkInteractor$parseJwtToCoachMarkContent$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ HomepageCoachMarkInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomepageCoachMarkInteractor$parseJwtToCoachMarkContent$1(HomepageCoachMarkInteractor homepageCoachMarkInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = homepageCoachMarkInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r1 == r2) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r6.p = r7
            int r7 = r6.r
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r0
            r6.r = r7
            au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor r7 = r6.q
            r7.getClass()
            int r1 = r6.r
            r2 = r1 & r0
            if (r2 == 0) goto L19
            int r1 = r1 - r0
            r6.r = r1
            r0 = r6
            goto L1e
        L19:
            au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor$parseJwtToCoachMarkContent$1 r0 = new au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor$parseJwtToCoachMarkContent$1
            r0.<init>(r7, r6)
        L1e:
            java.lang.Object r1 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r0.r
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3e
            if (r3 == r5) goto L3a
            if (r3 != r4) goto L32
            kotlin.ResultKt.b(r1)     // Catch: com.google.gson.JsonSyntaxException -> L30
            goto L60
        L30:
            r7 = move-exception
            goto L68
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3a:
            kotlin.ResultKt.b(r1)
            goto L4d
        L3e:
            kotlin.ResultKt.b(r1)
            au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl r1 = r7.f9362a
            r0.r = r5
            r3 = 0
            java.lang.Object r1 = r1.a(r3, r0)
            if (r1 != r2) goto L4d
            goto L5f
        L4d:
            au.com.woolworths.android.onesite.jwt.RewardsJwtResponse r1 = (au.com.woolworths.android.onesite.jwt.RewardsJwtResponse) r1
            boolean r3 = r1 instanceof au.com.woolworths.android.onesite.jwt.RewardsJwtResponse.Verified
            if (r3 == 0) goto L6e
            au.com.woolworths.android.onesite.jwt.RewardsJwtResponse$Verified r1 = (au.com.woolworths.android.onesite.jwt.RewardsJwtResponse.Verified) r1     // Catch: com.google.gson.JsonSyntaxException -> L30
            java.lang.String r1 = r1.f4262a     // Catch: com.google.gson.JsonSyntaxException -> L30
            r0.r = r4     // Catch: com.google.gson.JsonSyntaxException -> L30
            java.lang.Object r1 = r7.a(r1, r0)     // Catch: com.google.gson.JsonSyntaxException -> L30
            if (r1 != r2) goto L60
        L5f:
            return r2
        L60:
            au.com.woolworths.rewards.base.coachmark.legacy.CoachMarkContent r1 = (au.com.woolworths.rewards.base.coachmark.legacy.CoachMarkContent) r1     // Catch: com.google.gson.JsonSyntaxException -> L30
            au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkResult$Success r7 = new au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkResult$Success     // Catch: com.google.gson.JsonSyntaxException -> L30
            r7.<init>(r1)     // Catch: com.google.gson.JsonSyntaxException -> L30
            return r7
        L68:
            au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkResult$Failure r0 = new au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkResult$Failure
            r0.<init>(r7)
            return r0
        L6e:
            boolean r7 = r1 instanceof au.com.woolworths.android.onesite.jwt.RewardsJwtResponse.Rejected
            if (r7 == 0) goto L7c
            au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkResult$Failure r7 = new au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkResult$Failure
            au.com.woolworths.android.onesite.jwt.RewardsJwtResponse$Rejected r1 = (au.com.woolworths.android.onesite.jwt.RewardsJwtResponse.Rejected) r1
            io.jsonwebtoken.JwtException r0 = r1.f4261a
            r7.<init>(r0)
            return r7
        L7c:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor$parseJwtToCoachMarkContent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
