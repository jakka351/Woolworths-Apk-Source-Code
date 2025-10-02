package au.com.woolworths.feature.shared.instore.wifi.ui;

import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InstoreWifiActivity_MembersInjector implements MembersInjector<InstoreWifiActivity> {
    public static void a(InstoreWifiActivity instoreWifiActivity, AppConfig appConfig) {
        instoreWifiActivity.w = appConfig;
    }

    public static void b(InstoreWifiActivity instoreWifiActivity, AppIdentifier appIdentifier) {
        instoreWifiActivity.y = appIdentifier;
    }

    public static void c(InstoreWifiActivity instoreWifiActivity, FeatureToggleManager featureToggleManager) {
        instoreWifiActivity.x = featureToggleManager;
    }
}
