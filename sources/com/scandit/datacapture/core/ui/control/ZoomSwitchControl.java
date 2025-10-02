package com.scandit.datacapture.core.ui.control;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.VisibleForTesting;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.module.ui.control.ToggleImageButton;
import com.scandit.datacapture.core.internal.module.ui.control.zoom.ZoomControlIconsHandler;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.common.zoom.ZoomSwitchControlDeserializer;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.r8;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceListener;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.control.Control;
import com.scandit.datacapture.core.ui.control.ZoomSwitchControl;
import com.scandit.datacapture.core.ui.gesture.ZoomGesture;
import com.scandit.datacapture.core.ui.gesture.ZoomGestureListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 @2\u00020\u0001:\u0002@AB\u0019\b\u0001\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<B\u0011\b\u0016\u0012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b;\u0010?J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0010R*\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0000@BX\u0081\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R$\u0010(\u001a\u00020#2\u0006\u0010$\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b\u0012\u0010'R$\u0010*\u001a\u00020#2\u0006\u0010$\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010&\"\u0004\b\u0013\u0010'R$\u0010,\u001a\u00020#2\u0006\u0010$\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010&\"\u0004\b\u0014\u0010'R$\u0010.\u001a\u00020#2\u0006\u0010$\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010&\"\u0004\b\u0015\u0010'R\u0011\u00100\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b/\u0010&R\u0011\u00102\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b1\u0010&R\u0011\u00104\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b3\u0010&R\u0011\u00106\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b5\u0010&¨\u0006B"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl;", "Lcom/scandit/datacapture/core/ui/control/Control;", "", "json", "", "updateFromJson", "Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;", "zoomGesture", "_onZoomGestureChanged", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "dataCaptureView", "_onDataCaptureViewChanged", "Lcom/scandit/datacapture/core/source/FrameSource;", "frameSource", "_onFrameSourceChanged", "_onRemoveControl", "", "resId", "setZoomedOutImage", "setZoomedOutPressedImage", "setZoomedInImage", "setZoomedInPressedImage", "Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState;", "<set-?>", "c", "Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState;", "getCurrentZoomState$scandit_capture_core", "()Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState;", "getCurrentZoomState$scandit_capture_core$annotations", "()V", "currentZoomState", "Landroid/view/View;", "get_view", "()Landroid/view/View;", "_view", "Landroid/graphics/Bitmap;", "value", "getZoomedOutImage", "()Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "zoomedOutImage", "getZoomedOutPressedImage", "zoomedOutPressedImage", "getZoomedInImage", "zoomedInImage", "getZoomedInPressedImage", "zoomedInPressedImage", "getDefaultZoomedOutImage", "defaultZoomedOutImage", "getDefaultZoomedOutPressedImage", "defaultZoomedOutPressedImage", "getDefaultZoomedInImage", "defaultZoomedInImage", "getDefaultZoomedInPressedImage", "defaultZoomedInPressedImage", "Lcom/scandit/datacapture/core/internal/module/ui/control/zoom/ZoomControlIconsHandler;", "iconsHandler", "Lcom/scandit/datacapture/core/internal/module/ui/control/ToggleImageButton;", "view", "<init>", "(Lcom/scandit/datacapture/core/internal/module/ui/control/zoom/ZoomControlIconsHandler;Lcom/scandit/datacapture/core/internal/module/ui/control/ToggleImageButton;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Companion", "ZoomState", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ZoomSwitchControl implements Control {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final ZoomControlIconsHandler f18905a;
    private final ToggleImageButton b;

    /* renamed from: c, reason: from kotlin metadata */
    private volatile ZoomState currentZoomState;
    private volatile ZoomGesture d;
    private WeakReference e;
    private WeakReference f;
    private AnonymousClass2 g;
    private final ZoomSwitchControl$zoomGestureListener$1 h;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$Companion;", "", "Landroid/content/Context;", "context", "", "json", "Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl;", "fromJson", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ZoomSwitchControl fromJson(@NotNull Context context, @NotNull String json) {
            Intrinsics.h(context, "context");
            Intrinsics.h(json, "json");
            return ZoomSwitchControlDeserializer.fromJson(context, new JsonValue(json));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState;", "", "ZoomedIn", "ZoomedOut", "Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState$ZoomedIn;", "Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState$ZoomedOut;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static abstract class ZoomState {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState$ZoomedIn;", "Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
        public static final class ZoomedIn extends ZoomState {

            @NotNull
            public static final ZoomedIn INSTANCE = new ZoomedIn();

            private ZoomedIn() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState$ZoomedOut;", "Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
        public static final class ZoomedOut extends ZoomState {

            @NotNull
            public static final ZoomedOut INSTANCE = new ZoomedOut();

            private ZoomedOut() {
                super(null);
            }
        }

        public /* synthetic */ ZoomState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ZoomState() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.scandit.datacapture.core.ui.control.ZoomSwitchControl$zoomGestureListener$1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.scandit.datacapture.core.ui.control.ZoomSwitchControl$1] */
    @VisibleForTesting
    public ZoomSwitchControl(@NotNull ZoomControlIconsHandler iconsHandler, @NotNull ToggleImageButton view) {
        Intrinsics.h(iconsHandler, "iconsHandler");
        Intrinsics.h(view, "view");
        this.f18905a = iconsHandler;
        this.b = view;
        this.currentZoomState = ZoomState.ZoomedOut.INSTANCE;
        this.e = new WeakReference(null);
        this.f = new WeakReference(null);
        this.h = new ZoomGestureListener() { // from class: com.scandit.datacapture.core.ui.control.ZoomSwitchControl$zoomGestureListener$1
            @Override // com.scandit.datacapture.core.ui.gesture.ZoomGestureListener
            public void onZoomInGesture(@NotNull ZoomGesture zoomGesture) {
                Intrinsics.h(zoomGesture, "zoomGesture");
                this.f18908a.currentZoomState = ZoomSwitchControl.ZoomState.ZoomedIn.INSTANCE;
                ZoomSwitchControl.access$showImageForCurrentState(this.f18908a);
            }

            @Override // com.scandit.datacapture.core.ui.gesture.ZoomGestureListener
            public void onZoomOutGesture(@NotNull ZoomGesture zoomGesture) {
                Intrinsics.h(zoomGesture, "zoomGesture");
                this.f18908a.currentZoomState = ZoomSwitchControl.ZoomState.ZoomedOut.INSTANCE;
                ZoomSwitchControl.access$showImageForCurrentState(this.f18908a);
            }
        };
        iconsHandler.a((AnonymousClass1) new r8() { // from class: com.scandit.datacapture.core.ui.control.ZoomSwitchControl.1
            @Override // com.scandit.datacapture.core.r8
            public void onIconsChanged(@NotNull ZoomState state, boolean pressed) {
                Intrinsics.h(state, "state");
                if (Intrinsics.c(ZoomSwitchControl.this.getCurrentZoomState(), state) && ZoomSwitchControl.this.b.c() == pressed) {
                    ZoomSwitchControl.access$showImageForCurrentState(ZoomSwitchControl.this);
                }
            }
        });
        view.b(new m(this));
        view.a(new n(this));
    }

    public static final void access$showImageForCurrentState(ZoomSwitchControl zoomSwitchControl) {
        synchronized (zoomSwitchControl) {
            Bitmap bitmapA = zoomSwitchControl.f18905a.a(zoomSwitchControl.currentZoomState, zoomSwitchControl.b.c());
            if (bitmapA != null) {
                zoomSwitchControl.b.a(bitmapA);
            }
        }
    }

    public static final void access$toggleZoom(ZoomSwitchControl zoomSwitchControl) {
        ZoomState zoomState;
        ZoomState zoomState2 = zoomSwitchControl.currentZoomState;
        if (zoomState2 instanceof ZoomState.ZoomedOut) {
            DataCaptureView dataCaptureView = (DataCaptureView) zoomSwitchControl.e.get();
            if (dataCaptureView != null) {
                dataCaptureView._performUiTriggeredZoomIn();
            }
            zoomState = ZoomState.ZoomedIn.INSTANCE;
        } else {
            if (!(zoomState2 instanceof ZoomState.ZoomedIn)) {
                throw new NoWhenBranchMatchedException();
            }
            DataCaptureView dataCaptureView2 = (DataCaptureView) zoomSwitchControl.e.get();
            if (dataCaptureView2 != null) {
                dataCaptureView2._performUiTriggeredZoomOut();
            }
            zoomState = ZoomState.ZoomedOut.INSTANCE;
        }
        zoomSwitchControl.currentZoomState = zoomState;
        synchronized (zoomSwitchControl) {
            Bitmap bitmapA = zoomSwitchControl.f18905a.a(zoomSwitchControl.currentZoomState, zoomSwitchControl.b.c());
            if (bitmapA != null) {
                zoomSwitchControl.b.a(bitmapA);
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final ZoomSwitchControl fromJson(@NotNull Context context, @NotNull String str) {
        return INSTANCE.fromJson(context, str);
    }

    @VisibleForTesting
    public static /* synthetic */ void getCurrentZoomState$scandit_capture_core$annotations() {
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onDataCaptureContextChanged(@Nullable DataCaptureContext dataCaptureContext) {
        Control.DefaultImpls._onDataCaptureContextChanged(this, dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onDataCaptureViewChanged(@Nullable DataCaptureView dataCaptureView) {
        this.e = new WeakReference(dataCaptureView);
        ZoomGesture zoomGesture = dataCaptureView != null ? dataCaptureView.getZoomGesture() : null;
        if (Intrinsics.c(this.d, zoomGesture)) {
            return;
        }
        ZoomGesture zoomGesture2 = this.d;
        if (zoomGesture2 != null) {
            zoomGesture2.removeListener(this.h);
        }
        this.d = zoomGesture;
        ZoomGesture zoomGesture3 = this.d;
        if (zoomGesture3 != null) {
            zoomGesture3.addListener(this.h);
        }
        ZoomGesture zoomGesture4 = this.d;
        if (zoomGesture4 != null) {
            zoomGesture4.triggerZoomOut();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.scandit.datacapture.core.source.FrameSourceListener, com.scandit.datacapture.core.ui.control.ZoomSwitchControl$_onFrameSourceChanged$2] */
    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onFrameSourceChanged(@Nullable FrameSource frameSource) {
        FrameSource frameSource2;
        DataCaptureView dataCaptureView = (DataCaptureView) this.e.get();
        if (dataCaptureView != null) {
            dataCaptureView._performUiTriggeredZoomOut();
        }
        this.currentZoomState = ZoomState.ZoomedOut.INSTANCE;
        synchronized (this) {
            Bitmap bitmapA = this.f18905a.a(this.currentZoomState, this.b.c());
            if (bitmapA != null) {
                this.b.a(bitmapA);
            }
        }
        AnonymousClass2 anonymousClass2 = this.g;
        if (anonymousClass2 != null && (frameSource2 = (FrameSource) this.f.get()) != null) {
            frameSource2.removeListener(anonymousClass2);
        }
        WeakReference weakReference = new WeakReference(frameSource);
        this.f = weakReference;
        ?? r4 = new FrameSourceListener() { // from class: com.scandit.datacapture.core.ui.control.ZoomSwitchControl._onFrameSourceChanged.2
            @Override // com.scandit.datacapture.core.source.FrameSourceListener
            @ProxyFunction(nativeName = "onFrameOutputAndroid")
            public void onFrameOutput(@NotNull FrameSource frameSource3, @NotNull FrameData frameData) {
                FrameSourceListener.DefaultImpls.onFrameOutput(this, frameSource3, frameData);
            }

            @Override // com.scandit.datacapture.core.source.FrameSourceListener
            @ProxyFunction
            public void onObservationStarted(@NotNull FrameSource frameSource3) {
                FrameSourceListener.DefaultImpls.onObservationStarted(this, frameSource3);
            }

            @Override // com.scandit.datacapture.core.source.FrameSourceListener
            @ProxyFunction
            public void onObservationStopped(@NotNull FrameSource frameSource3) {
                FrameSourceListener.DefaultImpls.onObservationStopped(this, frameSource3);
            }

            @Override // com.scandit.datacapture.core.source.FrameSourceListener
            public void onStateChanged(@NotNull FrameSource frameSource3, @NotNull FrameSourceState newState) {
                Intrinsics.h(frameSource3, "frameSource");
                Intrinsics.h(newState, "newState");
                if (newState == FrameSourceState.STARTING) {
                    ZoomSwitchControl.this.currentZoomState = ZoomState.ZoomedOut.INSTANCE;
                    ZoomSwitchControl.access$showImageForCurrentState(ZoomSwitchControl.this);
                }
            }
        };
        FrameSource frameSource3 = (FrameSource) weakReference.get();
        if (frameSource3 != 0) {
            frameSource3.addListener(r4);
        }
        this.g = r4;
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onRemoveControl() {
        FrameSource frameSource;
        AnonymousClass2 anonymousClass2 = this.g;
        if (anonymousClass2 != null && (frameSource = (FrameSource) this.f.get()) != null) {
            frameSource.removeListener(anonymousClass2);
        }
        this.g = null;
        this.f.clear();
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onZoomGestureChanged(@Nullable ZoomGesture zoomGesture) {
        if (Intrinsics.c(this.d, zoomGesture)) {
            return;
        }
        ZoomGesture zoomGesture2 = this.d;
        if (zoomGesture2 != null) {
            zoomGesture2.removeListener(this.h);
        }
        this.d = zoomGesture;
        ZoomGesture zoomGesture3 = this.d;
        if (zoomGesture3 != null) {
            zoomGesture3.addListener(this.h);
        }
        ZoomGesture zoomGesture4 = this.d;
        if (zoomGesture4 != null) {
            zoomGesture4.triggerZoomOut();
        }
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _removeChildControl(@NotNull Control control) {
        Control.DefaultImpls._removeChildControl(this, control);
    }

    @NotNull
    /* renamed from: getCurrentZoomState$scandit_capture_core, reason: from getter */
    public final ZoomState getCurrentZoomState() {
        return this.currentZoomState;
    }

    @NotNull
    public final Bitmap getDefaultZoomedInImage() {
        return this.f18905a.a();
    }

    @NotNull
    public final Bitmap getDefaultZoomedInPressedImage() {
        return this.f18905a.b();
    }

    @NotNull
    public final Bitmap getDefaultZoomedOutImage() {
        return this.f18905a.c();
    }

    @NotNull
    public final Bitmap getDefaultZoomedOutPressedImage() {
        return this.f18905a.d();
    }

    @NotNull
    public final Bitmap getZoomedInImage() {
        return this.f18905a.e();
    }

    @NotNull
    public final Bitmap getZoomedInPressedImage() {
        return this.f18905a.f();
    }

    @NotNull
    public final Bitmap getZoomedOutImage() {
        return this.f18905a.g();
    }

    @NotNull
    public final Bitmap getZoomedOutPressedImage() {
        return this.f18905a.h();
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    @NotNull
    public List<Control> get_childControls() {
        return Control.DefaultImpls.get_childControls(this);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public boolean get_isControlGroup() {
        return Control.DefaultImpls.get_isControlGroup(this);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    @NotNull
    public View get_view() {
        return this.b;
    }

    public final void setZoomedInImage(@NotNull Bitmap value) {
        Intrinsics.h(value, "value");
        this.f18905a.a(value);
    }

    public final void setZoomedInPressedImage(@NotNull Bitmap value) {
        Intrinsics.h(value, "value");
        this.f18905a.b(value);
    }

    public final void setZoomedOutImage(@NotNull Bitmap value) {
        Intrinsics.h(value, "value");
        this.f18905a.c(value);
    }

    public final void setZoomedOutPressedImage(@NotNull Bitmap value) {
        Intrinsics.h(value, "value");
        this.f18905a.d(value);
    }

    public final void updateFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        ZoomSwitchControlDeserializer.updateFromJson(this, new JsonValue(json));
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public <T extends Control> void _removeChildControl(@NotNull Class<T> cls) {
        Control.DefaultImpls._removeChildControl(this, cls);
    }

    public final void setZoomedInImage(@DrawableRes int resId) {
        ZoomControlIconsHandler zoomControlIconsHandler = this.f18905a;
        zoomControlIconsHandler.getClass();
        zoomControlIconsHandler.a(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void setZoomedInPressedImage(@DrawableRes int resId) {
        ZoomControlIconsHandler zoomControlIconsHandler = this.f18905a;
        zoomControlIconsHandler.getClass();
        zoomControlIconsHandler.b(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void setZoomedOutImage(@DrawableRes int resId) {
        ZoomControlIconsHandler zoomControlIconsHandler = this.f18905a;
        zoomControlIconsHandler.getClass();
        zoomControlIconsHandler.c(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void setZoomedOutPressedImage(@DrawableRes int resId) {
        ZoomControlIconsHandler zoomControlIconsHandler = this.f18905a;
        zoomControlIconsHandler.getClass();
        zoomControlIconsHandler.d(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomSwitchControl(@NotNull Context context) {
        this(new ZoomControlIconsHandler(), new ToggleImageButton(context));
        Intrinsics.h(context, "context");
    }
}
