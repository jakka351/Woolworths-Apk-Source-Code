package com.scandit.datacapture.barcode.tracking.capture;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scandit.datacapture.barcode.C0619f7;
import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.ArucoDictionary;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTrackingSettings;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeObjectTrackerScenario;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.utils.TypeConverter;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0000\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fB\t\b\u0016¢\u0006\u0004\b\u001e\u0010 J\t\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0017\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0097\u0001J\u0019\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0097\u0001J\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0097\u0001J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0012R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingSettings;", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingSettingsProxy;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/capture/NativeBarcodeTrackingSettings;", "_impl", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbologies", "", "enableSymbologies", "symbology", "", "enabled", "enableSymbology", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "Lcom/scandit/datacapture/barcode/data/ArucoDictionary;", "dictionary", "setArucoDictionary", "", "jsonData", "updateFromJson", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "value", "setProperty", "getProperty", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/tracking/internal/module/capture/NativeBarcodeTrackingSettings;)V", "()V", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BarcodeTrackingSettings implements BarcodeTrackingSettingsProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeTrackingSettingsProxyAdapter f18157a;
    private C0619f7 b;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tH\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingSettings$Companion;", "", "", "jsonData", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingSettings;", "fromJson", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingScenario;", "scenario", "forScenario", "Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeObjectTrackerScenario;", "_forNativeScenario", "FREEZE_INDICATION_LISTENER", "Ljava/lang/String;", "FREEZE_INDICATION_WAIT_TIME", "FREEZE_INDICATOR", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated
        @NotNull
        public final BarcodeTrackingSettings _forNativeScenario(@NotNull NativeObjectTrackerScenario scenario) {
            Intrinsics.h(scenario, "scenario");
            NativeBarcodeTrackingSettings nativeBarcodeTrackingSettingsCreateForScenario = NativeBarcodeTrackingSettings.createForScenario(scenario);
            Intrinsics.g(nativeBarcodeTrackingSettingsCreateForScenario, "createForScenario(scenario)");
            return new BarcodeTrackingSettings(nativeBarcodeTrackingSettingsCreateForScenario);
        }

        @Deprecated
        @JvmStatic
        @NotNull
        public final BarcodeTrackingSettings forScenario(@NotNull BarcodeTrackingScenario scenario) {
            Intrinsics.h(scenario, "scenario");
            NativeBarcodeTrackingSettings nativeBarcodeTrackingSettingsCreateForScenario = NativeBarcodeTrackingSettings.createForScenario(BarcodeTrackingSettingsKt.toNative(scenario));
            Intrinsics.g(nativeBarcodeTrackingSettingsCreateForScenario, "createForScenario(scenario.toNative())");
            return new BarcodeTrackingSettings(nativeBarcodeTrackingSettingsCreateForScenario);
        }

        @JvmStatic
        @NotNull
        public final BarcodeTrackingSettings fromJson(@NotNull String jsonData) {
            Intrinsics.h(jsonData, "jsonData");
            return new BarcodeTrackingDeserializer().settingsFromJson(jsonData);
        }

        private Companion() {
        }
    }

    public BarcodeTrackingSettings(@NotNull NativeBarcodeTrackingSettings impl) {
        Intrinsics.h(impl, "impl");
        this.f18157a = new BarcodeTrackingSettingsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Deprecated
    @JvmStatic
    @NotNull
    public static final BarcodeTrackingSettings forScenario(@NotNull BarcodeTrackingScenario barcodeTrackingScenario) {
        return INSTANCE.forScenario(barcodeTrackingScenario);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeTrackingSettings fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSettingsProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeTrackingSettings getF18158a() {
        return this.f18157a.getF18158a();
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSettingsProxy
    @ProxyFunction
    public void enableSymbologies(@NotNull Set<? extends Symbology> symbologies) {
        Intrinsics.h(symbologies, "symbologies");
        this.f18157a.enableSymbologies(symbologies);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSettingsProxy
    @ProxyFunction(nativeName = "setSymbologyEnabled")
    public void enableSymbology(@NotNull Symbology symbology, boolean enabled) {
        Intrinsics.h(symbology, "symbology");
        this.f18157a.enableSymbology(symbology, enabled);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSettingsProxy
    @ProxyFunction(property = "enabledSymbologies")
    @NotNull
    public Set<Symbology> getEnabledSymbologies() {
        return this.f18157a.getEnabledSymbologies();
    }

    @NotNull
    public final Object getProperty(@NotNull String name) {
        Runnable runnableA;
        Intrinsics.h(name, "name");
        int iHashCode = name.hashCode();
        if (iHashCode != -1372984747) {
            if (iHashCode != -272164569) {
                if (iHashCode == 670080312 && name.equals("freezeIndicator")) {
                    C0619f7 c0619f7 = this.b;
                    if (c0619f7 == null) {
                        return -1;
                    }
                    return c0619f7;
                }
            } else if (name.equals("freezeIndicationListener")) {
                C0619f7 c0619f72 = this.b;
                if (c0619f72 == null || (runnableA = c0619f72.a()) == null) {
                    return -1;
                }
                return runnableA;
            }
        } else if (name.equals("freezeIndicationWaitTime")) {
            C0619f7 c0619f73 = this.b;
            return Integer.valueOf(c0619f73 != null ? (int) c0619f73.b() : -1);
        }
        return Integer.valueOf(getF18158a().getProperty(name));
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSettingsProxy
    @ProxyFunction
    @NotNull
    public SymbologySettings getSymbologySettings(@NotNull Symbology symbology) {
        Intrinsics.h(symbology, "symbology");
        return this.f18157a.getSymbologySettings(symbology);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSettingsProxy
    @ProxyFunction
    public void setArucoDictionary(@NotNull ArucoDictionary dictionary) {
        Intrinsics.h(dictionary, "dictionary");
        this.f18157a.setArucoDictionary(dictionary);
    }

    public final void setProperty(@NotNull String name, @NotNull Object value) {
        Intrinsics.h(name, "name");
        Intrinsics.h(value, "value");
        if (name.equals("freezeIndicationListener") && (value instanceof Runnable)) {
            C0619f7 c0619f7 = this.b;
            if (c0619f7 == null) {
                c0619f7 = new C0619f7();
            }
            c0619f7.a((Runnable) value);
            this.b = c0619f7;
            return;
        }
        if (name.equals("freezeIndicationWaitTime") && (value instanceof Integer)) {
            C0619f7 c0619f72 = this.b;
            if (c0619f72 == null) {
                c0619f72 = new C0619f7();
            }
            c0619f72.a(((Number) value).intValue());
            this.b = c0619f72;
            return;
        }
        Integer numIntFromAny = TypeConverter.INSTANCE.intFromAny(value);
        if (numIntFromAny != null) {
            getF18158a().setProperty(name, numIntFromAny.intValue());
        }
    }

    public final void updateFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        new BarcodeTrackingDeserializer().updateSettingsFromJson(this, jsonData);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeTrackingSettings() {
        NativeBarcodeTrackingSettings nativeBarcodeTrackingSettingsCreate = NativeBarcodeTrackingSettings.create();
        Intrinsics.g(nativeBarcodeTrackingSettingsCreate, "create()");
        this(nativeBarcodeTrackingSettingsCreate);
    }
}
