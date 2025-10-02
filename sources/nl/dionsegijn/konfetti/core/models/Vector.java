package nl.dionsegijn.konfetti.core.models;

import android.support.v4.media.session.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/core/models/Vector;", "", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Vector {

    /* renamed from: a, reason: collision with root package name */
    public float f26648a;
    public float b;

    public Vector(float f, float f2) {
        this.f26648a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vector)) {
            return false;
        }
        Vector vector = (Vector) obj;
        return Float.valueOf(this.f26648a).equals(Float.valueOf(vector.f26648a)) && Float.valueOf(this.b).equals(Float.valueOf(vector.b));
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f26648a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vector(x=");
        sb.append(this.f26648a);
        sb.append(", y=");
        return a.r(sb, this.b, ')');
    }
}
