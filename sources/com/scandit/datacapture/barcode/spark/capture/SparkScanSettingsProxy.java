package com.scandit.datacapture.barcode.spark.capture;

import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH'J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0004H'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSettingsProxy;", "", "enabledSymbologies", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getEnabledSymbologies", "()Ljava/util/Set;", "_impl", "Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanSettings;", "enableSymbologies", "", "symbologies", "enableSymbology", "symbology", "enabled", "", "getSymbologySettings", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeSparkScanSettings.class)
/* loaded from: classes6.dex */
public interface SparkScanSettingsProxy {
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    NativeSparkScanSettings getF18089a();

    @ProxyFunction
    void enableSymbologies(@NotNull Set<? extends Symbology> symbologies);

    @ProxyFunction(nativeName = "setSymbologyEnabled")
    void enableSymbology(@NotNull Symbology symbology, boolean enabled);

    @ProxyFunction(property = "enabledSymbologies")
    @NotNull
    Set<Symbology> getEnabledSymbologies();

    @ProxyFunction
    @NotNull
    SymbologySettings getSymbologySettings(@NotNull Symbology symbology);
}
