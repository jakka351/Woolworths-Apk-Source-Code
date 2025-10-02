package com.scandit.datacapture.barcode.internal.sdk.feedback;

import com.scandit.datacapture.barcode.spark.feedback.SparkScanFeedback;
import com.scandit.datacapture.core.internal.sdk.common.feedback.FeedbackDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/feedback/SparkScanFeedbackDeserializer;", "", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanFeedback;", "fromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SparkScanFeedbackDeserializer {

    @NotNull
    public static final SparkScanFeedbackDeserializer INSTANCE = new SparkScanFeedbackDeserializer();

    private SparkScanFeedbackDeserializer() {
    }

    @JvmStatic
    @NotNull
    public static final SparkScanFeedback fromJson(@NotNull JsonValue json) {
        Intrinsics.h(json, "json");
        SparkScanFeedback sparkScanFeedbackDefaultFeedback = SparkScanFeedback.INSTANCE.defaultFeedback();
        JsonValue byKeyAsObject = json.getByKeyAsObject("success", null);
        if (byKeyAsObject != null) {
            sparkScanFeedbackDefaultFeedback.setSuccess(FeedbackDeserializer.fromJson(byKeyAsObject));
        }
        JsonValue byKeyAsObject2 = json.getByKeyAsObject("error", null);
        if (byKeyAsObject2 != null) {
            sparkScanFeedbackDefaultFeedback.setError(FeedbackDeserializer.fromJson(byKeyAsObject2));
        }
        return sparkScanFeedbackDefaultFeedback;
    }
}
