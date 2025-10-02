package com.scandit.datacapture.barcode.filter.capture;

import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016RH\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\n0\u00182\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\n0\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010'\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#¨\u0006+"}, d2 = {"Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettingsProxyAdapter;", "Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettingsProxy;", "Lcom/scandit/datacapture/barcode/filter/capture/NativeBarcodeFilterSettings;", "_impl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "p0", "getExcludedSymbologies", "()Ljava/util/Set;", "setExcludedSymbologies", "(Ljava/util/Set;)V", "excludedSymbologies", "", "getExcludedCodesRegex", "()Ljava/lang/String;", "setExcludedCodesRegex", "(Ljava/lang/String;)V", "excludedCodesRegex", "", "", "getExcludedSymbolCounts", "()Ljava/util/Map;", "setExcludedSymbolCounts", "(Ljava/util/Map;)V", "excludedSymbolCounts", "", "getExcludeEan13", "()Z", "setExcludeEan13", "(Z)V", "excludeEan13", "getExcludeUpca", "setExcludeUpca", "excludeUpca", "_NativeBarcodeFilterSettings", "<init>", "(Lcom/scandit/datacapture/barcode/filter/capture/NativeBarcodeFilterSettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeFilterSettingsProxyAdapter implements BarcodeFilterSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeFilterSettings f17645a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeFilterSettingsProxyAdapter(@NotNull NativeBarcodeFilterSettings _NativeBarcodeFilterSettings, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeFilterSettings, "_NativeBarcodeFilterSettings");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17645a = _NativeBarcodeFilterSettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeFilterSettings getF17645a() {
        return this.f17645a;
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    public boolean getExcludeEan13() {
        return this.f17645a.isExcludeEan13();
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    public boolean getExcludeUpca() {
        return this.f17645a.isExcludeUpca();
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    @NotNull
    public String getExcludedCodesRegex() {
        String _0 = this.f17645a.getExcludedCodesRegex();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    @NotNull
    public Map<Symbology, Set<Short>> getExcludedSymbolCounts() {
        HashMap<Symbology, HashSet<Short>> _0 = this.f17645a.getExcludedSymbolCounts();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convertMapOfSymbologyToSetOfInt(_0);
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    @NotNull
    public Set<Symbology> getExcludedSymbologies() {
        HashSet<Symbology> _0 = this.f17645a.getExcludedSymbologies();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    public void setExcludeEan13(boolean z) {
        this.f17645a.setExcludeEan13(z);
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    public void setExcludeUpca(boolean z) {
        this.f17645a.setExcludeUpca(z);
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    public void setExcludedCodesRegex(@NotNull String p0) {
        Intrinsics.h(p0, "p0");
        this.f17645a.setExcludedCodesRegex(p0);
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    public void setExcludedSymbolCounts(@NotNull Map<Symbology, ? extends Set<Short>> p0) {
        Intrinsics.h(p0, "p0");
        this.f17645a.setExcludedSymbolCounts(BarcodeNativeTypeFactory.INSTANCE.convert(p0));
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    public void setExcludedSymbologies(@NotNull Set<? extends Symbology> p0) {
        Intrinsics.h(p0, "p0");
        this.f17645a.setExcludedSymbologies(BarcodeNativeTypeFactory.INSTANCE.convertSymbologySetToHashSet(p0));
    }

    public /* synthetic */ BarcodeFilterSettingsProxyAdapter(NativeBarcodeFilterSettings nativeBarcodeFilterSettings, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeFilterSettings, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
