package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings;
import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializer;
import com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlay;
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

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u001b¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010 \u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerProxyAdapter;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerProxy;", "Lcom/scandit/datacapture/barcode/internal/module/serialization/NativeBarcodeCaptureDeserializer;", "_impl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializer;", "deserializer", "", "_setDeserializer", "_deserializer", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "jsonData", "Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "_modeFromJson", "mode", "updateModeFromJson", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "_settingsFromJson", "settings", "updateSettingsFromJson", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay;", "_overlayFromJson", "overlay", "updateOverlayFromJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerHelper;", "_helper", "", "getWarnings", "()Ljava/util/List;", "warnings", "_NativeBarcodeCaptureDeserializer", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/serialization/NativeBarcodeCaptureDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCaptureDeserializerProxyAdapter implements BarcodeCaptureDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCaptureDeserializer f17410a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureModeDeserializer c;
    private BarcodeCaptureDeserializer d;

    public BarcodeCaptureDeserializerProxyAdapter(@NotNull NativeBarcodeCaptureDeserializer _NativeBarcodeCaptureDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeCaptureDeserializer, "_NativeBarcodeCaptureDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17410a = _NativeBarcodeCaptureDeserializer;
        this.proxyCache = proxyCache;
        NativeDataCaptureModeDeserializer nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer = _NativeBarcodeCaptureDeserializer.asDataCaptureModeDeserializer();
        Intrinsics.g(nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer, "_NativeBarcodeCaptureDes…CaptureModeDeserializer()");
        this.c = nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    public BarcodeCaptureDeserializer _deserializer() {
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = this.d;
        if (barcodeCaptureDeserializer != null) {
            return barcodeCaptureDeserializer;
        }
        Intrinsics.p("_setDeserializer_backing_field");
        throw null;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeCaptureDeserializer getF17410a() {
        return this.f17410a;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    /* renamed from: _modeDeserializerImpl, reason: from getter */
    public NativeDataCaptureModeDeserializer getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    public BarcodeCapture _modeFromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String jsonData) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(jsonData, "jsonData");
        NativeDataCaptureContext nativeDataCaptureContext_impl = dataCaptureContext.getF18429a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, dataCaptureContext);
        NativeBarcodeCapture _2 = this.f17410a.barcodeCaptureFromJson(nativeDataCaptureContext_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeCapture.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeCapture) proxyCache2.getOrPut(kClassB, null, _2, new F(_2));
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    public BarcodeCaptureOverlay _overlayFromJson(@NotNull BarcodeCapture mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeCapture nativeBarcodeCapture_impl = mode.getF17413a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeCapture.class), null, nativeBarcodeCapture_impl, mode);
        NativeBarcodeCaptureOverlay _2 = this.f17410a.barcodeCaptureOverlayFromJson(nativeBarcodeCapture_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeCaptureOverlay.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeCaptureOverlay) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    public void _setDeserializer(@NotNull BarcodeCaptureDeserializer deserializer) {
        Intrinsics.h(deserializer, "deserializer");
        this.d = deserializer;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    public BarcodeCaptureSettings _settingsFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeCaptureSettings _1 = this.f17410a.settingsFromJson(CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeBarcodeCaptureSettings.class);
        Intrinsics.g(_1, "_1");
        return (BarcodeCaptureSettings) proxyCache.getOrPut(kClassB, null, _1, new G(_1));
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    public List<String> getWarnings() {
        ArrayList<String> _0 = this.f17410a.getWarnings();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    public BarcodeCapture updateModeFromJson(@NotNull BarcodeCapture mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeCapture nativeBarcodeCapture_impl = mode.getF17413a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeCapture.class), null, nativeBarcodeCapture_impl, mode);
        NativeBarcodeCapture _2 = this.f17410a.updateBarcodeCaptureFromJson(nativeBarcodeCapture_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeCapture.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeCapture) proxyCache2.getOrPut(kClassB, null, _2, new H(_2));
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    public BarcodeCaptureOverlay updateOverlayFromJson(@NotNull BarcodeCaptureOverlay overlay, @NotNull String jsonData) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeCaptureOverlay nativeBarcodeCaptureOverlay_impl = overlay.getB();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeCaptureOverlay.class), null, nativeBarcodeCaptureOverlay_impl, overlay);
        NativeBarcodeCaptureOverlay _2 = this.f17410a.updateBarcodeCaptureOverlayFromJson(nativeBarcodeCaptureOverlay_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeCaptureOverlay.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeCaptureOverlay) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    public BarcodeCaptureSettings updateSettingsFromJson(@NotNull BarcodeCaptureSettings settings, @NotNull String jsonData) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings_impl = settings.getF17417a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeCaptureSettings.class), null, nativeBarcodeCaptureSettings_impl, settings);
        NativeBarcodeCaptureSettings _2 = this.f17410a.updateSettingsFromJson(nativeBarcodeCaptureSettings_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeCaptureSettings.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeCaptureSettings) proxyCache2.getOrPut(kClassB, null, _2, new I(_2));
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    public BarcodeCaptureDeserializerHelper get_helper() {
        return (BarcodeCaptureDeserializerHelper) this.proxyCache.requireByValue(Reflection.f24268a.b(BarcodeCaptureDeserializerHelper.class), this.f17410a.getHelper());
    }

    public /* synthetic */ BarcodeCaptureDeserializerProxyAdapter(NativeBarcodeCaptureDeserializer nativeBarcodeCaptureDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCaptureDeserializer, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
