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
public final class JoinWifiActivity_MembersInjector implements MembersInjector<JoinWifiActivity> {
    public static void a(JoinWifiActivity joinWifiActivity, AppConfig appConfig) {
        joinWifiActivity.x = appConfig;
    }

    public static void b(JoinWifiActivity joinWifiActivity, AppIdentifier appIdentifier) {
        joinWifiActivity.y = appIdentifier;
    }

    public static void c(JoinWifiActivity joinWifiActivity, FeatureToggleManager featureToggleManager) {
        joinWifiActivity.z = featureToggleManager;
    }
}
