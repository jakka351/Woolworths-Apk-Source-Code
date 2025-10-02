package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettings;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\b\u0010\u001b\u001a\u00020\u001cH'J\u0016\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH'J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000eH'J\u0018\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0003H'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00158gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettingsProxy;", "", "<set-?>", "", "disableModeWhenCaptureListCompleted", "getDisableModeWhenCaptureListCompleted", "()Z", "setDisableModeWhenCaptureListCompleted", "(Z)V", "enableUnrecognizedBarcodeDetection", "getEnableUnrecognizedBarcodeDetection", "setEnableUnrecognizedBarcodeDetection", "enabledSymbologies", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getEnabledSymbologies", "()Ljava/util/Set;", "expectsOnlyUniqueBarcodes", "getExpectsOnlyUniqueBarcodes", "setExpectsOnlyUniqueBarcodes", "filterSettings", "Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "getFilterSettings", "()Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "mappingEnabled", "getMappingEnabled", "setMappingEnabled", "_impl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountSettings;", "enableSymbologies", "", "symbologies", "getSymbologySettings", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "symbology", "setSymbologyEnabled", "enabled", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeCountSettings.class)
/* loaded from: classes6.dex */
public interface BarcodeCountSettingsProxy {
    @NativeImpl
    @NotNull
    NativeBarcodeCountSettings _impl();

    @ProxyFunction
    void enableSymbologies(@NotNull Set<? extends Symbology> symbologies);

    @ProxyFunction(nativeName = "shouldDisableModeWhenCaptureListCompleted", property = "disableModeWhenCaptureListCompleted")
    boolean getDisableModeWhenCaptureListCompleted();

    @ProxyFunction(nativeName = "getEnableUnrecognizedBarcodeDetection", property = "enableUnrecognizedBarcodeDetection")
    boolean getEnableUnrecognizedBarcodeDetection();

    @ProxyFunction(nativeName = "getEnabledSymbologies", property = "enabledSymbologies")
    @NotNull
    Set<Symbology> getEnabledSymbologies();

    @ProxyFunction(nativeName = "expectsOnlyUniqueBarcodes", property = "expectsOnlyUniqueBarcodes")
    boolean getExpectsOnlyUniqueBarcodes();

    @ProxyFunction(nativeName = "getFilterSettings", property = "filterSettings")
    @NotNull
    BarcodeFilterSettings getFilterSettings();

    @ProxyFunction(nativeName = "getMappingEnabled", property = "mappingEnabled")
    boolean getMappingEnabled();

    @ProxyFunction
    @NotNull
    SymbologySettings getSymbologySettings(@NotNull Symbology symbology);

    @ProxyFunction(nativeName = "setShouldDisableModeWhenCaptureListCompleted", property = "disableModeWhenCaptureListCompleted")
    void setDisableModeWhenCaptureListCompleted(boolean z);

    @ProxyFunction(nativeName = "setEnableUnrecognizedBarcodeDetection", property = "enableUnrecognizedBarcodeDetection")
    void setEnableUnrecognizedBarcodeDetection(boolean z);

    @ProxyFunction(nativeName = "setExpectsOnlyUniqueBarcodes", property = "expectsOnlyUniqueBarcodes")
    void setExpectsOnlyUniqueBarcodes(boolean z);

    @ProxyFunction(nativeName = "setMappingEnabled", property = "mappingEnabled")
    void setMappingEnabled(boolean z);

    @ProxyFunction
    void setSymbologyEnabled(@NotNull Symbology symbology, boolean enabled);
}
