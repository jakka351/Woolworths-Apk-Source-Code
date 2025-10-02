package com.scandit.datacapture.barcode.find.capture;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSettings;
import com.scandit.datacapture.core.internal.sdk.utils.TypeConverter;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\t\b\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0017\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0097\u0001J\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0097\u0001J\u0019\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0097\u0001J\u0016\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettingsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/find/capture/NativeBarcodeFindSettings;", "_impl", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbologies", "", "enableSymbologies", "symbology", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "", "enabled", "setSymbologyEnabled", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "value", "setProperty", "getProperty", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "<init>", "()V", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BarcodeFindSettings implements BarcodeFindSettingsProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeFindSettingsProxyAdapter f17662a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings$Companion;", "", "", "jsonData", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;", "fromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BarcodeFindSettings fromJson(@NotNull String jsonData) {
            Intrinsics.h(jsonData, "jsonData");
            NativeBarcodeFindSettings nativeBarcodeFindSettingsFromJson = NativeBarcodeFindSettings.fromJson(new JsonValue(jsonData).getF18778a());
            Intrinsics.g(nativeBarcodeFindSettingsFromJson, "fromJson(JsonValue(jsonData)._impl())");
            return new BarcodeFindSettings(nativeBarcodeFindSettingsFromJson, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ BarcodeFindSettings(NativeBarcodeFindSettings nativeBarcodeFindSettings, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeFindSettings);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeFindSettings fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindSettingsProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeFindSettings getF17663a() {
        return this.f17662a.getF17663a();
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindSettingsProxy
    @ProxyFunction
    public void enableSymbologies(@NotNull Set<? extends Symbology> symbologies) {
        Intrinsics.h(symbologies, "symbologies");
        this.f17662a.enableSymbologies(symbologies);
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindSettingsProxy
    @ProxyFunction(property = "enabledSymbologies")
    @NotNull
    public Set<Symbology> getEnabledSymbologies() {
        return this.f17662a.getEnabledSymbologies();
    }

    @Nullable
    public final Object getProperty(@NotNull String name) {
        Intrinsics.h(name, "name");
        return Integer.valueOf(getF17663a().getProperty(name));
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindSettingsProxy
    @ProxyFunction
    @NotNull
    public SymbologySettings getSymbologySettings(@NotNull Symbology symbology) {
        Intrinsics.h(symbology, "symbology");
        return this.f17662a.getSymbologySettings(symbology);
    }

    public final void setProperty(@NotNull String name, @NotNull Object value) {
        Intrinsics.h(name, "name");
        Intrinsics.h(value, "value");
        Integer numIntFromAny = TypeConverter.INSTANCE.intFromAny(value);
        if (numIntFromAny != null) {
            getF17663a().setProperty(name, numIntFromAny.intValue());
        }
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindSettingsProxy
    @ProxyFunction
    public void setSymbologyEnabled(@NotNull Symbology symbology, boolean enabled) {
        Intrinsics.h(symbology, "symbology");
        this.f17662a.setSymbologyEnabled(symbology, enabled);
    }

    private BarcodeFindSettings(NativeBarcodeFindSettings nativeBarcodeFindSettings) {
        this.f17662a = new BarcodeFindSettingsProxyAdapter(nativeBarcodeFindSettings, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeFindSettings() {
        NativeBarcodeFindSettings nativeBarcodeFindSettingsCreate = NativeBarcodeFindSettings.create();
        Intrinsics.g(nativeBarcodeFindSettingsCreate, "create()");
        this(nativeBarcodeFindSettingsCreate);
    }
}
