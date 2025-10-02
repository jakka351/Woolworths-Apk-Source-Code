package me.oriient.ui.contentview;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ui.contentview.models.Degrees;
import me.oriient.ui.contentview.models.Pixel;
import me.oriient.ui.contentview.models.PixelMatrix;
import me.oriient.ui.contentview.utils.ExtensionsKt;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final PixelMatrix f26614a = new PixelMatrix();
    private final PixelMatrix b = new PixelMatrix();
    private final float[] c = new float[9];
    private float d = ExtensionsKt.getPx(0);
    private float e = ExtensionsKt.getPx(0);
    private boolean f;

    public final float a() {
        return this.d;
    }

    public final float b() {
        return this.e;
    }

    public final PixelMatrix c() {
        return this.b;
    }

    public final PixelMatrix d() {
        return this.f26614a;
    }

    public final Degrees e() {
        float[] fArr = this.c;
        return new Degrees(((float) Math.atan2(fArr[1], fArr[0])) * 57.295776f);
    }

    public final me.oriient.ui.contentview.models.a f() {
        double d = 2;
        return new me.oriient.ui.contentview.models.a((float) Math.sqrt(((float) Math.pow(this.c[0], d)) + ((float) Math.pow(this.c[3], d))));
    }

    public final float g() {
        return ExtensionsKt.getPx(this.c[2]);
    }

    public final float h() {
        return ExtensionsKt.getPx(this.c[5]);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DisplayMetrics(matrix=");
        sb.append(this.f26614a);
        sb.append(", matrixValues=");
        String string = Arrays.toString(this.c);
        Intrinsics.g(string, "toString(...)");
        sb.append(string);
        sb.append(", focusX=");
        sb.append((Object) Pixel.m548toStringimpl(this.d));
        sb.append(", focusY=");
        sb.append((Object) Pixel.m548toStringimpl(this.e));
        sb.append(", isBeingTouched=");
        return androidx.camera.core.impl.b.s(sb, this.f, ')');
    }

    public final void a(float f) {
        this.d = f;
    }

    public final void b(float f) {
        this.e = f;
    }

    public final void a(boolean z) {
        this.f = z;
    }

    public final void a(PixelMatrix newMatrix) {
        Intrinsics.h(newMatrix, "newMatrix");
        this.f26614a.set(newMatrix);
        this.f26614a.copyInto(this.c);
        this.f26614a.invert(this.b);
    }
}
