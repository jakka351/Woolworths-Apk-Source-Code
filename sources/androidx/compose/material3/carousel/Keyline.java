package androidx.compose.material3.carousel;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/carousel/Keyline;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Keyline {

    /* renamed from: a, reason: collision with root package name */
    public final float f1538a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final float g;

    public Keyline(float f, float f2, float f3, boolean z, boolean z2, boolean z3, float f4) {
        this.f1538a = f;
        this.b = f2;
        this.c = f3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Keyline)) {
            return false;
        }
        Keyline keyline = (Keyline) obj;
        return Float.compare(this.f1538a, keyline.f1538a) == 0 && Float.compare(this.b, keyline.b) == 0 && Float.compare(this.c, keyline.c) == 0 && this.d == keyline.d && this.e == keyline.e && this.f == keyline.f && Float.compare(this.g, keyline.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + b.e(b.e(b.e(a.b(this.c, a.b(this.b, Float.hashCode(this.f1538a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Keyline(size=");
        sb.append(this.f1538a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", unadjustedOffset=");
        sb.append(this.c);
        sb.append(", isFocal=");
        sb.append(this.d);
        sb.append(", isAnchor=");
        sb.append(this.e);
        sb.append(", isPivot=");
        sb.append(this.f);
        sb.append(", cutoff=");
        return a.r(sb, this.g, ')');
    }
}
