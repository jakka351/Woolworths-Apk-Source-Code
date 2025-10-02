package com.scandit.datacapture.core.ui.control;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.VisibleForTesting;
import com.scandit.datacapture.core.L4;
import com.scandit.datacapture.core.R;
import com.scandit.datacapture.core.U7;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.ui.control.ToggleImageButton;
import com.scandit.datacapture.core.internal.module.ui.control.torch.TorchControlIconsHandler;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.common.torch.TorchSwitchControlDeserializer;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.core.source.TorchListener;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.control.Control;
import com.scandit.datacapture.core.ui.gesture.ZoomGesture;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B\u0019\b\u0001\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108B\u0011\b\u0016\u0012\u0006\u0010:\u001a\u000209¢\u0006\u0004\b7\u0010;J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\tJ\u0010\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\tJ\u0010\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\tJ\u0010\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\tR\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b\f\u0010#R$\u0010&\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\"\"\u0004\b\r\u0010#R$\u0010(\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\"\"\u0004\b\u000e\u0010#R$\u0010*\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\"\"\u0004\b\u000f\u0010#R\u0011\u0010,\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b+\u0010\"R\u0011\u0010.\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b-\u0010\"R\u0011\u00100\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b/\u0010\"R\u0011\u00102\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b1\u0010\"¨\u0006="}, d2 = {"Lcom/scandit/datacapture/core/ui/control/TorchSwitchControl;", "Lcom/scandit/datacapture/core/ui/control/Control;", "", "json", "", "updateFromJson", "Lcom/scandit/datacapture/core/source/FrameSource;", "frameSource", "_onFrameSourceChanged", "", "resId", "setImageResource", "setTorchOnImage", "setTorchOnPressedImage", "setTorchOffImage", "setTorchOffPressedImage", "c", "Ljava/lang/String;", "getContentDescriptionWhenOff", "()Ljava/lang/String;", "setContentDescriptionWhenOff", "(Ljava/lang/String;)V", "contentDescriptionWhenOff", "d", "getContentDescriptionWhenOn", "setContentDescriptionWhenOn", "contentDescriptionWhenOn", "Landroid/view/View;", "get_view", "()Landroid/view/View;", "_view", "Landroid/graphics/Bitmap;", "value", "getTorchOnImage", "()Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "torchOnImage", "getTorchOnPressedImage", "torchOnPressedImage", "getTorchOffImage", "torchOffImage", "getTorchOffPressedImage", "torchOffPressedImage", "getDefaultTorchOnImage", "defaultTorchOnImage", "getDefaultTorchOnPressedImage", "defaultTorchOnPressedImage", "getDefaultTorchOffImage", "defaultTorchOffImage", "getDefaultTorchOffPressedImage", "defaultTorchOffPressedImage", "Lcom/scandit/datacapture/core/internal/module/ui/control/torch/TorchControlIconsHandler;", "iconsHandler", "Lcom/scandit/datacapture/core/internal/module/ui/control/ToggleImageButton;", "view", "<init>", "(Lcom/scandit/datacapture/core/internal/module/ui/control/torch/TorchControlIconsHandler;Lcom/scandit/datacapture/core/internal/module/ui/control/ToggleImageButton;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TorchSwitchControl implements Control {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final TorchControlIconsHandler f18902a;
    private final ToggleImageButton b;

    /* renamed from: c, reason: from kotlin metadata */
    private String contentDescriptionWhenOff;

    /* renamed from: d, reason: from kotlin metadata */
    private String contentDescriptionWhenOn;
    private final TorchSwitchControl$torchListener$1 e;
    private Camera f;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/TorchSwitchControl$Companion;", "", "Landroid/content/Context;", "context", "", "json", "Lcom/scandit/datacapture/core/ui/control/TorchSwitchControl;", "fromJson", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final TorchSwitchControl fromJson(@NotNull Context context, @NotNull String json) {
            Intrinsics.h(context, "context");
            Intrinsics.h(json, "json");
            return TorchSwitchControlDeserializer.fromJson(context, new JsonValue(json));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TorchState.values().length];
            try {
                iArr[TorchState.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TorchState.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TorchState.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.scandit.datacapture.core.ui.control.TorchSwitchControl$torchListener$1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.scandit.datacapture.core.ui.control.TorchSwitchControl$1] */
    @VisibleForTesting
    public TorchSwitchControl(@NotNull TorchControlIconsHandler iconsHandler, @NotNull ToggleImageButton view) {
        Intrinsics.h(iconsHandler, "iconsHandler");
        Intrinsics.h(view, "view");
        this.f18902a = iconsHandler;
        this.b = view;
        String string = view.getContext().getString(R.string.sc_cd_torch_off);
        Intrinsics.g(string, "view.context.getString(R.string.sc_cd_torch_off)");
        this.contentDescriptionWhenOff = string;
        String string2 = view.getContext().getString(R.string.sc_cd_torch_on);
        Intrinsics.g(string2, "view.context.getString(R.string.sc_cd_torch_on)");
        this.contentDescriptionWhenOn = string2;
        this.e = new TorchListener() { // from class: com.scandit.datacapture.core.ui.control.TorchSwitchControl$torchListener$1
            @Override // com.scandit.datacapture.core.source.TorchListener
            public void onTorchStateChanged(@NotNull TorchState state) {
                Intrinsics.h(state, "state");
                this.f18904a.a(state);
            }
        };
        iconsHandler.a((AnonymousClass1) new U7() { // from class: com.scandit.datacapture.core.ui.control.TorchSwitchControl.1
            @Override // com.scandit.datacapture.core.U7
            public void onIconsChanged(@NotNull TorchState torchState, @NotNull Bitmap image, boolean pressed) {
                Intrinsics.h(torchState, "torchState");
                Intrinsics.h(image, "image");
                Camera camera = TorchSwitchControl.this.f;
                if ((camera != null ? camera.getDesiredTorchState() : null) == torchState && TorchSwitchControl.this.b.c() == pressed) {
                    TorchSwitchControl.this.a(torchState);
                }
            }
        });
        view.b(new i(this));
        view.a(new j(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(TorchState torchState) {
        Bitmap bitmapA = this.f18902a.a(torchState, this.b.c());
        if (bitmapA != null) {
            this.b.a(bitmapA);
        }
        this.b.setContentDescription(WhenMappings.$EnumSwitchMapping$0[torchState.ordinal()] == 1 ? this.contentDescriptionWhenOn : this.contentDescriptionWhenOff);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void access$onFrameSourceStarted(com.scandit.datacapture.core.ui.control.TorchSwitchControl r2, com.scandit.datacapture.core.source.FrameSource r3) {
        /*
            com.scandit.datacapture.core.internal.module.ui.control.ToggleImageButton r0 = r2.b
            boolean r1 = r3 instanceof com.scandit.datacapture.core.source.Camera
            if (r1 == 0) goto L9
            com.scandit.datacapture.core.source.Camera r3 = (com.scandit.datacapture.core.source.Camera) r3
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L14
            boolean r3 = r3.isTorchAvailable()
            r1 = 1
            if (r3 != r1) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            r0.a(r1)
            com.scandit.datacapture.core.source.Camera r3 = r2.f
            if (r3 == 0) goto L25
            com.scandit.datacapture.core.source.TorchState r3 = r3.getDesiredTorchState()
            if (r3 == 0) goto L25
            r2.a(r3)
        L25:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.ui.control.TorchSwitchControl.access$onFrameSourceStarted(com.scandit.datacapture.core.ui.control.TorchSwitchControl, com.scandit.datacapture.core.source.FrameSource):void");
    }

    public static final void access$showImageForCurrentTorchState(TorchSwitchControl torchSwitchControl) {
        TorchState desiredTorchState;
        Camera camera = torchSwitchControl.f;
        if (camera == null || (desiredTorchState = camera.getDesiredTorchState()) == null) {
            return;
        }
        torchSwitchControl.a(desiredTorchState);
    }

    public static final void access$toggleTorchOnOff(TorchSwitchControl torchSwitchControl, Camera camera) {
        TorchState torchState;
        torchSwitchControl.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[camera.getDesiredTorchState().ordinal()];
        if (i == 1) {
            torchState = TorchState.OFF;
        } else if (i == 2) {
            torchState = TorchState.ON;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            torchState = TorchState.AUTO;
        }
        camera.getBehaviorDelegate().a(torchState, new l(torchSwitchControl));
    }

    @JvmStatic
    @NotNull
    public static final TorchSwitchControl fromJson(@NotNull Context context, @NotNull String str) {
        return INSTANCE.fromJson(context, str);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onDataCaptureContextChanged(@Nullable DataCaptureContext dataCaptureContext) {
        Control.DefaultImpls._onDataCaptureContextChanged(this, dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onDataCaptureViewChanged(@Nullable DataCaptureView dataCaptureView) {
        Control.DefaultImpls._onDataCaptureViewChanged(this, dataCaptureView);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onFrameSourceChanged(@Nullable FrameSource frameSource) {
        TorchState desiredTorchState;
        Camera camera = frameSource instanceof Camera ? (Camera) frameSource : null;
        if (!Intrinsics.c(this.f, camera)) {
            Camera camera2 = this.f;
            if (camera2 != null) {
                camera2._removeWeakTorchListener$scandit_capture_core(this.e);
            }
            this.f = camera;
            if (camera != null) {
                camera.addListener(new L4(ArraysKt.r0(new FrameSourceState[]{FrameSourceState.STANDBY, FrameSourceState.ON}), new k(this)));
            }
            Camera camera3 = this.f;
            if (camera3 != null) {
                camera3._addWeakTorchListener$scandit_capture_core(this.e);
            }
        }
        Camera camera4 = this.f;
        if (camera4 == null || (desiredTorchState = camera4.getDesiredTorchState()) == null) {
            return;
        }
        a(desiredTorchState);
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
    public final String getContentDescriptionWhenOff() {
        return this.contentDescriptionWhenOff;
    }

    @NotNull
    public final String getContentDescriptionWhenOn() {
        return this.contentDescriptionWhenOn;
    }

    @NotNull
    public final Bitmap getDefaultTorchOffImage() {
        return this.f18902a.a();
    }

    @NotNull
    public final Bitmap getDefaultTorchOffPressedImage() {
        return this.f18902a.b();
    }

    @NotNull
    public final Bitmap getDefaultTorchOnImage() {
        return this.f18902a.c();
    }

    @NotNull
    public final Bitmap getDefaultTorchOnPressedImage() {
        return this.f18902a.d();
    }

    @NotNull
    public final Bitmap getTorchOffImage() {
        return this.f18902a.e();
    }

    @NotNull
    public final Bitmap getTorchOffPressedImage() {
        return this.f18902a.f();
    }

    @NotNull
    public final Bitmap getTorchOnImage() {
        return this.f18902a.g();
    }

    @NotNull
    public final Bitmap getTorchOnPressedImage() {
        return this.f18902a.h();
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

    public final void setContentDescriptionWhenOff(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.contentDescriptionWhenOff = str;
    }

    public final void setContentDescriptionWhenOn(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.contentDescriptionWhenOn = str;
    }

    public final void setImageResource(@DrawableRes int resId) {
        setTorchOnImage(resId);
        setTorchOnPressedImage(resId);
        setTorchOffImage(resId);
        setTorchOffPressedImage(resId);
    }

    public final void setTorchOffImage(@NotNull Bitmap value) {
        Intrinsics.h(value, "value");
        this.f18902a.a(value);
    }

    public final void setTorchOffPressedImage(@NotNull Bitmap value) {
        Intrinsics.h(value, "value");
        this.f18902a.b(value);
    }

    public final void setTorchOnImage(@NotNull Bitmap value) {
        Intrinsics.h(value, "value");
        this.f18902a.c(value);
    }

    public final void setTorchOnPressedImage(@NotNull Bitmap value) {
        Intrinsics.h(value, "value");
        this.f18902a.d(value);
    }

    public final void updateFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        TorchSwitchControlDeserializer.updateFromJson(this, new JsonValue(json));
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public <T extends Control> void _removeChildControl(@NotNull Class<T> cls) {
        Control.DefaultImpls._removeChildControl(this, cls);
    }

    public final void setTorchOffImage(@DrawableRes int resId) {
        TorchControlIconsHandler torchControlIconsHandler = this.f18902a;
        torchControlIconsHandler.getClass();
        torchControlIconsHandler.a(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void setTorchOffPressedImage(@DrawableRes int resId) {
        TorchControlIconsHandler torchControlIconsHandler = this.f18902a;
        torchControlIconsHandler.getClass();
        torchControlIconsHandler.b(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void setTorchOnImage(@DrawableRes int resId) {
        TorchControlIconsHandler torchControlIconsHandler = this.f18902a;
        torchControlIconsHandler.getClass();
        torchControlIconsHandler.c(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void setTorchOnPressedImage(@DrawableRes int resId) {
        TorchControlIconsHandler torchControlIconsHandler = this.f18902a;
        torchControlIconsHandler.getClass();
        torchControlIconsHandler.d(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TorchSwitchControl(@NotNull Context context) {
        this(new TorchControlIconsHandler(), new ToggleImageButton(context));
        Intrinsics.h(context, "context");
    }
}
