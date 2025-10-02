package com.scandit.datacapture.barcode.count.serialization;

import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.capture.BarcodeCountSettings;
import com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializer;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\b\u0010\u000b\u001a\u00020\fH'J\b\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\u0010H'J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH'J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\bH'J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\fH'J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\bH'J\u0018\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\bH'J\b\u0010!\u001a\u00020\"H'J\u0018\u0010#\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\bH'J\u0018\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\bH'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006&"}, d2 = {"Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerProxy;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "_helper", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelper;", "warnings", "", "", "getWarnings", "()Ljava/util/List;", "_deserializer", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializer;", "_impl", "Lcom/scandit/datacapture/barcode/count/internal/module/serialization/NativeBarcodeCountDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeFromJson", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "json", "_overlayFromJson", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "mode", "jsonData", "_setDeserializer", "", "deserializer", "_settingsFromJson", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "_updateOverlayFromJson", "overlay", "createRecommendedCameraSettings", "Lcom/scandit/datacapture/core/source/CameraSettings;", "updateModeFromJson", "updateSettingsFromJson", "settings", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeCountDeserializer.class)
/* loaded from: classes6.dex */
public interface BarcodeCountDeserializerProxy extends DataCaptureModeDeserializer {
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    @NotNull
    BarcodeCountDeserializer _deserializer();

    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    NativeBarcodeCountDeserializer getF17526a();

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _modeDeserializerImpl */
    NativeDataCaptureModeDeserializer getC();

    @ProxyFunction(nativeName = "barcodeCountFromJson")
    @NotNull
    BarcodeCount _modeFromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String json);

    @ProxyFunction(nativeName = "barcodeCountBasicOverlayFromJson")
    @NotNull
    BarcodeCountBasicOverlay _overlayFromJson(@NotNull BarcodeCount mode, @NotNull String jsonData);

    @ProxySetter
    void _setDeserializer(@NotNull BarcodeCountDeserializer deserializer);

    @ProxyFunction(nativeName = "settingsFromJson")
    @NotNull
    BarcodeCountSettings _settingsFromJson(@NotNull String json);

    @ProxyFunction(nativeName = "updateBarcodeCountBasicOverlayFromJson")
    @NotNull
    BarcodeCountBasicOverlay _updateOverlayFromJson(@NotNull BarcodeCountBasicOverlay overlay, @NotNull String jsonData);

    @ProxyFunction
    @NotNull
    CameraSettings createRecommendedCameraSettings();

    @ProxyFunction(property = "warnings")
    @NotNull
    List<String> getWarnings();

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    @NotNull
    BarcodeCountDeserializerHelper get_helper();

    @ProxyFunction(nativeName = "updateBarcodeCountFromJson")
    @NotNull
    BarcodeCount updateModeFromJson(@NotNull BarcodeCount mode, @NotNull String json);

    @ProxyFunction
    @NotNull
    BarcodeCountSettings updateSettingsFromJson(@NotNull BarcodeCountSettings settings, @NotNull String json);
}
