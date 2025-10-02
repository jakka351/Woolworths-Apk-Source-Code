package com.scandit.datacapture.barcode.generator;

import android.graphics.Bitmap;
import com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGeneratorOptions;
import com.scandit.datacapture.barcode.internal.module.generator.NativeQrCodeErrorCorrectionLevel;
import com.scandit.datacapture.core.common.graphic.ImageBuffer;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGeneratorOptions;", "Lcom/scandit/datacapture/barcode/internal/module/generator/NativeBarcodeGeneratorOptions;", "toNativeOptions", "scandit-barcode-capture"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeGeneratorKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[QrCodeErrorCorrectionLevel.values().length];
            try {
                iArr[QrCodeErrorCorrectionLevel.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QrCodeErrorCorrectionLevel.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QrCodeErrorCorrectionLevel.QUARTILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QrCodeErrorCorrectionLevel.HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NativeQrCodeErrorCorrectionLevel.values().length];
            try {
                iArr2[NativeQrCodeErrorCorrectionLevel.L.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[NativeQrCodeErrorCorrectionLevel.M.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[NativeQrCodeErrorCorrectionLevel.Q.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[NativeQrCodeErrorCorrectionLevel.H.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final BarcodeGeneratorOptions access$toApi(NativeBarcodeGeneratorOptions nativeBarcodeGeneratorOptions) {
        QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel;
        NativeColor backgroundColor = nativeBarcodeGeneratorOptions.getBackgroundColor();
        Intrinsics.g(backgroundColor, "backgroundColor");
        int i = NativeColorExtensionsKt.toInt(backgroundColor);
        NativeColor foregroundColor = nativeBarcodeGeneratorOptions.getForegroundColor();
        Intrinsics.g(foregroundColor, "foregroundColor");
        int i2 = NativeColorExtensionsKt.toInt(foregroundColor);
        Integer versionNumber = nativeBarcodeGeneratorOptions.getVersionNumber();
        NativeQrCodeErrorCorrectionLevel errorCorrectionLevel = nativeBarcodeGeneratorOptions.getErrorCorrectionLevel();
        if (errorCorrectionLevel != null) {
            int i3 = WhenMappings.$EnumSwitchMapping$1[errorCorrectionLevel.ordinal()];
            if (i3 == 1) {
                qrCodeErrorCorrectionLevel = QrCodeErrorCorrectionLevel.LOW;
            } else if (i3 == 2) {
                qrCodeErrorCorrectionLevel = QrCodeErrorCorrectionLevel.MEDIUM;
            } else if (i3 == 3) {
                qrCodeErrorCorrectionLevel = QrCodeErrorCorrectionLevel.QUARTILE;
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                qrCodeErrorCorrectionLevel = QrCodeErrorCorrectionLevel.HIGH;
            }
        } else {
            qrCodeErrorCorrectionLevel = null;
        }
        QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel2 = qrCodeErrorCorrectionLevel;
        Integer unitSize = nativeBarcodeGeneratorOptions.getUnitSize();
        Integer minimumErrorCorrectionPercent = nativeBarcodeGeneratorOptions.getMinimumErrorCorrectionPercent();
        Integer layers = nativeBarcodeGeneratorOptions.getLayers();
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i2);
        Intrinsics.g(unitSize, "unitSize");
        return new BarcodeGeneratorOptions(numValueOf, numValueOf2, unitSize.intValue(), qrCodeErrorCorrectionLevel2, versionNumber, minimumErrorCorrectionPercent, layers);
    }

    public static final Bitmap access$toBitmap(ImageBuffer imageBuffer, int i, int i2) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        bitmapCreateBitmap.reconfigure(imageBuffer.getF18483a().getWidth(), imageBuffer.getF18483a().getHeight(), config);
        bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(imageBuffer.getF18483a().toBitmap()));
        return bitmapCreateBitmap;
    }

    @NotNull
    public static final NativeBarcodeGeneratorOptions toNativeOptions(@NotNull BarcodeGeneratorOptions barcodeGeneratorOptions) {
        Intrinsics.h(barcodeGeneratorOptions, "<this>");
        Integer backgroundColor = barcodeGeneratorOptions.getBackgroundColor();
        NativeQrCodeErrorCorrectionLevel nativeQrCodeErrorCorrectionLevel = null;
        NativeColor nativeColor = backgroundColor != null ? NativeColorExtensionsKt.toNativeColor(backgroundColor.intValue()) : null;
        Integer foregroundColor = barcodeGeneratorOptions.getForegroundColor();
        NativeColor nativeColor2 = foregroundColor != null ? NativeColorExtensionsKt.toNativeColor(foregroundColor.intValue()) : null;
        Integer numValueOf = Integer.valueOf(barcodeGeneratorOptions.getUnitSize());
        QrCodeErrorCorrectionLevel errorCorrectionLevel = barcodeGeneratorOptions.getErrorCorrectionLevel();
        if (errorCorrectionLevel != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[errorCorrectionLevel.ordinal()];
            if (i == 1) {
                nativeQrCodeErrorCorrectionLevel = NativeQrCodeErrorCorrectionLevel.L;
            } else if (i == 2) {
                nativeQrCodeErrorCorrectionLevel = NativeQrCodeErrorCorrectionLevel.M;
            } else if (i == 3) {
                nativeQrCodeErrorCorrectionLevel = NativeQrCodeErrorCorrectionLevel.Q;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                nativeQrCodeErrorCorrectionLevel = NativeQrCodeErrorCorrectionLevel.H;
            }
        }
        return new NativeBarcodeGeneratorOptions(nativeColor, nativeColor2, numValueOf, nativeQrCodeErrorCorrectionLevel, barcodeGeneratorOptions.getVersionNumber(), barcodeGeneratorOptions.getMinimumErrorCorrectionPercent(), barcodeGeneratorOptions.getLayers());
    }
}
