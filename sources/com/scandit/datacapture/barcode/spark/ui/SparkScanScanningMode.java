package com.scandit.datacapture.barcode.spark.ui;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningModeDefault;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningModeTarget;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "", "Default", "Target", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode$Default;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode$Target;", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public abstract class SparkScanScanningMode {
    public /* synthetic */ SparkScanScanningMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SparkScanScanningMode() {
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"B\u0019\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0019¢\u0006\u0004\b!\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010 \u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode$Default;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "component1", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;", "component2", "scanningBehavior", "previewBehavior", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "getScanningBehavior", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "b", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;", "getPreviewBehavior", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningPrecision;", "c", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningPrecision;", "getScanningPrecision", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningPrecision;", "getScanningPrecision$annotations", "()V", "scanningPrecision", "<init>", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;)V", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningPrecision;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Default extends SparkScanScanningMode {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final SparkScanScanningBehavior scanningBehavior;

        /* renamed from: b, reason: from kotlin metadata */
        private final SparkScanPreviewBehavior previewBehavior;

        /* renamed from: c, reason: from kotlin metadata */
        private final SparkScanScanningPrecision scanningPrecision;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Default(@NotNull SparkScanScanningBehavior scanningBehavior, @NotNull SparkScanPreviewBehavior previewBehavior) {
            super(null);
            Intrinsics.h(scanningBehavior, "scanningBehavior");
            Intrinsics.h(previewBehavior, "previewBehavior");
            this.scanningBehavior = scanningBehavior;
            this.previewBehavior = previewBehavior;
            NativeSparkScanScanningModeDefault.create(SparkScanScanningBehavior.INSTANCE._toNativeEnum$scandit_barcode_capture(scanningBehavior), SparkScanPreviewBehavior.INSTANCE._toNativeEnum$scandit_barcode_capture(previewBehavior));
            this.scanningPrecision = SparkScanScanningPrecision.DEFAULT;
        }

        public static /* synthetic */ Default copy$default(Default r0, SparkScanScanningBehavior sparkScanScanningBehavior, SparkScanPreviewBehavior sparkScanPreviewBehavior, int i, Object obj) {
            if ((i & 1) != 0) {
                sparkScanScanningBehavior = r0.scanningBehavior;
            }
            if ((i & 2) != 0) {
                sparkScanPreviewBehavior = r0.previewBehavior;
            }
            return r0.copy(sparkScanScanningBehavior, sparkScanPreviewBehavior);
        }

        @Deprecated
        public static /* synthetic */ void getScanningPrecision$annotations() {
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SparkScanScanningBehavior getScanningBehavior() {
            return this.scanningBehavior;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final SparkScanPreviewBehavior getPreviewBehavior() {
            return this.previewBehavior;
        }

        @NotNull
        public final Default copy(@NotNull SparkScanScanningBehavior scanningBehavior, @NotNull SparkScanPreviewBehavior previewBehavior) {
            Intrinsics.h(scanningBehavior, "scanningBehavior");
            Intrinsics.h(previewBehavior, "previewBehavior");
            return new Default(scanningBehavior, previewBehavior);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Default)) {
                return false;
            }
            Default r5 = (Default) other;
            return this.scanningBehavior == r5.scanningBehavior && this.previewBehavior == r5.previewBehavior;
        }

        @NotNull
        public final SparkScanPreviewBehavior getPreviewBehavior() {
            return this.previewBehavior;
        }

        @NotNull
        public final SparkScanScanningBehavior getScanningBehavior() {
            return this.scanningBehavior;
        }

        @NotNull
        public final SparkScanScanningPrecision getScanningPrecision() {
            return this.scanningPrecision;
        }

        public int hashCode() {
            return this.previewBehavior.hashCode() + (this.scanningBehavior.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Default(scanningBehavior=" + this.scanningBehavior + ", previewBehavior=" + this.previewBehavior + ')';
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public Default(@NotNull SparkScanScanningBehavior scanningBehavior, @NotNull SparkScanScanningPrecision scanningPrecision) {
            this(scanningBehavior, SparkScanPreviewBehavior.DEFAULT);
            Intrinsics.h(scanningBehavior, "scanningBehavior");
            Intrinsics.h(scanningPrecision, "scanningPrecision");
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"B\u0019\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0019¢\u0006\u0004\b!\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010 \u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode$Target;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "component1", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;", "component2", "scanningBehavior", "previewBehavior", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "getScanningBehavior", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "b", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;", "getPreviewBehavior", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningPrecision;", "c", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningPrecision;", "getScanningPrecision", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningPrecision;", "getScanningPrecision$annotations", "()V", "scanningPrecision", "<init>", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;)V", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningPrecision;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Target extends SparkScanScanningMode {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final SparkScanScanningBehavior scanningBehavior;

        /* renamed from: b, reason: from kotlin metadata */
        private final SparkScanPreviewBehavior previewBehavior;

        /* renamed from: c, reason: from kotlin metadata */
        private final SparkScanScanningPrecision scanningPrecision;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Target(@NotNull SparkScanScanningBehavior scanningBehavior, @NotNull SparkScanPreviewBehavior previewBehavior) {
            super(null);
            Intrinsics.h(scanningBehavior, "scanningBehavior");
            Intrinsics.h(previewBehavior, "previewBehavior");
            this.scanningBehavior = scanningBehavior;
            this.previewBehavior = previewBehavior;
            NativeSparkScanScanningModeTarget.create(SparkScanScanningBehavior.INSTANCE._toNativeEnum$scandit_barcode_capture(scanningBehavior), SparkScanPreviewBehavior.INSTANCE._toNativeEnum$scandit_barcode_capture(previewBehavior));
            this.scanningPrecision = SparkScanScanningPrecision.DEFAULT;
        }

        public static /* synthetic */ Target copy$default(Target target, SparkScanScanningBehavior sparkScanScanningBehavior, SparkScanPreviewBehavior sparkScanPreviewBehavior, int i, Object obj) {
            if ((i & 1) != 0) {
                sparkScanScanningBehavior = target.scanningBehavior;
            }
            if ((i & 2) != 0) {
                sparkScanPreviewBehavior = target.previewBehavior;
            }
            return target.copy(sparkScanScanningBehavior, sparkScanPreviewBehavior);
        }

        @Deprecated
        public static /* synthetic */ void getScanningPrecision$annotations() {
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SparkScanScanningBehavior getScanningBehavior() {
            return this.scanningBehavior;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final SparkScanPreviewBehavior getPreviewBehavior() {
            return this.previewBehavior;
        }

        @NotNull
        public final Target copy(@NotNull SparkScanScanningBehavior scanningBehavior, @NotNull SparkScanPreviewBehavior previewBehavior) {
            Intrinsics.h(scanningBehavior, "scanningBehavior");
            Intrinsics.h(previewBehavior, "previewBehavior");
            return new Target(scanningBehavior, previewBehavior);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Target)) {
                return false;
            }
            Target target = (Target) other;
            return this.scanningBehavior == target.scanningBehavior && this.previewBehavior == target.previewBehavior;
        }

        @NotNull
        public final SparkScanPreviewBehavior getPreviewBehavior() {
            return this.previewBehavior;
        }

        @NotNull
        public final SparkScanScanningBehavior getScanningBehavior() {
            return this.scanningBehavior;
        }

        @NotNull
        public final SparkScanScanningPrecision getScanningPrecision() {
            return this.scanningPrecision;
        }

        public int hashCode() {
            return this.previewBehavior.hashCode() + (this.scanningBehavior.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Target(scanningBehavior=" + this.scanningBehavior + ", previewBehavior=" + this.previewBehavior + ')';
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public Target(@NotNull SparkScanScanningBehavior scanningBehavior, @NotNull SparkScanScanningPrecision scanningPrecision) {
            this(scanningBehavior, SparkScanPreviewBehavior.DEFAULT);
            Intrinsics.h(scanningBehavior, "scanningBehavior");
            Intrinsics.h(scanningPrecision, "scanningPrecision");
        }
    }
}
