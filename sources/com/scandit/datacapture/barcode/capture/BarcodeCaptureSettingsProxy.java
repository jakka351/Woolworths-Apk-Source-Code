package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.data.ArucoDictionary;
import com.scandit.datacapture.barcode.data.CompositeType;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings;
import com.scandit.datacapture.core.source.BatterySavingMode;
import com.scandit.datacapture.core.source.ScanIntention;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.EnumSet;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u001d\u001a\u00020\u001eH'J\u0016\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH'J\u0016\u0010\u001f\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H'J\u0018\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&H'J\u0010\u0010'\u001a\u00020(2\u0006\u0010$\u001a\u00020\u0014H'J\u0010\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020+H'R*\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX§\u000e¢\u0006\u0012\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR0\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00178g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettingsProxy;", "", "<set-?>", "Lcom/scandit/datacapture/core/source/BatterySavingMode;", "batterySavingMode", "getBatterySavingMode$annotations", "()V", "getBatterySavingMode", "()Lcom/scandit/datacapture/core/source/BatterySavingMode;", "setBatterySavingMode", "(Lcom/scandit/datacapture/core/source/BatterySavingMode;)V", "Ljava/util/EnumSet;", "Lcom/scandit/datacapture/barcode/data/CompositeType;", "enabledCompositeTypes", "getEnabledCompositeTypes", "()Ljava/util/EnumSet;", "setEnabledCompositeTypes", "(Ljava/util/EnumSet;)V", "enabledSymbologies", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getEnabledSymbologies", "()Ljava/util/Set;", "Lcom/scandit/datacapture/core/source/ScanIntention;", "scanIntention", "getScanIntention", "()Lcom/scandit/datacapture/core/source/ScanIntention;", "setScanIntention", "(Lcom/scandit/datacapture/core/source/ScanIntention;)V", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;", "enableSymbologies", "", "compositeTypes", "symbologies", "enableSymbology", "symbology", "enabled", "", "getSymbologySettings", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "setArucoDictionary", "dictionary", "Lcom/scandit/datacapture/barcode/data/ArucoDictionary;", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeCaptureSettings.class)
/* loaded from: classes6.dex */
public interface BarcodeCaptureSettingsProxy {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static /* synthetic */ void getBatterySavingMode$annotations() {
        }
    }

    @NativeImpl
    @NotNull
    NativeBarcodeCaptureSettings _impl();

    @ProxyFunction(nativeName = "enableSymbologiesForCompositeTypes")
    void enableSymbologies(@NotNull EnumSet<CompositeType> compositeTypes);

    @ProxyFunction
    void enableSymbologies(@NotNull Set<? extends Symbology> symbologies);

    @ProxyFunction(nativeName = "setSymbologyEnabled")
    void enableSymbology(@NotNull Symbology symbology, boolean enabled);

    @ProxyFunction(nativeName = "getBatterySavingMode", property = "batterySavingMode")
    @NotNull
    BatterySavingMode getBatterySavingMode();

    @ProxyFunction(nativeName = "getEnabledCompositeTypesBits", property = "enabledCompositeTypes")
    @NotNull
    EnumSet<CompositeType> getEnabledCompositeTypes();

    @ProxyFunction(property = "enabledSymbologies")
    @NotNull
    Set<Symbology> getEnabledSymbologies();

    @ProxyFunction(nativeName = "getScanIntention", property = "scanIntention")
    @NotNull
    ScanIntention getScanIntention();

    @ProxyFunction
    @NotNull
    SymbologySettings getSymbologySettings(@NotNull Symbology symbology);

    @ProxyFunction
    void setArucoDictionary(@NotNull ArucoDictionary dictionary);

    @ProxyFunction(nativeName = "setBatterySavingMode", property = "batterySavingMode")
    void setBatterySavingMode(@NotNull BatterySavingMode batterySavingMode);

    @ProxyFunction(nativeName = "setEnabledCompositeTypesBits", property = "enabledCompositeTypes")
    void setEnabledCompositeTypes(@NotNull EnumSet<CompositeType> enumSet);

    @ProxyFunction(nativeName = "setScanIntention", property = "scanIntention")
    void setScanIntention(@NotNull ScanIntention scanIntention);
}
