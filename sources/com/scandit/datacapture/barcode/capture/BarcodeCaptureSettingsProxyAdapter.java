package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.data.ArucoDictionary;
import com.scandit.datacapture.barcode.data.CompositeType;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeArucoDictionary;
import com.scandit.datacapture.core.source.BatterySavingMode;
import com.scandit.datacapture.core.source.ScanIntention;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u00100\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\u000e\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016J\u0016\u0010\u000e\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR0\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010)\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010/\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020*8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettingsProxyAdapter;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettingsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;", "_impl", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbology", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "", "enabled", "", "enableSymbology", "", "symbologies", "enableSymbologies", "Ljava/util/EnumSet;", "Lcom/scandit/datacapture/barcode/data/CompositeType;", "compositeTypes", "Lcom/scandit/datacapture/barcode/data/ArucoDictionary;", "dictionary", "setArucoDictionary", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "p0", "getEnabledCompositeTypes", "()Ljava/util/EnumSet;", "setEnabledCompositeTypes", "(Ljava/util/EnumSet;)V", "enabledCompositeTypes", "Lcom/scandit/datacapture/core/source/BatterySavingMode;", "getBatterySavingMode", "()Lcom/scandit/datacapture/core/source/BatterySavingMode;", "setBatterySavingMode", "(Lcom/scandit/datacapture/core/source/BatterySavingMode;)V", "batterySavingMode", "Lcom/scandit/datacapture/core/source/ScanIntention;", "getScanIntention", "()Lcom/scandit/datacapture/core/source/ScanIntention;", "setScanIntention", "(Lcom/scandit/datacapture/core/source/ScanIntention;)V", "scanIntention", "_NativeBarcodeCaptureSettings", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCaptureSettingsProxyAdapter implements BarcodeCaptureSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCaptureSettings f17417a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeCaptureSettingsProxyAdapter(@NotNull NativeBarcodeCaptureSettings _NativeBarcodeCaptureSettings, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeCaptureSettings, "_NativeBarcodeCaptureSettings");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17417a = _NativeBarcodeCaptureSettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeCaptureSettings getF17417a() {
        return this.f17417a;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public void enableSymbologies(@NotNull Set<? extends Symbology> symbologies) {
        Intrinsics.h(symbologies, "symbologies");
        this.f17417a.enableSymbologies(BarcodeNativeTypeFactory.INSTANCE.convertSymbologySetToHashSet(symbologies));
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public void enableSymbology(@NotNull Symbology symbology, boolean enabled) {
        Intrinsics.h(symbology, "symbology");
        this.f17417a.setSymbologyEnabled(symbology, enabled);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @NotNull
    public BatterySavingMode getBatterySavingMode() {
        BatterySavingMode _0 = this.f17417a.getBatterySavingMode();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @NotNull
    public EnumSet<CompositeType> getEnabledCompositeTypes() {
        EnumSet<CompositeType> _0 = this.f17417a.getEnabledCompositeTypesBits();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @NotNull
    public Set<Symbology> getEnabledSymbologies() {
        HashSet<Symbology> _0 = this.f17417a.getEnabledSymbologies();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @NotNull
    public ScanIntention getScanIntention() {
        ScanIntention _0 = this.f17417a.getScanIntention();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @NotNull
    public SymbologySettings getSymbologySettings(@NotNull Symbology symbology) {
        Intrinsics.h(symbology, "symbology");
        NativeSymbologySettings _0 = this.f17417a.getSymbologySettings(symbology);
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeSymbologySettings.class);
        Intrinsics.g(_0, "_0");
        return (SymbologySettings) proxyCache.getOrPut(kClassB, null, _0, new U(_0));
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public void setArucoDictionary(@NotNull ArucoDictionary dictionary) {
        Intrinsics.h(dictionary, "dictionary");
        NativeArucoDictionary f17600a = dictionary.getF17600a();
        this.proxyCache.put(Reflection.f24268a.b(NativeArucoDictionary.class), null, f17600a, dictionary);
        this.f17417a.setArucoDictionary(f17600a);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public void setBatterySavingMode(@NotNull BatterySavingMode p0) {
        Intrinsics.h(p0, "p0");
        this.f17417a.setBatterySavingMode(p0);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public void setEnabledCompositeTypes(@NotNull EnumSet<CompositeType> p0) {
        Intrinsics.h(p0, "p0");
        this.f17417a.setEnabledCompositeTypesBits(p0);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public void setScanIntention(@NotNull ScanIntention p0) {
        Intrinsics.h(p0, "p0");
        this.f17417a.setScanIntention(p0);
    }

    public /* synthetic */ BarcodeCaptureSettingsProxyAdapter(NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCaptureSettings, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public void enableSymbologies(@NotNull EnumSet<CompositeType> compositeTypes) {
        Intrinsics.h(compositeTypes, "compositeTypes");
        this.f17417a.enableSymbologiesForCompositeTypes(compositeTypes);
    }
}
