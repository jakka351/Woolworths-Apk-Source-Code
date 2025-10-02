package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.data.CapturePreset;
import com.scandit.datacapture.barcode.internal.module.spark.serialization.SparkScanSettingsDeserializer;
import com.scandit.datacapture.barcode.spark.capture.SparkScanSettings;
import com.scandit.datacapture.barcode.spark.serialization.BatterySavingModeDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ya implements SparkScanSettingsDeserializer {
    @Override // com.scandit.datacapture.barcode.internal.module.spark.serialization.SparkScanSettingsDeserializer
    public final void a(SparkScanSettings settings, JsonValue json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        settings.getF18089a().updateFromJson(json.getF18778a());
        if (json.contains("batterySaving")) {
            settings.setBatterySaving(BatterySavingModeDeserializer.fromJson(json.requireByKeyAsString("batterySaving")));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.serialization.SparkScanSettingsDeserializer
    public final LinkedHashSet a(JsonValue json) {
        CapturePreset capturePreset;
        Intrinsics.h(json, "json");
        if (!json.contains("capturePresets")) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        JsonValue jsonValueRequireByKeyAsArray = json.requireByKeyAsArray("capturePresets");
        int size = (int) jsonValueRequireByKeyAsArray.getSize();
        for (int i = 0; i < size; i++) {
            JsonValue jsonValueRequireByIndex = jsonValueRequireByKeyAsArray.requireByIndex(i);
            CapturePreset[] capturePresetArrValues = CapturePreset.values();
            int length = capturePresetArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    capturePreset = null;
                    break;
                }
                capturePreset = capturePresetArrValues[i2];
                String lowerCase = capturePreset.name().toLowerCase(Locale.ROOT);
                Intrinsics.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (lowerCase.equals(jsonValueRequireByIndex.asString())) {
                    break;
                }
                i2++;
            }
            if (capturePreset != null) {
                linkedHashSet.add(capturePreset);
            }
        }
        return linkedHashSet;
    }
}
