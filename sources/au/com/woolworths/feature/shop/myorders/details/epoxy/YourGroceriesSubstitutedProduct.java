package au.com.woolworths.feature.shop.myorders.details.epoxy;

import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/epoxy/YourGroceriesSubstitutedProduct;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class YourGroceriesSubstitutedProduct {

    /* renamed from: a, reason: collision with root package name */
    public final String f7710a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Boolean k;
    public final SpannableString l;
    public final boolean m;

    public YourGroceriesSubstitutedProduct(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, Boolean bool2) {
        this.f7710a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bool;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = bool2;
        SpannableString spannableString = new SpannableString(str4);
        spannableString.setSpan(new StrikethroughSpan(), 0, str4.length(), 18);
        this.l = spannableString;
        this.m = bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YourGroceriesSubstitutedProduct)) {
            return false;
        }
        YourGroceriesSubstitutedProduct yourGroceriesSubstitutedProduct = (YourGroceriesSubstitutedProduct) obj;
        return Intrinsics.c(this.f7710a, yourGroceriesSubstitutedProduct.f7710a) && Intrinsics.c(this.b, yourGroceriesSubstitutedProduct.b) && Intrinsics.c(this.c, yourGroceriesSubstitutedProduct.c) && Intrinsics.c(this.d, yourGroceriesSubstitutedProduct.d) && Intrinsics.c(this.e, yourGroceriesSubstitutedProduct.e) && Intrinsics.c(this.f, yourGroceriesSubstitutedProduct.f) && Intrinsics.c(this.g, yourGroceriesSubstitutedProduct.g) && Intrinsics.c(this.h, yourGroceriesSubstitutedProduct.h) && Intrinsics.c(this.i, yourGroceriesSubstitutedProduct.i) && Intrinsics.c(this.j, yourGroceriesSubstitutedProduct.j) && Intrinsics.c(this.k, yourGroceriesSubstitutedProduct.k);
    }

    public final int hashCode() {
        int iHashCode = this.f7710a.hashCode() * 31;
        String str = this.b;
        int iC = b.c(b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        String str2 = this.e;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool2 = this.k;
        return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("YourGroceriesSubstitutedProduct(productId=", this.f7710a, ", productImage=", this.b, ", title=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", priceLabel=", this.d, ", productName=");
        au.com.woolworths.android.onesite.a.A(sbV, this.e, ", priceMatched=", this.f, ", productLabel=");
        androidx.constraintlayout.core.state.a.B(sbV, this.g, ", priceMatchedLabel=", this.h, ", quantityTitle=");
        androidx.constraintlayout.core.state.a.B(sbV, this.i, ", quantityValue=", this.j, ", showRating=");
        return au.com.woolworths.android.onesite.a.o(sbV, this.k, ")");
    }
}
