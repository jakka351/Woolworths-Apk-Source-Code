package au.com.woolworths.feature.shop.myorders.details.models;

import au.com.woolworths.shop.graphql.type.BroadcastBannerType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BroadcastBannerTypeExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[BroadcastBannerType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BroadcastBannerType.Companion companion = BroadcastBannerType.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BroadcastBannerType.Companion companion2 = BroadcastBannerType.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerType a(BroadcastBannerType broadcastBannerType) {
        int iOrdinal = broadcastBannerType.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerType.NEUTRAL : au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerType.REWARDS : au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerType.PRIMARY : au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerType.NEUTRAL;
    }
}
