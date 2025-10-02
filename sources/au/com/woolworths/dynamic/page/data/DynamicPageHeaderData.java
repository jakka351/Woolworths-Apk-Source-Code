package au.com.woolworths.dynamic.page.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/data/DynamicPageHeaderData;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DynamicPageHeaderData {

    /* renamed from: a, reason: collision with root package name */
    public final String f5187a;
    public final String b;
    public final String c;
    public final String d;

    public DynamicPageHeaderData(String str, String str2, String str3, String str4) {
        this.f5187a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicPageHeaderData)) {
            return false;
        }
        DynamicPageHeaderData dynamicPageHeaderData = (DynamicPageHeaderData) obj;
        return Intrinsics.c(this.f5187a, dynamicPageHeaderData.f5187a) && Intrinsics.c(this.b, dynamicPageHeaderData.b) && Intrinsics.c(this.c, dynamicPageHeaderData.c) && Intrinsics.c(this.d, dynamicPageHeaderData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f5187a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return a.l(YU.a.v("DynamicPageHeaderData(title=", this.f5187a, ", imageUrl=", this.b, ", imageAltText="), this.c, ", shareUrl=", this.d, ")");
    }
}
