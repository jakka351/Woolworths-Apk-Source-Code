package au.com.woolworths.feature.shop.myorders.details.models;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFilterGroupItem;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpDataList;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/YourGroceriesProductList;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class YourGroceriesProductList {

    /* renamed from: a, reason: collision with root package name */
    public final YourGroceriesFilterGroupItem f7777a;
    public final ArrayList b;
    public final String c;
    public final String d;
    public final String e;
    public final OrderPaymentDetailsData f;
    public final OrderHelpDataList g;

    public YourGroceriesProductList(YourGroceriesFilterGroupItem yourGroceriesFilterGroupItem, ArrayList arrayList, String str, String str2, String str3, OrderPaymentDetailsData orderPaymentDetailsData, OrderHelpDataList orderHelpDataList) {
        this.f7777a = yourGroceriesFilterGroupItem;
        this.b = arrayList;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = orderPaymentDetailsData;
        this.g = orderHelpDataList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YourGroceriesProductList)) {
            return false;
        }
        YourGroceriesProductList yourGroceriesProductList = (YourGroceriesProductList) obj;
        return Intrinsics.c(this.f7777a, yourGroceriesProductList.f7777a) && this.b.equals(yourGroceriesProductList.b) && this.c.equals(yourGroceriesProductList.c) && this.d.equals(yourGroceriesProductList.d) && this.e.equals(yourGroceriesProductList.e) && this.f.equals(yourGroceriesProductList.f) && Intrinsics.c(this.g, yourGroceriesProductList.g);
    }

    public final int hashCode() {
        YourGroceriesFilterGroupItem yourGroceriesFilterGroupItem = this.f7777a;
        int iHashCode = (this.f.hashCode() + b.c(b.c(b.c(a.b((yourGroceriesFilterGroupItem == null ? 0 : yourGroceriesFilterGroupItem.f7703a.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31;
        OrderHelpDataList orderHelpDataList = this.g;
        return iHashCode + (orderHelpDataList != null ? orderHelpDataList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YourGroceriesProductList(filter=");
        sb.append(this.f7777a);
        sb.append(", feed=");
        sb.append(this.b);
        sb.append(", countLabel=");
        androidx.constraintlayout.core.state.a.B(sb, this.c, ", totalLabel=", this.d, ", totalValue=");
        sb.append(this.e);
        sb.append(", paymentDetails=");
        sb.append(this.f);
        sb.append(", helpList=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
