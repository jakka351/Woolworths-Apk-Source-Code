package au.com.woolworths.feature.shop.ask.olive.ui;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shared.web.file.uploader.WebChromeFileUploadHelper;
import au.com.woolworths.feature.shop.ask.olive.ui.jsbridge.AskOliveJsInterface;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AskOliveActivity_MembersInjector implements MembersInjector<AskOliveActivity> {
    public static void a(AskOliveActivity askOliveActivity, AnalyticsManager analyticsManager) {
        askOliveActivity.z = analyticsManager;
    }

    public static void b(AskOliveActivity askOliveActivity, FeatureToggleManager featureToggleManager) {
        askOliveActivity.A = featureToggleManager;
    }

    public static void c(AskOliveActivity askOliveActivity, WebChromeFileUploadHelper webChromeFileUploadHelper) {
        askOliveActivity.D = webChromeFileUploadHelper;
    }

    public static void d(AskOliveActivity askOliveActivity, AskOliveJsInterface askOliveJsInterface) {
        askOliveActivity.y = askOliveJsInterface;
    }
}
