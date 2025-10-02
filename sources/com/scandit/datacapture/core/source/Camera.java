package com.scandit.datacapture.core.source;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.core.C1055l2;
import com.scandit.datacapture.core.K0;
import com.scandit.datacapture.core.U0;
import com.scandit.datacapture.core.Y;
import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.internal.module.source.CameraFactory;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.module.source.camera.behavior.CameraBehaviorDelegate;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.source.serialization.FrameSourceDeserializer;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0002DEJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\t\u0010\u000b\u001a\u00020\nH\u0097\u0001J\t\u0010\r\u001a\u00020\fH\u0097\u0001J\u0011\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0097\u0001J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0096\u0001J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001c\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u001aH\u0007J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001cJ\u001c\u0010!\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001fJ\u000e\u0010#\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\"J\u000e\u0010$\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\"J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\"H\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\"H\u0000¢\u0006\u0004\b(\u0010&R\u001a\u0010/\u001a\u00020*8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\u000e8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00101R\u0014\u00104\u001a\u00020\u00128WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u0002068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R$\u0010C\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lcom/scandit/datacapture/core/source/Camera;", "Lcom/scandit/datacapture/core/source/FrameSource;", "Lcom/scandit/datacapture/core/source/AndroidCameraProxy;", "Lcom/scandit/datacapture/core/source/CameraSettings;", "settings", "Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "_applySettings", "Lcom/scandit/datacapture/core/source/TorchState;", "torchState", "_applyTorchStateAsync", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "_frameSourceImpl", "Lcom/scandit/datacapture/core/internal/sdk/source/NativeAndroidCamera;", "_impl", "Lcom/scandit/datacapture/core/source/FrameSourceState;", "desiredState", "_switchToDesiredState", "Lcom/scandit/datacapture/core/common/async/Callback;", "", "whenDone", "", "switchToDesiredState", "Lcom/scandit/datacapture/core/source/FrameSourceListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "removeListener", "Ljava/lang/Runnable;", "applySettings", "", "jsonData", "updateFromJson", "Lkotlin/Function0;", "onDone", "_switchToDesiredTorchState", "Lcom/scandit/datacapture/core/source/TorchListener;", "addTorchListener", "removeTorchListener", "_addWeakTorchListener$scandit_capture_core", "(Lcom/scandit/datacapture/core/source/TorchListener;)V", "_addWeakTorchListener", "_removeWeakTorchListener$scandit_capture_core", "_removeWeakTorchListener", "Lcom/scandit/datacapture/core/internal/module/source/camera/behavior/CameraBehaviorDelegate;", "a", "Lcom/scandit/datacapture/core/internal/module/source/camera/behavior/CameraBehaviorDelegate;", "getBehaviorDelegate$scandit_capture_core", "()Lcom/scandit/datacapture/core/internal/module/source/camera/behavior/CameraBehaviorDelegate;", "behaviorDelegate", "getCurrentState", "()Lcom/scandit/datacapture/core/source/FrameSourceState;", "currentState", "getDesiredState", "isTorchAvailable", "()Z", "Lcom/scandit/datacapture/core/source/CameraPosition;", "getPosition", "()Lcom/scandit/datacapture/core/source/CameraPosition;", "position", "Lcom/scandit/datacapture/core/internal/module/source/NativeCameraApi;", "getApi$scandit_capture_core", "()Lcom/scandit/datacapture/core/internal/module/source/NativeCameraApi;", "api", "value", "getDesiredTorchState", "()Lcom/scandit/datacapture/core/source/TorchState;", "setDesiredTorchState", "(Lcom/scandit/datacapture/core/source/TorchState;)V", "desiredTorchState", "Companion", "com/scandit/datacapture/core/source/b", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class Camera implements FrameSource, AndroidCameraProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final CameraFactory d = new CameraFactory(K0.a());

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CameraBehaviorDelegate behaviorDelegate;
    private final /* synthetic */ AndroidCameraProxy b;
    private final CopyOnWriteArraySet c;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u001e\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0007J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/core/source/Camera$Companion;", "", "Lcom/scandit/datacapture/core/source/CameraSettings;", "settings", "Lcom/scandit/datacapture/core/source/Camera;", "getDefaultCamera", "Lcom/scandit/datacapture/core/source/CameraPosition;", "position", "getCamera", "", "jsonData", "fromJson", "Lcom/scandit/datacapture/core/internal/module/source/NativeCameraDelegate;", "delegate", "create$scandit_capture_core", "(Lcom/scandit/datacapture/core/internal/module/source/NativeCameraDelegate;)Lcom/scandit/datacapture/core/source/Camera;", "create", "Lcom/scandit/datacapture/core/internal/module/source/CameraFactory;", "cameraFactory", "Lcom/scandit/datacapture/core/internal/module/source/CameraFactory;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Camera getCamera$default(Companion companion, CameraPosition cameraPosition, CameraSettings cameraSettings, int i, Object obj) {
            if ((i & 2) != 0) {
                cameraSettings = null;
            }
            return companion.getCamera(cameraPosition, cameraSettings);
        }

        public static /* synthetic */ Camera getDefaultCamera$default(Companion companion, CameraSettings cameraSettings, int i, Object obj) {
            if ((i & 1) != 0) {
                cameraSettings = null;
            }
            return companion.getDefaultCamera(cameraSettings);
        }

        @JvmStatic
        @NotNull
        public final Camera create$scandit_capture_core(@NotNull NativeCameraDelegate delegate) {
            Intrinsics.h(delegate, "delegate");
            NativeAndroidCamera impl = NativeAndroidCamera.create(delegate, delegate.getCameraPosition(), delegate.getCameraId());
            Intrinsics.g(impl, "impl");
            AndroidCameraProxyAdapter androidCameraProxyAdapter = new AndroidCameraProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
            return new Camera(androidCameraProxyAdapter, new C1055l2(androidCameraProxyAdapter, new U0()), 0 == true ? 1 : 0);
        }

        @JvmStatic
        @Nullable
        public final Camera fromJson(@NotNull String jsonData) {
            Intrinsics.h(jsonData, "jsonData");
            FrameSource frameSourceFrameSourceFromJson = new FrameSourceDeserializer(EmptyList.d).frameSourceFromJson(jsonData);
            if (frameSourceFrameSourceFromJson instanceof Camera) {
                return (Camera) frameSourceFrameSourceFromJson;
            }
            return null;
        }

        @JvmStatic
        @JvmOverloads
        @Nullable
        public final Camera getCamera(@NotNull CameraPosition position) {
            Intrinsics.h(position, "position");
            return getCamera$default(this, position, null, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        @Nullable
        public final Camera getDefaultCamera() {
            return getDefaultCamera$default(this, null, 1, null);
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        @Nullable
        public final Camera getCamera(@NotNull CameraPosition position, @Nullable CameraSettings settings) {
            Intrinsics.h(position, "position");
            return Camera.d.a(position, settings);
        }

        @JvmStatic
        @JvmOverloads
        @Nullable
        public final Camera getDefaultCamera(@Nullable CameraSettings settings) {
            CameraFactory cameraFactory = Camera.d;
            Camera cameraA = cameraFactory.a(CameraPosition.WORLD_FACING, settings);
            return cameraA == null ? cameraFactory.a(CameraPosition.USER_FACING, settings) : cameraA;
        }
    }

    public /* synthetic */ Camera(AndroidCameraProxy androidCameraProxy, CameraBehaviorDelegate cameraBehaviorDelegate, DefaultConstructorMarker defaultConstructorMarker) {
        this(androidCameraProxy, cameraBehaviorDelegate);
    }

    public static /* synthetic */ void applySettings$default(Camera camera, CameraSettings cameraSettings, Runnable runnable, int i, Object obj) {
        if ((i & 2) != 0) {
            runnable = null;
        }
        camera.applySettings(cameraSettings, runnable);
    }

    @JvmStatic
    @Nullable
    public static final Camera fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final Camera getCamera(@NotNull CameraPosition cameraPosition) {
        return INSTANCE.getCamera(cameraPosition);
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final Camera getDefaultCamera() {
        return INSTANCE.getDefaultCamera();
    }

    public final void _addWeakTorchListener$scandit_capture_core(@NotNull TorchListener listener) {
        Intrinsics.h(listener, "listener");
        this.behaviorDelegate.b(listener);
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @ProxyFunction(nativeName = "applySettingsAsyncAndroid")
    @NotNull
    public NativeWrappedFuture _applySettings(@NotNull CameraSettings settings) {
        Intrinsics.h(settings, "settings");
        return this.b._applySettings(settings);
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @ProxyFunction(nativeName = "applyTorchStateAsyncWrapped")
    @NotNull
    public NativeWrappedFuture _applyTorchStateAsync(@NotNull TorchState torchState) {
        Intrinsics.h(torchState, "torchState");
        return this.b._applyTorchStateAsync(torchState);
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @NativeImpl
    @NotNull
    public NativeFrameSource _frameSourceImpl() {
        return this.b.getC();
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeAndroidCamera getF18831a() {
        return this.b.getF18831a();
    }

    public final void _removeWeakTorchListener$scandit_capture_core(@NotNull TorchListener listener) {
        Intrinsics.h(listener, "listener");
        this.behaviorDelegate.a(listener);
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @ProxyFunction(nativeName = "switchToDesiredStateAsyncAndroid")
    @NotNull
    public NativeWrappedFuture _switchToDesiredState(@NotNull FrameSourceState desiredState) {
        Intrinsics.h(desiredState, "desiredState");
        return this.b._switchToDesiredState(desiredState);
    }

    public final void _switchToDesiredTorchState(@NotNull TorchState torchState, @NotNull Function0<Unit> onDone) {
        Intrinsics.h(torchState, "torchState");
        Intrinsics.h(onDone, "onDone");
        this.behaviorDelegate.a(torchState, onDone);
    }

    @Override // com.scandit.datacapture.core.source.FrameSource
    public void addListener(@NotNull FrameSourceListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.c.add(listener)) {
            listener.onObservationStarted(this);
        }
    }

    public final void addTorchListener(@NotNull TorchListener listener) {
        Intrinsics.h(listener, "listener");
        this.behaviorDelegate.c(listener);
    }

    @JvmOverloads
    public final void applySettings(@NotNull CameraSettings settings) {
        Intrinsics.h(settings, "settings");
        applySettings$default(this, settings, null, 2, null);
    }

    @NotNull
    public final NativeCameraApi getApi$scandit_capture_core() {
        NativeCameraApi api = getF18831a().getApi();
        Intrinsics.g(api, "_impl().api");
        return api;
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: getBehaviorDelegate$scandit_capture_core, reason: from getter */
    public final CameraBehaviorDelegate getBehaviorDelegate() {
        return this.behaviorDelegate;
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @ProxyFunction(property = "currentState")
    @NotNull
    public FrameSourceState getCurrentState() {
        return this.b.getCurrentState();
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @ProxyFunction(property = "desiredState")
    @NotNull
    public FrameSourceState getDesiredState() {
        return this.b.getDesiredState();
    }

    @NotNull
    public final TorchState getDesiredTorchState() {
        return this.behaviorDelegate.b();
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @ProxyFunction(nativeName = "getPosition", property = "position")
    @NotNull
    public CameraPosition getPosition() {
        return this.b.getPosition();
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @ProxyFunction(nativeName = "isTorchAvailable", property = "isTorchAvailable")
    public boolean isTorchAvailable() {
        return this.b.isTorchAvailable();
    }

    @Override // com.scandit.datacapture.core.source.FrameSource
    public void removeListener(@NotNull FrameSourceListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.c.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final void removeTorchListener(@NotNull TorchListener listener) {
        Intrinsics.h(listener, "listener");
        this.behaviorDelegate.d(listener);
    }

    public final void setDesiredTorchState(@NotNull TorchState value) {
        Intrinsics.h(value, "value");
        this.behaviorDelegate.a(value, Y.f18394a);
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    public void switchToDesiredState(@NotNull FrameSourceState desiredState, @Nullable Callback<? super Boolean> whenDone) {
        Intrinsics.h(desiredState, "desiredState");
        this.b.switchToDesiredState(desiredState, whenDone);
    }

    public final void updateFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        new FrameSourceDeserializer(EmptyList.d).updateFrameSourceFromJson(this, jsonData);
    }

    private Camera(AndroidCameraProxy androidCameraProxy, CameraBehaviorDelegate cameraBehaviorDelegate) {
        this.behaviorDelegate = cameraBehaviorDelegate;
        this.b = androidCameraProxy;
        this.c = new CopyOnWriteArraySet();
        getF18831a().addListenerAsync(new FrameSourceListenerReversedAdapter(new b(this), this, null, 4, null));
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final Camera getCamera(@NotNull CameraPosition cameraPosition, @Nullable CameraSettings cameraSettings) {
        return INSTANCE.getCamera(cameraPosition, cameraSettings);
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final Camera getDefaultCamera(@Nullable CameraSettings cameraSettings) {
        return INSTANCE.getDefaultCamera(cameraSettings);
    }

    @JvmOverloads
    public final void applySettings(@NotNull CameraSettings settings, @Nullable Runnable whenDone) {
        Intrinsics.h(settings, "settings");
        this.behaviorDelegate.a(settings, whenDone);
    }

    public final void switchToDesiredState(@NotNull FrameSourceState desiredState) {
        Intrinsics.h(desiredState, "desiredState");
        switchToDesiredState(desiredState, null);
    }
}
