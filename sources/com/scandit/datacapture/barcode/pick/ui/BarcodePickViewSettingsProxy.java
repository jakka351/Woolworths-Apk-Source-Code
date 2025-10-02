package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010K\u001a\u00020LH'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R$\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R$\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R$\u0010!\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R$\u0010$\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R$\u0010'\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R$\u0010*\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR$\u0010-\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR$\u00100\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR$\u00103\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR$\u00106\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR$\u00109\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR$\u0010<\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR$\u0010?\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b@\u0010\u0012\"\u0004\bA\u0010\u0014R$\u0010C\u001a\u00020B2\u0006\u0010\u0002\u001a\u00020B8g@gX¦\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010H\u001a\u00020B2\u0006\u0010\u0002\u001a\u00020B8g@gX¦\u000e¢\u0006\f\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010G¨\u0006M"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettingsProxy;", "", "<set-?>", "", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED, "getHardwareTriggerEnabled", "()Z", "setHardwareTriggerEnabled", "(Z)V", "", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, "getHardwareTriggerKeyCode", "()Ljava/lang/Integer;", "setHardwareTriggerKeyCode", "(Ljava/lang/Integer;)V", "", "initialGuidelineText", "getInitialGuidelineText", "()Ljava/lang/String;", "setInitialGuidelineText", "(Ljava/lang/String;)V", "loadingDialogText", "getLoadingDialogText", "setLoadingDialogText", "moveCloserGuidelineText", "getMoveCloserGuidelineText", "setMoveCloserGuidelineText", "onFirstItemPickCompletedHintText", "getOnFirstItemPickCompletedHintText", "setOnFirstItemPickCompletedHintText", "onFirstItemToPickFoundHintText", "getOnFirstItemToPickFoundHintText", "setOnFirstItemToPickFoundHintText", "onFirstItemUnpickCompletedHintText", "getOnFirstItemUnpickCompletedHintText", "setOnFirstItemUnpickCompletedHintText", "onFirstUnmarkedItemPickCompletedHintText", "getOnFirstUnmarkedItemPickCompletedHintText", "setOnFirstUnmarkedItemPickCompletedHintText", "onStatusIconShownWhilePausedHintText", "getOnStatusIconShownWhilePausedHintText", "setOnStatusIconShownWhilePausedHintText", "showFinishButton", "getShowFinishButton", "setShowFinishButton", "showGuidelines", "getShowGuidelines", "setShowGuidelines", "showHints", "getShowHints", "setShowHints", "showLoadingDialog", "getShowLoadingDialog", "setShowLoadingDialog", "showPauseButton", "getShowPauseButton", "setShowPauseButton", "showTorchButton", "getShowTorchButton", "setShowTorchButton", "showZoomButton", "getShowZoomButton", "setShowZoomButton", "tapShutterToPauseGuidelineText", "getTapShutterToPauseGuidelineText", "setTapShutterToPauseGuidelineText", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "torchButtonPosition", "getTorchButtonPosition", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "setTorchButtonPosition", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "zoomButtonPosition", "getZoomButtonPosition", "setZoomButtonPosition", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewSettings;", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeBarcodePickViewSettings.class)
/* loaded from: classes6.dex */
public interface BarcodePickViewSettingsProxy {
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    NativeBarcodePickViewSettings getF17954a();

    @ProxyFunction(property = BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED)
    boolean getHardwareTriggerEnabled();

    @ProxyFunction(property = BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE)
    @Nullable
    Integer getHardwareTriggerKeyCode();

    @ProxyFunction(property = "initialGuidelineText")
    @NotNull
    String getInitialGuidelineText();

    @ProxyFunction(property = "loadingDialogText")
    @NotNull
    String getLoadingDialogText();

    @ProxyFunction(property = "moveCloserGuidelineText")
    @NotNull
    String getMoveCloserGuidelineText();

    @ProxyFunction(property = "onFirstItemPickCompletedHintText")
    @NotNull
    String getOnFirstItemPickCompletedHintText();

