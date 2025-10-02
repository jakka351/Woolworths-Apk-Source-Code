package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Rgb extends ColorSpace {
    public static final a r = new a(6);
    public final WhitePoint d;
    public final float e;
    public final float f;
    public final TransferParameters g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final DoubleFunction k;
    public final Function1 l;
    public final b m;
    public final DoubleFunction n;
    public final Function1 o;
    public final b p;
    public final boolean q;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static float a(float[] fArr) {
            if (fArr.length < 6) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < BitmapDescriptorFactory.HUE_RED ? -f7 : f7;
        }
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final TransferParameters transferParameters, int i) {
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2;
        double d = transferParameters.f1795a;
        boolean z = d == -3.0d;
        double d2 = transferParameters.g;
        double d3 = transferParameters.f;
        if (z) {
            final int i2 = 4;
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.d
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double d(double d4) {
                    int i3 = i2;
                    TransferParameters transferParameters2 = transferParameters;
                    switch (i3) {
                        case 0:
                            float[] fArr2 = ColorSpaces.f1791a;
                            return ColorSpaces.a(transferParameters2, d4);
                        case 1:
                            float[] fArr3 = ColorSpaces.f1791a;
                            return ColorSpaces.c(transferParameters2, d4);
                        case 2:
                            double d5 = transferParameters2.b;
                            return d4 >= transferParameters2.e ? Math.pow((d5 * d4) + transferParameters2.c, transferParameters2.f1795a) : d4 * transferParameters2.d;
                        case 3:
                            double d6 = transferParameters2.b;
                            double d7 = transferParameters2.c;
                            double d8 = transferParameters2.d;
                            return d4 >= transferParameters2.e ? Math.pow((d6 * d4) + d7, transferParameters2.f1795a) + transferParameters2.f : (d8 * d4) + transferParameters2.g;
                        case 4:
                            float[] fArr4 = ColorSpaces.f1791a;
                            return ColorSpaces.b(transferParameters2, d4);
                        case 5:
                            float[] fArr5 = ColorSpaces.f1791a;
                            return ColorSpaces.d(transferParameters2, d4);
                        case 6:
                            double d9 = transferParameters2.b;
                            double d10 = transferParameters2.c;
                            double d11 = transferParameters2.d;
                            return d4 >= transferParameters2.e * d11 ? (Math.pow(d4, 1.0d / transferParameters2.f1795a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = transferParameters2.b;
                            double d13 = transferParameters2.c;
                            double d14 = transferParameters2.d;
                            return d4 >= transferParameters2.e * d14 ? (Math.pow(d4 - transferParameters2.f, 1.0d / transferParameters2.f1795a) - d13) / d12 : (d4 - transferParameters2.g) / d14;
                    }
                }
            };
        } else if (d == -2.0d) {
            final int i3 = 5;
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.d
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double d(double d4) {
                    int i32 = i3;
                    TransferParameters transferParameters2 = transferParameters;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = ColorSpaces.f1791a;
                            return ColorSpaces.a(transferParameters2, d4);
                        case 1:
                            float[] fArr3 = ColorSpaces.f1791a;
                            return ColorSpaces.c(transferParameters2, d4);
                        case 2:
                            double d5 = transferParameters2.b;
                            return d4 >= transferParameters2.e ? Math.pow((d5 * d4) + transferParameters2.c, transferParameters2.f1795a) : d4 * transferParameters2.d;
                        case 3:
                            double d6 = transferParameters2.b;
                            double d7 = transferParameters2.c;
                            double d8 = transferParameters2.d;
                            return d4 >= transferParameters2.e ? Math.pow((d6 * d4) + d7, transferParameters2.f1795a) + transferParameters2.f : (d8 * d4) + transferParameters2.g;
                        case 4:
                            float[] fArr4 = ColorSpaces.f1791a;
                            return ColorSpaces.b(transferParameters2, d4);
                        case 5:
                            float[] fArr5 = ColorSpaces.f1791a;
                            return ColorSpaces.d(transferParameters2, d4);
                        case 6:
                            double d9 = transferParameters2.b;
                            double d10 = transferParameters2.c;
                            double d11 = transferParameters2.d;
                            return d4 >= transferParameters2.e * d11 ? (Math.pow(d4, 1.0d / transferParameters2.f1795a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = transferParameters2.b;
                            double d13 = transferParameters2.c;
                            double d14 = transferParameters2.d;
                            return d4 >= transferParameters2.e * d14 ? (Math.pow(d4 - transferParameters2.f, 1.0d / transferParameters2.f1795a) - d13) / d12 : (d4 - transferParameters2.g) / d14;
                    }
                }
            };
        } else if (d3 == 0.0d && d2 == 0.0d) {
            final int i4 = 6;
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.d
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double d(double d4) {
                    int i32 = i4;
                    TransferParameters transferParameters2 = transferParameters;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = ColorSpaces.f1791a;
                            return ColorSpaces.a(transferParameters2, d4);
                        case 1:
                            float[] fArr3 = ColorSpaces.f1791a;
                            return ColorSpaces.c(transferParameters2, d4);
                        case 2:
                            double d5 = transferParameters2.b;
                            return d4 >= transferParameters2.e ? Math.pow((d5 * d4) + transferParameters2.c, transferParameters2.f1795a) : d4 * transferParameters2.d;
                        case 3:
                            double d6 = transferParameters2.b;
                            double d7 = transferParameters2.c;
                            double d8 = transferParameters2.d;
                            return d4 >= transferParameters2.e ? Math.pow((d6 * d4) + d7, transferParameters2.f1795a) + transferParameters2.f : (d8 * d4) + transferParameters2.g;
                        case 4:
                            float[] fArr4 = ColorSpaces.f1791a;
                            return ColorSpaces.b(transferParameters2, d4);
                        case 5:
                            float[] fArr5 = ColorSpaces.f1791a;
                            return ColorSpaces.d(transferParameters2, d4);
                        case 6:
                            double d9 = transferParameters2.b;
                            double d10 = transferParameters2.c;
                            double d11 = transferParameters2.d;
                            return d4 >= transferParameters2.e * d11 ? (Math.pow(d4, 1.0d / transferParameters2.f1795a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = transferParameters2.b;
                            double d13 = transferParameters2.c;
                            double d14 = transferParameters2.d;
                            return d4 >= transferParameters2.e * d14 ? (Math.pow(d4 - transferParameters2.f, 1.0d / transferParameters2.f1795a) - d13) / d12 : (d4 - transferParameters2.g) / d14;
                    }
                }
            };
        } else {
            final int i5 = 7;
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.d
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double d(double d4) {
                    int i32 = i5;
                    TransferParameters transferParameters2 = transferParameters;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = ColorSpaces.f1791a;
                            return ColorSpaces.a(transferParameters2, d4);
                        case 1:
                            float[] fArr3 = ColorSpaces.f1791a;
                            return ColorSpaces.c(transferParameters2, d4);
                        case 2:
                            double d5 = transferParameters2.b;
                            return d4 >= transferParameters2.e ? Math.pow((d5 * d4) + transferParameters2.c, transferParameters2.f1795a) : d4 * transferParameters2.d;
                        case 3:
                            double d6 = transferParameters2.b;
                            double d7 = transferParameters2.c;
                            double d8 = transferParameters2.d;
                            return d4 >= transferParameters2.e ? Math.pow((d6 * d4) + d7, transferParameters2.f1795a) + transferParameters2.f : (d8 * d4) + transferParameters2.g;
                        case 4:
                            float[] fArr4 = ColorSpaces.f1791a;
                            return ColorSpaces.b(transferParameters2, d4);
                        case 5:
                            float[] fArr5 = ColorSpaces.f1791a;
                            return ColorSpaces.d(transferParameters2, d4);
                        case 6:
                            double d9 = transferParameters2.b;
                            double d10 = transferParameters2.c;
                            double d11 = transferParameters2.d;
                            return d4 >= transferParameters2.e * d11 ? (Math.pow(d4, 1.0d / transferParameters2.f1795a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = transferParameters2.b;
                            double d13 = transferParameters2.c;
                            double d14 = transferParameters2.d;
                            return d4 >= transferParameters2.e * d14 ? (Math.pow(d4 - transferParameters2.f, 1.0d / transferParameters2.f1795a) - d13) / d12 : (d4 - transferParameters2.g) / d14;
                    }
                }
            };
        }
        if (d == -3.0d) {
            final int i6 = 0;
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.d
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double d(double d4) {
                    int i32 = i6;
                    TransferParameters transferParameters2 = transferParameters;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = ColorSpaces.f1791a;
                            return ColorSpaces.a(transferParameters2, d4);
                        case 1:
                            float[] fArr3 = ColorSpaces.f1791a;
                            return ColorSpaces.c(transferParameters2, d4);
                        case 2:
                            double d5 = transferParameters2.b;
                            return d4 >= transferParameters2.e ? Math.pow((d5 * d4) + transferParameters2.c, transferParameters2.f1795a) : d4 * transferParameters2.d;
                        case 3:
                            double d6 = transferParameters2.b;
                            double d7 = transferParameters2.c;
                            double d8 = transferParameters2.d;
                            return d4 >= transferParameters2.e ? Math.pow((d6 * d4) + d7, transferParameters2.f1795a) + transferParameters2.f : (d8 * d4) + transferParameters2.g;
                        case 4:
                            float[] fArr4 = ColorSpaces.f1791a;
                            return ColorSpaces.b(transferParameters2, d4);
                        case 5:
                            float[] fArr5 = ColorSpaces.f1791a;
                            return ColorSpaces.d(transferParameters2, d4);
                        case 6:
                            double d9 = transferParameters2.b;
                            double d10 = transferParameters2.c;
                            double d11 = transferParameters2.d;
                            return d4 >= transferParameters2.e * d11 ? (Math.pow(d4, 1.0d / transferParameters2.f1795a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = transferParameters2.b;
                            double d13 = transferParameters2.c;
                            double d14 = transferParameters2.d;
                            return d4 >= transferParameters2.e * d14 ? (Math.pow(d4 - transferParameters2.f, 1.0d / transferParameters2.f1795a) - d13) / d12 : (d4 - transferParameters2.g) / d14;
                    }
                }
            };
        } else if (d == -2.0d) {
            final int i7 = 1;
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.d
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double d(double d4) {
                    int i32 = i7;
                    TransferParameters transferParameters2 = transferParameters;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = ColorSpaces.f1791a;
                            return ColorSpaces.a(transferParameters2, d4);
                        case 1:
                            float[] fArr3 = ColorSpaces.f1791a;
                            return ColorSpaces.c(transferParameters2, d4);
                        case 2:
                            double d5 = transferParameters2.b;
                            return d4 >= transferParameters2.e ? Math.pow((d5 * d4) + transferParameters2.c, transferParameters2.f1795a) : d4 * transferParameters2.d;
                        case 3:
                            double d6 = transferParameters2.b;
                            double d7 = transferParameters2.c;
                            double d8 = transferParameters2.d;
                            return d4 >= transferParameters2.e ? Math.pow((d6 * d4) + d7, transferParameters2.f1795a) + transferParameters2.f : (d8 * d4) + transferParameters2.g;
                        case 4:
                            float[] fArr4 = ColorSpaces.f1791a;
                            return ColorSpaces.b(transferParameters2, d4);
                        case 5:
                            float[] fArr5 = ColorSpaces.f1791a;
                            return ColorSpaces.d(transferParameters2, d4);
                        case 6:
                            double d9 = transferParameters2.b;
                            double d10 = transferParameters2.c;
                            double d11 = transferParameters2.d;
                            return d4 >= transferParameters2.e * d11 ? (Math.pow(d4, 1.0d / transferParameters2.f1795a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = transferParameters2.b;
                            double d13 = transferParameters2.c;
                            double d14 = transferParameters2.d;
                            return d4 >= transferParameters2.e * d14 ? (Math.pow(d4 - transferParameters2.f, 1.0d / transferParameters2.f1795a) - d13) / d12 : (d4 - transferParameters2.g) / d14;
                    }
                }
            };
        } else if (d3 == 0.0d && d2 == 0.0d) {
            final int i8 = 2;
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.d
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double d(double d4) {
                    int i32 = i8;
                    TransferParameters transferParameters2 = transferParameters;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = ColorSpaces.f1791a;
                            return ColorSpaces.a(transferParameters2, d4);
                        case 1:
                            float[] fArr3 = ColorSpaces.f1791a;
                            return ColorSpaces.c(transferParameters2, d4);
                        case 2:
                            double d5 = transferParameters2.b;
                            return d4 >= transferParameters2.e ? Math.pow((d5 * d4) + transferParameters2.c, transferParameters2.f1795a) : d4 * transferParameters2.d;
                        case 3:
                            double d6 = transferParameters2.b;
                            double d7 = transferParameters2.c;
                            double d8 = transferParameters2.d;
                            return d4 >= transferParameters2.e ? Math.pow((d6 * d4) + d7, transferParameters2.f1795a) + transferParameters2.f : (d8 * d4) + transferParameters2.g;
                        case 4:
                            float[] fArr4 = ColorSpaces.f1791a;
                            return ColorSpaces.b(transferParameters2, d4);
                        case 5:
                            float[] fArr5 = ColorSpaces.f1791a;
                            return ColorSpaces.d(transferParameters2, d4);
                        case 6:
                            double d9 = transferParameters2.b;
                            double d10 = transferParameters2.c;
                            double d11 = transferParameters2.d;
                            return d4 >= transferParameters2.e * d11 ? (Math.pow(d4, 1.0d / transferParameters2.f1795a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = transferParameters2.b;
                            double d13 = transferParameters2.c;
                            double d14 = transferParameters2.d;
                            return d4 >= transferParameters2.e * d14 ? (Math.pow(d4 - transferParameters2.f, 1.0d / transferParameters2.f1795a) - d13) / d12 : (d4 - transferParameters2.g) / d14;
                    }
                }
            };
        } else {
            final int i9 = 3;
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.d
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double d(double d4) {
                    int i32 = i9;
                    TransferParameters transferParameters2 = transferParameters;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = ColorSpaces.f1791a;
                            return ColorSpaces.a(transferParameters2, d4);
                        case 1:
                            float[] fArr3 = ColorSpaces.f1791a;
                            return ColorSpaces.c(transferParameters2, d4);
                        case 2:
                            double d5 = transferParameters2.b;
                            return d4 >= transferParameters2.e ? Math.pow((d5 * d4) + transferParameters2.c, transferParameters2.f1795a) : d4 * transferParameters2.d;
                        case 3:
                            double d6 = transferParameters2.b;
                            double d7 = transferParameters2.c;
                            double d8 = transferParameters2.d;
                            return d4 >= transferParameters2.e ? Math.pow((d6 * d4) + d7, transferParameters2.f1795a) + transferParameters2.f : (d8 * d4) + transferParameters2.g;
                        case 4:
                            float[] fArr4 = ColorSpaces.f1791a;
                            return ColorSpaces.b(transferParameters2, d4);
                        case 5:
                            float[] fArr5 = ColorSpaces.f1791a;
                            return ColorSpaces.d(transferParameters2, d4);
                        case 6:
                            double d9 = transferParameters2.b;
                            double d10 = transferParameters2.c;
                            double d11 = transferParameters2.d;
                            return d4 >= transferParameters2.e * d11 ? (Math.pow(d4, 1.0d / transferParameters2.f1795a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = transferParameters2.b;
                            double d13 = transferParameters2.c;
                            double d14 = transferParameters2.d;
                            return d4 >= transferParameters2.e * d14 ? (Math.pow(d4 - transferParameters2.f, 1.0d / transferParameters2.f1795a) - d13) / d12 : (d4 - transferParameters2.g) / d14;
                    }
                }
            };
        }
        this(str, fArr, whitePoint, null, doubleFunction, doubleFunction2, BitmapDescriptorFactory.HUE_RED, 1.0f, transferParameters, i);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] a(float[] fArr) {
        ColorSpaceKt.g(this.j, fArr);
        if (fArr.length < 3) {
            return fArr;
        }
        double d = fArr[0];
        b bVar = this.m;
        fArr[0] = (float) bVar.d(d);
        fArr[1] = (float) bVar.d(fArr[1]);
        fArr[2] = (float) bVar.d(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float b(int i) {
        return this.f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float c(int i) {
        return this.e;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: d, reason: from getter */
    public final boolean getQ() {
        return this.q;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long e(float f, float f2, float f3) {
        double d = f;
        b bVar = this.p;
        float fD = (float) bVar.d(d);
        float fD2 = (float) bVar.d(f2);
        float fD3 = (float) bVar.d(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * fD3) + (fArr[3] * fD2) + (fArr[0] * fD);
        float f5 = (fArr[7] * fD3) + (fArr[4] * fD2) + (fArr[1] * fD);
        return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rgb.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        TransferParameters transferParameters = rgb.g;
        if (Float.compare(rgb.e, this.e) != 0 || Float.compare(rgb.f, this.f) != 0 || !Intrinsics.c(this.d, rgb.d) || !Arrays.equals(this.h, rgb.h)) {
            return false;
        }
        TransferParameters transferParameters2 = this.g;
        if (transferParameters2 != null) {
            return Intrinsics.c(transferParameters2, transferParameters);
        }
        if (transferParameters == null) {
            return true;
        }
        if (Intrinsics.c(this.k, rgb.k)) {
            return Intrinsics.c(this.n, rgb.n);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] f(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        double d = fArr[0];
        b bVar = this.p;
        fArr[0] = (float) bVar.d(d);
        fArr[1] = (float) bVar.d(fArr[1]);
        fArr[2] = (float) bVar.d(fArr[2]);
        ColorSpaceKt.g(this.i, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float g(float f, float f2, float f3) {
        double d = f;
        b bVar = this.p;
        float fD = (float) bVar.d(d);
        float fD2 = (float) bVar.d(f2);
        float fD3 = (float) bVar.d(f3);
        float[] fArr = this.i;
        return (fArr[8] * fD3) + (fArr[5] * fD2) + (fArr[2] * fD);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long h(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        b bVar = this.m;
        return ColorKt.a((float) bVar.d(f5), (float) bVar.d(f6), (float) bVar.d(f7), f4, colorSpace);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == BitmapDescriptorFactory.HUE_RED ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == BitmapDescriptorFactory.HUE_RED ? 0 : Float.floatToIntBits(f2))) * 31;
        TransferParameters transferParameters = this.g;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        if (transferParameters == null) {
            return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0263  */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(java.lang.String r33, float[] r34, androidx.compose.ui.graphics.colorspace.WhitePoint r35, float[] r36, androidx.compose.ui.graphics.colorspace.DoubleFunction r37, androidx.compose.ui.graphics.colorspace.DoubleFunction r38, float r39, float r40, androidx.compose.ui.graphics.colorspace.TransferParameters r41, int r42) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, float[], androidx.compose.ui.graphics.colorspace.DoubleFunction, androidx.compose.ui.graphics.colorspace.DoubleFunction, float, float, androidx.compose.ui.graphics.colorspace.TransferParameters, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final double d, float f, float f2, int i) {
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2 = r;
        if (d == 1.0d) {
            doubleFunction = doubleFunction2;
        } else {
            final int i2 = 0;
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.c
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double d(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.c
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double d(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        DoubleFunction doubleFunction3 = doubleFunction2;
        this(str, fArr, whitePoint, null, doubleFunction, doubleFunction3, f, f2, new TransferParameters(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
