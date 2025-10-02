package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.ArucoDictionary;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettings;
import com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeArucoDictionary;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
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

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u00100\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\u000e\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010)\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010,\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R$\u0010/\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(¨\u00063"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettingsProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettingsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickSettings;", "_impl", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbology", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "", "enabled", "", "enableSymbology", "", "symbologies", "enableSymbologies", "Lcom/scandit/datacapture/barcode/data/ArucoDictionary;", "dictionary", "setArucoDictionary", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "_updateFromJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "p0", "getFilterSettings", "()Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "setFilterSettings", "(Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;)V", "filterSettings", "getSoundEnabled", "()Z", "setSoundEnabled", "(Z)V", "soundEnabled", "getHapticsEnabled", "setHapticsEnabled", "hapticsEnabled", "getCachingEnabled", "setCachingEnabled", "cachingEnabled", "_NativeBarcodePickSettings", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickSettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickSettingsProxyAdapter implements BarcodePickSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePickSettings f17899a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodePickSettingsProxyAdapter(@NotNull NativeBarcodePickSettings _NativeBarcodePickSettings, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodePickSettings, "_NativeBarcodePickSettings");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17899a = _NativeBarcodePickSettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodePickSettings getF17899a() {
        return this.f17899a;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public void _updateFromJson(@NotNull JsonValue json) {
        Intrinsics.h(json, "json");
        NativeJsonValue f18778a = json.getF18778a();
        this.proxyCache.put(Reflection.f24268a.b(NativeJsonValue.class), null, f18778a, json);
        this.f17899a.updateFromJson(f18778a);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public void enableSymbologies(@NotNull Set<? extends Symbology> symbologies) {
        Intrinsics.h(symbologies, "symbologies");
        this.f17899a.enableSymbologies(BarcodeNativeTypeFactory.INSTANCE.convertSymbologySetToHashSet(symbologies));
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public void enableSymbology(@NotNull Symbology symbology, boolean enabled) {
        Intrinsics.h(symbology, "symbology");
        this.f17899a.setSymbologyEnabled(symbology, enabled);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public boolean getCachingEnabled() {
        return this.f17899a.getShouldEnableCaching();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @NotNull
    public Set<Symbology> getEnabledSymbologies() {
        HashSet<Symbology> _0 = this.f17899a.getEnabledSymbologies();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @NotNull
    public BarcodeFilterSettings getFilterSettings() {
        NativeBarcodeFilterSettings _0 = this.f17899a.getFilterSettings();
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeBarcodeFilterSettings.class);
        Intrinsics.g(_0, "_0");
        return (BarcodeFilterSettings) proxyCache.getOrPut(kClassB, null, _0, new g(_0));
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public boolean getHapticsEnabled() {
        return this.f17899a.getHapticEnabled();
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public boolean getSoundEnabled() {
        return this.f17899a.getSoundEnabled();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @NotNull
    public SymbologySettings getSymbologySettings(@NotNull Symbology symbology) {
        Intrinsics.h(symbology, "symbology");
        NativeSymbologySettings _0 = this.f17899a.getSymbologySettings(symbology);
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeSymbologySettings.class);
        Intrinsics.g(_0, "_0");
        return (SymbologySettings) proxyCache.getOrPut(kClassB, null, _0, new h(_0));
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public void setArucoDictionary(@NotNull ArucoDictionary dictionary) {
        Intrinsics.h(dictionary, "dictionary");
        NativeArucoDictionary f17600a = dictionary.getF17600a();
        this.proxyCache.put(Reflection.f24268a.b(NativeArucoDictionary.class), null, f17600a, dictionary);
        this.f17899a.setArucoDictionary(f17600a);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public void setCachingEnabled(boolean z) {
        this.f17899a.setShouldEnableCaching(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public void setFilterSettings(@NotNull BarcodeFilterSettings p0) {
        Intrinsics.h(p0, "p0");
        NativeBarcodeFilterSettings f17645a = p0.getF17645a();
        this.proxyCache.put(Reflection.f24268a.b(NativeBarcodeFilterSettings.class), null, f17645a, p0);
        this.f17899a.setFilterSettings(f17645a);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public void setHapticsEnabled(boolean z) {
        this.f17899a.setHapticEnabled(z);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public void setSoundEnabled(boolean z) {
        this.f17899a.setSoundEnabled(z);
    }

    public /* synthetic */ BarcodePickSettingsProxyAdapter(NativeBarcodePickSettings nativeBarcodePickSettings, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodePickSettings, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
