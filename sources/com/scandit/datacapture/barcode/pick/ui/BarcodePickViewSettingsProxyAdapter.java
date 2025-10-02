package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010S\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\bT\u0010UJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR$\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R$\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R$\u0010\"\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR$\u0010%\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R$\u0010(\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R$\u0010+\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R$\u0010.\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R$\u00101\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010\u000fR$\u00104\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010\u000fR$\u00107\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b5\u0010\r\"\u0004\b6\u0010\u000fR$\u0010=\u001a\u0002082\u0006\u0010\u000b\u001a\u0002088V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010@\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b>\u0010\r\"\u0004\b?\u0010\u000fR$\u0010C\u001a\u0002082\u0006\u0010\u000b\u001a\u0002088V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bA\u0010:\"\u0004\bB\u0010<R$\u0010F\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bD\u0010\r\"\u0004\bE\u0010\u000fR(\u0010L\u001a\u0004\u0018\u00010G2\b\u0010\u000b\u001a\u0004\u0018\u00010G8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010O\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bM\u0010\u0013\"\u0004\bN\u0010\u0015R$\u0010R\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bP\u0010\u0013\"\u0004\bQ\u0010\u0015¨\u0006V"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettingsProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettingsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewSettings;", "_impl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "p0", "getShowLoadingDialog", "()Z", "setShowLoadingDialog", "(Z)V", "showLoadingDialog", "", "getLoadingDialogText", "()Ljava/lang/String;", "setLoadingDialogText", "(Ljava/lang/String;)V", "loadingDialogText", "getShowGuidelines", "setShowGuidelines", "showGuidelines", "getInitialGuidelineText", "setInitialGuidelineText", "initialGuidelineText", "getMoveCloserGuidelineText", "setMoveCloserGuidelineText", "moveCloserGuidelineText", "getShowHints", "setShowHints", "showHints", "getOnFirstItemToPickFoundHintText", "setOnFirstItemToPickFoundHintText", "onFirstItemToPickFoundHintText", "getOnFirstItemPickCompletedHintText", "setOnFirstItemPickCompletedHintText", "onFirstItemPickCompletedHintText", "getOnFirstUnmarkedItemPickCompletedHintText", "setOnFirstUnmarkedItemPickCompletedHintText", "onFirstUnmarkedItemPickCompletedHintText", "getOnFirstItemUnpickCompletedHintText", "setOnFirstItemUnpickCompletedHintText", "onFirstItemUnpickCompletedHintText", "getShowPauseButton", "setShowPauseButton", "showPauseButton", "getShowFinishButton", "setShowFinishButton", "showFinishButton", "getShowZoomButton", "setShowZoomButton", "showZoomButton", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getZoomButtonPosition", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "setZoomButtonPosition", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "zoomButtonPosition", "getShowTorchButton", "setShowTorchButton", "showTorchButton", "getTorchButtonPosition", "setTorchButtonPosition", "torchButtonPosition", "getHardwareTriggerEnabled", "setHardwareTriggerEnabled", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED, "", "getHardwareTriggerKeyCode", "()Ljava/lang/Integer;", "setHardwareTriggerKeyCode", "(Ljava/lang/Integer;)V", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, "getOnStatusIconShownWhilePausedHintText", "setOnStatusIconShownWhilePausedHintText", "onStatusIconShownWhilePausedHintText", "getTapShutterToPauseGuidelineText", "setTapShutterToPauseGuidelineText", "tapShutterToPauseGuidelineText", "_NativeBarcodePickViewSettings", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewSettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickViewSettingsProxyAdapter implements BarcodePickViewSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePickViewSettings f17954a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodePickViewSettingsProxyAdapter(@NotNull NativeBarcodePickViewSettings _NativeBarcodePickViewSettings, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodePickViewSettings, "_NativeBarcodePickViewSettings");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17954a = _NativeBarcodePickViewSettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodePickViewSettings getF17954a() {
        return this.f17954a;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public boolean getHardwareTriggerEnabled() {
        return this.f17954a.getHardwareTriggerEnabled();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @Nullable
    public Integer getHardwareTriggerKeyCode() {
        return this.f17954a.getHardwareTriggerKeyCode();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @NotNull
    public String getInitialGuidelineText() {
        String _0 = this.f17954a.getInitialGuidelineText();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @NotNull
    public String getLoadingDialogText() {
        String _0 = this.f17954a.getLoadingDialogText();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @NotNull
    public String getMoveCloserGuidelineText() {
        String _0 = this.f17954a.getMoveCloserGuidelineText();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @NotNull
    public String getOnFirstItemPickCompletedHintText() {
        String _0 = this.f17954a.getOnFirstItemPickCompletedHintText();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @NotNull
    public String getOnFirstItemToPickFoundHintText() {
        String _0 = this.f17954a.getOnFirstItemToPickFoundHintText();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @NotNull
    public String getOnFirstItemUnpickCompletedHintText() {
        String _0 = this.f17954a.getOnFirstItemUnpickCompletedHintText();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @NotNull
    public String getOnFirstUnmarkedItemPickCompletedHintText() {
        String _0 = this.f17954a.getOnFirstUnmarkedItemPickCompletedHintText();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @NotNull
    public String getOnStatusIconShownWhilePausedHintText() {
        String _0 = this.f17954a.getOnStatusIconShownWhilePausedHintText();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public boolean getShowFinishButton() {
        return this.f17954a.getShowFinishButton();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public boolean getShowGuidelines() {
        return this.f17954a.getShowGuidelines();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public boolean getShowHints() {
        return this.f17954a.getShowHints();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public boolean getShowLoadingDialog() {
        return this.f17954a.getShowLoadingDialog();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public boolean getShowPauseButton() {
        return this.f17954a.getShowPauseButton();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public boolean getShowTorchButton() {
        return this.f17954a.getShowTorchButton();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public boolean getShowZoomButton() {
        return this.f17954a.getShowZoomButton();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @NotNull
    public String getTapShutterToPauseGuidelineText() {
        String _0 = this.f17954a.getTapShutterToPauseGuidelineText();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @NotNull
    public Anchor getTorchButtonPosition() {
        Anchor _0 = this.f17954a.getTorchButtonPosition();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @NotNull
    public Anchor getZoomButtonPosition() {
        Anchor _0 = this.f17954a.getZoomButtonPosition();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setHardwareTriggerEnabled(boolean z) {
        this.f17954a.setHardwareTriggerEnabled(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setHardwareTriggerKeyCode(@Nullable Integer num) {
        this.f17954a.setHardwareTriggerKeyCode(num);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setInitialGuidelineText(@NotNull String p0) {
        Intrinsics.h(p0, "p0");
        this.f17954a.setInitialGuidelineText(p0);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setLoadingDialogText(@NotNull String p0) {
        Intrinsics.h(p0, "p0");
        this.f17954a.setLoadingDialogText(p0);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setMoveCloserGuidelineText(@NotNull String p0) {
        Intrinsics.h(p0, "p0");
        this.f17954a.setMoveCloserGuidelineText(p0);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setOnFirstItemPickCompletedHintText(@NotNull String p0) {
        Intrinsics.h(p0, "p0");
        this.f17954a.setOnFirstItemPickCompletedHintText(p0);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setOnFirstItemToPickFoundHintText(@NotNull String p0) {
        Intrinsics.h(p0, "p0");
        this.f17954a.setOnFirstItemToPickFoundHintText(p0);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setOnFirstItemUnpickCompletedHintText(@NotNull String p0) {
        Intrinsics.h(p0, "p0");
        this.f17954a.setOnFirstItemUnpickCompletedHintText(p0);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setOnFirstUnmarkedItemPickCompletedHintText(@NotNull String p0) {
        Intrinsics.h(p0, "p0");
        this.f17954a.setOnFirstUnmarkedItemPickCompletedHintText(p0);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setOnStatusIconShownWhilePausedHintText(@NotNull String p0) {
        Intrinsics.h(p0, "p0");
        this.f17954a.setOnStatusIconShownWhilePausedHintText(p0);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setShowFinishButton(boolean z) {
        this.f17954a.setShowFinishButton(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setShowGuidelines(boolean z) {
        this.f17954a.setShowGuidelines(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setShowHints(boolean z) {
        this.f17954a.setShowHints(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setShowLoadingDialog(boolean z) {
        this.f17954a.setShowLoadingDialog(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setShowPauseButton(boolean z) {
        this.f17954a.setShowPauseButton(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setShowTorchButton(boolean z) {
        this.f17954a.setShowTorchButton(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setShowZoomButton(boolean z) {
        this.f17954a.setShowZoomButton(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setTapShutterToPauseGuidelineText(@NotNull String p0) {
        Intrinsics.h(p0, "p0");
        this.f17954a.setTapShutterToPauseGuidelineText(p0);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setTorchButtonPosition(@NotNull Anchor p0) {
        Intrinsics.h(p0, "p0");
        this.f17954a.setTorchButtonPosition(p0);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setZoomButtonPosition(@NotNull Anchor p0) {
        Intrinsics.h(p0, "p0");
        this.f17954a.setZoomButtonPosition(p0);
    }

    public /* synthetic */ BarcodePickViewSettingsProxyAdapter(NativeBarcodePickViewSettings nativeBarcodePickViewSettings, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodePickViewSettings, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
