package au.com.woolworths.shop.lists.data.converters;

import au.com.woolworths.android.onesite.analytics.RewardsOfferAction;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsData;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/data/converters/RewardsOfferAnalyticsTypeConverter;", "", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RewardsOfferAnalyticsTypeConverter {

    /* renamed from: a, reason: collision with root package name */
    public static final Gson f12269a = new Gson();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/data/converters/RewardsOfferAnalyticsTypeConverter$Companion;", "", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public static RewardsOfferAnalyticsData a(String str) {
        RewardsOfferAnalyticsData rewardsOfferAnalyticsData = (RewardsOfferAnalyticsData) f12269a.d(RewardsOfferAnalyticsData.class, str);
        if ((rewardsOfferAnalyticsData != null ? rewardsOfferAnalyticsData.getAction() : null) != null) {
            return rewardsOfferAnalyticsData;
        }
        if (rewardsOfferAnalyticsData != null) {
            return rewardsOfferAnalyticsData.copy((16383 & 1) != 0 ? rewardsOfferAnalyticsData.offerName : null, (16383 & 2) != 0 ? rewardsOfferAnalyticsData.commId : null, (16383 & 4) != 0 ? rewardsOfferAnalyticsData.uoid : null, (16383 & 8) != 0 ? rewardsOfferAnalyticsData.campaignCode : null, (16383 & 16) != 0 ? rewardsOfferAnalyticsData.campaignStream : null, (16383 & 32) != 0 ? rewardsOfferAnalyticsData.channel : null, (16383 & 64) != 0 ? rewardsOfferAnalyticsData.status : null, (16383 & 128) != 0 ? rewardsOfferAnalyticsData.offerType : null, (16383 & 256) != 0 ? rewardsOfferAnalyticsData.partnerId : null, (16383 & 512) != 0 ? rewardsOfferAnalyticsData.profile : null, (16383 & 1024) != 0 ? rewardsOfferAnalyticsData.rtlAccountId : null, (16383 & 2048) != 0 ? rewardsOfferAnalyticsData.rtlCampaignId : null, (16383 & 4096) != 0 ? rewardsOfferAnalyticsData.rtlCampaignCode : null, (16383 & 8192) != 0 ? rewardsOfferAnalyticsData.rtlCouponStart : null, (16383 & 16384) != 0 ? rewardsOfferAnalyticsData.action : RewardsOfferAction.e);
        }
        return null;
    }
}
