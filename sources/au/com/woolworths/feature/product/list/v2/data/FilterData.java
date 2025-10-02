package au.com.woolworths.feature.product.list.v2.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/data/FilterData;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FilterData {

    /* renamed from: a, reason: collision with root package name */
    public final String f5621a;
    public final String b;
    public final ArrayList c;
    public final InsetBannerApiData d;

    public FilterData(String str, String str2, ArrayList arrayList, InsetBannerApiData insetBannerApiData) {
        this.f5621a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = insetBannerApiData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterData)) {
            return false;
        }
        FilterData filterData = (FilterData) obj;
        return this.f5621a.equals(filterData.f5621a) && this.b.equals(filterData.b) && this.c.equals(filterData.c) && Intrinsics.c(this.d, filterData.d);
    }

    public final int hashCode() {
        int iB = a.b(b.c(this.f5621a.hashCode() * 31, 31, this.b), 31, this.c);
        InsetBannerApiData insetBannerApiData = this.d;
        return iB + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode());
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("FilterData(headerKey=", this.f5621a, ", headerTitle=", this.b, ", filterItems=");
        sbV.append(this.c);
        sbV.append(", banner=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
