package au.com.woolworths.feature.shop.recipes.freshmag.home.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/home/data/FreshMagSummaryData;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FreshMagSummaryData {

    /* renamed from: a, reason: collision with root package name */
    public final String f8054a;
    public final String b;
    public final String c;
    public final String d;

    public FreshMagSummaryData(String str, String str2, String str3, String str4) {
        this.f8054a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreshMagSummaryData)) {
            return false;
        }
        FreshMagSummaryData freshMagSummaryData = (FreshMagSummaryData) obj;
        return Intrinsics.c(this.f8054a, freshMagSummaryData.f8054a) && Intrinsics.c(this.b, freshMagSummaryData.b) && Intrinsics.c(this.c, freshMagSummaryData.c) && Intrinsics.c(this.d, freshMagSummaryData.d);
    }

    public final int hashCode() {
        int iC = b.c(this.f8054a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return a.l(YU.a.v("FreshMagSummaryData(coverImageUrl=", this.f8054a, ", description=", this.b, ", magazineId="), this.c, ", buttonTitle=", this.d, ")");
    }
}
