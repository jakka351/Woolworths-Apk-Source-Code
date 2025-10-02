package au.com.woolworths.foundation.rewards.offers.model.analytics;

import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.rewards.offer.OfferActivationAnalytics;
import au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics;
import au.com.woolworths.analytics.rewards.offer.OfferImpressionAnalytics;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsData;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsDataExtKt;
import au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.Behavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers-model_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BasicRewardsOfferStatusDataExtKt {
    public static final OfferActivationAnalytics.OfferActivation a(String appSection, String screenName, String str, List list) {
        Intrinsics.h(appSection, "appSection");
        Intrinsics.h(screenName, "screenName");
        List<RewardsOfferAnalyticsData> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            String str2 = "";
            if (!it.hasNext()) {
                break;
            }
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData = (RewardsOfferAnalyticsData) it.next();
            String offerType = rewardsOfferAnalyticsData != null ? rewardsOfferAnalyticsData.getOfferType() : null;
            if (offerType != null) {
                str2 = offerType;
            }
            arrayList.add(str2);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData2 : list2) {
            String offerName = rewardsOfferAnalyticsData2 != null ? rewardsOfferAnalyticsData2.getOfferName() : null;
            if (offerName == null) {
                offerName = "";
            }
            arrayList2.add(offerName);
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list2, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData3 : list2) {
            String campaignStream = rewardsOfferAnalyticsData3 != null ? rewardsOfferAnalyticsData3.getCampaignStream() : null;
            if (campaignStream == null) {
                campaignStream = "";
            }
            arrayList3.add(campaignStream);
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.s(list2, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData4 : list2) {
            String channel = rewardsOfferAnalyticsData4 != null ? rewardsOfferAnalyticsData4.getChannel() : null;
            if (channel == null) {
                channel = "";
            }
            arrayList4.add(channel);
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.s(list2, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData5 : list2) {
            String status = rewardsOfferAnalyticsData5 != null ? rewardsOfferAnalyticsData5.getStatus() : null;
            if (status == null) {
                status = "";
            }
            arrayList5.add(status);
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(list2, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData6 : list2) {
            String partnerId = rewardsOfferAnalyticsData6 != null ? rewardsOfferAnalyticsData6.getPartnerId() : null;
            if (partnerId == null) {
                partnerId = "";
            }
            arrayList6.add(partnerId);
        }
        ArrayList arrayList7 = new ArrayList(CollectionsKt.s(list2, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData7 : list2) {
            String profile = rewardsOfferAnalyticsData7 != null ? rewardsOfferAnalyticsData7.getProfile() : null;
            if (profile == null) {
                profile = "";
            }
            arrayList7.add(profile);
        }
        ArrayList arrayList8 = new ArrayList(CollectionsKt.s(list2, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData8 : list2) {
            String rtlAccountId = rewardsOfferAnalyticsData8 != null ? rewardsOfferAnalyticsData8.getRtlAccountId() : null;
            if (rtlAccountId == null) {
                rtlAccountId = "";
            }
            arrayList8.add(rtlAccountId);
        }
        ArrayList arrayList9 = new ArrayList(CollectionsKt.s(list2, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData9 : list2) {
            String rtlCampaignId = rewardsOfferAnalyticsData9 != null ? rewardsOfferAnalyticsData9.getRtlCampaignId() : null;
            arrayList9.add(rtlCampaignId == null ? "" : rtlCampaignId);
        }
        ArrayList arrayList10 = new ArrayList(CollectionsKt.s(list2, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData10 : list2) {
            String rtlCampaignCode = rewardsOfferAnalyticsData10 != null ? rewardsOfferAnalyticsData10.getRtlCampaignCode() : null;
            arrayList10.add(rtlCampaignCode == null ? "" : rtlCampaignCode);
        }
        ArrayList arrayList11 = new ArrayList(CollectionsKt.s(list2, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData11 : list2) {
            String rtlCouponStart = rewardsOfferAnalyticsData11 != null ? rewardsOfferAnalyticsData11.getRtlCouponStart() : null;
            if (rtlCouponStart == null) {
                rtlCouponStart = "";
            }
            arrayList11.add(rtlCouponStart);
        }
        return new OfferActivationAnalytics.OfferActivation(screenName, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, arrayList11, appSection, str);
    }

    public static final OfferDetailsAnalytics.OfferDetails b(RewardsOfferAnalyticsData rewardsOfferAnalyticsData) {
        Intrinsics.h(rewardsOfferAnalyticsData, "<this>");
        String offerType = rewardsOfferAnalyticsData.getOfferType();
        if (offerType == null) {
            offerType = "";
        }
        List listQ = CollectionsKt.Q(offerType);
        String offerName = rewardsOfferAnalyticsData.getOfferName();
        if (offerName == null) {
            offerName = "";
        }
        List listQ2 = CollectionsKt.Q(offerName);
        String campaignStream = rewardsOfferAnalyticsData.getCampaignStream();
        if (campaignStream == null) {
            campaignStream = "";
        }
        List listQ3 = CollectionsKt.Q(campaignStream);
        String channel = rewardsOfferAnalyticsData.getChannel();
        if (channel == null) {
            channel = "";
        }
        List listQ4 = CollectionsKt.Q(channel);
        String status = rewardsOfferAnalyticsData.getStatus();
        if (status == null) {
            status = "";
        }
        List listQ5 = CollectionsKt.Q(status);
        String partnerId = rewardsOfferAnalyticsData.getPartnerId();
        if (partnerId == null) {
            partnerId = "";
        }
        List listQ6 = CollectionsKt.Q(partnerId);
        String profile = rewardsOfferAnalyticsData.getProfile();
        if (profile == null) {
            profile = "";
        }
        List listQ7 = CollectionsKt.Q(profile);
        String rtlAccountId = rewardsOfferAnalyticsData.getRtlAccountId();
        if (rtlAccountId == null) {
            rtlAccountId = "";
        }
        List listQ8 = CollectionsKt.Q(rtlAccountId);
        String rtlCampaignId = rewardsOfferAnalyticsData.getRtlCampaignId();
        if (rtlCampaignId == null) {
            rtlCampaignId = "";
        }
        List listQ9 = CollectionsKt.Q(rtlCampaignId);
        String rtlCampaignCode = rewardsOfferAnalyticsData.getRtlCampaignCode();
        if (rtlCampaignCode == null) {
            rtlCampaignCode = "";
        }
        List listQ10 = CollectionsKt.Q(rtlCampaignCode);
        String rtlCouponStart = rewardsOfferAnalyticsData.getRtlCouponStart();
        return new OfferDetailsAnalytics.OfferDetails(listQ, listQ2, listQ3, listQ4, listQ5, listQ6, listQ7, listQ8, listQ9, listQ10, CollectionsKt.Q(rtlCouponStart != null ? rtlCouponStart : ""));
    }

    public static final OfferImpressionAnalytics.OfferImpression c(RewardsOfferAnalyticsData rewardsOfferAnalyticsData, String appSection, String screenName, String str) {
        Intrinsics.h(appSection, "appSection");
        Intrinsics.h(screenName, "screenName");
        List<RewardsOfferAnalyticsData> listQ = CollectionsKt.Q(rewardsOfferAnalyticsData);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listQ, 10));
        Iterator it = listQ.iterator();
        while (true) {
            String str2 = "";
            if (!it.hasNext()) {
                break;
            }
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData2 = (RewardsOfferAnalyticsData) it.next();
            String offerType = rewardsOfferAnalyticsData2 != null ? rewardsOfferAnalyticsData2.getOfferType() : null;
            if (offerType != null) {
                str2 = offerType;
            }
            arrayList.add(str2);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(listQ, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData3 : listQ) {
            String offerName = rewardsOfferAnalyticsData3 != null ? rewardsOfferAnalyticsData3.getOfferName() : null;
            if (offerName == null) {
                offerName = "";
            }
            arrayList2.add(offerName);
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(listQ, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData4 : listQ) {
            String campaignStream = rewardsOfferAnalyticsData4 != null ? rewardsOfferAnalyticsData4.getCampaignStream() : null;
            if (campaignStream == null) {
                campaignStream = "";
            }
            arrayList3.add(campaignStream);
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.s(listQ, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData5 : listQ) {
            String channel = rewardsOfferAnalyticsData5 != null ? rewardsOfferAnalyticsData5.getChannel() : null;
            if (channel == null) {
                channel = "";
            }
            arrayList4.add(channel);
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.s(listQ, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData6 : listQ) {
            String status = rewardsOfferAnalyticsData6 != null ? rewardsOfferAnalyticsData6.getStatus() : null;
            if (status == null) {
                status = "";
            }
            arrayList5.add(status);
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(listQ, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData7 : listQ) {
            String partnerId = rewardsOfferAnalyticsData7 != null ? rewardsOfferAnalyticsData7.getPartnerId() : null;
            if (partnerId == null) {
                partnerId = "";
            }
            arrayList6.add(partnerId);
        }
        ArrayList arrayList7 = new ArrayList(CollectionsKt.s(listQ, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData8 : listQ) {
            String profile = rewardsOfferAnalyticsData8 != null ? rewardsOfferAnalyticsData8.getProfile() : null;
            if (profile == null) {
                profile = "";
            }
            arrayList7.add(profile);
        }
        ArrayList arrayList8 = new ArrayList(CollectionsKt.s(listQ, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData9 : listQ) {
            String rtlAccountId = rewardsOfferAnalyticsData9 != null ? rewardsOfferAnalyticsData9.getRtlAccountId() : null;
            if (rtlAccountId == null) {
                rtlAccountId = "";
            }
            arrayList8.add(rtlAccountId);
        }
        ArrayList arrayList9 = new ArrayList(CollectionsKt.s(listQ, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData10 : listQ) {
            String rtlCampaignId = rewardsOfferAnalyticsData10 != null ? rewardsOfferAnalyticsData10.getRtlCampaignId() : null;
            arrayList9.add(rtlCampaignId == null ? "" : rtlCampaignId);
        }
        ArrayList arrayList10 = new ArrayList(CollectionsKt.s(listQ, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData11 : listQ) {
            String rtlCampaignCode = rewardsOfferAnalyticsData11 != null ? rewardsOfferAnalyticsData11.getRtlCampaignCode() : null;
            arrayList10.add(rtlCampaignCode == null ? "" : rtlCampaignCode);
        }
        ArrayList arrayList11 = new ArrayList(CollectionsKt.s(listQ, 10));
        for (RewardsOfferAnalyticsData rewardsOfferAnalyticsData12 : listQ) {
            String rtlCouponStart = rewardsOfferAnalyticsData12 != null ? rewardsOfferAnalyticsData12.getRtlCouponStart() : null;
            if (rtlCouponStart == null) {
                rtlCouponStart = "";
            }
            arrayList11.add(rtlCouponStart);
        }
        return new OfferImpressionAnalytics.OfferImpression(screenName, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, arrayList11, appSection, str);
    }

    public static final Map d(BasicRewardsOfferStatusData basicRewardsOfferStatusData, String screenName) {
        String campaignCode;
        String uoid;
        Intrinsics.h(basicRewardsOfferStatusData, "<this>");
        Intrinsics.h(screenName, "screenName");
        RewardsOfferAnalyticsData r = basicRewardsOfferStatusData.getR();
        String str = "";
        if (r == null || (campaignCode = r.getCampaignCode()) == null) {
            campaignCode = "";
        }
        Pair pair = new Pair("campaign_code", campaignCode);
        RewardsOfferAnalyticsData r2 = basicRewardsOfferStatusData.getR();
        if (r2 != null && (uoid = r2.getUoid()) != null) {
            str = uoid;
        }
        return MapsKt.j(pair, new Pair("offer_uoid", str), new Pair(Behavior.ScreenEntry.KEY_NAME, screenName));
    }

    public static final TrackingMetadata e(RewardsOfferData rewardsOfferData) {
        Intrinsics.h(rewardsOfferData, "<this>");
        return f(CollectionsKt.Q(rewardsOfferData));
    }

    public static final TrackingMetadata f(List list) {
        Intrinsics.h(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((BasicRewardsOfferStatusData) it.next()).getR());
        }
        return RewardsOfferAnalyticsDataExtKt.a(arrayList);
    }
}
