package au.com.woolworths.foundation.wxid.shop.data;

import au.com.woolworths.android.onesite.a;
import au.com.woolworths.foundation.wxid.common.data.WxidDetailsData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/wxid/shop/data/ShopWxidDetailsData;", "Lau/com/woolworths/foundation/wxid/common/data/WxidDetailsData;", "wxid-data-shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShopWxidDetailsData implements WxidDetailsData {

    /* renamed from: a, reason: collision with root package name */
    public final String f8944a;
    public final double b;

    public ShopWxidDetailsData(String str, double d) {
        this.f8944a = str;
        this.b = d;
    }

    @Override // au.com.woolworths.foundation.wxid.common.data.WxidDetailsData
    /* renamed from: a, reason: from getter */
    public final String getF8944a() {
        return this.f8944a;
    }

    @Override // au.com.woolworths.foundation.wxid.common.data.WxidDetailsData
    /* renamed from: b, reason: from getter */
    public final double getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopWxidDetailsData)) {
            return false;
        }
        ShopWxidDetailsData shopWxidDetailsData = (ShopWxidDetailsData) obj;
        return Intrinsics.c(this.f8944a, shopWxidDetailsData.f8944a) && Double.compare(this.b, shopWxidDetailsData.b) == 0;
    }

    public final int hashCode() {
        String str = this.f8944a;
        return Double.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sbR = a.r(this.b, "ShopWxidDetailsData(wxid=", this.f8944a, ", nextFetchTime=");
        sbR.append(")");
        return sbR.toString();
    }
}
