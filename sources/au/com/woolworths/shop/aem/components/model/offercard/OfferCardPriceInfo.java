package au.com.woolworths.shop.aem.components.model.offercard;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/offercard/OfferCardPriceInfo;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OfferCardPriceInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f10176a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public OfferCardPriceInfo(String str, String str2, String str3, String str4, String str5) {
        this.f10176a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferCardPriceInfo)) {
            return false;
        }
        OfferCardPriceInfo offerCardPriceInfo = (OfferCardPriceInfo) obj;
        return Intrinsics.c(this.f10176a, offerCardPriceInfo.f10176a) && Intrinsics.c(this.b, offerCardPriceInfo.b) && Intrinsics.c(this.c, offerCardPriceInfo.c) && Intrinsics.c(this.d, offerCardPriceInfo.d) && Intrinsics.c(this.e, offerCardPriceInfo.e);
    }

    public final int hashCode() {
        String str = this.f10176a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("OfferCardPriceInfo(dollars=", this.f10176a, ", cents=", this.b, ", prefix1=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", prefix2=", this.d, ", suffix=");
        return a.o(sbV, this.e, ")");
    }
}
