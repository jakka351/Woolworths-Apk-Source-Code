package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelection;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings;
import com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializer;
import com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlay;
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

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u001b¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010 \u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerProxyAdapter;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerProxy;", "Lcom/scandit/datacapture/barcode/selection/internal/module/serialization/NativeBarcodeSelectionDeserializer;", "_impl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializer;", "deserializer", "", "_setDeserializer", "_deserializer", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "jsonData", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;", "_modeFromJson", "mode", "updateModeFromJson", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings;", "_settingsFromJson", "settings", "updateSettingsFromJson", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;", "_basicOverlayFromJson", "overlay", "updateBasicOverlayFromJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerHelper;", "_helper", "", "getWarnings", "()Ljava/util/List;", "warnings", "_NativeBarcodeSelectionDeserializer", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/serialization/NativeBarcodeSelectionDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionDeserializerProxyAdapter implements BarcodeSelectionDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeSelectionDeserializer f18022a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureModeDeserializer c;
    private BarcodeSelectionDeserializer d;

    public BarcodeSelectionDeserializerProxyAdapter(@NotNull NativeBarcodeSelectionDeserializer _NativeBarcodeSelectionDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeSelectionDeserializer, "_NativeBarcodeSelectionDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18022a = _NativeBarcodeSelectionDeserializer;
        this.proxyCache = proxyCache;
        NativeDataCaptureModeDeserializer nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer = _NativeBarcodeSelectionDeserializer.asDataCaptureModeDeserializer();
        Intrinsics.g(nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer, "_NativeBarcodeSelectionD…CaptureModeDeserializer()");
        this.c = nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @NotNull
    public BarcodeSelectionBasicOverlay _basicOverlayFromJson(@NotNull BarcodeSelection mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeSelection nativeBarcodeSelection_impl = mode.getF18028a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeSelection.class), null, nativeBarcodeSelection_impl, mode);
        NativeBarcodeSelectionBasicOverlay _2 = this.f18022a.barcodeSelectionBasicOverlayFromJson(nativeBarcodeSelection_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeSelectionBasicOverlay.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeSelectionBasicOverlay) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @NotNull
    public BarcodeSelectionDeserializer _deserializer() {
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = this.d;
        if (barcodeSelectionDeserializer != null) {
            return barcodeSelectionDeserializer;
        }
        Intrinsics.p("_setDeserializer_backing_field");
        throw null;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeSelectionDeserializer getF18022a() {
        return this.f18022a;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy, com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    /* renamed from: _modeDeserializerImpl, reason: from getter */
    public NativeDataCaptureModeDeserializer getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @NotNull
    public BarcodeSelection _modeFromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String jsonData) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(jsonData, "jsonData");
        NativeDataCaptureContext nativeDataCaptureContext_impl = dataCaptureContext.getF18429a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, dataCaptureContext);
        NativeBarcodeSelection _2 = this.f18022a.barcodeSelectionFromJson(nativeDataCaptureContext_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeSelection.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeSelection) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    public void _setDeserializer(@NotNull BarcodeSelectionDeserializer deserializer) {
        Intrinsics.h(deserializer, "deserializer");
        this.d = deserializer;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @NotNull
    public BarcodeSelectionSettings _settingsFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeSelectionSettings _1 = this.f18022a.settingsFromJson(CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeBarcodeSelectionSettings.class);
        Intrinsics.g(_1, "_1");
        return (BarcodeSelectionSettings) proxyCache.require(kClassB, null, _1);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @NotNull
    public List<String> getWarnings() {
        ArrayList<String> _0 = this.f18022a.getWarnings();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @NotNull
    public BarcodeSelectionBasicOverlay updateBasicOverlayFromJson(@NotNull BarcodeSelectionBasicOverlay overlay, @NotNull String jsonData) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeSelectionBasicOverlay nativeBarcodeSelectionBasicOverlay_impl = overlay.getB();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeSelectionBasicOverlay.class), null, nativeBarcodeSelectionBasicOverlay_impl, overlay);
        NativeBarcodeSelectionBasicOverlay _2 = this.f18022a.updateBarcodeSelectionBasicOverlayFromJson(nativeBarcodeSelectionBasicOverlay_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeSelectionBasicOverlay.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeSelectionBasicOverlay) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @NotNull
    public BarcodeSelection updateModeFromJson(@NotNull BarcodeSelection mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeSelection nativeBarcodeSelection_impl = mode.getF18028a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeSelection.class), null, nativeBarcodeSelection_impl, mode);
        NativeBarcodeSelection _2 = this.f18022a.updateBarcodeSelectionFromJson(nativeBarcodeSelection_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeSelection.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeSelection) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @NotNull
    public BarcodeSelectionSettings updateSettingsFromJson(@NotNull BarcodeSelectionSettings settings, @NotNull String jsonData) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(jsonData, "jsonData");
        NativeBarcodeSelectionSettings nativeBarcodeSelectionSettings_impl = settings.getF18032a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodeSelectionSettings.class), null, nativeBarcodeSelectionSettings_impl, settings);
        NativeBarcodeSelectionSettings _2 = this.f18022a.updateSettingsFromJson(nativeBarcodeSelectionSettings_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodeSelectionSettings.class);
        Intrinsics.g(_2, "_2");
        return (BarcodeSelectionSettings) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    public BarcodeSelectionDeserializerHelper get_helper() {
        return (BarcodeSelectionDeserializerHelper) this.proxyCache.requireByValue(Reflection.f24268a.b(BarcodeSelectionDeserializerHelper.class), this.f18022a.getHelper());
    }

    public /* synthetic */ BarcodeSelectionDeserializerProxyAdapter(NativeBarcodeSelectionDeserializer nativeBarcodeSelectionDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeSelectionDeserializer, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
