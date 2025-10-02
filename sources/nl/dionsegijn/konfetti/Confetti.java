package nl.dionsegijn.konfetti;

import android.content.res.Resources;
import android.graphics.Paint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;
import nl.dionsegijn.konfetti.models.Vector;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/Confetti;", "", "konfetti_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class Confetti {

    /* renamed from: a, reason: collision with root package name */
    public final float f26631a;
    public final Paint b;
    public final float c;
    public float d;
    public float e;
    public final float f;
    public int g;
    public final Vector h;
    public final int i;
    public final Shape j;
    public long k;
    public final boolean l;
    public final Vector m;
    public final Vector n;
    public final boolean o;

    public Confetti(Vector vector, int i, Size size, Shape shape, long j, boolean z, Vector vector2, boolean z2, boolean z3, float f) {
        Vector vector3 = new Vector(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        Intrinsics.h(size, "size");
        Intrinsics.h(shape, "shape");
        this.h = vector;
        this.i = i;
        this.j = shape;
        this.k = j;
        this.l = z;
        this.m = vector3;
        this.n = vector2;
        this.o = z3;
        float f2 = size.f26655a;
        Resources system = Resources.getSystem();
        Intrinsics.g(system, "Resources.getSystem()");
        float f3 = f2 * system.getDisplayMetrics().density;
        this.f26631a = f3;
        Paint paint = new Paint();
        this.b = paint;
        this.e = f3;
        this.f = 60.0f;
        this.g = 255;
        Resources system2 = Resources.getSystem();
        Intrinsics.g(system2, "Resources.getSystem()");
        float f4 = system2.getDisplayMetrics().density * 0.29f;
        float f5 = 3 * f4;
        if (z2) {
            this.c = ((Random.e.g() * f5) + f4) * f;
        }
        paint.setColor(i);
    }
}
