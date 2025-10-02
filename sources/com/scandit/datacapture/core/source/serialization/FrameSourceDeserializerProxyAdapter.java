package com.scandit.datacapture.core.source.serialization;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializer;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u001b¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010 \u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerProxyAdapter;", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerProxy;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializer;", "_impl", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;", "deserializer", "", "_setDeserializer", "_deserializer", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerHelper;", "helper", "_setHelper", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "_setListener", "", "jsonData", "Lcom/scandit/datacapture/core/source/FrameSource;", "_frameSourceFromJson", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "_frameSourceFromJsonValue", "frameSource", "updateFrameSourceFromJson", "updateFrameSourceFromJsonValue", "Lcom/scandit/datacapture/core/source/CameraSettings;", "cameraSettingsFromJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "getWarnings", "()Ljava/util/List;", "warnings", "_NativeFrameSourceDeserializer", "<init>", "(Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class FrameSourceDeserializerProxyAdapter implements FrameSourceDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeFrameSourceDeserializer f18860a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private FrameSourceDeserializer c;

    public FrameSourceDeserializerProxyAdapter(@NotNull NativeFrameSourceDeserializer _NativeFrameSourceDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeFrameSourceDeserializer, "_NativeFrameSourceDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18860a = _NativeFrameSourceDeserializer;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @NotNull
    public FrameSourceDeserializer _deserializer() {
        FrameSourceDeserializer frameSourceDeserializer = this.c;
        if (frameSourceDeserializer != null) {
            return frameSourceDeserializer;
        }
        Intrinsics.p("_setDeserializer_backing_field");
        throw null;
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @NotNull
    public FrameSource _frameSourceFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        NativeFrameSource _1 = this.f18860a.frameSourceFromJson(CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeFrameSource.class);
        Intrinsics.g(_1, "_1");
        return (FrameSource) proxyCache.require(kClassB, null, _1);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @NotNull
    public FrameSource _frameSourceFromJsonValue(@NotNull JsonValue json) {
        Intrinsics.h(json, "json");
        NativeJsonValue f18778a = json.getF18778a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeJsonValue.class), null, f18778a, json);
        NativeFrameSource _1 = this.f18860a.frameSourceFromJson(f18778a);
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeFrameSource.class);
        Intrinsics.g(_1, "_1");
        return (FrameSource) proxyCache2.require(kClassB, null, _1);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeFrameSourceDeserializer getF18860a() {
        return this.f18860a;
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    public void _setDeserializer(@NotNull FrameSourceDeserializer deserializer) {
        Intrinsics.h(deserializer, "deserializer");
        this.c = deserializer;
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    public void _setHelper(@Nullable FrameSourceDeserializerHelper helper) {
        this.f18860a.setHelper(helper != null ? (FrameSourceDeserializerHelperReversedAdapter) this.proxyCache.getOrPut(Reflection.f24268a.b(FrameSourceDeserializerHelper.class), null, helper, new j(helper)) : null);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    public void _setListener(@Nullable FrameSourceDeserializerListener listener) {
        this.f18860a.setListener(listener != null ? (FrameSourceDeserializerListenerReversedAdapter) this.proxyCache.getOrPut(Reflection.f24268a.b(FrameSourceDeserializerListener.class), this, listener, new k(listener, this)) : null);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @NotNull
    public CameraSettings cameraSettingsFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        NativeCameraSettings _1 = this.f18860a.cameraSettingsFromJson(coreNativeTypeFactory.convert(jsonData));
        Intrinsics.g(_1, "_1");
        return coreNativeTypeFactory.convert(_1);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @NotNull
    public List<String> getWarnings() {
        ArrayList<String> _0 = this.f18860a.getWarnings();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @NotNull
    public CameraSettings updateCameraSettingsFromJson(@NotNull CameraSettings cameraSettings, @NotNull String str) {
        return FrameSourceDeserializerProxy.DefaultImpls.updateCameraSettingsFromJson(this, cameraSettings, str);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @NotNull
    public FrameSource updateFrameSourceFromJson(@NotNull FrameSource frameSource, @NotNull String jsonData) {
        Intrinsics.h(frameSource, "frameSource");
        Intrinsics.h(jsonData, "jsonData");
        NativeFrameSource nativeFrameSource_frameSourceImpl = frameSource.getC();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeFrameSource.class), null, nativeFrameSource_frameSourceImpl, frameSource);
        NativeFrameSource _2 = this.f18860a.updateFrameSourceFromJson(nativeFrameSource_frameSourceImpl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeFrameSource.class);
        Intrinsics.g(_2, "_2");
        return (FrameSource) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @NotNull
    public FrameSource updateFrameSourceFromJsonValue(@NotNull FrameSource frameSource, @NotNull JsonValue json) {
        Intrinsics.h(frameSource, "frameSource");
        Intrinsics.h(json, "json");
        NativeFrameSource nativeFrameSource_frameSourceImpl = frameSource.getC();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeFrameSource.class), null, nativeFrameSource_frameSourceImpl, frameSource);
        NativeJsonValue f18778a = json.getF18778a();
        this.proxyCache.put(reflectionFactory.b(NativeJsonValue.class), null, f18778a, json);
        NativeFrameSource _2 = this.f18860a.updateFrameSourceFromJson(nativeFrameSource_frameSourceImpl, f18778a);
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeFrameSource.class);
        Intrinsics.g(_2, "_2");
        return (FrameSource) proxyCache2.require(kClassB, null, _2);
    }

    public /* synthetic */ FrameSourceDeserializerProxyAdapter(NativeFrameSourceDeserializer nativeFrameSourceDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeFrameSourceDeserializer, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
