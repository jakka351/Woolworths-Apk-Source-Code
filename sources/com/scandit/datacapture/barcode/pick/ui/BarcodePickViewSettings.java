package com.scandit.datacapture.barcode.pick.ui;

import android.content.Context;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer;
import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings;
import com.scandit.datacapture.barcode.internal.sdk.pick.ui.BarcodePickViewSettingsDefaults;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\u0006\u0010\u007f\u001a\u00020\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001B\u000b\b\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0082\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0006R*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00100\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010/R\"\u00104\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010/R$\u00108\u001a\u00020#2\u0006\u00105\u001a\u00020#8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b6\u0010'\"\u0004\b7\u0010)R(\u0010>\u001a\u0004\u0018\u0001092\b\u00105\u001a\u0004\u0018\u0001098W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010D\u001a\u00020?2\u0006\u00105\u001a\u00020?8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010G\u001a\u00020?2\u0006\u00105\u001a\u00020?8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bE\u0010A\"\u0004\bF\u0010CR$\u0010J\u001a\u00020?2\u0006\u00105\u001a\u00020?8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bH\u0010A\"\u0004\bI\u0010CR$\u0010M\u001a\u00020?2\u0006\u00105\u001a\u00020?8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bK\u0010A\"\u0004\bL\u0010CR$\u0010P\u001a\u00020?2\u0006\u00105\u001a\u00020?8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bN\u0010A\"\u0004\bO\u0010CR$\u0010S\u001a\u00020?2\u0006\u00105\u001a\u00020?8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bQ\u0010A\"\u0004\bR\u0010CR$\u0010V\u001a\u00020?2\u0006\u00105\u001a\u00020?8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bT\u0010A\"\u0004\bU\u0010CR$\u0010Y\u001a\u00020?2\u0006\u00105\u001a\u00020?8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bW\u0010A\"\u0004\bX\u0010CR$\u0010\\\u001a\u00020#2\u0006\u00105\u001a\u00020#8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bZ\u0010'\"\u0004\b[\u0010)R$\u0010_\u001a\u00020#2\u0006\u00105\u001a\u00020#8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b]\u0010'\"\u0004\b^\u0010)R$\u0010b\u001a\u00020#2\u0006\u00105\u001a\u00020#8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b`\u0010'\"\u0004\ba\u0010)R$\u0010e\u001a\u00020#2\u0006\u00105\u001a\u00020#8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bc\u0010'\"\u0004\bd\u0010)R$\u0010h\u001a\u00020#2\u0006\u00105\u001a\u00020#8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bf\u0010'\"\u0004\bg\u0010)R$\u0010k\u001a\u00020#2\u0006\u00105\u001a\u00020#8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bi\u0010'\"\u0004\bj\u0010)R$\u0010n\u001a\u00020#2\u0006\u00105\u001a\u00020#8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bl\u0010'\"\u0004\bm\u0010)R$\u0010q\u001a\u00020?2\u0006\u00105\u001a\u00020?8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bo\u0010A\"\u0004\bp\u0010CR$\u0010w\u001a\u00020r2\u0006\u00105\u001a\u00020r8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010z\u001a\u00020r2\u0006\u00105\u001a\u00020r8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bx\u0010t\"\u0004\by\u0010vR\u0014\u0010|\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b{\u0010\u0006R\u0014\u0010~\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b}\u0010\u0006¨\u0006\u0083\u0001"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettingsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewSettings;", "_impl", "", "maxIconSize$scandit_barcode_capture", "()F", "maxIconSize", "minIconSize$scandit_barcode_capture", "minIconSize", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;", "value", "b", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;", "getHighlightStyle", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;", "setHighlightStyle", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;)V", "highlightStyle", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "c", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "getUiButtonsOffset", "()Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "setUiButtonsOffset", "(Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;)V", "uiButtonsOffset", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "d", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "getFilterHighlightSettings", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "setFilterHighlightSettings", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;)V", "filterHighlightSettings", "", "e", "Z", "getDrawDebugInfo$scandit_barcode_capture", "()Z", "setDrawDebugInfo$scandit_barcode_capture", "(Z)V", "drawDebugInfo", "f", "F", "getMaxIconSizeForRectangularStyle$scandit_barcode_capture", "setMaxIconSizeForRectangularStyle$scandit_barcode_capture", "(F)V", "maxIconSizeForRectangularStyle", "g", "getIconSizeForDotStyle$scandit_barcode_capture", "setIconSizeForDotStyle$scandit_barcode_capture", "iconSizeForDotStyle", "<set-?>", "getHardwareTriggerEnabled", "setHardwareTriggerEnabled", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED, "", "getHardwareTriggerKeyCode", "()Ljava/lang/Integer;", "setHardwareTriggerKeyCode", "(Ljava/lang/Integer;)V", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, "", "getInitialGuidelineText", "()Ljava/lang/String;", "setInitialGuidelineText", "(Ljava/lang/String;)V", "initialGuidelineText", "getLoadingDialogText", "setLoadingDialogText", "loadingDialogText", "getMoveCloserGuidelineText", "setMoveCloserGuidelineText", "moveCloserGuidelineText", "getOnFirstItemPickCompletedHintText", "setOnFirstItemPickCompletedHintText", "onFirstItemPickCompletedHintText", "getOnFirstItemToPickFoundHintText", "setOnFirstItemToPickFoundHintText", "onFirstItemToPickFoundHintText", "getOnFirstItemUnpickCompletedHintText", "setOnFirstItemUnpickCompletedHintText", "onFirstItemUnpickCompletedHintText", "getOnFirstUnmarkedItemPickCompletedHintText", "setOnFirstUnmarkedItemPickCompletedHintText", "onFirstUnmarkedItemPickCompletedHintText", "getOnStatusIconShownWhilePausedHintText", "setOnStatusIconShownWhilePausedHintText", "onStatusIconShownWhilePausedHintText", "getShowFinishButton", "setShowFinishButton", "showFinishButton", "getShowGuidelines", "setShowGuidelines", "showGuidelines", "getShowHints", "setShowHints", "showHints", "getShowLoadingDialog", "setShowLoadingDialog", "showLoadingDialog", "getShowPauseButton", "setShowPauseButton", "showPauseButton", "getShowTorchButton", "setShowTorchButton", "showTorchButton", "getShowZoomButton", "setShowZoomButton", "showZoomButton", "getTapShutterToPauseGuidelineText", "setTapShutterToPauseGuidelineText", "tapShutterToPauseGuidelineText", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getTorchButtonPosition", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "setTorchButtonPosition", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "torchButtonPosition", "getZoomButtonPosition", "setZoomButtonPosition", "zoomButtonPosition", "getMinimumHighlightWidthPx$scandit_barcode_capture", "minimumHighlightWidthPx", "getMinimumHighlightHeightPx$scandit_barcode_capture", "minimumHighlightHeightPx", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewSettings;)V", "()V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickViewSettings implements BarcodePickViewSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodePickViewSettingsProxyAdapter f17953a;

    /* renamed from: b, reason: from kotlin metadata */
    private BarcodePickViewHighlightStyle highlightStyle;

    /* renamed from: c, reason: from kotlin metadata */
    private FloatWithUnit uiButtonsOffset;

    /* renamed from: d, reason: from kotlin metadata */
    private BarcodeFilterHighlightSettings filterHighlightSettings;

    /* renamed from: e, reason: from kotlin metadata */
    private /* synthetic */ boolean drawDebugInfo;

    /* renamed from: f, reason: from kotlin metadata */
    private /* synthetic */ float maxIconSizeForRectangularStyle;

    /* renamed from: g, reason: from kotlin metadata */
    private /* synthetic */ float iconSizeForDotStyle;

    public BarcodePickViewSettings(@NotNull NativeBarcodePickViewSettings impl) {
        Intrinsics.h(impl, "impl");
        this.f17953a = new BarcodePickViewSettingsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.highlightStyle = BarcodePickViewSettingsDefaults.getHighlightStyle();
        this.uiButtonsOffset = BarcodePickViewSettingsDefaults.getUiButtonsOffset();
        this.filterHighlightSettings = BarcodePickViewSettingsDefaults.getFilterHighlightSettings();
        this.drawDebugInfo = BarcodePickViewSettingsDefaults.getDrawDebugInfo();
        this.maxIconSizeForRectangularStyle = BarcodePickViewSettingsDefaults.getMaxIconSizeForRectangularStyle();
        this.iconSizeForDotStyle = BarcodePickViewSettingsDefaults.getIconSizeForDotStyle();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodePickViewSettings getF17954a() {
        return this.f17953a.getF17954a();
    }

    /* renamed from: getDrawDebugInfo$scandit_barcode_capture, reason: from getter */
    public final boolean getDrawDebugInfo() {
        return this.drawDebugInfo;
    }

    @Nullable
    public final BarcodeFilterHighlightSettings getFilterHighlightSettings() {
        return this.filterHighlightSettings;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED)
    public boolean getHardwareTriggerEnabled() {
        return this.f17953a.getHardwareTriggerEnabled();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE)
    @Nullable
    public Integer getHardwareTriggerKeyCode() {
        return this.f17953a.getHardwareTriggerKeyCode();
    }

    @NotNull
    public final BarcodePickViewHighlightStyle getHighlightStyle() {
        return this.highlightStyle;
    }

    /* renamed from: getIconSizeForDotStyle$scandit_barcode_capture, reason: from getter */
    public final float getIconSizeForDotStyle() {
        return this.iconSizeForDotStyle;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "initialGuidelineText")
    @NotNull
    public String getInitialGuidelineText() {
        return this.f17953a.getInitialGuidelineText();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "loadingDialogText")
    @NotNull
    public String getLoadingDialogText() {
        return this.f17953a.getLoadingDialogText();
    }

    /* renamed from: getMaxIconSizeForRectangularStyle$scandit_barcode_capture, reason: from getter */
    public final float getMaxIconSizeForRectangularStyle() {
        return this.maxIconSizeForRectangularStyle;
    }

    public final float getMinimumHighlightHeightPx$scandit_barcode_capture() {
        Number numberValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        BarcodePickViewHighlightStyle barcodePickViewHighlightStyle = this.highlightStyle;
        Intrinsics.h(barcodePickViewHighlightStyle, "<this>");
        if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular) {
            numberValueOf = Integer.valueOf(((BarcodePickViewHighlightStyle.Rectangular) barcodePickViewHighlightStyle).getMinimumHighlightHeight());
        } else if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons) {
            numberValueOf = Integer.valueOf(((BarcodePickViewHighlightStyle.RectangularWithIcons) barcodePickViewHighlightStyle).getMinimumHighlightHeight());
        } else if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.CustomView) {
            numberValueOf = Integer.valueOf(((BarcodePickViewHighlightStyle.CustomView) barcodePickViewHighlightStyle).getMinimumHighlightHeight());
        } else if (!(barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Dot) && !(barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons)) {
            throw new NoWhenBranchMatchedException();
        }
        return PixelExtensionsKt.pxFromDp$default(numberValueOf.floatValue(), (Context) null, 1, (Object) null);
    }

    public final float getMinimumHighlightWidthPx$scandit_barcode_capture() {
        Number numberValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        BarcodePickViewHighlightStyle barcodePickViewHighlightStyle = this.highlightStyle;
        Intrinsics.h(barcodePickViewHighlightStyle, "<this>");
        if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular) {
            numberValueOf = Integer.valueOf(((BarcodePickViewHighlightStyle.Rectangular) barcodePickViewHighlightStyle).getMinimumHighlightWidth());
        } else if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons) {
            numberValueOf = Integer.valueOf(((BarcodePickViewHighlightStyle.RectangularWithIcons) barcodePickViewHighlightStyle).getMinimumHighlightWidth());
        } else if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.CustomView) {
            numberValueOf = Integer.valueOf(((BarcodePickViewHighlightStyle.CustomView) barcodePickViewHighlightStyle).getMinimumHighlightWidth());
        } else if (!(barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Dot) && !(barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons)) {
            throw new NoWhenBranchMatchedException();
        }
        return PixelExtensionsKt.pxFromDp$default(numberValueOf.floatValue(), (Context) null, 1, (Object) null);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "moveCloserGuidelineText")
    @NotNull
    public String getMoveCloserGuidelineText() {
        return this.f17953a.getMoveCloserGuidelineText();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "onFirstItemPickCompletedHintText")
    @NotNull
    public String getOnFirstItemPickCompletedHintText() {
        return this.f17953a.getOnFirstItemPickCompletedHintText();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "onFirstItemToPickFoundHintText")
    @NotNull
    public String getOnFirstItemToPickFoundHintText() {
        return this.f17953a.getOnFirstItemToPickFoundHintText();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "onFirstItemUnpickCompletedHintText")
    @NotNull
    public String getOnFirstItemUnpickCompletedHintText() {
        return this.f17953a.getOnFirstItemUnpickCompletedHintText();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "onFirstUnmarkedItemPickCompletedHintText")
    @NotNull
    public String getOnFirstUnmarkedItemPickCompletedHintText() {
        return this.f17953a.getOnFirstUnmarkedItemPickCompletedHintText();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "onStatusIconShownWhilePausedHintText")
    @NotNull
    public String getOnStatusIconShownWhilePausedHintText() {
        return this.f17953a.getOnStatusIconShownWhilePausedHintText();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showFinishButton")
    public boolean getShowFinishButton() {
        return this.f17953a.getShowFinishButton();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showGuidelines")
    public boolean getShowGuidelines() {
        return this.f17953a.getShowGuidelines();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showHints")
    public boolean getShowHints() {
        return this.f17953a.getShowHints();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showLoadingDialog")
    public boolean getShowLoadingDialog() {
        return this.f17953a.getShowLoadingDialog();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showPauseButton")
    public boolean getShowPauseButton() {
        return this.f17953a.getShowPauseButton();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showTorchButton")
    public boolean getShowTorchButton() {
        return this.f17953a.getShowTorchButton();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showZoomButton")
    public boolean getShowZoomButton() {
        return this.f17953a.getShowZoomButton();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "tapShutterToPauseGuidelineText")
    @NotNull
    public String getTapShutterToPauseGuidelineText() {
        return this.f17953a.getTapShutterToPauseGuidelineText();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "torchButtonPosition")
    @NotNull
    public Anchor getTorchButtonPosition() {
        return this.f17953a.getTorchButtonPosition();
    }

    @NotNull
    public final FloatWithUnit getUiButtonsOffset() {
        return this.uiButtonsOffset;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "zoomButtonPosition")
    @NotNull
    public Anchor getZoomButtonPosition() {
        return this.f17953a.getZoomButtonPosition();
    }

    public final float maxIconSize$scandit_barcode_capture() {
        BarcodePickViewHighlightStyle barcodePickViewHighlightStyle = this.highlightStyle;
        if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.CustomView) {
            return this.maxIconSizeForRectangularStyle;
        }
        if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Dot ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons) {
            return this.iconSizeForDotStyle;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final float minIconSize$scandit_barcode_capture() {
        BarcodePickViewHighlightStyle barcodePickViewHighlightStyle = this.highlightStyle;
        if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.CustomView) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Dot ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons) {
            return this.iconSizeForDotStyle;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void setDrawDebugInfo$scandit_barcode_capture(boolean z) {
        this.drawDebugInfo = z;
    }

    public final void setFilterHighlightSettings(@Nullable BarcodeFilterHighlightSettings barcodeFilterHighlightSettings) {
        this.filterHighlightSettings = barcodeFilterHighlightSettings;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED)
    public void setHardwareTriggerEnabled(boolean z) {
        this.f17953a.setHardwareTriggerEnabled(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE)
    public void setHardwareTriggerKeyCode(@Nullable Integer num) {
        this.f17953a.setHardwareTriggerKeyCode(num);
    }

    public final void setHighlightStyle(@NotNull BarcodePickViewHighlightStyle value) {
        Intrinsics.h(value, "value");
        getF17954a().setHighlightStyle(value._highlightStyleImpl());
        this.highlightStyle = value;
    }

    public final void setIconSizeForDotStyle$scandit_barcode_capture(float f) {
        this.iconSizeForDotStyle = f;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "initialGuidelineText")
    public void setInitialGuidelineText(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.f17953a.setInitialGuidelineText(str);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "loadingDialogText")
    public void setLoadingDialogText(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.f17953a.setLoadingDialogText(str);
    }

    public final void setMaxIconSizeForRectangularStyle$scandit_barcode_capture(float f) {
        this.maxIconSizeForRectangularStyle = f;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "moveCloserGuidelineText")
    public void setMoveCloserGuidelineText(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.f17953a.setMoveCloserGuidelineText(str);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "onFirstItemPickCompletedHintText")
    public void setOnFirstItemPickCompletedHintText(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.f17953a.setOnFirstItemPickCompletedHintText(str);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "onFirstItemToPickFoundHintText")
    public void setOnFirstItemToPickFoundHintText(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.f17953a.setOnFirstItemToPickFoundHintText(str);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "onFirstItemUnpickCompletedHintText")
    public void setOnFirstItemUnpickCompletedHintText(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.f17953a.setOnFirstItemUnpickCompletedHintText(str);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "onFirstUnmarkedItemPickCompletedHintText")
    public void setOnFirstUnmarkedItemPickCompletedHintText(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.f17953a.setOnFirstUnmarkedItemPickCompletedHintText(str);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "onStatusIconShownWhilePausedHintText")
    public void setOnStatusIconShownWhilePausedHintText(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.f17953a.setOnStatusIconShownWhilePausedHintText(str);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showFinishButton")
    public void setShowFinishButton(boolean z) {
        this.f17953a.setShowFinishButton(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showGuidelines")
    public void setShowGuidelines(boolean z) {
        this.f17953a.setShowGuidelines(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showHints")
    public void setShowHints(boolean z) {
        this.f17953a.setShowHints(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showLoadingDialog")
    public void setShowLoadingDialog(boolean z) {
        this.f17953a.setShowLoadingDialog(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showPauseButton")
    public void setShowPauseButton(boolean z) {
        this.f17953a.setShowPauseButton(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showTorchButton")
    public void setShowTorchButton(boolean z) {
        this.f17953a.setShowTorchButton(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showZoomButton")
    public void setShowZoomButton(boolean z) {
        this.f17953a.setShowZoomButton(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "tapShutterToPauseGuidelineText")
    public void setTapShutterToPauseGuidelineText(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.f17953a.setTapShutterToPauseGuidelineText(str);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "torchButtonPosition")
    public void setTorchButtonPosition(@NotNull Anchor anchor) {
        Intrinsics.h(anchor, "<set-?>");
        this.f17953a.setTorchButtonPosition(anchor);
    }

    public final void setUiButtonsOffset(@NotNull FloatWithUnit floatWithUnit) {
        Intrinsics.h(floatWithUnit, "<set-?>");
        this.uiButtonsOffset = floatWithUnit;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "zoomButtonPosition")
    public void setZoomButtonPosition(@NotNull Anchor anchor) {
        Intrinsics.h(anchor, "<set-?>");
        this.f17953a.setZoomButtonPosition(anchor);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodePickViewSettings() {
        NativeBarcodePickViewSettings nativeBarcodePickViewSettingsCreate = NativeBarcodePickViewSettings.create();
        Intrinsics.g(nativeBarcodePickViewSettingsCreate, "create()");
        this(nativeBarcodePickViewSettingsCreate);
    }
}
