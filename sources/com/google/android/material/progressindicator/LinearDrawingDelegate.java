package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.core.math.MathUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.DrawingDelegate;

/* loaded from: classes6.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    public float b;
    public float c;
    public float d;
    public boolean e;
    public float f;

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        this.b = rect.width();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f14619a;
        float f2 = linearProgressIndicatorSpec.f14618a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(BitmapDescriptorFactory.HUE_RED, (rect.height() - f2) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (linearProgressIndicatorSpec.j) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f3 = this.b / 2.0f;
        float f4 = f2 / 2.0f;
        canvas.clipRect(-f3, -f4, f3, f4);
        int i = linearProgressIndicatorSpec.f14618a;
        this.e = i / 2 == linearProgressIndicatorSpec.b;
        this.c = i * f;
        this.d = Math.min(i / 2, r6) * f;
        if (z || z2) {
            if ((z && linearProgressIndicatorSpec.e == 2) || (z2 && linearProgressIndicatorSpec.f == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && linearProgressIndicatorSpec.f != 3)) {
                canvas.translate(BitmapDescriptorFactory.HUE_RED, ((1.0f - f) * linearProgressIndicatorSpec.f14618a) / 2.0f);
            }
        }
        if (z2 && linearProgressIndicatorSpec.f == 3) {
            this.f = f;
        } else {
            this.f = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void b(Canvas canvas, Paint paint, int i, int i2) {
        int iA = MaterialColors.a(i, i2);
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f14619a;
        if (linearProgressIndicatorSpec.k <= 0 || iA == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iA);
        PointF pointF = new PointF((this.b / 2.0f) - (this.c / 2.0f), BitmapDescriptorFactory.HUE_RED);
        int i3 = linearProgressIndicatorSpec.k;
        h(canvas, paint, pointF, null, i3, i3);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void c(Canvas canvas, Paint paint, DrawingDelegate.ActiveIndicator activeIndicator, int i) {
        int iA = MaterialColors.a(activeIndicator.c, i);
        float f = activeIndicator.f14620a;
        float f2 = activeIndicator.b;
        int i2 = activeIndicator.d;
        g(canvas, paint, f, f2, iA, i2, i2);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        g(canvas, paint, f, f2, MaterialColors.a(i, i2), i3, i3);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final int e() {
        return ((LinearProgressIndicatorSpec) this.f14619a).f14618a;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public final int f() {
        return -1;
    }

    public final void g(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        float f3;
        float fA = MathUtils.a(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        float fA2 = MathUtils.a(f2, BitmapDescriptorFactory.HUE_RED, 1.0f);
        float fC = com.google.android.material.math.MathUtils.c(1.0f - this.f, 1.0f, fA);
        float fC2 = com.google.android.material.math.MathUtils.c(1.0f - this.f, 1.0f, fA2);
        int iA = (int) ((MathUtils.a(fC, BitmapDescriptorFactory.HUE_RED, 0.01f) * i2) / 0.01f);
        float fA3 = 1.0f - MathUtils.a(fC2, 0.99f, 1.0f);
        float f4 = this.b;
        int i4 = (int) ((fC * f4) + iA);
        int i5 = (int) ((fC2 * f4) - ((int) ((fA3 * i3) / 0.01f)));
        float f5 = (-f4) / 2.0f;
        if (i4 <= i5) {
            float f6 = this.d;
            float f7 = i4 + f6;
            float f8 = i5 - f6;
            float f9 = f6 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.c);
            if (f7 >= f8) {
                h(canvas, paint, new PointF(f7 + f5, BitmapDescriptorFactory.HUE_RED), new PointF(f8 + f5, BitmapDescriptorFactory.HUE_RED), f9, this.c);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f10 = f7 + f5;
            float f11 = f8 + f5;
            canvas.drawLine(f10, BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, paint);
            if (this.e || this.d <= BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f7 > BitmapDescriptorFactory.HUE_RED) {
                f3 = f9;
                h(canvas, paint, new PointF(f10, BitmapDescriptorFactory.HUE_RED), null, f3, this.c);
            } else {
                f3 = f9;
            }
            if (f8 < this.b) {
                h(canvas, paint, new PointF(f11, BitmapDescriptorFactory.HUE_RED), null, f3, this.c);
            }
        }
    }

    public final void h(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f, float f2) {
        float fMin = Math.min(f2, this.c);
        float f3 = f / 2.0f;
        float fMin2 = Math.min(f3, (this.d * fMin) / this.c);
        RectF rectF = new RectF((-f) / 2.0f, (-fMin) / 2.0f, f3, fMin / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }
}
