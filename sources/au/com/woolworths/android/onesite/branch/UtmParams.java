package au.com.woolworths.android.onesite.branch;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/branch/UtmParams;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UtmParams {

    /* renamed from: a, reason: collision with root package name */
    public final String f4237a;
    public final String b;
    public final String c;

    public UtmParams(String str, String str2, String str3) {
        this.f4237a = str;
        this.b = str2;
        this.c = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getF4237a() {
        return this.f4237a;
    }

    /* renamed from: b, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtmParams)) {
            return false;
        }
        UtmParams utmParams = (UtmParams) obj;
        return Intrinsics.c(this.f4237a, utmParams.f4237a) && Intrinsics.c(this.b, utmParams.b) && Intrinsics.c(this.c, utmParams.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f4237a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.o(a.v("UtmParams(campaign=", this.f4237a, ", source=", this.b, ", medium="), this.c, ")");
    }
}
