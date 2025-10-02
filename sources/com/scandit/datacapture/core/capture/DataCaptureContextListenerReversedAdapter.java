package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextListener;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.common.NativeContextStatus;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureContextListenerReversedAdapter;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContextListener;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "context", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "source", "", "onFrameSourceChanged", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "mode", "onModeAdded", "onModeRemoved", "Lcom/scandit/datacapture/core/internal/sdk/common/NativeContextStatus;", "status", "onStatusChanged", "onObservationStarted", "onObservationStopped", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/capture/DataCaptureContextListener;", "contextListener", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "captureContext", "<init>", "(Lcom/scandit/datacapture/core/capture/DataCaptureContextListener;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class DataCaptureContextListenerReversedAdapter extends NativeDataCaptureContextListener {

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureContextListener f18428a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ DataCaptureContextListenerReversedAdapter(DataCaptureContextListener dataCaptureContextListener, DataCaptureContext dataCaptureContext, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataCaptureContextListener, dataCaptureContext, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextListener
    public void onFrameSourceChanged(@NotNull NativeDataCaptureContext context, @Nullable NativeFrameSource source) {
        Intrinsics.h(context, "context");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.c.get();
        if (dataCaptureContext != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContext.class), null, context, new l(dataCaptureContext));
            Intrinsics.g(orPut, "{\n            val cached…, cachedSource)\n        }");
            this.f18428a.onFrameSourceChanged((DataCaptureContext) orPut, source != null ? (FrameSource) this.proxyCache.require(reflectionFactory.b(NativeFrameSource.class), null, source) : null);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextListener
    public void onModeAdded(@NotNull NativeDataCaptureContext context, @NotNull NativeDataCaptureMode mode) {
        Intrinsics.h(context, "context");
        Intrinsics.h(mode, "mode");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.c.get();
        if (dataCaptureContext != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContext.class), null, context, new m(dataCaptureContext));
            Intrinsics.g(orPut, "{\n            val cached…xt, cachedMode)\n        }");
            DataCaptureMode dataCaptureMode = (DataCaptureMode) this.proxyCache.require(reflectionFactory.b(NativeDataCaptureMode.class), null, mode);
            this.f18428a.onModeAdded((DataCaptureContext) orPut, dataCaptureMode);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextListener
    public void onModeRemoved(@NotNull NativeDataCaptureContext context, @NotNull NativeDataCaptureMode mode) {
        Intrinsics.h(context, "context");
        Intrinsics.h(mode, "mode");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.c.get();
        if (dataCaptureContext != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContext.class), null, context, new n(dataCaptureContext));
            Intrinsics.g(orPut, "{\n            val cached…xt, cachedMode)\n        }");
            DataCaptureMode dataCaptureMode = (DataCaptureMode) this.proxyCache.require(reflectionFactory.b(NativeDataCaptureMode.class), null, mode);
            this.f18428a.onModeRemoved((DataCaptureContext) orPut, dataCaptureMode);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextListener
    public void onObservationStarted(@NotNull NativeDataCaptureContext context) {
        Intrinsics.h(context, "context");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.c.get();
        if (dataCaptureContext != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeDataCaptureContext.class), null, context, new o(dataCaptureContext));
            Intrinsics.g(orPut, "{\n            val cached…(cachedContext)\n        }");
            this.f18428a.onObservationStarted((DataCaptureContext) orPut);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextListener
    public void onObservationStopped(@NotNull NativeDataCaptureContext context) {
        Intrinsics.h(context, "context");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.c.get();
        if (dataCaptureContext != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeDataCaptureContext.class), null, context, new p(dataCaptureContext));
            Intrinsics.g(orPut, "{\n            val cached…(cachedContext)\n        }");
            this.f18428a.onObservationStopped((DataCaptureContext) orPut);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextListener
    public void onStatusChanged(@NotNull NativeDataCaptureContext context, @NotNull NativeContextStatus status) {
        Intrinsics.h(context, "context");
        Intrinsics.h(status, "status");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.c.get();
        if (dataCaptureContext != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeDataCaptureContext.class), null, context, new q(dataCaptureContext));
            Intrinsics.g(orPut, "{\n            val cached…onvertedStatus)\n        }");
            ContextStatus contextStatusConvert = CoreNativeTypeFactory.INSTANCE.convert(status);
            this.f18428a.onStatusChanged((DataCaptureContext) orPut, contextStatusConvert);
        }
    }

    public DataCaptureContextListenerReversedAdapter(@NotNull DataCaptureContextListener contextListener, @NotNull DataCaptureContext captureContext, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(contextListener, "contextListener");
        Intrinsics.h(captureContext, "captureContext");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18428a = contextListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(captureContext);
    }
}
