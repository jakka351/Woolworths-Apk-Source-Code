package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettings;
import com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010 \u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR$\u0010#\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R$\u0010*\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001c¨\u0006."}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettingsProxyAdapter;", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettingsProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountSettings;", "_impl", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbology", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "", "symbologies", "", "enableSymbologies", "", "enabled", "setSymbologyEnabled", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "p0", "getExpectsOnlyUniqueBarcodes", "()Z", "setExpectsOnlyUniqueBarcodes", "(Z)V", "expectsOnlyUniqueBarcodes", "getDisableModeWhenCaptureListCompleted", "setDisableModeWhenCaptureListCompleted", "disableModeWhenCaptureListCompleted", "getMappingEnabled", "setMappingEnabled", "mappingEnabled", "Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "getFilterSettings", "()Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "filterSettings", "getEnableUnrecognizedBarcodeDetection", "setEnableUnrecognizedBarcodeDetection", "enableUnrecognizedBarcodeDetection", "_NativeBarcodeCountSettings", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountSettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountSettingsProxyAdapter implements BarcodeCountSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCountSettings f17475a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeCountSettingsProxyAdapter(@NotNull NativeBarcodeCountSettings _NativeBarcodeCountSettings, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeCountSettings, "_NativeBarcodeCountSettings");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17475a = _NativeBarcodeCountSettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeCountSettings getF17475a() {
        return this.f17475a;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    public void enableSymbologies(@NotNull Set<? extends Symbology> symbologies) {
        Intrinsics.h(symbologies, "symbologies");
        this.f17475a.enableSymbologies(BarcodeNativeTypeFactory.INSTANCE.convertSymbologySetToHashSet(symbologies));
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    public boolean getDisableModeWhenCaptureListCompleted() {
        return this.f17475a.shouldDisableModeWhenCaptureListCompleted();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    public boolean getEnableUnrecognizedBarcodeDetection() {
        return this.f17475a.getEnableUnrecognizedBarcodeDetection();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @NotNull
    public Set<Symbology> getEnabledSymbologies() {
        HashSet<Symbology> _0 = this.f17475a.getEnabledSymbologies();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    public boolean getExpectsOnlyUniqueBarcodes() {
        return this.f17475a.expectsOnlyUniqueBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @NotNull
    public BarcodeFilterSettings getFilterSettings() {
        NativeBarcodeFilterSettings _0 = this.f17475a.getFilterSettings();
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeBarcodeFilterSettings.class);
        Intrinsics.g(_0, "_0");
        return (BarcodeFilterSettings) proxyCache.getOrPut(kClassB, null, _0, new h(_0));
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    public boolean getMappingEnabled() {
        return this.f17475a.getMappingEnabled();
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @NotNull
    public SymbologySettings getSymbologySettings(@NotNull Symbology symbology) {
        Intrinsics.h(symbology, "symbology");
        NativeSymbologySettings _0 = this.f17475a.getSymbologySettings(symbology);
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeSymbologySettings.class);
        Intrinsics.g(_0, "_0");
        return (SymbologySettings) proxyCache.getOrPut(kClassB, null, _0, new i(_0));
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    public void setDisableModeWhenCaptureListCompleted(boolean z) {
        this.f17475a.setShouldDisableModeWhenCaptureListCompleted(z);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    public void setEnableUnrecognizedBarcodeDetection(boolean z) {
        this.f17475a.setEnableUnrecognizedBarcodeDetection(z);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    public void setExpectsOnlyUniqueBarcodes(boolean z) {
        this.f17475a.setExpectsOnlyUniqueBarcodes(z);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    public void setMappingEnabled(boolean z) {
        this.f17475a.setMappingEnabled(z);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    public void setSymbologyEnabled(@NotNull Symbology symbology, boolean enabled) {
        Intrinsics.h(symbology, "symbology");
        this.f17475a.setSymbologyEnabled(symbology, enabled);
    }

    public /* synthetic */ BarcodeCountSettingsProxyAdapter(NativeBarcodeCountSettings nativeBarcodeCountSettings, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCountSettings, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
