package au.com.woolworths.shop.product.details.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/NutritionInfo;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NutritionInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f12604a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final String f;
    public final List g;
    public final List h;

    public NutritionInfo(String str, String str2, String str3, List list, List list2, String str4, List list3, List list4) {
        this.f12604a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
        this.f = str4;
        this.g = list3;
        this.h = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NutritionInfo)) {
            return false;
        }
        NutritionInfo nutritionInfo = (NutritionInfo) obj;
        return Intrinsics.c(this.f12604a, nutritionInfo.f12604a) && Intrinsics.c(this.b, nutritionInfo.b) && Intrinsics.c(this.c, nutritionInfo.c) && Intrinsics.c(this.d, nutritionInfo.d) && Intrinsics.c(this.e, nutritionInfo.e) && Intrinsics.c(this.f, nutritionInfo.f) && Intrinsics.c(this.g, nutritionInfo.g) && Intrinsics.c(this.h, nutritionInfo.h);
    }

    public final int hashCode() {
        String str = this.f12604a;
        return this.h.hashCode() + b.d(b.c(b.d(b.d(b.c(b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbV = a.v("NutritionInfo(title=", this.f12604a, ", servingsPerPack=", this.b, ", servingSize=");
        au.com.woolworths.android.onesite.a.B(sbV, this.c, ", servingsHeader=", this.d, ", servingsRow=");
        sbV.append(this.e);
        sbV.append(", bottomCaption=");
        sbV.append(this.f);
        sbV.append(", tableHeaderRow=");
        sbV.append(this.g);
        sbV.append(", tableRows=");
        sbV.append(this.h);
        sbV.append(")");
        return sbV.toString();
    }
}
