package com.scandit.datacapture.barcode.count.ui.overlay;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.InterfaceC0627g;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountGuidanceHandler;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountViewHandler;
import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterOverlaySettings;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.extensions.BrushExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.ContextExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.OverlayPreconditionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ProfilingOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u008c\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006\u008d\u0001\u008c\u0001\u008e\u0001B\u001f\b\u0000\u0012\u0007\u0010\u0088\u0001\u001a\u00020\u0007\u0012\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001d¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\t\u0010\b\u001a\u00020\u0007H\u0097\u0001J\u0011\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0097\u0001J\t\u0010\u000e\u001a\u00020\rH\u0097\u0001J\t\u0010\u000f\u001a\u00020\rH\u0097\u0001J\t\u0010\u0010\u001a\u00020\rH\u0097\u0001J\t\u0010\u0011\u001a\u00020\rH\u0097\u0001J\t\u0010\u0012\u001a\u00020\rH\u0097\u0001J\t\u0010\u0013\u001a\u00020\rH\u0097\u0001J\t\u0010\u0014\u001a\u00020\rH\u0097\u0001J\u0011\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\rH\u0097\u0001J\u0011\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\rH\u0097\u0001J\u0011\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\rH\u0097\u0001J\u0011\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\rH\u0097\u0001J\u0011\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\rH\u0097\u0001J\u0011\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\rH\u0097\u0001J\u0011\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\rH\u0097\u0001J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b'\u0010(J\b\u0010*\u001a\u00020\u000bH\u0016J\b\u0010+\u001a\u00020\u000bH\u0014J\b\u0010,\u001a\u00020\u000bH\u0014J\u0006\u0010-\u001a\u00020\u000bJ\u0006\u0010.\u001a\u00020\u000bJ\u0006\u0010/\u001a\u00020\u000bJ\u0006\u00100\u001a\u00020\u000bJ\u000e\u00103\u001a\u00020\u000b2\u0006\u00102\u001a\u000201J\u000e\u00104\u001a\u00020\u000b2\u0006\u00102\u001a\u000201J\u000e\u00105\u001a\u00020\u000b2\u0006\u00102\u001a\u000201J\u000e\u00106\u001a\u00020\u000b2\u0006\u00102\u001a\u000201J\u0017\u0010;\u001a\u00020\u000b2\u0006\u00108\u001a\u000207H\u0000¢\u0006\u0004\b9\u0010:J\b\u0010<\u001a\u000207H\u0016J\u0012\u0010>\u001a\u0004\u0018\u00010=2\u0006\u00102\u001a\u000201H\u0016J\u0012\u0010?\u001a\u0004\u0018\u00010=2\u0006\u00102\u001a\u000201H\u0016J\u0012\u0010@\u001a\u0004\u0018\u00010=2\u0006\u00102\u001a\u000201H\u0016J\n\u0010A\u001a\u0004\u0018\u00010=H\u0016R\u001c\u0010F\u001a\u0004\u0018\u00010=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010I\u001a\u0004\u0018\u00010=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010ER\u001c\u0010L\u001a\u0004\u0018\u00010=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010C\u001a\u0004\bK\u0010ER$\u0010T\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010\\\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010d\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR(\u0010k\u001a\u0004\u0018\u00010e2\b\u0010f\u001a\u0004\u0018\u00010e8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010o\u001a\u0002072\u0006\u0010f\u001a\u0002078W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bl\u0010m\"\u0004\bn\u0010:R\u0014\u0010s\u001a\u00020p8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bq\u0010rR.\u0010u\u001a\u0004\u0018\u00010=2\b\u0010t\u001a\u0004\u0018\u00010=8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\bu\u0010C\u001a\u0004\bv\u0010E\"\u0004\bw\u0010xR.\u0010y\u001a\u0004\u0018\u00010=2\b\u0010t\u001a\u0004\u0018\u00010=8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\by\u0010C\u001a\u0004\bz\u0010E\"\u0004\b{\u0010xR.\u0010|\u001a\u0004\u0018\u00010=2\b\u0010t\u001a\u0004\u0018\u00010=8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b|\u0010C\u001a\u0004\b}\u0010E\"\u0004\b~\u0010xR&\u0010\u0081\u0001\u001a\u0002072\u0006\u0010t\u001a\u0002078F@FX\u0086\u000e¢\u0006\r\u001a\u0004\b\u007f\u0010m\"\u0005\b\u0080\u0001\u0010:R+\u0010\u0087\u0001\u001a\u00030\u0082\u00012\u0007\u0010t\u001a\u00030\u0082\u00018@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u008f\u0001"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ViewBasedDataCaptureOverlay;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "Lcom/scandit/datacapture/barcode/g;", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "overlay", "", "_setProfilingOverlay", "", "getTextForBarcodesNotInListDetectedHint", "getTextForMoveCloserAndRescanHint", "getTextForMoveFurtherAndRescanHint", "getTextForScanningHint", "getTextForTapShutterToScanHint", "getTextForTapToUncountHint", "getTextForUnscannedBarcodesDetectedHint", TextBundle.TEXT_ENTRY, "setTextForBarcodesNotInListDetectedHint", "setTextForMoveCloserAndRescanHint", "setTextForMoveFurtherAndRescanHint", "setTextForScanningHint", "setTextForTapShutterToScanHint", "setTextForTapToUncountHint", "setTextForUnscannedBarcodesDetectedHint", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "view", "_setDataCaptureView", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountGuidanceHandler;", "guidanceHandler", "setGuidanceHandler$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountGuidanceHandler;)V", "setGuidanceHandler", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountViewHandler;", "viewHandler", "setViewHandler$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountViewHandler;)V", "setViewHandler", "_cleanupViews", "onAttachedToWindow", "onDetachedFromWindow", "clearHighlights", "listButtonPressed", "exitButtonPressed", "shutterButtonPressed", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "barcode", "didTapScannedBarcode", "didTapUnscannedBarcode", "didTapNotInListBarcode", "didTapFilteredBarcode", "", "statusModeEnabled", "setStatusModeEnabled$scandit_barcode_capture", "(Z)V", "setStatusModeEnabled", "isListenerSet", "Lcom/scandit/datacapture/core/ui/style/Brush;", "brushForTrackedBarcode", "brushForUnscannedTrackedBarcode", "brushForTrackedBarcodeNotInList", "brushFromFilterSettings", "c", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getDefaultRecognizedBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "defaultRecognizedBrush", "d", "getDefaultUnrecognizedBrush", "defaultUnrecognizedBrush", "e", "getDefaultNotInListBrush", "defaultNotInListBrush", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayListener;", "f", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayListener;", "getListener", "()Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayListener;", "setListener", "(Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayUiListener;", "g", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayUiListener;", "getUiListener", "()Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayUiListener;", "setUiListener", "(Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayUiListener;)V", "uiListener", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayCallback;", "h", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayCallback;", "getCallback", "()Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayCallback;", "setCallback", "(Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayCallback;)V", "callback", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "<set-?>", "getFilterSettings", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "setFilterSettings", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;)V", "filterSettings", "getShouldShowScanAreaGuides", "()Z", "setShouldShowScanAreaGuides", "shouldShowScanAreaGuides", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "style", "value", "recognizedBrush", "getRecognizedBrush", "setRecognizedBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)V", "unrecognizedBrush", "getUnrecognizedBrush", "setUnrecognizedBrush", "notInListBrush", "getNotInListBrush", "setNotInListBrush", "getShouldShowHints", "setShouldShowHints", "shouldShowHints", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayColorScheme;", "getColorScheme$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayColorScheme;", "setColorScheme$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayColorScheme;)V", "colorScheme", "impl", "dataCaptureView", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;Lcom/scandit/datacapture/core/ui/DataCaptureView;)V", "Companion", "com/scandit/datacapture/barcode/count/ui/overlay/a", "com/scandit/datacapture/barcode/count/ui/overlay/d", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@SuppressLint
@Mockable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BarcodeCountBasicOverlay extends ViewBasedDataCaptureOverlay implements DataCaptureOverlay, InterfaceC0627g, BarcodeCountBasicOverlayProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final /* synthetic */ BarcodeCountBasicOverlayProxyAdapter b;

    /* renamed from: c, reason: from kotlin metadata */
    private final Brush defaultRecognizedBrush;

    /* renamed from: d, reason: from kotlin metadata */
    private final Brush defaultUnrecognizedBrush;

    /* renamed from: e, reason: from kotlin metadata */
    private final Brush defaultNotInListBrush;

    /* renamed from: f, reason: from kotlin metadata */
    private BarcodeCountBasicOverlayListener listener;

    /* renamed from: g, reason: from kotlin metadata */
    private BarcodeCountBasicOverlayUiListener uiListener;

    /* renamed from: h, reason: from kotlin metadata */
    private BarcodeCountBasicOverlayCallback callback;
    private WeakReference i;
    private a j;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\"\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay$Companion;", "", "Lcom/scandit/datacapture/core/ui/style/Brush;", "defaultRecognizedBrush", "defaultUnrecognizedBrush", "defaultNotInListBrush", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "mode", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "view", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "newInstance", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "style", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Brush defaultNotInListBrush() {
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush nativeBrushDefaultBrushForTrackedBarcodeNotInList = NativeBarcodeCountBasicOverlay.defaultBrushForTrackedBarcodeNotInList();
            Intrinsics.g(nativeBrushDefaultBrushForTrackedBarcodeNotInList, "defaultBrushForTrackedBarcodeNotInList()");
            return BrushExtensionsKt.of(companion, nativeBrushDefaultBrushForTrackedBarcodeNotInList);
        }

        @JvmStatic
        @NotNull
        public final Brush defaultRecognizedBrush() {
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush nativeBrushDefaultBrushForTrackedBarcode = NativeBarcodeCountBasicOverlay.defaultBrushForTrackedBarcode();
            Intrinsics.g(nativeBrushDefaultBrushForTrackedBarcode, "defaultBrushForTrackedBarcode()");
            return BrushExtensionsKt.of(companion, nativeBrushDefaultBrushForTrackedBarcode);
        }

        @JvmStatic
        @NotNull
        public final Brush defaultUnrecognizedBrush() {
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush nativeBrushDefaultBrushForUnscannedTrackedBarcode = NativeBarcodeCountBasicOverlay.defaultBrushForUnscannedTrackedBarcode();
            Intrinsics.g(nativeBrushDefaultBrushForUnscannedTrackedBarcode, "defaultBrushForUnscannedTrackedBarcode()");
            return BrushExtensionsKt.of(companion, nativeBrushDefaultBrushForUnscannedTrackedBarcode);
        }

        @JvmStatic
        @NotNull
        public final BarcodeCountBasicOverlay newInstance(@NotNull BarcodeCount mode, @Nullable DataCaptureView view) {
            Intrinsics.h(mode, "mode");
            OverlayPreconditionsKt.checkAttachedToSameDataCaptureContext(mode, view, b.f17549a);
            BarcodeCountBasicOverlay barcodeCountBasicOverlay = new BarcodeCountBasicOverlay(mode, view, (DefaultConstructorMarker) null);
            BarcodeCountBasicOverlay.INSTANCE.getClass();
            if (view != null) {
                view.addOverlay(barcodeCountBasicOverlay);
            }
            new WeakReference(mode);
            barcodeCountBasicOverlay.getClass();
            return barcodeCountBasicOverlay;
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final BarcodeCountBasicOverlay newInstance(@Nullable DataCaptureView view, @NotNull BarcodeCount mode, @NotNull NativeBarcodeCountBasicOverlayStyle style) {
            Intrinsics.h(mode, "mode");
            Intrinsics.h(style, "style");
            OverlayPreconditionsKt.checkAttachedToSameDataCaptureContext(mode, view, c.f17550a);
            BarcodeCountBasicOverlay barcodeCountBasicOverlay = new BarcodeCountBasicOverlay(mode, view, style, null);
            BarcodeCountBasicOverlay.INSTANCE.getClass();
            if (view != null) {
                view.addOverlay(barcodeCountBasicOverlay);
            }
            new WeakReference(mode);
            barcodeCountBasicOverlay.getClass();
            return barcodeCountBasicOverlay;
        }
    }

    public /* synthetic */ BarcodeCountBasicOverlay(BarcodeCount barcodeCount, DataCaptureView dataCaptureView, NativeBarcodeCountBasicOverlayStyle nativeBarcodeCountBasicOverlayStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataCaptureView, barcodeCount, nativeBarcodeCountBasicOverlayStyle);
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

    @JvmStatic
    @NotNull
    public static final BarcodeCountBasicOverlay newInstance(@NotNull BarcodeCount barcodeCount, @Nullable DataCaptureView dataCaptureView) {
        return INSTANCE.newInstance(barcodeCount, dataCaptureView);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay
    public void _cleanupViews() {
        BarcodeCountBasicOverlayCallback barcodeCountBasicOverlayCallback = this.callback;
        if (barcodeCountBasicOverlayCallback != null) {
            barcodeCountBasicOverlayCallback.cleanUpOverlayViews();
        }
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    @NativeImpl
    @NotNull
    /* renamed from: _dataCaptureOverlayImpl */
    public NativeDataCaptureOverlay getD() {
        return this.b.getD();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeCountBasicOverlay getB() {
        return this.b.getB();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay
    public void _setDataCaptureView(@NotNull DataCaptureView view) {
        DataCaptureView dataCaptureView;
        Intrinsics.h(view, "view");
        this.i = new WeakReference(view);
        if (!isAttachedToWindow() || (dataCaptureView = (DataCaptureView) this.i.get()) == null) {
            return;
        }
        dataCaptureView.addListener(this.j);
        a aVar = this.j;
        int width = dataCaptureView.getWidth();
        int height = dataCaptureView.getHeight();
        Context context = getContext();
        Intrinsics.g(context, "context");
        aVar.onSizeChanged(width, height, ContextExtensionsKt.getRotation(context));
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "setProfilingOverlay")
    public void _setProfilingOverlay(@NotNull ProfilingOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        this.b._setProfilingOverlay(overlay);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0627g
    @Nullable
    public Brush brushForTrackedBarcode(@NotNull TrackedBarcode barcode) {
        Intrinsics.h(barcode, "barcode");
        NativeBrush nativeBrushBrushForTrackedBarcode = getB().brushForTrackedBarcode(barcode.getF18191a());
        if (nativeBrushBrushForTrackedBarcode != null) {
            return BrushExtensionsKt.of(Brush.INSTANCE, nativeBrushBrushForTrackedBarcode);
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0627g
    @Nullable
    public Brush brushForTrackedBarcodeNotInList(@NotNull TrackedBarcode barcode) {
        Intrinsics.h(barcode, "barcode");
        NativeBrush nativeBrushBrushForTrackedBarcodeNotInList = getB().brushForTrackedBarcodeNotInList(barcode.getF18191a());
        if (nativeBrushBrushForTrackedBarcodeNotInList != null) {
            return BrushExtensionsKt.of(Brush.INSTANCE, nativeBrushBrushForTrackedBarcodeNotInList);
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0627g
    @Nullable
    public Brush brushForUnscannedTrackedBarcode(@NotNull TrackedBarcode barcode) {
        Intrinsics.h(barcode, "barcode");
        NativeBrush nativeBrushBrushForUnscannedTrackedBarcode = getB().brushForUnscannedTrackedBarcode(barcode.getF18191a());
        if (nativeBrushBrushForUnscannedTrackedBarcode != null) {
            return BrushExtensionsKt.of(Brush.INSTANCE, nativeBrushBrushForUnscannedTrackedBarcode);
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0627g
    @Nullable
    public Brush brushFromFilterSettings() {
        NativeBrush brush;
        NativeBarcodeFilterOverlaySettings filterSettings = getB().getFilterSettings();
        if (filterSettings == null || (brush = filterSettings.getBrush()) == null) {
            return null;
        }
        return BrushExtensionsKt.of(Brush.INSTANCE, brush);
    }

    public final void clearHighlights() {
        getB().clearHighlightsButtonPressed();
    }

    public final void didTapFilteredBarcode(@NotNull TrackedBarcode barcode) {
        Intrinsics.h(barcode, "barcode");
        getB().didTapFilteredBarcode(barcode.getF18191a());
    }

    public final void didTapNotInListBarcode(@NotNull TrackedBarcode barcode) {
        Intrinsics.h(barcode, "barcode");
        getB().didTapNotInListBarcode(barcode.getF18191a());
    }

    public final void didTapScannedBarcode(@NotNull TrackedBarcode barcode) {
        Intrinsics.h(barcode, "barcode");
        getB().didTapScannedBarcode(barcode.getF18191a());
    }

    public final void didTapUnscannedBarcode(@NotNull TrackedBarcode barcode) {
        Intrinsics.h(barcode, "barcode");
        getB().didTapUnscannedBarcode(barcode.getF18191a());
    }

    public final void exitButtonPressed() {
        getB().exitButtonPressed();
    }

    @Nullable
    public final BarcodeCountBasicOverlayCallback getCallback() {
        return this.callback;
    }

    @NotNull
    public final NativeBarcodeCountBasicOverlayColorScheme getColorScheme$scandit_barcode_capture() {
        NativeBarcodeCountBasicOverlayColorScheme colorScheme = getB().getColorScheme();
        Intrinsics.g(colorScheme, "_impl().colorScheme");
        return colorScheme;
    }

    @Nullable
    public Brush getDefaultNotInListBrush() {
        return this.defaultNotInListBrush;
    }

    @Nullable
    public Brush getDefaultRecognizedBrush() {
        return this.defaultRecognizedBrush;
    }

    @Nullable
    public Brush getDefaultUnrecognizedBrush() {
        return this.defaultUnrecognizedBrush;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "getFilterSettings", property = "filterSettings")
    @Nullable
    public BarcodeFilterHighlightSettings getFilterSettings() {
        return this.b.getFilterSettings();
    }

    @Nullable
    public final BarcodeCountBasicOverlayListener getListener() {
        return this.listener;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0627g
    @Nullable
    public Brush getNotInListBrush() {
        NativeBrush notInListBrush = getB().getNotInListBrush();
        if (notInListBrush != null) {
            return BrushExtensionsKt.of(Brush.INSTANCE, notInListBrush);
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0627g
    @Nullable
    public Brush getRecognizedBrush() {
        NativeBrush scannedBrush = getB().getScannedBrush();
        if (scannedBrush != null) {
            return BrushExtensionsKt.of(Brush.INSTANCE, scannedBrush);
        }
        return null;
    }

    public final boolean getShouldShowHints() {
        return getB().isHintsEnabled();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "shouldShowScanAreaGuides", property = "shouldShowScanAreaGuides")
    public boolean getShouldShowScanAreaGuides() {
        return this.b.getShouldShowScanAreaGuides();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(property = "style")
    @NotNull
    public NativeBarcodeCountBasicOverlayStyle getStyle() {
        return this.b.getStyle();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "getTextForWrongBarcodesDetectedHint")
    @NotNull
    public String getTextForBarcodesNotInListDetectedHint() {
        return this.b.getTextForBarcodesNotInListDetectedHint();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    @NotNull
    public String getTextForMoveCloserAndRescanHint() {
        return this.b.getTextForMoveCloserAndRescanHint();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    @NotNull
    public String getTextForMoveFurtherAndRescanHint() {
        return this.b.getTextForMoveFurtherAndRescanHint();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    @NotNull
    public String getTextForScanningHint() {
        return this.b.getTextForScanningHint();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    @NotNull
    public String getTextForTapShutterToScanHint() {
        return this.b.getTextForTapShutterToScanHint();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    @NotNull
    public String getTextForTapToUncountHint() {
        return this.b.getTextForTapToUncountHint();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    @NotNull
    public String getTextForUnscannedBarcodesDetectedHint() {
        return this.b.getTextForUnscannedBarcodesDetectedHint();
    }

    @Nullable
    public final BarcodeCountBasicOverlayUiListener getUiListener() {
        return this.uiListener;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0627g
    @Nullable
    public Brush getUnrecognizedBrush() {
        NativeBrush unscannedBrush = getB().getUnscannedBrush();
        if (unscannedBrush != null) {
            return BrushExtensionsKt.of(Brush.INSTANCE, unscannedBrush);
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0627g
    public boolean isListenerSet() {
        return this.listener != null;
    }

    public final void listButtonPressed() {
        getB().listButtonPressed();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        DataCaptureView dataCaptureView;
        super.onAttachedToWindow();
        if (this.i.get() == null || (dataCaptureView = (DataCaptureView) this.i.get()) == null) {
            return;
        }
        dataCaptureView.addListener(this.j);
        a aVar = this.j;
        int width = dataCaptureView.getWidth();
        int height = dataCaptureView.getHeight();
        Context context = getContext();
        Intrinsics.g(context, "context");
        aVar.onSizeChanged(width, height, ContextExtensionsKt.getRotation(context));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DataCaptureView dataCaptureView = (DataCaptureView) this.i.get();
        if (dataCaptureView != null) {
            dataCaptureView.removeListener(this.j);
        }
    }

    public final void setCallback(@Nullable BarcodeCountBasicOverlayCallback barcodeCountBasicOverlayCallback) {
        this.callback = barcodeCountBasicOverlayCallback;
    }

    public final void setColorScheme$scandit_barcode_capture(@NotNull NativeBarcodeCountBasicOverlayColorScheme value) {
        Intrinsics.h(value, "value");
        getB().setColorScheme(value);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "setFilterSettings", property = "filterSettings")
    public void setFilterSettings(@Nullable BarcodeFilterHighlightSettings barcodeFilterHighlightSettings) {
        this.b.setFilterSettings(barcodeFilterHighlightSettings);
    }

    public final void setGuidanceHandler$scandit_barcode_capture(@NotNull NativeBarcodeCountGuidanceHandler guidanceHandler) {
        Intrinsics.h(guidanceHandler, "guidanceHandler");
        getB().setGuidanceHandler(guidanceHandler);
    }

    public final void setListener(@Nullable BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener) {
        this.listener = barcodeCountBasicOverlayListener;
    }

    public void setNotInListBrush(@Nullable Brush brush) {
        getB().setNotInListBrush(brush != null ? CoreNativeTypeFactory.INSTANCE.convert(brush) : null);
    }

    public void setRecognizedBrush(@Nullable Brush brush) {
        getB().setScannedBrush(brush != null ? CoreNativeTypeFactory.INSTANCE.convert(brush) : null);
    }

    public final void setShouldShowHints(boolean z) {
        getB().setHintsEnabled(z);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "setShouldShowScanAreaGuides", property = "shouldShowScanAreaGuides")
    public void setShouldShowScanAreaGuides(boolean z) {
        this.b.setShouldShowScanAreaGuides(z);
    }

    public final void setStatusModeEnabled$scandit_barcode_capture(boolean statusModeEnabled) {
        getB().setStatusModeEnabled(statusModeEnabled);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "setTextForWrongBarcodesDetectedHint")
    public void setTextForBarcodesNotInListDetectedHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForBarcodesNotInListDetectedHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public void setTextForMoveCloserAndRescanHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForMoveCloserAndRescanHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public void setTextForMoveFurtherAndRescanHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForMoveFurtherAndRescanHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public void setTextForScanningHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForScanningHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public void setTextForTapShutterToScanHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForTapShutterToScanHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public void setTextForTapToUncountHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForTapToUncountHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public void setTextForUnscannedBarcodesDetectedHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForUnscannedBarcodesDetectedHint(text);
    }

    public final void setUiListener(@Nullable BarcodeCountBasicOverlayUiListener barcodeCountBasicOverlayUiListener) {
        this.uiListener = barcodeCountBasicOverlayUiListener;
    }

    public void setUnrecognizedBrush(@Nullable Brush brush) {
        getB().setUnscannedBrush(brush != null ? CoreNativeTypeFactory.INSTANCE.convert(brush) : null);
    }

    public final void setViewHandler$scandit_barcode_capture(@NotNull NativeBarcodeCountViewHandler viewHandler) {
        Intrinsics.h(viewHandler, "viewHandler");
        getB().setViewHandler(viewHandler);
    }

    public final void shutterButtonPressed() {
        getB().shutterButtonPressed();
    }

    public /* synthetic */ BarcodeCountBasicOverlay(BarcodeCount barcodeCount, DataCaptureView dataCaptureView, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeCount, dataCaptureView);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCountBasicOverlay newInstance(@Nullable DataCaptureView dataCaptureView, @NotNull BarcodeCount barcodeCount, @NotNull NativeBarcodeCountBasicOverlayStyle nativeBarcodeCountBasicOverlayStyle) {
        return INSTANCE.newInstance(dataCaptureView, barcodeCount, nativeBarcodeCountBasicOverlayStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeCountBasicOverlay(@NotNull NativeBarcodeCountBasicOverlay impl, @Nullable DataCaptureView dataCaptureView) {
        super(AppAndroidEnvironment.INSTANCE.getApplicationContext());
        Intrinsics.h(impl, "impl");
        this.b = new BarcodeCountBasicOverlayProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        Companion companion = INSTANCE;
        this.defaultRecognizedBrush = companion.defaultRecognizedBrush();
        this.defaultUnrecognizedBrush = companion.defaultUnrecognizedBrush();
        this.defaultNotInListBrush = companion.defaultNotInListBrush();
        this.i = new WeakReference(dataCaptureView);
        this.j = new a(this);
        impl.setListener(new BarcodeCountBasicOverlayListenerReversedAdapter(new d(this), this, null, 4, null));
        impl.setUiListener(new BarcodeCountBasicOverlayUiListenerReversedAdapter(new d(this), this, null, 4, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private BarcodeCountBasicOverlay(BarcodeCount barcodeCount, DataCaptureView dataCaptureView) {
        NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlayCreate = NativeBarcodeCountBasicOverlay.create(barcodeCount._impl(), NativeBarcodeCountBasicOverlayStyle.ICON);
        Intrinsics.g(nativeBarcodeCountBasicOverlayCreate, "create(\n            mode…erlayStyle.ICON\n        )");
        this(nativeBarcodeCountBasicOverlayCreate, dataCaptureView);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private BarcodeCountBasicOverlay(DataCaptureView dataCaptureView, BarcodeCount barcodeCount, NativeBarcodeCountBasicOverlayStyle nativeBarcodeCountBasicOverlayStyle) {
        NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlayCreate = NativeBarcodeCountBasicOverlay.create(barcodeCount._impl(), nativeBarcodeCountBasicOverlayStyle);
        Intrinsics.g(nativeBarcodeCountBasicOverlayCreate, "create(\n            mode…          style\n        )");
        this(nativeBarcodeCountBasicOverlayCreate, dataCaptureView);
    }
}
