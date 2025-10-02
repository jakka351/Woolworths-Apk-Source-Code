package au.com.woolworths.feature.product.list.legacy.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/ZeroResultPageData;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ZeroResultPageData {

    /* renamed from: a, reason: collision with root package name */
    public final String f5369a;
    public final String b;
    public final String c;
    public final List d;

    public ZeroResultPageData(String str, String str2, String str3, List list) {
        this.f5369a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public static ZeroResultPageData a(ZeroResultPageData zeroResultPageData, String str, String str2, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            str = zeroResultPageData.f5369a;
        }
        if ((i & 2) != 0) {
            str2 = zeroResultPageData.b;
        }
        String str3 = zeroResultPageData.c;
        ArrayList arrayList2 = arrayList;
        if ((i & 8) != 0) {
            arrayList2 = zeroResultPageData.d;
        }
        zeroResultPageData.getClass();
        return new ZeroResultPageData(str, str2, str3, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZeroResultPageData)) {
            return false;
        }
        ZeroResultPageData zeroResultPageData = (ZeroResultPageData) obj;
        return Intrinsics.c(this.f5369a, zeroResultPageData.f5369a) && Intrinsics.c(this.b, zeroResultPageData.b) && Intrinsics.c(this.c, zeroResultPageData.c) && Intrinsics.c(this.d, zeroResultPageData.d);
    }

    public final int hashCode() {
        String str = this.f5369a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ZeroResultPageData(title=", this.f5369a, ", searchTerm=", this.b, ", message=");
        sbV.append(this.c);
        sbV.append(", items=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
