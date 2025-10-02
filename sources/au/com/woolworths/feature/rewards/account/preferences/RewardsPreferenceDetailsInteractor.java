package au.com.woolworths.feature.rewards.account.preferences;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsInteractor;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsPreferenceDetailsInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final RewardsPreferenceDetailsRepository f5741a;

    public RewardsPreferenceDetailsInteractor(RewardsPreferenceDetailsRepository repository) {
        Intrinsics.h(repository, "repository");
        this.f5741a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(final kotlin.jvm.functions.Function1 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsInteractor$onPushPreferenceChanged$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsInteractor$onPushPreferenceChanged$1 r0 = (au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsInteractor$onPushPreferenceChanged$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsInteractor$onPushPreferenceChanged$1 r0 = new au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsInteractor$onPushPreferenceChanged$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r0.r
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 == r2) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            kotlin.KotlinNothingValueException r5 = android.support.v4.media.session.a.v(r6)
            throw r5
        L30:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsRepository r6 = r4.f5741a
            kotlinx.coroutines.flow.SharedFlowImpl r6 = r6.c
            au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsInteractor$onPushPreferenceChanged$2 r1 = new au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsInteractor$onPushPreferenceChanged$2
            r1.<init>()
            r0.r = r2
            r6.collect(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsInteractor.a(kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }
}
