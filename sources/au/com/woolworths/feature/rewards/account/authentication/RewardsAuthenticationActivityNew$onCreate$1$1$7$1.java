package au.com.woolworths.feature.rewards.account.authentication;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RewardsAuthenticationActivityNew$onCreate$1$1$7$1 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.receiver
            au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivityNew r0 = (au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivityNew) r0
            int r1 = au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivityNew.D
            au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl r1 = r0.x
            java.lang.String r2 = "branchDeepLinkInteractor"
            r3 = 0
            if (r1 == 0) goto Lb9
            au.com.woolworths.android.onesite.branch.BranchReferringParams r1 = r1.b()
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r5 = "getIntent(...)"
            kotlin.jvm.internal.Intrinsics.g(r4, r5)
            android.content.Intent r4 = au.com.woolworths.rewards.base.DeferredIntentHelper.a(r4)
            if (r4 == 0) goto L41
            au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor r5 = r0.y
            if (r5 == 0) goto L43
            au.com.woolworths.android.onesite.modules.common.Region r6 = au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractorKt.a(r5)
            au.com.woolworths.android.onesite.modules.common.Region r7 = au.com.woolworths.android.onesite.modules.common.Region.j
            if (r6 != r7) goto L2f
            au.com.woolworths.android.onesite.modules.rewards.RewardsAppMode r5 = au.com.woolworths.android.onesite.modules.rewards.RewardsAppMode.e
            goto L3a
        L2f:
            au.com.woolworths.android.onesite.modules.rewards.data.RewardsLiteCardData r5 = r5.getLiteCardData()
            if (r5 == 0) goto L38
            au.com.woolworths.android.onesite.modules.rewards.RewardsAppMode r5 = au.com.woolworths.android.onesite.modules.rewards.RewardsAppMode.f
            goto L3a
        L38:
            au.com.woolworths.android.onesite.modules.rewards.RewardsAppMode r5 = au.com.woolworths.android.onesite.modules.rewards.RewardsAppMode.d
        L3a:
            boolean r5 = au.com.woolworths.rewards.base.RewardsDeepLinkKt.a(r4, r5)
            if (r5 == 0) goto L41
            goto L49
        L41:
            r4 = r3
            goto L49
        L43:
            java.lang.String r0 = "rewardsAccountInteractor"
            kotlin.jvm.internal.Intrinsics.p(r0)
            throw r3
        L49:
            r5 = 268468224(0x10008000, float:2.5342157E-29)
            au.com.woolworths.android.onesite.navigation.Activities$RewardsHomepageLegacy r6 = au.com.woolworths.android.onesite.navigation.Activities.RewardsHomepageLegacy.f4518a
            if (r1 == 0) goto L78
            au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl r7 = r0.x
            if (r7 == 0) goto L74
            boolean r7 = r7.e(r1)
            if (r7 == 0) goto L78
            au.com.woolworths.android.onesite.navigation.ApplicationType r4 = au.com.woolworths.android.onesite.navigation.ApplicationType.d
            android.content.Intent r6 = au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt.a(r6, r4)
            r6.setFlags(r5)
            r0.startActivity(r6)
            au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl r5 = r0.x
            if (r5 == 0) goto L70
            java.lang.String r2 = ""
            r5.c(r4, r0, r1, r2)
            goto Lb6
        L70:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r3
        L74:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r3
        L78:
            if (r4 == 0) goto Laa
            android.content.ComponentName r1 = r4.getComponent()
            if (r1 == 0) goto L84
            java.lang.String r3 = r1.getClassName()
        L84:
            java.lang.String r1 = "au.com.woolworths.feature.rewards.homepage.HomepageActivityLegacy"
            boolean r1 = kotlin.jvm.internal.Intrinsics.c(r3, r1)
            if (r1 != 0) goto La3
            au.com.woolworths.android.onesite.navigation.ApplicationType r1 = au.com.woolworths.android.onesite.navigation.ApplicationType.d
            android.content.Intent r1 = au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt.a(r6, r1)
            androidx.core.app.TaskStackBuilder r2 = new androidx.core.app.TaskStackBuilder
            r2.<init>(r0)
            java.util.ArrayList r0 = r2.d
            r0.add(r1)
            r0.add(r4)
            r2.h()
            goto Lb6
        La3:
            r4.setFlags(r5)
            r0.startActivity(r4)
            goto Lb6
        Laa:
            au.com.woolworths.android.onesite.navigation.ApplicationType r1 = au.com.woolworths.android.onesite.navigation.ApplicationType.d
            android.content.Intent r1 = au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt.a(r6, r1)
            r1.setFlags(r5)
            r0.startActivity(r1)
        Lb6:
            kotlin.Unit r0 = kotlin.Unit.f24250a
            return r0
        Lb9:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivityNew$onCreate$1$1$7$1.invoke():java.lang.Object");
    }
}
