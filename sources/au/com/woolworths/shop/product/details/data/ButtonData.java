package au.com.woolworths.shop.product.details.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/ButtonData;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ButtonData {

    /* renamed from: a, reason: collision with root package name */
    public final String f12597a;
    public final String b;
    public final boolean c;
    public final ButtonActionData d;
    public final String e;
    public final ButtonStyleApiData f;

    public ButtonData(String str, String str2, boolean z, ButtonActionData buttonActionData, String str3, ButtonStyleApiData buttonStyleApiData) {
        this.f12597a = str;
        this.b = str2;
        this.c = z;
        this.d = buttonActionData;
        this.e = str3;
        this.f = buttonStyleApiData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonData)) {
            return false;
        }
        ButtonData buttonData = (ButtonData) obj;
        return Intrinsics.c(this.f12597a, buttonData.f12597a) && this.b.equals(buttonData.b) && this.c == buttonData.c && Intrinsics.c(this.d, buttonData.d) && Intrinsics.c(this.e, buttonData.e) && this.f == buttonData.f;
    }

    public final int hashCode() {
        String str = this.f12597a;
        int iE = b.e(b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        ButtonActionData buttonActionData = this.d;
        int iHashCode = (iE + (buttonActionData == null ? 0 : buttonActionData.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ButtonStyleApiData buttonStyleApiData = this.f;
        return (iHashCode2 + (buttonStyleApiData != null ? buttonStyleApiData.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sbV = a.v("ButtonData(altText=", this.f12597a, ", label=", this.b, ", enabled=");
        sbV.append(this.c);
        sbV.append(", buttonAction=");
        sbV.append(this.d);
        sbV.append(", buttonId=");
        sbV.append(this.e);
        sbV.append(", style=");
        sbV.append(this.f);
        sbV.append(", analytics=null)");
        return sbV.toString();
    }
}
