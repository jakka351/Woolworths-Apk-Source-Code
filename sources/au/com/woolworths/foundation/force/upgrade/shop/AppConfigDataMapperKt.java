package au.com.woolworths.foundation.force.upgrade.shop;

import au.com.woolworths.foundation.force.upgrade.common.data.AppConfigAlert;
import au.com.woolworths.foundation.force.upgrade.common.data.AppConfigData;
import au.com.woolworths.foundation.force.upgrade.common.data.AppConfigUpgradeType;
import au.com.woolworths.foundation.force.upgrade.shop.AppConfigQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"force-upgrade-data-shop"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppConfigDataMapperKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [au.com.woolworths.foundation.force.upgrade.common.data.AppConfigAlert$AppConfigForcedAlert] */
    public static final AppConfigData a(AppConfigQuery.Config config) {
        Intrinsics.h(config, "<this>");
        AppConfigUpgradeType appConfigUpgradeTypeValueOf = AppConfigUpgradeType.valueOf(config.f8517a.name());
        Boolean bool = config.b;
        AppConfigQuery.Alert alert = config.c;
        AppConfigAlert.AppConfigSoftAlert appConfigForcedAlert = null;
        appConfigForcedAlert = null;
        if (alert != null) {
            String str = alert.f8516a;
            if (Intrinsics.c(str, "AppConfigSoftAlert")) {
                AppConfigQuery.OnAppConfigSoftAlert onAppConfigSoftAlert = alert.b;
                appConfigForcedAlert = new AppConfigAlert.AppConfigSoftAlert(onAppConfigSoftAlert != null ? onAppConfigSoftAlert.f8520a : "", onAppConfigSoftAlert != null ? onAppConfigSoftAlert.b : "", onAppConfigSoftAlert != null ? onAppConfigSoftAlert.c : "", onAppConfigSoftAlert != null ? onAppConfigSoftAlert.d : "");
            } else if (Intrinsics.c(str, "AppConfigForcedAlert")) {
                AppConfigQuery.OnAppConfigForcedAlert onAppConfigForcedAlert = alert.c;
                appConfigForcedAlert = new AppConfigAlert.AppConfigForcedAlert(onAppConfigForcedAlert != null ? onAppConfigForcedAlert.f8519a : "", onAppConfigForcedAlert != null ? onAppConfigForcedAlert.b : "", onAppConfigForcedAlert != null ? onAppConfigForcedAlert.c : "", onAppConfigForcedAlert != null ? onAppConfigForcedAlert.d : null);
            }
        }
        return new AppConfigData(appConfigUpgradeTypeValueOf, bool, appConfigForcedAlert, config.d);
    }
}
