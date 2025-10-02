package com.scandit.datacapture.barcode.spark.serialization;

import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningPrecision;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/serialization/SparkScanScanningPrecisionSerializer;", "", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningPrecision;", "scanningPrecision", "", "toJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SparkScanScanningPrecisionSerializer {

    @NotNull
    public static final SparkScanScanningPrecisionSerializer INSTANCE = new SparkScanScanningPrecisionSerializer();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SparkScanScanningPrecision.values().length];
            try {
                iArr[SparkScanScanningPrecision.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SparkScanScanningPrecision.ACCURATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SparkScanScanningPrecisionSerializer() {
    }

    @JvmStatic
    @NotNull
    public static final String toJson(@NotNull SparkScanScanningPrecision scanningPrecision) {
        Intrinsics.h(scanningPrecision, "scanningPrecision");
        int i = WhenMappings.$EnumSwitchMapping$0[scanningPrecision.ordinal()];
        if (i == 1) {
            return "default";
        }
        if (i == 2) {
            return "accurate";
        }
        throw new NoWhenBranchMatchedException();
    }
}
