package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\b\u0010\u0018\u001a\u00020\u0019H'J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u000bH'J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\rH'J\b\u0010\u001f\u001a\u00020\u000bH'R0\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00158gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/scandit/datacapture/barcode/capture/SymbologySettingsProxy;", "", "<set-?>", "", "", "activeSymbolCounts", "getActiveSymbolCounts", "()Ljava/util/Set;", "setActiveSymbolCounts", "(Ljava/util/Set;)V", "enabledExtensions", "", "getEnabledExtensions", "", "isColorInvertedEnabled", "()Z", "setColorInvertedEnabled", "(Z)V", "isEnabled", "setEnabled", "symbology", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getSymbology", "()Lcom/scandit/datacapture/barcode/data/Symbology;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeSymbologySettings;", "isExtensionEnabled", "extension", "setExtensionEnabled", "", "enabled", "toJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeSymbologySettings.class)
/* loaded from: classes6.dex */
public interface SymbologySettingsProxy {
    @NativeImpl
    @NotNull
    NativeSymbologySettings _impl();

    @ProxyFunction(property = "activeSymbolCounts")
    @NotNull
    Set<Short> getActiveSymbolCounts();

    @ProxyFunction(property = "enabledExtensions")
    @NotNull
    Set<String> getEnabledExtensions();

    @ProxyFunction(property = "symbology")
    @NotNull
    Symbology getSymbology();

    @ProxyFunction(property = "isColorInvertedEnabled")
    boolean isColorInvertedEnabled();

    @ProxyFunction(property = "isEnabled")
    boolean isEnabled();

    @ProxyFunction
    boolean isExtensionEnabled(@NotNull String extension);

    @ProxyFunction(property = "activeSymbolCounts")
    void setActiveSymbolCounts(@NotNull Set<Short> set);

    @ProxyFunction(property = "isColorInvertedEnabled")
    void setColorInvertedEnabled(boolean z);

    @ProxyFunction(property = "isEnabled")
    void setEnabled(boolean z);

    @ProxyFunction
    void setExtensionEnabled(@NotNull String extension, boolean enabled);

    @ProxyFunction(nativeName = "toJson")
    @NotNull
    String toJson();
}
