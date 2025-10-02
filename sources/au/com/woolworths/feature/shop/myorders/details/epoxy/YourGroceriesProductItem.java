package au.com.woolworths.feature.shop.myorders.details.epoxy;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.myorders.details.models.OrderProductListProductPriceStyle;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/epoxy/YourGroceriesProductItem;", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$YourGroceriesItem;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class YourGroceriesProductItem implements YourGroceriesContract.YourGroceriesItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f7707a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final OrderProductListProductPriceStyle g;
    public final List h;

    public YourGroceriesProductItem(String str, String str2, String str3, String str4, String str5, String str6, OrderProductListProductPriceStyle orderProductListProductPriceStyle, List list) {
        this.f7707a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = orderProductListProductPriceStyle;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YourGroceriesProductItem)) {
            return false;
        }
        YourGroceriesProductItem yourGroceriesProductItem = (YourGroceriesProductItem) obj;
        return Intrinsics.c(this.f7707a, yourGroceriesProductItem.f7707a) && Intrinsics.c(this.b, yourGroceriesProductItem.b) && Intrinsics.c(this.c, yourGroceriesProductItem.c) && Intrinsics.c(this.d, yourGroceriesProductItem.d) && Intrinsics.c(this.e, yourGroceriesProductItem.e) && Intrinsics.c(this.f, yourGroceriesProductItem.f) && this.g == yourGroceriesProductItem.g && Intrinsics.c(this.h, yourGroceriesProductItem.h);
    }

    public final int hashCode() {
        int iC = b.c(this.f7707a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.h.hashCode() + ((this.g.hashCode() + b.c(b.c(b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("YourGroceriesProductItem(productId=", this.f7707a, ", name=", this.b, ", productImage=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", quantityTitle=", this.d, ", quantityValue=");
        androidx.constraintlayout.core.state.a.B(sbV, this.e, ", priceLabel=", this.f, ", priceStyle=");
        sbV.append(this.g);
        sbV.append(", substitutions=");
        sbV.append(this.h);
        sbV.append(")");
        return sbV.toString();
    }

    public /* synthetic */ YourGroceriesProductItem(String str, String str2, String str3, OrderProductListProductPriceStyle orderProductListProductPriceStyle) {
        this("productId", "Sacred Grounds Grover Blend Ground Coffee 200g", "", str, str2, str3, orderProductListProductPriceStyle, EmptyList.d);
    }
}
