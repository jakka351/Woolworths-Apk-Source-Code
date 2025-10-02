package com.scandit.datacapture.core.ui.control;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.VisibleForTesting;
import com.scandit.datacapture.core.InterfaceC1116s0;
import com.scandit.datacapture.core.R;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.extensions.LambdaExtensionsKt;
import com.scandit.datacapture.core.internal.module.ui.control.ToggleImageButton;
import com.scandit.datacapture.core.internal.module.ui.control.camera.CameraControlIconsHandler;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.common.camera.CameraSwitchControlDeserializer;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.control.Control;
import com.scandit.datacapture.core.ui.gesture.ZoomGesture;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 N2\u00020\u0001:\u0001NB)\b\u0001\u0012\u0006\u0010.\u001a\u00020\u0012\u0012\u0006\u00100\u001a\u00020\u0012\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JB!\b\u0016\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010.\u001a\u00020\u0012\u0012\u0006\u00100\u001a\u00020\u0012¢\u0006\u0004\bI\u0010MJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\fR\"\u0010\u0019\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010.\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b-\u0010\u0016R\u0011\u00100\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b/\u0010\u0016R$\u00106\u001a\u0002012\u0006\u00102\u001a\u0002018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b\u000e\u00105R$\u00108\u001a\u0002012\u0006\u00102\u001a\u0002018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00104\"\u0004\b\u000f\u00105R$\u0010:\u001a\u0002012\u0006\u00102\u001a\u0002018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u00104\"\u0004\b\u0010\u00105R$\u0010<\u001a\u0002012\u0006\u00102\u001a\u0002018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u00104\"\u0004\b\u0011\u00105R\u0011\u0010>\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b=\u00104R\u0011\u0010@\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b?\u00104R\u0011\u0010B\u001a\u0002018F¢\u0006\u0006\u001a\u0004\bA\u00104R\u0011\u0010D\u001a\u0002018F¢\u0006\u0006\u001a\u0004\bC\u00104¨\u0006O"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/CameraSwitchControl;", "Lcom/scandit/datacapture/core/ui/control/Control;", "", "json", "", "updateFromJson", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "_onDataCaptureContextChanged", "Lcom/scandit/datacapture/core/source/FrameSource;", "frameSource", "_onFrameSourceChanged", "", "resId", "setPrimaryCameraImage", "setPrimaryCameraPressedImage", "setSecondaryCameraImage", "setSecondaryCameraPressedImage", "Lcom/scandit/datacapture/core/source/Camera;", "e", "Lcom/scandit/datacapture/core/source/Camera;", "get_primaryCamera$scandit_capture_core", "()Lcom/scandit/datacapture/core/source/Camera;", "set_primaryCamera$scandit_capture_core", "(Lcom/scandit/datacapture/core/source/Camera;)V", "_primaryCamera", "f", "get_secondaryCamera$scandit_capture_core", "set_secondaryCamera$scandit_capture_core", "_secondaryCamera", "g", "Ljava/lang/String;", "getContentDescriptionWhenUserFacing", "()Ljava/lang/String;", "setContentDescriptionWhenUserFacing", "(Ljava/lang/String;)V", "contentDescriptionWhenUserFacing", "h", "getContentDescriptionWhenWorldFacing", "setContentDescriptionWhenWorldFacing", "contentDescriptionWhenWorldFacing", "Landroid/view/View;", "get_view", "()Landroid/view/View;", "_view", "getPrimaryCamera", "primaryCamera", "getSecondaryCamera", "secondaryCamera", "Landroid/graphics/Bitmap;", "value", "getPrimaryCameraImage", "()Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "primaryCameraImage", "getPrimaryCameraPressedImage", "primaryCameraPressedImage", "getSecondaryCameraImage", "secondaryCameraImage", "getSecondaryCameraPressedImage", "secondaryCameraPressedImage", "getDefaultPrimaryCameraImage", "defaultPrimaryCameraImage", "getDefaultPrimaryCameraPressedImage", "defaultPrimaryCameraPressedImage", "getDefaultSecondaryCameraImage", "defaultSecondaryCameraImage", "getDefaultSecondaryCameraPressedImage", "defaultSecondaryCameraPressedImage", "Lcom/scandit/datacapture/core/internal/module/ui/control/camera/CameraControlIconsHandler;", "iconsHandler", "Lcom/scandit/datacapture/core/internal/module/ui/control/ToggleImageButton;", "view", "<init>", "(Lcom/scandit/datacapture/core/source/Camera;Lcom/scandit/datacapture/core/source/Camera;Lcom/scandit/datacapture/core/internal/module/ui/control/camera/CameraControlIconsHandler;Lcom/scandit/datacapture/core/internal/module/ui/control/ToggleImageButton;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Lcom/scandit/datacapture/core/source/Camera;Lcom/scandit/datacapture/core/source/Camera;)V", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CameraSwitchControl implements Control {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final CameraControlIconsHandler f18897a;
    private final ToggleImageButton b;
    private WeakReference c;
    private volatile Camera d;

    /* renamed from: e, reason: from kotlin metadata */
    private Camera _primaryCamera;

    /* renamed from: f, reason: from kotlin metadata */
    private Camera _secondaryCamera;

    /* renamed from: g, reason: from kotlin metadata */
    private String contentDescriptionWhenUserFacing;

    /* renamed from: h, reason: from kotlin metadata */
    private String contentDescriptionWhenWorldFacing;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/CameraSwitchControl$Companion;", "", "Landroid/content/Context;", "context", "", "json", "Lcom/scandit/datacapture/core/ui/control/CameraSwitchControl;", "fromJson", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CameraSwitchControl fromJson(@NotNull Context context, @NotNull String json) {
            Intrinsics.h(context, "context");
            Intrinsics.h(json, "json");
            return CameraSwitchControlDeserializer.fromJson(context, new JsonValue(json));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraPosition.values().length];
            try {
                iArr[CameraPosition.USER_FACING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.scandit.datacapture.core.ui.control.CameraSwitchControl$1] */
    @VisibleForTesting
    public CameraSwitchControl(@NotNull Camera primaryCamera, @NotNull Camera secondaryCamera, @NotNull CameraControlIconsHandler iconsHandler, @NotNull ToggleImageButton view) {
        Intrinsics.h(primaryCamera, "primaryCamera");
        Intrinsics.h(secondaryCamera, "secondaryCamera");
        Intrinsics.h(iconsHandler, "iconsHandler");
        Intrinsics.h(view, "view");
        this.f18897a = iconsHandler;
        this.b = view;
        this.c = new WeakReference(null);
        this.d = primaryCamera;
        this._primaryCamera = primaryCamera;
        this._secondaryCamera = secondaryCamera;
        String string = view.getContext().getString(R.string.sc_cd_camera_user_facing);
        Intrinsics.g(string, "view.context.getString(R…sc_cd_camera_user_facing)");
        this.contentDescriptionWhenUserFacing = string;
        String string2 = view.getContext().getString(R.string.sc_cd_camera_world_facing);
        Intrinsics.g(string2, "view.context.getString(R…c_cd_camera_world_facing)");
        this.contentDescriptionWhenWorldFacing = string2;
        iconsHandler.a((AnonymousClass1) new InterfaceC1116s0() { // from class: com.scandit.datacapture.core.ui.control.CameraSwitchControl.1
            @Override // com.scandit.datacapture.core.InterfaceC1116s0
            public void onIconsChanged(@NotNull Camera camera, @NotNull Bitmap image, boolean pressed) {
                Intrinsics.h(camera, "camera");
                Intrinsics.h(image, "image");
                if (Intrinsics.c(CameraSwitchControl.this.d, camera) && CameraSwitchControl.this.b.c() == pressed) {
                    CameraSwitchControl.access$setupViewForCurrentCamera(CameraSwitchControl.this);
                }
            }
        });
        view.b(new a(this));
        view.a(new b(this));
    }

    public static final void access$setupViewForCurrentCamera(CameraSwitchControl cameraSwitchControl) {
        synchronized (cameraSwitchControl) {
            try {
                Bitmap bitmapA = cameraSwitchControl.f18897a.a(cameraSwitchControl.d, cameraSwitchControl.b.c());
                if (bitmapA != null) {
                    cameraSwitchControl.b.a(bitmapA);
                }
                cameraSwitchControl.b.setContentDescription(WhenMappings.$EnumSwitchMapping$0[cameraSwitchControl.d.getPosition().ordinal()] == 1 ? cameraSwitchControl.contentDescriptionWhenUserFacing : cameraSwitchControl.contentDescriptionWhenWorldFacing);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void access$toggleCamera(CameraSwitchControl cameraSwitchControl) {
        Camera camera = cameraSwitchControl.d;
        Camera camera2 = Intrinsics.c(camera, cameraSwitchControl.get_primaryCamera()) ? cameraSwitchControl.get_secondaryCamera() : Intrinsics.c(camera, cameraSwitchControl.get_secondaryCamera()) ? cameraSwitchControl.get_primaryCamera() : cameraSwitchControl.get_primaryCamera();
        DataCaptureContext dataCaptureContext = (DataCaptureContext) cameraSwitchControl.c.get();
        if (dataCaptureContext != null) {
            FrameSource frameSource = dataCaptureContext.get_frameSource();
            c cVar = new c(dataCaptureContext, camera2);
            if (frameSource != null) {
                FrameSourceState currentState = frameSource.getCurrentState();
                FrameSourceState frameSourceState = FrameSourceState.OFF;
                if (currentState != frameSourceState) {
                    frameSource.switchToDesiredState(frameSourceState, LambdaExtensionsKt.Callback(new d(cVar)));
                    return;
                }
            }
            cVar.invoke();
        }
    }

    @JvmStatic
    @NotNull
    public static final CameraSwitchControl fromJson(@NotNull Context context, @NotNull String str) {
        return INSTANCE.fromJson(context, str);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onDataCaptureContextChanged(@Nullable DataCaptureContext dataCaptureContext) {
        this.c = new WeakReference(dataCaptureContext);
        if (dataCaptureContext != null) {
            Camera camera = this.d;
            FrameSource frameSource = dataCaptureContext.get_frameSource();
            c cVar = new c(dataCaptureContext, camera);
            if (frameSource != null) {
                FrameSourceState currentState = frameSource.getCurrentState();
                FrameSourceState frameSourceState = FrameSourceState.OFF;
                if (currentState != frameSourceState) {
                    frameSource.switchToDesiredState(frameSourceState, LambdaExtensionsKt.Callback(new d(cVar)));
                    return;
                }
            }
            cVar.invoke();
        }
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onDataCaptureViewChanged(@Nullable DataCaptureView dataCaptureView) {
        Control.DefaultImpls._onDataCaptureViewChanged(this, dataCaptureView);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onFrameSourceChanged(@Nullable FrameSource frameSource) {
        Camera camera = frameSource instanceof Camera ? (Camera) frameSource : null;
        if (Intrinsics.c(camera, get_primaryCamera()) || Intrinsics.c(camera, get_secondaryCamera())) {
            this.d = camera;
        }
        synchronized (this) {
            try {
                Bitmap bitmapA = this.f18897a.a(this.d, this.b.c());
                if (bitmapA != null) {
                    this.b.a(bitmapA);
                }
                this.b.setContentDescription(WhenMappings.$EnumSwitchMapping$0[this.d.getPosition().ordinal()] == 1 ? this.contentDescriptionWhenUserFacing : this.contentDescriptionWhenWorldFacing);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onRemoveControl() {
        Control.DefaultImpls._onRemoveControl(this);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onZoomGestureChanged(@Nullable ZoomGesture zoomGesture) {
        Control.DefaultImpls._onZoomGestureChanged(this, zoomGesture);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _removeChildControl(@NotNull Control control) {
        Control.DefaultImpls._removeChildControl(this, control);
    }

    @NotNull
    public final String getContentDescriptionWhenUserFacing() {
        return this.contentDescriptionWhenUserFacing;
    }

    @NotNull
    public final String getContentDescriptionWhenWorldFacing() {
        return this.contentDescriptionWhenWorldFacing;
    }

    @NotNull
    public final Bitmap getDefaultPrimaryCameraImage() {
        return this.f18897a.a();
    }

    @NotNull
    public final Bitmap getDefaultPrimaryCameraPressedImage() {
        return this.f18897a.b();
    }

    @NotNull
    public final Bitmap getDefaultSecondaryCameraImage() {
        return this.f18897a.c();
    }

    @NotNull
    public final Bitmap getDefaultSecondaryCameraPressedImage() {
        return this.f18897a.d();
    }

    @NotNull
    /* renamed from: getPrimaryCamera, reason: from getter */
    public final Camera get_primaryCamera() {
        return this._primaryCamera;
    }

    @NotNull
    public final Bitmap getPrimaryCameraImage() {
        return this.f18897a.e();
    }

    @NotNull
    public final Bitmap getPrimaryCameraPressedImage() {
        return this.f18897a.f();
    }

    @NotNull
    /* renamed from: getSecondaryCamera, reason: from getter */
    public final Camera get_secondaryCamera() {
        return this._secondaryCamera;
    }

    @NotNull
    public final Bitmap getSecondaryCameraImage() {
        return this.f18897a.g();
    }

    @NotNull
    public final Bitmap getSecondaryCameraPressedImage() {
        return this.f18897a.h();
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

    @NotNull
    public final Camera get_primaryCamera$scandit_capture_core() {
        return this._primaryCamera;
    }

    @NotNull
    public final Camera get_secondaryCamera$scandit_capture_core() {
        return this._secondaryCamera;
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    @NotNull
    public View get_view() {
        return this.b;
    }

    public final void setContentDescriptionWhenUserFacing(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.contentDescriptionWhenUserFacing = str;
    }

    public final void setContentDescriptionWhenWorldFacing(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.contentDescriptionWhenWorldFacing = str;
    }

    public final void setPrimaryCameraImage(@NotNull Bitmap value) {
        Intrinsics.h(value, "value");
        this.f18897a.a(value);
    }

    public final void setPrimaryCameraPressedImage(@NotNull Bitmap value) {
        Intrinsics.h(value, "value");
        this.f18897a.b(value);
    }

    public final void setSecondaryCameraImage(@NotNull Bitmap value) {
        Intrinsics.h(value, "value");
        this.f18897a.c(value);
    }

    public final void setSecondaryCameraPressedImage(@NotNull Bitmap value) {
        Intrinsics.h(value, "value");
        this.f18897a.d(value);
    }

    public final void set_primaryCamera$scandit_capture_core(@NotNull Camera camera) {
        Intrinsics.h(camera, "<set-?>");
        this._primaryCamera = camera;
    }

    public final void set_secondaryCamera$scandit_capture_core(@NotNull Camera camera) {
        Intrinsics.h(camera, "<set-?>");
        this._secondaryCamera = camera;
    }

    public final void updateFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        CameraSwitchControlDeserializer.updateFromJson(this, new JsonValue(json));
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public <T extends Control> void _removeChildControl(@NotNull Class<T> cls) {
        Control.DefaultImpls._removeChildControl(this, cls);
    }

    public final void setPrimaryCameraImage(@DrawableRes int resId) {
        CameraControlIconsHandler cameraControlIconsHandler = this.f18897a;
        cameraControlIconsHandler.getClass();
        cameraControlIconsHandler.a(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void setPrimaryCameraPressedImage(@DrawableRes int resId) {
        CameraControlIconsHandler cameraControlIconsHandler = this.f18897a;
        cameraControlIconsHandler.getClass();
        cameraControlIconsHandler.b(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void setSecondaryCameraImage(@DrawableRes int resId) {
        CameraControlIconsHandler cameraControlIconsHandler = this.f18897a;
        cameraControlIconsHandler.getClass();
        cameraControlIconsHandler.c(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void setSecondaryCameraPressedImage(@DrawableRes int resId) {
        CameraControlIconsHandler cameraControlIconsHandler = this.f18897a;
        cameraControlIconsHandler.getClass();
        cameraControlIconsHandler.d(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraSwitchControl(@NotNull Context context, @NotNull Camera primaryCamera, @NotNull Camera secondaryCamera) {
        this(primaryCamera, secondaryCamera, new CameraControlIconsHandler(primaryCamera, secondaryCamera), new ToggleImageButton(context));
        Intrinsics.h(context, "context");
        Intrinsics.h(primaryCamera, "primaryCamera");
        Intrinsics.h(secondaryCamera, "secondaryCamera");
    }
}
