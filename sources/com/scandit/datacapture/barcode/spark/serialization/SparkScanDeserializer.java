package com.scandit.datacapture.barcode.spark.serialization;

import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.platform.i;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.Ya;
import com.scandit.datacapture.barcode.data.CapturePreset;
import com.scandit.datacapture.barcode.internal.module.spark.serialization.SparkScanSettingsDeserializer;
import com.scandit.datacapture.barcode.spark.capture.SparkScan;
import com.scandit.datacapture.barcode.spark.capture.SparkScanSettings;
import com.scandit.datacapture.core.json.JsonValue;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B;\b\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u001a\u0010\u0019\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\u0004\u0012\u00020\b0\u0016\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a¢\u0006\u0004\b\u001c\u0010\u001dB\t\b\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/serialization/SparkScanDeserializer;", "", "", "jsonData", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScan;", "modeFromJson", "mode", "updateModeFromJson", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSettings;", "settingsFromJson", "settings", "updateSettingsFromJson", "Lcom/scandit/datacapture/barcode/spark/serialization/SparkScanDeserializerListener;", "d", "Lcom/scandit/datacapture/barcode/spark/serialization/SparkScanDeserializerListener;", "getListener", "()Lcom/scandit/datacapture/barcode/spark/serialization/SparkScanDeserializerListener;", "setListener", "(Lcom/scandit/datacapture/barcode/spark/serialization/SparkScanDeserializerListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/scandit/datacapture/barcode/internal/module/spark/serialization/SparkScanSettingsDeserializer;", "settingsDeserializer", "Lkotlin/Function1;", "", "Lcom/scandit/datacapture/barcode/data/CapturePreset;", "settingsFactory", "Lkotlin/Function0;", "modeFactory", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/spark/serialization/SparkScanSettingsDeserializer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "()V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class SparkScanDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final SparkScanSettingsDeserializer f18115a;
    private final Function1 b;
    private final Function0 c;

    /* renamed from: d, reason: from kotlin metadata */
    private SparkScanDeserializerListener listener;

    @VisibleForTesting
    public SparkScanDeserializer(@NotNull SparkScanSettingsDeserializer settingsDeserializer, @NotNull Function1<? super Set<? extends CapturePreset>, SparkScanSettings> settingsFactory, @NotNull Function0<SparkScan> modeFactory) {
        Intrinsics.h(settingsDeserializer, "settingsDeserializer");
        Intrinsics.h(settingsFactory, "settingsFactory");
        Intrinsics.h(modeFactory, "modeFactory");
        this.f18115a = settingsDeserializer;
        this.b = settingsFactory;
        this.c = modeFactory;
    }

    private final void a(SparkScan sparkScan, JsonValue jsonValue) throws JSONException {
        SparkScanDeserializerListener sparkScanDeserializerListener = this.listener;
        if (sparkScanDeserializerListener != null) {
            sparkScanDeserializerListener.onModeDeserializationStarted(this, sparkScan, jsonValue);
        }
        String byKeyAsString = jsonValue.getByKeyAsString("type", "");
        if (!Intrinsics.c(byKeyAsString, "sparkScan")) {
            throw new JSONException(i.a('\"', "invalid type, \"sparkScan\" expected, but found \"", byKeyAsString));
        }
        JsonValue byKeyAsObject = jsonValue.getByKeyAsObject("settings", new JsonValue("{}"));
        if (byKeyAsObject == null) {
            byKeyAsObject = new JsonValue("{}");
        }
        SparkScanSettings sparkScanSettings = (SparkScanSettings) this.b.invoke(this.f18115a.a(byKeyAsObject));
        SparkScanDeserializerListener sparkScanDeserializerListener2 = this.listener;
        if (sparkScanDeserializerListener2 != null) {
            sparkScanDeserializerListener2.onSettingsDeserializationStarted(this, sparkScanSettings, byKeyAsObject);
        }
        this.f18115a.a(sparkScanSettings, byKeyAsObject);
        SparkScanDeserializerListener sparkScanDeserializerListener3 = this.listener;
        if (sparkScanDeserializerListener3 != null) {
            sparkScanDeserializerListener3.onSettingsDeserializationFinished(this, sparkScanSettings, byKeyAsObject);
        }
        sparkScan.applySettings(sparkScanSettings);
        SparkScanDeserializerListener sparkScanDeserializerListener4 = this.listener;
        if (sparkScanDeserializerListener4 != null) {
            sparkScanDeserializerListener4.onModeDeserializationFinished(this, sparkScan, jsonValue);
        }
    }

    @Nullable
    public final SparkScanDeserializerListener getListener() {
        return this.listener;
    }

    @NotNull
    public final SparkScan modeFromJson(@NotNull String jsonData) throws JSONException {
        Intrinsics.h(jsonData, "jsonData");
        JsonValue jsonValue = new JsonValue(jsonData);
        SparkScan sparkScan = (SparkScan) this.c.invoke();
        a(sparkScan, jsonValue);
        return sparkScan;
    }

    public final void setListener(@Nullable SparkScanDeserializerListener sparkScanDeserializerListener) {
        this.listener = sparkScanDeserializerListener;
    }

    @NotNull
    public final SparkScanSettings settingsFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        JsonValue jsonValue = new JsonValue(jsonData);
        SparkScanSettings sparkScanSettings = (SparkScanSettings) this.b.invoke(this.f18115a.a(jsonValue));
        SparkScanDeserializerListener sparkScanDeserializerListener = this.listener;
        if (sparkScanDeserializerListener != null) {
            sparkScanDeserializerListener.onSettingsDeserializationStarted(this, sparkScanSettings, jsonValue);
        }
        this.f18115a.a(sparkScanSettings, jsonValue);
        SparkScanDeserializerListener sparkScanDeserializerListener2 = this.listener;
        if (sparkScanDeserializerListener2 != null) {
            sparkScanDeserializerListener2.onSettingsDeserializationFinished(this, sparkScanSettings, jsonValue);
        }
        return sparkScanSettings;
    }

    @NotNull
    public final SparkScan updateModeFromJson(@NotNull SparkScan mode, @NotNull String jsonData) throws JSONException {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        a(mode, new JsonValue(jsonData));
        return mode;
    }

    @NotNull
    public final SparkScanSettings updateSettingsFromJson(@NotNull SparkScanSettings settings, @NotNull String jsonData) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(jsonData, "jsonData");
        JsonValue jsonValue = new JsonValue(jsonData);
        SparkScanDeserializerListener sparkScanDeserializerListener = this.listener;
        if (sparkScanDeserializerListener != null) {
            sparkScanDeserializerListener.onSettingsDeserializationStarted(this, settings, jsonValue);
        }
        this.f18115a.a(settings, jsonValue);
        SparkScanDeserializerListener sparkScanDeserializerListener2 = this.listener;
        if (sparkScanDeserializerListener2 != null) {
            sparkScanDeserializerListener2.onSettingsDeserializationFinished(this, settings, jsonValue);
        }
        return settings;
    }

    public SparkScanDeserializer() {
        this(new Ya(), a.f18117a, b.f18118a);
    }
}
