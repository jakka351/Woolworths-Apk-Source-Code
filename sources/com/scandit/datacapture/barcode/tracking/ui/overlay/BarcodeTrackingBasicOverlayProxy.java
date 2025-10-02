package com.scandit.datacapture.barcode.tracking.ui.overlay;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ProfilingOverlay;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0013\u001a\u00020\u0014H'J\b\u0010\u0015\u001a\u00020\u0016H'J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH'J\b\u0010\u001b\u001a\u00020\u0018H'J\u001a\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H'R(\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayProxy;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "<set-?>", "Lcom/scandit/datacapture/core/ui/style/Brush;", "brush", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "setBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)V", "", "shouldShowScanAreaGuides", "getShouldShowScanAreaGuides", "()Z", "setShouldShowScanAreaGuides", "(Z)V", "style", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayStyle;", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_impl", "Lcom/scandit/datacapture/barcode/tracking/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlay;", "_setProfilingOverlay", "", "overlay", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "clearTrackedBarcodeBrushes", "setBrushForTrackedBarcode", "trackedBarcode", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeTrackingBasicOverlay.class)
/* loaded from: classes6.dex */
public interface BarcodeTrackingBasicOverlayProxy extends DataCaptureOverlay {
    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    @NativeImpl
    @NotNull
    /* renamed from: _dataCaptureOverlayImpl */
    NativeDataCaptureOverlay getC();

    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    NativeBarcodeTrackingBasicOverlay getB();

    @ProxyFunction(nativeName = "setProfilingOverlay")
    void _setProfilingOverlay(@NotNull ProfilingOverlay overlay);

    @ProxyFunction
    void clearTrackedBarcodeBrushes();

    @ProxyFunction(nativeName = "getDefaultBrush", property = "brush")
    @Nullable
    Brush getBrush();

    @ProxyFunction(property = "shouldShowScanAreaGuides")
    boolean getShouldShowScanAreaGuides();

    @ProxyFunction(property = "style")
    @NotNull
    BarcodeTrackingBasicOverlayStyle getStyle();

    @ProxyFunction(nativeName = "setDefaultBrush", property = "brush")
    void setBrush(@Nullable Brush brush);

    @ProxyFunction(nativeName = "setTrackedBarcodeBrush")
    void setBrushForTrackedBarcode(@NotNull TrackedBarcode trackedBarcode, @Nullable Brush brush);

    @ProxyFunction(property = "shouldShowScanAreaGuides")
    void setShouldShowScanAreaGuides(boolean z);
}
