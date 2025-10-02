package au.com.woolworths.feature.product.list.v2.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/data/SortOptionData;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SortOptionData {

    /* renamed from: a, reason: collision with root package name */
    public final String f5628a;
    public final String b;
    public final String c;
    public final boolean d;

    public SortOptionData(String str, String str2, String str3, boolean z) {
        this.f5628a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SortOptionData)) {
            return false;
        }
        SortOptionData sortOptionData = (SortOptionData) obj;
        return Intrinsics.c(this.f5628a, sortOptionData.f5628a) && Intrinsics.c(this.b, sortOptionData.b) && Intrinsics.c(this.c, sortOptionData.c) && this.d == sortOptionData.d;
    }

    public final int hashCode() {
        int iC = b.c(this.f5628a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return d.r(this.c, ", isApplied=", ")", a.v("SortOptionData(key=", this.f5628a, ", title=", this.b, ", subtitle="), this.d);
    }
}
