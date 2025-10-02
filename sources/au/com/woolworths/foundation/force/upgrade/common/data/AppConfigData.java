package au.com.woolworths.foundation.force.upgrade.common.data;

import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/common/data/AppConfigData;", "", "force-upgrade-data-common"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AppConfigData {

    /* renamed from: a, reason: collision with root package name */
    public final AppConfigUpgradeType f8498a;
    public final Boolean b;
    public final AppConfigAlert c;
    public final String d;

    public AppConfigData(AppConfigUpgradeType upgradeType, Boolean bool, AppConfigAlert appConfigAlert, String str) {
        Intrinsics.h(upgradeType, "upgradeType");
        this.f8498a = upgradeType;
        this.b = bool;
        this.c = appConfigAlert;
        this.d = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppConfigData)) {
            return false;
        }
        AppConfigData appConfigData = (AppConfigData) obj;
        return this.f8498a == appConfigData.f8498a && Intrinsics.c(this.b, appConfigData.b) && Intrinsics.c(this.c, appConfigData.c) && this.d.equals(appConfigData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f8498a.hashCode() * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        AppConfigAlert appConfigAlert = this.c;
        return b.c((iHashCode2 + (appConfigAlert != null ? appConfigAlert.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        return "AppConfigData(upgradeType=" + this.f8498a + ", isForcedUpgrade=" + this.b + ", alert=" + this.c + ", bffVersion=" + this.d + ", detectedRegion=null)";
    }
}
