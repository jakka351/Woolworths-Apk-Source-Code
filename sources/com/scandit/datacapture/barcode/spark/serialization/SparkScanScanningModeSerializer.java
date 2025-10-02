package com.scandit.datacapture.barcode.spark.serialization;

import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/serialization/SparkScanScanningModeSerializer;", "", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "scanningMode", "", "toJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SparkScanScanningModeSerializer {

    @NotNull
    public static final SparkScanScanningModeSerializer INSTANCE = new SparkScanScanningModeSerializer();

    private SparkScanScanningModeSerializer() {
    }

    @JvmStatic
    @NotNull
    public static final String toJson(@NotNull SparkScanScanningMode scanningMode) throws JSONException {
        JSONObject jSONObject;
        Intrinsics.h(scanningMode, "scanningMode");
        if (scanningMode instanceof SparkScanScanningMode.Default) {
            jSONObject = new JSONObject();
            jSONObject.put("type", "default");
            SparkScanScanningMode.Default r6 = (SparkScanScanningMode.Default) scanningMode;
            INSTANCE.getClass();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("scanningBehavior", SparkScanScanningBehaviorSerializer.toJson(r6.getScanningBehavior()));
            jSONObject2.put("previewBehavior", SparkScanPreviewBehaviorSerializer.toJson(r6.getPreviewBehavior()));
            jSONObject.put("settings", jSONObject2);
        } else {
            if (!(scanningMode instanceof SparkScanScanningMode.Target)) {
                throw new NoWhenBranchMatchedException();
            }
            jSONObject = new JSONObject();
            jSONObject.put("type", "target");
            SparkScanScanningMode.Target target = (SparkScanScanningMode.Target) scanningMode;
            INSTANCE.getClass();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("scanningBehavior", SparkScanScanningBehaviorSerializer.toJson(target.getScanningBehavior()));
            jSONObject3.put("previewBehavior", SparkScanPreviewBehaviorSerializer.toJson(target.getPreviewBehavior()));
            jSONObject.put("settings", jSONObject3);
        }
        String string = jSONObject.toString();
        Intrinsics.g(string, "when (scanningMode) {\n  …       }\n    }.toString()");
        return string;
    }
}
