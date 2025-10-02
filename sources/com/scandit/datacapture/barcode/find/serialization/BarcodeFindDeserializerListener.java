package com.scandit.datacapture.barcode.find.serialization;

import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindSettings;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializerListener;", "", "onModeDeserializationFinished", "", "deserializer", "Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializer;", "mode", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "onModeDeserializationStarted", "onSettingsDeserializationFinished", "settings", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;", "onSettingsDeserializationStarted", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodeFindDeserializerListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onModeDeserializationFinished(@NotNull BarcodeFindDeserializerListener barcodeFindDeserializerListener, @NotNull BarcodeFindDeserializer deserializer, @NotNull BarcodeFind mode, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(mode, "mode");
            Intrinsics.h(json, "json");
        }

        public static void onModeDeserializationStarted(@NotNull BarcodeFindDeserializerListener barcodeFindDeserializerListener, @NotNull BarcodeFindDeserializer deserializer, @NotNull BarcodeFind mode, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(mode, "mode");
            Intrinsics.h(json, "json");
        }

        public static void onSettingsDeserializationFinished(@NotNull BarcodeFindDeserializerListener barcodeFindDeserializerListener, @NotNull BarcodeFindDeserializer deserializer, @NotNull BarcodeFindSettings settings, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(settings, "settings");
            Intrinsics.h(json, "json");
        }

        public static void onSettingsDeserializationStarted(@NotNull BarcodeFindDeserializerListener barcodeFindDeserializerListener, @NotNull BarcodeFindDeserializer deserializer, @NotNull BarcodeFindSettings settings, @NotNull JsonValue json) {
            Intrinsics.h(deserializer, "deserializer");
            Intrinsics.h(settings, "settings");
            Intrinsics.h(json, "json");
        }
    }

    void onModeDeserializationFinished(@NotNull BarcodeFindDeserializer deserializer, @NotNull BarcodeFind mode, @NotNull JsonValue json);

    void onModeDeserializationStarted(@NotNull BarcodeFindDeserializer deserializer, @NotNull BarcodeFind mode, @NotNull JsonValue json);

    void onSettingsDeserializationFinished(@NotNull BarcodeFindDeserializer deserializer, @NotNull BarcodeFindSettings settings, @NotNull JsonValue json);

    void onSettingsDeserializationStarted(@NotNull BarcodeFindDeserializer deserializer, @NotNull BarcodeFindSettings settings, @NotNull JsonValue json);
}
