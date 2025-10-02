package androidx.compose.ui.text.platform.style;

import YU.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathEffect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/platform/style/CustomBulletSpan;", "Landroid/text/style/LeadingMarginSpan;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CustomBulletSpan implements LeadingMarginSpan {
    public final Shape d;
    public final float e;
    public final float f;
    public final Brush g;
    public final float h;
    public final DrawStyle i;
    public final Density j;
    public final int k;
    public final int l;

    public CustomBulletSpan(Shape shape, float f, float f2, float f3, Brush brush, float f4, DrawStyle drawStyle, Density density, float f5) {
        this.d = shape;
        this.e = f;
        this.f = f2;
        this.g = brush;
        this.h = f4;
        this.i = drawStyle;
        this.j = density;
        int iB = MathKt.b(f + f3);
        this.k = iB;
        this.l = MathKt.b(f5) - iB;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final Canvas canvas, final Paint paint, int i, final int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (canvas == null) {
            return;
        }
        final float f = (i3 + i5) / 2.0f;
        int i8 = i - this.k;
        if (i8 < 0) {
            i8 = 0;
        }
        final int i9 = i8;
        Intrinsics.f(charSequence, "null cannot be cast to non-null type android.text.Spanned");
        if (((Spanned) charSequence).getSpanStart(this) != i6 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        Fill fill = Fill.f1802a;
        DrawStyle drawStyle = this.i;
        Integer numValueOf = null;
        if (Intrinsics.c(drawStyle, fill)) {
            paint.setStyle(Paint.Style.FILL);
        } else if (drawStyle instanceof Stroke) {
            paint.setStyle(Paint.Style.STROKE);
            Stroke stroke = (Stroke) drawStyle;
            paint.setStrokeWidth(stroke.f1803a);
            paint.setStrokeMiter(stroke.b);
            int i10 = stroke.c;
            paint.setStrokeCap(i10 == 0 ? Paint.Cap.BUTT : i10 == 1 ? Paint.Cap.ROUND : i10 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            int i11 = stroke.d;
            paint.setStrokeJoin(i11 == 0 ? Paint.Join.MITER : i11 == 1 ? Paint.Join.ROUND : i11 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            PathEffect pathEffect = stroke.e;
            paint.setPathEffect(pathEffect != null ? ((AndroidPathEffect) pathEffect).f1762a : null);
        }
        final long jFloatToRawIntBits = (Float.floatToRawIntBits(this.e) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L);
        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.ui.text.platform.style.CustomBulletSpan$drawLeadingMargin$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CustomBulletSpan customBulletSpan = this.h;
                Shape shape = customBulletSpan.d;
                int i12 = i2;
                Outline outlineA = shape.a(jFloatToRawIntBits, i12 > 0 ? LayoutDirection.d : LayoutDirection.e, customBulletSpan.j);
                float f2 = i9;
                boolean z2 = outlineA instanceof Outline.Generic;
                Canvas canvas2 = canvas;
                Paint paint2 = paint;
                float f3 = f;
                if (z2) {
                    canvas2.save();
                    Path path = ((Outline.Generic) outlineA).f1774a;
                    Rect bounds = path.getBounds();
                    canvas2.translate(f2, f3 - ((bounds.d - bounds.b) / 2.0f));
                    if (!(path instanceof AndroidPath)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    canvas2.drawPath(((AndroidPath) path).f1761a, paint2);
                    canvas2.restore();
                } else if (outlineA instanceof Outline.Rounded) {
                    RoundRect roundRect = ((Outline.Rounded) outlineA).f1776a;
                    if (RoundRectKt.d(roundRect)) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.e >> 32));
                        canvas2.drawRoundRect(f2, f3 - (roundRect.a() / 2.0f), (roundRect.b() * i12) + f2, (roundRect.a() / 2.0f) + f3, fIntBitsToFloat, fIntBitsToFloat, paint2);
                    } else {
                        AndroidPath androidPathA = AndroidPath_androidKt.a();
                        Path.k(androidPathA, roundRect);
                        canvas2.save();
                        canvas2.translate(f2, f3 - (roundRect.a() / 2.0f));
                        canvas2.drawPath(androidPathA.f1761a, paint2);
                        canvas2.restore();
                    }
                } else if (outlineA instanceof Outline.Rectangle) {
                    Rect rect = ((Outline.Rectangle) outlineA).f1775a;
                    float f4 = (rect.d - rect.b) / 2.0f;
                    canvas2.drawRect(f2, f3 - f4, a.a(rect.c, rect.f1752a, i12, f2), f4 + f3, paint2);
                }
                return Unit.f24250a;
            }
        };
        Brush brush = this.g;
        float f2 = this.h;
        if (brush == null) {
            if (!Float.isNaN(f2)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f2 * 255.0f));
            }
            function0.invoke();
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
            }
        } else if (brush instanceof SolidColor) {
            int color = paint.getColor();
            if (!Float.isNaN(f2)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f2 * 255.0f));
            }
            paint.setColor(ColorKt.j(((SolidColor) brush).f1783a));
            function0.invoke();
            paint.setColor(color);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
            }
        } else if (brush instanceof ShaderBrush) {
            Shader shader = paint.getShader();
            if (!Float.isNaN(f2)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f2 * 255.0f));
            }
            paint.setShader(((ShaderBrush) brush).b(jFloatToRawIntBits));
            function0.invoke();
            paint.setShader(shader);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
            }
        }
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        int i = this.l;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }
}
