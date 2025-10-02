package com.scandit.datacapture.barcode.count.serialization;

import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.capture.BarcodeCountSettings;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings;
import com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializer;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.source.CameraSettings;
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

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u001e¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u001a\u0010#\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerProxyAdapter;", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/serialization/NativeBarcodeCountDeserializer;", "_impl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializer;", "deserializer", "", "_setDeserializer", "_deserializer", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "json", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "_modeFromJson", "mode", "updateModeFromJson", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "_settingsFromJson", "settings", "updateSettingsFromJson", "jsonData", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "_overlayFromJson", "overlay", "_updateOverlayFromJson", "Lcom/scandit/datacapture/core/source/CameraSettings;", "createRecommendedCameraSettings", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelper;", "_helper", "", "getWarnings", "()Ljava/util/List;", "warnings", "_NativeBarcodeCountDeserializer", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/serialization/NativeBarcodeCountDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountDeserializerProxyAdapter implements BarcodeCountDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCountDeserializer f17526a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureModeDeserializer c;
    private BarcodeCountDeserializer d;

    public BarcodeCountDeserializerProxyAdapter(@NotNull NativeBarcodeCountDeserializer _NativeBarcodeCountDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeCountDeserializer, "_NativeBarcodeCountDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17526a = _NativeBarcodeCountDeserializer;
        this.proxyCache = proxyCache;
        NativeDataCaptureModeDeserializer nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer = _NativeBarcodeCountDeserializer.asDataCaptureModeDeserializer();
        Intrinsics.g(nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer, "_NativeBarcodeCountDeser…CaptureModeDeserializer()");
        this.c = nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer;
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @NotNull
    public BarcodeCountDeserializer _deserializer() {
        BarcodeCountDeserializer barcodeCountDeserializer = this.d;
        if (barcodeCountDeserializer != null) {
            return barcodeCountDeserializer;
        }
        Intrinsics.p("_setDeserializer_backing_field");
        throw null;
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeCountDeserializer getF17526a() {
        return this.f17526a;
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy, com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    /* renamed from: _modeDeserializerImpl, reason: from getter */
    public NativeDataCaptureModeDeserializer getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @NotNull
    public BarcodeCount _modeFromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String json) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(json, "json");
        NativeDataCaptureContext nativeDataCaptureContext_impl = dataCaptureContext.getF18429a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, dataCaptureContext);
        NativeBarcodeCount _2 = this.f17526a.barcodeCountFromJson(nativeDataCaptureContext_impl, CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeCount.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeCount) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @NotNull
    public BarcodeCountBasicOverlay _overlayFromJson(@NotNull BarcodeCount mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeCount nativeBarcodeCount_impl = mode.getF17472a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeCount.class), null, nativeBarcodeCount_impl, mode);
        NativeBarcodeCountBasicOverlay _2 = this.f17526a.barcodeCountBasicOverlayFromJson(nativeBarcodeCount_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeCountBasicOverlay.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeCountBasicOverlay) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    public void _setDeserializer(@NotNull BarcodeCountDeserializer deserializer) {
        Intrinsics.h(deserializer, "deserializer");
        this.d = deserializer;
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @NotNull
    public BarcodeCountSettings _settingsFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        NativeBarcodeCountSettings _1 = this.f17526a.settingsFromJson(CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeBarcodeCountSettings.class);
        Intrinsics.g(_1, "_1");
        return (BarcodeCountSettings) proxyCache.require(kClassB, null, _1);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @NotNull
    public BarcodeCountBasicOverlay _updateOverlayFromJson(@NotNull BarcodeCountBasicOverlay overlay, @NotNull String jsonData) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay_impl = overlay.getB();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeCountBasicOverlay.class), null, nativeBarcodeCountBasicOverlay_impl, overlay);
        NativeBarcodeCountBasicOverlay _2 = this.f17526a.updateBarcodeCountBasicOverlayFromJson(nativeBarcodeCountBasicOverlay_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeCountBasicOverlay.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeCountBasicOverlay) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @NotNull
    public CameraSettings createRecommendedCameraSettings() {
        NativeCameraSettings _0 = this.f17526a.createRecommendedCameraSettings();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @NotNull
    public List<String> getWarnings() {
        ArrayList<String> _0 = this.f17526a.getWarnings();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @NotNull
    public BarcodeCount updateModeFromJson(@NotNull BarcodeCount mode, @NotNull String json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        NativeBarcodeCount nativeBarcodeCount_impl = mode.getF17472a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeCount.class), null, nativeBarcodeCount_impl, mode);
        NativeBarcodeCount _2 = this.f17526a.updateBarcodeCountFromJson(nativeBarcodeCount_impl, CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeCount.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeCount) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @NotNull
    public BarcodeCountSettings updateSettingsFromJson(@NotNull BarcodeCountSettings settings, @NotNull String json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        NativeBarcodeCountSettings nativeBarcodeCountSettings_impl = settings.getF17475a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeCountSettings.class), null, nativeBarcodeCountSettings_impl, settings);
        NativeBarcodeCountSettings _2 = this.f17526a.updateSettingsFromJson(nativeBarcodeCountSettings_impl, CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeCountSettings.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeCountSettings) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    public BarcodeCountDeserializerHelper get_helper() {
        return (BarcodeCountDeserializerHelper) this.proxyCache.requireByValue(Reflection.f24268a.b(BarcodeCountDeserializerHelper.class), this.f17526a.getHelper());
    }

    public /* synthetic */ BarcodeCountDeserializerProxyAdapter(NativeBarcodeCountDeserializer nativeBarcodeCountDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCountDeserializer, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
