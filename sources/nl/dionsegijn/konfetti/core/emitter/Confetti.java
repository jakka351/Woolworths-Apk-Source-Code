package nl.dionsegijn.konfetti.core.emitter;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.core.models.Shape;
import nl.dionsegijn.konfetti.core.models.Vector;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/core/emitter/Confetti;", "", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Confetti {

    /* renamed from: a, reason: collision with root package name */
    public final Vector f26640a;
    public final int b;
    public final float c;
    public final float d;
    public final Shape e;
    public long f;
    public final boolean g;
    public final Vector h;
    public final Vector i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public float n;
    public float o;
    public final Vector p;
    public int q;
    public float r;
    public int s;
    public boolean t;

    public Confetti(Vector vector, int i, float f, float f2, Shape shape, long j, boolean z, Vector vector2, float f3, float f4, float f5, float f6) {
        Vector vector3 = new Vector(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        Intrinsics.h(shape, "shape");
        this.f26640a = vector;
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = shape;
        this.f = j;
        this.g = z;
        this.h = vector3;
        this.i = vector2;
        this.j = f3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.o = f;
        this.p = new Vector(BitmapDescriptorFactory.HUE_RED, 0.02f);
        this.q = 255;
        this.t = true;
    }
}
