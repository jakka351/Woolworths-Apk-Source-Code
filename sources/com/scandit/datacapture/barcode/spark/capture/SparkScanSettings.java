package com.scandit.datacapture.barcode.spark.capture;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.CapturePreset;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.core.area.LocationSelection;
import com.scandit.datacapture.core.area.RadiusLocationSelection;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.internal.sdk.utils.TypeConverter;
import com.scandit.datacapture.core.source.BatterySavingMode;
import com.scandit.datacapture.core.source.ScanIntention;
import com.scandit.datacapture.core.time.TimeInterval;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 J2\u00020\u0001:\u0001JB\u000f\u0012\u0006\u0010D\u001a\u00020\u0002¢\u0006\u0004\bE\u0010FB\t\b\u0016¢\u0006\u0004\bE\u00105B\u0017\b\u0016\u0012\f\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u0004¢\u0006\u0004\bE\u0010IJ\t\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0017\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0097\u0001J\u0019\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0097\u0001J\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0005H\u0097\u0001J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0015R\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R*\u00106\u001a\u00020\n2\u0006\u0010/\u001a\u00020\n8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b4\u00105\u001a\u0004\b0\u00101\"\u0004\b2\u00103R.\u0010=\u001a\u0004\u0018\u0001072\b\u0010/\u001a\u0004\u0018\u0001078F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b<\u00105\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010C\u001a\u00020>2\u0006\u0010\u0018\u001a\u00020>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006K"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSettings;", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSettingsProxy;", "Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanSettings;", "_impl", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbologies", "", "enableSymbologies", "symbology", "", "enabled", "enableSymbology", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "zoomedIn", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "scanningMode", "_applySettingsForScanningModeAndZoomLevel$scandit_barcode_capture", "(ZLcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;)V", "_applySettingsForScanningModeAndZoomLevel", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "value", "setProperty", "key", "getProperty", "Lcom/scandit/datacapture/core/source/BatterySavingMode;", "b", "Lcom/scandit/datacapture/core/source/BatterySavingMode;", "getBatterySaving", "()Lcom/scandit/datacapture/core/source/BatterySavingMode;", "setBatterySaving", "(Lcom/scandit/datacapture/core/source/BatterySavingMode;)V", "batterySaving", "Lcom/scandit/datacapture/core/source/ScanIntention;", "c", "Lcom/scandit/datacapture/core/source/ScanIntention;", "getScanIntention", "()Lcom/scandit/datacapture/core/source/ScanIntention;", "setScanIntention", "(Lcom/scandit/datacapture/core/source/ScanIntention;)V", "scanIntention", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "<anonymous parameter 0>", "getSingleBarcodeAutoDetection", "()Z", "setSingleBarcodeAutoDetection", "(Z)V", "getSingleBarcodeAutoDetection$annotations", "()V", "singleBarcodeAutoDetection", "Lcom/scandit/datacapture/core/area/LocationSelection;", "getLocationSelection", "()Lcom/scandit/datacapture/core/area/LocationSelection;", "setLocationSelection", "(Lcom/scandit/datacapture/core/area/LocationSelection;)V", "getLocationSelection$annotations", "locationSelection", "Lcom/scandit/datacapture/core/time/TimeInterval;", "getCodeDuplicateFilter", "()Lcom/scandit/datacapture/core/time/TimeInterval;", "setCodeDuplicateFilter", "(Lcom/scandit/datacapture/core/time/TimeInterval;)V", "codeDuplicateFilter", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanSettings;)V", "Lcom/scandit/datacapture/barcode/data/CapturePreset;", "capturePresets", "(Ljava/util/Set;)V", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SparkScanSettings implements SparkScanSettingsProxy {
    private static final RadiusLocationSelection d = new RadiusLocationSelection(new FloatWithUnit(0.2f, MeasureUnit.FRACTION));

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SparkScanSettingsProxyAdapter f18088a;

    /* renamed from: b, reason: from kotlin metadata */
    private BatterySavingMode batterySaving;

    /* renamed from: c, reason: from kotlin metadata */
    private ScanIntention scanIntention;

    public SparkScanSettings(@NotNull NativeSparkScanSettings impl) {
        Intrinsics.h(impl, "impl");
        this.f18088a = new SparkScanSettingsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.batterySaving = BatterySavingMode.AUTO;
        ScanIntention scanIntention = getF18089a().getScanIntention();
        Intrinsics.g(scanIntention, "_impl().scanIntention");
        this.scanIntention = scanIntention;
        setCodeDuplicateFilter(TimeInterval.INSTANCE.millis(1000L));
    }

    @Deprecated
    public static /* synthetic */ void getLocationSelection$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getSingleBarcodeAutoDetection$annotations() {
    }

    public final /* synthetic */ void _applySettingsForScanningModeAndZoomLevel$scandit_barcode_capture(boolean zoomedIn, SparkScanScanningMode scanningMode) {
        Intrinsics.h(scanningMode, "scanningMode");
        getF18089a().updateForTargetModeEnabledAndZoomedIn(scanningMode instanceof SparkScanScanningMode.Target, zoomedIn, this.scanIntention);
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSettingsProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeSparkScanSettings getF18089a() {
        return this.f18088a.getF18089a();
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSettingsProxy
    @ProxyFunction
    public void enableSymbologies(@NotNull Set<? extends Symbology> symbologies) {
        Intrinsics.h(symbologies, "symbologies");
        this.f18088a.enableSymbologies(symbologies);
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSettingsProxy
    @ProxyFunction(nativeName = "setSymbologyEnabled")
    public void enableSymbology(@NotNull Symbology symbology, boolean enabled) {
        Intrinsics.h(symbology, "symbology");
        this.f18088a.enableSymbology(symbology, enabled);
    }

    @NotNull
    public final BatterySavingMode getBatterySaving() {
        return this.batterySaving;
    }

    @NotNull
    public final TimeInterval getCodeDuplicateFilter() {
        return TimeInterval.INSTANCE.millis(getF18089a().getCodeDuplicateFilterMilliseconds());
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSettingsProxy
    @ProxyFunction(property = "enabledSymbologies")
    @NotNull
    public Set<Symbology> getEnabledSymbologies() {
        return this.f18088a.getEnabledSymbologies();
    }

    @Nullable
    public final LocationSelection getLocationSelection() {
        return d;
    }

    @NotNull
    public final Object getProperty(@NotNull String key) {
        Intrinsics.h(key, "key");
        return Integer.valueOf(getF18089a().getProperty(key));
    }

    @NotNull
    public final ScanIntention getScanIntention() {
        return this.scanIntention;
    }

    public final boolean getSingleBarcodeAutoDetection() {
        return false;
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSettingsProxy
    @ProxyFunction
    @NotNull
    public SymbologySettings getSymbologySettings(@NotNull Symbology symbology) {
        Intrinsics.h(symbology, "symbology");
        return this.f18088a.getSymbologySettings(symbology);
    }

    public final void setBatterySaving(@NotNull BatterySavingMode batterySavingMode) {
        Intrinsics.h(batterySavingMode, "<set-?>");
        this.batterySaving = batterySavingMode;
    }

    public final void setCodeDuplicateFilter(@NotNull TimeInterval value) {
        Intrinsics.h(value, "value");
        getF18089a().setCodeDuplicateFilterMilliseconds((int) value.asMillis());
    }

    public final void setLocationSelection(@Nullable LocationSelection locationSelection) {
    }

    public final void setProperty(@NotNull String name, @NotNull Object value) {
        Intrinsics.h(name, "name");
        Intrinsics.h(value, "value");
        if (value instanceof Float) {
            getF18089a().setFloatProperty(name, ((Number) value).floatValue());
            return;
        }
        if (value instanceof String) {
            getF18089a().setStringProperty(name, (String) value);
            return;
        }
        Integer numIntFromAny = TypeConverter.INSTANCE.intFromAny(value);
        if (numIntFromAny != null) {
            getF18089a().setProperty(name, numIntFromAny.intValue());
        }
    }

    public final void setScanIntention(@NotNull ScanIntention scanIntention) {
        Intrinsics.h(scanIntention, "<set-?>");
        this.scanIntention = scanIntention;
    }

    public final void setSingleBarcodeAutoDetection(boolean z) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SparkScanSettings() {
        NativeSparkScanSettings nativeSparkScanSettingsCreate = NativeSparkScanSettings.create();
        Intrinsics.g(nativeSparkScanSettingsCreate, "create()");
        this(nativeSparkScanSettingsCreate);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SparkScanSettings(@NotNull Set<? extends CapturePreset> capturePresets) {
        Intrinsics.h(capturePresets, "capturePresets");
        NativeSparkScanSettings nativeSparkScanSettingsCreateWithPresets = NativeSparkScanSettings.createWithPresets(CollectionsKt.E0(capturePresets));
        Intrinsics.g(nativeSparkScanSettingsCreateWithPresets, "createWithPresets(capturePresets.toHashSet())");
        this(nativeSparkScanSettingsCreateWithPresets);
    }
}
