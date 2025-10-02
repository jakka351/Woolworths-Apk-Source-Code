package nl.dionsegijn.konfetti.core;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.core.models.Shape;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/core/Particle;", "", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Particle {

    /* renamed from: a, reason: collision with root package name */
    public final float f26634a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final float f;
    public final float g;
    public final Shape h;
    public final int i;

    public Particle(float f, float f2, float f3, float f4, int i, float f5, float f6, Shape shape, int i2) {
        Intrinsics.h(shape, "shape");
        this.f26634a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = i;
        this.f = f5;
        this.g = f6;
        this.h = shape;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Particle)) {
            return false;
        }
        Particle particle = (Particle) obj;
        return Float.valueOf(this.f26634a).equals(Float.valueOf(particle.f26634a)) && Float.valueOf(this.b).equals(Float.valueOf(particle.b)) && Float.valueOf(this.c).equals(Float.valueOf(particle.c)) && Float.valueOf(this.d).equals(Float.valueOf(particle.d)) && this.e == particle.e && Float.valueOf(this.f).equals(Float.valueOf(particle.f)) && Float.valueOf(this.g).equals(Float.valueOf(particle.g)) && Intrinsics.c(this.h, particle.h) && this.i == particle.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + ((this.h.hashCode() + a.b(this.g, a.b(this.f, b.a(this.e, a.b(this.d, a.b(this.c, a.b(this.b, Float.hashCode(this.f26634a) * 31, 31), 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Particle(x=");
        sb.append(this.f26634a);
        sb.append(", y=");
        sb.append(this.b);
        sb.append(", width=");
        sb.append(this.c);
        sb.append(", height=");
        sb.append(this.d);
        sb.append(", color=");
        sb.append(this.e);
        sb.append(", rotation=");
        sb.append(this.f);
        sb.append(", scaleX=");
        sb.append(this.g);
        sb.append(", shape=");
        sb.append(this.h);
        sb.append(", alpha=");
        return YU.a.l(sb, this.i, ')');
    }
}
