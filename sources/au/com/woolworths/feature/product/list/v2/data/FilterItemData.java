package au.com.woolworths.feature.product.list.v2.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/data/FilterItemData;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FilterItemData {

    /* renamed from: a, reason: collision with root package name */
    public final String f5622a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public FilterItemData(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f5622a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterItemData)) {
            return false;
        }
        FilterItemData filterItemData = (FilterItemData) obj;
        return Intrinsics.c(this.f5622a, filterItemData.f5622a) && Intrinsics.c(this.b, filterItemData.b) && Intrinsics.c(this.c, filterItemData.c) && Intrinsics.c(this.d, filterItemData.d) && this.e == filterItemData.e && this.f == filterItemData.f;
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.f5622a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.f) + b.e((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbV = a.v("FilterItemData(key=", this.f5622a, ", title=", this.b, ", label=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", parentKey=", this.d, ", hasChildren=");
        return au.com.woolworths.android.onesite.a.q(sbV, this.e, ", isApplied=", this.f, ")");
    }
}
