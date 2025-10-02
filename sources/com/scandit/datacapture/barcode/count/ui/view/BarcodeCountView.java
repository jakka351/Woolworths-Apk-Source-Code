package com.scandit.datacapture.barcode.count.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.AbstractC0628g0;
import com.scandit.datacapture.barcode.AbstractC0682j6;
import com.scandit.datacapture.barcode.C;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.capture.BarcodeCountSettings;
import com.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayUiListener;
import com.scandit.datacapture.barcode.count.ui.view.status.BarcodeCountStatusProvider;
import com.scandit.datacapture.barcode.count.ui.view.status.InternalBarcodeCountStatusProvider;
import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.barcode.hardwarebutton.HardwareButtonHelperKt;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewInternalUiListener;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewSettings;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountCameraHandler;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler;
import com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.BarcodeCountToolbarViewHolder;
import com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountDataCaptureViewWrapper;
import com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ProfilingOverlay;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.LogoStyle;
import com.scandit.datacapture.core.ui.style.Brush;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 Õ\u00012\u00020\u0001:\u000eÖ\u0001×\u0001Ø\u0001Õ\u0001Ù\u0001Ú\u0001Û\u0001Bp\b\u0000\u0012\b\u0010Á\u0001\u001a\u00030À\u0001\u0012\b\u0010Ã\u0001\u001a\u00030Â\u0001\u0012\b\u0010Å\u0001\u001a\u00030Ä\u0001\u0012\b\u0010Ç\u0001\u001a\u00030Æ\u0001\u0012\u0007\u0010F\u001a\u00030È\u0001\u0012\b\u0010Ê\u0001\u001a\u00030É\u0001\u0012\b\u0010Ì\u0001\u001a\u00030Ë\u0001\u0012\b\u0010Î\u0001\u001a\u00030Í\u0001\u0012\b\u0010Ð\u0001\u001a\u00030Ï\u0001\u0012\n\b\u0002\u0010Ò\u0001\u001a\u00030Ñ\u0001¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\u000f\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\u0006H\u0014J(\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0014J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\u0012J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0012J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u001b\u001a\u00020\u0012J\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u001d\u001a\u00020\u0012J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u001f\u001a\u00020\u0012J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\u0012J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010#\u001a\u00020\u0012J\u000e\u0010$\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010%\u001a\u00020\u0012J\u000e\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&J\u000e\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)J\u0016\u00100\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.J\u0016\u00101\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.J\u0016\u00102\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.J\u0017\u00104\u001a\u00020\u00062\b\u00103\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b4\u00105J\u000e\u00106\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u00107\u001a\u00020\u0012J\u000e\u00108\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u00109\u001a\u00020\u0012J\u000e\u0010:\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010;\u001a\u00020\u0012J\u000e\u0010<\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010=\u001a\u00020\u0012J\u000e\u0010>\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010?\u001a\u00020\u0012J\u000e\u0010@\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010A\u001a\u00020\u0012J\u000e\u0010B\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010C\u001a\u00020\u0012J\u0006\u0010D\u001a\u00020\u0006J\u000e\u0010G\u001a\u00020\u00062\u0006\u0010F\u001a\u00020ER \u0010N\u001a\u00020H8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bI\u0010J\u0012\u0004\bM\u0010\t\u001a\u0004\bK\u0010LR$\u0010U\u001a\u0004\u0018\u00010)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010\\\u001a\u00020V2\u0006\u0010W\u001a\u00020V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010_\u001a\u00020V2\u0006\u0010W\u001a\u00020V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010Y\"\u0004\b^\u0010[R$\u0010b\u001a\u00020V2\u0006\u0010W\u001a\u00020V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010Y\"\u0004\ba\u0010[R$\u0010e\u001a\u00020V2\u0006\u0010W\u001a\u00020V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010Y\"\u0004\bd\u0010[R$\u0010h\u001a\u00020V2\u0006\u0010W\u001a\u00020V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010Y\"\u0004\bg\u0010[R$\u0010k\u001a\u00020V2\u0006\u0010W\u001a\u00020V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010Y\"\u0004\bj\u0010[R$\u0010n\u001a\u00020V2\u0006\u0010W\u001a\u00020V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010Y\"\u0004\bm\u0010[R$\u0010q\u001a\u00020V2\u0006\u0010W\u001a\u00020V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010Y\"\u0004\bp\u0010[R$\u0010t\u001a\u00020V2\u0006\u0010W\u001a\u00020V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010Y\"\u0004\bs\u0010[R$\u0010w\u001a\u00020V2\u0006\u0010W\u001a\u00020V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bu\u0010Y\"\u0004\bv\u0010[R$\u0010z\u001a\u00020V2\u0006\u0010W\u001a\u00020V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bx\u0010Y\"\u0004\by\u0010[R$\u0010}\u001a\u00020V2\u0006\u0010W\u001a\u00020V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010Y\"\u0004\b|\u0010[R(\u0010\u0083\u0001\u001a\u00020~2\u0006\u0010W\u001a\u00020~8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R'\u0010\u0086\u0001\u001a\u00020V2\u0006\u0010W\u001a\u00020V8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010Y\"\u0005\b\u0085\u0001\u0010[R/\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0087\u00012\t\u0010W\u001a\u0005\u0018\u00010\u0087\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R/\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008d\u00012\t\u0010W\u001a\u0005\u0018\u00010\u008d\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R9\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0093\u00012\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00018F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001*\u0006\b\u0099\u0001\u0010\u009a\u0001R3\u0010¡\u0001\u001a\u00020\f2\u0007\u0010\u0094\u0001\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001*\u0006\b \u0001\u0010\u009a\u0001R'\u0010¤\u0001\u001a\u00020V2\u0006\u0010W\u001a\u00020V8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¢\u0001\u0010Y\"\u0005\b£\u0001\u0010[R\u0015\u0010¨\u0001\u001a\u00030¥\u00018F¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R'\u0010«\u0001\u001a\u00020V2\u0006\u0010W\u001a\u00020V8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b©\u0001\u0010Y\"\u0005\bª\u0001\u0010[R-\u0010°\u0001\u001a\u0004\u0018\u00010.2\b\u0010W\u001a\u0004\u0018\u00010.8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R-\u0010³\u0001\u001a\u0004\u0018\u00010.2\b\u0010W\u001a\u0004\u0018\u00010.8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b±\u0001\u0010\u00ad\u0001\"\u0006\b²\u0001\u0010¯\u0001R-\u0010¶\u0001\u001a\u0004\u0018\u00010.2\b\u0010W\u001a\u0004\u0018\u00010.8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b´\u0001\u0010\u00ad\u0001\"\u0006\bµ\u0001\u0010¯\u0001R'\u0010¹\u0001\u001a\u00020V2\u0006\u0010W\u001a\u00020V8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b·\u0001\u0010Y\"\u0005\b¸\u0001\u0010[R/\u0010¿\u0001\u001a\u0005\u0018\u00010º\u00012\t\u0010W\u001a\u0005\u0018\u00010º\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001¨\u0006Ü\u0001"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;", "Landroid/widget/RelativeLayout;", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/toolbar/BarcodeCountToolbarViewHolder;", "getToolbar$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/count/ui/toolbar/BarcodeCountToolbarViewHolder;", "getToolbar", "", "onAttachedToWindow", "disableScanningAndResetBarcodeIndicators$scandit_barcode_capture", "()V", "disableScanningAndResetBarcodeIndicators", "onDetachedFromWindow", "", "w", "h", "oldw", "oldh", "onSizeChanged", "", TextBundle.TEXT_ENTRY, "setClearHighlightsButtonText", "getClearHighlightsButtonText", "setExitButtonText", "getExitButtonText", "setClearHighlightsButtonContentDescription", "getClearHighlightsButtonContentDescription", "setExitButtonContentDescription", "getExitButtonContentDescription", "setFloatingShutterButtonContentDescription", "getFloatingShutterButtonContentDescription", "setListButtonContentDescription", "getListButtonContentDescription", "setSingleScanButtonContentDescription", "getSingleScanButtonContentDescription", "setShutterButtonContentDescription", "getShutterButtonContentDescription", "setStatusModeButtonContentDescription", "getStatusModeButtonContentDescription", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountToolbarSettings;", "settings", "setToolbarSettings", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusProvider;", "provider", "setStatusProvider", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "barcode", "Lcom/scandit/datacapture/core/ui/style/Brush;", "brush", "setBrushForRecognizedBarcode", "setBrushForUnrecognizedBarcode", "setBrushForRecognizedBarcodeNotInList", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, "enableHardwareTrigger", "(Ljava/lang/Integer;)V", "setTextForUnrecognizedBarcodesDetectedHint", "getTextForUnrecognizedBarcodesDetectedHint", "setTextForBarcodesNotInListDetectedHint", "getTextForBarcodesNotInListDetectedHint", "setTextForTapShutterToScanHint", "getTextForTapShutterToScanHint", "setTextForScanningHint", "getTextForScanningHint", "setTextForMoveCloserAndRescanHint", "getTextForMoveCloserAndRescanHint", "setTextForMoveFurtherAndRescanHint", "getTextForMoveFurtherAndRescanHint", "setTextForTapToUncountHint", "getTextForTapToUncountHint", "clearHighlights", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "overlay", "_setProfilingOverlay", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/BarcodeCountViewSettings;", "l", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/BarcodeCountViewSettings;", "getViewSettings$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/count/ui/BarcodeCountViewSettings;", "getViewSettings$scandit_barcode_capture$annotations", "viewSettings", "n", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusProvider;", "getStatusProvider$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusProvider;", "setStatusProvider$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusProvider;)V", "statusProvider", "", "value", "getShouldDisableModeOnExitButtonTapped", "()Z", "setShouldDisableModeOnExitButtonTapped", "(Z)V", "shouldDisableModeOnExitButtonTapped", "getShouldShowClearHighlightsButton", "setShouldShowClearHighlightsButton", "shouldShowClearHighlightsButton", "getShouldShowExitButton", "setShouldShowExitButton", "shouldShowExitButton", "getShouldShowFloatingShutterButton", "setShouldShowFloatingShutterButton", "shouldShowFloatingShutterButton", "getShouldShowListButton", "setShouldShowListButton", "shouldShowListButton", "getShouldShowShutterButton", "setShouldShowShutterButton", "shouldShowShutterButton", "getShouldShowSingleScanButton", "setShouldShowSingleScanButton", "shouldShowSingleScanButton", "getShouldShowStatusModeButton", "setShouldShowStatusModeButton", "shouldShowStatusModeButton", "getShouldShowToolbar", "setShouldShowToolbar", "shouldShowToolbar", "getShouldShowUserGuidanceView", "setShouldShowUserGuidanceView", "shouldShowUserGuidanceView", "getShouldShowListProgressBar", "setShouldShowListProgressBar", "shouldShowListProgressBar", "getShouldShowTorchControl", "setShouldShowTorchControl", "shouldShowTorchControl", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getTorchControlPosition", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "setTorchControlPosition", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "torchControlPosition", "getTapToUncountEnabled", "setTapToUncountEnabled", "tapToUncountEnabled", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewListener;", "getListener", "()Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewListener;", "setListener", "(Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewUiListener;", "getUiListener", "()Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewUiListener;", "setUiListener", "(Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewUiListener;)V", "uiListener", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/BarcodeCountViewInternalUiListener;", "<set-?>", "get_internalUiListener", "()Lcom/scandit/datacapture/barcode/internal/module/count/ui/BarcodeCountViewInternalUiListener;", "set_internalUiListener", "(Lcom/scandit/datacapture/barcode/internal/module/count/ui/BarcodeCountViewInternalUiListener;)V", "get_internalUiListener$delegate", "(Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;)Ljava/lang/Object;", "_internalUiListener", "get_scanningDelayMs", "()I", "set_scanningDelayMs", "(I)V", "get_scanningDelayMs$delegate", "_scanningDelayMs", "get_forceAlignCameraPreviewToBottomInPortrait", "set_forceAlignCameraPreviewToBottomInPortrait", "_forceAlignCameraPreviewToBottomInPortrait", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;", "style", "getShouldShowScanAreaGuides", "setShouldShowScanAreaGuides", "shouldShowScanAreaGuides", "getRecognizedBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "setRecognizedBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)V", "recognizedBrush", "getUnrecognizedBrush", "setUnrecognizedBrush", "unrecognizedBrush", "getNotInListBrush", "setNotInListBrush", "notInListBrush", "getShouldShowHints", "setShouldShowHints", "shouldShowHints", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "getFilterSettings", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "setFilterSettings", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;)V", "filterSettings", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "barcodeCount", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/BarcodeCountViewLayerManager;", "layerManager", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/wrappers/BarcodeCountDataCaptureViewWrapper;", "dataCaptureViewWrapper", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/wrappers/BarcodeCountViewUiLayoutHelper;", "layoutHelper", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/handlers/BarcodeCountUiHandler;", "uiHandler", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/handlers/BarcodeCountBrushHandler;", "brushHandler", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/barcodeindicator/BarcodeIndicatorPresenter;", "indicatorPresenter", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/handlers/BarcodeCountCameraHandler;", "cameraHandler", "<init>", "(Landroid/content/Context;Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;Lcom/scandit/datacapture/barcode/internal/module/count/ui/BarcodeCountViewLayerManager;Lcom/scandit/datacapture/barcode/internal/module/count/ui/wrappers/BarcodeCountDataCaptureViewWrapper;Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;Lcom/scandit/datacapture/barcode/internal/module/count/ui/wrappers/BarcodeCountViewUiLayoutHelper;Lcom/scandit/datacapture/barcode/internal/module/count/ui/handlers/BarcodeCountUiHandler;Lcom/scandit/datacapture/barcode/internal/module/count/ui/handlers/BarcodeCountBrushHandler;Lcom/scandit/datacapture/barcode/internal/module/count/ui/barcodeindicator/BarcodeIndicatorPresenter;Lcom/scandit/datacapture/barcode/internal/module/count/ui/handlers/BarcodeCountCameraHandler;)V", "Companion", "com/scandit/datacapture/barcode/count/ui/view/a", "com/scandit/datacapture/barcode/count/ui/view/b", "com/scandit/datacapture/barcode/count/ui/view/c", "com/scandit/datacapture/barcode/count/ui/view/d", "com/scandit/datacapture/barcode/count/ui/view/f", "com/scandit/datacapture/barcode/count/ui/view/h", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@SuppressLint
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BarcodeCountView extends RelativeLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final BarcodeCountViewLayerManager b;
    private final BarcodeCountDataCaptureViewWrapper c;
    private final BarcodeCountBasicOverlay d;
    private final BarcodeCountViewUiLayoutHelper e;
    private final BarcodeCountUiHandler f;
    private final BarcodeCountBrushHandler g;
    private final BarcodeIndicatorPresenter h;
    private final BarcodeCountCameraHandler i;
    private final Handler j;
    private final WeakReference k;

    /* renamed from: l, reason: from kotlin metadata */
    private final BarcodeCountViewSettings viewSettings;
    private boolean m;

    /* renamed from: n, reason: from kotlin metadata */
    private BarcodeCountStatusProvider statusProvider;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\"\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J*\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0007J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007R\u001a\u0010\u0017\u001a\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView$Companion;", "", "Lcom/scandit/datacapture/core/ui/style/Brush;", "defaultRecognizedBrush", "defaultUnrecognizedBrush", "defaultNotInListBrush", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "mode", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;", "newInstance", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;", "style", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "dataCaptureView", "", "getHardwareTriggerSupported", "()Z", "getHardwareTriggerSupported$annotations", "()V", "hardwareTriggerSupported", "", "LIST_COMPLETE_NOTIFICATION_DELAY_MS", "J", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getHardwareTriggerSupported$annotations() {
        }

        @JvmStatic
        @NotNull
        public final Brush defaultNotInListBrush() {
            return BarcodeCountBasicOverlay.INSTANCE.defaultNotInListBrush();
        }

        @JvmStatic
        @NotNull
        public final Brush defaultRecognizedBrush() {
            return BarcodeCountBasicOverlay.INSTANCE.defaultRecognizedBrush();
        }

        @JvmStatic
        @NotNull
        public final Brush defaultUnrecognizedBrush() {
            return BarcodeCountBasicOverlay.INSTANCE.defaultUnrecognizedBrush();
        }

        public final boolean getHardwareTriggerSupported() {
            return HardwareButtonHelperKt.isHardwareTriggerSupported();
        }

        @JvmStatic
        @NotNull
        public final BarcodeCountView newInstance(@NotNull Context context, @Nullable DataCaptureContext dataCaptureContext, @NotNull BarcodeCount mode) {
            Intrinsics.h(context, "context");
            Intrinsics.h(mode, "mode");
            return newInstance(context, dataCaptureContext, mode, BarcodeCountViewStyle.ICON);
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final BarcodeCountView newInstance(@NotNull Context context, @Nullable DataCaptureContext dataCaptureContext, @NotNull BarcodeCount mode, @NotNull BarcodeCountViewStyle style) {
            Intrinsics.h(context, "context");
            Intrinsics.h(mode, "mode");
            Intrinsics.h(style, "style");
            DataCaptureView dataCaptureViewNewInstance = DataCaptureView.INSTANCE.newInstance(context, dataCaptureContext);
            dataCaptureViewNewInstance.setLogoStyle(LogoStyle.MINIMAL);
            dataCaptureViewNewInstance.setLogoAnchor(Anchor.BOTTOM_LEFT);
            return newInstance(context, dataCaptureViewNewInstance, mode, style);
        }

        @JvmStatic
        @NotNull
        public final BarcodeCountView newInstance(@NotNull Context context, @NotNull DataCaptureView dataCaptureView, @NotNull BarcodeCount mode) {
            Intrinsics.h(context, "context");
            Intrinsics.h(dataCaptureView, "dataCaptureView");
            Intrinsics.h(mode, "mode");
            return newInstance(context, dataCaptureView, mode, BarcodeCountViewStyle.ICON);
        }

        @JvmStatic
        @NotNull
        public final BarcodeCountView newInstance(@NotNull Context context, @NotNull DataCaptureView dataCaptureView, @NotNull BarcodeCount mode, @NotNull BarcodeCountViewStyle style) {
            Intrinsics.h(context, "context");
            Intrinsics.h(dataCaptureView, "dataCaptureView");
            Intrinsics.h(mode, "mode");
            Intrinsics.h(style, "style");
            return AbstractC0628g0.a(context, dataCaptureView, mode, style);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BarcodeCountScreenRatioForUi.values().length];
            try {
                iArr[BarcodeCountScreenRatioForUi.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ BarcodeCountView(Context context, BarcodeCount barcodeCount, BarcodeCountViewLayerManager barcodeCountViewLayerManager, BarcodeCountDataCaptureViewWrapper barcodeCountDataCaptureViewWrapper, BarcodeCountBasicOverlay barcodeCountBasicOverlay, BarcodeCountViewUiLayoutHelper barcodeCountViewUiLayoutHelper, BarcodeCountUiHandler barcodeCountUiHandler, BarcodeCountBrushHandler barcodeCountBrushHandler, BarcodeIndicatorPresenter barcodeIndicatorPresenter, BarcodeCountCameraHandler barcodeCountCameraHandler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, barcodeCount, barcodeCountViewLayerManager, barcodeCountDataCaptureViewWrapper, barcodeCountBasicOverlay, barcodeCountViewUiLayoutHelper, barcodeCountUiHandler, barcodeCountBrushHandler, barcodeIndicatorPresenter, (i & 512) != 0 ? new C(barcodeCount) : barcodeCountCameraHandler);
    }

    private final BarcodeCountViewSettings a() {
        BarcodeCountViewSettings barcodeCountViewSettings = new BarcodeCountViewSettings();
        this.f.a(barcodeCountViewSettings);
        return barcodeCountViewSettings;
    }

    public static final void access$disableStatusMode(BarcodeCountView barcodeCountView) {
        barcodeCountView.h.a(false, true);
        barcodeCountView.h.b(true, true);
        barcodeCountView.f.d();
    }

    public static final void access$enableStatusMode(BarcodeCountView barcodeCountView) {
        barcodeCountView.f.c();
        barcodeCountView.h.b(false, true);
        barcodeCountView.h.a(true, true);
    }

    public static final void access$setListUiEnabled(BarcodeCountView barcodeCountView, boolean z, int i) {
        barcodeCountView.m = z;
        barcodeCountView.f.b(z);
        BarcodeCountUiHandler barcodeCountUiHandler = barcodeCountView.f;
        Context context = barcodeCountView.getContext();
        Intrinsics.g(context, "context");
        barcodeCountUiHandler.a(z, AbstractC0682j6.a(context));
        barcodeCountView.h.a(z);
        if (barcodeCountView.isAttachedToWindow()) {
            barcodeCountView.e();
            barcodeCountView.a(i);
        }
    }

    @JvmStatic
    @NotNull
    public static final Brush defaultNotInListBrush() {
        return INSTANCE.defaultNotInListBrush();
    }

    @JvmStatic
    @NotNull
    public static final Brush defaultRecognizedBrush() {
        return INSTANCE.defaultRecognizedBrush();
    }

    @JvmStatic
    @NotNull
    public static final Brush defaultUnrecognizedBrush() {
        return INSTANCE.defaultUnrecognizedBrush();
    }

    private final void e() {
        post(new j(this, 0));
    }

    private final void f() {
        Size sizeB = b();
        this.f.a(c(), sizeB);
        RelativeLayout.LayoutParams layoutParamsA = a(sizeB);
        this.c.a(layoutParamsA);
        this.b.a(layoutParamsA);
        Context context = getContext();
        Intrinsics.g(context, "context");
        if (AbstractC0682j6.a(context) || this.e.g() == BarcodeCountScreenRatioForUi.SMALL || get_forceAlignCameraPreviewToBottomInPortrait()) {
            this.b.c().setLayoutParams(a(sizeB));
        }
        BarcodeCountUiHandler barcodeCountUiHandler = this.f;
        boolean z = this.m;
        Context context2 = getContext();
        Intrinsics.g(context2, "context");
        barcodeCountUiHandler.a(z, AbstractC0682j6.a(context2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        BarcodeCount barcodeCount = (BarcodeCount) this.k.get();
        if (barcodeCount != null) {
            this.f.a(barcodeCount);
        }
    }

    public static final boolean getHardwareTriggerSupported() {
        return INSTANCE.getHardwareTriggerSupported();
    }

    @VisibleForTesting
    public static /* synthetic */ void getViewSettings$scandit_barcode_capture$annotations() {
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCountView newInstance(@NotNull Context context, @Nullable DataCaptureContext dataCaptureContext, @NotNull BarcodeCount barcodeCount) {
        return INSTANCE.newInstance(context, dataCaptureContext, barcodeCount);
    }

    public final void _setProfilingOverlay(@NotNull ProfilingOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        this.d._setProfilingOverlay(overlay);
    }

    public final void clearHighlights() {
        this.d.clearHighlights();
    }

    public final void disableScanningAndResetBarcodeIndicators$scandit_barcode_capture() {
        BarcodeCount barcodeCount = (BarcodeCount) this.k.get();
        if (barcodeCount != null) {
            barcodeCount.endScanningPhase();
        }
        this.h.reset();
    }

    public final void enableHardwareTrigger(@Nullable Integer hardwareTriggerKeyCode) {
        HardwareButtonHelperKt.setupHardwareTrigger(this, hardwareTriggerKeyCode, new i(this.f));
    }

    @NotNull
    public final String getClearHighlightsButtonContentDescription() {
        return this.viewSettings.a();
    }

    @NotNull
    public final String getClearHighlightsButtonText() {
        return this.viewSettings.b();
    }

    @NotNull
    public final String getExitButtonContentDescription() {
        return this.viewSettings.c();
    }

    @NotNull
    public final String getExitButtonText() {
        return this.viewSettings.d();
    }

    @Nullable
    public final BarcodeFilterHighlightSettings getFilterSettings() {
        return this.viewSettings.e();
    }

    @NotNull
    public final String getFloatingShutterButtonContentDescription() {
        return this.viewSettings.f();
    }

    @NotNull
    public final String getListButtonContentDescription() {
        return this.viewSettings.g();
    }

    @Nullable
    public final BarcodeCountViewListener getListener() {
        WeakReference weakReferenceA;
        BarcodeCountBasicOverlayListener listener = this.d.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        b bVar = listener instanceof b ? (b) listener : null;
        if (bVar == null || (weakReferenceA = bVar.a()) == null) {
            return null;
        }
        return (BarcodeCountViewListener) weakReferenceA.get();
    }

    @Nullable
    public final Brush getNotInListBrush() {
        return this.viewSettings.h();
    }

    @Nullable
    public final Brush getRecognizedBrush() {
        return this.viewSettings.i();
    }

    public final boolean getShouldDisableModeOnExitButtonTapped() {
        return this.viewSettings.j();
    }

    public final boolean getShouldShowClearHighlightsButton() {
        return this.viewSettings.k();
    }

    public final boolean getShouldShowExitButton() {
        return this.viewSettings.l();
    }

    public final boolean getShouldShowFloatingShutterButton() {
        return this.viewSettings.m();
    }

    public final boolean getShouldShowHints() {
        return this.viewSettings.n();
    }

    public final boolean getShouldShowListButton() {
        return this.viewSettings.o();
    }

    public final boolean getShouldShowListProgressBar() {
        return this.viewSettings.p();
    }

    public final boolean getShouldShowScanAreaGuides() {
        return this.viewSettings.q();
    }

    public final boolean getShouldShowShutterButton() {
        return this.viewSettings.r();
    }

    public final boolean getShouldShowSingleScanButton() {
        return this.viewSettings.s();
    }

    public final boolean getShouldShowStatusModeButton() {
        return this.viewSettings.t();
    }

    public final boolean getShouldShowToolbar() {
        return this.viewSettings.u();
    }

    public final boolean getShouldShowTorchControl() {
        return this.viewSettings.v();
    }

    public final boolean getShouldShowUserGuidanceView() {
        return this.viewSettings.w();
    }

    @NotNull
    public final String getShutterButtonContentDescription() {
        return this.viewSettings.x();
    }

    @NotNull
    public final String getSingleScanButtonContentDescription() {
        return this.viewSettings.y();
    }

    @NotNull
    public final String getStatusModeButtonContentDescription() {
        return this.viewSettings.z();
    }

    @Nullable
    /* renamed from: getStatusProvider$scandit_barcode_capture, reason: from getter */
    public final BarcodeCountStatusProvider getStatusProvider() {
        return this.statusProvider;
    }

    @NotNull
    public final BarcodeCountViewStyle getStyle() {
        return BarcodeCountViewStyleExtensionKt.toViewStyle(this.d.getStyle());
    }

    public final boolean getTapToUncountEnabled() {
        BarcodeCountSettings d;
        BarcodeCount barcodeCount = (BarcodeCount) this.k.get();
        boolean tapToUncountEnabled = (barcodeCount == null || (d = barcodeCount.getD()) == null) ? BarcodeCountViewDefaults.INSTANCE.getTapToUncountEnabled() : d.isTapToUncountEnabled$scandit_barcode_capture();
        this.viewSettings.getClass();
        return tapToUncountEnabled;
    }

    @NotNull
    public final String getTextForBarcodesNotInListDetectedHint() {
        return this.viewSettings.A();
    }

    @NotNull
    public final String getTextForMoveCloserAndRescanHint() {
        return this.viewSettings.B();
    }

    @NotNull
    public final String getTextForMoveFurtherAndRescanHint() {
        return this.viewSettings.C();
    }

    @NotNull
    public final String getTextForScanningHint() {
        return this.viewSettings.D();
    }

    @NotNull
    public final String getTextForTapShutterToScanHint() {
        return this.viewSettings.E();
    }

    @NotNull
    public final String getTextForTapToUncountHint() {
        return this.viewSettings.F();
    }

    @NotNull
    public final String getTextForUnrecognizedBarcodesDetectedHint() {
        return this.viewSettings.G();
    }

    @VisibleForTesting
    @Nullable
    public final BarcodeCountToolbarViewHolder getToolbar$scandit_barcode_capture() {
        return this.f.f();
    }

    @NotNull
    public final Anchor getTorchControlPosition() {
        return this.viewSettings.I();
    }

    @Nullable
    public final BarcodeCountViewUiListener getUiListener() {
        BarcodeCountBasicOverlayUiListener uiListener = this.d.getUiListener();
        c cVar = uiListener instanceof c ? (c) uiListener : null;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    @Nullable
    public final Brush getUnrecognizedBrush() {
        return this.viewSettings.J();
    }

    @NotNull
    /* renamed from: getViewSettings$scandit_barcode_capture, reason: from getter */
    public final BarcodeCountViewSettings getViewSettings() {
        return this.viewSettings;
    }

    public final boolean get_forceAlignCameraPreviewToBottomInPortrait() {
        return this.f.a();
    }

    @Nullable
    public final BarcodeCountViewInternalUiListener get_internalUiListener() {
        return this.f.b();
    }

    public final int get_scanningDelayMs() {
        return this.f.h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f();
        this.c.b(this.d);
        g();
        setShouldShowFloatingShutterButton(this.f.e());
        this.h.a(this.d.getColorScheme$scandit_barcode_capture());
        this.h.a(this.b.e());
        BarcodeCount barcodeCount = (BarcodeCount) this.k.get();
        if (barcodeCount == null || !barcodeCount.isCaptureListSet$scandit_barcode_capture()) {
            e();
            a(0);
            return;
        }
        int captureListTargetQuantity$scandit_barcode_capture = barcodeCount.getCaptureListTargetQuantity$scandit_barcode_capture();
        this.m = true;
        this.f.b(true);
        BarcodeCountUiHandler barcodeCountUiHandler = this.f;
        Context context = getContext();
        Intrinsics.g(context, "context");
        barcodeCountUiHandler.a(true, AbstractC0682j6.a(context));
        this.h.a(true);
        if (isAttachedToWindow()) {
            e();
            a(captureListTargetQuantity$scandit_barcode_capture);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.a(this.d);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        d();
    }

    public final void setBrushForRecognizedBarcode(@NotNull TrackedBarcode barcode, @NotNull Brush brush) {
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(brush, "brush");
        this.g.a(barcode, brush);
        this.h.a(barcode);
    }

    public final void setBrushForRecognizedBarcodeNotInList(@NotNull TrackedBarcode barcode, @NotNull Brush brush) {
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(brush, "brush");
        this.g.b(barcode, brush);
        this.h.a(barcode);
    }

    public final void setBrushForUnrecognizedBarcode(@NotNull TrackedBarcode barcode, @NotNull Brush brush) {
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(brush, "brush");
        this.g.c(barcode, brush);
        this.h.a(barcode);
    }

    public final void setClearHighlightsButtonContentDescription(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.viewSettings.a(text);
        this.f.b(this.viewSettings);
    }

    public final void setClearHighlightsButtonText(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.viewSettings.b(text);
        this.f.b(this.viewSettings);
    }

    public final void setExitButtonContentDescription(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.viewSettings.c(text);
        this.f.b(this.viewSettings);
    }

    public final void setExitButtonText(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.viewSettings.d(text);
        this.f.b(this.viewSettings);
    }

    public final void setFilterSettings(@Nullable BarcodeFilterHighlightSettings barcodeFilterHighlightSettings) {
        this.viewSettings.a(barcodeFilterHighlightSettings);
        this.f.b(this.viewSettings);
    }

    public final void setFloatingShutterButtonContentDescription(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.viewSettings.e(text);
        this.f.b(this.viewSettings);
    }

    public final void setListButtonContentDescription(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.viewSettings.f(text);
        this.f.b(this.viewSettings);
    }

    public final void setListener(@Nullable BarcodeCountViewListener barcodeCountViewListener) {
        this.d.setListener(barcodeCountViewListener != null ? new b(barcodeCountViewListener, this) : null);
    }

    public final void setNotInListBrush(@Nullable Brush brush) {
        this.viewSettings.a(brush);
        this.f.b(this.viewSettings);
    }

    public final void setRecognizedBrush(@Nullable Brush brush) {
        this.viewSettings.b(brush);
        this.f.b(this.viewSettings);
    }

    public final void setShouldDisableModeOnExitButtonTapped(boolean z) {
        this.viewSettings.a(z);
        this.f.b(this.viewSettings);
    }

    public final void setShouldShowClearHighlightsButton(boolean z) {
        this.viewSettings.b(z);
        this.f.b(this.viewSettings);
    }

    public final void setShouldShowExitButton(boolean z) {
        this.viewSettings.c(z);
        this.f.b(this.viewSettings);
    }

    public final void setShouldShowFloatingShutterButton(boolean z) {
        this.viewSettings.d(z);
        this.f.b(this.viewSettings);
    }

    public final void setShouldShowHints(boolean z) {
        this.viewSettings.e(z);
        this.f.b(this.viewSettings);
    }

    public final void setShouldShowListButton(boolean z) {
        this.viewSettings.f(z);
        this.f.b(this.viewSettings);
    }

    public final void setShouldShowListProgressBar(boolean z) {
        this.viewSettings.g(z);
        this.f.b(this.viewSettings);
    }

    public final void setShouldShowScanAreaGuides(boolean z) {
        this.viewSettings.h(z);
        this.f.b(this.viewSettings);
    }

    public final void setShouldShowShutterButton(boolean z) {
        this.viewSettings.i(z);
        this.f.b(this.viewSettings);
    }

    public final void setShouldShowSingleScanButton(boolean z) {
        this.viewSettings.j(z);
        this.f.b(this.viewSettings);
    }

    public final void setShouldShowStatusModeButton(boolean z) {
        this.viewSettings.k(z);
        this.f.b(this.viewSettings);
    }

    public final void setShouldShowToolbar(boolean z) {
        this.viewSettings.l(z);
        this.f.b(this.viewSettings);
    }

    public final void setShouldShowTorchControl(boolean z) {
        this.viewSettings.m(z);
        this.f.b(this.viewSettings);
    }

    public final void setShouldShowUserGuidanceView(boolean z) {
        this.viewSettings.n(z);
        this.f.b(this.viewSettings);
    }

    public final void setShutterButtonContentDescription(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.viewSettings.g(text);
        this.f.b(this.viewSettings);
    }

    public final void setSingleScanButtonContentDescription(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.viewSettings.h(text);
        this.f.b(this.viewSettings);
    }

    public final void setStatusModeButtonContentDescription(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.viewSettings.i(text);
        this.f.b(this.viewSettings);
    }

    public final void setStatusProvider(@NotNull BarcodeCountStatusProvider provider) {
        Intrinsics.h(provider, "provider");
        BarcodeCount barcodeCount = (BarcodeCount) this.k.get();
        if (barcodeCount != null) {
            barcodeCount.setInternalStatusProvider$scandit_barcode_capture(new InternalBarcodeCountStatusProvider(this));
        }
        this.statusProvider = provider;
    }

    public final void setStatusProvider$scandit_barcode_capture(@Nullable BarcodeCountStatusProvider barcodeCountStatusProvider) {
        this.statusProvider = barcodeCountStatusProvider;
    }

    public final void setTapToUncountEnabled(boolean z) {
        BarcodeCount barcodeCount = (BarcodeCount) this.k.get();
        if (barcodeCount != null) {
            BarcodeCountSettings d = barcodeCount.getD();
            d.setTapToUncountEnabled$scandit_barcode_capture(z);
            BarcodeCount.applySettings$default(barcodeCount, d, null, 2, null);
            this.viewSettings.getClass();
        }
    }

    public final void setTextForBarcodesNotInListDetectedHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.viewSettings.j(text);
        this.f.b(this.viewSettings);
    }

    public final void setTextForMoveCloserAndRescanHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.viewSettings.k(text);
        this.f.b(this.viewSettings);
    }

    public final void setTextForMoveFurtherAndRescanHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.viewSettings.l(text);
        this.f.b(this.viewSettings);
    }

    public final void setTextForScanningHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.viewSettings.m(text);
        this.f.b(this.viewSettings);
    }

    public final void setTextForTapShutterToScanHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.viewSettings.n(text);
        this.f.b(this.viewSettings);
    }

    public final void setTextForTapToUncountHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.viewSettings.o(text);
        this.f.b(this.viewSettings);
    }

    public final void setTextForUnrecognizedBarcodesDetectedHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.viewSettings.p(text);
        this.f.b(this.viewSettings);
    }

    public final void setToolbarSettings(@NotNull BarcodeCountToolbarSettings settings) {
        Intrinsics.h(settings, "settings");
        this.viewSettings.a(settings);
        this.f.b(this.viewSettings);
    }

    public final void setTorchControlPosition(@NotNull Anchor value) {
        Intrinsics.h(value, "value");
        this.viewSettings.a(value);
        this.f.b(this.viewSettings);
    }

    public final void setUiListener(@Nullable BarcodeCountViewUiListener barcodeCountViewUiListener) {
        this.d.setUiListener(barcodeCountViewUiListener != null ? new c(barcodeCountViewUiListener, this) : null);
    }

    public final void setUnrecognizedBrush(@Nullable Brush brush) {
        this.viewSettings.c(brush);
        this.f.b(this.viewSettings);
    }

    public final void set_forceAlignCameraPreviewToBottomInPortrait(boolean z) {
        this.f.a(z);
        d();
    }

    public final void set_internalUiListener(@Nullable BarcodeCountViewInternalUiListener barcodeCountViewInternalUiListener) {
        this.f.a(barcodeCountViewInternalUiListener);
    }

    public final void set_scanningDelayMs(int i) {
        this.f.b(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(BarcodeCountView this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.f.i();
    }

    private final Size c() {
        Configuration configuration = getContext().getResources().getConfiguration();
        return new Size(PixelExtensionsKt.pxFromDp$default(configuration.screenWidthDp, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(configuration.screenHeightDp, (Context) null, 1, (Object) null));
    }

    private final void d() {
        post(new j(this, 1));
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCountView newInstance(@NotNull Context context, @Nullable DataCaptureContext dataCaptureContext, @NotNull BarcodeCount barcodeCount, @NotNull BarcodeCountViewStyle barcodeCountViewStyle) {
        return INSTANCE.newInstance(context, dataCaptureContext, barcodeCount, barcodeCountViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeCountView(@NotNull Context context, @NotNull BarcodeCount barcodeCount, @NotNull BarcodeCountViewLayerManager layerManager, @NotNull BarcodeCountDataCaptureViewWrapper dataCaptureViewWrapper, @NotNull BarcodeCountBasicOverlay overlay, @NotNull BarcodeCountViewUiLayoutHelper layoutHelper, @NotNull BarcodeCountUiHandler uiHandler, @NotNull BarcodeCountBrushHandler brushHandler, @NotNull BarcodeIndicatorPresenter indicatorPresenter, @NotNull BarcodeCountCameraHandler cameraHandler) {
        super(context);
        Intrinsics.h(context, "context");
        Intrinsics.h(barcodeCount, "barcodeCount");
        Intrinsics.h(layerManager, "layerManager");
        Intrinsics.h(dataCaptureViewWrapper, "dataCaptureViewWrapper");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(layoutHelper, "layoutHelper");
        Intrinsics.h(uiHandler, "uiHandler");
        Intrinsics.h(brushHandler, "brushHandler");
        Intrinsics.h(indicatorPresenter, "indicatorPresenter");
        Intrinsics.h(cameraHandler, "cameraHandler");
        this.b = layerManager;
        this.c = dataCaptureViewWrapper;
        this.d = overlay;
        this.e = layoutHelper;
        this.f = uiHandler;
        this.g = brushHandler;
        this.h = indicatorPresenter;
        this.i = cameraHandler;
        this.j = new Handler(Looper.getMainLooper());
        a aVar = new a(this);
        this.k = new WeakReference(barcodeCount);
        this.viewSettings = a();
        layoutHelper.a(layerManager.g());
        uiHandler.a(layerManager, barcodeCount, true);
        uiHandler.a(new h(this));
        uiHandler.a(c(), b());
        dataCaptureViewWrapper.a(this);
        layerManager.a(this);
        setBackgroundColor(-16777216);
        g();
        barcodeCount.getListListeners$scandit_barcode_capture().add(0, aVar);
        barcodeCount.setFeedbackChangeListener$scandit_barcode_capture(new d(this));
        overlay.setCallback(new f(this));
    }

    private final void a(int i) {
        post(new androidx.core.content.res.a(i, 4, this));
    }

    private final Size b() {
        Size sizeC = c();
        Context context = getContext();
        Intrinsics.g(context, "context");
        if (AbstractC0682j6.a(context)) {
            int height = getHeight();
            Integer numValueOf = Integer.valueOf(height);
            if (height == 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : sizeC.getHeight();
            return new Size((iIntValue * 4) / 3, iIntValue);
        }
        return new Size(sizeC.getWidth(), (int) ((sizeC.getWidth() * 4) / 3));
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCountView newInstance(@NotNull Context context, @NotNull DataCaptureView dataCaptureView, @NotNull BarcodeCount barcodeCount) {
        return INSTANCE.newInstance(context, dataCaptureView, barcodeCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BarcodeCountView this$0, int i) {
        Intrinsics.h(this$0, "this$0");
        if (this$0.m) {
            this$0.f.a(i);
        }
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCountView newInstance(@NotNull Context context, @NotNull DataCaptureView dataCaptureView, @NotNull BarcodeCount barcodeCount, @NotNull BarcodeCountViewStyle barcodeCountViewStyle) {
        return INSTANCE.newInstance(context, dataCaptureView, barcodeCount, barcodeCountViewStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BarcodeCountView this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.f();
        this$0.e();
    }

    private final RelativeLayout.LayoutParams a(Size size) {
        BarcodeCountScreenRatioForUi barcodeCountScreenRatioForUiG = this.e.g();
        Context context = getContext();
        Intrinsics.g(context, "context");
        if (AbstractC0682j6.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(size.getWidth(), -1);
            if (WhenMappings.$EnumSwitchMapping$0[barcodeCountScreenRatioForUiG.ordinal()] == 1) {
                layoutParams.addRule(13);
                return layoutParams;
            }
            layoutParams.addRule(20);
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, size.getHeight());
        if (get_forceAlignCameraPreviewToBottomInPortrait()) {
            layoutParams2.addRule(12);
            return layoutParams2;
        }
        if (barcodeCountScreenRatioForUiG == BarcodeCountScreenRatioForUi.LARGE) {
            layoutParams2.addRule(13);
            return layoutParams2;
        }
        layoutParams2.addRule(20);
        return layoutParams2;
    }
}
