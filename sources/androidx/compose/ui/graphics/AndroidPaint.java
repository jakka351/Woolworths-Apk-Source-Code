package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPaint;", "Landroidx/compose/ui/graphics/Paint;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidPaint implements Paint {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f1759a;
    public int b = 3;
    public Shader c;
    public ColorFilter d;
    public PathEffect e;

    public AndroidPaint(android.graphics.Paint paint) {
        this.f1759a = paint;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final float a() {
        return this.f1759a.getAlpha() / 255.0f;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void b(float f) {
        this.f1759a.setAlpha((int) Math.rint(f * 255.0f));
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final long c() {
        return ColorKt.b(this.f1759a.getColor());
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void d(long j) {
        this.f1759a.setColor(ColorKt.j(j));
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: e, reason: from getter */
    public final android.graphics.Paint getF1759a() {
        return this.f1759a;
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: f, reason: from getter */
    public final Shader getC() {
        return this.c;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void g(Shader shader) {
        this.c = shader;
        this.f1759a.setShader(shader);
    }

    public final int h() {
        Paint.Cap strokeCap = this.f1759a.getStrokeCap();
        int i = strokeCap == null ? -1 : AndroidPaint_androidKt.WhenMappings.f1760a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int i() {
        Paint.Join strokeJoin = this.f1759a.getStrokeJoin();
        int i = strokeJoin == null ? -1 : AndroidPaint_androidKt.WhenMappings.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void j(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        int i2 = Build.VERSION.SDK_INT;
        android.graphics.Paint paint = this.f1759a;
        if (i2 >= 29) {
            paint.setBlendMode(AndroidBlendMode_androidKt.a(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.b(i)));
        }
    }

    public final void k(ColorFilter colorFilter) {
        this.d = colorFilter;
        this.f1759a.setColorFilter(colorFilter != null ? colorFilter.f1767a : null);
    }

    public final void l(int i) {
        this.f1759a.setFilterBitmap(!(i == 0));
    }

    public final void m(PathEffect pathEffect) {
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        this.f1759a.setPathEffect(androidPathEffect != null ? androidPathEffect.a() : null);
        this.e = pathEffect;
    }

    public final void n(int i) {
        this.f1759a.setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public final void o(int i) {
        this.f1759a.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public final void p(float f) {
        this.f1759a.setStrokeMiter(f);
    }

    public final void q(float f) {
        this.f1759a.setStrokeWidth(f);
    }

    public final void r(int i) {
        this.f1759a.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
