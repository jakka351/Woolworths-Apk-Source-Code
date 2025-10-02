package au.com.woolworths.feature.shop.bundles;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/PagingParams;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PagingParams {

    /* renamed from: a, reason: collision with root package name */
    public final String f6746a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;

    public PagingParams(String str, String str2, String str3, boolean z, boolean z2) {
        this.f6746a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagingParams)) {
            return false;
        }
        PagingParams pagingParams = (PagingParams) obj;
        return Intrinsics.c(this.f6746a, pagingParams.f6746a) && this.b == pagingParams.b && Intrinsics.c(this.c, pagingParams.c) && Intrinsics.c(this.d, pagingParams.d) && this.e == pagingParams.e;
    }

    public final int hashCode() {
        String str = this.f6746a;
        int iE = androidx.camera.core.impl.b.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("PagingParams(argument=", this.f6746a, ", initialLoad=", ", sortOptionId=", this.b);
        androidx.constraintlayout.core.state.a.B(sbQ, this.c, ", storeId=", this.d, ", clearSignal=");
        return YU.a.k(")", sbQ, this.e);
    }
}
