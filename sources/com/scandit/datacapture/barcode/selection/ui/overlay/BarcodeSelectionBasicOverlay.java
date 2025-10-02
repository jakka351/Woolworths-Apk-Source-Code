package com.scandit.datacapture.barcode.selection.ui.overlay;

import com.scandit.datacapture.barcode.selection.capture.BarcodeSelection;
import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionBrushProvider;
import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionBrushProviderReversedAdapter;
import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializer;
import com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay;
import com.scandit.datacapture.core.internal.sdk.extensions.BrushExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.OverlayPreconditionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ProfilingOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.core.ui.viewfinder.AimerViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.Viewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0003NMOB\u0019\b\u0000\u0012\u0006\u0010J\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\bK\u0010LJ\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\t\u0010\u000b\u001a\u00020\tH\u0097\u0001J\u0011\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0097\u0001J\u0011\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0097\u0001J\u0011\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0097\u0001J\u0011\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0097\u0001J\u0011\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0097\u0001J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\fR\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010&\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R$\u0010-\u001a\u00020'2\u0006\u0010(\u001a\u00020'8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00103\u001a\u00020.2\u0006\u0010(\u001a\u00020.8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00106\u001a\u00020'2\u0006\u0010(\u001a\u00020'8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b4\u0010*\"\u0004\b5\u0010,R$\u00109\u001a\u00020'2\u0006\u0010(\u001a\u00020'8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R$\u0010?\u001a\u00020:2\u0006\u0010(\u001a\u00020:8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010B\u001a\u00020:2\u0006\u0010(\u001a\u00020:8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R\u0014\u0010F\u001a\u00020C8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER$\u0010I\u001a\u00020'2\u0006\u0010(\u001a\u00020'8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bG\u0010*\"\u0004\bH\u0010,¨\u0006P"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/barcode/selection/internal/module/ui/overlay/NativeBarcodeSelectionBasicOverlay;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "overlay", "", "_setProfilingOverlay", "clearSelectedBarcodeBrushes", "", TextBundle.TEXT_ENTRY, "setTextForAimToSelectAutoHint", "setTextForDoubleTapToUnfreezeHint", "setTextForSelectOrDoubleTapToFreezeHint", "setTextForTapAnywhereToSelectHint", "setTextForTapToSelectHint", "jsonData", "updateFromJson", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "b", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "getViewfinder", "()Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "viewfinder", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionBrushProvider;", "d", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionBrushProvider;", "getAimedBarcodeBrushProvider", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionBrushProvider;", "setAimedBarcodeBrushProvider", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionBrushProvider;)V", "aimedBarcodeBrushProvider", "e", "getTrackedBarcodeBrushProvider", "setTrackedBarcodeBrushProvider", "trackedBarcodeBrushProvider", "Lcom/scandit/datacapture/core/ui/style/Brush;", "<set-?>", "getAimedBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "setAimedBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)V", "aimedBrush", "", "getFrozenBackgroundColor", "()I", "setFrozenBackgroundColor", "(I)V", "frozenBackgroundColor", "getSelectedBrush", "setSelectedBrush", "selectedBrush", "getSelectingBrush", "setSelectingBrush", "selectingBrush", "", "getShouldShowHints", "()Z", "setShouldShowHints", "(Z)V", "shouldShowHints", "getShouldShowScanAreaGuides", "setShouldShowScanAreaGuides", "shouldShowScanAreaGuides", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayStyle;", "style", "getTrackedBrush", "setTrackedBrush", "trackedBrush", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/ui/overlay/NativeBarcodeSelectionBasicOverlay;Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;)V", "Companion", "com/scandit/datacapture/barcode/selection/ui/overlay/a", "com/scandit/datacapture/barcode/selection/ui/overlay/d", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionBasicOverlay implements DataCaptureOverlay, BarcodeSelectionBasicOverlayProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Brush DEFAULT_AIMED_BRUSH;

    @JvmField
    @NotNull
    public static final Brush DEFAULT_SELECTED_BRUSH;

    @JvmField
    @NotNull
    public static final Brush DEFAULT_SELECTING_BRUSH;

    @JvmField
    @NotNull
    public static final Brush DEFAULT_TRACKED_BRUSH;

    /* renamed from: b, reason: from kotlin metadata */
    private final Viewfinder viewfinder;
    private final /* synthetic */ BarcodeSelectionBasicOverlayProxyAdapter c;

    /* renamed from: d, reason: from kotlin metadata */
    private BarcodeSelectionBrushProvider aimedBarcodeBrushProvider;

    /* renamed from: e, reason: from kotlin metadata */
    private BarcodeSelectionBrushProvider trackedBarcodeBrushProvider;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007J\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007R\u001a\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u0012\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u0012\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u0012\u0004\b\u001c\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay$Companion;", "", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayStyle;", "style", "Lcom/scandit/datacapture/core/ui/style/Brush;", "defaultTrackedBrush", "defaultAimedBrush", "defaultSelectingBrush", "defaultSelectedBrush", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;", "barcodeSelection", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "view", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;", "newInstance", "mode", "", "jsonData", "fromJson", "DEFAULT_AIMED_BRUSH", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getDEFAULT_AIMED_BRUSH$annotations", "()V", "DEFAULT_SELECTED_BRUSH", "getDEFAULT_SELECTED_BRUSH$annotations", "DEFAULT_SELECTING_BRUSH", "getDEFAULT_SELECTING_BRUSH$annotations", "DEFAULT_TRACKED_BRUSH", "getDEFAULT_TRACKED_BRUSH$annotations", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated
        public static /* synthetic */ void getDEFAULT_AIMED_BRUSH$annotations() {
        }

        @Deprecated
        public static /* synthetic */ void getDEFAULT_SELECTED_BRUSH$annotations() {
        }

        @Deprecated
        public static /* synthetic */ void getDEFAULT_SELECTING_BRUSH$annotations() {
        }

        @Deprecated
        public static /* synthetic */ void getDEFAULT_TRACKED_BRUSH$annotations() {
        }

        @JvmStatic
        @NotNull
        public final Brush defaultAimedBrush(@NotNull BarcodeSelectionBasicOverlayStyle style) {
            Intrinsics.h(style, "style");
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush defaultAimedBrushForStyle = NativeBarcodeSelectionBasicOverlay.getDefaultAimedBrushForStyle(style);
            Intrinsics.g(defaultAimedBrushForStyle, "getDefaultAimedBrushForStyle(style)");
            return BrushExtensionsKt.of(companion, defaultAimedBrushForStyle);
        }

        @JvmStatic
        @NotNull
        public final Brush defaultSelectedBrush(@NotNull BarcodeSelectionBasicOverlayStyle style) {
            Intrinsics.h(style, "style");
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush defaultSelectedBrushForStyle = NativeBarcodeSelectionBasicOverlay.getDefaultSelectedBrushForStyle(style);
            Intrinsics.g(defaultSelectedBrushForStyle, "getDefaultSelectedBrushForStyle(style)");
            return BrushExtensionsKt.of(companion, defaultSelectedBrushForStyle);
        }

        @JvmStatic
        @NotNull
        public final Brush defaultSelectingBrush(@NotNull BarcodeSelectionBasicOverlayStyle style) {
            Intrinsics.h(style, "style");
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush defaultSelectingBrushForStyle = NativeBarcodeSelectionBasicOverlay.getDefaultSelectingBrushForStyle(style);
            Intrinsics.g(defaultSelectingBrushForStyle, "getDefaultSelectingBrushForStyle(style)");
            return BrushExtensionsKt.of(companion, defaultSelectingBrushForStyle);
        }

        @JvmStatic
        @NotNull
        public final Brush defaultTrackedBrush(@NotNull BarcodeSelectionBasicOverlayStyle style) {
            Intrinsics.h(style, "style");
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush defaultTrackedBrushForStyle = NativeBarcodeSelectionBasicOverlay.getDefaultTrackedBrushForStyle(style);
            Intrinsics.g(defaultTrackedBrushForStyle, "getDefaultTrackedBrushForStyle(style)");
            return BrushExtensionsKt.of(companion, defaultTrackedBrushForStyle);
        }

        @JvmStatic
        @NotNull
        public final BarcodeSelectionBasicOverlay fromJson(@NotNull BarcodeSelection mode, @NotNull String jsonData) {
            Intrinsics.h(mode, "mode");
            Intrinsics.h(jsonData, "jsonData");
            return new BarcodeSelectionDeserializer().basicOverlayFromJson(mode, jsonData);
        }

        @JvmStatic
        @NotNull
        public final BarcodeSelectionBasicOverlay newInstance(@NotNull BarcodeSelection barcodeSelection, @Nullable DataCaptureView view) {
            Intrinsics.h(barcodeSelection, "barcodeSelection");
            OverlayPreconditionsKt.checkAttachedToSameDataCaptureContext(barcodeSelection, view, b.f18080a);
            BarcodeSelectionBasicOverlay barcodeSelectionBasicOverlay = new BarcodeSelectionBasicOverlay(barcodeSelection, new AimerViewfinder(), (DefaultConstructorMarker) null);
            if (view != null) {
                view.addOverlay(barcodeSelectionBasicOverlay);
            }
            return barcodeSelectionBasicOverlay;
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final BarcodeSelectionBasicOverlay newInstance(@NotNull BarcodeSelection barcodeSelection, @Nullable DataCaptureView view, @NotNull BarcodeSelectionBasicOverlayStyle style) {
            Intrinsics.h(barcodeSelection, "barcodeSelection");
            Intrinsics.h(style, "style");
            OverlayPreconditionsKt.checkAttachedToSameDataCaptureContext(barcodeSelection, view, c.f18081a);
            BarcodeSelectionBasicOverlay barcodeSelectionBasicOverlay = new BarcodeSelectionBasicOverlay(barcodeSelection, new AimerViewfinder(), style, null);
            if (view != null) {
                view.addOverlay(barcodeSelectionBasicOverlay);
            }
            return barcodeSelectionBasicOverlay;
        }
    }

    static {
        Brush.Companion companion = Brush.INSTANCE;
        NativeBrush nativeBrushDefaultTrackedBrush = NativeBarcodeSelectionBasicOverlay.defaultTrackedBrush();
        Intrinsics.g(nativeBrushDefaultTrackedBrush, "defaultTrackedBrush()");
        DEFAULT_TRACKED_BRUSH = BrushExtensionsKt.of(companion, nativeBrushDefaultTrackedBrush);
        NativeBrush nativeBrushDefaultAimedBrush = NativeBarcodeSelectionBasicOverlay.defaultAimedBrush();
        Intrinsics.g(nativeBrushDefaultAimedBrush, "defaultAimedBrush()");
        DEFAULT_AIMED_BRUSH = BrushExtensionsKt.of(companion, nativeBrushDefaultAimedBrush);
        NativeBrush nativeBrushDefaultSelectingBrush = NativeBarcodeSelectionBasicOverlay.defaultSelectingBrush();
        Intrinsics.g(nativeBrushDefaultSelectingBrush, "defaultSelectingBrush()");
        DEFAULT_SELECTING_BRUSH = BrushExtensionsKt.of(companion, nativeBrushDefaultSelectingBrush);
        NativeBrush nativeBrushDefaultSelectedBrush = NativeBarcodeSelectionBasicOverlay.defaultSelectedBrush();
        Intrinsics.g(nativeBrushDefaultSelectedBrush, "defaultSelectedBrush()");
        DEFAULT_SELECTED_BRUSH = BrushExtensionsKt.of(companion, nativeBrushDefaultSelectedBrush);
    }

    public /* synthetic */ BarcodeSelectionBasicOverlay(BarcodeSelection barcodeSelection, Viewfinder viewfinder, BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeSelection, viewfinder, barcodeSelectionBasicOverlayStyle);
    }

    @JvmStatic
    @NotNull
    public static final Brush defaultAimedBrush(@NotNull BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle) {
        return INSTANCE.defaultAimedBrush(barcodeSelectionBasicOverlayStyle);
    }

    @JvmStatic
    @NotNull
    public static final Brush defaultSelectedBrush(@NotNull BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle) {
        return INSTANCE.defaultSelectedBrush(barcodeSelectionBasicOverlayStyle);
    }

    @JvmStatic
    @NotNull
    public static final Brush defaultSelectingBrush(@NotNull BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle) {
        return INSTANCE.defaultSelectingBrush(barcodeSelectionBasicOverlayStyle);
    }

    @JvmStatic
    @NotNull
    public static final Brush defaultTrackedBrush(@NotNull BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle) {
        return INSTANCE.defaultTrackedBrush(barcodeSelectionBasicOverlayStyle);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeSelectionBasicOverlay fromJson(@NotNull BarcodeSelection barcodeSelection, @NotNull String str) {
        return INSTANCE.fromJson(barcodeSelection, str);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeSelectionBasicOverlay newInstance(@NotNull BarcodeSelection barcodeSelection, @Nullable DataCaptureView dataCaptureView) {
        return INSTANCE.newInstance(barcodeSelection, dataCaptureView);
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    @NativeImpl
    @NotNull
    /* renamed from: _dataCaptureOverlayImpl */
    public NativeDataCaptureOverlay getD() {
        return this.c.getD();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeSelectionBasicOverlay getB() {
        return this.c.getB();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(nativeName = "setProfilingOverlay")
    public void _setProfilingOverlay(@NotNull ProfilingOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        this.c._setProfilingOverlay(overlay);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction
    public void clearSelectedBarcodeBrushes() {
        this.c.clearSelectedBarcodeBrushes();
    }

    @Nullable
    public final BarcodeSelectionBrushProvider getAimedBarcodeBrushProvider() {
        return this.aimedBarcodeBrushProvider;
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "aimedBrush")
    @NotNull
    public Brush getAimedBrush() {
        return this.c.getAimedBrush();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(nativeName = "getFreezeOverlayColor", property = "frozenBackgroundColor")
    public int getFrozenBackgroundColor() {
        return this.c.getFrozenBackgroundColor();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "selectedBrush")
    @NotNull
    public Brush getSelectedBrush() {
        return this.c.getSelectedBrush();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "selectingBrush")
    @NotNull
    public Brush getSelectingBrush() {
        return this.c.getSelectingBrush();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(nativeName = "getShowHints", property = "shouldShowHints")
    public boolean getShouldShowHints() {
        return this.c.getShouldShowHints();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "shouldShowScanAreaGuides")
    public boolean getShouldShowScanAreaGuides() {
        return this.c.getShouldShowScanAreaGuides();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "style")
    @NotNull
    public BarcodeSelectionBasicOverlayStyle getStyle() {
        return this.c.getStyle();
    }

    @Nullable
    public final BarcodeSelectionBrushProvider getTrackedBarcodeBrushProvider() {
        return this.trackedBarcodeBrushProvider;
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "trackedBrush")
    @NotNull
    public Brush getTrackedBrush() {
        return this.c.getTrackedBrush();
    }

    @NotNull
    public final Viewfinder getViewfinder() {
        return this.viewfinder;
    }

    public final void setAimedBarcodeBrushProvider(@Nullable BarcodeSelectionBrushProvider barcodeSelectionBrushProvider) {
        this.aimedBarcodeBrushProvider = barcodeSelectionBrushProvider;
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "aimedBrush")
    public void setAimedBrush(@NotNull Brush brush) {
        Intrinsics.h(brush, "<set-?>");
        this.c.setAimedBrush(brush);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(nativeName = "setFreezeOverlayColor", property = "frozenBackgroundColor")
    public void setFrozenBackgroundColor(int i) {
        this.c.setFrozenBackgroundColor(i);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "selectedBrush")
    public void setSelectedBrush(@NotNull Brush brush) {
        Intrinsics.h(brush, "<set-?>");
        this.c.setSelectedBrush(brush);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "selectingBrush")
    public void setSelectingBrush(@NotNull Brush brush) {
        Intrinsics.h(brush, "<set-?>");
        this.c.setSelectingBrush(brush);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(nativeName = "setShowHints", property = "shouldShowHints")
    public void setShouldShowHints(boolean z) {
        this.c.setShouldShowHints(z);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "shouldShowScanAreaGuides")
    public void setShouldShowScanAreaGuides(boolean z) {
        this.c.setShouldShowScanAreaGuides(z);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction
    public void setTextForAimToSelectAutoHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.c.setTextForAimToSelectAutoHint(text);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction
    public void setTextForDoubleTapToUnfreezeHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.c.setTextForDoubleTapToUnfreezeHint(text);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction
    public void setTextForSelectOrDoubleTapToFreezeHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.c.setTextForSelectOrDoubleTapToFreezeHint(text);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction
    public void setTextForTapAnywhereToSelectHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.c.setTextForTapAnywhereToSelectHint(text);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction
    public void setTextForTapToSelectHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.c.setTextForTapToSelectHint(text);
    }

    public final void setTrackedBarcodeBrushProvider(@Nullable BarcodeSelectionBrushProvider barcodeSelectionBrushProvider) {
        this.trackedBarcodeBrushProvider = barcodeSelectionBrushProvider;
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "trackedBrush")
    public void setTrackedBrush(@NotNull Brush brush) {
        Intrinsics.h(brush, "<set-?>");
        this.c.setTrackedBrush(brush);
    }

    public final void updateFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        new BarcodeSelectionDeserializer().updateBasicOverlayFromJson(this, jsonData);
    }

    public /* synthetic */ BarcodeSelectionBasicOverlay(BarcodeSelection barcodeSelection, Viewfinder viewfinder, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeSelection, viewfinder);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeSelectionBasicOverlay newInstance(@NotNull BarcodeSelection barcodeSelection, @Nullable DataCaptureView dataCaptureView, @NotNull BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle) {
        return INSTANCE.newInstance(barcodeSelection, dataCaptureView, barcodeSelectionBasicOverlayStyle);
    }

    public BarcodeSelectionBasicOverlay(@NotNull NativeBarcodeSelectionBasicOverlay impl, @NotNull Viewfinder viewfinder) {
        Intrinsics.h(impl, "impl");
        Intrinsics.h(viewfinder, "viewfinder");
        this.viewfinder = viewfinder;
        this.c = new BarcodeSelectionBasicOverlayProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        int i = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ProxyCache proxyCache = null;
        impl.setAimedBarcodeBrushProvider(new BarcodeSelectionBrushProviderReversedAdapter(new a(this), this, proxyCache, i, defaultConstructorMarker));
        impl.setTrackedBarcodeBrushProvider(new BarcodeSelectionBrushProviderReversedAdapter(new d(this), this, proxyCache, i, defaultConstructorMarker));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private BarcodeSelectionBasicOverlay(BarcodeSelection barcodeSelection, Viewfinder viewfinder) {
        NativeBarcodeSelectionBasicOverlay nativeBarcodeSelectionBasicOverlayCreateWithDefaultStyle = NativeBarcodeSelectionBasicOverlay.createWithDefaultStyle(barcodeSelection.getF18028a(), viewfinder.getC());
        Intrinsics.g(nativeBarcodeSelectionBasicOverlayCreateWithDefaultStyle, "createWithDefaultStyle(\n…iewfinderImpl()\n        )");
        this(nativeBarcodeSelectionBasicOverlayCreateWithDefaultStyle, viewfinder);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private BarcodeSelectionBasicOverlay(BarcodeSelection barcodeSelection, Viewfinder viewfinder, BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle) {
        NativeBarcodeSelectionBasicOverlay nativeBarcodeSelectionBasicOverlayCreate = NativeBarcodeSelectionBasicOverlay.create(barcodeSelection.getF18028a(), viewfinder.getC(), barcodeSelectionBasicOverlayStyle);
        Intrinsics.g(nativeBarcodeSelectionBasicOverlayCreate, "create(\n            mode…          style\n        )");
        this(nativeBarcodeSelectionBasicOverlayCreate, viewfinder);
    }
}
