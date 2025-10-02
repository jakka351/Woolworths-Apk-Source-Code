package com.scandit.datacapture.barcode.count.capture;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettings;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.utils.TypeConverter;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0011\b\u0000\u0012\u0006\u0010.\u001a\u00020\u0002¢\u0006\u0004\b/\u00100B\t\b\u0016¢\u0006\u0004\b/\u00101J\t\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0017\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0097\u0001J\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0097\u0001J\u0019\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0097\u0001J\u0016\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fR$\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00048WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR$\u0010#\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u0014\u0010'\u001a\u00020$8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R$\u0010*\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R$\u0010-\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019¨\u00063"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettingsProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountSettings;", "_impl", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbologies", "", "enableSymbologies", "symbology", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "", "enabled", "setSymbologyEnabled", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "value", "setProperty", "getProperty", "<set-?>", "getDisableModeWhenCaptureListCompleted", "()Z", "setDisableModeWhenCaptureListCompleted", "(Z)V", "disableModeWhenCaptureListCompleted", "getEnableUnrecognizedBarcodeDetection", "setEnableUnrecognizedBarcodeDetection", "enableUnrecognizedBarcodeDetection", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "getExpectsOnlyUniqueBarcodes", "setExpectsOnlyUniqueBarcodes", "expectsOnlyUniqueBarcodes", "Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "getFilterSettings", "()Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "filterSettings", "getMappingEnabled", "setMappingEnabled", "mappingEnabled", "isTapToUncountEnabled$scandit_barcode_capture", "setTapToUncountEnabled$scandit_barcode_capture", "isTapToUncountEnabled", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountSettings;)V", "()V", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BarcodeCountSettings implements BarcodeCountSettingsProxy {

    @NotNull
    public static final String PROPERTY_TRIGGER_AUTO_FOCUS_DELAY = "trigger_auto_focus_delay";

    @NotNull
    public static final String PROPERTY_TRIGGER_AUTO_FOCUS_ON_SHUTTER = "trigger_auto_focus_on_shutter";

    @NotNull
    public static final String PROPERTY_USE_IMU_DATA = "use_imu_data";
    public static final long TRIGGER_AUTO_FOCUS_DELAY_DEFAULT = 100;
    public static final boolean TRIGGER_AUTO_FOCUS_ON_SHUTTER_DEFAULT = true;

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeCountSettingsProxyAdapter f17474a;
    private boolean b;
    private long c;

    public BarcodeCountSettings(@NotNull NativeBarcodeCountSettings impl) {
        Intrinsics.h(impl, "impl");
        this.f17474a = new BarcodeCountSettingsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.b = true;
        this.c = 100L;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeCountSettings getF17475a() {
        return this.f17474a.getF17475a();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction
    public void enableSymbologies(@NotNull Set<? extends Symbology> symbologies) {
        Intrinsics.h(symbologies, "symbologies");
        this.f17474a.enableSymbologies(symbologies);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "shouldDisableModeWhenCaptureListCompleted", property = "disableModeWhenCaptureListCompleted")
    public boolean getDisableModeWhenCaptureListCompleted() {
        return this.f17474a.getDisableModeWhenCaptureListCompleted();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "getEnableUnrecognizedBarcodeDetection", property = "enableUnrecognizedBarcodeDetection")
    public boolean getEnableUnrecognizedBarcodeDetection() {
        return this.f17474a.getEnableUnrecognizedBarcodeDetection();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "getEnabledSymbologies", property = "enabledSymbologies")
    @NotNull
    public Set<Symbology> getEnabledSymbologies() {
        return this.f17474a.getEnabledSymbologies();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "expectsOnlyUniqueBarcodes", property = "expectsOnlyUniqueBarcodes")
    public boolean getExpectsOnlyUniqueBarcodes() {
        return this.f17474a.getExpectsOnlyUniqueBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "getFilterSettings", property = "filterSettings")
    @NotNull
    public BarcodeFilterSettings getFilterSettings() {
        return this.f17474a.getFilterSettings();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "getMappingEnabled", property = "mappingEnabled")
    public boolean getMappingEnabled() {
        return this.f17474a.getMappingEnabled();
    }

    @NotNull
    public final Object getProperty(@NotNull String name) {
        Intrinsics.h(name, "name");
        int iHashCode = name.hashCode();
        if (iHashCode != -1145110768) {
            if (iHashCode != -371273613) {
                if (iHashCode == 1444281501 && name.equals(PROPERTY_TRIGGER_AUTO_FOCUS_ON_SHUTTER)) {
                    return Boolean.valueOf(this.b);
                }
            } else if (name.equals(PROPERTY_TRIGGER_AUTO_FOCUS_DELAY)) {
                return Long.valueOf(this.c);
            }
        } else if (name.equals(PROPERTY_USE_IMU_DATA)) {
            return Boolean.valueOf(getF17475a().getShouldUseIMUData());
        }
        return Integer.valueOf(getF17475a().getProperty(name));
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction
    @NotNull
    public SymbologySettings getSymbologySettings(@NotNull Symbology symbology) {
        Intrinsics.h(symbology, "symbology");
        return this.f17474a.getSymbologySettings(symbology);
    }

    public final boolean isTapToUncountEnabled$scandit_barcode_capture() {
        return getF17475a().getIsTapToUncountEnabled();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "setShouldDisableModeWhenCaptureListCompleted", property = "disableModeWhenCaptureListCompleted")
    public void setDisableModeWhenCaptureListCompleted(boolean z) {
        this.f17474a.setDisableModeWhenCaptureListCompleted(z);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "setEnableUnrecognizedBarcodeDetection", property = "enableUnrecognizedBarcodeDetection")
    public void setEnableUnrecognizedBarcodeDetection(boolean z) {
        this.f17474a.setEnableUnrecognizedBarcodeDetection(z);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "setExpectsOnlyUniqueBarcodes", property = "expectsOnlyUniqueBarcodes")
    public void setExpectsOnlyUniqueBarcodes(boolean z) {
        this.f17474a.setExpectsOnlyUniqueBarcodes(z);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "setMappingEnabled", property = "mappingEnabled")
    public void setMappingEnabled(boolean z) {
        this.f17474a.setMappingEnabled(z);
    }

    public final void setProperty(@NotNull String name, @NotNull Object value) {
        Intrinsics.h(name, "name");
        Intrinsics.h(value, "value");
        int iHashCode = name.hashCode();
        if (iHashCode != -1145110768) {
            if (iHashCode != -371273613) {
                if (iHashCode == 1444281501 && name.equals(PROPERTY_TRIGGER_AUTO_FOCUS_ON_SHUTTER)) {
                    Boolean boolBooleanFromAny = TypeConverter.INSTANCE.booleanFromAny(value);
                    if (boolBooleanFromAny != null) {
                        this.b = boolBooleanFromAny.booleanValue();
                        return;
                    }
                    return;
                }
            } else if (name.equals(PROPERTY_TRIGGER_AUTO_FOCUS_DELAY)) {
                Long lLongFromAny = TypeConverter.INSTANCE.longFromAny(value);
                if (lLongFromAny != null) {
                    this.c = lLongFromAny.longValue();
                    return;
                }
                return;
            }
        } else if (name.equals(PROPERTY_USE_IMU_DATA)) {
            Boolean boolBooleanFromAny2 = TypeConverter.INSTANCE.booleanFromAny(value);
            if (boolBooleanFromAny2 != null) {
                getF17475a().setShouldUseIMUData(boolBooleanFromAny2.booleanValue());
                return;
            }
            return;
        }
        Integer numIntFromAny = TypeConverter.INSTANCE.intFromAny(value);
        if (numIntFromAny != null) {
            getF17475a().setProperty(name, numIntFromAny.intValue());
        }
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction
    public void setSymbologyEnabled(@NotNull Symbology symbology, boolean enabled) {
        Intrinsics.h(symbology, "symbology");
        this.f17474a.setSymbologyEnabled(symbology, enabled);
    }

    public final void setTapToUncountEnabled$scandit_barcode_capture(boolean z) {
        getF17475a().setIsTapToUncountEnabled(z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeCountSettings() {
        NativeBarcodeCountSettings nativeBarcodeCountSettingsCreate = NativeBarcodeCountSettings.create();
        Intrinsics.g(nativeBarcodeCountSettingsCreate, "create()");
        this(nativeBarcodeCountSettingsCreate);
    }
}
