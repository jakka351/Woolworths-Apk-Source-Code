package com.scandit.datacapture.barcode.selection.capture;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.CapturePreset;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings;
import com.scandit.datacapture.core.internal.sdk.utils.TypeConverter;
import com.scandit.datacapture.core.time.TimeInterval;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 <2\u00020\u0001:\u0001<B\u0011\b\u0000\u0012\u0006\u00105\u001a\u00020\u0002¢\u0006\u0004\b6\u00107B\t\b\u0016¢\u0006\u0004\b6\u00108B\u0017\b\u0016\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u0004¢\u0006\u0004\b6\u0010;J\t\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0017\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0097\u0001J\u0019\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0097\u0001J\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0005H\u0097\u0001J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fJ\u0016\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000fR*\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00188\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R$\u0010(\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010+\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R$\u0010.\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R$\u00104\u001a\u00020/2\u0006\u0010\u0014\u001a\u00020/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006="}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettingsProxy;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSettings;", "_impl", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbologies", "", "enableSymbologies", "symbology", "", "enabled", "enableSymbology", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "", "jsonData", "updateFromJson", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "value", "setProperty", "key", "getProperty", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionType;", "b", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionType;", "getSelectionType", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionType;", "setSelectionType", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionType;)V", "selectionType", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "<set-?>", "getSingleBarcodeAutoDetection", "()Z", "setSingleBarcodeAutoDetection", "(Z)V", "singleBarcodeAutoDetection", "getSwipeGesturesEnabled", "setSwipeGesturesEnabled", "swipeGesturesEnabled", "getTapGestureForSelectionEnabled", "setTapGestureForSelectionEnabled", "tapGestureForSelectionEnabled", "Lcom/scandit/datacapture/core/time/TimeInterval;", "getCodeDuplicateFilter", "()Lcom/scandit/datacapture/core/time/TimeInterval;", "setCodeDuplicateFilter", "(Lcom/scandit/datacapture/core/time/TimeInterval;)V", "codeDuplicateFilter", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSettings;)V", "()V", "Lcom/scandit/datacapture/barcode/data/CapturePreset;", "capturePresets", "(Ljava/util/Set;)V", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionSettings implements BarcodeSelectionSettingsProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeSelectionSettingsProxyAdapter f18031a;

    /* renamed from: b, reason: from kotlin metadata */
    private BarcodeSelectionType selectionType;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings$Companion;", "", "", "jsonData", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings;", "fromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BarcodeSelectionSettings fromJson(@NotNull String jsonData) {
            Intrinsics.h(jsonData, "jsonData");
            return new BarcodeSelectionDeserializer().settingsFromJson(jsonData);
        }

        private Companion() {
        }
    }

    public BarcodeSelectionSettings(@NotNull NativeBarcodeSelectionSettings impl) {
        Intrinsics.h(impl, "impl");
        this.f18031a = new BarcodeSelectionSettingsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.selectionType = new BarcodeSelectionTapSelection();
        setSelectionType(new BarcodeSelectionTapSelection());
    }

    @JvmStatic
    @NotNull
    public static final BarcodeSelectionSettings fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeSelectionSettings getF18032a() {
        return this.f18031a.getF18032a();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction
    public void enableSymbologies(@NotNull Set<? extends Symbology> symbologies) {
        Intrinsics.h(symbologies, "symbologies");
        this.f18031a.enableSymbologies(symbologies);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction(nativeName = "setSymbologyEnabled")
    public void enableSymbology(@NotNull Symbology symbology, boolean enabled) {
        Intrinsics.h(symbology, "symbology");
        this.f18031a.enableSymbology(symbology, enabled);
    }

    @NotNull
    public final TimeInterval getCodeDuplicateFilter() {
        return TimeInterval.INSTANCE.millis(getF18032a().getCodeDuplicateFilterMilliseconds());
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction(property = "enabledSymbologies")
    @NotNull
    public Set<Symbology> getEnabledSymbologies() {
        return this.f18031a.getEnabledSymbologies();
    }

    @NotNull
    public final Object getProperty(@NotNull String key) {
        Intrinsics.h(key, "key");
        return Integer.valueOf(getF18032a().getProperty(key));
    }

    @NotNull
    public final BarcodeSelectionType getSelectionType() {
        return this.selectionType;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction(nativeName = "getSingleBarcodeAutoDetectionEnabled", property = "singleBarcodeAutoDetection")
    public boolean getSingleBarcodeAutoDetection() {
        return this.f18031a.getSingleBarcodeAutoDetection();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction(nativeName = "getSwipeGesturesEnabled", property = "swipeGesturesEnabled")
    public boolean getSwipeGesturesEnabled() {
        return this.f18031a.getSwipeGesturesEnabled();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction
    @NotNull
    public SymbologySettings getSymbologySettings(@NotNull Symbology symbology) {
        Intrinsics.h(symbology, "symbology");
        return this.f18031a.getSymbologySettings(symbology);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction(nativeName = "getTapGestureForSelectionEnabled", property = "tapGestureForSelectionEnabled")
    public boolean getTapGestureForSelectionEnabled() {
        return this.f18031a.getTapGestureForSelectionEnabled();
    }

    public final void setCodeDuplicateFilter(@NotNull TimeInterval value) {
        Intrinsics.h(value, "value");
        getF18032a().setCodeDuplicateFilterMilliseconds((int) value.asMillis());
    }

    public final void setProperty(@NotNull String name, @NotNull Object value) {
        Intrinsics.h(name, "name");
        Intrinsics.h(value, "value");
        if (value instanceof Float) {
            getF18032a().setFloatProperty(name, ((Number) value).floatValue());
            return;
        }
        if (value instanceof String) {
            getF18032a().setStringProperty(name, (String) value);
            return;
        }
        Integer numIntFromAny = TypeConverter.INSTANCE.intFromAny(value);
        if (numIntFromAny != null) {
            getF18032a().setProperty(name, numIntFromAny.intValue());
        }
    }

    public final void setSelectionType(@NotNull BarcodeSelectionType value) {
        Intrinsics.h(value, "value");
        this.selectionType = value;
        getF18032a().setSelectionType(value.getC());
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction(nativeName = "setSingleBarcodeAutoDetectionEnabled", property = "singleBarcodeAutoDetection")
    public void setSingleBarcodeAutoDetection(boolean z) {
        this.f18031a.setSingleBarcodeAutoDetection(z);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction(nativeName = "setSwipeGesturesEnabled", property = "swipeGesturesEnabled")
    public void setSwipeGesturesEnabled(boolean z) {
        this.f18031a.setSwipeGesturesEnabled(z);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction(nativeName = "setTapGestureForSelectionEnabled", property = "tapGestureForSelectionEnabled")
    public void setTapGestureForSelectionEnabled(boolean z) {
        this.f18031a.setTapGestureForSelectionEnabled(z);
    }

    public final void updateFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        new BarcodeSelectionDeserializer().updateSettingsFromJson(this, jsonData);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeSelectionSettings() {
        NativeBarcodeSelectionSettings nativeBarcodeSelectionSettingsCreate = NativeBarcodeSelectionSettings.create();
        Intrinsics.g(nativeBarcodeSelectionSettingsCreate, "create()");
        this(nativeBarcodeSelectionSettingsCreate);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeSelectionSettings(@NotNull Set<? extends CapturePreset> capturePresets) {
        Intrinsics.h(capturePresets, "capturePresets");
        NativeBarcodeSelectionSettings nativeBarcodeSelectionSettingsCreateWithPresets = NativeBarcodeSelectionSettings.createWithPresets(CollectionsKt.E0(capturePresets));
        Intrinsics.g(nativeBarcodeSelectionSettingsCreateWithPresets, "createWithPresets(capturePresets.toHashSet())");
        this(nativeBarcodeSelectionSettingsCreateWithPresets);
    }
}
