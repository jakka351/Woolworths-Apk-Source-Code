package com.scandit.datacapture.core;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.extensions.LambdaExtensionsKt;
import com.scandit.datacapture.core.internal.module.source.camera.behavior.CameraBehaviorDelegate;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import com.scandit.datacapture.core.source.AndroidCameraProxy;
import com.scandit.datacapture.core.source.AndroidCameraProxyAdapter;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.TorchListener;
import com.scandit.datacapture.core.source.TorchState;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.l2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1055l2 implements T0, CameraBehaviorDelegate {

    /* renamed from: a, reason: collision with root package name */
    private final AndroidCameraProxy f18796a;
    private final /* synthetic */ T0 b;
    private TorchState c;

    public C1055l2(AndroidCameraProxyAdapter nativeCameraProxy, T0 torchListenersHolder) {
        Intrinsics.h(nativeCameraProxy, "nativeCameraProxy");
        Intrinsics.h(torchListenersHolder, "torchListenersHolder");
        this.f18796a = nativeCameraProxy;
        this.b = torchListenersHolder;
        TorchState torchState = TorchState.OFF;
        this.c = torchState;
        nativeCameraProxy._applyTorchStateAsync(torchState);
    }

    @Override // com.scandit.datacapture.core.T0
    public final Collection a() {
        return this.b.a();
    }

    @Override // com.scandit.datacapture.core.T0
    public final void b(TorchListener listener) {
        Intrinsics.h(listener, "listener");
        this.b.b(listener);
    }

    @Override // com.scandit.datacapture.core.T0
    public final void c(TorchListener listener) {
        Intrinsics.h(listener, "listener");
        this.b.c(listener);
    }

    @Override // com.scandit.datacapture.core.T0
    public final void d(TorchListener listener) {
        Intrinsics.h(listener, "listener");
        this.b.d(listener);
    }

    @Override // com.scandit.datacapture.core.T0
    public final void a(TorchListener listener) {
        Intrinsics.h(listener, "listener");
        this.b.a(listener);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.CameraBehaviorDelegate
    public final TorchState b() {
        return this.c;
    }

    @Override // com.scandit.datacapture.core.T0
    public final Collection c() {
        return this.b.c();
    }

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.CameraBehaviorDelegate
    public final void a(CameraSettings settings, Runnable runnable) {
        Intrinsics.h(settings, "settings");
        NativeExtensionsKt.andThen(this.f18796a._applySettings(settings), runnable);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.CameraBehaviorDelegate
    public final void a(TorchState state, Function0 whenDone) {
        Intrinsics.h(state, "state");
        Intrinsics.h(whenDone, "whenDone");
        if (this.c != state) {
            NativeWrappedFuture nativeWrappedFuture_applyTorchStateAsync = this.f18796a._applyTorchStateAsync(state);
            if (nativeWrappedFuture_applyTorchStateAsync != null) {
                NativeExtensionsKt.andThen(nativeWrappedFuture_applyTorchStateAsync, (Callback<? super Boolean>) LambdaExtensionsKt.Callback(new C1046k2(this, state, whenDone)));
                return;
            }
            return;
        }
        whenDone.invoke();
    }
}
