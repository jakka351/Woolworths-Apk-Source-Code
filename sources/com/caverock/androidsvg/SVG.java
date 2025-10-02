package com.caverock.androidsvg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.SVGAndroidRenderer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.salesforce.marketingcloud.config.a;
import com.scandit.datacapture.core.source.CameraSettings;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes4.dex */
public class SVG {

    /* renamed from: a, reason: collision with root package name */
    public Svg f14011a;
    public CSSParser.Ruleset b;
    public HashMap c;

    /* renamed from: com.caverock.androidsvg.SVG$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14012a;

        static {
            int[] iArr = new int[Unit.values().length];
            f14012a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14012a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14012a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14012a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14012a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14012a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14012a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14012a[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14012a[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static class CSSClipRect {

        /* renamed from: a, reason: collision with root package name */
        public Length f14014a;
        public Length b;
        public Length c;
        public Length d;
    }

    public static class Circle extends GraphicsElement {
        public Length o;
        public Length p;
        public Length q;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "circle";
        }
    }

    public static class ClipPath extends Group implements NotDirectlyRendered {
        public Boolean o;

        @Override // com.caverock.androidsvg.SVG.Group, com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "clipPath";
        }
    }

    public static class Colour extends SvgPaint {
        public static final Colour e = new Colour(-16777216);
        public static final Colour f = new Colour(0);
        public final int d;

        public Colour(int i) {
            this.d = i;
        }

        public final String toString() {
            return String.format("#%08x", Integer.valueOf(this.d));
        }
    }

    public static class CurrentColor extends SvgPaint {
        public static final CurrentColor d = new CurrentColor();
    }

    public static class Defs extends Group implements NotDirectlyRendered {
        @Override // com.caverock.androidsvg.SVG.Group, com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "defs";
        }
    }

    public static class Ellipse extends GraphicsElement {
        public Length o;
        public Length p;
        public Length q;
        public Length r;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "ellipse";
        }
    }

    public static abstract class GradientElement extends SvgElementBase implements SvgContainer {
        public List h = new ArrayList();
        public Boolean i;
        public Matrix j;
        public GradientSpread k;
        public String l;

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final List getChildren() {
            return this.h;
        }

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final void h(SvgObject svgObject) throws SVGParseException {
            if (svgObject instanceof Stop) {
                this.h.add(svgObject);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + svgObject + " elements.");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class GradientSpread {
        public static final GradientSpread d;
        public static final GradientSpread e;
        public static final /* synthetic */ GradientSpread[] f;

        /* JADX INFO: Fake field, exist only in values array */
        GradientSpread EF0;

        static {
            GradientSpread gradientSpread = new GradientSpread("pad", 0);
            GradientSpread gradientSpread2 = new GradientSpread("reflect", 1);
            d = gradientSpread2;
            GradientSpread gradientSpread3 = new GradientSpread("repeat", 2);
            e = gradientSpread3;
            f = new GradientSpread[]{gradientSpread, gradientSpread2, gradientSpread3};
        }

        public static GradientSpread valueOf(String str) {
            return (GradientSpread) Enum.valueOf(GradientSpread.class, str);
        }

        public static GradientSpread[] values() {
            return (GradientSpread[]) f.clone();
        }
    }

    public static abstract class GraphicsElement extends SvgConditionalElement implements HasTransform {
        public Matrix n;

        public GraphicsElement() {
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
        }

        @Override // com.caverock.androidsvg.SVG.HasTransform
        public final void k(Matrix matrix) {
            this.n = matrix;
        }
    }

    public static class Group extends SvgConditionalContainer implements HasTransform {
        public Matrix n;

        @Override // com.caverock.androidsvg.SVG.HasTransform
        public final void k(Matrix matrix) {
            this.n = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public String m() {
            return "group";
        }
    }

    public interface HasTransform {
        void k(Matrix matrix);
    }

    public static class Image extends SvgPreserveAspectRatioContainer implements HasTransform {
        public String o;
        public Length p;
        public Length q;
        public Length r;
        public Length s;
        public Matrix t;

        @Override // com.caverock.androidsvg.SVG.HasTransform
        public final void k(Matrix matrix) {
            this.t = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "image";
        }
    }

    public static class Line extends GraphicsElement {
        public Length o;
        public Length p;
        public Length q;
        public Length r;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "line";
        }
    }

    public static class Marker extends SvgViewBoxContainer implements NotDirectlyRendered {
        public boolean p;
        public Length q;
        public Length r;
        public Length s;
        public Length t;
        public Float u;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "marker";
        }
    }

    public static class Mask extends SvgConditionalContainer implements NotDirectlyRendered {
        public Boolean n;
        public Boolean o;
        public Length p;
        public Length q;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "mask";
        }
    }

    public interface NotDirectlyRendered {
    }

    public static class PaintReference extends SvgPaint {
        public final String d;
        public final SvgPaint e;

        public PaintReference(String str, SvgPaint svgPaint) {
            this.d = str;
            this.e = svgPaint;
        }

        public final String toString() {
            return this.d + " " + this.e;
        }
    }

    public static class Path extends GraphicsElement {
        public PathDefinition o;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return a.j;
        }
    }

    public static class PathDefinition implements PathInterface {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f14015a;
        public int b;
        public float[] c;
        public int d;

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void a(float f, float f2) {
            f((byte) 0);
            g(2);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            this.d = i + 2;
            fArr[i2] = f2;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void b(float f, float f2) {
            f((byte) 1);
            g(2);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            this.d = i + 2;
            fArr[i2] = f2;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
            f((byte) 2);
            g(6);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.d = i5;
            fArr[i4] = f4;
            int i6 = i + 5;
            this.d = i6;
            fArr[i5] = f5;
            this.d = i + 6;
            fArr[i6] = f6;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void close() {
            f((byte) 8);
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void d(float f, float f2, float f3, float f4) {
            f((byte) 3);
            g(4);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            this.d = i + 4;
            fArr[i4] = f4;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void e(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            f((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
            g(5);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.d = i5;
            fArr[i4] = f4;
            this.d = i + 5;
            fArr[i5] = f5;
        }

        public final void f(byte b) {
            int i = this.b;
            byte[] bArr = this.f14015a;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f14015a = bArr2;
            }
            byte[] bArr3 = this.f14015a;
            int i2 = this.b;
            this.b = i2 + 1;
            bArr3[i2] = b;
        }

        public final void g(int i) {
            float[] fArr = this.c;
            if (fArr.length < this.d + i) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.c = fArr2;
            }
        }

        public final void h(PathInterface pathInterface) {
            int i = 0;
            for (int i2 = 0; i2 < this.b; i2++) {
                byte b = this.f14015a[i2];
                if (b == 0) {
                    float[] fArr = this.c;
                    int i3 = i + 1;
                    float f = fArr[i];
                    i += 2;
                    pathInterface.a(f, fArr[i3]);
                } else if (b == 1) {
                    float[] fArr2 = this.c;
                    int i4 = i + 1;
                    float f2 = fArr2[i];
                    i += 2;
                    pathInterface.b(f2, fArr2[i4]);
                } else if (b == 2) {
                    float[] fArr3 = this.c;
                    pathInterface.c(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                    i += 6;
                } else if (b == 3) {
                    float[] fArr4 = this.c;
                    float f3 = fArr4[i];
                    float f4 = fArr4[i + 1];
                    int i5 = i + 3;
                    float f5 = fArr4[i + 2];
                    i += 4;
                    pathInterface.d(f3, f4, f5, fArr4[i5]);
                } else if (b != 8) {
                    boolean z = (b & 2) != 0;
                    boolean z2 = (b & 1) != 0;
                    float[] fArr5 = this.c;
                    pathInterface.e(fArr5[i], fArr5[i + 1], fArr5[i + 2], z, z2, fArr5[i + 3], fArr5[i + 4]);
                    i += 5;
                } else {
                    pathInterface.close();
                }
            }
        }
    }

    public interface PathInterface {
        void a(float f, float f2);

        void b(float f, float f2);

        void c(float f, float f2, float f3, float f4, float f5, float f6);

        void close();

        void d(float f, float f2, float f3, float f4);

        void e(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);
    }

    public static class Pattern extends SvgViewBoxContainer implements NotDirectlyRendered {
        public Boolean p;
        public Boolean q;
        public Matrix r;
        public Length s;
        public Length t;
        public Length u;
        public Length v;
        public String w;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "pattern";
        }
    }

    public static class PolyLine extends GraphicsElement {
        public float[] o;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public String m() {
            return "polyline";
        }
    }

    public static class Polygon extends PolyLine {
        @Override // com.caverock.androidsvg.SVG.PolyLine, com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "polygon";
        }
    }

    public static class Rect extends GraphicsElement {
        public Length o;
        public Length p;
        public Length q;
        public Length r;
        public Length s;
        public Length t;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "rect";
        }
    }

    public static class SolidColor extends SvgElementBase implements SvgContainer {
        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final List getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final void h(SvgObject svgObject) {
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "solidColor";
        }
    }

    public static class Stop extends SvgElementBase implements SvgContainer {
        public Float h;

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final List getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final void h(SvgObject svgObject) {
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "stop";
        }
    }

    public static class Style implements Cloneable {
        public String A;
        public String B;
        public String C;
        public Boolean D;
        public Boolean E;
        public SvgPaint F;
        public Float G;
        public String H;
        public FillRule I;
        public String J;
        public SvgPaint K;
        public Float L;
        public SvgPaint M;
        public Float N;
        public VectorEffect O;
        public RenderQuality P;
        public long d = 0;
        public SvgPaint e;
        public FillRule f;
        public Float g;
        public SvgPaint h;
        public Float i;
        public Length j;
        public LineCap k;
        public LineJoin l;
        public Float m;
        public Length[] n;
        public Length o;
        public Float p;
        public Colour q;
        public ArrayList r;
        public Length s;
        public Integer t;
        public FontStyle u;
        public TextDecoration v;
        public TextDirection w;
        public TextAnchor x;
        public Boolean y;
        public CSSClipRect z;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class FillRule {
            public static final FillRule d;
            public static final FillRule e;
            public static final /* synthetic */ FillRule[] f;

            static {
                FillRule fillRule = new FillRule("NonZero", 0);
                d = fillRule;
                FillRule fillRule2 = new FillRule("EvenOdd", 1);
                e = fillRule2;
                f = new FillRule[]{fillRule, fillRule2};
            }

            public static FillRule valueOf(String str) {
                return (FillRule) Enum.valueOf(FillRule.class, str);
            }

            public static FillRule[] values() {
                return (FillRule[]) f.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class FontStyle {
            public static final FontStyle d;
            public static final FontStyle e;
            public static final FontStyle f;
            public static final /* synthetic */ FontStyle[] g;

            static {
                FontStyle fontStyle = new FontStyle("Normal", 0);
                d = fontStyle;
                FontStyle fontStyle2 = new FontStyle("Italic", 1);
                e = fontStyle2;
                FontStyle fontStyle3 = new FontStyle("Oblique", 2);
                f = fontStyle3;
                g = new FontStyle[]{fontStyle, fontStyle2, fontStyle3};
            }

            public static FontStyle valueOf(String str) {
                return (FontStyle) Enum.valueOf(FontStyle.class, str);
            }

            public static FontStyle[] values() {
                return (FontStyle[]) g.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class LineCap {
            public static final LineCap d;
            public static final LineCap e;
            public static final LineCap f;
            public static final /* synthetic */ LineCap[] g;

            static {
                LineCap lineCap = new LineCap("Butt", 0);
                d = lineCap;
                LineCap lineCap2 = new LineCap("Round", 1);
                e = lineCap2;
                LineCap lineCap3 = new LineCap("Square", 2);
                f = lineCap3;
                g = new LineCap[]{lineCap, lineCap2, lineCap3};
            }

            public static LineCap valueOf(String str) {
                return (LineCap) Enum.valueOf(LineCap.class, str);
            }

            public static LineCap[] values() {
                return (LineCap[]) g.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class LineJoin {
            public static final LineJoin d;
            public static final LineJoin e;
            public static final LineJoin f;
            public static final /* synthetic */ LineJoin[] g;

            static {
                LineJoin lineJoin = new LineJoin("Miter", 0);
                d = lineJoin;
                LineJoin lineJoin2 = new LineJoin("Round", 1);
                e = lineJoin2;
                LineJoin lineJoin3 = new LineJoin("Bevel", 2);
                f = lineJoin3;
                g = new LineJoin[]{lineJoin, lineJoin2, lineJoin3};
            }

            public static LineJoin valueOf(String str) {
                return (LineJoin) Enum.valueOf(LineJoin.class, str);
            }

            public static LineJoin[] values() {
                return (LineJoin[]) g.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class RenderQuality {
            public static final RenderQuality d;
            public static final RenderQuality e;
            public static final RenderQuality f;
            public static final /* synthetic */ RenderQuality[] g;

            static {
                RenderQuality renderQuality = new RenderQuality(CameraSettings.FOCUS_STRATEGY_AUTO, 0);
                d = renderQuality;
                RenderQuality renderQuality2 = new RenderQuality("optimizeQuality", 1);
                e = renderQuality2;
                RenderQuality renderQuality3 = new RenderQuality("optimizeSpeed", 2);
                f = renderQuality3;
                g = new RenderQuality[]{renderQuality, renderQuality2, renderQuality3};
            }

            public static RenderQuality valueOf(String str) {
                return (RenderQuality) Enum.valueOf(RenderQuality.class, str);
            }

            public static RenderQuality[] values() {
                return (RenderQuality[]) g.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class TextAnchor {
            public static final TextAnchor d;
            public static final TextAnchor e;
            public static final TextAnchor f;
            public static final /* synthetic */ TextAnchor[] g;

            static {
                TextAnchor textAnchor = new TextAnchor("Start", 0);
                d = textAnchor;
                TextAnchor textAnchor2 = new TextAnchor("Middle", 1);
                e = textAnchor2;
                TextAnchor textAnchor3 = new TextAnchor("End", 2);
                f = textAnchor3;
                g = new TextAnchor[]{textAnchor, textAnchor2, textAnchor3};
            }

            public static TextAnchor valueOf(String str) {
                return (TextAnchor) Enum.valueOf(TextAnchor.class, str);
            }

            public static TextAnchor[] values() {
                return (TextAnchor[]) g.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class TextDecoration {
            public static final TextDecoration d;
            public static final TextDecoration e;
            public static final TextDecoration f;
            public static final TextDecoration g;
            public static final TextDecoration h;
            public static final /* synthetic */ TextDecoration[] i;

            static {
                TextDecoration textDecoration = new TextDecoration("None", 0);
                d = textDecoration;
                TextDecoration textDecoration2 = new TextDecoration("Underline", 1);
                e = textDecoration2;
                TextDecoration textDecoration3 = new TextDecoration("Overline", 2);
                f = textDecoration3;
                TextDecoration textDecoration4 = new TextDecoration("LineThrough", 3);
                g = textDecoration4;
                TextDecoration textDecoration5 = new TextDecoration("Blink", 4);
                h = textDecoration5;
                i = new TextDecoration[]{textDecoration, textDecoration2, textDecoration3, textDecoration4, textDecoration5};
            }

            public static TextDecoration valueOf(String str) {
                return (TextDecoration) Enum.valueOf(TextDecoration.class, str);
            }

            public static TextDecoration[] values() {
                return (TextDecoration[]) i.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class TextDirection {
            public static final TextDirection d;
            public static final TextDirection e;
            public static final /* synthetic */ TextDirection[] f;

            static {
                TextDirection textDirection = new TextDirection("LTR", 0);
                d = textDirection;
                TextDirection textDirection2 = new TextDirection("RTL", 1);
                e = textDirection2;
                f = new TextDirection[]{textDirection, textDirection2};
            }

            public static TextDirection valueOf(String str) {
                return (TextDirection) Enum.valueOf(TextDirection.class, str);
            }

            public static TextDirection[] values() {
                return (TextDirection[]) f.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class VectorEffect {
            public static final VectorEffect d;
            public static final VectorEffect e;
            public static final /* synthetic */ VectorEffect[] f;

            static {
                VectorEffect vectorEffect = new VectorEffect("None", 0);
                d = vectorEffect;
                VectorEffect vectorEffect2 = new VectorEffect("NonScalingStroke", 1);
                e = vectorEffect2;
                f = new VectorEffect[]{vectorEffect, vectorEffect2};
            }

            public static VectorEffect valueOf(String str) {
                return (VectorEffect) Enum.valueOf(VectorEffect.class, str);
            }

            public static VectorEffect[] values() {
                return (VectorEffect[]) f.clone();
            }
        }

        public static Style a() {
            Style style = new Style();
            style.d = -1L;
            Colour colour = Colour.e;
            style.e = colour;
            FillRule fillRule = FillRule.d;
            style.f = fillRule;
            Float fValueOf = Float.valueOf(1.0f);
            style.g = fValueOf;
            style.h = null;
            style.i = fValueOf;
            style.j = new Length(1.0f);
            style.k = LineCap.d;
            style.l = LineJoin.d;
            style.m = Float.valueOf(4.0f);
            style.n = null;
            style.o = new Length(BitmapDescriptorFactory.HUE_RED);
            style.p = fValueOf;
            style.q = colour;
            style.r = null;
            style.s = new Length(12.0f, Unit.g);
            style.t = 400;
            style.u = FontStyle.d;
            style.v = TextDecoration.d;
            style.w = TextDirection.d;
            style.x = TextAnchor.d;
            Boolean bool = Boolean.TRUE;
            style.y = bool;
            style.z = null;
            style.A = null;
            style.B = null;
            style.C = null;
            style.D = bool;
            style.E = bool;
            style.F = colour;
            style.G = fValueOf;
            style.H = null;
            style.I = fillRule;
            style.J = null;
            style.K = null;
            style.L = fValueOf;
            style.M = null;
            style.N = fValueOf;
            style.O = VectorEffect.d;
            style.P = RenderQuality.d;
            return style;
        }

        public final Object clone() {
            Style style = (Style) super.clone();
            Length[] lengthArr = this.n;
            if (lengthArr != null) {
                style.n = (Length[]) lengthArr.clone();
            }
            return style;
        }
    }

    public static class Svg extends SvgViewBoxContainer {
        public Length p;
        public Length q;
        public Length r;
        public Length s;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "svg";
        }
    }

    public interface SvgConditional {
        String a();

        void c(HashSet hashSet);

        Set d();

        Set e();

        void f(HashSet hashSet);

        void g(HashSet hashSet);

        Set getRequiredFeatures();

        void i(HashSet hashSet);

        void j(String str);

        Set l();
    }

    public static abstract class SvgConditionalContainer extends SvgElement implements SvgContainer, SvgConditional {
        public List i = new ArrayList();
        public HashSet j = null;
        public String k = null;
        public HashSet l = null;
        public HashSet m = null;

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final String a() {
            return this.k;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void c(HashSet hashSet) {
            this.l = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final Set d() {
            return this.l;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final Set e() {
            return null;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void f(HashSet hashSet) {
            this.j = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void g(HashSet hashSet) {
        }

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final List getChildren() {
            return this.i;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final Set getRequiredFeatures() {
            return this.j;
        }

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public void h(SvgObject svgObject) {
            this.i.add(svgObject);
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void i(HashSet hashSet) {
            this.m = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void j(String str) {
            this.k = str;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final Set l() {
            return this.m;
        }
    }

    public static abstract class SvgConditionalElement extends SvgElement implements SvgConditional {
        public HashSet i;
        public String j;
        public HashSet k;
        public HashSet l;
        public HashSet m;

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final String a() {
            return this.j;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void c(HashSet hashSet) {
            this.l = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final Set d() {
            return this.l;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final Set e() {
            return this.k;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void f(HashSet hashSet) {
            this.i = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void g(HashSet hashSet) {
            this.k = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final Set getRequiredFeatures() {
            return this.i;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void i(HashSet hashSet) {
            this.m = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void j(String str) {
            this.j = str;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final Set l() {
            return this.m;
        }
    }

    public interface SvgContainer {
        List getChildren();

        void h(SvgObject svgObject);
    }

    public static abstract class SvgElement extends SvgElementBase {
        public Box h = null;
    }

    public static abstract class SvgElementBase extends SvgObject {
        public String c = null;
        public Boolean d = null;
        public Style e = null;
        public Style f = null;
        public ArrayList g = null;

        public final String toString() {
            return m();
        }
    }

    public static class SvgLinearGradient extends GradientElement {
        public Length m;
        public Length n;
        public Length o;
        public Length p;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "linearGradient";
        }
    }

    public static class SvgObject {

        /* renamed from: a, reason: collision with root package name */
        public SVG f14016a;
        public SvgContainer b;

        public String m() {
            return "";
        }
    }

    public static abstract class SvgPaint implements Cloneable {
    }

    public static abstract class SvgPreserveAspectRatioContainer extends SvgConditionalContainer {
        public PreserveAspectRatio n = null;
    }

    public static class SvgRadialGradient extends GradientElement {
        public Length m;
        public Length n;
        public Length o;
        public Length p;
        public Length q;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "radialGradient";
        }
    }

    public static abstract class SvgViewBoxContainer extends SvgPreserveAspectRatioContainer {
        public Box o;
    }

    public static class Switch extends Group {
        @Override // com.caverock.androidsvg.SVG.Group, com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "switch";
        }
    }

    public static class Symbol extends SvgViewBoxContainer implements NotDirectlyRendered {
        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "symbol";
        }
    }

    public static class TRef extends TextContainer implements TextChild {
        public String n;
        public TextRoot o;

        @Override // com.caverock.androidsvg.SVG.TextChild
        public final TextRoot b() {
            return this.o;
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "tref";
        }
    }

    public static class TSpan extends TextPositionedContainer implements TextChild {
        public TextRoot r;

        @Override // com.caverock.androidsvg.SVG.TextChild
        public final TextRoot b() {
            return this.r;
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "tspan";
        }
    }

    public static class Text extends TextPositionedContainer implements TextRoot, HasTransform {
        public Matrix r;

        @Override // com.caverock.androidsvg.SVG.HasTransform
        public final void k(Matrix matrix) {
            this.r = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return TextBundle.TEXT_ENTRY;
        }
    }

    public interface TextChild {
        TextRoot b();
    }

    public static abstract class TextContainer extends SvgConditionalContainer {
        @Override // com.caverock.androidsvg.SVG.SvgConditionalContainer, com.caverock.androidsvg.SVG.SvgContainer
        public final void h(SvgObject svgObject) throws SVGParseException {
            if (svgObject instanceof TextChild) {
                this.i.add(svgObject);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + svgObject + " elements.");
        }
    }

    public static class TextPath extends TextContainer implements TextChild {
        public String n;
        public Length o;
        public TextRoot p;

        @Override // com.caverock.androidsvg.SVG.TextChild
        public final TextRoot b() {
            return this.p;
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "textPath";
        }
    }

    public static abstract class TextPositionedContainer extends TextContainer {
        public ArrayList n;
        public ArrayList o;
        public ArrayList p;
        public ArrayList q;
    }

    public interface TextRoot {
    }

    public static class TextSequence extends SvgObject implements TextChild {
        public String c;

        @Override // com.caverock.androidsvg.SVG.TextChild
        public final TextRoot b() {
            return null;
        }

        public final String toString() {
            return YU.a.o(new StringBuilder("TextChild: '"), this.c, "'");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Unit {
        public static final Unit d;
        public static final Unit e;
        public static final Unit f;
        public static final Unit g;
        public static final Unit h;
        public static final /* synthetic */ Unit[] i;

        static {
            Unit unit = new Unit("px", 0);
            d = unit;
            Unit unit2 = new Unit("em", 1);
            e = unit2;
            Unit unit3 = new Unit("ex", 2);
            f = unit3;
            Unit unit4 = new Unit("in", 3);
            Unit unit5 = new Unit("cm", 4);
            Unit unit6 = new Unit("mm", 5);
            Unit unit7 = new Unit("pt", 6);
            g = unit7;
            Unit unit8 = new Unit("pc", 7);
            Unit unit9 = new Unit("percent", 8);
            h = unit9;
            i = new Unit[]{unit, unit2, unit3, unit4, unit5, unit6, unit7, unit8, unit9};
        }

        public static Unit valueOf(String str) {
            return (Unit) Enum.valueOf(Unit.class, str);
        }

        public static Unit[] values() {
            return (Unit[]) i.clone();
        }
    }

    public static class Use extends Group {
        public String o;
        public Length p;
        public Length q;
        public Length r;
        public Length s;

        @Override // com.caverock.androidsvg.SVG.Group, com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "use";
        }
    }

    public static class View extends SvgViewBoxContainer implements NotDirectlyRendered {
        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String m() {
            return "view";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SvgElementBase d(SvgContainer svgContainer, String str) {
        SvgElementBase svgElementBaseD;
        SvgElementBase svgElementBase = (SvgElementBase) svgContainer;
        if (str.equals(svgElementBase.c)) {
            return svgElementBase;
        }
        for (Object obj : svgContainer.getChildren()) {
            if (obj instanceof SvgElementBase) {
                SvgElementBase svgElementBase2 = (SvgElementBase) obj;
                if (str.equals(svgElementBase2.c)) {
                    return svgElementBase2;
                }
                if ((obj instanceof SvgContainer) && (svgElementBaseD = d((SvgContainer) obj, str)) != null) {
                    return svgElementBaseD;
                }
            }
        }
        return null;
    }

    public static SVG e(String str) {
        return new SVGParser().f(new ByteArrayInputStream(str.getBytes()));
    }

    public final Box a() {
        Unit unit;
        Unit unit2;
        Unit unit3;
        Unit unit4;
        float fC;
        Unit unit5;
        Svg svg = this.f14011a;
        Length length = svg.r;
        Length length2 = svg.s;
        if (length == null || length.g() || (unit = length.e) == (unit2 = Unit.h) || unit == (unit3 = Unit.e) || unit == (unit4 = Unit.f)) {
            return new Box(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fC2 = length.c();
        if (length2 == null) {
            Box box = this.f14011a.o;
            fC = box != null ? (box.d * fC2) / box.c : fC2;
        } else {
            if (length2.g() || (unit5 = length2.e) == unit2 || unit5 == unit3 || unit5 == unit4) {
                return new Box(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fC = length2.c();
        }
        return new Box(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fC2, fC);
    }

    public final float b() {
        if (this.f14011a != null) {
            return a().d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public final float c() {
        if (this.f14011a != null) {
            return a().c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public final void f(Canvas canvas) {
        RenderOptions renderOptions = new RenderOptions();
        renderOptions.b = new Box(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, canvas.getWidth(), canvas.getHeight());
        new SVGAndroidRenderer(canvas).J(this, renderOptions);
    }

    public final Picture g(int i, int i2, RenderOptions renderOptions) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i, i2);
        if (renderOptions == null || renderOptions.b == null) {
            if (renderOptions == null) {
                renderOptions = new RenderOptions();
            } else {
                RenderOptions renderOptions2 = new RenderOptions();
                renderOptions2.f14010a = null;
                renderOptions2.b = null;
                renderOptions2.f14010a = renderOptions.f14010a;
                renderOptions2.b = renderOptions.b;
                renderOptions = renderOptions2;
            }
            renderOptions.b = new Box(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i, i2);
        }
        new SVGAndroidRenderer(canvasBeginRecording).J(this, renderOptions);
        picture.endRecording();
        return picture;
    }

    public final Picture h(RenderOptions renderOptions) {
        Length length;
        Box box;
        Svg svg = this.f14011a;
        Box box2 = svg.o;
        if (renderOptions != null && (box = renderOptions.b) != null) {
            return g((int) Math.ceil(box.a()), (int) Math.ceil(renderOptions.b.b()), renderOptions);
        }
        Length length2 = svg.r;
        if (length2 != null) {
            Unit unit = length2.e;
            Unit unit2 = Unit.h;
            if (unit != unit2 && (length = svg.s) != null && length.e != unit2) {
                return g((int) Math.ceil(length2.c()), (int) Math.ceil(this.f14011a.s.c()), renderOptions);
            }
        }
        if (length2 != null && box2 != null) {
            return g((int) Math.ceil(length2.c()), (int) Math.ceil((box2.d * r0) / box2.c), renderOptions);
        }
        Length length3 = svg.s;
        if (length3 == null || box2 == null) {
            return g(512, 512, renderOptions);
        }
        return g((int) Math.ceil((box2.c * r0) / box2.d), (int) Math.ceil(length3.c()), renderOptions);
    }

    public final SvgElementBase i(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String strReplace = str.replace("\\\n", "").replace("\\A", "\n");
        if (strReplace.length() <= 1 || !strReplace.startsWith("#")) {
            return null;
        }
        String strSubstring = strReplace.substring(1);
        HashMap map = this.c;
        if (strSubstring == null || strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(this.f14011a.c)) {
            return this.f14011a;
        }
        if (map.containsKey(strSubstring)) {
            return (SvgElementBase) map.get(strSubstring);
        }
        SvgElementBase svgElementBaseD = d(this.f14011a, strSubstring);
        map.put(strSubstring, svgElementBaseD);
        return svgElementBaseD;
    }

    public static class Length implements Cloneable {
        public final float d;
        public final Unit e;

        public Length(float f, Unit unit) {
            this.d = f;
            this.e = unit;
        }

        public final float a(SVGAndroidRenderer sVGAndroidRenderer) {
            float fSqrt;
            if (this.e != Unit.h) {
                return d(sVGAndroidRenderer);
            }
            SVGAndroidRenderer.RendererState rendererState = sVGAndroidRenderer.c;
            Box box = rendererState.g;
            if (box == null) {
                box = rendererState.f;
            }
            float f = this.d;
            if (box == null) {
                return f;
            }
            float f2 = box.c;
            if (f2 == box.d) {
                fSqrt = f * f2;
            } else {
                fSqrt = f * ((float) (Math.sqrt((r0 * r0) + (f2 * f2)) / 1.414213562373095d));
            }
            return fSqrt / 100.0f;
        }

        public final float b(SVGAndroidRenderer sVGAndroidRenderer, float f) {
            return this.e == Unit.h ? (this.d * f) / 100.0f : d(sVGAndroidRenderer);
        }

        public final float c() {
            float f;
            float f2;
            int iOrdinal = this.e.ordinal();
            float f3 = this.d;
            if (iOrdinal == 0) {
                return f3;
            }
            if (iOrdinal == 3) {
                return f3 * 96.0f;
            }
            if (iOrdinal == 4) {
                f = f3 * 96.0f;
                f2 = 2.54f;
            } else if (iOrdinal == 5) {
                f = f3 * 96.0f;
                f2 = 25.4f;
            } else if (iOrdinal == 6) {
                f = f3 * 96.0f;
                f2 = 72.0f;
            } else {
                if (iOrdinal != 7) {
                    return f3;
                }
                f = f3 * 96.0f;
                f2 = 6.0f;
            }
            return f / f2;
        }

        public final float d(SVGAndroidRenderer sVGAndroidRenderer) {
            float textSize;
            int iOrdinal = this.e.ordinal();
            float f = this.d;
            switch (iOrdinal) {
                case 1:
                    textSize = sVGAndroidRenderer.c.d.getTextSize();
                    break;
                case 2:
                    textSize = sVGAndroidRenderer.c.d.getTextSize() / 2.0f;
                    break;
                case 3:
                    sVGAndroidRenderer.getClass();
                    return f * 96.0f;
                case 4:
                    sVGAndroidRenderer.getClass();
                    return (f * 96.0f) / 2.54f;
                case 5:
                    sVGAndroidRenderer.getClass();
                    return (f * 96.0f) / 25.4f;
                case 6:
                    sVGAndroidRenderer.getClass();
                    return (f * 96.0f) / 72.0f;
                case 7:
                    sVGAndroidRenderer.getClass();
                    return (f * 96.0f) / 6.0f;
                case 8:
                    SVGAndroidRenderer.RendererState rendererState = sVGAndroidRenderer.c;
                    Box box = rendererState.g;
                    if (box == null) {
                        box = rendererState.f;
                    }
                    if (box != null) {
                        return (f * box.c) / 100.0f;
                    }
                default:
                    return f;
            }
            return textSize * f;
        }

        public final float e(SVGAndroidRenderer sVGAndroidRenderer) {
            if (this.e != Unit.h) {
                return d(sVGAndroidRenderer);
            }
            SVGAndroidRenderer.RendererState rendererState = sVGAndroidRenderer.c;
            Box box = rendererState.g;
            if (box == null) {
                box = rendererState.f;
            }
            float f = this.d;
            return box == null ? f : (f * box.d) / 100.0f;
        }

        public final boolean f() {
            return this.d < BitmapDescriptorFactory.HUE_RED;
        }

        public final boolean g() {
            return this.d == BitmapDescriptorFactory.HUE_RED;
        }

        public final String toString() {
            return String.valueOf(this.d) + this.e;
        }

        public Length(float f) {
            this.d = f;
            this.e = Unit.d;
        }
    }

    public static class Box {

        /* renamed from: a, reason: collision with root package name */
        public float f14013a;
        public float b;
        public float c;
        public float d;

        public Box(float f, float f2, float f3, float f4) {
            this.f14013a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final float a() {
            return this.f14013a + this.c;
        }

        public final float b() {
            return this.b + this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.f14013a);
            sb.append(" ");
            sb.append(this.b);
            sb.append(" ");
            sb.append(this.c);
            sb.append(" ");
            return android.support.v4.media.session.a.j(this.d, "]", sb);
        }

        public Box(Box box) {
            this.f14013a = box.f14013a;
            this.b = box.b;
            this.c = box.c;
            this.d = box.d;
        }
    }
}
