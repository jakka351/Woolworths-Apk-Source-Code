package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector;", "", "Companion", "RgbConnector", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class Connector {

    /* renamed from: a, reason: collision with root package name */
    public final ColorSpace f1792a;
    public final ColorSpace b;
    public final ColorSpace c;
    public final float[] d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$Companion;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$RgbConnector;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class RgbConnector extends Connector {
        public final Rgb e;
        public final Rgb f;
        public final float[] g;

        public RgbConnector(Rgb rgb, Rgb rgb2) {
            float[] fArrF;
            super(rgb2, rgb, rgb2, null);
            this.e = rgb;
            this.f = rgb2;
            float[] fArr = Adaptation.b.f1788a;
            WhitePoint whitePoint = rgb.d;
            float[] fArr2 = rgb.i;
            WhitePoint whitePoint2 = rgb2.d;
            float[] fArr3 = rgb2.j;
            if (ColorSpaceKt.c(whitePoint, whitePoint2)) {
                fArrF = ColorSpaceKt.f(fArr3, fArr2);
            } else {
                float[] fArrA = whitePoint.a();
                float[] fArrA2 = whitePoint2.a();
                WhitePoint whitePoint3 = Illuminant.b;
                fArrF = ColorSpaceKt.f(ColorSpaceKt.c(whitePoint2, whitePoint3) ? fArr3 : ColorSpaceKt.e(ColorSpaceKt.f(ColorSpaceKt.b(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), rgb2.i)), ColorSpaceKt.c(whitePoint, whitePoint3) ? fArr2 : ColorSpaceKt.f(ColorSpaceKt.b(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
            }
            this.g = fArrF;
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        public final long a(long j) {
            float fH = Color.h(j);
            float fG = Color.g(j);
            float fE = Color.e(j);
            float fD = Color.d(j);
            b bVar = this.e.p;
            float fD2 = (float) bVar.d(fH);
            float fD3 = (float) bVar.d(fG);
            float fD4 = (float) bVar.d(fE);
            float[] fArr = this.g;
            float f = (fArr[6] * fD4) + (fArr[3] * fD3) + (fArr[0] * fD2);
            float f2 = (fArr[7] * fD4) + (fArr[4] * fD3) + (fArr[1] * fD2);
            float f3 = (fArr[8] * fD4) + (fArr[5] * fD3) + (fArr[2] * fD2);
            Rgb rgb = this.f;
            float fD5 = (float) rgb.m.d(f);
            b bVar2 = rgb.m;
            return ColorKt.a(fD5, (float) bVar2.d(f2), (float) bVar2.d(f3), fD, rgb);
        }
    }

    public Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, float[] fArr) {
        this.f1792a = colorSpace;
        this.b = colorSpace2;
        this.c = colorSpace3;
        this.d = fArr;
    }

    public long a(long j) {
        float fH = Color.h(j);
        float fG = Color.g(j);
        float fE = Color.e(j);
        float fD = Color.d(j);
        ColorSpace colorSpace = this.b;
        long jE = colorSpace.e(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
        float fG2 = colorSpace.g(fH, fG, fE);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fG2 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.c.h(f, f2, fG2, fD, this.f1792a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Connector(androidx.compose.ui.graphics.colorspace.ColorSpace r9, androidx.compose.ui.graphics.colorspace.ColorSpace r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.b
            long r2 = androidx.compose.ui.graphics.colorspace.ColorModel.f1789a
            boolean r0 = androidx.compose.ui.graphics.colorspace.ColorModel.a(r0, r2)
            if (r0 == 0) goto Lf
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.a(r9)
            goto L10
        Lf:
            r0 = r9
        L10:
            long r4 = r10.b
            boolean r1 = androidx.compose.ui.graphics.colorspace.ColorModel.a(r4, r2)
            if (r1 == 0) goto L1d
            androidx.compose.ui.graphics.colorspace.ColorSpace r1 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.a(r10)
            goto L1e
        L1d:
            r1 = r10
        L1e:
            r4 = 3
            if (r11 != r4) goto L69
            long r5 = r9.b
            boolean r11 = androidx.compose.ui.graphics.colorspace.ColorModel.a(r5, r2)
            long r5 = r10.b
            boolean r2 = androidx.compose.ui.graphics.colorspace.ColorModel.a(r5, r2)
            if (r11 == 0) goto L32
            if (r2 == 0) goto L32
            goto L69
        L32:
            if (r11 != 0) goto L36
            if (r2 == 0) goto L69
        L36:
            if (r11 == 0) goto L39
            goto L3a
        L39:
            r9 = r10
        L3a:
            androidx.compose.ui.graphics.colorspace.Rgb r9 = (androidx.compose.ui.graphics.colorspace.Rgb) r9
            androidx.compose.ui.graphics.colorspace.WhitePoint r9 = r9.d
            float[] r3 = androidx.compose.ui.graphics.colorspace.Illuminant.e
            if (r11 == 0) goto L47
            float[] r11 = r9.a()
            goto L48
        L47:
            r11 = r3
        L48:
            if (r2 == 0) goto L4e
            float[] r3 = r9.a()
        L4e:
            r9 = 0
            r2 = r11[r9]
            r5 = r3[r9]
            float r2 = r2 / r5
            r5 = 1
            r6 = r11[r5]
            r7 = r3[r5]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r3 = r3[r7]
            float r11 = r11 / r3
            float[] r3 = new float[r4]
            r3[r9] = r2
            r3[r5] = r6
            r3[r7] = r11
            goto L6a
        L69:
            r3 = 0
        L6a:
            r8.<init>(r10, r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Connector.<init>(androidx.compose.ui.graphics.colorspace.ColorSpace, androidx.compose.ui.graphics.colorspace.ColorSpace, int):void");
    }
}
