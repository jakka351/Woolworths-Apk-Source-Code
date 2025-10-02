package au.com.woolworths.shop.productcard.data;

import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/productcard/data/ProductPriceInfo;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductPriceInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f12654a;
    public final Integer b;
    public final String c;
    public final List d;
    public final TextWithAltData e;
    public final TextWithAltData f;
    public final TextWithAltData g;

    public ProductPriceInfo(String str, Integer num, String str2, List list, TextWithAltData textWithAltData, TextWithAltData textWithAltData2, TextWithAltData textWithAltData3) {
        this.f12654a = str;
        this.b = num;
        this.c = str2;
        this.d = list;
        this.e = textWithAltData;
        this.f = textWithAltData2;
        this.g = textWithAltData3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPriceInfo)) {
            return false;
        }
        ProductPriceInfo productPriceInfo = (ProductPriceInfo) obj;
        return Intrinsics.c(this.f12654a, productPriceInfo.f12654a) && Intrinsics.c(this.b, productPriceInfo.b) && Intrinsics.c(this.c, productPriceInfo.c) && this.d.equals(productPriceInfo.d) && Intrinsics.c(this.e, productPriceInfo.e) && Intrinsics.c(this.f, productPriceInfo.f) && Intrinsics.c(this.g, productPriceInfo.g);
    }

    public final int hashCode() {
        String str = this.f12654a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.c;
        int iD = b.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        TextWithAltData textWithAltData = this.e;
        int iHashCode3 = (iD + (textWithAltData == null ? 0 : textWithAltData.hashCode())) * 31;
        TextWithAltData textWithAltData2 = this.f;
        int iHashCode4 = (iHashCode3 + (textWithAltData2 == null ? 0 : textWithAltData2.hashCode())) * 31;
        TextWithAltData textWithAltData3 = this.g;
        return (iHashCode4 + (textWithAltData3 != null ? textWithAltData3.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductPriceInfo(leadPriceHeaderText=");
        sb.append(this.f12654a);
        sb.append(", leadPrice=");
        sb.append(this.b);
        sb.append(", leadPriceMeasure=");
        a.B(sb, this.c, ", unitPriceDescriptions=", this.d, ", wasPrice=");
        sb.append(this.e);
        sb.append(", savePrice=");
        sb.append(this.f);
        sb.append(", variablePrice=");
        sb.append(this.g);
        sb.append(", priceDisclaimer=null)");
        return sb.toString();
    }
}
