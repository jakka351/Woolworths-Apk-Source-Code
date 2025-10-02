package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings;
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

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\u000e\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016R\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010 \u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR$\u0010#\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001c¨\u0006'"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettingsProxyAdapter;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettingsProxy;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSettings;", "_impl", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbology", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "", "enabled", "", "enableSymbology", "", "symbologies", "enableSymbologies", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "p0", "getSingleBarcodeAutoDetection", "()Z", "setSingleBarcodeAutoDetection", "(Z)V", "singleBarcodeAutoDetection", "getTapGestureForSelectionEnabled", "setTapGestureForSelectionEnabled", "tapGestureForSelectionEnabled", "getSwipeGesturesEnabled", "setSwipeGesturesEnabled", "swipeGesturesEnabled", "_NativeBarcodeSelectionSettings", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionSettingsProxyAdapter implements BarcodeSelectionSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeSelectionSettings f18032a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeSelectionSettingsProxyAdapter(@NotNull NativeBarcodeSelectionSettings _NativeBarcodeSelectionSettings, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeSelectionSettings, "_NativeBarcodeSelectionSettings");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18032a = _NativeBarcodeSelectionSettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeSelectionSettings getF18032a() {
        return this.f18032a;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    public void enableSymbologies(@NotNull Set<? extends Symbology> symbologies) {
        Intrinsics.h(symbologies, "symbologies");
        this.f18032a.enableSymbologies(BarcodeNativeTypeFactory.INSTANCE.convertSymbologySetToHashSet(symbologies));
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    public void enableSymbology(@NotNull Symbology symbology, boolean enabled) {
        Intrinsics.h(symbology, "symbology");
        this.f18032a.setSymbologyEnabled(symbology, enabled);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @NotNull
    public Set<Symbology> getEnabledSymbologies() {
        HashSet<Symbology> _0 = this.f18032a.getEnabledSymbologies();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    public boolean getSingleBarcodeAutoDetection() {
        return this.f18032a.getSingleBarcodeAutoDetectionEnabled();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    public boolean getSwipeGesturesEnabled() {
        return this.f18032a.getSwipeGesturesEnabled();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @NotNull
    public SymbologySettings getSymbologySettings(@NotNull Symbology symbology) {
        Intrinsics.h(symbology, "symbology");
        NativeSymbologySettings _0 = this.f18032a.getSymbologySettings(symbology);
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeSymbologySettings.class);
        Intrinsics.g(_0, "_0");
        return (SymbologySettings) proxyCache.getOrPut(kClassB, null, _0, new G(_0));
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    public boolean getTapGestureForSelectionEnabled() {
        return this.f18032a.getTapGestureForSelectionEnabled();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    public void setSingleBarcodeAutoDetection(boolean z) {
        this.f18032a.setSingleBarcodeAutoDetectionEnabled(z);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    public void setSwipeGesturesEnabled(boolean z) {
        this.f18032a.setSwipeGesturesEnabled(z);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    public void setTapGestureForSelectionEnabled(boolean z) {
        this.f18032a.setTapGestureForSelectionEnabled(z);
    }

    public /* synthetic */ BarcodeSelectionSettingsProxyAdapter(NativeBarcodeSelectionSettings nativeBarcodeSelectionSettings, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeSelectionSettings, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
