package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.data.Checksum;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.EnumSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010#\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0016H\u0097\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u0018H\u0097\u0001J\t\u0010)\u001a\u00020\u0016H\u0097\u0001R0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\nR$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020 8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006*"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "Lcom/scandit/datacapture/barcode/capture/SymbologySettingsProxy;", "impl", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeSymbologySettings;", "(Lcom/scandit/datacapture/barcode/internal/module/capture/NativeSymbologySettings;)V", "<set-?>", "", "", "activeSymbolCounts", "getActiveSymbolCounts", "()Ljava/util/Set;", "setActiveSymbolCounts", "(Ljava/util/Set;)V", "value", "Ljava/util/EnumSet;", "Lcom/scandit/datacapture/barcode/data/Checksum;", "checksums", "getChecksums", "()Ljava/util/EnumSet;", "setChecksums", "(Ljava/util/EnumSet;)V", "enabledExtensions", "", "getEnabledExtensions", "", "isColorInvertedEnabled", "()Z", "setColorInvertedEnabled", "(Z)V", "isEnabled", "setEnabled", "symbology", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getSymbology", "()Lcom/scandit/datacapture/barcode/data/Symbology;", "_impl", "isExtensionEnabled", "extension", "setExtensionEnabled", "", "enabled", "toJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Mockable
/* loaded from: classes6.dex */
public final class SymbologySettings implements SymbologySettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SymbologySettingsProxyAdapter f17434a;

    public SymbologySettings(@NotNull NativeSymbologySettings impl) {
        Intrinsics.h(impl, "impl");
        this.f17434a = new SymbologySettingsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeSymbologySettings getF17435a() {
        return this.f17434a.getF17435a();
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(property = "activeSymbolCounts")
    @NotNull
    public Set<Short> getActiveSymbolCounts() {
        return this.f17434a.getActiveSymbolCounts();
    }

    @NotNull
    public final EnumSet<Checksum> getChecksums() {
        EnumSet<Checksum> checksumBits = getF17435a().getChecksumBits();
        Intrinsics.g(checksumBits, "_impl().checksumBits");
        return checksumBits;
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(property = "enabledExtensions")
    @NotNull
    public Set<String> getEnabledExtensions() {
        return this.f17434a.getEnabledExtensions();
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(property = "symbology")
    @NotNull
    public Symbology getSymbology() {
        return this.f17434a.getSymbology();
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(property = "isColorInvertedEnabled")
    public boolean isColorInvertedEnabled() {
        return this.f17434a.isColorInvertedEnabled();
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(property = "isEnabled")
    public boolean isEnabled() {
        return this.f17434a.isEnabled();
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction
    public boolean isExtensionEnabled(@NotNull String extension) {
        Intrinsics.h(extension, "extension");
        return this.f17434a.isExtensionEnabled(extension);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(property = "activeSymbolCounts")
    public void setActiveSymbolCounts(@NotNull Set<Short> set) {
        Intrinsics.h(set, "<set-?>");
        this.f17434a.setActiveSymbolCounts(set);
    }

    public final void setChecksums(@NotNull EnumSet<Checksum> value) {
        Intrinsics.h(value, "value");
        getF17435a().setChecksumBits(value);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(property = "isColorInvertedEnabled")
    public void setColorInvertedEnabled(boolean z) {
        this.f17434a.setColorInvertedEnabled(z);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(property = "isEnabled")
    public void setEnabled(boolean z) {
        this.f17434a.setEnabled(z);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction
    public void setExtensionEnabled(@NotNull String extension, boolean enabled) {
        Intrinsics.h(extension, "extension");
        this.f17434a.setExtensionEnabled(extension, enabled);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(nativeName = "toJson")
    @NotNull
    public String toJson() {
        return this.f17434a.toJson();
    }
}
