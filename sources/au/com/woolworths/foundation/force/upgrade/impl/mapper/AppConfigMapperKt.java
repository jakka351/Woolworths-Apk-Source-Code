package au.com.woolworths.foundation.force.upgrade.impl.mapper;

import au.com.woolworths.foundation.force.upgrade.common.data.AppConfigAlert;
import au.com.woolworths.foundation.force.upgrade.common.data.AppConfigData;
import au.com.woolworths.foundation.force.upgrade.common.data.AppConfigUpgradeType;
import au.com.woolworths.foundation.force.upgrade.data.UpgradeConfig;
import au.com.woolworths.foundation.force.upgrade.data.UpgradePrompt;
import au.com.woolworths.foundation.force.upgrade.data.UpgradePromptType;
import au.com.woolworths.foundation.force.upgrade.data.UpgradeType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"force-upgrade-impl_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppConfigMapperKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[AppConfigUpgradeType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AppConfigUpgradeType.Companion companion = AppConfigUpgradeType.INSTANCE;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AppConfigUpgradeType.Companion companion2 = AppConfigUpgradeType.INSTANCE;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final UpgradeConfig a(AppConfigData appConfigData, boolean z) {
        UpgradeType upgradeType;
        AppConfigAlert appConfigAlert;
        UpgradePrompt upgradePrompt;
        Boolean bool = appConfigData.b;
        AppConfigUpgradeType appConfigUpgradeType = appConfigData.f8498a;
        int iOrdinal = appConfigUpgradeType.ordinal();
        if (iOrdinal == 0) {
            upgradeType = UpgradeType.e;
        } else if (iOrdinal == 1) {
            upgradeType = UpgradeType.f;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            upgradeType = null;
        }
        if (upgradeType != null) {
            Boolean bool2 = Boolean.TRUE;
            UpgradePromptType upgradePromptType = (Intrinsics.c(bool, bool2) && (appConfigUpgradeType == AppConfigUpgradeType.e || appConfigUpgradeType == AppConfigUpgradeType.f)) ? UpgradePromptType.g : (!(Intrinsics.c(bool, bool2) && (appConfigUpgradeType == AppConfigUpgradeType.e || appConfigUpgradeType == AppConfigUpgradeType.f)) && (appConfigUpgradeType == AppConfigUpgradeType.e || appConfigUpgradeType == AppConfigUpgradeType.f)) ? UpgradePromptType.e : null;
            if (upgradePromptType != null && (appConfigAlert = appConfigData.c) != null) {
                if (appConfigAlert instanceof AppConfigAlert.AppConfigSoftAlert) {
                    AppConfigAlert.AppConfigSoftAlert appConfigSoftAlert = (AppConfigAlert.AppConfigSoftAlert) appConfigAlert;
                    upgradePrompt = new UpgradePrompt(appConfigSoftAlert.f8497a, appConfigSoftAlert.b, appConfigSoftAlert.c, appConfigSoftAlert.d);
                } else {
                    if (!(appConfigAlert instanceof AppConfigAlert.AppConfigForcedAlert)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AppConfigAlert.AppConfigForcedAlert appConfigForcedAlert = (AppConfigAlert.AppConfigForcedAlert) appConfigAlert;
                    upgradePrompt = new UpgradePrompt(appConfigForcedAlert.f8496a, appConfigForcedAlert.b, appConfigForcedAlert.c, z ? appConfigForcedAlert.d : null);
                }
                return new UpgradeConfig(upgradeType, upgradePromptType, upgradePrompt, appConfigData.d);
            }
        }
        return null;
    }
}
