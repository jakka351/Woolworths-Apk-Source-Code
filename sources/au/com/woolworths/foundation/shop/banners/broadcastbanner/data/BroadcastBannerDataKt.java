package au.com.woolworths.foundation.shop.banners.broadcastbanner.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"banners-data"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BroadcastBannerDataKt {
    public static final boolean a(BroadcastBannerData broadcastBannerData) {
        String bannerId;
        Intrinsics.h(broadcastBannerData, "<this>");
        return (!Intrinsics.c(broadcastBannerData.getDismissible(), Boolean.TRUE) || (bannerId = broadcastBannerData.getBannerId()) == null || StringsKt.D(bannerId)) ? false : true;
    }
}
