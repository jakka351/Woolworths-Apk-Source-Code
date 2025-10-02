package au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign;

import au.com.woolworths.foundation.feature.app.AppIdentifier;
import au.com.woolworths.foundation.swrve.tracking.impl.SwrveEventTrackerImpl;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class StandardCampaignActivity_MembersInjector implements MembersInjector<StandardCampaignActivity> {
    public static void a(StandardCampaignActivity standardCampaignActivity, AppIdentifier appIdentifier) {
        standardCampaignActivity.w = appIdentifier;
    }

    public static void b(StandardCampaignActivity standardCampaignActivity, SwrveEventTrackerImpl swrveEventTrackerImpl) {
        standardCampaignActivity.x = swrveEventTrackerImpl;
    }
}
