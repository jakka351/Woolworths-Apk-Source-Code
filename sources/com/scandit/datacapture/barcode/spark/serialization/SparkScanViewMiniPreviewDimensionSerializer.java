package com.scandit.datacapture.barcode.spark.serialization;

import androidx.annotation.VisibleForTesting;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreviewDimension;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/serialization/SparkScanViewMiniPreviewDimensionSerializer;", "", "Lcom/scandit/datacapture/barcode/internal/module/spark/ui/minipreview/SparkScanViewMiniPreviewDimension;", "dimension", "", "toJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@VisibleForTesting
/* loaded from: classes6.dex */
public final class SparkScanViewMiniPreviewDimensionSerializer {

    @NotNull
    public static final SparkScanViewMiniPreviewDimensionSerializer INSTANCE = new SparkScanViewMiniPreviewDimensionSerializer();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SparkScanViewMiniPreviewDimension.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SparkScanViewMiniPreviewDimensionSerializer() {
    }

    @JvmStatic
    @NotNull
    public static final String toJson(@NotNull SparkScanViewMiniPreviewDimension dimension) {
        Intrinsics.h(dimension, "dimension");
        int i = WhenMappings.$EnumSwitchMapping$0[dimension.ordinal()];
        if (i == 1) {
            return "small";
        }
        if (i == 2) {
            return "medium";
        }
        if (i == 3) {
            return "large";
        }
        throw new NoWhenBranchMatchedException();
    }
}
