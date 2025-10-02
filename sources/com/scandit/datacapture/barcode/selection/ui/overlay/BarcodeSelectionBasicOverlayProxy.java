package com.scandit.datacapture.barcode.selection.ui.overlay;

import com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ProfilingOverlay;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010%\u001a\u00020&H'J\b\u0010'\u001a\u00020(H'J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H'J\b\u0010-\u001a\u00020*H'J\u0010\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u000200H'J\u0010\u00101\u001a\u00020*2\u0006\u0010/\u001a\u000200H'J\u0010\u00102\u001a\u00020*2\u0006\u0010/\u001a\u000200H'J\u0010\u00103\u001a\u00020*2\u0006\u0010/\u001a\u000200H'J\u0010\u00104\u001a\u00020*2\u0006\u0010/\u001a\u000200H'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00158g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00158g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R$\u0010\"\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\b¨\u00065"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayProxy;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "<set-?>", "Lcom/scandit/datacapture/core/ui/style/Brush;", "aimedBrush", "getAimedBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "setAimedBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)V", "", "frozenBackgroundColor", "getFrozenBackgroundColor", "()I", "setFrozenBackgroundColor", "(I)V", "selectedBrush", "getSelectedBrush", "setSelectedBrush", "selectingBrush", "getSelectingBrush", "setSelectingBrush", "", "shouldShowHints", "getShouldShowHints", "()Z", "setShouldShowHints", "(Z)V", "shouldShowScanAreaGuides", "getShouldShowScanAreaGuides", "setShouldShowScanAreaGuides", "style", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayStyle;", "trackedBrush", "getTrackedBrush", "setTrackedBrush", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_impl", "Lcom/scandit/datacapture/barcode/selection/internal/module/ui/overlay/NativeBarcodeSelectionBasicOverlay;", "_setProfilingOverlay", "", "overlay", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "clearSelectedBarcodeBrushes", "setTextForAimToSelectAutoHint", TextBundle.TEXT_ENTRY, "", "setTextForDoubleTapToUnfreezeHint", "setTextForSelectOrDoubleTapToFreezeHint", "setTextForTapAnywhereToSelectHint", "setTextForTapToSelectHint", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeSelectionBasicOverlay.class)
/* loaded from: classes6.dex */
public interface BarcodeSelectionBasicOverlayProxy extends DataCaptureOverlay {
    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    @NativeImpl
    @NotNull
    /* renamed from: _dataCaptureOverlayImpl */
    NativeDataCaptureOverlay getD();

    @NativeImpl
    @NotNull
    NativeBarcodeSelectionBasicOverlay _impl();

    @ProxyFunction(nativeName = "setProfilingOverlay")
    void _setProfilingOverlay(@NotNull ProfilingOverlay overlay);

    @ProxyFunction
    void clearSelectedBarcodeBrushes();

    @ProxyFunction(property = "aimedBrush")
    @NotNull
    Brush getAimedBrush();

    @ProxyFunction(nativeName = "getFreezeOverlayColor", property = "frozenBackgroundColor")
    int getFrozenBackgroundColor();

    @ProxyFunction(property = "selectedBrush")
    @NotNull
    Brush getSelectedBrush();

    @ProxyFunction(property = "selectingBrush")
    @NotNull
    Brush getSelectingBrush();

    @ProxyFunction(nativeName = "getShowHints", property = "shouldShowHints")
    boolean getShouldShowHints();

    @ProxyFunction(property = "shouldShowScanAreaGuides")
    boolean getShouldShowScanAreaGuides();

    @ProxyFunction(property = "style")
    @NotNull
    BarcodeSelectionBasicOverlayStyle getStyle();

    @ProxyFunction(property = "trackedBrush")
    @NotNull
    Brush getTrackedBrush();

    @ProxyFunction(property = "aimedBrush")
    void setAimedBrush(@NotNull Brush brush);

    @ProxyFunction(nativeName = "setFreezeOverlayColor", property = "frozenBackgroundColor")
    void setFrozenBackgroundColor(int i);

    @ProxyFunction(property = "selectedBrush")
    void setSelectedBrush(@NotNull Brush brush);

    @ProxyFunction(property = "selectingBrush")
    void setSelectingBrush(@NotNull Brush brush);

    @ProxyFunction(nativeName = "setShowHints", property = "shouldShowHints")
    void setShouldShowHints(boolean z);

    @ProxyFunction(property = "shouldShowScanAreaGuides")
    void setShouldShowScanAreaGuides(boolean z);

    @ProxyFunction
    void setTextForAimToSelectAutoHint(@NotNull String text);

    @ProxyFunction
    void setTextForDoubleTapToUnfreezeHint(@NotNull String text);

    @ProxyFunction
    void setTextForSelectOrDoubleTapToFreezeHint(@NotNull String text);

    @ProxyFunction
    void setTextForTapAnywhereToSelectHint(@NotNull String text);

    @ProxyFunction
    void setTextForTapToSelectHint(@NotNull String text);

    @ProxyFunction(property = "trackedBrush")
    void setTrackedBrush(@NotNull Brush brush);
}
