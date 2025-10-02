package com.scandit.datacapture.barcode.spark.serialization;

import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/serialization/SparkScanScanningModeDeserializer;", "", "", "json", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "fromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SparkScanScanningModeDeserializer {

    @NotNull
    public static final SparkScanScanningModeDeserializer INSTANCE = new SparkScanScanningModeDeserializer();

    private SparkScanScanningModeDeserializer() {
    }

    @JvmStatic
    @NotNull
    public static final SparkScanScanningMode fromJson(@NotNull String json) throws JSONException {
        String scanningBehaviorString;
        String previewBehaviorString;
        Intrinsics.h(json, "json");
        JSONObject jSONObject = new JSONObject(json);
        JSONObject settings = jSONObject.getJSONObject("settings");
        String string = jSONObject.getString("type");
        if (Intrinsics.c(string, "default")) {
            SparkScanScanningModeDeserializer sparkScanScanningModeDeserializer = INSTANCE;
            Intrinsics.g(settings, "settings");
            sparkScanScanningModeDeserializer.getClass();
            scanningBehaviorString = settings.has("scanningBehavior") ? settings.getString("scanningBehavior") : "single";
            previewBehaviorString = settings.has("previewBehavior") ? settings.getString("previewBehavior") : "default";
            Intrinsics.g(scanningBehaviorString, "scanningBehaviorString");
            SparkScanScanningBehavior sparkScanScanningBehaviorFromJson = SparkScanScanningBehaviorDeserializer.fromJson(scanningBehaviorString);
            Intrinsics.g(previewBehaviorString, "previewBehaviorString");
            return new SparkScanScanningMode.Default(sparkScanScanningBehaviorFromJson, SparkScanPreviewBehaviorDeserializer.fromJson(previewBehaviorString));
        }
        if (!Intrinsics.c(string, "target")) {
            throw new JSONException(YU.a.A("Invalid scanning mode type: ", string));
        }
        SparkScanScanningModeDeserializer sparkScanScanningModeDeserializer2 = INSTANCE;
        Intrinsics.g(settings, "settings");
        sparkScanScanningModeDeserializer2.getClass();
        scanningBehaviorString = settings.has("scanningBehavior") ? settings.getString("scanningBehavior") : "single";
        previewBehaviorString = settings.has("previewBehavior") ? settings.getString("previewBehavior") : "default";
        Intrinsics.g(scanningBehaviorString, "scanningBehaviorString");
        SparkScanScanningBehavior sparkScanScanningBehaviorFromJson2 = SparkScanScanningBehaviorDeserializer.fromJson(scanningBehaviorString);
        Intrinsics.g(previewBehaviorString, "previewBehaviorString");
        return new SparkScanScanningMode.Target(sparkScanScanningBehaviorFromJson2, SparkScanPreviewBehaviorDeserializer.fromJson(previewBehaviorString));
    }
}
