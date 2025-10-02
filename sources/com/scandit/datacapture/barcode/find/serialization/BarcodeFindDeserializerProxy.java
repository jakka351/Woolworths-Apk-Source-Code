package com.scandit.datacapture.barcode.find.serialization;

import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindSettings;
import com.scandit.datacapture.barcode.internal.module.find.serialization.BarcodeFindDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializer;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H'J\b\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH'J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializerProxy;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "_helper", "Lcom/scandit/datacapture/barcode/internal/module/find/serialization/BarcodeFindDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/internal/module/find/serialization/BarcodeFindDeserializerHelper;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/find/serialization/NativeBarcodeFindDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeFromJson", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;", "json", "", "_settingsFromJson", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;", "_updateModeFromJson", "mode", "_updateSettingsFromJson", "settings", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeFindDeserializer.class)
/* loaded from: classes6.dex */
public interface BarcodeFindDeserializerProxy extends DataCaptureModeDeserializer {
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    NativeBarcodeFindDeserializer getF17669a();

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _modeDeserializerImpl */
    NativeDataCaptureModeDeserializer getC();

    @ProxyFunction(nativeName = "barcodeFindFromJson")
    @NotNull
    BarcodeFind _modeFromJson(@NotNull String json);

    @ProxyFunction(nativeName = "settingsFromJson")
    @NotNull
    BarcodeFindSettings _settingsFromJson(@NotNull String json);

    @ProxyFunction(nativeName = "updateBarcodeFindFromJson")
    @NotNull
    BarcodeFind _updateModeFromJson(@NotNull BarcodeFind mode, @NotNull String json);

    @ProxyFunction(nativeName = "updateSettingsFromJson")
    @NotNull
    BarcodeFindSettings _updateSettingsFromJson(@NotNull BarcodeFindSettings settings, @NotNull String json);

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    @NotNull
    BarcodeFindDeserializerHelper get_helper();
}
