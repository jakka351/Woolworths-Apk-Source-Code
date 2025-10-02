package au.com.woolworths.feature.shop.foryou.settings;

import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsInteractor;", "", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsSettingsInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final RewardsAccountInteractor f7143a;
    public final RewardsSettingsOptionManager b;

    public RewardsSettingsInteractor(RewardsAccountInteractor rewardsAccountInteractor, RewardsSettingsOptionManager rewardsSettingsOptionManager) {
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        this.f7143a = rewardsAccountInteractor;
        this.b = rewardsSettingsOptionManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsInteractor$removeRewardsCards$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsInteractor$removeRewardsCards$1 r0 = (au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsInteractor$removeRewardsCards$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsInteractor$removeRewardsCards$1 r0 = new au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsInteractor$removeRewardsCards$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor r3 = r5.f7143a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.b(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.ResultKt.b(r6)
            r0.r = r4
            java.lang.Object r6 = r3.unlinkRewardsCard(r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            r3.clearRewardsData()
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsInteractor.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
