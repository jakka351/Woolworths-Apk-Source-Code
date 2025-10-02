package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import java.util.function.DoubleUnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageBitmapKt {
    public static AndroidImageBitmap a(int i, int i2, int i3) {
        ColorSpace colorSpace;
        ColorSpace rgb;
        Rgb rgb2 = ColorSpaces.e;
        AndroidImageBitmap_androidKt.b(i3);
        int i4 = Build.VERSION.SDK_INT;
        Bitmap.Config configB = AndroidImageBitmap_androidKt.b(i3);
        if (Intrinsics.c(rgb2, rgb2)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (Intrinsics.c(rgb2, ColorSpaces.q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (Intrinsics.c(rgb2, ColorSpaces.r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (Intrinsics.c(rgb2, ColorSpaces.o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (Intrinsics.c(rgb2, ColorSpaces.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (Intrinsics.c(rgb2, ColorSpaces.i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (Intrinsics.c(rgb2, ColorSpaces.t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (Intrinsics.c(rgb2, ColorSpaces.s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (Intrinsics.c(rgb2, ColorSpaces.k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (Intrinsics.c(rgb2, ColorSpaces.l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (Intrinsics.c(rgb2, ColorSpaces.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (Intrinsics.c(rgb2, ColorSpaces.h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (Intrinsics.c(rgb2, ColorSpaces.f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (Intrinsics.c(rgb2, ColorSpaces.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (Intrinsics.c(rgb2, ColorSpaces.p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!Intrinsics.c(rgb2, ColorSpaces.n)) {
                if (i4 >= 34 && (rgb = ColorSpaceVerificationHelperV34.a(rgb2)) != null) {
                    rgb = rgb;
                } else if (rgb2 != null) {
                    String str = rgb2.f1790a;
                    float[] fArrA = rgb2.d.a();
                    TransferParameters transferParameters = rgb2.g;
                    ColorSpace.Rgb.TransferParameters transferParameters2 = transferParameters != null ? new ColorSpace.Rgb.TransferParameters(transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f, transferParameters.g, transferParameters.f1795a) : null;
                    if (transferParameters2 != null) {
                        ColorSpace rgb3 = new ColorSpace.Rgb(str, rgb2.h, fArrA, transferParameters2);
                        rgb = rgb3;
                    } else {
                        float[] fArr = rgb2.h;
                        final Function1 function1 = rgb2.l;
                        final int i5 = 0;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.c
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                switch (i5) {
                                }
                                return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
                            }
                        };
                        final Function1 function12 = rgb2.o;
                        final int i6 = 1;
                        rgb = new ColorSpace.Rgb(str, fArr, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.c
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                switch (i6) {
                                }
                                return ((Number) function12.invoke(Double.valueOf(d))).doubleValue();
                            }
                        }, rgb2.e, rgb2.f);
                    }
                } else {
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new AndroidImageBitmap(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configB, true, rgb));
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        rgb = colorSpace;
        return new AndroidImageBitmap(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configB, true, rgb));
    }
}
