package com.scandit.datacapture.barcode.internal.sdk.count.ui;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyle;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyleExtensionKt;
import com.scandit.datacapture.barcode.internal.module.count.ui.NativeBarcodeCountViewDefaults;
import com.scandit.datacapture.core.common.geometry.Anchor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0002\b\"\bÆ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010!\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u0006R\u0011\u0010#\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0006R\u0011\u0010%\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010\u0006R\u0011\u0010'\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010\u0006R\u0011\u0010)\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0011\u0010+\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b*\u0010\u0006R\u0011\u0010-\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010\u0006R\u0011\u0010/\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b.\u0010\u0006R\u0011\u00103\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00105\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b4\u00102R\u0011\u00107\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b6\u00102R\u0011\u00109\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b8\u00102R\u0011\u0010;\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b:\u00102R\u0011\u0010=\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b<\u00102R\u0011\u0010?\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b>\u00102R\u0011\u0010A\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b@\u00102R\u0011\u0010C\u001a\u0002008F¢\u0006\u0006\u001a\u0004\bB\u00102R\u0011\u0010E\u001a\u0002008F¢\u0006\u0006\u001a\u0004\bD\u00102R\u0011\u0010G\u001a\u0002008F¢\u0006\u0006\u001a\u0004\bF\u00102R\u0011\u0010I\u001a\u0002008F¢\u0006\u0006\u001a\u0004\bH\u00102R\u0011\u0010K\u001a\u0002008F¢\u0006\u0006\u001a\u0004\bJ\u00102R\u0011\u0010M\u001a\u0002008F¢\u0006\u0006\u001a\u0004\bL\u00102R\u0011\u0010O\u001a\u0002008F¢\u0006\u0006\u001a\u0004\bN\u00102R\u0011\u0010Q\u001a\u0002008F¢\u0006\u0006\u001a\u0004\bP\u00102¨\u0006R"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/BarcodeCountViewDefaults;", "", "", "a", "Z", "getShouldShowTorchControl", "()Z", "shouldShowTorchControl", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "b", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getTorchControlPosition", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "setTorchControlPosition", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "torchControlPosition", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;", "style", "getShouldDisableModeOnExitButtonTapped", "shouldDisableModeOnExitButtonTapped", "getShouldShowClearHighlightsButton", "shouldShowClearHighlightsButton", "getShouldShowExitButton", "shouldShowExitButton", "getShouldShowFloatingShutterButton", "shouldShowFloatingShutterButton", "getShouldShowHints", "shouldShowHints", "getShouldShowListButton", "shouldShowListButton", "getShouldShowScanAreaGuides", "shouldShowScanAreaGuides", "getShouldShowShutterButton", "shouldShowShutterButton", "getShouldShowSingleScanButton", "shouldShowSingleScanButton", "getShouldShowStatusModeButton", "shouldShowStatusModeButton", "getShouldShowToolbar", "shouldShowToolbar", "getShouldShowUserGuidanceView", "shouldShowUserGuidanceView", "getShouldShowListProgressBar", "shouldShowListProgressBar", "getTapToUncountEnabled", "tapToUncountEnabled", "", "getClearHighlightsButtonText", "()Ljava/lang/String;", "clearHighlightsButtonText", "getClearHighlightsButtonContentDescription", "clearHighlightsButtonContentDescription", "getExitButtonText", "exitButtonText", "getExitButtonContentDescription", "exitButtonContentDescription", "getFloatingShutterButtonContentDescription", "floatingShutterButtonContentDescription", "getListButtonContentDescription", "listButtonContentDescription", "getShutterButtonContentDescription", "shutterButtonContentDescription", "getSingleScanButtonContentDescription", "singleScanButtonContentDescription", "getStatusModeButtonContentDescription", "statusModeButtonContentDescription", "getTextForBarcodesNotInListDetectedHint", "textForBarcodesNotInListDetectedHint", "getTextForMoveCloserAndRescanHint", "textForMoveCloserAndRescanHint", "getTextForMoveFurtherAndRescanHint", "textForMoveFurtherAndRescanHint", "getTextForScanningHint", "textForScanningHint", "getTextForTapShutterToScanHint", "textForTapShutterToScanHint", "getTextForUnrecognizedBarcodesDetectedHint", "textForUnrecognizedBarcodesDetectedHint", "getTextForTapToUncountHint", "textForTapToUncountHint", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountViewDefaults {

    @NotNull
    public static final BarcodeCountViewDefaults INSTANCE = new BarcodeCountViewDefaults();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final boolean shouldShowTorchControl = NativeBarcodeCountViewDefaults.shouldShowTorchControl();

    /* renamed from: b, reason: from kotlin metadata */
    private static Anchor torchControlPosition;

    static {
        Anchor anchor = NativeBarcodeCountViewDefaults.torchControlPosition();
        Intrinsics.g(anchor, "torchControlPosition()");
        torchControlPosition = anchor;
    }

    private BarcodeCountViewDefaults() {
    }

    @NotNull
    public final String getClearHighlightsButtonContentDescription() {
        String strClearHighlightsButtonContentDescription = NativeBarcodeCountViewDefaults.clearHighlightsButtonContentDescription();
        Intrinsics.g(strClearHighlightsButtonContentDescription, "clearHighlightsButtonContentDescription()");
        return strClearHighlightsButtonContentDescription;
    }

    @NotNull
    public final String getClearHighlightsButtonText() {
        String strClearHighlightsButtonText = NativeBarcodeCountViewDefaults.clearHighlightsButtonText();
        Intrinsics.g(strClearHighlightsButtonText, "clearHighlightsButtonText()");
        return strClearHighlightsButtonText;
    }

    @NotNull
    public final String getExitButtonContentDescription() {
        String strExitButtonContentDescription = NativeBarcodeCountViewDefaults.exitButtonContentDescription();
        Intrinsics.g(strExitButtonContentDescription, "exitButtonContentDescription()");
        return strExitButtonContentDescription;
    }

    @NotNull
    public final String getExitButtonText() {
        String strExitButtonText = NativeBarcodeCountViewDefaults.exitButtonText();
        Intrinsics.g(strExitButtonText, "exitButtonText()");
        return strExitButtonText;
    }

    @NotNull
    public final String getFloatingShutterButtonContentDescription() {
        String strFloatingShutterButtonContentDescription = NativeBarcodeCountViewDefaults.floatingShutterButtonContentDescription();
        Intrinsics.g(strFloatingShutterButtonContentDescription, "floatingShutterButtonContentDescription()");
        return strFloatingShutterButtonContentDescription;
    }

    @NotNull
    public final String getListButtonContentDescription() {
        String strListButtonContentDescription = NativeBarcodeCountViewDefaults.listButtonContentDescription();
        Intrinsics.g(strListButtonContentDescription, "listButtonContentDescription()");
        return strListButtonContentDescription;
    }

    public final boolean getShouldDisableModeOnExitButtonTapped() {
        return NativeBarcodeCountViewDefaults.shouldDisableModeOnExitButtonTapped();
    }

    public final boolean getShouldShowClearHighlightsButton() {
        return NativeBarcodeCountViewDefaults.shouldShowClearHighlightsButton();
    }

    public final boolean getShouldShowExitButton() {
        return NativeBarcodeCountViewDefaults.shouldShowExitButton();
    }

    public final boolean getShouldShowFloatingShutterButton() {
        return NativeBarcodeCountViewDefaults.shouldShowFloatingShutterButton();
    }

    public final boolean getShouldShowHints() {
        return NativeBarcodeCountViewDefaults.shouldShowHints();
    }

    public final boolean getShouldShowListButton() {
        return NativeBarcodeCountViewDefaults.shouldShowListButton();
    }

    public final boolean getShouldShowListProgressBar() {
        return NativeBarcodeCountViewDefaults.shouldShowListProgressBar();
    }

    public final boolean getShouldShowScanAreaGuides() {
        return NativeBarcodeCountViewDefaults.shouldShowScanAreaGuides();
    }

    public final boolean getShouldShowShutterButton() {
        return NativeBarcodeCountViewDefaults.shouldShowShutterButton();
    }

    public final boolean getShouldShowSingleScanButton() {
        return NativeBarcodeCountViewDefaults.shouldShowSingleScanButton();
    }

    public final boolean getShouldShowStatusModeButton() {
        return NativeBarcodeCountViewDefaults.shouldShowStatusModeButton();
    }

    public final boolean getShouldShowToolbar() {
        return NativeBarcodeCountViewDefaults.shouldShowToolbar();
    }

    public final boolean getShouldShowTorchControl() {
        return shouldShowTorchControl;
    }

    public final boolean getShouldShowUserGuidanceView() {
        return NativeBarcodeCountViewDefaults.shouldShowUserGuidanceView();
    }

    @NotNull
    public final String getShutterButtonContentDescription() {
        String strShutterButtonContentDescription = NativeBarcodeCountViewDefaults.shutterButtonContentDescription();
        Intrinsics.g(strShutterButtonContentDescription, "shutterButtonContentDescription()");
        return strShutterButtonContentDescription;
    }

    @NotNull
    public final String getSingleScanButtonContentDescription() {
        String strSingleScanButtonContentDescription = NativeBarcodeCountViewDefaults.singleScanButtonContentDescription();
        Intrinsics.g(strSingleScanButtonContentDescription, "singleScanButtonContentDescription()");
        return strSingleScanButtonContentDescription;
    }

    @NotNull
    public final String getStatusModeButtonContentDescription() {
        String strStatusModeButtonContentDescription = NativeBarcodeCountViewDefaults.statusModeButtonContentDescription();
        Intrinsics.g(strStatusModeButtonContentDescription, "statusModeButtonContentDescription()");
        return strStatusModeButtonContentDescription;
    }

    @NotNull
    public final BarcodeCountViewStyle getStyle() {
        NativeBarcodeCountBasicOverlayStyle nativeBarcodeCountBasicOverlayStyleStyle = NativeBarcodeCountViewDefaults.style();
        Intrinsics.g(nativeBarcodeCountBasicOverlayStyleStyle, "style()");
        return BarcodeCountViewStyleExtensionKt.toViewStyle(nativeBarcodeCountBasicOverlayStyleStyle);
    }

    public final boolean getTapToUncountEnabled() {
        return NativeBarcodeCountViewDefaults.tapToUncountEnabled();
    }

    @NotNull
    public final String getTextForBarcodesNotInListDetectedHint() {
        String strTextForBarcodesNotInListDetectedHint = NativeBarcodeCountViewDefaults.textForBarcodesNotInListDetectedHint();
        Intrinsics.g(strTextForBarcodesNotInListDetectedHint, "textForBarcodesNotInListDetectedHint()");
        return strTextForBarcodesNotInListDetectedHint;
    }

    @NotNull
    public final String getTextForMoveCloserAndRescanHint() {
        String strTextForMoveCloserAndRescanHint = NativeBarcodeCountViewDefaults.textForMoveCloserAndRescanHint();
        Intrinsics.g(strTextForMoveCloserAndRescanHint, "textForMoveCloserAndRescanHint()");
        return strTextForMoveCloserAndRescanHint;
    }

    @NotNull
    public final String getTextForMoveFurtherAndRescanHint() {
        String strTextForMoveFurtherAndRescanHint = NativeBarcodeCountViewDefaults.textForMoveFurtherAndRescanHint();
        Intrinsics.g(strTextForMoveFurtherAndRescanHint, "textForMoveFurtherAndRescanHint()");
        return strTextForMoveFurtherAndRescanHint;
    }

    @NotNull
    public final String getTextForScanningHint() {
        String strTextForScanningHint = NativeBarcodeCountViewDefaults.textForScanningHint();
        Intrinsics.g(strTextForScanningHint, "textForScanningHint()");
        return strTextForScanningHint;
    }

    @NotNull
    public final String getTextForTapShutterToScanHint() {
        String strTextForTapShutterToScanHint = NativeBarcodeCountViewDefaults.textForTapShutterToScanHint();
        Intrinsics.g(strTextForTapShutterToScanHint, "textForTapShutterToScanHint()");
        return strTextForTapShutterToScanHint;
    }

    @NotNull
    public final String getTextForTapToUncountHint() {
        String strTextForTapToUncountDetectedHint = NativeBarcodeCountViewDefaults.textForTapToUncountDetectedHint();
        Intrinsics.g(strTextForTapToUncountDetectedHint, "textForTapToUncountDetectedHint()");
        return strTextForTapToUncountDetectedHint;
    }

    @NotNull
    public final String getTextForUnrecognizedBarcodesDetectedHint() {
        String strTextForUnrecognizedBarcodesDetectedHint = NativeBarcodeCountViewDefaults.textForUnrecognizedBarcodesDetectedHint();
        Intrinsics.g(strTextForUnrecognizedBarcodesDetectedHint, "textForUnrecognizedBarcodesDetectedHint()");
        return strTextForUnrecognizedBarcodesDetectedHint;
    }

    @NotNull
    public final Anchor getTorchControlPosition() {
        return torchControlPosition;
    }

    public final void setTorchControlPosition(@NotNull Anchor anchor) {
        Intrinsics.h(anchor, "<set-?>");
        torchControlPosition = anchor;
    }
}
