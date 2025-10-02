package com.scandit.datacapture.barcode.spark.serialization;

import androidx.annotation.VisibleForTesting;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreviewDimension;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/serialization/SparkScanViewMiniPreviewDimensionDeserializer;", "", "", "json", "Lcom/scandit/datacapture/barcode/internal/module/spark/ui/minipreview/SparkScanViewMiniPreviewDimension;", "fromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@VisibleForTesting
/* loaded from: classes6.dex */
public final class SparkScanViewMiniPreviewDimensionDeserializer {

    @NotNull
    public static final SparkScanViewMiniPreviewDimensionDeserializer INSTANCE = new SparkScanViewMiniPreviewDimensionDeserializer();

    private SparkScanViewMiniPreviewDimensionDeserializer() {
    }

    @JvmStatic
    @NotNull
    public static final SparkScanViewMiniPreviewDimension fromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        int iHashCode = json.hashCode();
        if (iHashCode != -1078030475) {
            if (iHashCode != 102742843) {
                if (iHashCode == 109548807 && json.equals("small")) {
                    return SparkScanViewMiniPreviewDimension.SMALL;
                }
            } else if (json.equals("large")) {
                return SparkScanViewMiniPreviewDimension.LARGE;
            }
        } else if (json.equals("medium")) {
            return SparkScanViewMiniPreviewDimension.MEDIUM;
        }
        throw new IllegalArgumentException("No match found for ".concat(json));
    }
}
