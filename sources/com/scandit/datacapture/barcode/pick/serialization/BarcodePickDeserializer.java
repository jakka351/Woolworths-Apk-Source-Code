package com.scandit.datacapture.barcode.pick.serialization;

import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.D3;
import com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSettings;
import com.scandit.datacapture.barcode.pick.data.BarcodePickAsyncMapperProductProvider;
import com.scandit.datacapture.barcode.pick.data.BarcodePickAsyncMapperProductProviderCallback;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProduct;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProductProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickView;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.serialization.FrameSourceDeserializer;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 A2\u00020\u0001:\u0003ABCB\t\b\u0016¢\u0006\u0004\b?\u0010@J\t\u0010\u0002\u001a\u00020\u0000H\u0097\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J!\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0097\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0010H\u0097\u0001J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\f\u001a\u00020\u0010H\u0097\u0001J\u0011\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000H\u0097\u0001J\u0011\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0097\u0001J\u0019\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0010H\u0097\u0001J\u0019\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000bH\u0097\u0001J\u0011\u0010 \u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000bH\u0097\u0001J\u0019\u0010!\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0097\u0001J\u0019\u0010\"\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0097\u0001J\u0016\u0010&\u001a\u00020%2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#J\u001e\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010)\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010*\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000bJ&\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJ0\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010/J\u0016\u00102\u001a\u00020-2\u0006\u00101\u001a\u00020-2\u0006\u0010\f\u001a\u00020\u000bR$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006D"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializer;", "Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerProxy;", "_deserializer", "Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/NativeBarcodePickDeserializer;", "_impl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "context", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProvider;", "productProvider", "", "json", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "_modeFromJson", "mode", "Lcom/scandit/datacapture/core/json/JsonValue;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/BarcodePickBasicOverlay;", "_overlayFromJson", "", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProduct;", "_productsFromJson", "deserializerProxy", "", "_setDeserializer", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;", "_settingsFromJson", "overlay", "_updateOverlayFromJson", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;", "settings", "_updateViewSettingsFromJson", "_viewSettingsFromJson", "updateModeFromJson", "updateSettingsFromJson", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickAsyncMapperProductProviderCallback;", "callback", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickAsyncMapperProductProvider;", "asyncMapperProductProviderFromJson", "dataCaptureContext", "modeFromJson", "settingsFromJson", "viewSettingsFromJson", "Landroid/view/ViewGroup;", "parentView", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickView;", "viewFromJson", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleCustomViewProvider;", "asyncCustomViewProvider", "view", "updateViewFromJson", "Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerListener;", "c", "Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerListener;", "getListener", "()Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerListener;", "setListener", "(Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/BarcodePickDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/BarcodePickDeserializerHelper;", "_helper", "<init>", "()V", "Companion", "com/scandit/datacapture/barcode/pick/serialization/b", "com/scandit/datacapture/barcode/pick/serialization/g", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BarcodePickDeserializer implements BarcodePickDeserializerProxy {

    @NotNull
    public static final String FIELD_BARCODE_PICK_STATE = "barcodePickState";

    @NotNull
    public static final String FIELD_ICON = "icon";

    @NotNull
    public static final String FIELD_ICONS_FOR_STATE = "iconsForState";

    @NotNull
    public static final String FIELD_SELECTED_ICONS_FOR_STATE = "selectedIconsForState";

    /* renamed from: a, reason: collision with root package name */
    private final g f17917a;
    private final /* synthetic */ BarcodePickDeserializerProxyAdapter b;

    /* renamed from: c, reason: from kotlin metadata */
    private BarcodePickDeserializerListener listener;

    private BarcodePickDeserializer(g gVar, D3 d3, NativeBarcodePickDeserializer nativeBarcodePickDeserializer) {
        this.f17917a = gVar;
        this.b = new BarcodePickDeserializerProxyAdapter(nativeBarcodePickDeserializer, null, 2, 0 == true ? 1 : 0);
        ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.f24268a.b(BarcodePickDeserializerHelper.class), null, gVar, new a(d3));
        _setDeserializer(this);
        nativeBarcodePickDeserializer.setListener(new BarcodePickDeserializerListenerReversedAdapter(new b(this), this, null, 4, null));
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    @NotNull
    public BarcodePickDeserializer _deserializer() {
        return this.b._deserializer();
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodePickDeserializer getF17919a() {
        return this.b.getF17919a();
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy, com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _modeDeserializerImpl */
    public NativeDataCaptureModeDeserializer getC() {
        return this.b.getC();
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyFunction(nativeName = "barcodePickFromJson")
    @NotNull
    public BarcodePick _modeFromJson(@NotNull DataCaptureContext context, @NotNull BarcodePickProductProvider productProvider, @NotNull String json) {
        Intrinsics.h(context, "context");
        Intrinsics.h(productProvider, "productProvider");
        Intrinsics.h(json, "json");
        return this.b._modeFromJson(context, productProvider, json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyFunction(nativeName = "overlayFromJson")
    @NotNull
    public BarcodePickBasicOverlay _overlayFromJson(@NotNull BarcodePick mode, @NotNull JsonValue json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        return this.b._overlayFromJson(mode, json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyFunction(nativeName = "barcodePickProductsFromJson")
    @NotNull
    public List<BarcodePickProduct> _productsFromJson(@NotNull JsonValue json) {
        Intrinsics.h(json, "json");
        return this.b._productsFromJson(json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxySetter
    public void _setDeserializer(@NotNull BarcodePickDeserializer deserializerProxy) {
        Intrinsics.h(deserializerProxy, "deserializerProxy");
        this.b._setDeserializer(deserializerProxy);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyFunction(nativeName = "settingsFromJson")
    @NotNull
    public BarcodePickSettings _settingsFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        return this.b._settingsFromJson(json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyFunction(nativeName = "updateOverlayFromJson")
    @NotNull
    public BarcodePickBasicOverlay _updateOverlayFromJson(@NotNull BarcodePickBasicOverlay overlay, @NotNull JsonValue json) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        return this.b._updateOverlayFromJson(overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyFunction(nativeName = "updateViewSettingsFromJson")
    @NotNull
    public BarcodePickViewSettings _updateViewSettingsFromJson(@NotNull BarcodePickViewSettings settings, @NotNull String json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        return this.b._updateViewSettingsFromJson(settings, json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyFunction(nativeName = "viewSettingsFromJson")
    @NotNull
    public BarcodePickViewSettings _viewSettingsFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        return this.b._viewSettingsFromJson(json);
    }

    @NotNull
    public final BarcodePickAsyncMapperProductProvider asyncMapperProductProviderFromJson(@NotNull String json, @NotNull BarcodePickAsyncMapperProductProviderCallback callback) {
        Intrinsics.h(json, "json");
        Intrinsics.h(callback, "callback");
        return new BarcodePickAsyncMapperProductProvider(CollectionsKt.L0(_productsFromJson(new JsonValue(json))), callback);
    }

    @Nullable
    public final BarcodePickDeserializerListener getListener() {
        return this.listener;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    @NotNull
    public BarcodePickDeserializerHelper get_helper() {
        return this.b.get_helper();
    }

    @NotNull
    public final BarcodePick modeFromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodePickProductProvider productProvider, @NotNull String json) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(productProvider, "productProvider");
        Intrinsics.h(json, "json");
        BarcodePick barcodePick_modeFromJson = _modeFromJson(dataCaptureContext, productProvider, json);
        this.f17917a.clear();
        return barcodePick_modeFromJson;
    }

    public final void setListener(@Nullable BarcodePickDeserializerListener barcodePickDeserializerListener) {
        this.listener = barcodePickDeserializerListener;
    }

    @NotNull
    public final BarcodePickSettings settingsFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        BarcodePickSettings barcodePickSettings_settingsFromJson = _settingsFromJson(json);
        this.f17917a.clear();
        return barcodePickSettings_settingsFromJson;
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodePickFromJson")
    @NotNull
    public BarcodePick updateModeFromJson(@NotNull BarcodePick mode, @NotNull String json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        return this.b.updateModeFromJson(mode, json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyFunction
    @NotNull
    public BarcodePickSettings updateSettingsFromJson(@NotNull BarcodePickSettings settings, @NotNull String json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        return this.b.updateSettingsFromJson(settings, json);
    }

    @NotNull
    public final BarcodePickView updateViewFromJson(@NotNull BarcodePickView view, @NotNull String json) {
        Intrinsics.h(view, "view");
        Intrinsics.h(json, "json");
        view._applySettings$scandit_barcode_capture(viewSettingsFromJson(json));
        return view;
    }

    @NotNull
    public final BarcodePickView viewFromJson(@NotNull ViewGroup parentView, @NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodePick mode, @NotNull String json) {
        Intrinsics.h(parentView, "parentView");
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        return viewFromJson(parentView, dataCaptureContext, mode, json, null);
    }

    @NotNull
    public final BarcodePickViewSettings viewSettingsFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        BarcodePickViewSettings barcodePickViewSettings_viewSettingsFromJson = _viewSettingsFromJson(json);
        get_helper().clear();
        return barcodePickViewSettings_viewSettingsFromJson;
    }

    @NotNull
    public final BarcodePickView viewFromJson(@NotNull ViewGroup parentView, @NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodePick mode, @NotNull String json, @Nullable BarcodePickViewHighlightStyleCustomViewProvider asyncCustomViewProvider) {
        CameraSettings cameraSettings;
        Intrinsics.h(parentView, "parentView");
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        JSONObject jSONObject = new JSONObject(json);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("viewSettings");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        String string = jSONObjectOptJSONObject.toString();
        Intrinsics.g(string, "viewSettingsJson.toString()");
        BarcodePickViewSettings barcodePickViewSettingsViewSettingsFromJson = viewSettingsFromJson(string);
        BarcodePickViewHighlightStyle highlightStyle = barcodePickViewSettingsViewSettingsFromJson.getHighlightStyle();
        BarcodePickViewHighlightStyle.CustomView customView = highlightStyle instanceof BarcodePickViewHighlightStyle.CustomView ? (BarcodePickViewHighlightStyle.CustomView) highlightStyle : null;
        if (customView != null) {
            customView.setAsyncCustomViewProvider(asyncCustomViewProvider);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("cameraSettings");
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new JSONObject();
        }
        boolean zOptBoolean = jSONObjectOptJSONObject2.optBoolean("usesRecommendedSettings", true);
        if (zOptBoolean) {
            cameraSettings = BarcodePick.INSTANCE.createRecommendedCameraSettings();
        } else {
            if (zOptBoolean) {
                throw new NoWhenBranchMatchedException();
            }
            cameraSettings = new CameraSettings();
        }
        FrameSourceDeserializer frameSourceDeserializer = new FrameSourceDeserializer(EmptyList.d);
        String string2 = jSONObjectOptJSONObject2.toString();
        Intrinsics.g(string2, "cameraSettingsJson.toString()");
        return BarcodePickView.INSTANCE.newInstance(parentView, dataCaptureContext, mode, barcodePickViewSettingsViewSettingsFromJson, frameSourceDeserializer.updateCameraSettingsFromJson(cameraSettings, string2));
    }

    public /* synthetic */ BarcodePickDeserializer(g gVar) {
        D3 d3 = new D3(gVar);
        NativeBarcodePickDeserializer nativeBarcodePickDeserializerCreate = NativeBarcodePickDeserializer.create(d3);
        Intrinsics.g(nativeBarcodePickDeserializerCreate, "create(adapter)");
        this(gVar, d3, nativeBarcodePickDeserializerCreate);
    }

    public BarcodePickDeserializer() {
        this(new g());
    }
}
