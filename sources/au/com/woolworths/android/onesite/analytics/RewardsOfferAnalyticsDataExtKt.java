package au.com.woolworths.android.onesite.analytics;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsOfferAnalyticsDataExtKt {
    public static final TrackingMetadata a(ArrayList arrayList) {
        RewardsOfferAction action;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                break;
            }
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData = (RewardsOfferAnalyticsData) it.next();
            String commId = rewardsOfferAnalyticsData != null ? rewardsOfferAnalyticsData.getCommId() : null;
            if (commId != null) {
                str = commId;
            }
            arrayList2.add(str);
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData2 = (RewardsOfferAnalyticsData) it2.next();
            String uoid = rewardsOfferAnalyticsData2 != null ? rewardsOfferAnalyticsData2.getUoid() : null;
            if (uoid == null) {
                uoid = "";
            }
            arrayList3.add(uoid);
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData3 = (RewardsOfferAnalyticsData) it3.next();
            String campaignCode = rewardsOfferAnalyticsData3 != null ? rewardsOfferAnalyticsData3.getCampaignCode() : null;
            if (campaignCode == null) {
                campaignCode = "";
            }
            arrayList4.add(campaignCode);
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData4 = (RewardsOfferAnalyticsData) it4.next();
            String campaignStream = rewardsOfferAnalyticsData4 != null ? rewardsOfferAnalyticsData4.getCampaignStream() : null;
            if (campaignStream == null) {
                campaignStream = "";
            }
            arrayList5.add(campaignStream);
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData5 = (RewardsOfferAnalyticsData) it5.next();
            String channel = rewardsOfferAnalyticsData5 != null ? rewardsOfferAnalyticsData5.getChannel() : null;
            if (channel == null) {
                channel = "";
            }
            arrayList6.add(channel);
        }
        ArrayList arrayList7 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData6 = (RewardsOfferAnalyticsData) it6.next();
            String status = rewardsOfferAnalyticsData6 != null ? rewardsOfferAnalyticsData6.getStatus() : null;
            if (status == null) {
                status = "";
            }
            arrayList7.add(status);
        }
        ArrayList arrayList8 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData7 = (RewardsOfferAnalyticsData) it7.next();
            String offerType = rewardsOfferAnalyticsData7 != null ? rewardsOfferAnalyticsData7.getOfferType() : null;
            if (offerType == null) {
                offerType = "";
            }
            arrayList8.add(offerType);
        }
        ArrayList arrayList9 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData8 = (RewardsOfferAnalyticsData) it8.next();
            String partnerId = rewardsOfferAnalyticsData8 != null ? rewardsOfferAnalyticsData8.getPartnerId() : null;
            if (partnerId == null) {
                partnerId = "";
            }
            arrayList9.add(partnerId);
        }
        ArrayList arrayList10 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData9 = (RewardsOfferAnalyticsData) it9.next();
            String rtlAccountId = rewardsOfferAnalyticsData9 != null ? rewardsOfferAnalyticsData9.getRtlAccountId() : null;
            if (rtlAccountId == null) {
                rtlAccountId = "";
            }
            arrayList10.add(rtlAccountId);
        }
        ArrayList arrayList11 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it10 = arrayList.iterator();
        while (it10.hasNext()) {
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData10 = (RewardsOfferAnalyticsData) it10.next();
            String rtlCampaignId = rewardsOfferAnalyticsData10 != null ? rewardsOfferAnalyticsData10.getRtlCampaignId() : null;
            if (rtlCampaignId == null) {
                rtlCampaignId = "";
            }
            arrayList11.add(rtlCampaignId);
        }
        ArrayList arrayList12 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it11 = arrayList.iterator();
        while (it11.hasNext()) {
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData11 = (RewardsOfferAnalyticsData) it11.next();
            String rtlCampaignCode = rewardsOfferAnalyticsData11 != null ? rewardsOfferAnalyticsData11.getRtlCampaignCode() : null;
            arrayList12.add(rtlCampaignCode == null ? "" : rtlCampaignCode);
        }
        ArrayList arrayList13 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it12 = arrayList.iterator();
        while (it12.hasNext()) {
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData12 = (RewardsOfferAnalyticsData) it12.next();
            String rtlCouponStart = rewardsOfferAnalyticsData12 != null ? rewardsOfferAnalyticsData12.getRtlCouponStart() : null;
            arrayList13.add(rtlCouponStart == null ? "" : rtlCouponStart);
        }
        ArrayList arrayList14 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it13 = arrayList.iterator();
        while (it13.hasNext()) {
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData13 = (RewardsOfferAnalyticsData) it13.next();
            String profile = rewardsOfferAnalyticsData13 != null ? rewardsOfferAnalyticsData13.getProfile() : null;
            if (profile == null) {
                profile = "";
            }
            arrayList14.add(profile);
        }
        ArrayList arrayList15 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it14 = arrayList.iterator();
        while (it14.hasNext()) {
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData14 = (RewardsOfferAnalyticsData) it14.next();
            String offerName = rewardsOfferAnalyticsData14 != null ? rewardsOfferAnalyticsData14.getOfferName() : null;
            if (offerName == null) {
                offerName = "";
            }
            arrayList15.add(offerName);
        }
        ArrayList arrayList16 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it15 = arrayList.iterator();
        while (it15.hasNext()) {
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData15 = (RewardsOfferAnalyticsData) it15.next();
            String str2 = (rewardsOfferAnalyticsData15 == null || (action = rewardsOfferAnalyticsData15.getAction()) == null) ? null : action.d;
            if (str2 == null) {
                str2 = "";
            }
            arrayList16.add(str2);
        }
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.Y0, arrayList2);
        trackingMetadataA.b(TrackableValue.X0, arrayList3);
        trackingMetadataA.b(TrackableValue.M0, arrayList4);
        trackingMetadataA.b(TrackableValue.V0, arrayList5);
        trackingMetadataA.b(TrackableValue.L0, arrayList6);
        trackingMetadataA.b(TrackableValue.U0, arrayList7);
        trackingMetadataA.b(TrackableValue.W0, arrayList8);
        trackingMetadataA.b(TrackableValue.O0, arrayList9);
        trackingMetadataA.b(TrackableValue.N0, arrayList15);
        trackingMetadataA.b(TrackableValue.Q0, arrayList10);
        trackingMetadataA.b(TrackableValue.R0, arrayList12);
        trackingMetadataA.b(TrackableValue.S0, arrayList11);
        trackingMetadataA.b(TrackableValue.T0, arrayList13);
        trackingMetadataA.b(TrackableValue.P0, arrayList14);
        trackingMetadataA.b(TrackableValue.K0, arrayList16);
        return trackingMetadataA;
    }
}
