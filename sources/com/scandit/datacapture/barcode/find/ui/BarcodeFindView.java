package com.scandit.datacapture.barcode.find.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.C0581d1;
import com.scandit.datacapture.barcode.C0724m0;
import com.scandit.datacapture.barcode.C0789q0;
import com.scandit.datacapture.barcode.J8;
import com.scandit.datacapture.barcode.P1;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.S0;
import com.scandit.datacapture.barcode.S1;
import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.find.feedback.BarcodeFindFeedback;
import com.scandit.datacapture.barcode.hardwarebutton.HardwareButtonHelperKt;
import com.scandit.datacapture.barcode.internal.module.find.capture.BarcodeFindCameraManager;
import com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout;
import com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter;
import com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.feedback.Vibration;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 w2\u00020\u0001:\u0001wJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J(\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0014J(\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016R\u001a\u0010\u001b\u001a\u00020\u00168\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R.\u0010*\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R.\u0010.\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R.\u00102\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'\"\u0004\b1\u0010)R.\u00106\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010%\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R.\u0010:\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010%\u001a\u0004\b8\u0010'\"\u0004\b9\u0010)R.\u0010>\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010%\u001a\u0004\b<\u0010'\"\u0004\b=\u0010)R.\u0010B\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010%\u001a\u0004\b@\u0010'\"\u0004\bA\u0010)R+\u0010K\u001a\u00020C2\u0006\u0010D\u001a\u00020C8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H*\u0004\bI\u0010JR+\u0010O\u001a\u00020C2\u0006\u0010D\u001a\u00020C8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bL\u0010F\"\u0004\bM\u0010H*\u0004\bN\u0010JR+\u0010S\u001a\u00020C2\u0006\u0010D\u001a\u00020C8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bP\u0010F\"\u0004\bQ\u0010H*\u0004\bR\u0010JR+\u0010W\u001a\u00020C2\u0006\u0010D\u001a\u00020C8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bT\u0010F\"\u0004\bU\u0010H*\u0004\bV\u0010JR/\u0010[\u001a\u0004\u0018\u00010\"2\b\u0010D\u001a\u0004\u0018\u00010\"8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bX\u0010'\"\u0004\bY\u0010)*\u0004\bZ\u0010JR+\u0010_\u001a\u00020C2\u0006\u0010D\u001a\u00020C8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\\\u0010F\"\u0004\b]\u0010H*\u0004\b^\u0010JR+\u0010c\u001a\u00020C2\u0006\u0010D\u001a\u00020C8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b`\u0010F\"\u0004\ba\u0010H*\u0004\bb\u0010JR+\u0010g\u001a\u00020C2\u0006\u0010D\u001a\u00020C8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bd\u0010F\"\u0004\be\u0010H*\u0004\bf\u0010JR+\u0010n\u001a\u00020h2\u0006\u0010D\u001a\u00020h8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l*\u0004\bm\u0010JR+\u0010r\u001a\u00020C2\u0006\u0010D\u001a\u00020C8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bo\u0010F\"\u0004\bp\u0010H*\u0004\bq\u0010JR\u0013\u0010v\u001a\u0004\u0018\u00010s8F¢\u0006\u0006\u001a\u0004\bt\u0010u¨\u0006x"}, d2 = {"Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindView;", "Landroid/widget/RelativeLayout;", "Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindViewUiListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setListener", "startSearching", "stopSearching", "pauseSearching", "onPause", "onResume", "", "w", "h", "oldw", "oldh", "onSizeChanged", "left", "top", "right", "bottom", "setPadding", "Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindViewSettings;", "d", "Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindViewSettings;", "getSettings$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindViewSettings;", "settings", "Lcom/scandit/datacapture/barcode/internal/module/find/capture/BarcodeFindCameraManager;", "i", "Lcom/scandit/datacapture/barcode/internal/module/find/capture/BarcodeFindCameraManager;", "getCameraManager$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/find/capture/BarcodeFindCameraManager;", "cameraManager", "", TextBundle.TEXT_ENTRY, "k", "Ljava/lang/String;", "getTextForPointAtBarcodesToSearchHint", "()Ljava/lang/String;", "setTextForPointAtBarcodesToSearchHint", "(Ljava/lang/String;)V", "textForPointAtBarcodesToSearchHint", "l", "getTextForAllItemsFoundSuccessfullyHint", "setTextForAllItemsFoundSuccessfullyHint", "textForAllItemsFoundSuccessfullyHint", "m", "getTextForMoveCloserToBarcodesHint", "setTextForMoveCloserToBarcodesHint", "textForMoveCloserToBarcodesHint", "n", "getTextForTapShutterToPauseScreenHint", "setTextForTapShutterToPauseScreenHint", "textForTapShutterToPauseScreenHint", "o", "getTextForTapShutterToResumeSearchHint", "setTextForTapShutterToResumeSearchHint", "textForTapShutterToResumeSearchHint", "p", "getTextForItemListUpdatedHint", "setTextForItemListUpdatedHint", "textForItemListUpdatedHint", "q", "getTextForItemListUpdatedWhenPausedHint", "setTextForItemListUpdatedWhenPausedHint", "textForItemListUpdatedWhenPausedHint", "", "<set-?>", "getShouldShowPauseButton", "()Z", "setShouldShowPauseButton", "(Z)V", "getShouldShowPauseButton$delegate", "(Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindView;)Ljava/lang/Object;", "shouldShowPauseButton", "getShouldShowFinishButton", "setShouldShowFinishButton", "getShouldShowFinishButton$delegate", "shouldShowFinishButton", "getShouldShowProgressBar", "setShouldShowProgressBar", "getShouldShowProgressBar$delegate", "shouldShowProgressBar", "getShouldShowCarousel", "setShouldShowCarousel", "getShouldShowCarousel$delegate", "shouldShowCarousel", "getTextForCollapseCardsButton", "setTextForCollapseCardsButton", "getTextForCollapseCardsButton$delegate", "textForCollapseCardsButton", "getShouldShowHints", "setShouldShowHints", "getShouldShowHints$delegate", "shouldShowHints", "getShouldShowUserGuidanceView", "setShouldShowUserGuidanceView", "getShouldShowUserGuidanceView$delegate", "shouldShowUserGuidanceView", "getShouldShowTorchControl", "setShouldShowTorchControl", "getShouldShowTorchControl$delegate", "shouldShowTorchControl", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getTorchControlPosition", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "setTorchControlPosition", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "getTorchControlPosition$delegate", "torchControlPosition", "getShouldShowZoomControl", "setShouldShowZoomControl", "getShouldShowZoomControl$delegate", "shouldShowZoomControl", "Lcom/scandit/datacapture/core/source/Camera;", "getCamera", "()Lcom/scandit/datacapture/core/source/Camera;", "camera", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@SuppressLint
/* loaded from: classes6.dex */
public final class BarcodeFindView extends RelativeLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final DataCaptureContext b;
    private final BarcodeFind c;

    /* renamed from: d, reason: from kotlin metadata */
    private final BarcodeFindViewSettings settings;
    private final DataCaptureView e;
    private final BarcodeFindViewLayout f;
    private final BarcodeFindViewPresenter g;
    private final BarcodeFindBasicOverlay h;

    /* renamed from: i, reason: from kotlin metadata */
    private final BarcodeFindCameraManager cameraManager;
    private final J8 j;

    /* renamed from: k, reason: from kotlin metadata */
    private String textForPointAtBarcodesToSearchHint;

    /* renamed from: l, reason: from kotlin metadata */
    private String textForAllItemsFoundSuccessfullyHint;

    /* renamed from: m, reason: from kotlin metadata */
    private String textForMoveCloserToBarcodesHint;

    /* renamed from: n, reason: from kotlin metadata */
    private String textForTapShutterToPauseScreenHint;

    /* renamed from: o, reason: from kotlin metadata */
    private String textForTapShutterToResumeSearchHint;

    /* renamed from: p, reason: from kotlin metadata */
    private String textForItemListUpdatedHint;

    /* renamed from: q, reason: from kotlin metadata */
    private String textForItemListUpdatedWhenPausedHint;

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007J0\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007J4\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J_\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindView$Companion;", "", "Landroid/view/View;", "parentView", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;", "barcodeFind", "Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindView;", "newInstance", "Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindViewSettings;", "settings", "Lcom/scandit/datacapture/core/source/CameraSettings;", "cameraSettings", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "dataCaptureView", "Lcom/scandit/datacapture/barcode/internal/module/find/ui/BarcodeFindViewLayout;", "uiLayout", "Lcom/scandit/datacapture/barcode/internal/module/find/ui/BarcodeFindViewPresenter;", "presenter", "Lcom/scandit/datacapture/barcode/internal/module/find/ui/overlay/BarcodeFindGuidanceHandler;", "guidanceHandler", "Lcom/scandit/datacapture/barcode/internal/module/find/ui/overlay/BarcodeFindBasicOverlay;", "basicOverlay", "Lcom/scandit/datacapture/barcode/internal/module/find/capture/BarcodeFindCameraManager;", "cameraManager", "forTesting$scandit_barcode_capture", "(Landroid/view/View;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindViewSettings;Lcom/scandit/datacapture/core/ui/DataCaptureView;Lcom/scandit/datacapture/barcode/internal/module/find/ui/BarcodeFindViewLayout;Lcom/scandit/datacapture/barcode/internal/module/find/ui/BarcodeFindViewPresenter;Lcom/scandit/datacapture/barcode/internal/module/find/ui/overlay/BarcodeFindGuidanceHandler;Lcom/scandit/datacapture/barcode/internal/module/find/ui/overlay/BarcodeFindBasicOverlay;Lcom/scandit/datacapture/barcode/internal/module/find/capture/BarcodeFindCameraManager;)Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindView;", "forTesting", "", "getHardwareTriggerSupported", "()Z", "getHardwareTriggerSupported$annotations", "()V", "hardwareTriggerSupported", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getHardwareTriggerSupported$annotations() {
        }

        public static /* synthetic */ BarcodeFindView newInstance$default(Companion companion, DataCaptureView dataCaptureView, DataCaptureContext dataCaptureContext, BarcodeFind barcodeFind, BarcodeFindViewSettings barcodeFindViewSettings, CameraSettings cameraSettings, int i, Object obj) {
            if ((i & 8) != 0) {
                barcodeFindViewSettings = new BarcodeFindViewSettings(0, 0, false, false, 15, (DefaultConstructorMarker) null);
            }
            if ((i & 16) != 0) {
                cameraSettings = BarcodeFind.INSTANCE.getRecommendedCameraSettings();
            }
            return companion.newInstance(dataCaptureView, dataCaptureContext, barcodeFind, barcodeFindViewSettings, cameraSettings);
        }

        @VisibleForTesting
        @NotNull
        public final BarcodeFindView forTesting$scandit_barcode_capture(@NotNull View parentView, @NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodeFind barcodeFind, @NotNull BarcodeFindViewSettings settings, @NotNull DataCaptureView dataCaptureView, @NotNull BarcodeFindViewLayout uiLayout, @NotNull BarcodeFindViewPresenter presenter, @NotNull BarcodeFindGuidanceHandler guidanceHandler, @NotNull BarcodeFindBasicOverlay basicOverlay, @NotNull BarcodeFindCameraManager cameraManager) {
            Intrinsics.h(parentView, "parentView");
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Intrinsics.h(barcodeFind, "barcodeFind");
            Intrinsics.h(settings, "settings");
            Intrinsics.h(dataCaptureView, "dataCaptureView");
            Intrinsics.h(uiLayout, "uiLayout");
            Intrinsics.h(presenter, "presenter");
            Intrinsics.h(guidanceHandler, "guidanceHandler");
            Intrinsics.h(basicOverlay, "basicOverlay");
            Intrinsics.h(cameraManager, "cameraManager");
            Context context = parentView.getContext();
            Intrinsics.g(context, "parentView.context");
            BarcodeFindView barcodeFindView = new BarcodeFindView(context, dataCaptureContext, barcodeFind, settings, dataCaptureView, uiLayout, presenter, guidanceHandler, basicOverlay, cameraManager, null);
            ((ViewGroup) parentView).addView(barcodeFindView, new RelativeLayout.LayoutParams(-1, -1));
            return barcodeFindView;
        }

        public final boolean getHardwareTriggerSupported() {
            return HardwareButtonHelperKt.isHardwareTriggerSupported();
        }

        @JvmStatic
        @NotNull
        public final BarcodeFindView newInstance(@NotNull View parentView, @NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodeFind barcodeFind) {
            Intrinsics.h(parentView, "parentView");
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Intrinsics.h(barcodeFind, "barcodeFind");
            return newInstance(parentView, dataCaptureContext, barcodeFind, new BarcodeFindViewSettings(0, 0, false, false, 15, (DefaultConstructorMarker) null), BarcodeFind.INSTANCE.getRecommendedCameraSettings());
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final BarcodeFindView newInstance(@NotNull View parentView, @NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodeFind barcodeFind, @NotNull BarcodeFindViewSettings settings) {
            Intrinsics.h(parentView, "parentView");
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Intrinsics.h(barcodeFind, "barcodeFind");
            Intrinsics.h(settings, "settings");
            return newInstance(parentView, dataCaptureContext, barcodeFind, settings, BarcodeFind.INSTANCE.getRecommendedCameraSettings());
        }

        @JvmStatic
        @NotNull
        public final BarcodeFindView newInstance(@NotNull View parentView, @NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodeFind barcodeFind, @NotNull BarcodeFindViewSettings settings, @NotNull CameraSettings cameraSettings) {
            Intrinsics.h(parentView, "parentView");
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Intrinsics.h(barcodeFind, "barcodeFind");
            Intrinsics.h(settings, "settings");
            Intrinsics.h(cameraSettings, "cameraSettings");
            Context context = parentView.getContext();
            DataCaptureView.Companion companion = DataCaptureView.INSTANCE;
            Intrinsics.g(context, "context");
            DataCaptureView dataCaptureViewNewInstance = companion.newInstance(context, dataCaptureContext);
            P1 p1 = new P1(context, settings, dataCaptureViewNewInstance, new C0581d1(dataCaptureViewNewInstance));
            C0789q0 c0789q0 = new C0789q0(cameraSettings);
            BarcodeFindView barcodeFindView = new BarcodeFindView(context, dataCaptureContext, barcodeFind, settings, dataCaptureViewNewInstance, p1, new S1(barcodeFind, p1, c0789q0), new S0(p1), new C0724m0(context, barcodeFind), c0789q0, null);
            ((ViewGroup) parentView).addView(barcodeFindView, new RelativeLayout.LayoutParams(-1, -1));
            return barcodeFindView;
        }

        @JvmStatic
        @NotNull
        public final BarcodeFindView newInstance(@NotNull DataCaptureView dataCaptureView, @NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodeFind barcodeFind, @NotNull BarcodeFindViewSettings settings, @NotNull CameraSettings cameraSettings) {
            Intrinsics.h(dataCaptureView, "dataCaptureView");
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Intrinsics.h(barcodeFind, "barcodeFind");
            Intrinsics.h(settings, "settings");
            Intrinsics.h(cameraSettings, "cameraSettings");
            Context context = dataCaptureView.getContext();
            ViewParent parent = dataCaptureView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(dataCaptureView);
            }
            Intrinsics.g(context, "context");
            P1 p1 = new P1(context, settings, dataCaptureView, new C0581d1(dataCaptureView));
            C0789q0 c0789q0 = new C0789q0(cameraSettings);
            BarcodeFindView barcodeFindView = new BarcodeFindView(context, dataCaptureContext, barcodeFind, settings, dataCaptureView, p1, new S1(barcodeFind, p1, c0789q0), new S0(p1), new C0724m0(context, barcodeFind), c0789q0, null);
            barcodeFindView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return barcodeFindView;
        }
    }

    public /* synthetic */ BarcodeFindView(Context context, DataCaptureContext dataCaptureContext, BarcodeFind barcodeFind, BarcodeFindViewSettings barcodeFindViewSettings, DataCaptureView dataCaptureView, BarcodeFindViewLayout barcodeFindViewLayout, BarcodeFindViewPresenter barcodeFindViewPresenter, BarcodeFindGuidanceHandler barcodeFindGuidanceHandler, BarcodeFindBasicOverlay barcodeFindBasicOverlay, BarcodeFindCameraManager barcodeFindCameraManager, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dataCaptureContext, barcodeFind, barcodeFindViewSettings, dataCaptureView, barcodeFindViewLayout, barcodeFindViewPresenter, barcodeFindGuidanceHandler, barcodeFindBasicOverlay, barcodeFindCameraManager);
    }

    private final void a(BarcodeFindViewSettings barcodeFindViewSettings) {
        BarcodeFindFeedback feedback = this.c.getFeedback();
        feedback.setFound(new Feedback(barcodeFindViewSettings.getHapticEnabled() ? Vibration.INSTANCE.defaultVibration() : null, barcodeFindViewSettings.getSoundEnabled() ? BarcodeFindFeedback.INSTANCE.defaultFoundSound$scandit_barcode_capture() : null));
        feedback.setItemListUpdated(new Feedback(barcodeFindViewSettings.getHapticEnabled() ? Vibration.INSTANCE.defaultVibration() : null, barcodeFindViewSettings.getSoundEnabled() ? BarcodeFindFeedback.INSTANCE.defaultItemListUpdatedSound$scandit_barcode_capture() : null));
    }

    public static final boolean getHardwareTriggerSupported() {
        return INSTANCE.getHardwareTriggerSupported();
    }

    @JvmStatic
    @NotNull
    public static final BarcodeFindView newInstance(@NotNull View view, @NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodeFind barcodeFind) {
        return INSTANCE.newInstance(view, dataCaptureContext, barcodeFind);
    }

    @Nullable
    public final Camera getCamera() {
        return this.cameraManager.a();
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: getCameraManager$scandit_barcode_capture, reason: from getter */
    public final BarcodeFindCameraManager getCameraManager() {
        return this.cameraManager;
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: getSettings$scandit_barcode_capture, reason: from getter */
    public final BarcodeFindViewSettings getSettings() {
        return this.settings;
    }

    public final boolean getShouldShowCarousel() {
        return this.f.h();
    }

    public final boolean getShouldShowFinishButton() {
        return this.f.e();
    }

    public final boolean getShouldShowHints() {
        return this.f.getShouldShowHints();
    }

    public final boolean getShouldShowPauseButton() {
        return this.f.b();
    }

    public final boolean getShouldShowProgressBar() {
        return this.f.o();
    }

    public final boolean getShouldShowTorchControl() {
        return this.f.c();
    }

    public final boolean getShouldShowUserGuidanceView() {
        return this.f.j();
    }

    public final boolean getShouldShowZoomControl() {
        return this.g.e();
    }

    @Nullable
    public final String getTextForAllItemsFoundSuccessfullyHint() {
        return this.textForAllItemsFoundSuccessfullyHint;
    }

    @Nullable
    public final String getTextForCollapseCardsButton() {
        return this.f.p();
    }

    @Nullable
    public final String getTextForItemListUpdatedHint() {
        return this.textForItemListUpdatedHint;
    }

    @Nullable
    public final String getTextForItemListUpdatedWhenPausedHint() {
        return this.textForItemListUpdatedWhenPausedHint;
    }

    @Nullable
    public final String getTextForMoveCloserToBarcodesHint() {
        return this.textForMoveCloserToBarcodesHint;
    }

    @Nullable
    public final String getTextForPointAtBarcodesToSearchHint() {
        return this.textForPointAtBarcodesToSearchHint;
    }

    @Nullable
    public final String getTextForTapShutterToPauseScreenHint() {
        return this.textForTapShutterToPauseScreenHint;
    }

    @Nullable
    public final String getTextForTapShutterToResumeSearchHint() {
        return this.textForTapShutterToResumeSearchHint;
    }

    @NotNull
    public final Anchor getTorchControlPosition() {
        return this.f.i();
    }

    public final void onPause() {
        this.e.removeListener(this.j);
        this.c.removeSearchedItemsUpdateListener$scandit_barcode_capture(this.g);
        this.c.removeOverlayListener$scandit_barcode_capture(this.j);
        this.g.d();
        this.b.removeMode(this.c);
        this.e.removeOverlay(this.h);
    }

    public final void onResume() {
        this.e.addOverlay(this.h);
        this.b.addMode(this.c);
        this.g.f();
        this.c.addOverlayListener$scandit_barcode_capture(this.j);
        this.c.addSearchedItemsUpdateListener$scandit_barcode_capture(this.g);
        this.e.addListener(this.j);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.f.l();
    }

    public final void pauseSearching() {
        this.g.a();
    }

    public final void setListener(@Nullable BarcodeFindViewUiListener listener) {
        this.g.a(listener);
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        super.setPadding(left, top, right, bottom);
        this.f.a(left, top, right, bottom);
    }

    public final void setShouldShowCarousel(boolean z) {
        this.f.d(z);
    }

    public final void setShouldShowFinishButton(boolean z) {
        this.f.e(z);
    }

    public final void setShouldShowHints(boolean z) {
        this.f.setShouldShowHints(z);
    }

    public final void setShouldShowPauseButton(boolean z) {
        this.f.a(z);
    }

    public final void setShouldShowProgressBar(boolean z) {
        this.f.b(z);
    }

    public final void setShouldShowTorchControl(boolean z) {
        this.f.c(z);
    }

    public final void setShouldShowUserGuidanceView(boolean z) {
        this.f.h(z);
    }

    public final void setShouldShowZoomControl(boolean z) {
        this.g.a(z);
    }

    public final void setTextForAllItemsFoundSuccessfullyHint(@Nullable String str) {
        this.textForAllItemsFoundSuccessfullyHint = str;
        BarcodeFindBasicOverlay barcodeFindBasicOverlay = this.h;
        if (str == null) {
            str = getContext().getString(R.string.sc_barcode_find_guidance_all_found);
            Intrinsics.g(str, "context.getString(R.stri…_find_guidance_all_found)");
        }
        barcodeFindBasicOverlay.e(str);
    }

    public final void setTextForCollapseCardsButton(@Nullable String str) {
        this.f.d(str);
    }

    public final void setTextForItemListUpdatedHint(@Nullable String str) {
        this.textForItemListUpdatedHint = str;
        BarcodeFindBasicOverlay barcodeFindBasicOverlay = this.h;
        if (str == null) {
            str = getContext().getString(R.string.sc_barcode_find_guidance_item_list_updated);
            Intrinsics.g(str, "context.getString(R.stri…idance_item_list_updated)");
        }
        barcodeFindBasicOverlay.b(str);
    }

    public final void setTextForItemListUpdatedWhenPausedHint(@Nullable String str) {
        this.textForItemListUpdatedWhenPausedHint = str;
        BarcodeFindBasicOverlay barcodeFindBasicOverlay = this.h;
        if (str == null) {
            str = getContext().getString(R.string.sc_barcode_find_guidance_item_list_updated_when_paused);
            Intrinsics.g(str, "context.getString(\n     …_paused\n                )");
        }
        barcodeFindBasicOverlay.g(str);
    }

    public final void setTextForMoveCloserToBarcodesHint(@Nullable String str) {
        this.textForMoveCloserToBarcodesHint = str;
        BarcodeFindBasicOverlay barcodeFindBasicOverlay = this.h;
        if (str == null) {
            str = getContext().getString(R.string.sc_barcode_find_guidance_move_closer);
            Intrinsics.g(str, "context.getString(R.stri…ind_guidance_move_closer)");
        }
        barcodeFindBasicOverlay.a(str);
    }

    public final void setTextForPointAtBarcodesToSearchHint(@Nullable String str) {
        this.textForPointAtBarcodesToSearchHint = str;
        BarcodeFindBasicOverlay barcodeFindBasicOverlay = this.h;
        if (str == null) {
            str = getContext().getString(R.string.sc_barcode_find_guidance_point_at_barcodes);
            Intrinsics.g(str, "context.getString(R.stri…idance_point_at_barcodes)");
        }
        barcodeFindBasicOverlay.d(str);
    }

    public final void setTextForTapShutterToPauseScreenHint(@Nullable String str) {
        this.textForTapShutterToPauseScreenHint = str;
        BarcodeFindBasicOverlay barcodeFindBasicOverlay = this.h;
        if (str == null) {
            str = getContext().getString(R.string.sc_barcode_find_guidance_tap_shutter_to_pause);
            Intrinsics.g(str, "context.getString(R.stri…nce_tap_shutter_to_pause)");
        }
        barcodeFindBasicOverlay.f(str);
    }

    public final void setTextForTapShutterToResumeSearchHint(@Nullable String str) {
        this.textForTapShutterToResumeSearchHint = str;
        BarcodeFindBasicOverlay barcodeFindBasicOverlay = this.h;
        if (str == null) {
            str = getContext().getString(R.string.sc_barcode_find_guidance_tap_shutter_to_resume);
            Intrinsics.g(str, "context.getString(R.stri…ce_tap_shutter_to_resume)");
        }
        barcodeFindBasicOverlay.c(str);
    }

    public final void setTorchControlPosition(@NotNull Anchor anchor) {
        Intrinsics.h(anchor, "<set-?>");
        this.f.a(anchor);
    }

    public final void startSearching() {
        this.g.h();
    }

    public final void stopSearching() {
        this.g.g();
    }

    private BarcodeFindView(Context context, DataCaptureContext dataCaptureContext, BarcodeFind barcodeFind, BarcodeFindViewSettings barcodeFindViewSettings, DataCaptureView dataCaptureView, BarcodeFindViewLayout barcodeFindViewLayout, BarcodeFindViewPresenter barcodeFindViewPresenter, BarcodeFindGuidanceHandler barcodeFindGuidanceHandler, BarcodeFindBasicOverlay barcodeFindBasicOverlay, BarcodeFindCameraManager barcodeFindCameraManager) {
        super(context);
        this.b = dataCaptureContext;
        this.c = barcodeFind;
        this.settings = barcodeFindViewSettings;
        this.e = dataCaptureView;
        this.f = barcodeFindViewLayout;
        this.g = barcodeFindViewPresenter;
        this.h = barcodeFindBasicOverlay;
        this.cameraManager = barcodeFindCameraManager;
        this.j = new J8(barcodeFind, barcodeFindViewPresenter);
        DataCaptureContext.setFrameSource$default(dataCaptureContext, barcodeFindCameraManager.a(), null, 2, null);
        setClipChildren(false);
        setClipToPadding(false);
        barcodeFindViewLayout.a(this, barcodeFindBasicOverlay);
        barcodeFindViewLayout.a(barcodeFindViewPresenter);
        barcodeFindBasicOverlay.a(barcodeFindGuidanceHandler);
        a(barcodeFindViewSettings);
        if (barcodeFindViewSettings.getHardwareTriggerEnabled()) {
            HardwareButtonHelperKt.setupHardwareTrigger(this, barcodeFindViewSettings.getHardwareTriggerKeyCode(), new a(barcodeFindViewPresenter));
        }
        this.textForPointAtBarcodesToSearchHint = BarcodeFindViewDefaults.getDefaultTextForPointAtBarcodesToSearchHint();
        this.textForAllItemsFoundSuccessfullyHint = BarcodeFindViewDefaults.getDefaultTextForAllItemsFoundSuccessfullyHint();
        this.textForMoveCloserToBarcodesHint = BarcodeFindViewDefaults.getDefaultTextForMoveCloserToBarcodesHint();
        this.textForTapShutterToPauseScreenHint = BarcodeFindViewDefaults.getDefaultTextForTapShutterToPauseScreenHint();
        this.textForTapShutterToResumeSearchHint = BarcodeFindViewDefaults.getDefaultTextForTapShutterToResumeSearchHint();
        this.textForItemListUpdatedHint = BarcodeFindViewDefaults.getDefaultTextForItemListUpdatedHint();
        this.textForItemListUpdatedWhenPausedHint = BarcodeFindViewDefaults.getDefaultTextForItemListUpdatedWhenPausedHint();
    }

    @JvmStatic
    @NotNull
    public static final BarcodeFindView newInstance(@NotNull View view, @NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodeFind barcodeFind, @NotNull BarcodeFindViewSettings barcodeFindViewSettings) {
        return INSTANCE.newInstance(view, dataCaptureContext, barcodeFind, barcodeFindViewSettings);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeFindView newInstance(@NotNull View view, @NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodeFind barcodeFind, @NotNull BarcodeFindViewSettings barcodeFindViewSettings, @NotNull CameraSettings cameraSettings) {
        return INSTANCE.newInstance(view, dataCaptureContext, barcodeFind, barcodeFindViewSettings, cameraSettings);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeFindView newInstance(@NotNull DataCaptureView dataCaptureView, @NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodeFind barcodeFind, @NotNull BarcodeFindViewSettings barcodeFindViewSettings, @NotNull CameraSettings cameraSettings) {
        return INSTANCE.newInstance(dataCaptureView, dataCaptureContext, barcodeFind, barcodeFindViewSettings, cameraSettings);
    }
}
