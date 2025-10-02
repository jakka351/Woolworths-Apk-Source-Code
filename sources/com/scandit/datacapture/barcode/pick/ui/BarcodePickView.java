package com.scandit.datacapture.barcode.pick.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.annotation.AnyThread;
import androidx.annotation.UiThread;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.AbstractC0681j5;
import com.scandit.datacapture.barcode.C0664i4;
import com.scandit.datacapture.barcode.C0713l5;
import com.scandit.datacapture.barcode.C0869u5;
import com.scandit.datacapture.barcode.C4;
import com.scandit.datacapture.barcode.G9;
import com.scandit.datacapture.barcode.InterfaceC0680j4;
import com.scandit.datacapture.barcode.InterfaceC0729m5;
import com.scandit.datacapture.barcode.L6;
import com.scandit.datacapture.barcode.hardwarebutton.HardwareButtonHelperKt;
import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener;
import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickSession;
import com.scandit.datacapture.barcode.internal.module.pick.capture.CameraManager;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper;
import com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickElementsCache;
import com.scandit.datacapture.barcode.internal.module.ui.exitbutton.ExitButtonWrapper;
import com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickActionListener;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.common.async.MainThreadHelper;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 W2\u00020\u0001:\u0001WB\u0081\u0001\b\u0000\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010F\u001a\u00020E\u0012\n\u0010H\u001a\u0006\u0012\u0002\b\u00030G\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010L\u001a\u00020K\u0012\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00010M\u0012\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00010O\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bU\u0010VJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\b\u0010\t\u001a\u00020\u0007H\u0007J\b\u0010\n\u001a\u00020\u0007H\u0007J\b\u0010\u000b\u001a\u00020\u0007H\u0007J\b\u0010\f\u001a\u00020\u0007H\u0007J\b\u0010\r\u001a\u00020\u0007H\u0007J\b\u0010\u000e\u001a\u00020\u0007H\u0007J\b\u0010\u000f\u001a\u00020\u0007H\u0007J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\"\u001a\u00020\u0007H\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010$\u001a\u00020\u0007H\u0000¢\u0006\u0004\b#\u0010!J\u000f\u0010&\u001a\u00020\u0007H\u0000¢\u0006\u0004\b%\u0010!J\u000f\u0010(\u001a\u00020\u0007H\u0000¢\u0006\u0004\b'\u0010!J\u0016\u0010-\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+R$\u0010\u0011\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010<\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006X"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickView;", "Landroid/widget/RelativeLayout;", "", "w", "h", "oldw", "oldh", "", "onSizeChanged", "onResume", "onPause", "onDestroy", "start", "stop", "freeze", "reset", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickActionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addActionListener", "removeActionListener", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;", "viewSettings", "_applySettings$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;)V", "_applySettings", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickSession;", "session", "onSessionUpdated$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickSession;)V", "onSessionUpdated", "onPickUpdated$scandit_barcode_capture", "onPickUpdated", "onStatusListenerStarted$scandit_barcode_capture", "()V", "onStatusListenerStarted", "onStatusListenerFreezed$scandit_barcode_capture", "onStatusListenerFreezed", "onStatusListenerPaused$scandit_barcode_capture", "onStatusListenerPaused", "onStatusListenerStopped$scandit_barcode_capture", "onStatusListenerStopped", "", "key", "", "value", "_setProperty", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewListener;", "j", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewListener;", "getListener", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewListener;", "setListener", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewListener;)V", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewUiListener;", "k", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewUiListener;", "getUiListener", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewUiListener;", "setUiListener", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewUiListener;)V", "uiListener", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "parentView", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "mode", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/CameraManager;", "cameraManager", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/elementsprovider/BarcodePickElementsCache;", "elementsHandler", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightdrawer/BarcodePickDrawer;", "drawer", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/datacaptureview/BarcodePickDataCaptureViewWrapper;", "captureViewWrapper", "Lcom/scandit/datacapture/barcode/internal/module/ui/shutterbutton/ShutterButtonWrapper;", "shutterButtonWrapper", "Lcom/scandit/datacapture/barcode/internal/module/ui/exitbutton/ExitButtonWrapper;", "exitButtonWrapper", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/guidances/BarcodePickGuidanceHandler;", "guidanceHandler", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/BarcodePickBasicOverlay;", "barcodePickBasicOverlay", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;Lcom/scandit/datacapture/barcode/internal/module/pick/capture/CameraManager;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/elementsprovider/BarcodePickElementsCache;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightdrawer/BarcodePickDrawer;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/datacaptureview/BarcodePickDataCaptureViewWrapper;Lcom/scandit/datacapture/barcode/internal/module/ui/shutterbutton/ShutterButtonWrapper;Lcom/scandit/datacapture/barcode/internal/module/ui/exitbutton/ExitButtonWrapper;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/guidances/BarcodePickGuidanceHandler;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/BarcodePickBasicOverlay;)V", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@SuppressLint
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BarcodePickView extends RelativeLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final BarcodePick b;
    private final CameraManager c;
    private final BarcodePickDrawer d;
    private final BarcodePickDataCaptureViewWrapper e;
    private final ShutterButtonWrapper f;
    private final ExitButtonWrapper g;
    private final BarcodePickGuidanceHandler h;
    private final BarcodePickBasicOverlay i;

    /* renamed from: j, reason: from kotlin metadata */
    private BarcodePickViewListener listener;

    /* renamed from: k, reason: from kotlin metadata */
    private BarcodePickViewUiListener uiListener;
    private final MainThreadHelper l;
    private final InterfaceC0729m5 m;
    private final InterfaceC0680j4 n;
    private AtomicBoolean o;
    private AtomicBoolean p;
    private final BarcodePickListener q;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007R\u001a\u0010\u0013\u001a\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickView$Companion;", "", "Landroid/view/ViewGroup;", "parentView", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "mode", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;", "settings", "Lcom/scandit/datacapture/core/source/CameraSettings;", "cameraSettings", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickView;", "newInstance", "", "getHardwareTriggerSupported", "()Z", "getHardwareTriggerSupported$annotations", "()V", "hardwareTriggerSupported", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getHardwareTriggerSupported$annotations() {
        }

        public static /* synthetic */ BarcodePickView newInstance$default(Companion companion, ViewGroup viewGroup, DataCaptureContext dataCaptureContext, BarcodePick barcodePick, BarcodePickViewSettings barcodePickViewSettings, CameraSettings cameraSettings, int i, Object obj) {
            if ((i & 16) != 0) {
                cameraSettings = BarcodePick.INSTANCE.createRecommendedCameraSettings();
            }
            return companion.newInstance(viewGroup, dataCaptureContext, barcodePick, barcodePickViewSettings, cameraSettings);
        }

        public final boolean getHardwareTriggerSupported() {
            return HardwareButtonHelperKt.isHardwareTriggerSupported();
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final BarcodePickView newInstance(@NotNull ViewGroup parentView, @NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodePick mode, @NotNull BarcodePickViewSettings settings) {
            Intrinsics.h(parentView, "parentView");
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Intrinsics.h(mode, "mode");
            Intrinsics.h(settings, "settings");
            return newInstance$default(this, parentView, dataCaptureContext, mode, settings, null, 16, null);
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final BarcodePickView newInstance(@NotNull ViewGroup parentView, @NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodePick mode, @NotNull BarcodePickViewSettings settings, @NotNull CameraSettings cameraSettings) {
            Intrinsics.h(parentView, "parentView");
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Intrinsics.h(mode, "mode");
            Intrinsics.h(settings, "settings");
            Intrinsics.h(cameraSettings, "cameraSettings");
            return AbstractC0681j5.a(parentView, dataCaptureContext, mode, settings, cameraSettings);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C4.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodePickView(@NotNull Context context, @NotNull ViewGroup parentView, @NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodePick mode, @NotNull BarcodePickViewSettings viewSettings, @NotNull CameraManager cameraManager, @NotNull BarcodePickElementsCache elementsHandler, @NotNull BarcodePickDrawer drawer, @NotNull BarcodePickDataCaptureViewWrapper captureViewWrapper, @NotNull ShutterButtonWrapper shutterButtonWrapper, @NotNull ExitButtonWrapper exitButtonWrapper, @NotNull BarcodePickGuidanceHandler guidanceHandler, @NotNull BarcodePickBasicOverlay barcodePickBasicOverlay) {
        super(context);
        Intrinsics.h(context, "context");
        Intrinsics.h(parentView, "parentView");
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(viewSettings, "viewSettings");
        Intrinsics.h(cameraManager, "cameraManager");
        Intrinsics.h(elementsHandler, "elementsHandler");
        Intrinsics.h(drawer, "drawer");
        Intrinsics.h(captureViewWrapper, "captureViewWrapper");
        Intrinsics.h(shutterButtonWrapper, "shutterButtonWrapper");
        Intrinsics.h(exitButtonWrapper, "exitButtonWrapper");
        Intrinsics.h(guidanceHandler, "guidanceHandler");
        Intrinsics.h(barcodePickBasicOverlay, "barcodePickBasicOverlay");
        this.b = mode;
        this.c = cameraManager;
        this.d = drawer;
        this.e = captureViewWrapper;
        this.f = shutterButtonWrapper;
        this.g = exitButtonWrapper;
        this.h = guidanceHandler;
        this.i = barcodePickBasicOverlay;
        this.l = new MainThreadHelper();
        this.m = C0713l5.a(new x(this), new y(this), new z(this), new A(this), new B(this));
        InterfaceC0680j4 interfaceC0680j4A = C0664i4.a(mode, new o(this), new m(this), elementsHandler, drawer);
        this.n = interfaceC0680j4A;
        this.o = new AtomicBoolean();
        this.p = new AtomicBoolean();
        this.q = new C(this);
        mode._addStatusListener$scandit_barcode_capture(new C0785a(this));
        setClipChildren(false);
        setClipToPadding(false);
        setBackgroundColor(-16777216);
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        parentView.addView(this, new ViewGroup.LayoutParams(-1, -1));
        captureViewWrapper.a(dataCaptureContext);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        captureViewWrapper.a(this, layoutParams);
        captureViewWrapper.a(interfaceC0680j4A);
        dataCaptureContext.addMode(mode._asDataCaptureMode$scandit_barcode_capture());
        cameraManager.a(dataCaptureContext);
        shutterButtonWrapper.a(new C0786b(this));
        shutterButtonWrapper.a(this, new G9(viewSettings.getShowPauseButton()));
        exitButtonWrapper.a(new C0787c(this));
        exitButtonWrapper.a(this, new L6(viewSettings.getShowFinishButton()));
        if (viewSettings.getHardwareTriggerEnabled()) {
            HardwareButtonHelperKt.setupHardwareTrigger(this, viewSettings.getHardwareTriggerKeyCode(), new d(this));
        }
        barcodePickBasicOverlay.a(guidanceHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BarcodePickView this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.c.a(new l(this$0));
        this$0.f.a();
        this$0.g.a();
        if (this$0.m.d() == C4.Frozen) {
            this$0.n.a();
        }
    }

    public static final void access$_freezeScanning(BarcodePickView barcodePickView) {
        barcodePickView.b._freeze$scandit_barcode_capture();
        ViewExtensionsKt.runOnMainThread(barcodePickView, new f(barcodePickView));
    }

    public static final void access$_releaseScanning(BarcodePickView barcodePickView) {
        barcodePickView.b._stop$scandit_barcode_capture();
        ViewExtensionsKt.runOnMainThread(barcodePickView, new g(barcodePickView));
    }

    public static final void access$_resetScanning(BarcodePickView barcodePickView) {
        barcodePickView.b._reset$scandit_barcode_capture();
        ViewExtensionsKt.runOnMainThread(barcodePickView, new h(barcodePickView));
    }

    public static final void access$_startScanning(BarcodePickView barcodePickView) {
        barcodePickView.b._start$scandit_barcode_capture();
        ViewExtensionsKt.runOnMainThread(barcodePickView, new i(barcodePickView));
    }

    public static final void access$_stopScanning(BarcodePickView barcodePickView) {
        barcodePickView.b._pause$scandit_barcode_capture();
        ViewExtensionsKt.runOnMainThread(barcodePickView, new j(barcodePickView));
    }

    public static final void access$freezeInternal(BarcodePickView barcodePickView) {
        barcodePickView.b._notifyStatusShownWhilePausedUpdated$scandit_barcode_capture(barcodePickView.d.b());
        barcodePickView.f.b(barcodePickView.a());
        barcodePickView.e.a();
        barcodePickView.d.a();
    }

    public static final void access$onDrawerDataUpdated(BarcodePickView barcodePickView, boolean z) {
        if (barcodePickView.m.d().a()) {
            return;
        }
        barcodePickView.b._notifyStatusShownWhilePausedUpdated$scandit_barcode_capture(z);
    }

    public static final void access$onExitButtonClick(BarcodePickView barcodePickView) {
        BarcodePickViewUiListener barcodePickViewUiListener = barcodePickView.uiListener;
        if (barcodePickViewUiListener != null) {
            barcodePickViewUiListener.onFinishButtonTapped(barcodePickView);
        }
    }

    public static final void access$releaseInternal(BarcodePickView barcodePickView) {
        barcodePickView.f.b(barcodePickView.a());
        barcodePickView.d.stop();
        barcodePickView.removeView(barcodePickView.h.getView());
        barcodePickView.e.a(barcodePickView.i);
        barcodePickView.b._removeListener$scandit_barcode_capture(barcodePickView.n);
        barcodePickView.b._removeListener$scandit_barcode_capture(barcodePickView.q);
        barcodePickView.c.a(C0869u5.f18220a);
    }

    public static final void access$resetStateInternal(BarcodePickView barcodePickView) {
        barcodePickView.f.b(barcodePickView.a());
        barcodePickView.n.a();
    }

    public static final void access$startInternal(BarcodePickView barcodePickView) {
        barcodePickView.e.b();
        if (barcodePickView.h.getView().getParent() == null) {
            barcodePickView.addView(barcodePickView.h.getView(), new ViewGroup.LayoutParams(-1, -1));
        }
        barcodePickView.d.start();
        barcodePickView.b._notifyStatusShownWhilePausedUpdated$scandit_barcode_capture(false);
        barcodePickView.e.b(barcodePickView.i);
        barcodePickView.b._addListener$scandit_barcode_capture(barcodePickView.n);
        barcodePickView.b._addListener$scandit_barcode_capture(barcodePickView.q);
    }

    public static final void access$stopInternal(BarcodePickView barcodePickView) {
        barcodePickView.f.b(barcodePickView.a());
        barcodePickView.d.stop();
        barcodePickView.removeView(barcodePickView.h.getView());
        barcodePickView.e.a(barcodePickView.i);
        barcodePickView.b._removeListener$scandit_barcode_capture(barcodePickView.n);
        barcodePickView.b._removeListener$scandit_barcode_capture(barcodePickView.q);
    }

    public static final boolean getHardwareTriggerSupported() {
        return INSTANCE.getHardwareTriggerSupported();
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final BarcodePickView newInstance(@NotNull ViewGroup viewGroup, @NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodePick barcodePick, @NotNull BarcodePickViewSettings barcodePickViewSettings) {
        return INSTANCE.newInstance(viewGroup, dataCaptureContext, barcodePick, barcodePickViewSettings);
    }

    public final void _applySettings$scandit_barcode_capture(@NotNull BarcodePickViewSettings viewSettings) {
        Intrinsics.h(viewSettings, "viewSettings");
        this.i.a(viewSettings);
        ViewExtensionsKt.runOnMainThread(this, new e(this, viewSettings));
    }

    public final void _setProperty(@NotNull String key, @NotNull Object value) {
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
        if (key.equals("add_overlay") && (value instanceof DataCaptureOverlay)) {
            this.e.b((DataCaptureOverlay) value);
        } else if (key.equals("remove_overlay") && (value instanceof DataCaptureOverlay)) {
            this.e.a((DataCaptureOverlay) value);
        }
    }

    public final void addActionListener(@NotNull BarcodePickActionListener listener) {
        Intrinsics.h(listener, "listener");
        this.b._addActionListener$scandit_barcode_capture(listener);
    }

    @AnyThread
    public final void freeze() {
        this.m.a();
    }

    @Nullable
    public final BarcodePickViewListener getListener() {
        return this.listener;
    }

    @Nullable
    public final BarcodePickViewUiListener getUiListener() {
        return this.uiListener;
    }

    @UiThread
    public final void onDestroy() {
        this.m.f();
    }

    @UiThread
    public final void onPause() {
        this.m.e();
    }

    public final void onPickUpdated$scandit_barcode_capture(@NotNull BarcodePickSession session) {
        Intrinsics.h(session, "session");
        if (this.m.d().a()) {
            this.p.set(true);
        }
        this.o.set(session.c());
        ViewExtensionsKt.runOnMainThread(this, new p(this));
    }

    @UiThread
    public final void onResume() {
        this.m.b();
    }

    public final void onSessionUpdated$scandit_barcode_capture(@NotNull BarcodePickSession session) {
        Intrinsics.h(session, "session");
        this.o.set(session.c());
        ViewExtensionsKt.runOnMainThread(this, new q(this));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        post(new com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.f(this, 1));
    }

    public final void onStatusListenerFreezed$scandit_barcode_capture() {
        this.l.runOnMainThread(new r(this));
        ViewExtensionsKt.runOnMainThread(this, new s(this));
    }

    public final void onStatusListenerPaused$scandit_barcode_capture() {
        this.l.runOnMainThread(new t(this));
    }

    public final void onStatusListenerStarted$scandit_barcode_capture() {
        this.l.runOnMainThread(new u(this));
        ViewExtensionsKt.runOnMainThread(this, new v(this));
    }

    public final void onStatusListenerStopped$scandit_barcode_capture() {
        this.l.runOnMainThread(new w(this));
    }

    public final void removeActionListener(@NotNull BarcodePickActionListener listener) {
        Intrinsics.h(listener, "listener");
        this.b._removeActionListener$scandit_barcode_capture(listener);
    }

    @AnyThread
    public final void reset() {
        this.m.reset();
    }

    public final void setListener(@Nullable BarcodePickViewListener barcodePickViewListener) {
        this.listener = barcodePickViewListener;
    }

    public final void setUiListener(@Nullable BarcodePickViewUiListener barcodePickViewUiListener) {
        this.uiListener = barcodePickViewUiListener;
    }

    @AnyThread
    public final void start() {
        this.m.start();
    }

    @AnyThread
    public final void stop() {
        this.m.stop();
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final BarcodePickView newInstance(@NotNull ViewGroup viewGroup, @NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodePick barcodePick, @NotNull BarcodePickViewSettings barcodePickViewSettings, @NotNull CameraSettings cameraSettings) {
        return INSTANCE.newInstance(viewGroup, dataCaptureContext, barcodePick, barcodePickViewSettings, cameraSettings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a() {
        int iOrdinal = this.m.d().ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal == 3) {
                if (this.o.get()) {
                    return false;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (this.p.get() || !this.o.get()) {
            return false;
        }
        return true;
    }
}
