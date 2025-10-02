package com.scandit.datacapture.barcode.pick.serialization;

import com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSettings;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProduct;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProductProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H'J\b\u0010\b\u001a\u00020\tH'J\b\u0010\n\u001a\u00020\u000bH'J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0017H'J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u0017H'J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H'J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0018\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0017H'J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0010\u0010%\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0018\u0010&\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0018\u0010'\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0013H'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006("}, d2 = {"Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerProxy;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "_helper", "Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/BarcodePickDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/BarcodePickDeserializerHelper;", "_deserializer", "Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializer;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/NativeBarcodePickDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeFromJson", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "context", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "productProvider", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProvider;", "json", "", "_overlayFromJson", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/BarcodePickBasicOverlay;", "mode", "Lcom/scandit/datacapture/core/json/JsonValue;", "_productsFromJson", "", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProduct;", "_setDeserializer", "", "deserializerProxy", "_settingsFromJson", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;", "_updateOverlayFromJson", "overlay", "_updateViewSettingsFromJson", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;", "settings", "_viewSettingsFromJson", "updateModeFromJson", "updateSettingsFromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeBarcodePickDeserializer.class)
/* loaded from: classes6.dex */
public interface BarcodePickDeserializerProxy extends DataCaptureModeDeserializer {
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    @NotNull
    BarcodePickDeserializer _deserializer();

    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    NativeBarcodePickDeserializer getF17919a();

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _modeDeserializerImpl */
    NativeDataCaptureModeDeserializer getC();

    @ProxyFunction(nativeName = "barcodePickFromJson")
    @NotNull
    BarcodePick _modeFromJson(@NotNull DataCaptureContext context, @NotNull BarcodePickProductProvider productProvider, @NotNull String json);

    @ProxyFunction(nativeName = "overlayFromJson")
    @NotNull
    BarcodePickBasicOverlay _overlayFromJson(@NotNull BarcodePick mode, @NotNull JsonValue json);

    @ProxyFunction(nativeName = "barcodePickProductsFromJson")
    @NotNull
    List<BarcodePickProduct> _productsFromJson(@NotNull JsonValue json);

    @ProxySetter
    void _setDeserializer(@NotNull BarcodePickDeserializer deserializerProxy);

    @ProxyFunction(nativeName = "settingsFromJson")
    @NotNull
    BarcodePickSettings _settingsFromJson(@NotNull String json);

    @ProxyFunction(nativeName = "updateOverlayFromJson")
    @NotNull
    BarcodePickBasicOverlay _updateOverlayFromJson(@NotNull BarcodePickBasicOverlay overlay, @NotNull JsonValue json);

    @ProxyFunction(nativeName = "updateViewSettingsFromJson")
    @NotNull
    BarcodePickViewSettings _updateViewSettingsFromJson(@NotNull BarcodePickViewSettings settings, @NotNull String json);

    @ProxyFunction(nativeName = "viewSettingsFromJson")
    @NotNull
    BarcodePickViewSettings _viewSettingsFromJson(@NotNull String json);

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    @NotNull
    BarcodePickDeserializerHelper get_helper();

    @ProxyFunction(nativeName = "updateBarcodePickFromJson")
    @NotNull
    BarcodePick updateModeFromJson(@NotNull BarcodePick mode, @NotNull String json);

    @ProxyFunction
    @NotNull
    BarcodePickSettings updateSettingsFromJson(@NotNull BarcodePickSettings settings, @NotNull String json);
}
