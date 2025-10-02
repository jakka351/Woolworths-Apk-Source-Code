package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextFrameListener;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureContextFrameListenerReversedAdapter;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContextFrameListener;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "context", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeFrameData;", "data", "", "onFrameProcessingStarted", "onFrameProcessingFinished", "onObservationStarted", "onObservationStopped", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/capture/DataCaptureContextFrameListener;", "_DataCaptureContextFrameListener", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "_DataCaptureContext", "<init>", "(Lcom/scandit/datacapture/core/capture/DataCaptureContextFrameListener;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class DataCaptureContextFrameListenerReversedAdapter extends NativeDataCaptureContextFrameListener {

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureContextFrameListener f18427a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ DataCaptureContextFrameListenerReversedAdapter(DataCaptureContextFrameListener dataCaptureContextFrameListener, DataCaptureContext dataCaptureContext, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataCaptureContextFrameListener, dataCaptureContext, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextFrameListener
    public void onFrameProcessingFinished(@NotNull NativeDataCaptureContext context, @NotNull NativeFrameData data) {
        Intrinsics.h(context, "context");
        Intrinsics.h(data, "data");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.c.get();
        if (dataCaptureContext != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContext.class), null, context, new f(dataCaptureContext));
            Intrinsics.g(orPut, "{\n            val _0 = p…inished(_0, _1)\n        }");
            FrameData frameData = (FrameData) this.proxyCache.getOrPut(reflectionFactory.b(NativeFrameData.class), null, data, new g(data));
            this.f18427a.onFrameProcessingFinished((DataCaptureContext) orPut, frameData);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextFrameListener
    public void onFrameProcessingStarted(@NotNull NativeDataCaptureContext context, @NotNull NativeFrameData data) {
        Intrinsics.h(context, "context");
        Intrinsics.h(data, "data");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.c.get();
        if (dataCaptureContext != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContext.class), null, context, new h(dataCaptureContext));
            Intrinsics.g(orPut, "{\n            val _0 = p…Started(_0, _1)\n        }");
            FrameData frameData = (FrameData) this.proxyCache.getOrPut(reflectionFactory.b(NativeFrameData.class), null, data, new i(data));
            this.f18427a.onFrameProcessingStarted((DataCaptureContext) orPut, frameData);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextFrameListener
    public void onObservationStarted(@NotNull NativeDataCaptureContext context) {
        Intrinsics.h(context, "context");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.c.get();
        if (dataCaptureContext != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeDataCaptureContext.class), null, context, new j(dataCaptureContext));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStarted(_0)\n        }");
            this.f18427a.onObservationStarted((DataCaptureContext) orPut);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextFrameListener
    public void onObservationStopped(@NotNull NativeDataCaptureContext context) {
        Intrinsics.h(context, "context");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.c.get();
        if (dataCaptureContext != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeDataCaptureContext.class), null, context, new k(dataCaptureContext));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStopped(_0)\n        }");
            this.f18427a.onObservationStopped((DataCaptureContext) orPut);
        }
    }

    public DataCaptureContextFrameListenerReversedAdapter(@NotNull DataCaptureContextFrameListener _DataCaptureContextFrameListener, @NotNull DataCaptureContext _DataCaptureContext, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_DataCaptureContextFrameListener, "_DataCaptureContextFrameListener");
        Intrinsics.h(_DataCaptureContext, "_DataCaptureContext");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18427a = _DataCaptureContextFrameListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_DataCaptureContext);
    }
}
