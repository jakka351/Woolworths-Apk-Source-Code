package au.com.woolworths.foundation.force.upgrade.extension;

import au.com.woolworths.foundation.force.upgrade.data.UpgradePromptType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"force-upgrade-api"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpgradePromptTypeExtensionKt {
    public static final boolean a(UpgradePromptType upgradePromptType) {
        return upgradePromptType == UpgradePromptType.g || upgradePromptType == UpgradePromptType.f;
    }

    public static final boolean b(UpgradePromptType upgradePromptType) {
        return upgradePromptType == UpgradePromptType.e;
    }
}
