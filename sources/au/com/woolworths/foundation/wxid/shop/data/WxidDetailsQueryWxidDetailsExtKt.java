package au.com.woolworths.foundation.wxid.shop.data;

import au.com.woolworths.foundation.wxid.shop.WxidDetailsQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wxid-data-shop_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WxidDetailsQueryWxidDetailsExtKt {
    public static final ShopWxidDetailsData a(WxidDetailsQuery.WxidDetails wxidDetails) {
        Intrinsics.h(wxidDetails, "<this>");
        return new ShopWxidDetailsData(wxidDetails.f8941a, wxidDetails.b);
    }
}
