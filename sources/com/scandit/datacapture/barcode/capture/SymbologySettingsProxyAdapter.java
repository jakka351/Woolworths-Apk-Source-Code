package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\u0010\n\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016R\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR0\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 ¨\u0006)"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/SymbologySettingsProxyAdapter;", "Lcom/scandit/datacapture/barcode/capture/SymbologySettingsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeSymbologySettings;", "_impl", "", "extension", "", "enabled", "", "setExtensionEnabled", "isExtensionEnabled", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getSymbology", "()Lcom/scandit/datacapture/barcode/data/Symbology;", "symbology", "p0", "isEnabled", "()Z", "setEnabled", "(Z)V", "isColorInvertedEnabled", "setColorInvertedEnabled", "", "", "getActiveSymbolCounts", "()Ljava/util/Set;", "setActiveSymbolCounts", "(Ljava/util/Set;)V", "activeSymbolCounts", "getEnabledExtensions", "enabledExtensions", "_NativeSymbologySettings", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/capture/NativeSymbologySettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SymbologySettingsProxyAdapter implements SymbologySettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeSymbologySettings f17435a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public SymbologySettingsProxyAdapter(@NotNull NativeSymbologySettings _NativeSymbologySettings, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeSymbologySettings, "_NativeSymbologySettings");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17435a = _NativeSymbologySettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeSymbologySettings getF17435a() {
        return this.f17435a;
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @NotNull
    public Set<Short> getActiveSymbolCounts() {
        HashSet<Short> _0 = this.f17435a.getActiveSymbolCounts();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @NotNull
    public Set<String> getEnabledExtensions() {
        HashSet<String> _0 = this.f17435a.getEnabledExtensions();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @NotNull
    public Symbology getSymbology() {
        Symbology _0 = this.f17435a.getSymbology();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public boolean isColorInvertedEnabled() {
        return this.f17435a.isColorInvertedEnabled();
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public boolean isEnabled() {
        return this.f17435a.isEnabled();
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public boolean isExtensionEnabled(@NotNull String extension) {
        Intrinsics.h(extension, "extension");
        return this.f17435a.isExtensionEnabled(extension);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public void setActiveSymbolCounts(@NotNull Set<Short> p0) {
        Intrinsics.h(p0, "p0");
        this.f17435a.setActiveSymbolCounts(BarcodeNativeTypeFactory.INSTANCE.convert(p0));
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public void setColorInvertedEnabled(boolean z) {
        this.f17435a.setColorInvertedEnabled(z);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public void setEnabled(boolean z) {
        this.f17435a.setEnabled(z);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public void setExtensionEnabled(@NotNull String extension, boolean enabled) {
        Intrinsics.h(extension, "extension");
        this.f17435a.setExtensionEnabled(extension, enabled);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @NotNull
    public String toJson() {
        String _0 = this.f17435a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ SymbologySettingsProxyAdapter(NativeSymbologySettings nativeSymbologySettings, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeSymbologySettings, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
