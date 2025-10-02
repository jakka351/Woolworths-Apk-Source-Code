package au.com.woolworths.feature.shop.catalogue.intro;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class CatalogueIntroActivity_MembersInjector implements MembersInjector<CatalogueIntroActivity> {
    public static void a(CatalogueIntroActivity catalogueIntroActivity, AnalyticsManager analyticsManager) {
        catalogueIntroActivity.x = analyticsManager;
    }

    public static void b(CatalogueIntroActivity catalogueIntroActivity, SchedulersProvider schedulersProvider) {
        catalogueIntroActivity.y = schedulersProvider;
    }
}
