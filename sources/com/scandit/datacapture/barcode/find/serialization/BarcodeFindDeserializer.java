package com.scandit.datacapture.barcode.find.serialization;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.C0804r0;
import com.scandit.datacapture.barcode.C0864u0;
import com.scandit.datacapture.barcode.E0;
import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindSettings;
import com.scandit.datacapture.barcode.find.feedback.BarcodeFindFeedback;
import com.scandit.datacapture.barcode.internal.module.find.serialization.BarcodeFindDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializer;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.sdk.common.feedback.FeedbackDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001%B\t\b\u0016¢\u0006\u0004\b#\u0010$J\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\u0011\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\u0019\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\u0019\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u0015\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializer;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializerProxy;", "Lcom/scandit/datacapture/barcode/internal/module/find/serialization/NativeBarcodeFindDeserializer;", "_impl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "", "json", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;", "_modeFromJson", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;", "_settingsFromJson", "mode", "_updateModeFromJson", "settings", "_updateSettingsFromJson", "modeFromJson", "settingsFromJson", "Lcom/scandit/datacapture/barcode/find/feedback/BarcodeFindFeedback;", "feedbackFromJson", "updateModeFromJson", "updateSettingsFromJson", "Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializerListener;", "c", "Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializerListener;", "getListener", "()Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializerListener;", "setListener", "(Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializerListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/scandit/datacapture/barcode/internal/module/find/serialization/BarcodeFindDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/internal/module/find/serialization/BarcodeFindDeserializerHelper;", "_helper", "<init>", "()V", "com/scandit/datacapture/barcode/find/serialization/b", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeFindDeserializer implements DataCaptureModeDeserializer, BarcodeFindDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeFindDeserializerHelper f17668a;
    private final /* synthetic */ BarcodeFindDeserializerProxyAdapter b;

    /* renamed from: c, reason: from kotlin metadata */
    private BarcodeFindDeserializerListener listener;

    private BarcodeFindDeserializer(C0804r0 c0804r0, C0864u0 c0864u0, NativeBarcodeFindDeserializer nativeBarcodeFindDeserializer) {
        this.f17668a = c0804r0;
        this.b = new BarcodeFindDeserializerProxyAdapter(nativeBarcodeFindDeserializer, null, 2, 0 == true ? 1 : 0);
        ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.f24268a.b(BarcodeFindDeserializerHelper.class), null, c0804r0, new a(c0864u0));
        getF17669a().setListener(new E0(new b(this), this));
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeFindDeserializer getF17669a() {
        return this.b.getF17669a();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _modeDeserializerImpl */
    public NativeDataCaptureModeDeserializer getC() {
        return this.b.getC();
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    @ProxyFunction(nativeName = "barcodeFindFromJson")
    @NotNull
    public BarcodeFind _modeFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        return this.b._modeFromJson(json);
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    @ProxyFunction(nativeName = "settingsFromJson")
    @NotNull
    public BarcodeFindSettings _settingsFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        return this.b._settingsFromJson(json);
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeFindFromJson")
    @NotNull
    public BarcodeFind _updateModeFromJson(@NotNull BarcodeFind mode, @NotNull String json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        return this.b._updateModeFromJson(mode, json);
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    @ProxyFunction(nativeName = "updateSettingsFromJson")
    @NotNull
    public BarcodeFindSettings _updateSettingsFromJson(@NotNull BarcodeFindSettings settings, @NotNull String json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        return this.b._updateSettingsFromJson(settings, json);
    }

    @NotNull
    public final BarcodeFindFeedback feedbackFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        JsonValue jsonValue = new JsonValue(json);
        BarcodeFindFeedback barcodeFindFeedbackDefaultFeedback = BarcodeFindFeedback.INSTANCE.defaultFeedback();
        Feedback feedbackFromJson = jsonValue.contains("found") ? FeedbackDeserializer.fromJson(jsonValue.requireByKey("found")) : barcodeFindFeedbackDefaultFeedback.getFound();
        Feedback feedbackFromJson2 = jsonValue.contains("itemListUpdated") ? FeedbackDeserializer.fromJson(jsonValue.requireByKey("itemListUpdated")) : barcodeFindFeedbackDefaultFeedback.getItemListUpdated();
        BarcodeFindFeedback barcodeFindFeedback = new BarcodeFindFeedback();
        barcodeFindFeedback.setFound(feedbackFromJson);
        barcodeFindFeedback.setItemListUpdated(feedbackFromJson2);
        return barcodeFindFeedback;
    }

    @Nullable
    public final BarcodeFindDeserializerListener getListener() {
        return this.listener;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    @NotNull
    public BarcodeFindDeserializerHelper get_helper() {
        return this.b.get_helper();
    }

    @NotNull
    public final BarcodeFind modeFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        BarcodeFind barcodeFind_modeFromJson = _modeFromJson(json);
        this.f17668a.clear();
        return barcodeFind_modeFromJson;
    }

    public final void setListener(@Nullable BarcodeFindDeserializerListener barcodeFindDeserializerListener) {
        this.listener = barcodeFindDeserializerListener;
    }

    @NotNull
    public final BarcodeFindSettings settingsFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        BarcodeFindSettings barcodeFindSettings_settingsFromJson = _settingsFromJson(json);
        this.f17668a.clear();
        return barcodeFindSettings_settingsFromJson;
    }

    @NotNull
    public final BarcodeFind updateModeFromJson(@NotNull BarcodeFind mode, @NotNull String json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        return _updateModeFromJson(mode, json);
    }

    @NotNull
    public final BarcodeFindSettings updateSettingsFromJson(@NotNull BarcodeFindSettings settings, @NotNull String json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        return _updateSettingsFromJson(settings, json);
    }

    public /* synthetic */ BarcodeFindDeserializer(C0804r0 c0804r0) {
        C0864u0 c0864u0 = new C0864u0(c0804r0);
        NativeBarcodeFindDeserializer nativeBarcodeFindDeserializerCreate = NativeBarcodeFindDeserializer.create(c0864u0);
        Intrinsics.g(nativeBarcodeFindDeserializerCreate, "create(adapter)");
        this(c0804r0, c0864u0, nativeBarcodeFindDeserializerCreate);
    }

    public BarcodeFindDeserializer() {
        this(new C0804r0());
    }
}
