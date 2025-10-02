package au.com.woolworths.android.onesite.analytics.tealium;

import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/tealium/TealiumConfigData;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TealiumConfigData {

    /* renamed from: a, reason: collision with root package name */
    public final String f4074a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final Integer g;

    public TealiumConfigData(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2) {
        this.f4074a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = num;
        this.g = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TealiumConfigData)) {
            return false;
        }
        TealiumConfigData tealiumConfigData = (TealiumConfigData) obj;
        return Intrinsics.c(this.f4074a, tealiumConfigData.f4074a) && Intrinsics.c(this.b, tealiumConfigData.b) && Intrinsics.c(this.c, tealiumConfigData.c) && Intrinsics.c(this.d, tealiumConfigData.d) && Intrinsics.c(this.e, tealiumConfigData.e) && Intrinsics.c(this.f, tealiumConfigData.f) && Intrinsics.c(this.g, tealiumConfigData.g);
    }

    public final int hashCode() {
        int iC = b.c(b.c(b.c(b.c(this.f4074a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        Integer num = this.f;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("TealiumConfigData(accountKey=", this.f4074a, ", accountName=", this.b, ", profileName=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", dataSource=", this.d, ", visitorIdentityKey=");
        sbV.append(this.e);
        sbV.append(", branchKeyResource=");
        sbV.append(this.f);
        sbV.append(", branchTestKeyResource=");
        return au.com.woolworths.android.onesite.a.p(sbV, this.g, ")");
    }
}
