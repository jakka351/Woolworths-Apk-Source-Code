package au.com.woolworths.android.onesite.branch;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/branch/BranchReferringParams;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BranchReferringParams {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4236a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final UtmParams f;
    public final String g;

    public BranchReferringParams(boolean z, boolean z2, String str, String str2, String str3, UtmParams utmParams, String str4) {
        this.f4236a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = utmParams;
        this.g = str4;
    }

    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: c, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: d, reason: from getter */
    public final String getG() {
        return this.g;
    }

    /* renamed from: e, reason: from getter */
    public final UtmParams getF() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BranchReferringParams)) {
            return false;
        }
        BranchReferringParams branchReferringParams = (BranchReferringParams) obj;
        return this.f4236a == branchReferringParams.f4236a && this.b == branchReferringParams.b && Intrinsics.c(this.c, branchReferringParams.c) && Intrinsics.c(this.d, branchReferringParams.d) && Intrinsics.c(this.e, branchReferringParams.e) && Intrinsics.c(this.f, branchReferringParams.f) && Intrinsics.c(this.g, branchReferringParams.g);
    }

    /* renamed from: f, reason: from getter */
    public final boolean getF4236a() {
        return this.f4236a;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + b.c(b.c(b.c(b.e(Boolean.hashCode(this.f4236a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = b.v("BranchReferringParams(isClickedBranchLink=", ", isWebOnly=", ", androidUrl=", this.f4236a, this.b);
        a.B(sbV, this.c, ", deeplinkPath=", this.d, ", canonicalUrl=");
        sbV.append(this.e);
        sbV.append(", utmParams=");
        sbV.append(this.f);
        sbV.append(", referringLink=");
        return YU.a.o(sbV, this.g, ")");
    }
}
