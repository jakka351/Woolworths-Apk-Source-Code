package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.source.NativeFrameDataCollectionFrameSource;
import com.scandit.datacapture.core.source.BitmapFrameSourceProxy;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/core/source/BitmapFrameSourceProxyAdapter;", "Lcom/scandit/datacapture/core/source/BitmapFrameSourceProxy;", "Lcom/scandit/datacapture/core/internal/sdk/source/NativeFrameDataCollectionFrameSource;", "_impl", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "_frameSourceImpl", "Lcom/scandit/datacapture/core/source/FrameSourceState;", "desiredState", "Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "_switchToDesiredState", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "getCurrentState", "()Lcom/scandit/datacapture/core/source/FrameSourceState;", "currentState", "getDesiredState", "_NativeFrameDataCollectionFrameSource", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/source/NativeFrameDataCollectionFrameSource;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BitmapFrameSourceProxyAdapter implements BitmapFrameSourceProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeFrameDataCollectionFrameSource f18834a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeFrameSource c;

    public BitmapFrameSourceProxyAdapter(@NotNull NativeFrameDataCollectionFrameSource _NativeFrameDataCollectionFrameSource, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeFrameDataCollectionFrameSource, "_NativeFrameDataCollectionFrameSource");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18834a = _NativeFrameDataCollectionFrameSource;
        this.proxyCache = proxyCache;
        NativeFrameSource nativeFrameSourceAsFrameSource = _NativeFrameDataCollectionFrameSource.asFrameSource();
        Intrinsics.g(nativeFrameSourceAsFrameSource, "_NativeFrameDataCollecti…ameSource.asFrameSource()");
        this.c = nativeFrameSourceAsFrameSource;
    }

    @Override // com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @NotNull
    /* renamed from: _frameSourceImpl, reason: from getter */
    public NativeFrameSource getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeFrameDataCollectionFrameSource getF18834a() {
        return this.f18834a;
    }

    @Override // com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @NotNull
    public NativeWrappedFuture _switchToDesiredState(@NotNull FrameSourceState desiredState) {
        Intrinsics.h(desiredState, "desiredState");
        NativeWrappedFuture _0 = this.f18834a.switchToDesiredStateAsyncAndroid(desiredState);
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @NotNull
    public FrameSourceState getCurrentState() {
        FrameSourceState _0 = this.f18834a.getCurrentState();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @NotNull
    public FrameSourceState getDesiredState() {
        FrameSourceState _0 = this.f18834a.getDesiredState();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    public void switchToDesiredState(@NotNull FrameSourceState frameSourceState, @Nullable Callback<? super Boolean> callback) {
        BitmapFrameSourceProxy.DefaultImpls.switchToDesiredState(this, frameSourceState, callback);
    }

    public /* synthetic */ BitmapFrameSourceProxyAdapter(NativeFrameDataCollectionFrameSource nativeFrameDataCollectionFrameSource, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeFrameDataCollectionFrameSource, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
