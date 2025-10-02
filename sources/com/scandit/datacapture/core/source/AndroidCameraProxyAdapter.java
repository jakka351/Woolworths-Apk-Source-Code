package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.source.AndroidCameraProxy;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0015\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/scandit/datacapture/core/source/AndroidCameraProxyAdapter;", "Lcom/scandit/datacapture/core/source/AndroidCameraProxy;", "Lcom/scandit/datacapture/core/internal/sdk/source/NativeAndroidCamera;", "_impl", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "_frameSourceImpl", "Lcom/scandit/datacapture/core/source/FrameSourceState;", "desiredState", "Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "_switchToDesiredState", "Lcom/scandit/datacapture/core/source/CameraSettings;", "settings", "_applySettings", "Lcom/scandit/datacapture/core/source/TorchState;", "torchState", "_applyTorchStateAsync", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "getCurrentState", "()Lcom/scandit/datacapture/core/source/FrameSourceState;", "currentState", "getDesiredState", "Lcom/scandit/datacapture/core/source/CameraPosition;", "getPosition", "()Lcom/scandit/datacapture/core/source/CameraPosition;", "position", "", "isTorchAvailable", "()Z", "_NativeAndroidCamera", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/source/NativeAndroidCamera;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class AndroidCameraProxyAdapter implements AndroidCameraProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeAndroidCamera f18831a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeFrameSource c;

    public AndroidCameraProxyAdapter(@NotNull NativeAndroidCamera _NativeAndroidCamera, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeAndroidCamera, "_NativeAndroidCamera");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18831a = _NativeAndroidCamera;
        this.proxyCache = proxyCache;
        NativeFrameSource nativeFrameSourceAsFrameSource = _NativeAndroidCamera.asFrameSource();
        Intrinsics.g(nativeFrameSourceAsFrameSource, "_NativeAndroidCamera.asFrameSource()");
        this.c = nativeFrameSourceAsFrameSource;
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @NotNull
    public NativeWrappedFuture _applySettings(@NotNull CameraSettings settings) {
        Intrinsics.h(settings, "settings");
        NativeWrappedFuture _1 = this.f18831a.applySettingsAsyncAndroid(CoreNativeTypeFactory.INSTANCE.convert(settings));
        Intrinsics.g(_1, "_1");
        return _1;
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @NotNull
    public NativeWrappedFuture _applyTorchStateAsync(@NotNull TorchState torchState) {
        Intrinsics.h(torchState, "torchState");
        NativeWrappedFuture _0 = this.f18831a.applyTorchStateAsyncWrapped(torchState);
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @NotNull
    /* renamed from: _frameSourceImpl, reason: from getter */
    public NativeFrameSource getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeAndroidCamera getF18831a() {
        return this.f18831a;
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @NotNull
    public NativeWrappedFuture _switchToDesiredState(@NotNull FrameSourceState desiredState) {
        Intrinsics.h(desiredState, "desiredState");
        NativeWrappedFuture _0 = this.f18831a.switchToDesiredStateAsyncAndroid(desiredState);
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @NotNull
    public FrameSourceState getCurrentState() {
        FrameSourceState _0 = this.f18831a.getCurrentState();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @NotNull
    public FrameSourceState getDesiredState() {
        FrameSourceState _0 = this.f18831a.getDesiredState();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    @NotNull
    public CameraPosition getPosition() {
        CameraPosition _0 = this.f18831a.getPosition();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    public boolean isTorchAvailable() {
        return this.f18831a.isTorchAvailable();
    }

    @Override // com.scandit.datacapture.core.source.AndroidCameraProxy
    public void switchToDesiredState(@NotNull FrameSourceState frameSourceState, @Nullable Callback<? super Boolean> callback) {
        AndroidCameraProxy.DefaultImpls.switchToDesiredState(this, frameSourceState, callback);
    }

    public /* synthetic */ AndroidCameraProxyAdapter(NativeAndroidCamera nativeAndroidCamera, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeAndroidCamera, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