    @ProxyFunction(property = "onFirstItemToPickFoundHintText")
    @NotNull
    String getOnFirstItemToPickFoundHintText();

    @ProxyFunction(property = "onFirstItemUnpickCompletedHintText")
    @NotNull
    String getOnFirstItemUnpickCompletedHintText();

    @ProxyFunction(property = "onFirstUnmarkedItemPickCompletedHintText")
    @NotNull
    String getOnFirstUnmarkedItemPickCompletedHintText();

    @ProxyFunction(property = "onStatusIconShownWhilePausedHintText")
    @NotNull
    String getOnStatusIconShownWhilePausedHintText();

    @ProxyFunction(property = "showFinishButton")
    boolean getShowFinishButton();

    @ProxyFunction(property = "showGuidelines")
    boolean getShowGuidelines();

    @ProxyFunction(property = "showHints")
    boolean getShowHints();

    @ProxyFunction(property = "showLoadingDialog")
    boolean getShowLoadingDialog();

    @ProxyFunction(property = "showPauseButton")
    boolean getShowPauseButton();

    @ProxyFunction(property = "showTorchButton")
    boolean getShowTorchButton();

    @ProxyFunction(property = "showZoomButton")
    boolean getShowZoomButton();

    @ProxyFunction(property = "tapShutterToPauseGuidelineText")
    @NotNull
    String getTapShutterToPauseGuidelineText();

    @ProxyFunction(property = "torchButtonPosition")
    @NotNull
    Anchor getTorchButtonPosition();

    @ProxyFunction(property = "zoomButtonPosition")
    @NotNull
    Anchor getZoomButtonPosition();

    @ProxyFunction(property = BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED)
    void setHardwareTriggerEnabled(boolean z);

    @ProxyFunction(property = BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE)
    void setHardwareTriggerKeyCode(@Nullable Integer num);

    @ProxyFunction(property = "initialGuidelineText")
    void setInitialGuidelineText(@NotNull String str);

    @ProxyFunction(property = "loadingDialogText")
    void setLoadingDialogText(@NotNull String str);

    @ProxyFunction(property = "moveCloserGuidelineText")
    void setMoveCloserGuidelineText(@NotNull String str);

    @ProxyFunction(property = "onFirstItemPickCompletedHintText")
    void setOnFirstItemPickCompletedHintText(@NotNull String str);

    @ProxyFunction(property = "onFirstItemToPickFoundHintText")
    void setOnFirstItemToPickFoundHintText(@NotNull String str);

    @ProxyFunction(property = "onFirstItemUnpickCompletedHintText")
    void setOnFirstItemUnpickCompletedHintText(@NotNull String str);

    @ProxyFunction(property = "onFirstUnmarkedItemPickCompletedHintText")
    void setOnFirstUnmarkedItemPickCompletedHintText(@NotNull String str);

    @ProxyFunction(property = "onStatusIconShownWhilePausedHintText")
    void setOnStatusIconShownWhilePausedHintText(@NotNull String str);

    @ProxyFunction(property = "showFinishButton")
    void setShowFinishButton(boolean z);

    @ProxyFunction(property = "showGuidelines")
    void setShowGuidelines(boolean z);

    @ProxyFunction(property = "showHints")
    void setShowHints(boolean z);

    @ProxyFunction(property = "showLoadingDialog")
    void setShowLoadingDialog(boolean z);

    @ProxyFunction(property = "showPauseButton")
    void setShowPauseButton(boolean z);

    @ProxyFunction(property = "showTorchButton")
    void setShowTorchButton(boolean z);

    @ProxyFunction(property = "showZoomButton")
    void setShowZoomButton(boolean z);

    @ProxyFunction(property = "tapShutterToPauseGuidelineText")
    void setTapShutterToPauseGuidelineText(@NotNull String str);

    @ProxyFunction(property = "torchButtonPosition")
    void setTorchButtonPosition(@NotNull Anchor anchor);

    @ProxyFunction(property = "zoomButtonPosition")
    void setZoomButtonPosition(@NotNull Anchor anchor);
}
