package com.scandit.datacapture.barcode.spark.ui;

import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\f\u0010\t\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a$\u0010\n\u001a\u00020\u0002*\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"previewBehavior", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "getPreviewBehavior", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;)Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;", "scanningBehavior", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "getScanningBehavior", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;)Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "changeMode", "copyWith", "newBehavior", "newPreviewBehavior", "scandit-barcode-capture"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SparkScanScanningModeKt {
    @NotNull
    public static final SparkScanScanningMode changeMode(@NotNull SparkScanScanningMode sparkScanScanningMode) {
        Intrinsics.h(sparkScanScanningMode, "<this>");
        if (sparkScanScanningMode instanceof SparkScanScanningMode.Target) {
            SparkScanScanningMode.Target target = (SparkScanScanningMode.Target) sparkScanScanningMode;
            return new SparkScanScanningMode.Default(target.getScanningBehavior(), target.getPreviewBehavior());
        }
        if (!(sparkScanScanningMode instanceof SparkScanScanningMode.Default)) {
            throw new NoWhenBranchMatchedException();
        }
        SparkScanScanningMode.Default r2 = (SparkScanScanningMode.Default) sparkScanScanningMode;
        return new SparkScanScanningMode.Target(r2.getScanningBehavior(), r2.getPreviewBehavior());
    }

    @NotNull
    public static final SparkScanScanningMode copyWith(@NotNull SparkScanScanningMode sparkScanScanningMode, @Nullable SparkScanScanningBehavior sparkScanScanningBehavior, @Nullable SparkScanPreviewBehavior sparkScanPreviewBehavior) {
        Intrinsics.h(sparkScanScanningMode, "<this>");
        if (sparkScanScanningMode instanceof SparkScanScanningMode.Target) {
            if (sparkScanScanningBehavior == null) {
                sparkScanScanningBehavior = ((SparkScanScanningMode.Target) sparkScanScanningMode).getScanningBehavior();
            }
            if (sparkScanPreviewBehavior == null) {
                sparkScanPreviewBehavior = ((SparkScanScanningMode.Target) sparkScanScanningMode).getPreviewBehavior();
            }
            return new SparkScanScanningMode.Target(sparkScanScanningBehavior, sparkScanPreviewBehavior);
        }
        if (!(sparkScanScanningMode instanceof SparkScanScanningMode.Default)) {
            throw new NoWhenBranchMatchedException();
        }
        if (sparkScanScanningBehavior == null) {
            sparkScanScanningBehavior = ((SparkScanScanningMode.Default) sparkScanScanningMode).getScanningBehavior();
        }
        if (sparkScanPreviewBehavior == null) {
            sparkScanPreviewBehavior = ((SparkScanScanningMode.Default) sparkScanScanningMode).getPreviewBehavior();
        }
        return new SparkScanScanningMode.Default(sparkScanScanningBehavior, sparkScanPreviewBehavior);
    }

    public static /* synthetic */ SparkScanScanningMode copyWith$default(SparkScanScanningMode sparkScanScanningMode, SparkScanScanningBehavior sparkScanScanningBehavior, SparkScanPreviewBehavior sparkScanPreviewBehavior, int i, Object obj) {
        if ((i & 1) != 0) {
            sparkScanScanningBehavior = null;
        }
        if ((i & 2) != 0) {
            sparkScanPreviewBehavior = null;
        }
        return copyWith(sparkScanScanningMode, sparkScanScanningBehavior, sparkScanPreviewBehavior);
    }

    @NotNull
    public static final SparkScanPreviewBehavior getPreviewBehavior(@NotNull SparkScanScanningMode sparkScanScanningMode) {
        Intrinsics.h(sparkScanScanningMode, "<this>");
        if (sparkScanScanningMode instanceof SparkScanScanningMode.Target) {
            return ((SparkScanScanningMode.Target) sparkScanScanningMode).getPreviewBehavior();
        }
        if (sparkScanScanningMode instanceof SparkScanScanningMode.Default) {
            return ((SparkScanScanningMode.Default) sparkScanScanningMode).getPreviewBehavior();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final SparkScanScanningBehavior getScanningBehavior(@NotNull SparkScanScanningMode sparkScanScanningMode) {
        Intrinsics.h(sparkScanScanningMode, "<this>");
        if (sparkScanScanningMode instanceof SparkScanScanningMode.Target) {
            return ((SparkScanScanningMode.Target) sparkScanScanningMode).getScanningBehavior();
        }
        if (sparkScanScanningMode instanceof SparkScanScanningMode.Default) {
            return ((SparkScanScanningMode.Default) sparkScanScanningMode).getScanningBehavior();
        }
        throw new NoWhenBranchMatchedException();
    }
}
