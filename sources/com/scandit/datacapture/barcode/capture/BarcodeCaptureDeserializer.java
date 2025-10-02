package com.scandit.datacapture.barcode.capture;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializer;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlay;
import com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializer;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializer;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002<=B\t\b\u0016¢\u0006\u0004\b:\u0010;J\t\u0010\u0003\u001a\u00020\u0000H\u0097\u0001J\t\u0010\u0005\u001a\u00020\u0004H\u0097\u0001J\t\u0010\u0007\u001a\u00020\u0006H\u0097\u0001J\u0019\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0097\u0001J\u0019\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0097\u0001J\u0011\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0000H\u0097\u0001J\u0011\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\nH\u0097\u0001J\u0019\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0097\u0001J\u0019\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0097\u0001J\u0019\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\nH\u0097\u0001J\u0016\u0010\u001b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nR\u001a\u0010#\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010)\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00105\u001a\u0002028WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\n068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006>"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializer;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerProxy;", "_deserializer", "Lcom/scandit/datacapture/barcode/internal/module/serialization/NativeBarcodeCaptureDeserializer;", "_impl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "jsonData", "Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "_modeFromJson", "mode", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay;", "_overlayFromJson", "deserializer", "", "_setDeserializer", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "_settingsFromJson", "updateModeFromJson", "overlay", "updateOverlayFromJson", "settings", "updateSettingsFromJson", "modeFromJson", "settingsFromJson", "overlayFromJson", "Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializer;", "a", "Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializer;", "getLocationSelectionDeserializer$scandit_barcode_capture", "()Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializer;", "locationSelectionDeserializer", "Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializer;", "b", "Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializer;", "getViewfinderDeserializer$scandit_barcode_capture", "()Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializer;", "viewfinderDeserializer", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerListener;", "e", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerListener;", "getListener", "()Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerListener;", "setListener", "(Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerHelper;", "_helper", "", "getWarnings", "()Ljava/util/List;", "warnings", "<init>", "()V", "com/scandit/datacapture/barcode/capture/e", "com/scandit/datacapture/barcode/capture/f", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class BarcodeCaptureDeserializer implements DataCaptureModeDeserializer, BarcodeCaptureDeserializerProxy {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LocationSelectionDeserializer locationSelectionDeserializer;

    /* renamed from: b, reason: from kotlin metadata */
    private final ViewfinderDeserializer viewfinderDeserializer;
    private final C0560f c;
    private final /* synthetic */ BarcodeCaptureDeserializerProxyAdapter d;

    /* renamed from: e, reason: from kotlin metadata */
    private BarcodeCaptureDeserializerListener listener;

    private BarcodeCaptureDeserializer(LocationSelectionDeserializer locationSelectionDeserializer, ViewfinderDeserializer viewfinderDeserializer, C0560f c0560f, BarcodeCaptureDeserializerHelperReversedAdapter barcodeCaptureDeserializerHelperReversedAdapter, NativeBarcodeCaptureDeserializer nativeBarcodeCaptureDeserializer) {
        this.locationSelectionDeserializer = locationSelectionDeserializer;
        this.viewfinderDeserializer = viewfinderDeserializer;
        this.c = c0560f;
        this.d = new BarcodeCaptureDeserializerProxyAdapter(nativeBarcodeCaptureDeserializer, null, 2, 0 == true ? 1 : 0);
        ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.f24268a.b(BarcodeCaptureDeserializerHelper.class), null, c0560f, new C0558d(barcodeCaptureDeserializerHelperReversedAdapter));
        _setDeserializer(this);
        nativeBarcodeCaptureDeserializer.setListener(new BarcodeCaptureDeserializerListenerReversedAdapter(new C0559e(this), this, null, 4, null));
        c0560f.a(new WeakReference(this));
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    @NotNull
    public BarcodeCaptureDeserializer _deserializer() {
        return this.d._deserializer();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeCaptureDeserializer getF17410a() {
        return this.d.getF17410a();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _modeDeserializerImpl */
    public NativeDataCaptureModeDeserializer getC() {
        return this.d.getC();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @ProxyFunction(nativeName = "barcodeCaptureFromJson")
    @NotNull
    public BarcodeCapture _modeFromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String jsonData) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(jsonData, "jsonData");
        return this.d._modeFromJson(dataCaptureContext, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @ProxyFunction(nativeName = "barcodeCaptureOverlayFromJson")
    @NotNull
    public BarcodeCaptureOverlay _overlayFromJson(@NotNull BarcodeCapture mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        return this.d._overlayFromJson(mode, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @ProxySetter
    public void _setDeserializer(@NotNull BarcodeCaptureDeserializer deserializer) {
        Intrinsics.h(deserializer, "deserializer");
        this.d._setDeserializer(deserializer);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @ProxyFunction(nativeName = "settingsFromJson")
    @NotNull
    public BarcodeCaptureSettings _settingsFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        return this.d._settingsFromJson(jsonData);
    }

    @Nullable
    public final BarcodeCaptureDeserializerListener getListener() {
        return this.listener;
    }

    @NotNull
    /* renamed from: getLocationSelectionDeserializer$scandit_barcode_capture, reason: from getter */
    public final LocationSelectionDeserializer getLocationSelectionDeserializer() {
        return this.locationSelectionDeserializer;
    }

    @NotNull
    /* renamed from: getViewfinderDeserializer$scandit_barcode_capture, reason: from getter */
    public final ViewfinderDeserializer getViewfinderDeserializer() {
        return this.viewfinderDeserializer;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @ProxyFunction(property = "warnings")
    @NotNull
    public List<String> getWarnings() {
        return this.d.getWarnings();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    @NotNull
    public BarcodeCaptureDeserializerHelper get_helper() {
        return this.d.get_helper();
    }

    @NotNull
    public final BarcodeCapture modeFromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String jsonData) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(jsonData, "jsonData");
        BarcodeCapture barcodeCapture_modeFromJson = _modeFromJson(dataCaptureContext, jsonData);
        this.c.getClass();
        return barcodeCapture_modeFromJson;
    }

    @NotNull
    public final BarcodeCaptureOverlay overlayFromJson(@NotNull BarcodeCapture mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        BarcodeCaptureOverlay barcodeCaptureOverlay_overlayFromJson = _overlayFromJson(mode, jsonData);
        this.c.getClass();
        return barcodeCaptureOverlay_overlayFromJson;
    }

    public final void setListener(@Nullable BarcodeCaptureDeserializerListener barcodeCaptureDeserializerListener) {
        this.listener = barcodeCaptureDeserializerListener;
    }

    @NotNull
    public final BarcodeCaptureSettings settingsFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        BarcodeCaptureSettings barcodeCaptureSettings_settingsFromJson = _settingsFromJson(jsonData);
        this.c.getClass();
        return barcodeCaptureSettings_settingsFromJson;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeCaptureFromJson")
    @NotNull
    public BarcodeCapture updateModeFromJson(@NotNull BarcodeCapture mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        return this.d.updateModeFromJson(mode, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeCaptureOverlayFromJson")
    @NotNull
    public BarcodeCaptureOverlay updateOverlayFromJson(@NotNull BarcodeCaptureOverlay overlay, @NotNull String jsonData) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(jsonData, "jsonData");
        return this.d.updateOverlayFromJson(overlay, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @ProxyFunction
    @NotNull
    public BarcodeCaptureSettings updateSettingsFromJson(@NotNull BarcodeCaptureSettings settings, @NotNull String jsonData) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(jsonData, "jsonData");
        return this.d.updateSettingsFromJson(settings, jsonData);
    }

    public /* synthetic */ BarcodeCaptureDeserializer(LocationSelectionDeserializer locationSelectionDeserializer, ViewfinderDeserializer viewfinderDeserializer, C0560f c0560f) {
        BarcodeCaptureDeserializerHelperReversedAdapter barcodeCaptureDeserializerHelperReversedAdapter = new BarcodeCaptureDeserializerHelperReversedAdapter(c0560f, null, 2, null);
        NativeBarcodeCaptureDeserializer nativeBarcodeCaptureDeserializerCreate = NativeBarcodeCaptureDeserializer.create(locationSelectionDeserializer._impl(), viewfinderDeserializer._impl(), barcodeCaptureDeserializerHelperReversedAdapter);
        Intrinsics.g(nativeBarcodeCaptureDeserializerCreate, "create(\n        location…(),\n        adapter\n    )");
        this(locationSelectionDeserializer, viewfinderDeserializer, c0560f, barcodeCaptureDeserializerHelperReversedAdapter, nativeBarcodeCaptureDeserializerCreate);
    }

    public BarcodeCaptureDeserializer() {
        this(new LocationSelectionDeserializer(), new ViewfinderDeserializer(), new C0560f());
    }
}
