package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializer;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlay;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u00002\u00020\u0001J\b\u0010\u000b\u001a\u00020\fH'J\b\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\u0010H'J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH'J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\bH'J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\fH'J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\bH'J\u0018\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\bH'J\u0018\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\bH'J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\bH'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006#"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerProxy;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "_helper", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerHelper;", "warnings", "", "", "getWarnings", "()Ljava/util/List;", "_deserializer", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializer;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/serialization/NativeBarcodeCaptureDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeFromJson", "Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "jsonData", "_overlayFromJson", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay;", "mode", "_setDeserializer", "", "deserializer", "_settingsFromJson", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "updateModeFromJson", "updateOverlayFromJson", "overlay", "updateSettingsFromJson", "settings", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeCaptureDeserializer.class)
/* loaded from: classes6.dex */
public interface BarcodeCaptureDeserializerProxy extends DataCaptureModeDeserializer {
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    @NotNull
    BarcodeCaptureDeserializer _deserializer();

    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    NativeBarcodeCaptureDeserializer getF17410a();

    @NativeImpl
    @NotNull
    /* renamed from: _modeDeserializerImpl */
    NativeDataCaptureModeDeserializer getC();

    @ProxyFunction(nativeName = "barcodeCaptureFromJson")
    @NotNull
    BarcodeCapture _modeFromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String jsonData);

    @ProxyFunction(nativeName = "barcodeCaptureOverlayFromJson")
    @NotNull
    BarcodeCaptureOverlay _overlayFromJson(@NotNull BarcodeCapture mode, @NotNull String jsonData);

    @ProxySetter
    void _setDeserializer(@NotNull BarcodeCaptureDeserializer deserializer);

    @ProxyFunction(nativeName = "settingsFromJson")
    @NotNull
    BarcodeCaptureSettings _settingsFromJson(@NotNull String jsonData);

    @ProxyFunction(property = "warnings")
    @NotNull
    List<String> getWarnings();

    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    @NotNull
    BarcodeCaptureDeserializerHelper get_helper();

    @ProxyFunction(nativeName = "updateBarcodeCaptureFromJson")
    @NotNull
    BarcodeCapture updateModeFromJson(@NotNull BarcodeCapture mode, @NotNull String jsonData);

    @ProxyFunction(nativeName = "updateBarcodeCaptureOverlayFromJson")
    @NotNull
    BarcodeCaptureOverlay updateOverlayFromJson(@NotNull BarcodeCaptureOverlay overlay, @NotNull String jsonData);

    @ProxyFunction
    @NotNull
    BarcodeCaptureSettings updateSettingsFromJson(@NotNull BarcodeCaptureSettings settings, @NotNull String jsonData);
}
