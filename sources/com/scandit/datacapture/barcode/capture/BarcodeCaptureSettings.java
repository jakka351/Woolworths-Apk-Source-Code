package com.scandit.datacapture.barcode.capture;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scandit.datacapture.barcode.data.ArucoDictionary;
import com.scandit.datacapture.barcode.data.CapturePreset;
import com.scandit.datacapture.barcode.data.CompositeType;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings;
import com.scandit.datacapture.core.area.LocationSelection;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.utils.TypeConverter;
import com.scandit.datacapture.core.source.BatterySavingMode;
import com.scandit.datacapture.core.source.ScanIntention;
import com.scandit.datacapture.core.time.TimeInterval;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.EnumSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 I2\u00020\u0001:\u0001IB\u0011\b\u0000\u0012\u0006\u0010B\u001a\u00020\u0002¢\u0006\u0004\bC\u0010DB\t\b\u0016¢\u0006\u0004\bC\u0010EB\u0017\b\u0016\u0012\f\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\t¢\u0006\u0004\bC\u0010HJ\t\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0017\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0097\u0001J\u0017\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0097\u0001J\u0019\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0097\u0001J\u0011\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\nH\u0097\u0001J\u0011\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0097\u0001J\u000e\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015J\u0016\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0015R$\u0010$\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8W@WX\u0097\u000f¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R0\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\t8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R$\u00102\u001a\u00020-2\u0006\u0010\u001f\u001a\u00020-8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00105\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010!\"\u0004\b4\u0010#R(\u0010;\u001a\u0004\u0018\u0001062\b\u0010\u001a\u001a\u0004\u0018\u0001068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010A\u001a\u00020<2\u0006\u0010\u001a\u001a\u00020<8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006J"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettingsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;", "_impl", "Ljava/util/EnumSet;", "Lcom/scandit/datacapture/barcode/data/CompositeType;", "compositeTypes", "", "enableSymbologies", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbologies", "symbology", "", "enabled", "enableSymbology", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "Lcom/scandit/datacapture/barcode/data/ArucoDictionary;", "dictionary", "setArucoDictionary", "", "jsonData", "updateFromJson", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "value", "setProperty", "key", "getProperty", "Lcom/scandit/datacapture/core/source/BatterySavingMode;", "<set-?>", "getBatterySavingMode", "()Lcom/scandit/datacapture/core/source/BatterySavingMode;", "setBatterySavingMode", "(Lcom/scandit/datacapture/core/source/BatterySavingMode;)V", "batterySavingMode", "getEnabledCompositeTypes", "()Ljava/util/EnumSet;", "setEnabledCompositeTypes", "(Ljava/util/EnumSet;)V", "enabledCompositeTypes", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "Lcom/scandit/datacapture/core/source/ScanIntention;", "getScanIntention", "()Lcom/scandit/datacapture/core/source/ScanIntention;", "setScanIntention", "(Lcom/scandit/datacapture/core/source/ScanIntention;)V", "scanIntention", "getBatterySaving", "setBatterySaving", "batterySaving", "Lcom/scandit/datacapture/core/area/LocationSelection;", "getLocationSelection", "()Lcom/scandit/datacapture/core/area/LocationSelection;", "setLocationSelection", "(Lcom/scandit/datacapture/core/area/LocationSelection;)V", "locationSelection", "Lcom/scandit/datacapture/core/time/TimeInterval;", "getCodeDuplicateFilter", "()Lcom/scandit/datacapture/core/time/TimeInterval;", "setCodeDuplicateFilter", "(Lcom/scandit/datacapture/core/time/TimeInterval;)V", "codeDuplicateFilter", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;)V", "()V", "Lcom/scandit/datacapture/barcode/data/CapturePreset;", "capturePresets", "(Ljava/util/Set;)V", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class BarcodeCaptureSettings implements BarcodeCaptureSettingsProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeCaptureSettingsProxyAdapter f17416a;
    private LocationSelection b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings$Companion;", "", "", "jsonData", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "fromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BarcodeCaptureSettings fromJson(@NotNull String jsonData) {
            Intrinsics.h(jsonData, "jsonData");
            return new BarcodeCaptureDeserializer().settingsFromJson(jsonData);
        }

        private Companion() {
        }
    }

    public BarcodeCaptureSettings(@NotNull NativeBarcodeCaptureSettings impl) {
        Intrinsics.h(impl, "impl");
        this.f17416a = new BarcodeCaptureSettingsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCaptureSettings fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeCaptureSettings getF17417a() {
        return this.f17416a.getF17417a();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction(nativeName = "enableSymbologiesForCompositeTypes")
    public void enableSymbologies(@NotNull EnumSet<CompositeType> compositeTypes) {
        Intrinsics.h(compositeTypes, "compositeTypes");
        this.f17416a.enableSymbologies(compositeTypes);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction(nativeName = "setSymbologyEnabled")
    public void enableSymbology(@NotNull Symbology symbology, boolean enabled) {
        Intrinsics.h(symbology, "symbology");
        this.f17416a.enableSymbology(symbology, enabled);
    }

    @NotNull
    public final BatterySavingMode getBatterySaving() {
        BatterySavingMode batterySavingMode = getF17417a().getBatterySavingMode();
        Intrinsics.g(batterySavingMode, "_impl().batterySavingMode");
        return batterySavingMode;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction(nativeName = "getBatterySavingMode", property = "batterySavingMode")
    @NotNull
    public BatterySavingMode getBatterySavingMode() {
        return this.f17416a.getBatterySavingMode();
    }

    @NotNull
    public final TimeInterval getCodeDuplicateFilter() {
        return TimeInterval.INSTANCE.millis(getF17417a().getCodeDuplicateFilterMilliseconds());
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction(nativeName = "getEnabledCompositeTypesBits", property = "enabledCompositeTypes")
    @NotNull
    public EnumSet<CompositeType> getEnabledCompositeTypes() {
        return this.f17416a.getEnabledCompositeTypes();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction(property = "enabledSymbologies")
    @NotNull
    public Set<Symbology> getEnabledSymbologies() {
        return this.f17416a.getEnabledSymbologies();
    }

    @Nullable
    /* renamed from: getLocationSelection, reason: from getter */
    public final LocationSelection getB() {
        return this.b;
    }

    @NotNull
    public final Object getProperty(@NotNull String key) {
        Intrinsics.h(key, "key");
        return Integer.valueOf(getF17417a().getProperty(key));
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction(nativeName = "getScanIntention", property = "scanIntention")
    @NotNull
    public ScanIntention getScanIntention() {
        return this.f17416a.getScanIntention();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction
    @NotNull
    public SymbologySettings getSymbologySettings(@NotNull Symbology symbology) {
        Intrinsics.h(symbology, "symbology");
        return this.f17416a.getSymbologySettings(symbology);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction
    public void setArucoDictionary(@NotNull ArucoDictionary dictionary) {
        Intrinsics.h(dictionary, "dictionary");
        this.f17416a.setArucoDictionary(dictionary);
    }

    public final void setBatterySaving(@NotNull BatterySavingMode value) {
        Intrinsics.h(value, "value");
        getF17417a().setBatterySavingMode(value);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction(nativeName = "setBatterySavingMode", property = "batterySavingMode")
    public void setBatterySavingMode(@NotNull BatterySavingMode batterySavingMode) {
        Intrinsics.h(batterySavingMode, "<set-?>");
        this.f17416a.setBatterySavingMode(batterySavingMode);
    }

    public final void setCodeDuplicateFilter(@NotNull TimeInterval value) {
        Intrinsics.h(value, "value");
        getF17417a().setCodeDuplicateFilterMilliseconds((int) value.asMillis());
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction(nativeName = "setEnabledCompositeTypesBits", property = "enabledCompositeTypes")
    public void setEnabledCompositeTypes(@NotNull EnumSet<CompositeType> enumSet) {
        Intrinsics.h(enumSet, "<set-?>");
        this.f17416a.setEnabledCompositeTypes(enumSet);
    }

    public final void setLocationSelection(@Nullable LocationSelection locationSelection) {
        this.b = locationSelection;
        getF17417a().setLocationSelection(locationSelection != null ? locationSelection.getC() : null);
    }

    public final void setProperty(@NotNull String name, @NotNull Object value) {
        Intrinsics.h(name, "name");
        Intrinsics.h(value, "value");
        if (value instanceof Float) {
            getF17417a().setFloatProperty(name, ((Number) value).floatValue());
            return;
        }
        if (value instanceof String) {
            getF17417a().setStringProperty(name, (String) value);
            return;
        }
        Integer numIntFromAny = TypeConverter.INSTANCE.intFromAny(value);
        if (numIntFromAny != null) {
            getF17417a().setProperty(name, numIntFromAny.intValue());
        }
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction(nativeName = "setScanIntention", property = "scanIntention")
    public void setScanIntention(@NotNull ScanIntention scanIntention) {
        Intrinsics.h(scanIntention, "<set-?>");
        this.f17416a.setScanIntention(scanIntention);
    }

    public final void updateFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        new BarcodeCaptureDeserializer().updateSettingsFromJson(this, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction
    public void enableSymbologies(@NotNull Set<? extends Symbology> symbologies) {
        Intrinsics.h(symbologies, "symbologies");
        this.f17416a.enableSymbologies(symbologies);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeCaptureSettings() {
        NativeBarcodeCaptureSettings nativeBarcodeCaptureSettingsCreate = NativeBarcodeCaptureSettings.create();
        Intrinsics.g(nativeBarcodeCaptureSettingsCreate, "create()");
        this(nativeBarcodeCaptureSettingsCreate);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeCaptureSettings(@NotNull Set<? extends CapturePreset> capturePresets) {
        Intrinsics.h(capturePresets, "capturePresets");
        NativeBarcodeCaptureSettings nativeBarcodeCaptureSettingsCreateWithPresets = NativeBarcodeCaptureSettings.createWithPresets(CollectionsKt.E0(capturePresets));
        Intrinsics.g(nativeBarcodeCaptureSettingsCreateWithPresets, "createWithPresets(capturePresets.toHashSet())");
        this(nativeBarcodeCaptureSettingsCreateWithPresets);
    }
}
