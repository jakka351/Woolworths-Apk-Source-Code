package com.scandit.datacapture.barcode.generator;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B[\b\u0000\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b)\u0010*R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0014\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010 \u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR$\u0010$\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR$\u0010(\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\b¨\u0006+"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGeneratorOptions;", "", "", "a", "Ljava/lang/Integer;", "getBackgroundColor$scandit_barcode_capture", "()Ljava/lang/Integer;", "setBackgroundColor$scandit_barcode_capture", "(Ljava/lang/Integer;)V", "backgroundColor", "b", "getForegroundColor$scandit_barcode_capture", "setForegroundColor$scandit_barcode_capture", "foregroundColor", "c", "I", "getUnitSize$scandit_barcode_capture", "()I", "setUnitSize$scandit_barcode_capture", "(I)V", "unitSize", "Lcom/scandit/datacapture/barcode/generator/QrCodeErrorCorrectionLevel;", "d", "Lcom/scandit/datacapture/barcode/generator/QrCodeErrorCorrectionLevel;", "getErrorCorrectionLevel$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/generator/QrCodeErrorCorrectionLevel;", "setErrorCorrectionLevel$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/generator/QrCodeErrorCorrectionLevel;)V", "errorCorrectionLevel", "e", "getVersionNumber$scandit_barcode_capture", "setVersionNumber$scandit_barcode_capture", "versionNumber", "f", "getMinimumErrorCorrectionPercent$scandit_barcode_capture", "setMinimumErrorCorrectionPercent$scandit_barcode_capture", "minimumErrorCorrectionPercent", "g", "getLayers$scandit_barcode_capture", "setLayers$scandit_barcode_capture", "layers", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;ILcom/scandit/datacapture/barcode/generator/QrCodeErrorCorrectionLevel;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeGeneratorOptions {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Integer backgroundColor;

    /* renamed from: b, reason: from kotlin metadata */
    private Integer foregroundColor;

    /* renamed from: c, reason: from kotlin metadata */
    private int unitSize;

    /* renamed from: d, reason: from kotlin metadata */
    private QrCodeErrorCorrectionLevel errorCorrectionLevel;

    /* renamed from: e, reason: from kotlin metadata */
    private Integer versionNumber;

    /* renamed from: f, reason: from kotlin metadata */
    private Integer minimumErrorCorrectionPercent;

    /* renamed from: g, reason: from kotlin metadata */
    private Integer layers;

    public BarcodeGeneratorOptions() {
        this(null, null, 0, null, null, null, null, 127, null);
    }

    @Nullable
    /* renamed from: getBackgroundColor$scandit_barcode_capture, reason: from getter */
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* renamed from: getErrorCorrectionLevel$scandit_barcode_capture, reason: from getter */
    public final QrCodeErrorCorrectionLevel getErrorCorrectionLevel() {
        return this.errorCorrectionLevel;
    }

    @Nullable
    /* renamed from: getForegroundColor$scandit_barcode_capture, reason: from getter */
    public final Integer getForegroundColor() {
        return this.foregroundColor;
    }

    @Nullable
    /* renamed from: getLayers$scandit_barcode_capture, reason: from getter */
    public final Integer getLayers() {
        return this.layers;
    }

    @Nullable
    /* renamed from: getMinimumErrorCorrectionPercent$scandit_barcode_capture, reason: from getter */
    public final Integer getMinimumErrorCorrectionPercent() {
        return this.minimumErrorCorrectionPercent;
    }

    /* renamed from: getUnitSize$scandit_barcode_capture, reason: from getter */
    public final int getUnitSize() {
        return this.unitSize;
    }

    @Nullable
    /* renamed from: getVersionNumber$scandit_barcode_capture, reason: from getter */
    public final Integer getVersionNumber() {
        return this.versionNumber;
    }

    public final void setBackgroundColor$scandit_barcode_capture(@Nullable Integer num) {
        this.backgroundColor = num;
    }

    public final void setErrorCorrectionLevel$scandit_barcode_capture(@Nullable QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel) {
        this.errorCorrectionLevel = qrCodeErrorCorrectionLevel;
    }

    public final void setForegroundColor$scandit_barcode_capture(@Nullable Integer num) {
        this.foregroundColor = num;
    }

    public final void setLayers$scandit_barcode_capture(@Nullable Integer num) {
        this.layers = num;
    }

    public final void setMinimumErrorCorrectionPercent$scandit_barcode_capture(@Nullable Integer num) {
        this.minimumErrorCorrectionPercent = num;
    }

    public final void setUnitSize$scandit_barcode_capture(int i) {
        this.unitSize = i;
    }

    public final void setVersionNumber$scandit_barcode_capture(@Nullable Integer num) {
        this.versionNumber = num;
    }

    public BarcodeGeneratorOptions(@Nullable Integer num, @Nullable Integer num2, int i, @Nullable QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        this.backgroundColor = num;
        this.foregroundColor = num2;
        this.unitSize = i;
        this.errorCorrectionLevel = qrCodeErrorCorrectionLevel;
        this.versionNumber = num3;
        this.minimumErrorCorrectionPercent = num4;
        this.layers = num5;
    }

    public /* synthetic */ BarcodeGeneratorOptions(Integer num, Integer num2, int i, QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel, Integer num3, Integer num4, Integer num5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : num2, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? null : qrCodeErrorCorrectionLevel, (i2 & 16) != 0 ? null : num3, (i2 & 32) != 0 ? 33 : num4, (i2 & 64) != 0 ? 0 : num5);
    }
}
