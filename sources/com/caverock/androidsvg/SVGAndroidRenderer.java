package com.caverock.androidsvg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.support.v4.media.session.a;
import android.util.Base64;
import android.util.Log;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* loaded from: classes4.dex */
class SVGAndroidRenderer {
    public static HashSet g;

    /* renamed from: a, reason: collision with root package name */
    public final Canvas f14017a;
    public SVG b;
    public RendererState c;
    public Stack d;
    public Stack e;
    public Stack f;

    /* renamed from: com.caverock.androidsvg.SVGAndroidRenderer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14018a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[SVG.Style.LineJoin.values().length];
            c = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SVG.Style.LineCap.values().length];
            b = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PreserveAspectRatio.Alignment.values().length];
            f14018a = iArr3;
            try {
                iArr3[2] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14018a[5] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14018a[8] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14018a[3] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14018a[6] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14018a[9] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14018a[4] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14018a[7] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public class MarkerPositionCalculator implements SVG.PathInterface {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f14019a;
        public float b;
        public float c;
        public MarkerVector d;
        public boolean e;
        public boolean f;
        public int g;
        public boolean h;

        public MarkerPositionCalculator(SVGAndroidRenderer sVGAndroidRenderer, SVG.PathDefinition pathDefinition) {
            ArrayList arrayList = new ArrayList();
            this.f14019a = arrayList;
            this.d = null;
            this.e = false;
            this.f = true;
            this.g = -1;
            if (pathDefinition == null) {
                return;
            }
            pathDefinition.h(this);
            if (this.h) {
                this.d.b((MarkerVector) arrayList.get(this.g));
                arrayList.set(this.g, this.d);
                this.h = false;
            }
            MarkerVector markerVector = this.d;
            if (markerVector != null) {
                arrayList.add(markerVector);
            }
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void a(float f, float f2) {
            boolean z = this.h;
            ArrayList arrayList = this.f14019a;
            if (z) {
                this.d.b((MarkerVector) arrayList.get(this.g));
                arrayList.set(this.g, this.d);
                this.h = false;
            }
            MarkerVector markerVector = this.d;
            if (markerVector != null) {
                arrayList.add(markerVector);
            }
            this.b = f;
            this.c = f2;
            this.d = new MarkerVector(f, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.g = arrayList.size();
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void b(float f, float f2) {
            this.d.a(f, f2);
            this.f14019a.add(this.d);
            MarkerVector markerVector = this.d;
            this.d = new MarkerVector(f, f2, f - markerVector.f14020a, f2 - markerVector.b);
            this.h = false;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.f || this.e) {
                this.d.a(f, f2);
                this.f14019a.add(this.d);
                this.e = false;
            }
            this.d = new MarkerVector(f5, f6, f5 - f3, f6 - f4);
            this.h = false;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void close() {
            this.f14019a.add(this.d);
            b(this.b, this.c);
            this.h = true;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void d(float f, float f2, float f3, float f4) {
            this.d.a(f, f2);
            this.f14019a.add(this.d);
            this.d = new MarkerVector(f3, f4, f3 - f, f4 - f2);
            this.h = false;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void e(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.e = true;
            this.f = false;
            MarkerVector markerVector = this.d;
            SVGAndroidRenderer.a(markerVector.f14020a, markerVector.b, f, f2, f3, z, z2, f4, f5, this);
            this.f = true;
            this.h = false;
        }
    }

    public class MarkerVector {

        /* renamed from: a, reason: collision with root package name */
        public final float f14020a;
        public final float b;
        public float c;
        public float d;
        public boolean e = false;

        public MarkerVector(float f, float f2, float f3, float f4) {
            this.c = BitmapDescriptorFactory.HUE_RED;
            this.d = BitmapDescriptorFactory.HUE_RED;
            this.f14020a = f;
            this.b = f2;
            double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
            if (dSqrt != 0.0d) {
                this.c = (float) (f3 / dSqrt);
                this.d = (float) (f4 / dSqrt);
            }
        }

        public final void a(float f, float f2) {
            float f3 = f - this.f14020a;
            float f4 = f2 - this.b;
            double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
            if (dSqrt != 0.0d) {
                f3 = (float) (f3 / dSqrt);
                f4 = (float) (f4 / dSqrt);
            }
            float f5 = this.c;
            if (f3 != (-f5) || f4 != (-this.d)) {
                this.c = f5 + f3;
                this.d += f4;
            } else {
                this.e = true;
                this.c = -f4;
                this.d = f3;
            }
        }

