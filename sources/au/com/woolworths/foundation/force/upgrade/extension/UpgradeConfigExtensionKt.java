package au.com.woolworths.foundation.force.upgrade.extension;

import au.com.woolworths.foundation.force.upgrade.data.UpgradeConfig;
import au.com.woolworths.foundation.force.upgrade.data.UpgradePromptType;
import au.com.woolworths.foundation.force.upgrade.data.UpgradeType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"force-upgrade-api"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpgradeConfigExtensionKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[UpgradeType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UpgradeType.Companion companion = UpgradeType.INSTANCE;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final String a(UpgradeConfig upgradeConfig, String str) {
        Intrinsics.h(upgradeConfig, "<this>");
        UpgradePromptType upgradePromptType = upgradeConfig.b;
        int iOrdinal = upgradeConfig.f8501a.ordinal();
        if (iOrdinal == 0) {
            return UpgradePromptTypeExtensionKt.a(upgradePromptType) ? "app_force_upgrade_".concat(str) : "app_soft_upgrade_".concat(str);
        }
        if (iOrdinal == 1) {
            return UpgradePromptTypeExtensionKt.a(upgradePromptType) ? "os_force_upgrade_".concat(str) : "os_soft_upgrade_".concat(str);
        }
        throw new NoWhenBranchMatchedException();
    }
}
