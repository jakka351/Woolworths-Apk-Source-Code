package com.scandit.datacapture.core.capture.serialization;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureContextSettings;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerHelper;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010 \u001a\u00020\u001b¢\u0006\u0004\b#\u0010$JX\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u001a\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016R\u001a\u0010 \u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerHelperReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializerHelper;", "", "licenseKey", "deviceName", "externalId", "frameworkName", "frameworkVersion", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContextSettings;", "settings", "deviceOS", "browser", "browserVersion", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "createContext", "context", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "updateContextFromJson", "c", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "m", "removeModeFromContext", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "f", "setFrameSourceOnContext", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerHelper;", "dataCaptureContextDeserializerHelper", "<init>", "(Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerHelper;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class DataCaptureContextDeserializerHelperReversedAdapter extends NativeDataCaptureContextDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureContextDeserializerHelper f18449a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public /* synthetic */ DataCaptureContextDeserializerHelperReversedAdapter(DataCaptureContextDeserializerHelper dataCaptureContextDeserializerHelper, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataCaptureContextDeserializerHelper, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerHelper
    @NotNull
    public NativeDataCaptureContext createContext(@NotNull String licenseKey, @NotNull String deviceName, @NotNull String externalId, @NotNull String frameworkName, @Nullable String frameworkVersion, @NotNull NativeDataCaptureContextSettings settings, @Nullable String deviceOS, @Nullable String browser, @Nullable String browserVersion) {
        Intrinsics.h(licenseKey, "licenseKey");
        Intrinsics.h(deviceName, "deviceName");
        Intrinsics.h(externalId, "externalId");
        Intrinsics.h(frameworkName, "frameworkName");
        Intrinsics.h(settings, "settings");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        DataCaptureContext dataCaptureContextCreateContext = this.f18449a.createContext(licenseKey, deviceName, externalId, frameworkName, frameworkVersion, (DataCaptureContextSettings) proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContextSettings.class), null, settings, new c(settings)), deviceOS, browser, browserVersion);
        this.proxyCache.put(reflectionFactory.b(DataCaptureContext.class), null, dataCaptureContextCreateContext, dataCaptureContextCreateContext._impl());
        NativeDataCaptureContext nativeDataCaptureContext_impl = dataCaptureContextCreateContext._impl();
        this.proxyCache.put(reflectionFactory.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, dataCaptureContextCreateContext);
        return nativeDataCaptureContext_impl;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerHelper
    public void removeModeFromContext(@NotNull NativeDataCaptureContext c, @NotNull NativeDataCaptureMode m) {
        Intrinsics.h(c, "c");
        Intrinsics.h(m, "m");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18449a.removeModeFromContext((DataCaptureContext) proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContext.class), null, c, new d(c)), (DataCaptureMode) this.proxyCache.require(reflectionFactory.b(NativeDataCaptureMode.class), null, m));
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerHelper
    public void setFrameSourceOnContext(@NotNull NativeDataCaptureContext c, @Nullable NativeFrameSource f) {
        Intrinsics.h(c, "c");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18449a.setFrameSourceOnContext((DataCaptureContext) proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContext.class), null, c, new e(c)), f != null ? (FrameSource) this.proxyCache.require(reflectionFactory.b(NativeFrameSource.class), null, f) : null);
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerHelper
    public void updateContextFromJson(@NotNull NativeDataCaptureContext context, @NotNull NativeJsonValue json) {
        Intrinsics.h(context, "context");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18449a.updateContextFromJson((DataCaptureContext) proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContext.class), null, context, new f(context)), (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new g(json)));
    }

    public DataCaptureContextDeserializerHelperReversedAdapter(@NotNull DataCaptureContextDeserializerHelper dataCaptureContextDeserializerHelper, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(dataCaptureContextDeserializerHelper, "dataCaptureContextDeserializerHelper");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18449a = dataCaptureContextDeserializerHelper;
        this.proxyCache = proxyCache;
    }
}
