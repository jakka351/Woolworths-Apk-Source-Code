package com.scandit.datacapture.barcode.internal.module.generator;

import au.com.woolworths.android.onesite.a;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativeBarcodeGeneratorOptions {
    final NativeColor backgroundColor;
    final NativeQrCodeErrorCorrectionLevel errorCorrectionLevel;
    final NativeColor foregroundColor;
    final Integer layers;
    final Integer minimumErrorCorrectionPercent;
    final Integer unitSize;
    final Integer versionNumber;

    public NativeBarcodeGeneratorOptions(NativeColor nativeColor, NativeColor nativeColor2, Integer num, NativeQrCodeErrorCorrectionLevel nativeQrCodeErrorCorrectionLevel, Integer num2, Integer num3, Integer num4) {
        this.backgroundColor = nativeColor;
        this.foregroundColor = nativeColor2;
        this.unitSize = num;
        this.errorCorrectionLevel = nativeQrCodeErrorCorrectionLevel;
        this.versionNumber = num2;
        this.minimumErrorCorrectionPercent = num3;
        this.layers = num4;
    }

    public NativeColor getBackgroundColor() {
        return this.backgroundColor;
    }

    public NativeQrCodeErrorCorrectionLevel getErrorCorrectionLevel() {
        return this.errorCorrectionLevel;
    }

    public NativeColor getForegroundColor() {
        return this.foregroundColor;
    }

    public Integer getLayers() {
        return this.layers;
    }

    public Integer getMinimumErrorCorrectionPercent() {
        return this.minimumErrorCorrectionPercent;
    }

    public Integer getUnitSize() {
        return this.unitSize;
    }

    public Integer getVersionNumber() {
        return this.versionNumber;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeBarcodeGeneratorOptions{backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(",foregroundColor=");
        sb.append(this.foregroundColor);
        sb.append(",unitSize=");
        sb.append(this.unitSize);
        sb.append(",errorCorrectionLevel=");
        sb.append(this.errorCorrectionLevel);
        sb.append(",versionNumber=");
        sb.append(this.versionNumber);
        sb.append(",minimumErrorCorrectionPercent=");
        sb.append(this.minimumErrorCorrectionPercent);
        sb.append(",layers=");
        return a.p(sb, this.layers, "}");
    }
}
