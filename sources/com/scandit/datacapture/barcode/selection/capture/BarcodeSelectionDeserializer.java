package com.scandit.datacapture.barcode.selection.capture;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializer;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlay;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
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

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u000267B\t\b\u0016¢\u0006\u0004\b4\u00105J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\t\u0010\t\u001a\u00020\u0000H\u0097\u0001J\t\u0010\u000b\u001a\u00020\nH\u0097\u0001J\t\u0010\r\u001a\u00020\fH\u0097\u0001J\u0019\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0000H\u0097\u0001J\u0011\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0019\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0019\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0019\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0016\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005R\u001a\u0010#\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0005008WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00068"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializer;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerProxy;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;", "mode", "", "jsonData", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;", "_basicOverlayFromJson", "_deserializer", "Lcom/scandit/datacapture/barcode/selection/internal/module/serialization/NativeBarcodeSelectionDeserializer;", "_impl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "_modeFromJson", "deserializer", "", "_setDeserializer", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings;", "_settingsFromJson", "overlay", "updateBasicOverlayFromJson", "updateModeFromJson", "settings", "updateSettingsFromJson", "modeFromJson", "settingsFromJson", "basicOverlayFromJson", "Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializer;", "a", "Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializer;", "getViewfinderDeserializer$scandit_barcode_capture", "()Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializer;", "viewfinderDeserializer", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerListener;", "d", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerListener;", "getListener", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerListener;", "setListener", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerHelper;", "_helper", "", "getWarnings", "()Ljava/util/List;", "warnings", "<init>", "()V", "com/scandit/datacapture/barcode/selection/capture/f", "com/scandit/datacapture/barcode/selection/capture/g", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionDeserializer implements DataCaptureModeDeserializer, BarcodeSelectionDeserializerProxy {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewfinderDeserializer viewfinderDeserializer;
    private final C0839g b;
    private final /* synthetic */ BarcodeSelectionDeserializerProxyAdapter c;

    /* renamed from: d, reason: from kotlin metadata */
    private BarcodeSelectionDeserializerListener listener;

    private BarcodeSelectionDeserializer(ViewfinderDeserializer viewfinderDeserializer, C0839g c0839g, BarcodeSelectionDeserializerHelperReversedAdapter barcodeSelectionDeserializerHelperReversedAdapter, NativeBarcodeSelectionDeserializer nativeBarcodeSelectionDeserializer) {
        this.viewfinderDeserializer = viewfinderDeserializer;
        this.b = c0839g;
        this.c = new BarcodeSelectionDeserializerProxyAdapter(nativeBarcodeSelectionDeserializer, null, 2, 0 == true ? 1 : 0);
        ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.f24268a.b(BarcodeSelectionDeserializerHelper.class), null, c0839g, new C0837e(barcodeSelectionDeserializerHelperReversedAdapter));
        _setDeserializer(this);
        nativeBarcodeSelectionDeserializer.setListener(new BarcodeSelectionDeserializerListenerReversedAdapter(new C0838f(this), this, null, 4, null));
        c0839g.a(new WeakReference(this));
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @ProxyFunction(nativeName = "barcodeSelectionBasicOverlayFromJson")
    @NotNull
    public BarcodeSelectionBasicOverlay _basicOverlayFromJson(@NotNull BarcodeSelection mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        return this.c._basicOverlayFromJson(mode, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    @NotNull
    public BarcodeSelectionDeserializer _deserializer() {
        return this.c._deserializer();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeSelectionDeserializer getF18022a() {
        return this.c.getF18022a();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _modeDeserializerImpl */
    public NativeDataCaptureModeDeserializer getC() {
        return this.c.getC();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @ProxyFunction(nativeName = "barcodeSelectionFromJson")
    @NotNull
    public BarcodeSelection _modeFromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String jsonData) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(jsonData, "jsonData");
        return this.c._modeFromJson(dataCaptureContext, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @ProxySetter
    public void _setDeserializer(@NotNull BarcodeSelectionDeserializer deserializer) {
        Intrinsics.h(deserializer, "deserializer");
        this.c._setDeserializer(deserializer);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @ProxyFunction(nativeName = "settingsFromJson")
    @NotNull
    public BarcodeSelectionSettings _settingsFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        return this.c._settingsFromJson(jsonData);
    }

    @NotNull
    public final BarcodeSelectionBasicOverlay basicOverlayFromJson(@NotNull BarcodeSelection mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        BarcodeSelectionBasicOverlay barcodeSelectionBasicOverlay_basicOverlayFromJson = _basicOverlayFromJson(mode, jsonData);
        this.b.clear();
        return barcodeSelectionBasicOverlay_basicOverlayFromJson;
    }

    @Nullable
    public final BarcodeSelectionDeserializerListener getListener() {
        return this.listener;
    }

    @NotNull
    /* renamed from: getViewfinderDeserializer$scandit_barcode_capture, reason: from getter */
    public final ViewfinderDeserializer getViewfinderDeserializer() {
        return this.viewfinderDeserializer;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @ProxyFunction(property = "warnings")
    @NotNull
    public List<String> getWarnings() {
        return this.c.getWarnings();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    @NotNull
    public BarcodeSelectionDeserializerHelper get_helper() {
        return this.c.get_helper();
    }

    @NotNull
    public final BarcodeSelection modeFromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String jsonData) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(jsonData, "jsonData");
        BarcodeSelection barcodeSelection_modeFromJson = _modeFromJson(dataCaptureContext, jsonData);
        this.b.clear();
        return barcodeSelection_modeFromJson;
    }

    public final void setListener(@Nullable BarcodeSelectionDeserializerListener barcodeSelectionDeserializerListener) {
        this.listener = barcodeSelectionDeserializerListener;
    }

    @NotNull
    public final BarcodeSelectionSettings settingsFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        BarcodeSelectionSettings barcodeSelectionSettings_settingsFromJson = _settingsFromJson(jsonData);
        this.b.clear();
        return barcodeSelectionSettings_settingsFromJson;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeSelectionBasicOverlayFromJson")
    @NotNull
    public BarcodeSelectionBasicOverlay updateBasicOverlayFromJson(@NotNull BarcodeSelectionBasicOverlay overlay, @NotNull String jsonData) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(jsonData, "jsonData");
        return this.c.updateBasicOverlayFromJson(overlay, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeSelectionFromJson")
    @NotNull
    public BarcodeSelection updateModeFromJson(@NotNull BarcodeSelection mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        return this.c.updateModeFromJson(mode, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerProxy
    @ProxyFunction
    @NotNull
    public BarcodeSelectionSettings updateSettingsFromJson(@NotNull BarcodeSelectionSettings settings, @NotNull String jsonData) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(jsonData, "jsonData");
        return this.c.updateSettingsFromJson(settings, jsonData);
    }

    public /* synthetic */ BarcodeSelectionDeserializer(ViewfinderDeserializer viewfinderDeserializer, C0839g c0839g) {
        BarcodeSelectionDeserializerHelperReversedAdapter barcodeSelectionDeserializerHelperReversedAdapter = new BarcodeSelectionDeserializerHelperReversedAdapter(c0839g, null, 2, 0 == true ? 1 : 0);
        NativeBarcodeSelectionDeserializer nativeBarcodeSelectionDeserializerCreate = NativeBarcodeSelectionDeserializer.create(viewfinderDeserializer._impl(), barcodeSelectionDeserializerHelperReversedAdapter);
        Intrinsics.g(nativeBarcodeSelectionDeserializerCreate, "create(\n        viewfind…(),\n        adapter\n    )");
        this(viewfinderDeserializer, c0839g, barcodeSelectionDeserializerHelperReversedAdapter, nativeBarcodeSelectionDeserializerCreate);
    }

    public BarcodeSelectionDeserializer() {
        this(new ViewfinderDeserializer(), new C0839g());
    }
}
