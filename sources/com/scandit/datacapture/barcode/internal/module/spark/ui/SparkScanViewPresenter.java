package com.scandit.datacapture.barcode.internal.module.spark.ui;

import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import com.scandit.datacapture.barcode.AbstractC0800qb;
import com.scandit.datacapture.barcode.C0591db;
import com.scandit.datacapture.barcode.C0607eb;
import com.scandit.datacapture.barcode.C0623fb;
import com.scandit.datacapture.barcode.C0639gb;
import com.scandit.datacapture.barcode.C0655hb;
import com.scandit.datacapture.barcode.C0671ib;
import com.scandit.datacapture.barcode.C0687jb;
import com.scandit.datacapture.barcode.C0703kb;
import com.scandit.datacapture.barcode.C0719lb;
import com.scandit.datacapture.barcode.C0735mb;
import com.scandit.datacapture.barcode.C0751nb;
import com.scandit.datacapture.barcode.C0767ob;
import com.scandit.datacapture.barcode.C0782pb;
import com.scandit.datacapture.barcode.C0830sb;
import com.scandit.datacapture.barcode.C0875ub;
import com.scandit.datacapture.barcode.C0890vb;
import com.scandit.datacapture.barcode.C0905wb;
import com.scandit.datacapture.barcode.EnumC0654ha;
import com.scandit.datacapture.barcode.EnumC0828s9;
import com.scandit.datacapture.barcode.HandlerC0609ed;
import com.scandit.datacapture.barcode.InterfaceC0593dd;
import com.scandit.datacapture.barcode.InterfaceC0815rb;
import com.scandit.datacapture.barcode.Qc;
import com.scandit.datacapture.barcode.Ra;
import com.scandit.datacapture.barcode.Rc;
import com.scandit.datacapture.barcode.Wc;
import com.scandit.datacapture.barcode.Za;
import com.scandit.datacapture.barcode.Zc;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanAnalyticsManager;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager;
import com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener;
import com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonView;
import com.scandit.datacapture.barcode.internal.module.spark.ui.feedback.SparkScanFeedbackManager;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview;
import com.scandit.datacapture.barcode.internal.module.spark.ui.toast.SparkScanViewToastPresenter;
import com.scandit.datacapture.barcode.spark.capture.SparkScan;
import com.scandit.datacapture.barcode.spark.capture.SparkScanListener;
import com.scandit.datacapture.barcode.spark.capture.SparkScanSession;
import com.scandit.datacapture.barcode.spark.capture.SparkScanViewDefaults;
import com.scandit.datacapture.barcode.spark.capture.SparkScanViewUiListener;
import com.scandit.datacapture.barcode.spark.feedback.SparkScanBarcodeFeedback;
import com.scandit.datacapture.barcode.spark.feedback.SparkScanFeedbackDelegate;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastType;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewState;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewStateDeserializer;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewStateHelper;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewStateSerializer;
import com.scandit.datacapture.barcode.spark.serialization.SparkScanScanningModeDeserializer;
import com.scandit.datacapture.barcode.spark.serialization.SparkScanScanningModeSerializer;
import com.scandit.datacapture.barcode.spark.ui.SparkScanPreviewBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningModeKt;
import com.scandit.datacapture.barcode.spark.ui.SparkScanView;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewHandMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings;
import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.extensions.LambdaExtensionsKt;
import com.scandit.datacapture.core.internal.module.serialization.NativeEnumDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeEnumSerializer;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.core.source.TorchStateDeserializer;
import com.scandit.datacapture.core.source.TorchStateSerializer;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SparkScanViewPresenter implements Zc, SparkScanListener, Ra, Za, Qc, InterfaceC0815rb {
    private final SparkScanView b;
    private final SparkScanStateManager c;
    private final SparkScan d;
    private final SparkScanViewSettings e;
    private final SparkScanViewCameraManager f;
    private final SparkScanViewMiniPreview g;
    private final SparkScanViewScanButtonView h;
    private final SparkScanFeedbackManager i;
    private final SparkScanViewToastPresenter j;
    private final SparkScanViewScanButtonTouchListener k;
    private final SparkScanAnalyticsManager l;
    private final NativeSparkScanStateMachine m;
    private InterfaceC0593dd n;
    private NativeSparkScanViewState o;
    private NativeSparkScanViewState p;
    private boolean q;
    private SparkScanViewUiListener r;

    public /* synthetic */ SparkScanViewPresenter(SparkScanView sparkScanView, SparkScanStateManager sparkScanStateManager, SparkScan sparkScan, SparkScanViewSettings sparkScanViewSettings, SparkScanViewCameraManager sparkScanViewCameraManager, SparkScanViewMiniPreview sparkScanViewMiniPreview, SparkScanViewScanButtonView sparkScanViewScanButtonView, SparkScanFeedbackManager sparkScanFeedbackManager, SparkScanViewToastPresenter sparkScanViewToastPresenter, SparkScanViewScanButtonTouchListener sparkScanViewScanButtonTouchListener, SparkScanAnalyticsManager sparkScanAnalyticsManager, NativeSparkScanStateMachine nativeSparkScanStateMachine) {
        this(sparkScanView, sparkScanStateManager, sparkScan, sparkScanViewSettings, sparkScanViewCameraManager, sparkScanViewMiniPreview, sparkScanViewScanButtonView, sparkScanFeedbackManager, sparkScanViewToastPresenter, sparkScanViewScanButtonTouchListener, sparkScanAnalyticsManager, nativeSparkScanStateMachine, null);
    }

    private final void S() {
        InterfaceC0593dd interfaceC0593dd;
        if (c() == NativeSparkScanViewState.INACTIVE || c() == NativeSparkScanViewState.ERROR || this.c.j() || (interfaceC0593dd = this.n) == null) {
            return;
        }
        HandlerC0609ed handlerC0609ed = (HandlerC0609ed) interfaceC0593dd;
        handlerC0609ed.removeMessages(2);
        handlerC0609ed.removeMessages(1);
        handlerC0609ed.b(this.c.i());
    }

    public final void A() {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(15);
        }
    }

    public final void B() {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(29);
        }
    }

    public final void C() {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(11);
        }
    }

    public final void D() {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(10);
        }
    }

    public final void E() {
        this.i.b();
        this.d.removeListener(this);
        this.k.a((SparkScanViewMiniPreview) null);
        this.g.removeAllViews();
        this.g.a((Ra) null);
        this.h.removeAllViews();
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).removeCallbacksAndMessages(null);
        }
        this.n = null;
        this.j.release();
        this.f.release();
        this.c.b(this);
        this.r = null;
    }

    public final void F() {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(13);
        }
    }

    public final void G() {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(17);
        }
    }

    public final void H() {
        InterfaceC0593dd interfaceC0593dd;
        if (!this.e.getHoldToScanEnabled() || (interfaceC0593dd = this.n) == null) {
            return;
        }
        ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(22);
    }

    public final void I() {
        InterfaceC0593dd interfaceC0593dd;
        if (!this.e.getHoldToScanEnabled() || (interfaceC0593dd = this.n) == null) {
            return;
        }
        ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(21);
    }

    public final void J() {
        this.q = true;
        this.p = c();
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).removeCallbacksAndMessages(null);
        }
        if (c() != NativeSparkScanViewState.INITIAL) {
            this.l.a(EnumC0828s9.USER);
            a(this, NativeSparkScanViewState.IDLE, false, 4);
            this.f.b((Callback) null);
        }
    }

    public final void K() {
        this.q = false;
        if (c() == NativeSparkScanViewState.IDLE) {
            this.f.b(C0875ub.f18223a);
        }
    }

    public final Bundle L() {
        Bundle bundle = new Bundle();
        NativeSparkScanViewState nativeSparkScanViewState = this.p;
        if (nativeSparkScanViewState != null) {
            bundle.putString("current_state", NativeSparkScanViewStateSerializer.toString(nativeSparkScanViewState));
            bundle.putString("current_mode", SparkScanScanningModeSerializer.toJson(this.c.m()));
            bundle.putString("current_torch_state", TorchStateSerializer.toJson(this.c.r()));
            bundle.putBoolean("current_zoom_state", this.c.u());
            bundle.putBoolean("current_expanded_state", this.c.e());
            bundle.putString("current_camera", NativeEnumSerializer.cameraPositionToString(this.c.a()));
        }
        return bundle;
    }

    public final void M() {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(12);
        }
    }

    public final void N() {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(18);
        }
    }

    public final void O() {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(16);
        }
    }

    public final void P() {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            HandlerC0609ed handlerC0609ed = (HandlerC0609ed) interfaceC0593dd;
            handlerC0609ed.removeCallbacksAndMessages(null);
            handlerC0609ed.sendEmptyMessage(2);
        }
    }

    public final void Q() {
        this.h.a(true);
        this.h.c();
        NativeSparkScanViewState nativeSparkScanViewStateC = c();
        if (a(nativeSparkScanViewStateC) || nativeSparkScanViewStateC == NativeSparkScanViewState.ERROR) {
            this.g.l();
        } else {
            this.g.g();
        }
        d(c());
    }

    public final void R() {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).removeCallbacksAndMessages(null);
        }
    }

    public final void T() {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(9);
        }
    }

    public final void U() {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(9);
        }
    }

    public final void V() {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(19);
        }
    }

    public final void f() {
        this.i.a();
        Callback callback = LambdaExtensionsKt.Callback(new f(this));
        Intrinsics.h(callback, "callback");
        a(this, false, false, 4);
        this.f.b(callback);
    }

    public final void g() {
        this.i.a();
        SparkScanStateManager sparkScanStateManager = this.c;
        sparkScanStateManager.a(Wc.e[sparkScanStateManager.a().ordinal()] == 1 ? CameraPosition.USER_FACING : CameraPosition.WORLD_FACING);
        this.f.c(new g(this, new i(this)));
        d(false);
        this.m.onCameraSwitchButtonTapped();
        this.h.b(c());
        S();
    }

    public final void h() {
        this.i.a();
        NativeSparkScanViewState nativeSparkScanViewStateC = c();
        NativeSparkScanViewState nativeSparkScanViewState = NativeSparkScanViewState.ACTIVE_EXPANDED;
        if (nativeSparkScanViewStateC == nativeSparkScanViewState && SparkScanScanningModeKt.getScanningBehavior(this.c.m()) == SparkScanScanningBehavior.SINGLE) {
            S();
            return;
        }
        if (nativeSparkScanViewStateC == nativeSparkScanViewState) {
            InterfaceC0593dd interfaceC0593dd = this.n;
            if (interfaceC0593dd != null) {
                ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(1);
                return;
            }
            return;
        }
        InterfaceC0593dd interfaceC0593dd2 = this.n;
        if (interfaceC0593dd2 != null) {
            ((HandlerC0609ed) interfaceC0593dd2).sendEmptyMessage(9);
        }
    }

    public final void i() {
        SparkScanViewHandMode sparkScanViewHandMode;
        this.i.a();
        int i = Wc.c[this.c.c().ordinal()];
        if (i == 1) {
            sparkScanViewHandMode = SparkScanViewHandMode.LEFT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            sparkScanViewHandMode = SparkScanViewHandMode.RIGHT;
        }
        this.c.a(sparkScanViewHandMode);
        this.h.b(c());
        S();
    }

    public final void j() {
        this.c.c(!this.c.f());
        this.h.b(c());
        this.i.a();
        S();
    }

    public final void k() {
        this.c.d(false);
        d(c());
        if (c() != NativeSparkScanViewState.ERROR) {
            this.i.a();
            InterfaceC0593dd interfaceC0593dd = this.n;
            if (interfaceC0593dd != null) {
                ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(1);
            }
        }
    }

    public final void l() {
        this.g.c(false);
        this.d.setSingleScanModeEnabled$scandit_barcode_capture(false);
        this.c.d(true);
        this.d._startManualFilterForLastScannedBarcodes$scandit_barcode_capture();
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).removeCallbacksAndMessages(null);
        }
        InterfaceC0593dd interfaceC0593dd2 = this.n;
        if (interfaceC0593dd2 != null) {
            ((HandlerC0609ed) interfaceC0593dd2).sendEmptyMessage(9);
        }
    }

    public final void m() {
        this.g.m();
    }

    public final void n() {
        S();
        if (this.c.e()) {
            this.c.b(false);
            this.g.n();
            this.g.h();
        } else {
            this.c.b(true);
            this.g.n();
            this.g.h();
            this.h.c();
            d(c());
        }
    }

    public final void o() {
        S();
        if (this.c.u()) {
            d(true);
            return;
        }
        if (this.c.u()) {
            return;
        }
        this.c.f(true);
        this.g.e(true);
        this.f.b();
        this.b._onZoomedIn$scandit_barcode_capture();
        this.m.onZoomIn();
        this.g.h();
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanListener
    public final void onBarcodeScanned(SparkScan sparkScan, SparkScanSession session, FrameData frameData) {
        Brush defaultBrush;
        Intrinsics.h(sparkScan, "sparkScan");
        Intrinsics.h(session, "session");
        Barcode newlyRecognizedBarcode = session.getNewlyRecognizedBarcode();
        if (newlyRecognizedBarcode != null) {
            SparkScanFeedbackDelegate feedbackDelegate = this.b.getFeedbackDelegate();
            SparkScanBarcodeFeedback feedbackForBarcode = feedbackDelegate != null ? feedbackDelegate.getFeedbackForBarcode(newlyRecognizedBarcode) : null;
            boolean z = feedbackForBarcode instanceof SparkScanBarcodeFeedback.Success;
            boolean z2 = !z && (feedbackForBarcode instanceof SparkScanBarcodeFeedback.Error) && ((SparkScanBarcodeFeedback.Error) feedbackForBarcode).getResumeCapturingDelay().asMillis() <= 0;
            if (SparkScanScanningModeKt.getScanningBehavior(this.c.m()) != SparkScanScanningBehavior.CONTINUOUS && !z2) {
                sparkScan._disable$scandit_barcode_capture();
            }
            SparkScanViewMiniPreview sparkScanViewMiniPreview = this.g;
            SparkScanBarcodeFeedback.Success success = z ? (SparkScanBarcodeFeedback.Success) feedbackForBarcode : null;
            if (success == null || (defaultBrush = success.getBrush()) == null) {
                defaultBrush = SparkScanViewDefaults.getDefaultBrush();
            }
            sparkScanViewMiniPreview.b(defaultBrush);
            InterfaceC0593dd interfaceC0593dd = this.n;
            if (interfaceC0593dd != null) {
                HandlerC0609ed handlerC0609ed = (HandlerC0609ed) interfaceC0593dd;
                if (z) {
                    handlerC0609ed.sendMessage(handlerC0609ed.obtainMessage(7, (SparkScanBarcodeFeedback.Success) feedbackForBarcode));
                } else if (feedbackForBarcode instanceof SparkScanBarcodeFeedback.Error) {
                    SparkScanBarcodeFeedback.Error error = (SparkScanBarcodeFeedback.Error) feedbackForBarcode;
                    handlerC0609ed.removeCallbacksAndMessages(null);
                    handlerC0609ed.sendMessage(handlerC0609ed.obtainMessage(5, error));
                    long jAsMillis = error.getResumeCapturingDelay().asMillis();
                    if (jAsMillis > 0 && jAsMillis >= 0) {
                        handlerC0609ed.sendEmptyMessageDelayed(4, jAsMillis);
                    }
                }
            }
            InterfaceC0593dd interfaceC0593dd2 = this.n;
            if (interfaceC0593dd2 != null) {
                HandlerC0609ed handlerC0609ed2 = (HandlerC0609ed) interfaceC0593dd2;
                handlerC0609ed2.sendMessage(handlerC0609ed2.obtainMessage(6, Boolean.valueOf(z2)));
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanListener
    public final void onSessionUpdated(SparkScan sparkScan, SparkScanSession sparkScanSession, FrameData frameData) {
        SparkScanListener.DefaultImpls.onSessionUpdated(this, sparkScan, sparkScanSession, frameData);
    }

    public final void p() {
        SparkScanScanningBehavior sparkScanScanningBehavior;
        this.i.a();
        int i = Wc.b[SparkScanScanningModeKt.getScanningBehavior(this.c.m()).ordinal()];
        if (i == 1) {
            sparkScanScanningBehavior = SparkScanScanningBehavior.CONTINUOUS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            sparkScanScanningBehavior = SparkScanScanningBehavior.SINGLE;
        }
        SparkScanStateManager sparkScanStateManager = this.c;
        sparkScanStateManager.a(SparkScanScanningModeKt.copyWith$default(sparkScanStateManager.m(), sparkScanScanningBehavior, null, 2, null));
        boolean z = SparkScanScanningModeKt.getScanningBehavior(this.c.m()) == SparkScanScanningBehavior.SINGLE;
        this.g.c(z);
        this.d.setSingleScanModeEnabled$scandit_barcode_capture(z);
        this.m.onScanningBehaviorButtonTapped();
        this.h.b(c());
        S();
    }

    public final void q() {
        this.i.a();
        this.c.e(!this.c.p());
        this.h.b(c());
        S();
    }

    public final void r() {
        this.i.a();
        SparkScanStateManager sparkScanStateManager = this.c;
        sparkScanStateManager.a(SparkScanScanningModeKt.changeMode(sparkScanStateManager.m()));
        SparkScanStateManager sparkScanStateManager2 = this.c;
        sparkScanStateManager2.b(SparkScanScanningModeKt.changeMode(sparkScanStateManager2.n()));
        this.f.a(this.c.m());
        if (a((NativeSparkScanViewState) null)) {
            int i = Wc.d[c().ordinal()];
            if (i == 1 || i == 2) {
                a(this, c(), true, 2);
            }
        }
        this.m.onTargetModeButtonTapped();
        this.h.b(c());
        S();
    }

    public final void s() {
        this.i.a();
        TorchState torchState = Wc.f17337a[this.c.r().ordinal()] == 1 ? TorchState.OFF : TorchState.ON;
        if (a((NativeSparkScanViewState) null)) {
            this.f.a(torchState, C0890vb.f18240a);
        }
        this.c.a(torchState);
        this.h.b(c());
        S();
        this.m.onTorchButtonTapped();
    }

    public final boolean t() {
        return this.c.u();
    }

    public final boolean u() {
        return this.c.j();
    }

    public final boolean v() {
        return SparkScanScanningModeKt.getPreviewBehavior(this.c.m()) == SparkScanPreviewBehavior.PERSISTENT;
    }

    public final void w() {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(23);
        }
    }

    public final void x() {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(27);
        }
    }

    public final void y() {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(25);
        }
    }

    public final void z() {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(14);
        }
    }

    public SparkScanViewPresenter(SparkScanView sparkScanView, SparkScanStateManager stateManager, SparkScan sparkScan, SparkScanViewSettings settings, SparkScanViewCameraManager cameraManager, SparkScanViewMiniPreview miniPreview, SparkScanViewScanButtonView scanButton, SparkScanFeedbackManager feedbackManager, SparkScanViewToastPresenter toastPresenter, SparkScanViewScanButtonTouchListener scanButtonTouchListener, SparkScanAnalyticsManager analyticsManager, NativeSparkScanStateMachine nativeStateMachine, InterfaceC0593dd interfaceC0593dd) {
        Intrinsics.h(sparkScanView, "sparkScanView");
        Intrinsics.h(stateManager, "stateManager");
        Intrinsics.h(sparkScan, "sparkScan");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(cameraManager, "cameraManager");
        Intrinsics.h(miniPreview, "miniPreview");
        Intrinsics.h(scanButton, "scanButton");
        Intrinsics.h(feedbackManager, "feedbackManager");
        Intrinsics.h(toastPresenter, "toastPresenter");
        Intrinsics.h(scanButtonTouchListener, "scanButtonTouchListener");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(nativeStateMachine, "nativeStateMachine");
        this.b = sparkScanView;
        this.c = stateManager;
        this.d = sparkScan;
        this.e = settings;
        this.f = cameraManager;
        this.g = miniPreview;
        this.h = scanButton;
        this.i = feedbackManager;
        this.j = toastPresenter;
        this.k = scanButtonTouchListener;
        this.l = analyticsManager;
        this.m = nativeStateMachine;
        this.n = interfaceC0593dd;
        nativeStateMachine.setViewHandlerDelegate(new Rc(this));
        nativeStateMachine.setToastPresenterDelegate(new C0830sb(this));
    }

    public final void b(EnumC0654ha gesture) {
        InterfaceC0593dd interfaceC0593dd;
        Intrinsics.h(gesture, "gesture");
        if (!((this.c.c() == SparkScanViewHandMode.LEFT && gesture == EnumC0654ha.DRAG_RIGHT) || (this.c.c() == SparkScanViewHandMode.RIGHT && gesture == EnumC0654ha.DRAG_LEFT)) || (interfaceC0593dd = this.n) == null) {
            return;
        }
        ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(1);
    }

    public final void e() {
        this.i.a();
        Callback callback = LambdaExtensionsKt.Callback(new d(this));
        Intrinsics.h(callback, "callback");
        a(this, false, false, 4);
        this.f.b(callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(NativeSparkScanViewState nativeSparkScanViewState) {
        int i = Wc.d[nativeSparkScanViewState.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            this.h.b(!this.q);
        } else {
            this.h.a(nativeSparkScanViewState);
        }
    }

    public final void a(SparkScanViewUiListener sparkScanViewUiListener) {
        this.r = sparkScanViewUiListener;
    }

    public final NativeSparkScanViewState c() {
        NativeSparkScanViewState viewState = this.m.getViewState();
        Intrinsics.g(viewState, "nativeStateMachine.viewState");
        return viewState;
    }

    public final void a(EnumC0654ha gesture) {
        InterfaceC0593dd interfaceC0593dd;
        Intrinsics.h(gesture, "gesture");
        if (!((this.c.c() == SparkScanViewHandMode.LEFT && gesture == EnumC0654ha.DRAG_LEFT) || (this.c.c() == SparkScanViewHandMode.RIGHT && gesture == EnumC0654ha.DRAG_RIGHT)) || (interfaceC0593dd = this.n) == null) {
            return;
        }
        HandlerC0609ed handlerC0609ed = (HandlerC0609ed) interfaceC0593dd;
        handlerC0609ed.removeCallbacksAndMessages(null);
        handlerC0609ed.sendEmptyMessage(19);
    }

    public final void c(NativeSparkScanViewState currentState) {
        Intrinsics.h(currentState, "currentState");
        if (Wc.d[currentState.ordinal()] == 1) {
            this.d._enable$scandit_barcode_capture();
        } else {
            this.d._disable$scandit_barcode_capture();
        }
        a(new k(this, currentState));
    }

    private final void d(boolean z) {
        if (this.c.u()) {
            this.c.f(false);
            this.g.e(false);
            this.f.b();
            this.b._onZoomedOut$scandit_barcode_capture();
            if (z) {
                this.m.onZoomOut();
            }
            this.g.h();
        }
    }

    public final void f(boolean z) {
        if (c() == NativeSparkScanViewState.ERROR) {
            return;
        }
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).removeMessages(1);
        }
        if (SparkScanScanningModeKt.getScanningBehavior(this.c.m()) == SparkScanScanningBehavior.CONTINUOUS) {
            S();
            return;
        }
        if (c() != NativeSparkScanViewState.IDLE) {
            if (z) {
                this.d.setSingleScanModeEnabled$scandit_barcode_capture(SparkScanScanningModeKt.getScanningBehavior(this.c.m()) == SparkScanScanningBehavior.SINGLE);
                S();
                return;
            }
            if (SparkScanScanningModeKt.getPreviewBehavior(this.c.m()) == SparkScanPreviewBehavior.PERSISTENT) {
                this.g.c(false);
                this.d.setSingleScanModeEnabled$scandit_barcode_capture(false);
                this.g.j();
                InterfaceC0593dd interfaceC0593dd2 = this.n;
                if (interfaceC0593dd2 != null) {
                    ((HandlerC0609ed) interfaceC0593dd2).removeMessages(10);
                }
                InterfaceC0593dd interfaceC0593dd3 = this.n;
                if (interfaceC0593dd3 != null) {
                    ((HandlerC0609ed) interfaceC0593dd3).sendEmptyMessage(1);
                    return;
                }
                return;
            }
            this.g.j();
            this.g.i();
            InterfaceC0593dd interfaceC0593dd4 = this.n;
            if (interfaceC0593dd4 != null) {
                ((HandlerC0609ed) interfaceC0593dd4).removeMessages(10);
            }
            InterfaceC0593dd interfaceC0593dd5 = this.n;
            if (interfaceC0593dd5 != null) {
                ((HandlerC0609ed) interfaceC0593dd5).sendEmptyMessage(1);
            }
        }
    }

    public final void j(boolean z) {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            HandlerC0609ed handlerC0609ed = (HandlerC0609ed) interfaceC0593dd;
            handlerC0609ed.sendMessage(handlerC0609ed.obtainMessage(26, Boolean.valueOf(z)));
        }
    }

    public final void e(boolean z) {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            HandlerC0609ed handlerC0609ed = (HandlerC0609ed) interfaceC0593dd;
            handlerC0609ed.sendMessage(handlerC0609ed.obtainMessage(24, Boolean.valueOf(z)));
        }
    }

    public final void b(String text) {
        Intrinsics.h(text, "text");
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            HandlerC0609ed handlerC0609ed = (HandlerC0609ed) interfaceC0593dd;
            handlerC0609ed.sendMessage(handlerC0609ed.obtainMessage(20, text));
        }
    }

    public static final void c(SparkScanViewPresenter sparkScanViewPresenter, NativeSparkScanViewState nativeSparkScanViewState) {
        if (!sparkScanViewPresenter.a(nativeSparkScanViewState) && nativeSparkScanViewState != NativeSparkScanViewState.ERROR) {
            sparkScanViewPresenter.g.g();
        } else {
            sparkScanViewPresenter.g.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function0 tmp0) {
        Intrinsics.h(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final void i(boolean z) {
        EnumC0828s9 enumC0828s9;
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            ((HandlerC0609ed) interfaceC0593dd).removeCallbacksAndMessages(null);
        }
        if (!z) {
            enumC0828s9 = EnumC0828s9.USER;
        } else if (z) {
            enumC0828s9 = EnumC0828s9.TIMEOUT;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.l.a(enumC0828s9);
        InterfaceC0593dd interfaceC0593dd2 = this.n;
        if (interfaceC0593dd2 != null) {
            ((HandlerC0609ed) interfaceC0593dd2).a(this.c.h());
        }
        a(this, NativeSparkScanViewState.INACTIVE, false, 6);
    }

    public static final void b(SparkScanViewPresenter sparkScanViewPresenter, NativeSparkScanViewState nativeSparkScanViewState) {
        if (SparkScanScanningModeKt.getPreviewBehavior(sparkScanViewPresenter.c.m()) == SparkScanPreviewBehavior.PERSISTENT && nativeSparkScanViewState == NativeSparkScanViewState.INACTIVE) {
            sparkScanViewPresenter.g.j();
        }
        if (nativeSparkScanViewState == NativeSparkScanViewState.ACTIVE_EXPANDED) {
            sparkScanViewPresenter.g.e();
        }
    }

    public final void a(String text) {
        Intrinsics.h(text, "text");
        this.j.a(new C0623fb(text));
    }

    public final void g(boolean z) {
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            HandlerC0609ed handlerC0609ed = (HandlerC0609ed) interfaceC0593dd;
            handlerC0609ed.sendMessage(handlerC0609ed.obtainMessage(26, Boolean.valueOf(z)));
        }
    }

    public static void a(SparkScanViewPresenter sparkScanViewPresenter, boolean z, boolean z2, int i) {
        EnumC0828s9 enumC0828s9;
        boolean z3 = (i & 2) != 0;
        if ((i & 4) != 0) {
            z2 = false;
        }
        NativeSparkScanViewState nativeSparkScanViewState = NativeSparkScanViewState.IDLE;
        if (z3) {
            sparkScanViewPresenter.getClass();
            m mVar = new m(sparkScanViewPresenter);
            n nVar = n.f17796a;
            if (sparkScanViewPresenter.a(nativeSparkScanViewState)) {
                sparkScanViewPresenter.f.a(LambdaExtensionsKt.Callback(new o(sparkScanViewPresenter, nVar)));
            } else {
                sparkScanViewPresenter.f.b(new p(mVar));
            }
        }
        if (z2) {
            sparkScanViewPresenter.m.forceViewState(nativeSparkScanViewState);
        } else {
            sparkScanViewPresenter.m.setViewState(nativeSparkScanViewState);
        }
        if (z) {
            enumC0828s9 = EnumC0828s9.TIMEOUT;
        } else if (!z) {
            enumC0828s9 = EnumC0828s9.USER;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        sparkScanViewPresenter.l.a(enumC0828s9);
        sparkScanViewPresenter.j.a();
    }

    public final void c(boolean z) {
        if (z) {
            return;
        }
        d(true);
    }

    public final TorchState d() {
        return this.c.r();
    }

    public final void h(boolean z) {
        this.i.a();
        a(this, z, false, 6);
    }

    public final void b(boolean z) {
        if (z) {
            return;
        }
        this.c.b(false);
        this.g.n();
        this.g.h();
    }

    public final void b(NativeSparkScanViewState initialState) {
        Intrinsics.h(initialState, "initialState");
        InterfaceC0593dd handlerC0609ed = this.n;
        if (handlerC0609ed == null) {
            handlerC0609ed = new HandlerC0609ed(this);
        }
        this.n = handlerC0609ed;
        this.d.addListener(this);
        this.f.a(C0905wb.f18252a);
        this.k.a(this.g);
        this.g.a(this);
        this.c.a(this);
        NativeSparkScanViewState nativeSparkScanViewState = this.o;
        if (nativeSparkScanViewState == null) {
            nativeSparkScanViewState = initialState;
        }
        int[] iArr = Wc.d;
        int i = iArr[nativeSparkScanViewState.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            this.h.a(false);
        }
        NativeSparkScanViewState nativeSparkScanViewState2 = this.o;
        if (nativeSparkScanViewState2 != null) {
            initialState = nativeSparkScanViewState2;
        }
        int i2 = iArr[initialState.ordinal()];
        if (i2 == 1) {
            this.h.c();
            InterfaceC0593dd interfaceC0593dd = this.n;
            if (interfaceC0593dd != null) {
                ((HandlerC0609ed) interfaceC0593dd).sendEmptyMessage(9);
            }
        } else if (i2 == 2 || i2 == 3) {
            InterfaceC0593dd interfaceC0593dd2 = this.n;
            if (interfaceC0593dd2 != null) {
                ((HandlerC0609ed) interfaceC0593dd2).sendEmptyMessage(1);
            }
        } else if (i2 == 4) {
            a(this, false, true, 2);
        } else if (i2 == 5) {
            a(this, NativeSparkScanViewState.INITIAL, false, 6);
        }
        this.o = null;
    }

    public static void a(SparkScanViewPresenter sparkScanViewPresenter, NativeSparkScanViewState nativeSparkScanViewState, boolean z, int i) {
        boolean z2 = (i & 2) != 0;
        if ((i & 4) != 0) {
            z = false;
        }
        if (z2) {
            sparkScanViewPresenter.getClass();
            m mVar = new m(sparkScanViewPresenter);
            n nVar = n.f17796a;
            if (sparkScanViewPresenter.a(nativeSparkScanViewState)) {
                sparkScanViewPresenter.f.a(LambdaExtensionsKt.Callback(new o(sparkScanViewPresenter, nVar)));
            } else {
                sparkScanViewPresenter.f.b(new p(mVar));
            }
        }
        if (z) {
            sparkScanViewPresenter.m.forceViewState(nativeSparkScanViewState);
        } else {
            sparkScanViewPresenter.m.setViewState(nativeSparkScanViewState);
        }
    }

    public final CameraPosition b() {
        return this.c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Function0 function0) {
        if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
            return;
        }
        InterfaceC0593dd interfaceC0593dd = this.n;
        if (interfaceC0593dd != null) {
            interfaceC0593dd.post(new androidx.compose.ui.viewinterop.a(4, function0));
        }
    }

    public static final void a(SparkScanViewPresenter sparkScanViewPresenter, NativeSparkScanViewState nativeSparkScanViewState, Function0 function0, Function0 function02) {
        if (sparkScanViewPresenter.a(nativeSparkScanViewState)) {
            sparkScanViewPresenter.f.a(LambdaExtensionsKt.Callback(new o(sparkScanViewPresenter, function0)));
        } else {
            sparkScanViewPresenter.f.b(new p(function02));
        }
    }

    public static final void a(SparkScanViewPresenter sparkScanViewPresenter, NativeSparkScanViewState nativeSparkScanViewState) {
        Object parent = sparkScanViewPresenter.g.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.setClickable(nativeSparkScanViewState == NativeSparkScanViewState.ACTIVE_EXPANDED || nativeSparkScanViewState == NativeSparkScanViewState.ERROR || nativeSparkScanViewState == NativeSparkScanViewState.INACTIVE);
            view.setFocusable(view.isClickable());
        }
    }

    public final void a() {
        a(this, NativeSparkScanViewState.ACTIVE_EXPANDED, true, 2);
        this.l.a();
        S();
        this.j.a();
        boolean z = SparkScanScanningModeKt.getScanningBehavior(this.c.m()) == SparkScanScanningBehavior.SINGLE;
        this.g.c(z);
        this.d.setSingleScanModeEnabled$scandit_barcode_capture(z);
    }

    private final boolean a(NativeSparkScanViewState nativeSparkScanViewState) {
        if (nativeSparkScanViewState == null) {
            nativeSparkScanViewState = c();
        }
        if (NativeSparkScanViewStateHelper.isCaptureEnabledState(nativeSparkScanViewState)) {
            return true;
        }
        return SparkScanScanningModeKt.getPreviewBehavior(this.c.m()) == SparkScanPreviewBehavior.PERSISTENT && nativeSparkScanViewState == NativeSparkScanViewState.INACTIVE;
    }

    public final void a(boolean z) {
        S();
        if (!z) {
            if (z) {
                return;
            }
            d(true);
        } else {
            if (this.c.u()) {
                return;
            }
            this.c.f(true);
            this.g.e(true);
            this.f.b();
            this.b._onZoomedIn$scandit_barcode_capture();
            this.m.onZoomIn();
            this.g.h();
        }
    }

    @Override // com.scandit.datacapture.barcode.Za
    public final void a(SparkScanScanningMode previousMode, SparkScanScanningMode newMode) {
        Intrinsics.h(previousMode, "previousMode");
        Intrinsics.h(newMode, "newMode");
        this.d._applyNewSettingsForScanningModeAndZoomLevel$scandit_barcode_capture(this.c.u(), newMode);
        a(new j(this, newMode));
    }

    public final void a(SparkScanBarcodeFeedback.Success success) {
        Intrinsics.h(success, "success");
        this.i.a(success.getFeedback());
        this.i.b(success.getVisualFeedbackColor());
    }

    public final void a(SparkScanBarcodeFeedback.Error error) {
        Intrinsics.h(error, "error");
        boolean z = error.getResumeCapturingDelay().asMillis() > 0;
        if (z) {
            a(this, NativeSparkScanViewState.ERROR, false, 6);
            SparkScanViewToastPresenter sparkScanViewToastPresenter = this.j;
            String message = error.getMessage();
            NativeColor nativeColorDefaultErrorToastBackgroundColor = NativeSparkScanViewDefaults.defaultErrorToastBackgroundColor();
            Intrinsics.g(nativeColorDefaultErrorToastBackgroundColor, "defaultErrorToastBackgroundColor()");
            int i = NativeColorExtensionsKt.toInt(nativeColorDefaultErrorToastBackgroundColor);
            NativeColor nativeColorDefaultErrorToastTextColor = NativeSparkScanViewDefaults.defaultErrorToastTextColor();
            Intrinsics.g(nativeColorDefaultErrorToastTextColor, "defaultErrorToastTextColor()");
            sparkScanViewToastPresenter.a(new C0639gb(i, NativeColorExtensionsKt.toInt(nativeColorDefaultErrorToastTextColor), message));
            this.h.b();
        }
        this.i.a(error.getFeedback());
        this.i.a(error.getVisualFeedbackColor());
        this.g.a(error.getBrush(), !z);
    }

    public final void a(Bundle bundle) {
        Intrinsics.h(bundle, "bundle");
        String string = bundle.getString("current_state");
        if (string != null) {
            this.o = NativeSparkScanViewStateDeserializer.fromString(string);
        }
        String string2 = bundle.getString("current_mode");
        if (string2 != null) {
            this.c.a(SparkScanScanningModeDeserializer.fromJson(string2));
        }
        String string3 = bundle.getString("current_torch_state");
        if (string3 != null) {
            this.c.a(TorchStateDeserializer.fromJson(string3));
        }
        this.c.f(bundle.getBoolean("current_zoom_state"));
        this.c.b(bundle.getBoolean("current_expanded_state"));
        String string4 = bundle.getString("current_camera");
        if (string4 != null) {
            SparkScanStateManager sparkScanStateManager = this.c;
            CameraPosition cameraPositionCameraPositionFromJsonString = NativeEnumDeserializer.cameraPositionFromJsonString(string4);
            Intrinsics.g(cameraPositionCameraPositionFromJsonString, "cameraPositionFromJsonString(it)");
            sparkScanStateManager.a(cameraPositionCameraPositionFromJsonString);
        }
    }

    public final void a(NativeSparkScanToastType toast) {
        AbstractC0800qb c0687jb;
        Intrinsics.h(toast, "toast");
        switch (Wc.f[toast.ordinal()]) {
            case 1:
                String strDefaultTargetModeEnabledMessage = NativeSparkScanViewDefaults.defaultTargetModeEnabledMessage();
                Intrinsics.g(strDefaultTargetModeEnabledMessage, "defaultTargetModeEnabledMessage()");
                NativeColor nativeColorDefaultToastEnabledBackgroundColor = NativeSparkScanViewDefaults.defaultToastEnabledBackgroundColor();
                Intrinsics.g(nativeColorDefaultToastEnabledBackgroundColor, "defaultToastEnabledBackgroundColor()");
                c0687jb = new C0687jb(strDefaultTargetModeEnabledMessage, NativeColorExtensionsKt.toInt(nativeColorDefaultToastEnabledBackgroundColor));
                break;
            case 2:
                String strDefaultTargetModeDisabledMessage = NativeSparkScanViewDefaults.defaultTargetModeDisabledMessage();
                Intrinsics.g(strDefaultTargetModeDisabledMessage, "defaultTargetModeDisabledMessage()");
                c0687jb = new C0671ib(strDefaultTargetModeDisabledMessage);
                break;
            case 3:
                String strDefaultContinuousModeEnabledMessage = NativeSparkScanViewDefaults.defaultContinuousModeEnabledMessage();
                Intrinsics.g(strDefaultContinuousModeEnabledMessage, "defaultContinuousModeEnabledMessage()");
                NativeColor nativeColorDefaultToastEnabledBackgroundColor2 = NativeSparkScanViewDefaults.defaultToastEnabledBackgroundColor();
                Intrinsics.g(nativeColorDefaultToastEnabledBackgroundColor2, "defaultToastEnabledBackgroundColor()");
                c0687jb = new C0607eb(strDefaultContinuousModeEnabledMessage, NativeColorExtensionsKt.toInt(nativeColorDefaultToastEnabledBackgroundColor2));
                break;
            case 4:
                String strDefaultContinuousModeDisabledMessage = NativeSparkScanViewDefaults.defaultContinuousModeDisabledMessage();
                Intrinsics.g(strDefaultContinuousModeDisabledMessage, "defaultContinuousModeDisabledMessage()");
                c0687jb = new C0591db(strDefaultContinuousModeDisabledMessage);
                break;
            case 5:
                String strDefaultScanPausedMessage = NativeSparkScanViewDefaults.defaultScanPausedMessage();
                Intrinsics.g(strDefaultScanPausedMessage, "defaultScanPausedMessage()");
                c0687jb = new C0655hb(strDefaultScanPausedMessage);
                break;
            case 6:
                String strDefaultZoomedInMessage = NativeSparkScanViewDefaults.defaultZoomedInMessage();
                Intrinsics.g(strDefaultZoomedInMessage, "defaultZoomedInMessage()");
                NativeColor nativeColorDefaultToastEnabledBackgroundColor3 = NativeSparkScanViewDefaults.defaultToastEnabledBackgroundColor();
                Intrinsics.g(nativeColorDefaultToastEnabledBackgroundColor3, "defaultToastEnabledBackgroundColor()");
                c0687jb = new C0767ob(strDefaultZoomedInMessage, NativeColorExtensionsKt.toInt(nativeColorDefaultToastEnabledBackgroundColor3));
                break;
            case 7:
                String strDefaultZoomedOutMessage = NativeSparkScanViewDefaults.defaultZoomedOutMessage();
                Intrinsics.g(strDefaultZoomedOutMessage, "defaultZoomedOutMessage()");
                c0687jb = new C0782pb(strDefaultZoomedOutMessage);
                break;
            case 8:
                String strDefaultTorchEnabledMessage = NativeSparkScanViewDefaults.defaultTorchEnabledMessage();
                Intrinsics.g(strDefaultTorchEnabledMessage, "defaultTorchEnabledMessage()");
                NativeColor nativeColorDefaultToastEnabledBackgroundColor4 = NativeSparkScanViewDefaults.defaultToastEnabledBackgroundColor();
                Intrinsics.g(nativeColorDefaultToastEnabledBackgroundColor4, "defaultToastEnabledBackgroundColor()");
                c0687jb = new C0719lb(strDefaultTorchEnabledMessage, NativeColorExtensionsKt.toInt(nativeColorDefaultToastEnabledBackgroundColor4));
                break;
            case 9:
                String strDefaultTorchDisabledMessage = NativeSparkScanViewDefaults.defaultTorchDisabledMessage();
                Intrinsics.g(strDefaultTorchDisabledMessage, "defaultTorchDisabledMessage()");
                c0687jb = new C0703kb(strDefaultTorchDisabledMessage);
                break;
            case 10:
                String strDefaultUserFacingCameraEnabledMessage = NativeSparkScanViewDefaults.defaultUserFacingCameraEnabledMessage();
                Intrinsics.g(strDefaultUserFacingCameraEnabledMessage, "defaultUserFacingCameraEnabledMessage()");
                NativeColor nativeColorDefaultToastEnabledBackgroundColor5 = NativeSparkScanViewDefaults.defaultToastEnabledBackgroundColor();
                Intrinsics.g(nativeColorDefaultToastEnabledBackgroundColor5, "defaultToastEnabledBackgroundColor()");
                c0687jb = new C0735mb(strDefaultUserFacingCameraEnabledMessage, NativeColorExtensionsKt.toInt(nativeColorDefaultToastEnabledBackgroundColor5));
                break;
            case 11:
                String strDefaultWorldFacingCameraEnabledMessage = NativeSparkScanViewDefaults.defaultWorldFacingCameraEnabledMessage();
                Intrinsics.g(strDefaultWorldFacingCameraEnabledMessage, "defaultWorldFacingCameraEnabledMessage()");
                c0687jb = new C0751nb(strDefaultWorldFacingCameraEnabledMessage);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.j.a(c0687jb);
    }
}
