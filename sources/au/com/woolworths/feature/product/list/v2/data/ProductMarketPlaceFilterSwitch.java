package au.com.woolworths.feature.product.list.v2.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/data/ProductMarketPlaceFilterSwitch;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductMarketPlaceFilterSwitch {

    /* renamed from: a, reason: collision with root package name */
    public final String f5627a;
    public final String b;
    public final String c;
    public final boolean d;
    public final ContentCta e;

    public ProductMarketPlaceFilterSwitch(String str, String str2, String str3, boolean z, ContentCta contentCta) {
        this.f5627a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = contentCta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductMarketPlaceFilterSwitch)) {
            return false;
        }
        ProductMarketPlaceFilterSwitch productMarketPlaceFilterSwitch = (ProductMarketPlaceFilterSwitch) obj;
        return Intrinsics.c(this.f5627a, productMarketPlaceFilterSwitch.f5627a) && Intrinsics.c(this.b, productMarketPlaceFilterSwitch.b) && Intrinsics.c(this.c, productMarketPlaceFilterSwitch.c) && this.d == productMarketPlaceFilterSwitch.d && Intrinsics.c(this.e, productMarketPlaceFilterSwitch.e);
    }

    public final int hashCode() {
        int iHashCode = this.f5627a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iE = b.e((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        ContentCta contentCta = this.e;
        return iE + (contentCta != null ? contentCta.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ProductMarketPlaceFilterSwitch(title=", this.f5627a, ", subtitle=", this.b, ", imageUrl=");
        d.A(this.c, ", value=", ", buttonCta=", sbV, this.d);
        sbV.append(this.e);
        sbV.append(")");
        return sbV.toString();
    }
}
