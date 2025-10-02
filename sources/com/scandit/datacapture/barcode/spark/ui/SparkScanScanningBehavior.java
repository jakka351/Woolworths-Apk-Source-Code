package com.scandit.datacapture.barcode.spark.ui;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningBehavior;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "", "Companion", "SINGLE", "CONTINUOUS", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public enum SparkScanScanningBehavior {
    SINGLE,
    CONTINUOUS;


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior$Companion;", "", "Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanScanningBehavior;", "source", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "_fromNativeEnum$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanScanningBehavior;)Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "_fromNativeEnum", "_toNativeEnum$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;)Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanScanningBehavior;", "_toNativeEnum", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[NativeSparkScanScanningBehavior.values().length];
                try {
                    iArr[NativeSparkScanScanningBehavior.SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NativeSparkScanScanningBehavior.CONTINUOUS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[SparkScanScanningBehavior.values().length];
                try {
                    iArr2[SparkScanScanningBehavior.SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[SparkScanScanningBehavior.CONTINUOUS.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SparkScanScanningBehavior _fromNativeEnum$scandit_barcode_capture(NativeSparkScanScanningBehavior source) {
            Intrinsics.h(source, "source");
            int i = WhenMappings.$EnumSwitchMapping$0[source.ordinal()];
            if (i == 1) {
                return SparkScanScanningBehavior.SINGLE;
            }
            if (i == 2) {
                return SparkScanScanningBehavior.CONTINUOUS;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final NativeSparkScanScanningBehavior _toNativeEnum$scandit_barcode_capture(SparkScanScanningBehavior source) {
            Intrinsics.h(source, "source");
            int i = WhenMappings.$EnumSwitchMapping$1[source.ordinal()];
            if (i == 1) {
                return NativeSparkScanScanningBehavior.SINGLE;
            }
            if (i == 2) {
                return NativeSparkScanScanningBehavior.CONTINUOUS;
            }
            throw new NoWhenBranchMatchedException();
        }

        private Companion() {
        }
    }
}
