package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTracking;
import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTrackingSettings;
import com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializer;
import com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingAdvancedOverlay;
import com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay;
import com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingAdvancedOverlay;
import com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlay;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
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

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u001e¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010#\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializerProxyAdapter;", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializerProxy;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/serialization/NativeBarcodeTrackingDeserializer;", "_impl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializer;", "deserializer", "", "_setDeserializer", "_deserializer", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "jsonData", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTracking;", "_modeFromJson", "mode", "updateModeFromJson", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingSettings;", "_settingsFromJson", "settings", "updateSettingsFromJson", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlay;", "_basicOverlayFromJson", "overlay", "updateBasicOverlayFromJson", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingAdvancedOverlay;", "_advancedOverlayFromJson", "updateAdvancedOverlayFromJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializerHelper;", "_helper", "", "getWarnings", "()Ljava/util/List;", "warnings", "_NativeBarcodeTrackingDeserializer", "<init>", "(Lcom/scandit/datacapture/barcode/tracking/internal/module/serialization/NativeBarcodeTrackingDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeTrackingDeserializerProxyAdapter implements BarcodeTrackingDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeTrackingDeserializer f18150a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureModeDeserializer c;
    private BarcodeTrackingDeserializer d;

    public BarcodeTrackingDeserializerProxyAdapter(@NotNull NativeBarcodeTrackingDeserializer _NativeBarcodeTrackingDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeTrackingDeserializer, "_NativeBarcodeTrackingDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18150a = _NativeBarcodeTrackingDeserializer;
        this.proxyCache = proxyCache;
        NativeDataCaptureModeDeserializer nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer = _NativeBarcodeTrackingDeserializer.asDataCaptureModeDeserializer();
        Intrinsics.g(nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer, "_NativeBarcodeTrackingDe…CaptureModeDeserializer()");
        this.c = nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer;
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @NotNull
    public BarcodeTrackingAdvancedOverlay _advancedOverlayFromJson(@NotNull BarcodeTracking mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeTracking nativeBarcodeTracking_impl = mode.getF18153a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeTracking.class), null, nativeBarcodeTracking_impl, mode);
        NativeBarcodeTrackingAdvancedOverlay _2 = this.f18150a.barcodeTrackingAdvancedOverlayFromJson(nativeBarcodeTracking_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeTrackingAdvancedOverlay.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeTrackingAdvancedOverlay) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @NotNull
    public BarcodeTrackingBasicOverlay _basicOverlayFromJson(@NotNull BarcodeTracking mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeTracking nativeBarcodeTracking_impl = mode.getF18153a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeTracking.class), null, nativeBarcodeTracking_impl, mode);
        NativeBarcodeTrackingBasicOverlay _2 = this.f18150a.barcodeTrackingBasicOverlayFromJson(nativeBarcodeTracking_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeTrackingBasicOverlay.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeTrackingBasicOverlay) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @NotNull
    public BarcodeTrackingDeserializer _deserializer() {
        BarcodeTrackingDeserializer barcodeTrackingDeserializer = this.d;
        if (barcodeTrackingDeserializer != null) {
            return barcodeTrackingDeserializer;
        }
        Intrinsics.p("_setDeserializer_backing_field");
        throw null;
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeTrackingDeserializer getF18150a() {
        return this.f18150a;
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy, com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    /* renamed from: _modeDeserializerImpl, reason: from getter */
    public NativeDataCaptureModeDeserializer getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @NotNull
    public BarcodeTracking _modeFromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String jsonData) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(jsonData, "jsonData");
        NativeDataCaptureContext nativeDataCaptureContext_impl = dataCaptureContext.getF18429a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, dataCaptureContext);
        NativeBarcodeTracking _2 = this.f18150a.barcodeTrackingFromJson(nativeDataCaptureContext_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeTracking.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeTracking) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    public void _setDeserializer(@NotNull BarcodeTrackingDeserializer deserializer) {
        Intrinsics.h(deserializer, "deserializer");
        this.d = deserializer;
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @NotNull
    public BarcodeTrackingSettings _settingsFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeTrackingSettings _1 = this.f18150a.settingsFromJson(CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeBarcodeTrackingSettings.class);
        Intrinsics.g(_1, "_1");
        return (BarcodeTrackingSettings) proxyCache.require(kClassB, null, _1);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @NotNull
    public List<String> getWarnings() {
        ArrayList<String> _0 = this.f18150a.getWarnings();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @NotNull
    public BarcodeTrackingAdvancedOverlay updateAdvancedOverlayFromJson(@NotNull BarcodeTrackingAdvancedOverlay overlay, @NotNull String jsonData) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeTrackingAdvancedOverlay b = overlay.getB();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeTrackingAdvancedOverlay.class), null, b, overlay);
        NativeBarcodeTrackingAdvancedOverlay _2 = this.f18150a.updateBarcodeTrackingAdvancedOverlayFromJson(b, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeTrackingAdvancedOverlay.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeTrackingAdvancedOverlay) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @NotNull
    public BarcodeTrackingBasicOverlay updateBasicOverlayFromJson(@NotNull BarcodeTrackingBasicOverlay overlay, @NotNull String jsonData) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeTrackingBasicOverlay b = overlay.getB();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeTrackingBasicOverlay.class), null, b, overlay);
        NativeBarcodeTrackingBasicOverlay _2 = this.f18150a.updateBarcodeTrackingBasicOverlayFromJson(b, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeTrackingBasicOverlay.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeTrackingBasicOverlay) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @NotNull
    public BarcodeTracking updateModeFromJson(@NotNull BarcodeTracking mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeTracking nativeBarcodeTracking_impl = mode.getF18153a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeTracking.class), null, nativeBarcodeTracking_impl, mode);
        NativeBarcodeTracking _2 = this.f18150a.updateBarcodeTrackingFromJson(nativeBarcodeTracking_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeTracking.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeTracking) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @NotNull
    public BarcodeTrackingSettings updateSettingsFromJson(@NotNull BarcodeTrackingSettings settings, @NotNull String jsonData) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeTrackingSettings nativeBarcodeTrackingSettings_impl = settings.getF18158a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeTrackingSettings.class), null, nativeBarcodeTrackingSettings_impl, settings);
        NativeBarcodeTrackingSettings _2 = this.f18150a.updateSettingsFromJson(nativeBarcodeTrackingSettings_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeTrackingSettings.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeTrackingSettings) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    public BarcodeTrackingDeserializerHelper get_helper() {
        return (BarcodeTrackingDeserializerHelper) this.proxyCache.requireByValue(Reflection.f24268a.b(BarcodeTrackingDeserializerHelper.class), this.f18150a.getHelper());
    }

    public /* synthetic */ BarcodeTrackingDeserializerProxyAdapter(NativeBarcodeTrackingDeserializer nativeBarcodeTrackingDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeTrackingDeserializer, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