        public final void b(MarkerVector markerVector) {
            float f = markerVector.c;
            float f2 = this.c;
            if (f == (-f2)) {
                float f3 = markerVector.d;
                if (f3 == (-this.d)) {
                    this.e = true;
                    this.c = -f3;
                    this.d = markerVector.c;
                    return;
                }
            }
            this.c = f2 + f;
            this.d += markerVector.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(this.f14020a);
            sb.append(",");
            sb.append(this.b);
            sb.append(" ");
            sb.append(this.c);
            sb.append(",");
            return a.j(this.d, ")", sb);
        }
    }

    public class PathConverter implements SVG.PathInterface {

        /* renamed from: a, reason: collision with root package name */
        public final Path f14021a = new Path();
        public float b;
        public float c;

        public PathConverter(SVG.PathDefinition pathDefinition) {
            if (pathDefinition == null) {
                return;
            }
            pathDefinition.h(this);
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void a(float f, float f2) {
            this.f14021a.moveTo(f, f2);
            this.b = f;
            this.c = f2;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void b(float f, float f2) {
            this.f14021a.lineTo(f, f2);
            this.b = f;
            this.c = f2;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
            this.f14021a.cubicTo(f, f2, f3, f4, f5, f6);
            this.b = f5;
            this.c = f6;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void close() {
            this.f14021a.close();
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void d(float f, float f2, float f3, float f4) {
            this.f14021a.quadTo(f, f2, f3, f4);
            this.b = f3;
            this.c = f4;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void e(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            SVGAndroidRenderer.a(this.b, this.c, f, f2, f3, z, z2, f4, f5, this);
            this.b = f4;
            this.c = f5;
        }
    }

    public class PathTextDrawer extends PlainTextDrawer {
        public final Path d;

        public PathTextDrawer(Path path, float f) {
            super(f, BitmapDescriptorFactory.HUE_RED);
            this.d = path;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.PlainTextDrawer, com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public final void b(String str) {
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            if (sVGAndroidRenderer.W()) {
                RendererState rendererState = sVGAndroidRenderer.c;
                if (rendererState.b) {
                    sVGAndroidRenderer.f14017a.drawTextOnPath(str, this.d, this.f14022a, this.b, rendererState.d);
                }
                RendererState rendererState2 = sVGAndroidRenderer.c;
                if (rendererState2.c) {
                    sVGAndroidRenderer.f14017a.drawTextOnPath(str, this.d, this.f14022a, this.b, rendererState2.e);
                }
            }
            this.f14022a = sVGAndroidRenderer.c.d.measureText(str) + this.f14022a;
        }
    }

    public class PlainTextDrawer extends TextProcessor {

        /* renamed from: a, reason: collision with root package name */
        public float f14022a;
        public float b;

        public PlainTextDrawer(float f, float f2) {
            this.f14022a = f;
            this.b = f2;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public void b(String str) {
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            if (sVGAndroidRenderer.W()) {
                RendererState rendererState = sVGAndroidRenderer.c;
                if (rendererState.b) {
                    sVGAndroidRenderer.f14017a.drawText(str, this.f14022a, this.b, rendererState.d);
                }
                RendererState rendererState2 = sVGAndroidRenderer.c;
                if (rendererState2.c) {
                    sVGAndroidRenderer.f14017a.drawText(str, this.f14022a, this.b, rendererState2.e);
                }
            }
            this.f14022a = sVGAndroidRenderer.c.d.measureText(str) + this.f14022a;
        }
    }

    public class PlainTextToPath extends TextProcessor {

        /* renamed from: a, reason: collision with root package name */
        public float f14023a;
        public final float b;
        public final Path c;

        public PlainTextToPath(float f, float f2, Path path) {
            this.f14023a = f;
            this.b = f2;
            this.c = path;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public final boolean a(SVG.TextContainer textContainer) {
            if (!(textContainer instanceof SVG.TextPath)) {
                return true;
            }
            Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
            return false;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public final void b(String str) {
            String str2;
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            if (sVGAndroidRenderer.W()) {
                Path path = new Path();
                str2 = str;
                sVGAndroidRenderer.c.d.getTextPath(str2, 0, str.length(), this.f14023a, this.b, path);
                this.c.addPath(path);
            } else {
                str2 = str;
            }
            this.f14023a = sVGAndroidRenderer.c.d.measureText(str2) + this.f14023a;
        }
    }

    public class TextBoundsCalculator extends TextProcessor {

        /* renamed from: a, reason: collision with root package name */
        public float f14025a;
        public final float b;
        public final RectF c = new RectF();

        public TextBoundsCalculator(float f, float f2) {
            this.f14025a = f;
            this.b = f2;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public final boolean a(SVG.TextContainer textContainer) {
            if (!(textContainer instanceof SVG.TextPath)) {
                return true;
            }
            SVG.TextPath textPath = (SVG.TextPath) textContainer;
            SVG.SvgElementBase svgElementBaseI = textContainer.f14016a.i(textPath.n);
            if (svgElementBaseI == null) {
                SVGAndroidRenderer.o("TextPath path reference '%s' not found", textPath.n);
                return false;
            }
            SVG.Path path = (SVG.Path) svgElementBaseI;
            PathConverter pathConverter = new PathConverter(path.o);
            Matrix matrix = path.n;
            Path path2 = pathConverter.f14021a;
            if (matrix != null) {
                path2.transform(matrix);
            }
            RectF rectF = new RectF();
            path2.computeBounds(rectF, true);
            this.c.union(rectF);
            return false;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public final void b(String str) {
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            if (sVGAndroidRenderer.W()) {
                Rect rect = new Rect();
                sVGAndroidRenderer.c.d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f14025a, this.b);
                this.c.union(rectF);
            }
            this.f14025a = sVGAndroidRenderer.c.d.measureText(str) + this.f14025a;
        }
    }

    public abstract class TextProcessor {
        public boolean a(SVG.TextContainer textContainer) {
            return true;
        }

        public abstract void b(String str);
    }

    public class TextWidthCalculator extends TextProcessor {

        /* renamed from: a, reason: collision with root package name */
        public float f14026a = BitmapDescriptorFactory.HUE_RED;

        public TextWidthCalculator() {
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public final void b(String str) {
            this.f14026a = SVGAndroidRenderer.this.c.d.measureText(str) + this.f14026a;
        }
    }

    public SVGAndroidRenderer(Canvas canvas) {
        this.f14017a = canvas;
    }

    public static Path A(SVG.PolyLine polyLine) {
        Path path = new Path();
        float[] fArr = polyLine.o;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = polyLine.o;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (polyLine instanceof SVG.Polygon) {
            path.close();
        }
        if (polyLine.h == null) {
            polyLine.h = c(path);
        }
        return path;
    }

    public static void O(RendererState rendererState, boolean z, SVG.SvgPaint svgPaint) {
        int i;
        SVG.Style style = rendererState.f14024a;
        float fFloatValue = (z ? style.g : style.i).floatValue();
        if (svgPaint instanceof SVG.Colour) {
            i = ((SVG.Colour) svgPaint).d;
        } else if (!(svgPaint instanceof SVG.CurrentColor)) {
            return;
        } else {
            i = rendererState.f14024a.q.d;
        }
        int i2 = i(fFloatValue, i);
        if (z) {
            rendererState.d.setColor(i2);
        } else {
            rendererState.e.setColor(i2);
        }
    }

    public static void a(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, SVG.PathInterface pathInterface) {
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == BitmapDescriptorFactory.HUE_RED || f4 == BitmapDescriptorFactory.HUE_RED) {
            pathInterface.b(f6, f7);
            return;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        double radians = Math.toRadians(f5 % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d = (f - f6) / 2.0d;
        double d2 = (f2 - f7) / 2.0d;
        double d3 = (dSin * d2) + (dCos * d);
        double d4 = (dCos * d2) + ((-dSin) * d);
        double d5 = fAbs * fAbs;
        double d6 = fAbs2 * fAbs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double dSqrt = Math.sqrt(d9) * 1.00001d;
            fAbs = (float) (fAbs * dSqrt);
            fAbs2 = (float) (dSqrt * fAbs2);
            d5 = fAbs * fAbs;
            d6 = fAbs2 * fAbs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d14) * d10;
        double d15 = fAbs;
        double d16 = fAbs2;
        double d17 = ((d15 * d4) / d16) * dSqrt2;
        double d18 = dSqrt2 * (-((d16 * d3) / d15));
        double d19 = ((dCos * d17) - (dSin * d18)) + ((f + f6) / 2.0d);
        double d20 = (dCos * d18) + (dSin * d17) + ((f2 + f7) / 2.0d);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d22 * d22) + (d21 * d21);
        double dAcos = Math.acos(d21 / Math.sqrt(d25)) * (d22 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = ((d22 * d24) + (d21 * d23)) / Math.sqrt(((d24 * d24) + (d23 * d23)) * d25);
        double dAcos2 = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * (dSqrt3 < -1.0d ? 3.141592653589793d : dSqrt3 > 1.0d ? 0.0d : Math.acos(dSqrt3));
        if (!z2 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z2 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d26 = dAcos2 % 6.283185307179586d;
        double d27 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d26) * 2.0d) / 3.141592653589793d);
        double d28 = d26 / iCeil;
        double d29 = d28 / 2.0d;
        double dSin2 = (Math.sin(d29) * 1.3333333333333333d) / (Math.cos(d29) + 1.0d);
        int i = iCeil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iCeil) {
            double d30 = d27;
            double d31 = (i2 * d28) + d30;
            double dCos2 = Math.cos(d31);
            double dSin3 = Math.sin(d31);
            int i4 = i2;
            int i5 = i3;
            fArr[i5] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i3 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d32 = d31 + d28;
            double dCos3 = Math.cos(d32);
            double dSin4 = Math.sin(d32);
            fArr[i5 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i5 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i5 + 4] = (float) dCos3;
            i3 = i5 + 6;
            fArr[i5 + 5] = (float) dSin4;
            i2 = i4 + 1;
            d27 = d30;
            iCeil = iCeil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d19, (float) d20);
        matrix.mapPoints(fArr);
        fArr[i - 2] = f6;
        fArr[i - 1] = f7;
        for (int i6 = 0; i6 < i; i6 += 6) {
            pathInterface.c(fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3], fArr[i6 + 4], fArr[i6 + 5]);
        }
    }

    public static SVG.Box c(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.Box(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r6 != 9) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f A[PHI: r5
  0x007f: PHI (r5v2 float) = (r5v1 float), (r5v3 float) binds: [B:32:0x0071, B:35:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Matrix e(com.caverock.androidsvg.SVG.Box r9, com.caverock.androidsvg.SVG.Box r10, com.caverock.androidsvg.PreserveAspectRatio r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L8c
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = r11.f14008a
            if (r1 != 0) goto Ld
            goto L8c
        Ld:
            float r2 = r9.c
            float r3 = r10.c
            float r2 = r2 / r3
            float r3 = r9.d
            float r4 = r10.d
            float r3 = r3 / r4
            float r4 = r10.f14013a
            float r4 = -r4
            float r5 = r10.b
            float r5 = -r5
            com.caverock.androidsvg.PreserveAspectRatio r6 = com.caverock.androidsvg.PreserveAspectRatio.c
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L33
            float r10 = r9.f14013a
            float r9 = r9.b
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        L33:
            com.caverock.androidsvg.PreserveAspectRatio$Scale r11 = r11.b
            com.caverock.androidsvg.PreserveAspectRatio$Scale r6 = com.caverock.androidsvg.PreserveAspectRatio.Scale.e
            if (r11 != r6) goto L3e
            float r11 = java.lang.Math.max(r2, r3)
            goto L42
        L3e:
            float r11 = java.lang.Math.min(r2, r3)
        L42:
            float r2 = r9.c
            float r2 = r2 / r11
            float r3 = r9.d
            float r3 = r3 / r11
            int r6 = r1.ordinal()
            r7 = 2
            r8 = 1073741824(0x40000000, float:2.0)
            if (r6 == r7) goto L68
            r7 = 3
            if (r6 == r7) goto L63
            r7 = 5
            if (r6 == r7) goto L68
            r7 = 6
            if (r6 == r7) goto L63
            r7 = 8
            if (r6 == r7) goto L68
            r7 = 9
            if (r6 == r7) goto L63
            goto L6d
        L63:
            float r6 = r10.c
            float r6 = r6 - r2
        L66:
            float r4 = r4 - r6
            goto L6d
        L68:
            float r6 = r10.c
            float r6 = r6 - r2
            float r6 = r6 / r8
            goto L66
        L6d:
            int r1 = r1.ordinal()
            switch(r1) {
                case 4: goto L7a;
                case 5: goto L7a;
                case 6: goto L7a;
                case 7: goto L75;
                case 8: goto L75;
                case 9: goto L75;
                default: goto L74;
            }
        L74:
            goto L7f
        L75:
            float r10 = r10.d
            float r10 = r10 - r3
        L78:
            float r5 = r5 - r10
            goto L7f
        L7a:
            float r10 = r10.d
            float r10 = r10 - r3
            float r10 = r10 / r8
            goto L78
        L7f:
            float r10 = r9.f14013a
            float r9 = r9.b
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGAndroidRenderer.e(com.caverock.androidsvg.SVG$Box, com.caverock.androidsvg.SVG$Box, com.caverock.androidsvg.PreserveAspectRatio):android.graphics.Matrix");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface h(java.lang.String r5, java.lang.Integer r6, com.caverock.androidsvg.SVG.Style.FontStyle r7) {
        /*
            com.caverock.androidsvg.SVG$Style$FontStyle r0 = com.caverock.androidsvg.SVG.Style.FontStyle.e
            r1 = 0
            r2 = 1
            if (r7 != r0) goto L8
            r7 = r2
            goto L9
        L8:
            r7 = r1
        L9:
            int r6 = r6.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            r3 = 2
            r4 = 3
            if (r6 <= r0) goto L19
            if (r7 == 0) goto L17
            r6 = r4
            goto L1e
        L17:
            r6 = r2
            goto L1e
        L19:
            if (r7 == 0) goto L1d
            r6 = r3
            goto L1e
        L1d:
            r6 = r1
        L1e:
            r5.getClass()
            int r7 = r5.hashCode()
            r0 = -1
            switch(r7) {
                case -1536685117: goto L57;
                case -1431958525: goto L4c;
                case -1081737434: goto L41;
                case 109326717: goto L36;
                case 1126973893: goto L2b;
                default: goto L29;
            }
        L29:
            r1 = r0
            goto L60
        L2b:
            java.lang.String r7 = "cursive"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L34
            goto L29
        L34:
            r1 = 4
            goto L60
        L36:
            java.lang.String r7 = "serif"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L3f
            goto L29
        L3f:
            r1 = r4
            goto L60
        L41:
            java.lang.String r7 = "fantasy"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L4a
            goto L29
        L4a:
            r1 = r3
            goto L60
        L4c:
            java.lang.String r7 = "monospace"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L55
            goto L29
        L55:
            r1 = r2
            goto L60
        L57:
            java.lang.String r7 = "sans-serif"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L60
            goto L29
        L60:
            switch(r1) {
                case 0: goto L81;
                case 1: goto L7a;
                case 2: goto L73;
                case 3: goto L6c;
                case 4: goto L65;
                default: goto L63;
            }
        L63:
            r5 = 0
            return r5
        L65:
            android.graphics.Typeface r5 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            return r5
        L6c:
            android.graphics.Typeface r5 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            return r5
        L73:
            android.graphics.Typeface r5 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            return r5
        L7a:
            android.graphics.Typeface r5 = android.graphics.Typeface.MONOSPACE
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            return r5
        L81:
            android.graphics.Typeface r5 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGAndroidRenderer.h(java.lang.String, java.lang.Integer, com.caverock.androidsvg.SVG$Style$FontStyle):android.graphics.Typeface");
    }

    public static int i(float f, int i) {
        int i2 = 255;
        int iRound = Math.round(((i >> 24) & 255) * f);
        if (iRound < 0) {
            i2 = 0;
        } else if (iRound <= 255) {
            i2 = iRound;
        }
        return (i2 << 24) | (i & 16777215);
    }

    public static void o(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void q(SVG.GradientElement gradientElement, String str) {
        SVG.SvgElementBase svgElementBaseI = gradientElement.f14016a.i(str);
        if (svgElementBaseI == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(svgElementBaseI instanceof SVG.GradientElement)) {
            o("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (svgElementBaseI == gradientElement) {
            o("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        SVG.GradientElement gradientElement2 = (SVG.GradientElement) svgElementBaseI;
        if (gradientElement.i == null) {
            gradientElement.i = gradientElement2.i;
        }
        if (gradientElement.j == null) {
            gradientElement.j = gradientElement2.j;
        }
        if (gradientElement.k == null) {
            gradientElement.k = gradientElement2.k;
        }
        if (gradientElement.h.isEmpty()) {
            gradientElement.h = gradientElement2.h;
        }
        try {
            if (gradientElement instanceof SVG.SvgLinearGradient) {
                SVG.SvgLinearGradient svgLinearGradient = (SVG.SvgLinearGradient) gradientElement;
                SVG.SvgLinearGradient svgLinearGradient2 = (SVG.SvgLinearGradient) svgElementBaseI;
                if (svgLinearGradient.m == null) {
                    svgLinearGradient.m = svgLinearGradient2.m;
                }
                if (svgLinearGradient.n == null) {
                    svgLinearGradient.n = svgLinearGradient2.n;
                }
                if (svgLinearGradient.o == null) {
                    svgLinearGradient.o = svgLinearGradient2.o;
                }
                if (svgLinearGradient.p == null) {
                    svgLinearGradient.p = svgLinearGradient2.p;
                }
            } else {
                r((SVG.SvgRadialGradient) gradientElement, (SVG.SvgRadialGradient) svgElementBaseI);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = gradientElement2.l;
        if (str2 != null) {
            q(gradientElement, str2);
        }
    }

    public static void r(SVG.SvgRadialGradient svgRadialGradient, SVG.SvgRadialGradient svgRadialGradient2) {
        if (svgRadialGradient.m == null) {
            svgRadialGradient.m = svgRadialGradient2.m;
        }
        if (svgRadialGradient.n == null) {
            svgRadialGradient.n = svgRadialGradient2.n;
        }
        if (svgRadialGradient.o == null) {
            svgRadialGradient.o = svgRadialGradient2.o;
        }
        if (svgRadialGradient.p == null) {
            svgRadialGradient.p = svgRadialGradient2.p;
        }
        if (svgRadialGradient.q == null) {
            svgRadialGradient.q = svgRadialGradient2.q;
        }
    }

    public static void s(SVG.Pattern pattern, String str) {
        SVG.SvgElementBase svgElementBaseI = pattern.f14016a.i(str);
        if (svgElementBaseI == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(svgElementBaseI instanceof SVG.Pattern)) {
            o("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (svgElementBaseI == pattern) {
            o("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        SVG.Pattern pattern2 = (SVG.Pattern) svgElementBaseI;
        if (pattern.p == null) {
            pattern.p = pattern2.p;
        }
        if (pattern.q == null) {
            pattern.q = pattern2.q;
        }
        if (pattern.r == null) {
            pattern.r = pattern2.r;
        }
        if (pattern.s == null) {
            pattern.s = pattern2.s;
        }
        if (pattern.t == null) {
            pattern.t = pattern2.t;
        }
        if (pattern.u == null) {
            pattern.u = pattern2.u;
        }
        if (pattern.v == null) {
            pattern.v = pattern2.v;
        }
        if (pattern.i.isEmpty()) {
            pattern.i = pattern2.i;
        }
        if (pattern.o == null) {
            pattern.o = pattern2.o;
        }
        if (pattern.n == null) {
            pattern.n = pattern2.n;
        }
        String str2 = pattern2.w;
        if (str2 != null) {
            s(pattern, str2);
        }
    }

    public static boolean x(SVG.Style style, long j) {
        return (style.d & j) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Path B(com.caverock.androidsvg.SVG.Rect r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGAndroidRenderer.B(com.caverock.androidsvg.SVG$Rect):android.graphics.Path");
    }

    public final SVG.Box C(SVG.Length length, SVG.Length length2, SVG.Length length3, SVG.Length length4) {
        float fE = BitmapDescriptorFactory.HUE_RED;
        float fD = length != null ? length.d(this) : 0.0f;
        if (length2 != null) {
            fE = length2.e(this);
        }
        RendererState rendererState = this.c;
        SVG.Box box = rendererState.g;
        if (box == null) {
            box = rendererState.f;
        }
        return new SVG.Box(fD, fE, length3 != null ? length3.d(this) : box.c, length4 != null ? length4.e(this) : box.d);
    }

    public final Path D(SVG.SvgElement svgElement, boolean z) {
        Path pathB;
        Path pathB2;
        this.d.push(this.c);
        RendererState rendererState = new RendererState(this.c);
        this.c = rendererState;
        U(rendererState, svgElement);
        if (!k() || !W()) {
            this.c = (RendererState) this.d.pop();
            return null;
        }
        if (svgElement instanceof SVG.Use) {
            if (!z) {
                o("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            SVG.Use use = (SVG.Use) svgElement;
            SVG.SvgElementBase svgElementBaseI = svgElement.f14016a.i(use.o);
            if (svgElementBaseI == null) {
                o("Use reference '%s' not found", use.o);
                this.c = (RendererState) this.d.pop();
                return null;
            }
            if (!(svgElementBaseI instanceof SVG.SvgElement)) {
                this.c = (RendererState) this.d.pop();
                return null;
            }
            pathB = D((SVG.SvgElement) svgElementBaseI, false);
            if (pathB != null) {
                if (use.h == null) {
                    use.h = c(pathB);
                }
                Matrix matrix = use.n;
                if (matrix != null) {
                    pathB.transform(matrix);
                }
                if (this.c.f14024a.H != null && (pathB2 = b(svgElement, svgElement.h)) != null) {
                    pathB.op(pathB2, Path.Op.INTERSECT);
                }
                this.c = (RendererState) this.d.pop();
                return pathB;
            }
            return null;
        }
        if (svgElement instanceof SVG.GraphicsElement) {
            SVG.GraphicsElement graphicsElement = (SVG.GraphicsElement) svgElement;
            if (svgElement instanceof SVG.Path) {
                PathConverter pathConverter = new PathConverter(((SVG.Path) svgElement).o);
                SVG.Box box = svgElement.h;
                Path path = pathConverter.f14021a;
                if (box == null) {
                    svgElement.h = c(path);
                }
                pathB = path;
            } else {
                pathB = svgElement instanceof SVG.Rect ? B((SVG.Rect) svgElement) : svgElement instanceof SVG.Circle ? y((SVG.Circle) svgElement) : svgElement instanceof SVG.Ellipse ? z((SVG.Ellipse) svgElement) : svgElement instanceof SVG.PolyLine ? A((SVG.PolyLine) svgElement) : null;
            }
            if (pathB != null) {
                if (graphicsElement.h == null) {
                    graphicsElement.h = c(pathB);
                }
                Matrix matrix2 = graphicsElement.n;
                if (matrix2 != null) {
                    pathB.transform(matrix2);
                }
                pathB.setFillType(w());
            }
            return null;
        }
        if (!(svgElement instanceof SVG.Text)) {
            o("Invalid %s element found in clipPath definition", svgElement.m());
            return null;
        }
        SVG.Text text = (SVG.Text) svgElement;
        ArrayList arrayList = text.n;
        float fE = BitmapDescriptorFactory.HUE_RED;
        float fD = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((SVG.Length) text.n.get(0)).d(this);
        ArrayList arrayList2 = text.o;
        float fE2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((SVG.Length) text.o.get(0)).e(this);
        ArrayList arrayList3 = text.p;
        float fD2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((SVG.Length) text.p.get(0)).d(this);
        ArrayList arrayList4 = text.q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            fE = ((SVG.Length) text.q.get(0)).e(this);
        }
        if (this.c.f14024a.x != SVG.Style.TextAnchor.d) {
            float fD3 = d(text);
            if (this.c.f14024a.x == SVG.Style.TextAnchor.e) {
                fD3 /= 2.0f;
            }
            fD -= fD3;
        }
        if (text.h == null) {
            TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(fD, fE2);
            n(text, textBoundsCalculator);
            RectF rectF = textBoundsCalculator.c;
            text.h = new SVG.Box(rectF.left, rectF.top, rectF.width(), textBoundsCalculator.c.height());
        }
        Path path2 = new Path();
        n(text, new PlainTextToPath(fD + fD2, fE2 + fE, path2));
        Matrix matrix3 = text.r;
        if (matrix3 != null) {
            path2.transform(matrix3);
        }
        path2.setFillType(w());
        pathB = path2;
        if (this.c.f14024a.H != null) {
            pathB.op(pathB2, Path.Op.INTERSECT);
        }
        this.c = (RendererState) this.d.pop();
        return pathB;
    }

    public final void E(SVG.Box box) {
        if (this.c.f14024a.J != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            Canvas canvas = this.f14017a;
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2127f, 0.7151f, 0.0722f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED})));
            canvas.saveLayer(null, paint2, 31);
            SVG.Mask mask = (SVG.Mask) this.b.i(this.c.f14024a.J);
            M(mask, box);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            M(mask, box);
            canvas.restore();
            canvas.restore();
        }
        P();
    }

    public final boolean F() {
        SVG.SvgElementBase svgElementBaseI;
        int i = 0;
        if (this.c.f14024a.p.floatValue() >= 1.0f && this.c.f14024a.J == null) {
            return false;
        }
        int iFloatValue = (int) (this.c.f14024a.p.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i = 255;
            if (iFloatValue <= 255) {
                i = iFloatValue;
            }
        }
        this.f14017a.saveLayerAlpha(null, i, 31);
        this.d.push(this.c);
        RendererState rendererState = new RendererState(this.c);
        this.c = rendererState;
        String str = rendererState.f14024a.J;
        if (str != null && ((svgElementBaseI = this.b.i(str)) == null || !(svgElementBaseI instanceof SVG.Mask))) {
            o("Mask reference '%s' not found", this.c.f14024a.J);
            this.c.f14024a.J = null;
        }
        return true;
    }

    public final void G(SVG.Svg svg, SVG.Box box, SVG.Box box2, PreserveAspectRatio preserveAspectRatio) {
        if (box.c == BitmapDescriptorFactory.HUE_RED || box.d == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        if (preserveAspectRatio == null && (preserveAspectRatio = svg.n) == null) {
            preserveAspectRatio = PreserveAspectRatio.d;
        }
        U(this.c, svg);
        if (k()) {
            RendererState rendererState = this.c;
            rendererState.f = box;
            if (!rendererState.f14024a.y.booleanValue()) {
                SVG.Box box3 = this.c.f;
                N(box3.f14013a, box3.b, box3.c, box3.d);
            }
            f(svg, this.c.f);
            Canvas canvas = this.f14017a;
            if (box2 != null) {
                canvas.concat(e(this.c.f, box2, preserveAspectRatio));
                this.c.g = svg.o;
            } else {
                SVG.Box box4 = this.c.f;
                canvas.translate(box4.f14013a, box4.b);
            }
            boolean zF = F();
            V();
            I(svg, true);
            if (zF) {
                E(svg.h);
            }
            S(svg);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(SVG.SvgObject svgObject) {
        SVG.Length length;
        String str;
        int iIndexOf;
        Set setE;
        SVG.Length length2;
        Boolean bool;
        if (svgObject instanceof SVG.NotDirectlyRendered) {
            return;
        }
        Q();
        if ((svgObject instanceof SVG.SvgElementBase) && (bool = ((SVG.SvgElementBase) svgObject).d) != null) {
            this.c.h = bool.booleanValue();
        }
        if (svgObject instanceof SVG.Svg) {
            SVG.Svg svg = (SVG.Svg) svgObject;
            G(svg, C(svg.p, svg.q, svg.r, svg.s), svg.o, svg.n);
        } else {
            boolean z = svgObject instanceof SVG.Use;
            Bitmap bitmapDecodeByteArray = null;
            float fE = BitmapDescriptorFactory.HUE_RED;
            if (z) {
                SVG.Use use = (SVG.Use) svgObject;
                SVG.Unit unit = SVG.Unit.h;
                Canvas canvas = this.f14017a;
                SVG.Length length3 = use.r;
                if ((length3 == null || !length3.g()) && ((length2 = use.s) == null || !length2.g())) {
                    U(this.c, use);
                    if (k()) {
                        SVG.SvgObject svgObjectI = use.f14016a.i(use.o);
                        if (svgObjectI == null) {
                            o("Use reference '%s' not found", use.o);
                        } else {
                            Matrix matrix = use.n;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            SVG.Length length4 = use.p;
                            float fD = length4 != null ? length4.d(this) : 0.0f;
                            SVG.Length length5 = use.q;
                            canvas.translate(fD, length5 != null ? length5.e(this) : 0.0f);
                            f(use, use.h);
                            boolean zF = F();
                            this.e.push(use);
                            this.f.push(this.f14017a.getMatrix());
                            if (svgObjectI instanceof SVG.Svg) {
                                SVG.Svg svg2 = (SVG.Svg) svgObjectI;
                                SVG.Box boxC = C(null, null, use.r, use.s);
                                Q();
                                G(svg2, boxC, svg2.o, svg2.n);
                                P();
                            } else if (svgObjectI instanceof SVG.Symbol) {
                                SVG.Length length6 = use.r;
                                if (length6 == null) {
                                    length6 = new SVG.Length(100.0f, unit);
                                }
                                SVG.Length length7 = use.s;
                                if (length7 == null) {
                                    length7 = new SVG.Length(100.0f, unit);
                                }
                                SVG.Box boxC2 = C(null, null, length6, length7);
                                Q();
                                SVG.Symbol symbol = (SVG.Symbol) svgObjectI;
                                if (boxC2.c != BitmapDescriptorFactory.HUE_RED && boxC2.d != BitmapDescriptorFactory.HUE_RED) {
                                    PreserveAspectRatio preserveAspectRatio = symbol.n;
                                    if (preserveAspectRatio == null) {
                                        preserveAspectRatio = PreserveAspectRatio.d;
                                    }
                                    U(this.c, symbol);
                                    RendererState rendererState = this.c;
                                    rendererState.f = boxC2;
                                    if (!rendererState.f14024a.y.booleanValue()) {
                                        SVG.Box box = this.c.f;
                                        N(box.f14013a, box.b, box.c, box.d);
                                    }
                                    SVG.Box box2 = symbol.o;
                                    if (box2 != null) {
                                        canvas.concat(e(this.c.f, box2, preserveAspectRatio));
                                        this.c.g = symbol.o;
                                    } else {
                                        SVG.Box box3 = this.c.f;
                                        canvas.translate(box3.f14013a, box3.b);
                                    }
                                    boolean zF2 = F();
                                    I(symbol, true);
                                    if (zF2) {
                                        E(symbol.h);
                                    }
                                    S(symbol);
                                }
                                P();
                            } else {
                                H(svgObjectI);
                            }
                            this.e.pop();
                            this.f.pop();
                            if (zF) {
                                E(use.h);
                            }
                            S(use);
                        }
                    }
                }
            } else if (svgObject instanceof SVG.Switch) {
                SVG.Switch r14 = (SVG.Switch) svgObject;
                U(this.c, r14);
                if (k()) {
                    Matrix matrix2 = r14.n;
                    if (matrix2 != null) {
                        this.f14017a.concat(matrix2);
                    }
                    f(r14, r14.h);
                    boolean zF3 = F();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = r14.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        SVG.SvgObject svgObject2 = (SVG.SvgObject) it.next();
                        if (svgObject2 instanceof SVG.SvgConditional) {
                            SVG.SvgConditional svgConditional = (SVG.SvgConditional) svgObject2;
                            if (svgConditional.a() == null && ((setE = svgConditional.e()) == null || (!setE.isEmpty() && setE.contains(language)))) {
                                Set requiredFeatures = svgConditional.getRequiredFeatures();
                                if (requiredFeatures != null) {
                                    if (g == null) {
                                        synchronized (SVGAndroidRenderer.class) {
                                            HashSet hashSet = new HashSet();
                                            g = hashSet;
                                            hashSet.add("Structure");
                                            g.add("BasicStructure");
                                            g.add("ConditionalProcessing");
                                            g.add("Image");
                                            g.add("Style");
                                            g.add("ViewportAttribute");
                                            g.add("Shape");
                                            g.add("BasicText");
                                            g.add("PaintAttribute");
                                            g.add("BasicPaintAttribute");
                                            g.add("OpacityAttribute");
                                            g.add("BasicGraphicsAttribute");
                                            g.add("Marker");
                                            g.add("Gradient");
                                            g.add("Pattern");
                                            g.add("Clip");
                                            g.add("BasicClip");
                                            g.add("Mask");
                                            g.add("View");
                                        }
                                    }
                                    if (requiredFeatures.isEmpty() || !g.containsAll(requiredFeatures)) {
                                    }
                                }
                                Set setD = svgConditional.d();
                                if (setD == null) {
                                    Set setL = svgConditional.l();
                                    if (setL == null) {
                                        H(svgObject2);
                                        break;
                                    }
                                    setL.isEmpty();
                                } else {
                                    setD.isEmpty();
                                }
                            }
                        }
                    }
                    if (zF3) {
                        E(r14.h);
                    }
                    S(r14);
                }
            } else if (svgObject instanceof SVG.Group) {
                SVG.Group group = (SVG.Group) svgObject;
                U(this.c, group);
                if (k()) {
                    Matrix matrix3 = group.n;
                    if (matrix3 != null) {
                        this.f14017a.concat(matrix3);
                    }
                    f(group, group.h);
                    boolean zF4 = F();
                    I(group, true);
                    if (zF4) {
                        E(group.h);
                    }
                    S(group);
                }
            } else {
                if (svgObject instanceof SVG.Image) {
                    SVG.Image image = (SVG.Image) svgObject;
                    Canvas canvas2 = this.f14017a;
                    SVG.Length length8 = image.r;
                    if (length8 != null && !length8.g() && (length = image.s) != null && !length.g() && (str = image.o) != null) {
                        PreserveAspectRatio preserveAspectRatio2 = image.n;
                        if (preserveAspectRatio2 == null) {
                            preserveAspectRatio2 = PreserveAspectRatio.d;
                        }
                        if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                            try {
                                byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                            } catch (Exception e) {
                                Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e);
                            }
                        }
                        if (bitmapDecodeByteArray != null) {
                            SVG.Box box4 = new SVG.Box(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                            U(this.c, image);
                            if (k() && W()) {
                                Matrix matrix4 = image.t;
                                if (matrix4 != null) {
                                    canvas2.concat(matrix4);
                                }
                                SVG.Length length9 = image.p;
                                float fD2 = length9 != null ? length9.d(this) : 0.0f;
                                SVG.Length length10 = image.q;
                                float fE2 = length10 != null ? length10.e(this) : 0.0f;
                                float fD3 = image.r.d(this);
                                float fD4 = image.s.d(this);
                                RendererState rendererState2 = this.c;
                                rendererState2.f = new SVG.Box(fD2, fE2, fD3, fD4);
                                if (!rendererState2.f14024a.y.booleanValue()) {
                                    SVG.Box box5 = this.c.f;
                                    N(box5.f14013a, box5.b, box5.c, box5.d);
                                }
                                image.h = this.c.f;
                                S(image);
                                f(image, image.h);
                                boolean zF5 = F();
                                V();
                                canvas2.save();
                                canvas2.concat(e(this.c.f, box4, preserveAspectRatio2));
                                canvas2.drawBitmap(bitmapDecodeByteArray, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new Paint(this.c.f14024a.P != SVG.Style.RenderQuality.f ? 2 : 0));
                                canvas2.restore();
                                if (zF5) {
                                    E(image.h);
                                }
                            }
                        }
                    }
                } else if (svgObject instanceof SVG.Path) {
                    SVG.Path path = (SVG.Path) svgObject;
                    if (path.o != null) {
                        U(this.c, path);
                        if (k() && W()) {
                            RendererState rendererState3 = this.c;
                            if (rendererState3.c || rendererState3.b) {
                                Matrix matrix5 = path.n;
                                if (matrix5 != null) {
                                    this.f14017a.concat(matrix5);
                                }
                                Path path2 = new PathConverter(path.o).f14021a;
                                if (path.h == null) {
                                    path.h = c(path2);
                                }
                                S(path);
                                g(path);
                                f(path, path.h);
                                boolean zF6 = F();
                                RendererState rendererState4 = this.c;
                                if (rendererState4.b) {
                                    SVG.Style.FillRule fillRule = rendererState4.f14024a.f;
                                    path2.setFillType((fillRule == null || fillRule != SVG.Style.FillRule.e) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    l(path, path2);
                                }
                                if (this.c.c) {
                                    m(path2);
                                }
                                L(path);
                                if (zF6) {
                                    E(path.h);
                                }
                            }
                        }
                    }
                } else if (svgObject instanceof SVG.Rect) {
                    SVG.Rect rect = (SVG.Rect) svgObject;
                    SVG.Length length11 = rect.q;
                    if (length11 != null && rect.r != null && !length11.g() && !rect.r.g()) {
                        U(this.c, rect);
                        if (k() && W()) {
                            Matrix matrix6 = rect.n;
                            if (matrix6 != null) {
                                this.f14017a.concat(matrix6);
                            }
                            Path pathB = B(rect);
                            S(rect);
                            g(rect);
                            f(rect, rect.h);
                            boolean zF7 = F();
                            if (this.c.b) {
                                l(rect, pathB);
                            }
                            if (this.c.c) {
                                m(pathB);
                            }
                            if (zF7) {
                                E(rect.h);
                            }
                        }
                    }
                } else if (svgObject instanceof SVG.Circle) {
                    SVG.Circle circle = (SVG.Circle) svgObject;
                    SVG.Length length12 = circle.q;
                    if (length12 != null && !length12.g()) {
                        U(this.c, circle);
                        if (k() && W()) {
                            Matrix matrix7 = circle.n;
                            if (matrix7 != null) {
                                this.f14017a.concat(matrix7);
                            }
                            Path pathY = y(circle);
                            S(circle);
                            g(circle);
                            f(circle, circle.h);
                            boolean zF8 = F();
                            if (this.c.b) {
                                l(circle, pathY);
                            }
                            if (this.c.c) {
                                m(pathY);
                            }
                            if (zF8) {
                                E(circle.h);
                            }
                        }
                    }
                } else if (svgObject instanceof SVG.Ellipse) {
                    SVG.Ellipse ellipse = (SVG.Ellipse) svgObject;
                    SVG.Length length13 = ellipse.q;
                    if (length13 != null && ellipse.r != null && !length13.g() && !ellipse.r.g()) {
                        U(this.c, ellipse);
                        if (k() && W()) {
                            Matrix matrix8 = ellipse.n;
                            if (matrix8 != null) {
                                this.f14017a.concat(matrix8);
                            }
                            Path pathZ = z(ellipse);
                            S(ellipse);
                            g(ellipse);
                            f(ellipse, ellipse.h);
                            boolean zF9 = F();
                            if (this.c.b) {
                                l(ellipse, pathZ);
                            }
                            if (this.c.c) {
                                m(pathZ);
                            }
                            if (zF9) {
                                E(ellipse.h);
                            }
                        }
                    }
                } else if (svgObject instanceof SVG.Line) {
                    SVG.Line line = (SVG.Line) svgObject;
                    U(this.c, line);
                    if (k() && W() && this.c.c) {
                        Matrix matrix9 = line.n;
                        if (matrix9 != null) {
                            this.f14017a.concat(matrix9);
                        }
                        SVG.Length length14 = line.o;
                        float fD5 = length14 == null ? 0.0f : length14.d(this);
                        SVG.Length length15 = line.p;
                        float fE3 = length15 == null ? 0.0f : length15.e(this);
                        SVG.Length length16 = line.q;
                        float fD6 = length16 == null ? 0.0f : length16.d(this);
                        SVG.Length length17 = line.r;
                        if (length17 != null) {
                            fE = length17.e(this);
                        }
                        if (line.h == null) {
                            line.h = new SVG.Box(Math.min(fD5, fD6), Math.min(fE3, fE), Math.abs(fD6 - fD5), Math.abs(fE - fE3));
                        }
                        Path path3 = new Path();
                        path3.moveTo(fD5, fE3);
                        path3.lineTo(fD6, fE);
                        S(line);
                        g(line);
                        f(line, line.h);
                        boolean zF10 = F();
                        m(path3);
                        L(line);
                        if (zF10) {
                            E(line.h);
                        }
                    }
                } else if (svgObject instanceof SVG.Polygon) {
                    SVG.Polygon polygon = (SVG.Polygon) svgObject;
                    U(this.c, polygon);
                    if (k() && W()) {
                        RendererState rendererState5 = this.c;
                        if (rendererState5.c || rendererState5.b) {
                            Matrix matrix10 = polygon.n;
                            if (matrix10 != null) {
                                this.f14017a.concat(matrix10);
                            }
                            if (polygon.o.length >= 2) {
                                Path pathA = A(polygon);
                                S(polygon);
                                g(polygon);
                                f(polygon, polygon.h);
                                boolean zF11 = F();
                                if (this.c.b) {
                                    l(polygon, pathA);
                                }
                                if (this.c.c) {
                                    m(pathA);
                                }
                                L(polygon);
                                if (zF11) {
                                    E(polygon.h);
                                }
                            }
                        }
                    }
                } else if (svgObject instanceof SVG.PolyLine) {
                    SVG.PolyLine polyLine = (SVG.PolyLine) svgObject;
                    U(this.c, polyLine);
                    if (k() && W()) {
                        RendererState rendererState6 = this.c;
                        if (rendererState6.c || rendererState6.b) {
                            Matrix matrix11 = polyLine.n;
                            if (matrix11 != null) {
                                this.f14017a.concat(matrix11);
                            }
                            if (polyLine.o.length >= 2) {
                                Path pathA2 = A(polyLine);
                                S(polyLine);
                                SVG.Style.FillRule fillRule2 = this.c.f14024a.f;
                                pathA2.setFillType((fillRule2 == null || fillRule2 != SVG.Style.FillRule.e) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                g(polyLine);
                                f(polyLine, polyLine.h);
                                boolean zF12 = F();
                                if (this.c.b) {
                                    l(polyLine, pathA2);
                                }
                                if (this.c.c) {
                                    m(pathA2);
                                }
                                L(polyLine);
                                if (zF12) {
                                    E(polyLine.h);
                                }
                            }
                        }
                    }
                } else if (svgObject instanceof SVG.Text) {
                    SVG.Text text = (SVG.Text) svgObject;
                    U(this.c, text);
                    if (k()) {
                        Matrix matrix12 = text.r;
                        if (matrix12 != null) {
                            this.f14017a.concat(matrix12);
                        }
                        ArrayList arrayList = text.n;
                        float fD7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((SVG.Length) text.n.get(0)).d(this);
                        ArrayList arrayList2 = text.o;
                        float fE4 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((SVG.Length) text.o.get(0)).e(this);
                        ArrayList arrayList3 = text.p;
                        float fD8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((SVG.Length) text.p.get(0)).d(this);
                        ArrayList arrayList4 = text.q;
                        if (arrayList4 != null && arrayList4.size() != 0) {
                            fE = ((SVG.Length) text.q.get(0)).e(this);
                        }
                        SVG.Style.TextAnchor textAnchorV = v();
                        if (textAnchorV != SVG.Style.TextAnchor.d) {
                            float fD9 = d(text);
                            if (textAnchorV == SVG.Style.TextAnchor.e) {
                                fD9 /= 2.0f;
                            }
                            fD7 -= fD9;
                        }
                        if (text.h == null) {
                            TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(fD7, fE4);
                            n(text, textBoundsCalculator);
                            RectF rectF = textBoundsCalculator.c;
                            text.h = new SVG.Box(rectF.left, rectF.top, rectF.width(), textBoundsCalculator.c.height());
                        }
                        S(text);
                        g(text);
                        f(text, text.h);
                        boolean zF13 = F();
                        n(text, new PlainTextDrawer(fD7 + fD8, fE4 + fE));
                        if (zF13) {
                            E(text.h);
                        }
                    }
                }
            }
        }
        P();
    }

    public final void I(SVG.SvgConditionalContainer svgConditionalContainer, boolean z) {
        if (z) {
            this.e.push(svgConditionalContainer);
            this.f.push(this.f14017a.getMatrix());
        }
        Iterator it = svgConditionalContainer.i.iterator();
        while (it.hasNext()) {
            H((SVG.SvgObject) it.next());
        }
        if (z) {
            this.e.pop();
            this.f.pop();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(com.caverock.androidsvg.SVG r9, com.caverock.androidsvg.RenderOptions r10) {
        /*
            r8 = this;
            com.caverock.androidsvg.CSSParser$Ruleset r0 = r9.b
            r8.b = r9
            com.caverock.androidsvg.SVG$Svg r9 = r9.f14011a
            if (r9 != 0) goto L10
            java.lang.String r9 = "SVGAndroidRenderer"
            java.lang.String r10 = "Nothing to render. Document is empty."
            android.util.Log.w(r9, r10)
            return
        L10:
            com.caverock.androidsvg.SVG$Box r1 = r9.o
            com.caverock.androidsvg.PreserveAspectRatio r2 = r9.n
            com.caverock.androidsvg.CSSParser$Ruleset r3 = r10.f14010a
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L28
            java.util.ArrayList r3 = r3.f14003a
            if (r3 == 0) goto L23
            int r3 = r3.size()
            goto L24
        L23:
            r3 = r5
        L24:
            if (r3 <= 0) goto L28
            r3 = r4
            goto L29
        L28:
            r3 = r5
        L29:
            if (r3 == 0) goto L30
            com.caverock.androidsvg.CSSParser$Ruleset r3 = r10.f14010a
            r0.b(r3)
        L30:
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r3 = new com.caverock.androidsvg.SVGAndroidRenderer$RendererState
            r3.<init>()
            r8.c = r3
            java.util.Stack r3 = new java.util.Stack
            r3.<init>()
            r8.d = r3
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r3 = r8.c
            com.caverock.androidsvg.SVG$Style r6 = com.caverock.androidsvg.SVG.Style.a()
            r8.T(r3, r6)
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r3 = r8.c
            r6 = 0
            r3.f = r6
            r3.h = r5
            java.util.Stack r6 = r8.d
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r7 = new com.caverock.androidsvg.SVGAndroidRenderer$RendererState
            r7.<init>(r3)
            r6.push(r7)
            java.util.Stack r3 = new java.util.Stack
            r3.<init>()
            r8.f = r3
            java.util.Stack r3 = new java.util.Stack
            r3.<init>()
            r8.e = r3
            java.lang.Boolean r3 = r9.d
            if (r3 == 0) goto L72
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r6 = r8.c
            boolean r3 = r3.booleanValue()
            r6.h = r3
        L72:
            r8.Q()
            com.caverock.androidsvg.SVG$Box r3 = new com.caverock.androidsvg.SVG$Box
            com.caverock.androidsvg.SVG$Box r6 = r10.b
            r3.<init>(r6)
            com.caverock.androidsvg.SVG$Length r6 = r9.r
            if (r6 == 0) goto L88
            float r7 = r3.c
            float r6 = r6.b(r8, r7)
            r3.c = r6
        L88:
            com.caverock.androidsvg.SVG$Length r6 = r9.s
            if (r6 == 0) goto L94
            float r7 = r3.d
            float r6 = r6.b(r8, r7)
            r3.d = r6
        L94:
            r8.G(r9, r3, r1, r2)
            r8.P()
            com.caverock.androidsvg.CSSParser$Ruleset r9 = r10.f14010a
            if (r9 == 0) goto Lab
            java.util.ArrayList r9 = r9.f14003a
            if (r9 == 0) goto La7
            int r9 = r9.size()
            goto La8
        La7:
            r9 = r5
        La8:
            if (r9 <= 0) goto Lab
            goto Lac
        Lab:
            r4 = r5
        Lac:
            if (r4 == 0) goto Lcd
            java.util.ArrayList r9 = r0.f14003a
            if (r9 != 0) goto Lb3
            goto Lcd
        Lb3:
            java.util.Iterator r9 = r9.iterator()
        Lb7:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lcd
            java.lang.Object r10 = r9.next()
            com.caverock.androidsvg.CSSParser$Rule r10 = (com.caverock.androidsvg.CSSParser.Rule) r10
            com.caverock.androidsvg.CSSParser$Source r10 = r10.c
            com.caverock.androidsvg.CSSParser$Source r0 = com.caverock.androidsvg.CSSParser.Source.e
            if (r10 != r0) goto Lb7
            r9.remove()
            goto Lb7
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGAndroidRenderer.J(com.caverock.androidsvg.SVG, com.caverock.androidsvg.RenderOptions):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fd A[PHI: r1
  0x00fd: PHI (r1v1 float) = (r1v0 float), (r1v2 float) binds: [B:63:0x00f1, B:66:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K(com.caverock.androidsvg.SVG.Marker r13, com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector r14) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGAndroidRenderer.K(com.caverock.androidsvg.SVG$Marker, com.caverock.androidsvg.SVGAndroidRenderer$MarkerVector):void");
    }

    public final void L(SVG.GraphicsElement graphicsElement) {
        SVG.Marker marker;
        SVG.Marker marker2;
        SVG.Marker marker3;
        int i;
        float f;
        float f2;
        float f3;
        ArrayList arrayList;
        int size;
        SVG.Style style = this.c.f14024a;
        String str = style.A;
        if (str == null && style.B == null && style.C == null) {
            return;
        }
        if (str == null) {
            marker = null;
        } else {
            SVG.SvgElementBase svgElementBaseI = graphicsElement.f14016a.i(str);
            if (svgElementBaseI != null) {
                marker = (SVG.Marker) svgElementBaseI;
            } else {
                o("Marker reference '%s' not found", this.c.f14024a.A);
                marker = null;
            }
        }
        String str2 = this.c.f14024a.B;
        if (str2 == null) {
            marker2 = null;
        } else {
            SVG.SvgElementBase svgElementBaseI2 = graphicsElement.f14016a.i(str2);
            if (svgElementBaseI2 != null) {
                marker2 = (SVG.Marker) svgElementBaseI2;
            } else {
                o("Marker reference '%s' not found", this.c.f14024a.B);
                marker2 = null;
            }
        }
        String str3 = this.c.f14024a.C;
        if (str3 == null) {
            marker3 = null;
        } else {
            SVG.SvgElementBase svgElementBaseI3 = graphicsElement.f14016a.i(str3);
            if (svgElementBaseI3 != null) {
                marker3 = (SVG.Marker) svgElementBaseI3;
            } else {
                o("Marker reference '%s' not found", this.c.f14024a.C);
                marker3 = null;
            }
        }
        boolean z = graphicsElement instanceof SVG.Path;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            arrayList = new MarkerPositionCalculator(this, ((SVG.Path) graphicsElement).o).f14019a;
            f2 = 0.0f;
            i = 1;
        } else if (graphicsElement instanceof SVG.Line) {
            SVG.Line line = (SVG.Line) graphicsElement;
            SVG.Length length = line.o;
            float fD = length != null ? length.d(this) : 0.0f;
            SVG.Length length2 = line.p;
            float fE = length2 != null ? length2.e(this) : 0.0f;
            SVG.Length length3 = line.q;
            float fD2 = length3 != null ? length3.d(this) : 0.0f;
            SVG.Length length4 = line.r;
            float fE2 = length4 != null ? length4.e(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f5 = fD2 - fD;
            i = 1;
            float f6 = fE2 - fE;
            arrayList2.add(new MarkerVector(fD, fE, f5, f6));
            arrayList2.add(new MarkerVector(fD2, fE2, f5, f6));
            f2 = 0.0f;
            arrayList = arrayList2;
        } else {
            i = 1;
            SVG.PolyLine polyLine = (SVG.PolyLine) graphicsElement;
            int length5 = polyLine.o.length;
            if (length5 < 2) {
                arrayList = null;
                f2 = 0.0f;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = polyLine.o;
                MarkerVector markerVector = new MarkerVector(fArr[0], fArr[1], BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                int i2 = 2;
                float f7 = 0.0f;
                float f8 = 0.0f;
                while (true) {
                    f = markerVector.b;
                    f2 = f4;
                    f3 = markerVector.f14020a;
                    if (i2 >= length5) {
                        break;
                    }
                    float[] fArr2 = polyLine.o;
                    float f9 = fArr2[i2];
                    float f10 = fArr2[i2 + 1];
                    markerVector.a(f9, f10);
                    arrayList3.add(markerVector);
                    markerVector = new MarkerVector(f9, f10, f9 - f3, f10 - f);
                    i2 += 2;
                    f8 = f10;
                    f7 = f9;
                    f4 = f2;
                }
                if (polyLine instanceof SVG.Polygon) {
                    float[] fArr3 = polyLine.o;
                    float f11 = fArr3[0];
                    if (f7 != f11) {
                        float f12 = fArr3[1];
                        if (f8 != f12) {
                            markerVector.a(f11, f12);
                            arrayList3.add(markerVector);
                            MarkerVector markerVector2 = new MarkerVector(f11, f12, f11 - f3, f12 - f);
                            markerVector2.b((MarkerVector) arrayList3.get(0));
                            arrayList3.add(markerVector2);
                            arrayList3.set(0, markerVector2);
                        }
                    }
                } else {
                    arrayList3.add(markerVector);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        SVG.Style style2 = this.c.f14024a;
        style2.C = null;
        style2.B = null;
        style2.A = null;
        if (marker != null) {
            K(marker, (MarkerVector) arrayList.get(0));
        }
        if (marker2 != null && arrayList.size() > 2) {
            MarkerVector markerVector3 = (MarkerVector) arrayList.get(0);
            MarkerVector markerVector4 = (MarkerVector) arrayList.get(i);
            int i3 = 1;
            while (i3 < size - 1) {
                i3++;
                MarkerVector markerVector5 = (MarkerVector) arrayList.get(i3);
                if (markerVector4.e) {
                    float f13 = markerVector4.c;
                    float f14 = markerVector4.d;
                    float f15 = markerVector4.f14020a;
                    float f16 = f15 - markerVector3.f14020a;
                    float f17 = markerVector4.b;
                    float f18 = ((f17 - markerVector3.b) * f14) + (f16 * f13);
                    if (f18 == f2) {
                        f18 = ((markerVector5.f14020a - f15) * f13) + ((markerVector5.b - f17) * f14);
                    }
                    if (f18 <= f2 && (f18 != f2 || (f13 <= f2 && f14 < f2))) {
                        markerVector4.c = -f13;
                        markerVector4.d = -f14;
                    }
                }
                K(marker2, markerVector4);
                markerVector3 = markerVector4;
                markerVector4 = markerVector5;
            }
        }
        if (marker3 != null) {
            K(marker3, (MarkerVector) arrayList.get(size - 1));
        }
    }

    public final void M(SVG.Mask mask, SVG.Box box) {
        float fD;
        float fE;
        Boolean bool = mask.n;
        if (bool == null || !bool.booleanValue()) {
            SVG.Length length = mask.p;
            float fB = length != null ? length.b(this, 1.0f) : 1.2f;
            SVG.Length length2 = mask.q;
            float fB2 = length2 != null ? length2.b(this, 1.0f) : 1.2f;
            fD = fB * box.c;
            fE = fB2 * box.d;
        } else {
            SVG.Length length3 = mask.p;
            fD = length3 != null ? length3.d(this) : box.c;
            SVG.Length length4 = mask.q;
            fE = length4 != null ? length4.e(this) : box.d;
        }
        if (fD == BitmapDescriptorFactory.HUE_RED || fE == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        Q();
        RendererState rendererStateT = t(mask);
        this.c = rendererStateT;
        rendererStateT.f14024a.p = Float.valueOf(1.0f);
        boolean zF = F();
        Canvas canvas = this.f14017a;
        canvas.save();
        Boolean bool2 = mask.o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(box.f14013a, box.b);
            canvas.scale(box.c, box.d);
        }
        I(mask, false);
        canvas.restore();
        if (zF) {
            E(box);
        }
        P();
    }

    public final void N(float f, float f2, float f3, float f4) {
        float fD = f3 + f;
        float fE = f4 + f2;
        SVG.CSSClipRect cSSClipRect = this.c.f14024a.z;
        if (cSSClipRect != null) {
            f += cSSClipRect.d.d(this);
            f2 += this.c.f14024a.z.f14014a.e(this);
            fD -= this.c.f14024a.z.b.d(this);
            fE -= this.c.f14024a.z.c.e(this);
        }
        this.f14017a.clipRect(f, f2, fD, fE);
    }

    public final void P() {
        this.f14017a.restore();
        this.c = (RendererState) this.d.pop();
    }

    public final void Q() {
        this.f14017a.save();
        this.d.push(this.c);
        this.c = new RendererState(this.c);
    }

    public final String R(String str, boolean z, boolean z2) {
        if (this.c.h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    public final void S(SVG.SvgElement svgElement) {
        if (svgElement.b == null || svgElement.h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.f.peek()).invert(matrix)) {
            SVG.Box box = svgElement.h;
            float f = box.f14013a;
            float f2 = box.b;
            float fA = box.a();
            SVG.Box box2 = svgElement.h;
            float f3 = box2.b;
            float fA2 = box2.a();
            float fB = svgElement.h.b();
            SVG.Box box3 = svgElement.h;
            float[] fArr = {f, f2, fA, f3, fA2, fB, box3.f14013a, box3.b()};
            matrix.preConcat(this.f14017a.getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                float f6 = fArr[i];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            SVG.SvgElement svgElement2 = (SVG.SvgElement) this.e.peek();
            SVG.Box box4 = svgElement2.h;
            if (box4 == null) {
                float f8 = rectF.left;
                float f9 = rectF.top;
                svgElement2.h = new SVG.Box(f8, f9, rectF.right - f8, rectF.bottom - f9);
                return;
            }
            float f10 = rectF.left;
            float f11 = rectF.top;
            SVG.Box box5 = new SVG.Box(f10, f11, rectF.right - f10, rectF.bottom - f11);
            if (f10 < box4.f14013a) {
                box4.f14013a = f10;
            }
            if (f11 < box4.b) {
                box4.b = f11;
            }
            if (box5.a() > box4.a()) {
                box4.c = box5.a() - box4.f14013a;
            }
            if (box5.b() > box4.b()) {
                box4.d = box5.b() - box4.b;
            }
        }
    }

    public final void T(RendererState rendererState, SVG.Style style) {
        if (x(style, 4096L)) {
            rendererState.f14024a.q = style.q;
        }
        if (x(style, llqqqql.ccc00630063c0063)) {
            rendererState.f14024a.p = style.p;
        }
        boolean zX = x(style, 1L);
        SVG.Colour colour = SVG.Colour.f;
        if (zX) {
            rendererState.f14024a.e = style.e;
            SVG.SvgPaint svgPaint = style.e;
            rendererState.b = (svgPaint == null || svgPaint == colour) ? false : true;
        }
        if (x(style, 4L)) {
            rendererState.f14024a.g = style.g;
        }
        if (x(style, 6149L)) {
            O(rendererState, true, rendererState.f14024a.e);
        }
        if (x(style, 2L)) {
            rendererState.f14024a.f = style.f;
        }
        if (x(style, 8L)) {
            rendererState.f14024a.h = style.h;
            SVG.SvgPaint svgPaint2 = style.h;
            rendererState.c = (svgPaint2 == null || svgPaint2 == colour) ? false : true;
        }
        if (x(style, 16L)) {
            rendererState.f14024a.i = style.i;
        }
        if (x(style, 6168L)) {
            O(rendererState, false, rendererState.f14024a.h);
        }
        if (x(style, 34359738368L)) {
            rendererState.f14024a.O = style.O;
        }
        if (x(style, 32L)) {
            SVG.Style style2 = rendererState.f14024a;
            SVG.Length length = style.j;
            style2.j = length;
            rendererState.e.setStrokeWidth(length.a(this));
        }
        if (x(style, 64L)) {
            SVG.Style style3 = rendererState.f14024a;
            Paint paint = rendererState.e;
            style3.k = style.k;
            int iOrdinal = style.k.ordinal();
            if (iOrdinal == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (iOrdinal == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (iOrdinal == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (x(style, 128L)) {
            SVG.Style style4 = rendererState.f14024a;
            Paint paint2 = rendererState.e;
            style4.l = style.l;
            int iOrdinal2 = style.l.ordinal();
            if (iOrdinal2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (iOrdinal2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (iOrdinal2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (x(style, 256L)) {
            rendererState.f14024a.m = style.m;
            rendererState.e.setStrokeMiter(style.m.floatValue());
        }
        if (x(style, 512L)) {
            rendererState.f14024a.n = style.n;
        }
        if (x(style, llqqqql.c00630063c0063c0063)) {
            rendererState.f14024a.o = style.o;
        }
        Typeface typefaceH = null;
        if (x(style, 1536L)) {
            SVG.Style style5 = rendererState.f14024a;
            Paint paint3 = rendererState.e;
            SVG.Length[] lengthArr = style5.n;
            if (lengthArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length2 = lengthArr.length;
                int i = length2 % 2 == 0 ? length2 : length2 * 2;
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i2 = 0; i2 < i; i2++) {
                    float fA = style5.n[i2 % length2].a(this);
                    fArr[i2] = fA;
                    f += fA;
                }
                if (f == BitmapDescriptorFactory.HUE_RED) {
                    paint3.setPathEffect(null);
                } else {
                    float fA2 = style5.o.a(this);
                    if (fA2 < BitmapDescriptorFactory.HUE_RED) {
                        fA2 = (fA2 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fA2));
                }
            }
        }
        if (x(style, llqqqql.c0063006300630063c0063)) {
            float textSize = this.c.d.getTextSize();
            rendererState.f14024a.s = style.s;
            rendererState.d.setTextSize(style.s.b(this, textSize));
            rendererState.e.setTextSize(style.s.b(this, textSize));
        }
        if (x(style, 8192L)) {
            rendererState.f14024a.r = style.r;
        }
        if (x(style, llqqqql.ccccc00630063)) {
            if (style.t.intValue() == -1 && rendererState.f14024a.t.intValue() > 100) {
                SVG.Style style6 = rendererState.f14024a;
                style6.t = Integer.valueOf(style6.t.intValue() - 100);
            } else if (style.t.intValue() != 1 || rendererState.f14024a.t.intValue() >= 900) {
                rendererState.f14024a.t = style.t;
            } else {
                SVG.Style style7 = rendererState.f14024a;
                style7.t = Integer.valueOf(style7.t.intValue() + 100);
            }
        }
        if (x(style, llqqqql.c0063ccc00630063)) {
            rendererState.f14024a.u = style.u;
        }
        if (x(style, 106496L)) {
            SVG.Style style8 = rendererState.f14024a;
            ArrayList arrayList = style8.r;
            if (arrayList != null && this.b != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typefaceH = h((String) it.next(), style8.t, style8.u)) == null) {
                }
            }
            if (typefaceH == null) {
                typefaceH = h("serif", style8.t, style8.u);
            }
            rendererState.d.setTypeface(typefaceH);
            rendererState.e.setTypeface(typefaceH);
        }
        if (x(style, llqqqql.cc0063cc00630063)) {
            SVG.Style style9 = rendererState.f14024a;
            Paint paint4 = rendererState.e;
            Paint paint5 = rendererState.d;
            style9.v = style.v;
            SVG.Style.TextDecoration textDecoration = style.v;
            SVG.Style.TextDecoration textDecoration2 = SVG.Style.TextDecoration.g;
            paint5.setStrikeThruText(textDecoration == textDecoration2);
            SVG.Style.TextDecoration textDecoration3 = style.v;
            SVG.Style.TextDecoration textDecoration4 = SVG.Style.TextDecoration.e;
            paint5.setUnderlineText(textDecoration3 == textDecoration4);
            paint4.setStrikeThruText(style.v == textDecoration2);
            paint4.setUnderlineText(style.v == textDecoration4);
        }
        if (x(style, 68719476736L)) {
            rendererState.f14024a.w = style.w;
        }
        if (x(style, llqqqql.c00630063cc00630063)) {
            rendererState.f14024a.x = style.x;
        }
        if (x(style, 524288L)) {
            rendererState.f14024a.y = style.y;
        }
        if (x(style, llqqqql.cc00630063c00630063)) {
            rendererState.f14024a.A = style.A;
        }
        if (x(style, llqqqql.c006300630063c00630063)) {
            rendererState.f14024a.B = style.B;
        }
        if (x(style, llqqqql.cccc006300630063)) {
            rendererState.f14024a.C = style.C;
        }
        if (x(style, llqqqql.c0063cc006300630063)) {
            rendererState.f14024a.D = style.D;
        }
        if (x(style, llqqqql.cc0063c006300630063)) {
            rendererState.f14024a.E = style.E;
        }
        if (x(style, llqqqql.c0063c0063c00630063)) {
            rendererState.f14024a.z = style.z;
        }
        if (x(style, llqqqql.c0063c0063006300630063)) {
            rendererState.f14024a.H = style.H;
        }
        if (x(style, llqqqql.cc00630063006300630063)) {
            rendererState.f14024a.I = style.I;
        }
        if (x(style, llqqqql.a0061aaaaa)) {
            rendererState.f14024a.J = style.J;
        }
        if (x(style, llqqqql.c00630063c006300630063)) {
            rendererState.f14024a.F = style.F;
        }
        if (x(style, llqqqql.ccc0063006300630063)) {
            rendererState.f14024a.G = style.G;
        }
        if (x(style, 8589934592L)) {
            rendererState.f14024a.M = style.M;
        }
        if (x(style, 17179869184L)) {
            rendererState.f14024a.N = style.N;
        }
        if (x(style, 137438953472L)) {
            rendererState.f14024a.P = style.P;
        }
    }

    public final void U(RendererState rendererState, SVG.SvgElementBase svgElementBase) {
        boolean z = svgElementBase.b == null;
        SVG.Style style = rendererState.f14024a;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        style.D = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        style.y = bool;
        style.z = null;
        style.H = null;
        style.p = fValueOf;
        style.F = SVG.Colour.e;
        style.G = fValueOf;
        style.J = null;
        style.K = null;
        style.L = fValueOf;
        style.M = null;
        style.N = fValueOf;
        style.O = SVG.Style.VectorEffect.d;
        SVG.Style style2 = svgElementBase.e;
        if (style2 != null) {
            T(rendererState, style2);
        }
        ArrayList arrayList = this.b.b.f14003a;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.b.b.f14003a.iterator();
            while (it.hasNext()) {
                CSSParser.Rule rule = (CSSParser.Rule) it.next();
                if (CSSParser.g(rule.f14002a, svgElementBase)) {
                    T(rendererState, rule.b);
                }
            }
        }
        SVG.Style style3 = svgElementBase.f;
        if (style3 != null) {
            T(rendererState, style3);
        }
    }

    public final void V() {
        int i;
        SVG.Style style = this.c.f14024a;
        SVG.SvgPaint svgPaint = style.M;
        if (svgPaint instanceof SVG.Colour) {
            i = ((SVG.Colour) svgPaint).d;
        } else if (!(svgPaint instanceof SVG.CurrentColor)) {
            return;
        } else {
            i = style.q.d;
        }
        Float f = style.N;
        if (f != null) {
            i = i(f.floatValue(), i);
        }
        this.f14017a.drawColor(i);
    }

    public final boolean W() {
        Boolean bool = this.c.f14024a.E;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Path b(SVG.SvgElement svgElement, SVG.Box box) {
        Path pathD;
        SVG.SvgElementBase svgElementBaseI = svgElement.f14016a.i(this.c.f14024a.H);
        if (svgElementBaseI == null) {
            o("ClipPath reference '%s' not found", this.c.f14024a.H);
            return null;
        }
        SVG.ClipPath clipPath = (SVG.ClipPath) svgElementBaseI;
        this.d.push(this.c);
        this.c = t(clipPath);
        Boolean bool = clipPath.o;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(box.f14013a, box.b);
            matrix.preScale(box.c, box.d);
        }
        Matrix matrix2 = clipPath.n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (SVG.SvgObject svgObject : clipPath.i) {
            if ((svgObject instanceof SVG.SvgElement) && (pathD = D((SVG.SvgElement) svgObject, true)) != null) {
                path.op(pathD, Path.Op.UNION);
            }
        }
        if (this.c.f14024a.H != null) {
            if (clipPath.h == null) {
                clipPath.h = c(path);
            }
            Path pathB = b(clipPath, clipPath.h);
            if (pathB != null) {
                path.op(pathB, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.c = (RendererState) this.d.pop();
        return path;
    }

    public final float d(SVG.TextContainer textContainer) {
        TextWidthCalculator textWidthCalculator = new TextWidthCalculator();
        n(textContainer, textWidthCalculator);
        return textWidthCalculator.f14026a;
    }

    public final void f(SVG.SvgElement svgElement, SVG.Box box) {
        Path pathB;
        if (this.c.f14024a.H == null || (pathB = b(svgElement, box)) == null) {
            return;
        }
        this.f14017a.clipPath(pathB);
    }

    public final void g(SVG.SvgElement svgElement) {
        SVG.SvgPaint svgPaint = this.c.f14024a.e;
        if (svgPaint instanceof SVG.PaintReference) {
            j(true, svgElement.h, (SVG.PaintReference) svgPaint);
        }
        SVG.SvgPaint svgPaint2 = this.c.f14024a.h;
        if (svgPaint2 instanceof SVG.PaintReference) {
            j(false, svgElement.h, (SVG.PaintReference) svgPaint2);
        }
    }

    public final void j(boolean z, SVG.Box box, SVG.PaintReference paintReference) {
        float fB;
        float f;
        float fB2;
        float f2;
        float f3;
        float fB3;
        float f4;
        float fB4;
        float f5;
        SVG.SvgElementBase svgElementBaseI = this.b.i(paintReference.d);
        if (svgElementBaseI == null) {
            o("%s reference '%s' not found", z ? "Fill" : "Stroke", paintReference.d);
            SVG.SvgPaint svgPaint = paintReference.e;
            if (svgPaint != null) {
                O(this.c, z, svgPaint);
                return;
            } else if (z) {
                this.c.b = false;
                return;
            } else {
                this.c.c = false;
                return;
            }
        }
        boolean z2 = svgElementBaseI instanceof SVG.SvgLinearGradient;
        SVG.GradientSpread gradientSpread = SVG.GradientSpread.e;
        SVG.GradientSpread gradientSpread2 = SVG.GradientSpread.d;
        SVG.Colour colour = SVG.Colour.e;
        if (z2) {
            SVG.SvgLinearGradient svgLinearGradient = (SVG.SvgLinearGradient) svgElementBaseI;
            String str = svgLinearGradient.l;
            if (str != null) {
                q(svgLinearGradient, str);
            }
            Boolean bool = svgLinearGradient.i;
            boolean z3 = bool != null && bool.booleanValue();
            RendererState rendererState = this.c;
            Paint paint = z ? rendererState.d : rendererState.e;
            if (z3) {
                RendererState rendererState2 = this.c;
                f2 = 256.0f;
                SVG.Box box2 = rendererState2.g;
                if (box2 == null) {
                    box2 = rendererState2.f;
                }
                SVG.Length length = svgLinearGradient.m;
                float fD = length != null ? length.d(this) : BitmapDescriptorFactory.HUE_RED;
                SVG.Length length2 = svgLinearGradient.n;
                fB3 = length2 != null ? length2.e(this) : BitmapDescriptorFactory.HUE_RED;
                f3 = BitmapDescriptorFactory.HUE_RED;
                SVG.Length length3 = svgLinearGradient.o;
                float fD2 = length3 != null ? length3.d(this) : box2.c;
                SVG.Length length4 = svgLinearGradient.p;
                f5 = fD2;
                fB4 = length4 != null ? length4.e(this) : 0.0f;
                f4 = fD;
            } else {
                f2 = 256.0f;
                f3 = BitmapDescriptorFactory.HUE_RED;
                SVG.Length length5 = svgLinearGradient.m;
                float fB5 = length5 != null ? length5.b(this, 1.0f) : 0.0f;
                SVG.Length length6 = svgLinearGradient.n;
                fB3 = length6 != null ? length6.b(this, 1.0f) : 0.0f;
                SVG.Length length7 = svgLinearGradient.o;
                float fB6 = length7 != null ? length7.b(this, 1.0f) : 1.0f;
                SVG.Length length8 = svgLinearGradient.p;
                f4 = fB5;
                fB4 = length8 != null ? length8.b(this, 1.0f) : 0.0f;
                f5 = fB6;
            }
            float f6 = fB3;
            Q();
            this.c = t(svgLinearGradient);
            Matrix matrix = new Matrix();
            if (!z3) {
                matrix.preTranslate(box.f14013a, box.b);
                matrix.preScale(box.c, box.d);
            }
            Matrix matrix2 = svgLinearGradient.j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = svgLinearGradient.h.size();
            if (size == 0) {
                P();
                if (z) {
                    this.c.b = false;
                    return;
                } else {
                    this.c.c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = svgLinearGradient.h.iterator();
            int i = 0;
            float f7 = -1.0f;
            while (it.hasNext()) {
                SVG.Stop stop = (SVG.Stop) ((SVG.SvgObject) it.next());
                Float f8 = stop.h;
                float fFloatValue = f8 != null ? f8.floatValue() : f3;
                if (i == 0 || fFloatValue >= f7) {
                    fArr[i] = fFloatValue;
                    f7 = fFloatValue;
                } else {
                    fArr[i] = f7;
                }
                Q();
                U(this.c, stop);
                SVG.Style style = this.c.f14024a;
                SVG.Colour colour2 = (SVG.Colour) style.F;
                if (colour2 == null) {
                    colour2 = colour;
                }
                iArr[i] = i(style.G.floatValue(), colour2.d);
                i++;
                P();
            }
            if ((f4 == f5 && f6 == fB4) || size == 1) {
                P();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            SVG.GradientSpread gradientSpread3 = svgLinearGradient.k;
            if (gradientSpread3 != null) {
                if (gradientSpread3 == gradientSpread2) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (gradientSpread3 == gradientSpread) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            P();
            LinearGradient linearGradient = new LinearGradient(f4, f6, f5, fB4, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (this.c.f14024a.g.floatValue() * f2);
            paint.setAlpha(iFloatValue < 0 ? 0 : iFloatValue > 255 ? 255 : iFloatValue);
            return;
        }
        if (!(svgElementBaseI instanceof SVG.SvgRadialGradient)) {
            if (svgElementBaseI instanceof SVG.SolidColor) {
                SVG.SolidColor solidColor = (SVG.SolidColor) svgElementBaseI;
                if (z) {
                    if (x(solidColor.e, llqqqql.aa0061aaaa)) {
                        RendererState rendererState3 = this.c;
                        SVG.Style style2 = rendererState3.f14024a;
                        SVG.SvgPaint svgPaint2 = solidColor.e.K;
                        style2.e = svgPaint2;
                        rendererState3.b = svgPaint2 != null;
                    }
                    if (x(solidColor.e, llqqqql.a00610061aaaa)) {
                        this.c.f14024a.g = solidColor.e.L;
                    }
                    if (x(solidColor.e, 6442450944L)) {
                        RendererState rendererState4 = this.c;
                        O(rendererState4, z, rendererState4.f14024a.e);
                        return;
                    }
                    return;
                }
                if (x(solidColor.e, llqqqql.aa0061aaaa)) {
                    RendererState rendererState5 = this.c;
                    SVG.Style style3 = rendererState5.f14024a;
                    SVG.SvgPaint svgPaint3 = solidColor.e.K;
                    style3.h = svgPaint3;
                    rendererState5.c = svgPaint3 != null;
                }
                if (x(solidColor.e, llqqqql.a00610061aaaa)) {
                    this.c.f14024a.i = solidColor.e.L;
                }
                if (x(solidColor.e, 6442450944L)) {
                    RendererState rendererState6 = this.c;
                    O(rendererState6, z, rendererState6.f14024a.h);
                    return;
                }
                return;
            }
            return;
        }
        SVG.SvgRadialGradient svgRadialGradient = (SVG.SvgRadialGradient) svgElementBaseI;
        String str2 = svgRadialGradient.l;
        if (str2 != null) {
            q(svgRadialGradient, str2);
        }
        Boolean bool2 = svgRadialGradient.i;
        boolean z4 = bool2 != null && bool2.booleanValue();
        RendererState rendererState7 = this.c;
        Paint paint2 = z ? rendererState7.d : rendererState7.e;
        if (z4) {
            SVG.Length length9 = new SVG.Length(50.0f, SVG.Unit.h);
            SVG.Length length10 = svgRadialGradient.m;
            float fD3 = length10 != null ? length10.d(this) : length9.d(this);
            SVG.Length length11 = svgRadialGradient.n;
            fB = length11 != null ? length11.e(this) : length9.e(this);
            SVG.Length length12 = svgRadialGradient.o;
            fB2 = length12 != null ? length12.a(this) : length9.a(this);
            f = fD3;
        } else {
            SVG.Length length13 = svgRadialGradient.m;
            float fB7 = length13 != null ? length13.b(this, 1.0f) : 0.5f;
            SVG.Length length14 = svgRadialGradient.n;
            fB = length14 != null ? length14.b(this, 1.0f) : 0.5f;
            SVG.Length length15 = svgRadialGradient.o;
            f = fB7;
            fB2 = length15 != null ? length15.b(this, 1.0f) : 0.5f;
        }
        float f9 = fB;
        Q();
        this.c = t(svgRadialGradient);
        Matrix matrix3 = new Matrix();
        if (!z4) {
            matrix3.preTranslate(box.f14013a, box.b);
            matrix3.preScale(box.c, box.d);
        }
        Matrix matrix4 = svgRadialGradient.j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = svgRadialGradient.h.size();
        if (size2 == 0) {
            P();
            if (z) {
                this.c.b = false;
                return;
            } else {
                this.c.c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = svgRadialGradient.h.iterator();
        int i2 = 0;
        float f10 = -1.0f;
        while (it2.hasNext()) {
            SVG.Stop stop2 = (SVG.Stop) ((SVG.SvgObject) it2.next());
            Float f11 = stop2.h;
            float fFloatValue2 = f11 != null ? f11.floatValue() : 0.0f;
            if (i2 == 0 || fFloatValue2 >= f10) {
                fArr2[i2] = fFloatValue2;
                f10 = fFloatValue2;
            } else {
                fArr2[i2] = f10;
            }
            Q();
            U(this.c, stop2);
            SVG.Style style4 = this.c.f14024a;
            SVG.Colour colour3 = (SVG.Colour) style4.F;
            if (colour3 == null) {
                colour3 = colour;
            }
            iArr2[i2] = i(style4.G.floatValue(), colour3.d);
            i2++;
            P();
        }
        if (fB2 == BitmapDescriptorFactory.HUE_RED || size2 == 1) {
            P();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        SVG.GradientSpread gradientSpread4 = svgRadialGradient.k;
        if (gradientSpread4 != null) {
            if (gradientSpread4 == gradientSpread2) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (gradientSpread4 == gradientSpread) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        P();
        RadialGradient radialGradient = new RadialGradient(f, f9, fB2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (this.c.f14024a.g.floatValue() * 256.0f);
        if (iFloatValue2 < 0) {
            iFloatValue2 = 0;
        } else if (iFloatValue2 > 255) {
            iFloatValue2 = 255;
        }
        paint2.setAlpha(iFloatValue2);
    }

    public final boolean k() {
        Boolean bool = this.c.f14024a.D;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(com.caverock.androidsvg.SVG.SvgElement r23, android.graphics.Path r24) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGAndroidRenderer.l(com.caverock.androidsvg.SVG$SvgElement, android.graphics.Path):void");
    }

    public final void m(Path path) {
        RendererState rendererState = this.c;
        SVG.Style.VectorEffect vectorEffect = rendererState.f14024a.O;
        SVG.Style.VectorEffect vectorEffect2 = SVG.Style.VectorEffect.e;
        Canvas canvas = this.f14017a;
        if (vectorEffect != vectorEffect2) {
            canvas.drawPath(path, rendererState.e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = this.c.e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, this.c.e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final void n(SVG.TextContainer textContainer, TextProcessor textProcessor) {
        float f;
        float fE;
        float fD;
        SVG.Style.TextAnchor textAnchorV;
        if (k()) {
            Iterator it = textContainer.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                SVG.SvgObject svgObject = (SVG.SvgObject) it.next();
                if (svgObject instanceof SVG.TextSequence) {
                    textProcessor.b(R(((SVG.TextSequence) svgObject).c, z, !it.hasNext()));
                } else if (textProcessor.a((SVG.TextContainer) svgObject)) {
                    boolean z2 = svgObject instanceof SVG.TextPath;
                    SVG.Style.TextAnchor textAnchor = SVG.Style.TextAnchor.e;
                    SVG.Style.TextAnchor textAnchor2 = SVG.Style.TextAnchor.d;
                    float fE2 = BitmapDescriptorFactory.HUE_RED;
                    if (z2) {
                        Q();
                        SVG.TextPath textPath = (SVG.TextPath) svgObject;
                        U(this.c, textPath);
                        if (k() && W()) {
                            SVG.SvgElementBase svgElementBaseI = textPath.f14016a.i(textPath.n);
                            if (svgElementBaseI == null) {
                                o("TextPath reference '%s' not found", textPath.n);
                            } else {
                                SVG.Path path = (SVG.Path) svgElementBaseI;
                                PathConverter pathConverter = new PathConverter(path.o);
                                Matrix matrix = path.n;
                                Path path2 = pathConverter.f14021a;
                                if (matrix != null) {
                                    path2.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path2, false);
                                SVG.Length length = textPath.o;
                                if (length != null) {
                                    fE2 = length.b(this, pathMeasure.getLength());
                                }
                                SVG.Style.TextAnchor textAnchorV2 = v();
                                if (textAnchorV2 != textAnchor2) {
                                    float fD2 = d(textPath);
                                    if (textAnchorV2 == textAnchor) {
                                        fD2 /= 2.0f;
                                    }
                                    fE2 -= fD2;
                                }
                                g((SVG.SvgElement) textPath.p);
                                boolean zF = F();
                                n(textPath, new PathTextDrawer(path2, fE2));
                                if (zF) {
                                    E(textPath.h);
                                }
                            }
                        }
                        P();
                    } else if (svgObject instanceof SVG.TSpan) {
                        Q();
                        SVG.TSpan tSpan = (SVG.TSpan) svgObject;
                        U(this.c, tSpan);
                        if (k()) {
                            ArrayList arrayList = tSpan.n;
                            boolean z3 = arrayList != null && arrayList.size() > 0;
                            boolean z4 = textProcessor instanceof PlainTextDrawer;
                            if (z4) {
                                float fD3 = !z3 ? ((PlainTextDrawer) textProcessor).f14022a : ((SVG.Length) tSpan.n.get(0)).d(this);
                                ArrayList arrayList2 = tSpan.o;
                                fE = (arrayList2 == null || arrayList2.size() == 0) ? ((PlainTextDrawer) textProcessor).b : ((SVG.Length) tSpan.o.get(0)).e(this);
                                ArrayList arrayList3 = tSpan.p;
                                fD = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((SVG.Length) tSpan.p.get(0)).d(this);
                                ArrayList arrayList4 = tSpan.q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fE2 = ((SVG.Length) tSpan.q.get(0)).e(this);
                                }
                                float f2 = fD3;
                                f = fE2;
                                fE2 = f2;
                            } else {
                                f = 0.0f;
                                fE = 0.0f;
                                fD = 0.0f;
                            }
                            if (z3 && (textAnchorV = v()) != textAnchor2) {
                                float fD4 = d(tSpan);
                                if (textAnchorV == textAnchor) {
                                    fD4 /= 2.0f;
                                }
                                fE2 -= fD4;
                            }
                            g((SVG.SvgElement) tSpan.r);
                            if (z4) {
                                PlainTextDrawer plainTextDrawer = (PlainTextDrawer) textProcessor;
                                plainTextDrawer.f14022a = fE2 + fD;
                                plainTextDrawer.b = fE + f;
                            }
                            boolean zF2 = F();
                            n(tSpan, textProcessor);
                            if (zF2) {
                                E(tSpan.h);
                            }
                        }
                        P();
                    } else if (svgObject instanceof SVG.TRef) {
                        Q();
                        SVG.TRef tRef = (SVG.TRef) svgObject;
                        U(this.c, tRef);
                        if (k()) {
                            g((SVG.SvgElement) tRef.o);
                            SVG.SvgElementBase svgElementBaseI2 = svgObject.f14016a.i(tRef.n);
                            if (svgElementBaseI2 == null || !(svgElementBaseI2 instanceof SVG.TextContainer)) {
                                o("Tref reference '%s' not found", tRef.n);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                p((SVG.TextContainer) svgElementBaseI2, sb);
                                if (sb.length() > 0) {
                                    textProcessor.b(sb.toString());
                                }
                            }
                        }
                        P();
                    }
                }
                z = false;
            }
        }
    }

    public final void p(SVG.TextContainer textContainer, StringBuilder sb) {
        Iterator it = textContainer.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            SVG.SvgObject svgObject = (SVG.SvgObject) it.next();
            if (svgObject instanceof SVG.TextContainer) {
                p((SVG.TextContainer) svgObject, sb);
            } else if (svgObject instanceof SVG.TextSequence) {
                sb.append(R(((SVG.TextSequence) svgObject).c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public final RendererState t(SVG.SvgElementBase svgElementBase) {
        RendererState rendererState = new RendererState();
        T(rendererState, SVG.Style.a());
        u(svgElementBase, rendererState);
        return rendererState;
    }

    public final void u(SVG.SvgObject svgObject, RendererState rendererState) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (svgObject instanceof SVG.SvgElementBase) {
                arrayList.add(0, (SVG.SvgElementBase) svgObject);
            }
            Object obj = svgObject.b;
            if (obj == null) {
                break;
            } else {
                svgObject = (SVG.SvgObject) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            U(rendererState, (SVG.SvgElementBase) it.next());
        }
        RendererState rendererState2 = this.c;
        rendererState.g = rendererState2.g;
        rendererState.f = rendererState2.f;
    }

    public final SVG.Style.TextAnchor v() {
        SVG.Style.TextAnchor textAnchor;
        SVG.Style style = this.c.f14024a;
        if (style.w == SVG.Style.TextDirection.d || (textAnchor = style.x) == SVG.Style.TextAnchor.e) {
            return style.x;
        }
        SVG.Style.TextAnchor textAnchor2 = SVG.Style.TextAnchor.d;
        return textAnchor == textAnchor2 ? SVG.Style.TextAnchor.f : textAnchor2;
    }

    public final Path.FillType w() {
        SVG.Style.FillRule fillRule = this.c.f14024a.I;
        return (fillRule == null || fillRule != SVG.Style.FillRule.e) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final Path y(SVG.Circle circle) {
        SVG.Length length = circle.o;
        float fE = BitmapDescriptorFactory.HUE_RED;
        float fD = length != null ? length.d(this) : 0.0f;
        SVG.Length length2 = circle.p;
        if (length2 != null) {
            fE = length2.e(this);
        }
        float f = fE;
        float fA = circle.q.a(this);
        float f2 = fD - fA;
        float f3 = f - fA;
        float f4 = fD + fA;
        float f5 = f + fA;
        if (circle.h == null) {
            float f6 = 2.0f * fA;
            circle.h = new SVG.Box(f2, f3, f6, f6);
        }
        float f7 = fA * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f3);
        float f8 = fD + f7;
        float f9 = f - f7;
        path.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f + f7;
        path.cubicTo(f4, f10, f8, f5, fD, f5);
        float f11 = fD - f7;
        path.cubicTo(f11, f5, f2, f10, f2, f);
        path.cubicTo(f2, f9, f11, f3, fD, f3);
        path.close();
        return path;
    }

    public final Path z(SVG.Ellipse ellipse) {
        SVG.Length length = ellipse.o;
        float fE = BitmapDescriptorFactory.HUE_RED;
        float fD = length != null ? length.d(this) : 0.0f;
        SVG.Length length2 = ellipse.p;
        if (length2 != null) {
            fE = length2.e(this);
        }
        float f = fE;
        float fD2 = ellipse.q.d(this);
        float fE2 = ellipse.r.e(this);
        float f2 = fD - fD2;
        float f3 = f - fE2;
        float f4 = fD + fD2;
        float f5 = f + fE2;
        if (ellipse.h == null) {
            ellipse.h = new SVG.Box(f2, f3, fD2 * 2.0f, 2.0f * fE2);
        }
        float f6 = fD2 * 0.5522848f;
        float f7 = fE2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f3);
        float f8 = fD + f6;
        float f9 = f - f7;
        path.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f + f7;
        path.cubicTo(f4, f10, f8, f5, fD, f5);
        float f11 = fD - f6;
        path.cubicTo(f11, f5, f2, f10, f2, f);
        path.cubicTo(f2, f9, f11, f3, fD, f3);
        path.close();
        return path;
    }

    public class RendererState {

        /* renamed from: a, reason: collision with root package name */
        public final SVG.Style f14024a;
        public boolean b;
        public boolean c;
        public final Paint d;
        public final Paint e;
        public SVG.Box f;
        public SVG.Box g;
        public boolean h;

        public RendererState() {
            Paint paint = new Paint();
            this.d = paint;
            paint.setFlags(193);
            paint.setHinting(0);
            paint.setStyle(Paint.Style.FILL);
            Typeface typeface = Typeface.DEFAULT;
            paint.setTypeface(typeface);
            Paint paint2 = new Paint();
            this.e = paint2;
            paint2.setFlags(193);
            paint2.setHinting(0);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setTypeface(typeface);
            this.f14024a = SVG.Style.a();
        }

        public RendererState(RendererState rendererState) {
            this.b = rendererState.b;
            this.c = rendererState.c;
            this.d = new Paint(rendererState.d);
            this.e = new Paint(rendererState.e);
            SVG.Box box = rendererState.f;
            if (box != null) {
                this.f = new SVG.Box(box);
            }
            SVG.Box box2 = rendererState.g;
            if (box2 != null) {
                this.g = new SVG.Box(box2);
            }
            this.h = rendererState.h;
            try {
                this.f14024a = (SVG.Style) rendererState.f14024a.clone();
            } catch (CloneNotSupportedException e) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
                this.f14024a = SVG.Style.a();
            }
        }
    }
}
