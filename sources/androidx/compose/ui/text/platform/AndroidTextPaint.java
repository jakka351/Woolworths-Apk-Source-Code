package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.text.TextPaint;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.style.TextDecoration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroid/text/TextPaint;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidTextPaint extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public AndroidPaint f2140a;
    public TextDecoration b;
    public int c;
    public Shadow d;
    public Color e;
    public Brush f;
    public State g;
    public Size h;
    public DrawStyle i;

    public final Paint a() {
        AndroidPaint androidPaint = this.f2140a;
        if (androidPaint != null) {
            return androidPaint;
        }
        AndroidPaint androidPaint2 = new AndroidPaint(this);
        this.f2140a = androidPaint2;
        return androidPaint2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        ((AndroidPaint) a()).j(i);
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final androidx.compose.ui.graphics.Brush r6, final long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.g = r0
            r5.f = r0
            r5.h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof androidx.compose.ui.graphics.SolidColor
            if (r1 == 0) goto L1d
            androidx.compose.ui.graphics.SolidColor r6 = (androidx.compose.ui.graphics.SolidColor) r6
            long r6 = r6.f1783a
            long r6 = androidx.compose.ui.text.style.TextDrawStyleKt.c(r6, r9)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof androidx.compose.ui.graphics.ShaderBrush
            if (r1 == 0) goto L72
            androidx.compose.ui.graphics.Brush r1 = r5.f
            boolean r1 = kotlin.jvm.internal.Intrinsics.c(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            androidx.compose.ui.geometry.Size r1 = r5.h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.f1754a
            boolean r1 = androidx.compose.ui.geometry.Size.a(r3, r7)
        L36:
            if (r1 != 0) goto L58
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L58
            r5.f = r6
            androidx.compose.ui.geometry.Size r1 = new androidx.compose.ui.geometry.Size
            r1.<init>(r7)
            r5.h = r1
            androidx.compose.ui.text.platform.AndroidTextPaint$setBrush$1 r1 = new androidx.compose.ui.text.platform.AndroidTextPaint$setBrush$1
            r1.<init>()
            androidx.compose.runtime.State r6 = androidx.compose.runtime.SnapshotStateKt.d(r1)
            r5.g = r6
        L58:
            androidx.compose.ui.graphics.Paint r6 = r5.a()
            androidx.compose.runtime.State r7 = r5.g
            if (r7 == 0) goto L67
            java.lang.Object r7 = r7.getD()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L68
        L67:
            r7 = r0
        L68:
            androidx.compose.ui.graphics.AndroidPaint r6 = (androidx.compose.ui.graphics.AndroidPaint) r6
            r6.g(r7)
            r5.e = r0
            androidx.compose.ui.text.platform.AndroidTextPaint_androidKt.a(r5, r9)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidTextPaint.c(androidx.compose.ui.graphics.Brush, long, float):void");
    }

    public final void d(long j) {
        Color color = this.e;
        if (color == null ? false : Color.c(color.f1766a, j)) {
            return;
        }
        if (j != 16) {
            this.e = new Color(j);
            setColor(ColorKt.j(j));
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
        }
    }

    public final void e(DrawStyle drawStyle) {
        if (drawStyle == null || Intrinsics.c(this.i, drawStyle)) {
            return;
        }
        this.i = drawStyle;
        if (drawStyle.equals(Fill.f1802a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (drawStyle instanceof Stroke) {
            ((AndroidPaint) a()).r(1);
            Stroke stroke = (Stroke) drawStyle;
            ((AndroidPaint) a()).q(stroke.f1803a);
            ((AndroidPaint) a()).p(stroke.b);
            ((AndroidPaint) a()).o(stroke.d);
            ((AndroidPaint) a()).n(stroke.c);
            ((AndroidPaint) a()).m(stroke.e);
        }
    }

    public final void f(Shadow shadow) {
        if (shadow == null || Intrinsics.c(this.d, shadow)) {
            return;
        }
        this.d = shadow;
        if (shadow.equals(Shadow.d)) {
            clearShadowLayer();
            return;
        }
        Shadow shadow2 = this.d;
        float f = shadow2.c;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (shadow2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), ColorKt.j(this.d.f1782a));
    }

    public final void g(TextDecoration textDecoration) {
        if (textDecoration == null || Intrinsics.c(this.b, textDecoration)) {
            return;
        }
        this.b = textDecoration;
        setUnderlineText(textDecoration.a(TextDecoration.c));
        setStrikeThruText(this.b.a(TextDecoration.d));
    }
}
