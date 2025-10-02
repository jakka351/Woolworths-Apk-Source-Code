package com.scandit.datacapture.barcode.internal.sdk.feedback;

import com.scandit.datacapture.barcode.spark.feedback.SparkScanBarcodeFeedback;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/feedback/SparkScanBarcodeFeedbackDeserializer;", "", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback;", "fromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SparkScanBarcodeFeedbackDeserializer {

    @NotNull
    public static final SparkScanBarcodeFeedbackDeserializer INSTANCE = new SparkScanBarcodeFeedbackDeserializer();

    private SparkScanBarcodeFeedbackDeserializer() {
    }

    @JvmStatic
    @NotNull
    public static final SparkScanBarcodeFeedback fromJson(@NotNull JsonValue json) {
        Intrinsics.h(json, "json");
        String byKeyAsString = json.getByKeyAsString("type", "success");
        if (Intrinsics.c(byKeyAsString, "success")) {
            JsonValue byKeyAsObject = json.getByKeyAsObject("barcodeFeedback", null);
            if (byKeyAsObject == null) {
                byKeyAsObject = new JsonValue("{}");
            }
            return SparkScanBarcodeSuccessFeedbackDeserializer.fromJson(byKeyAsObject);
        }
        if (Intrinsics.c(byKeyAsString, "error")) {
            return SparkScanBarcodeErrorFeedbackDeserializer.fromJson(json.requireByKeyAsObject("barcodeFeedback"));
        }
        throw new IllegalStateException(("Unknown type: " + byKeyAsString + " when deserializing").toString());
    }
}
