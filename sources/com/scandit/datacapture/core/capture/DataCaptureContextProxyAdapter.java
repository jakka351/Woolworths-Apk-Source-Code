package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureContextProxyAdapter;", "Lcom/scandit/datacapture/core/capture/DataCaptureContextProxy;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "_impl", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "_setContext", "_context", "Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;", "settings", "applySettings", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "mode", "Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "_addModeAsyncWrapped", "_removeModeAsyncWrapped", "_removeAllModesAsyncWrapped", "Lcom/scandit/datacapture/core/source/FrameSource;", "frameSource", "_setFrameSourceAsyncWrapped", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeDataCaptureContext", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class DataCaptureContextProxyAdapter implements DataCaptureContextProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeDataCaptureContext f18429a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private DataCaptureContext c;

    public DataCaptureContextProxyAdapter(@NotNull NativeDataCaptureContext _NativeDataCaptureContext, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeDataCaptureContext, "_NativeDataCaptureContext");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18429a = _NativeDataCaptureContext;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @NotNull
    public NativeWrappedFuture _addModeAsyncWrapped(@NotNull DataCaptureMode mode) {
        Intrinsics.h(mode, "mode");
        NativeDataCaptureMode c = mode.getC();
        this.proxyCache.put(Reflection.f24268a.b(NativeDataCaptureMode.class), null, c, mode);
        NativeWrappedFuture _1 = this.f18429a.addModeAsyncWrapped(c);
        Intrinsics.g(_1, "_1");
        return _1;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @NotNull
    public DataCaptureContext _context() {
        DataCaptureContext dataCaptureContext = this.c;
        if (dataCaptureContext != null) {
            return dataCaptureContext;
        }
        Intrinsics.p("_setContext_backing_field");
        throw null;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeDataCaptureContext getF18429a() {
        return this.f18429a;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @NotNull
    public NativeWrappedFuture _removeAllModesAsyncWrapped() {
        NativeWrappedFuture _0 = this.f18429a.removeAllModesAsyncWrapped();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @NotNull
    public NativeWrappedFuture _removeModeAsyncWrapped(@NotNull DataCaptureMode mode) {
        Intrinsics.h(mode, "mode");
        NativeDataCaptureMode c = mode.getC();
        this.proxyCache.put(Reflection.f24268a.b(NativeDataCaptureMode.class), null, c, mode);
        NativeWrappedFuture _1 = this.f18429a.removeModeAsyncWrapped(c);
        Intrinsics.g(_1, "_1");
        return _1;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    public void _setContext(@NotNull DataCaptureContext dataCaptureContext) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        this.c = dataCaptureContext;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @NotNull
    public NativeWrappedFuture _setFrameSourceAsyncWrapped(@Nullable FrameSource frameSource) {
        NativeFrameSource nativeFrameSource = null;
        if (frameSource != null) {
            NativeFrameSource c = frameSource.getC();
            this.proxyCache.put(Reflection.f24268a.b(NativeFrameSource.class), null, c, frameSource);
            nativeFrameSource = c;
        }
        NativeWrappedFuture _2 = this.f18429a.setFrameSourceAsyncWrapped(nativeFrameSource);
        Intrinsics.g(_2, "_2");
        return _2;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    public void applySettings(@NotNull DataCaptureContextSettings settings) {
        Intrinsics.h(settings, "settings");
        NativeDataCaptureContextSettings f18431a = settings.getF18431a();
        this.proxyCache.put(Reflection.f24268a.b(NativeDataCaptureContextSettings.class), null, f18431a, settings);
        this.f18429a.applySettings(f18431a);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ DataCaptureContextProxyAdapter(NativeDataCaptureContext nativeDataCaptureContext, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeDataCaptureContext, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
