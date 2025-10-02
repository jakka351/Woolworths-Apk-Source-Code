package au.com.woolworths.rewards.base.coachmark.legacy;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/coachmark/legacy/HomepageCoachMarkInteractor;", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomepageCoachMarkInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final JwtRepositoryImpl f9362a;
    public final Gson b;
    public final DispatcherProvider c;

    public HomepageCoachMarkInteractor(JwtRepositoryImpl jwtRepositoryImpl, Gson gson, DispatcherProvider dispatchers) {
        Intrinsics.h(gson, "gson");
        Intrinsics.h(dispatchers, "dispatchers");
        this.f9362a = jwtRepositoryImpl;
        this.b = gson;
        this.c = dispatchers;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor$convertPayloadToCoachMarkContent$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor$convertPayloadToCoachMarkContent$1 r0 = (au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor$convertPayloadToCoachMarkContent$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor$convertPayloadToCoachMarkContent$1 r0 = new au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor$convertPayloadToCoachMarkContent$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r7)
            goto L48
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r7 = r5.c
            r7.getClass()
            kotlinx.coroutines.scheduling.DefaultScheduler r7 = kotlinx.coroutines.Dispatchers.f24691a
            au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor$convertPayloadToCoachMarkContent$2 r2 = new au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor$convertPayloadToCoachMarkContent$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.r = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.f(r7, r2, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            java.lang.String r6 = "withContext(...)"
            kotlin.jvm.internal.Intrinsics.g(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
