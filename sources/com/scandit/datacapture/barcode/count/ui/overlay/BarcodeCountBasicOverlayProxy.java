package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ProfilingOverlay;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\ba\u0018\u00002\u00020\u0001J\b\u0010\u0013\u001a\u00020\u0014H'J\b\u0010\u0015\u001a\u00020\u0016H'J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH'J\b\u0010\u001b\u001a\u00020\u001cH'J\b\u0010\u001d\u001a\u00020\u001cH'J\b\u0010\u001e\u001a\u00020\u001cH'J\b\u0010\u001f\u001a\u00020\u001cH'J\b\u0010 \u001a\u00020\u001cH'J\b\u0010!\u001a\u00020\u001cH'J\b\u0010\"\u001a\u00020\u001cH'J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u001cH'J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u001cH'J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u001cH'J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u001cH'J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u001cH'J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u001cH'J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u001cH'R(\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006+"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayProxy;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "<set-?>", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "filterSettings", "getFilterSettings", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "setFilterSettings", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;)V", "", "shouldShowScanAreaGuides", "getShouldShowScanAreaGuides", "()Z", "setShouldShowScanAreaGuides", "(Z)V", "style", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_impl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;", "_setProfilingOverlay", "", "overlay", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "getTextForBarcodesNotInListDetectedHint", "", "getTextForMoveCloserAndRescanHint", "getTextForMoveFurtherAndRescanHint", "getTextForScanningHint", "getTextForTapShutterToScanHint", "getTextForTapToUncountHint", "getTextForUnscannedBarcodesDetectedHint", "setTextForBarcodesNotInListDetectedHint", TextBundle.TEXT_ENTRY, "setTextForMoveCloserAndRescanHint", "setTextForMoveFurtherAndRescanHint", "setTextForScanningHint", "setTextForTapShutterToScanHint", "setTextForTapToUncountHint", "setTextForUnscannedBarcodesDetectedHint", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeCountBasicOverlay.class)
/* loaded from: classes6.dex */
public interface BarcodeCountBasicOverlayProxy extends DataCaptureOverlay {
    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    @NativeImpl
    @NotNull
    /* renamed from: _dataCaptureOverlayImpl */
    NativeDataCaptureOverlay getC();

    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    NativeBarcodeCountBasicOverlay getB();

    @ProxyFunction(nativeName = "setProfilingOverlay")
    void _setProfilingOverlay(@NotNull ProfilingOverlay overlay);

    @ProxyFunction(nativeName = "getFilterSettings", property = "filterSettings")
    @Nullable
    BarcodeFilterHighlightSettings getFilterSettings();

    @ProxyFunction(nativeName = "shouldShowScanAreaGuides", property = "shouldShowScanAreaGuides")
    boolean getShouldShowScanAreaGuides();

    @ProxyFunction(property = "style")
    @NotNull
    NativeBarcodeCountBasicOverlayStyle getStyle();

    @ProxyFunction(nativeName = "getTextForWrongBarcodesDetectedHint")
    @NotNull
    String getTextForBarcodesNotInListDetectedHint();

    @ProxyFunction
    @NotNull
    String getTextForMoveCloserAndRescanHint();

    @ProxyFunction
    @NotNull
    String getTextForMoveFurtherAndRescanHint();

    @ProxyFunction
    @NotNull
    String getTextForScanningHint();

    @ProxyFunction
    @NotNull
    String getTextForTapShutterToScanHint();

    @ProxyFunction
    @NotNull
    String getTextForTapToUncountHint();

    @ProxyFunction
    @NotNull
    String getTextForUnscannedBarcodesDetectedHint();

    @ProxyFunction(nativeName = "setFilterSettings", property = "filterSettings")
    void setFilterSettings(@Nullable BarcodeFilterHighlightSettings barcodeFilterHighlightSettings);

    @ProxyFunction(nativeName = "setShouldShowScanAreaGuides", property = "shouldShowScanAreaGuides")
    void setShouldShowScanAreaGuides(boolean z);

    @ProxyFunction(nativeName = "setTextForWrongBarcodesDetectedHint")
    void setTextForBarcodesNotInListDetectedHint(@NotNull String text);

    @ProxyFunction
    void setTextForMoveCloserAndRescanHint(@NotNull String text);

    @ProxyFunction
    void setTextForMoveFurtherAndRescanHint(@NotNull String text);

    @ProxyFunction
    void setTextForScanningHint(@NotNull String text);

    @ProxyFunction
    void setTextForTapShutterToScanHint(@NotNull String text);

    @ProxyFunction
    void setTextForTapToUncountHint(@NotNull String text);

    @ProxyFunction
    void setTextForUnscannedBarcodesDetectedHint(@NotNull String text);
}
