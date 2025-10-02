package com.scandit.datacapture.barcode.spark.feedback;

import com.scandit.datacapture.barcode.spark.capture.SparkScanViewDefaults;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import com.scandit.datacapture.core.time.TimeInterval;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanViewFeedback;", "", "Error", "Success", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanViewFeedback$Error;", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanViewFeedback$Success;", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public abstract class SparkScanViewFeedback {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanViewFeedback$Error;", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanViewFeedback;", "", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "Lcom/scandit/datacapture/core/time/TimeInterval;", "b", "Lcom/scandit/datacapture/core/time/TimeInterval;", "getResumeCapturingDelay", "()Lcom/scandit/datacapture/core/time/TimeInterval;", "resumeCapturingDelay", "", "c", "I", "getVisualFeedbackColor", "()I", "visualFeedbackColor", "Lcom/scandit/datacapture/core/ui/style/Brush;", "d", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "brush", "<init>", "(Ljava/lang/String;Lcom/scandit/datacapture/core/time/TimeInterval;ILcom/scandit/datacapture/core/ui/style/Brush;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Error extends SparkScanViewFeedback {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* renamed from: b, reason: from kotlin metadata */
        private final TimeInterval resumeCapturingDelay;

        /* renamed from: c, reason: from kotlin metadata */
        private final int visualFeedbackColor;

        /* renamed from: d, reason: from kotlin metadata */
        private final Brush brush;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Error(@NotNull String message, @NotNull TimeInterval resumeCapturingDelay) {
            this(message, resumeCapturingDelay, 0, null, 12, null);
            Intrinsics.h(message, "message");
            Intrinsics.h(resumeCapturingDelay, "resumeCapturingDelay");
        }

        @NotNull
        public final Brush getBrush() {
            return this.brush;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final TimeInterval getResumeCapturingDelay() {
            return this.resumeCapturingDelay;
        }

        public final int getVisualFeedbackColor() {
            return this.visualFeedbackColor;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Error(@NotNull String message, @NotNull TimeInterval resumeCapturingDelay, int i) {
            this(message, resumeCapturingDelay, i, null, 8, null);
            Intrinsics.h(message, "message");
            Intrinsics.h(resumeCapturingDelay, "resumeCapturingDelay");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Error(String str, TimeInterval timeInterval, int i, Brush brush, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 4) != 0) {
                NativeColor nativeColorDefaultVisualFeedbackErrorColor = NativeSparkScanViewDefaults.defaultVisualFeedbackErrorColor();
                Intrinsics.g(nativeColorDefaultVisualFeedbackErrorColor, "defaultVisualFeedbackErrorColor()");
                i = NativeColorExtensionsKt.toInt(nativeColorDefaultVisualFeedbackErrorColor);
            }
            this(str, timeInterval, i, (i2 & 8) != 0 ? SparkScanViewDefaults.getDefaultErrorBrush() : brush);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Error(@NotNull String message, @NotNull TimeInterval resumeCapturingDelay, int i, @NotNull Brush brush) {
            super(null);
            Intrinsics.h(message, "message");
            Intrinsics.h(resumeCapturingDelay, "resumeCapturingDelay");
            Intrinsics.h(brush, "brush");
            this.message = message;
            this.resumeCapturingDelay = resumeCapturingDelay;
            this.visualFeedbackColor = i;
            this.brush = brush;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanViewFeedback$Success;", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanViewFeedback;", "", "a", "I", "getVisualFeedbackColor", "()I", "visualFeedbackColor", "<init>", "(I)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Success extends SparkScanViewFeedback {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int visualFeedbackColor;

        @JvmOverloads
        public Success() {
            this(0, 1, null);
        }

        public final int getVisualFeedbackColor() {
            return this.visualFeedbackColor;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Success(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 1) != 0) {
                NativeColor nativeColorDefaultVisualFeedbackSuccessColor = NativeSparkScanViewDefaults.defaultVisualFeedbackSuccessColor();
                Intrinsics.g(nativeColorDefaultVisualFeedbackSuccessColor, "defaultVisualFeedbackSuccessColor()");
                i = NativeColorExtensionsKt.toInt(nativeColorDefaultVisualFeedbackSuccessColor);
            }
            this(i);
        }

        @JvmOverloads
        public Success(int i) {
            super(null);
            this.visualFeedbackColor = i;
        }
    }

    public /* synthetic */ SparkScanViewFeedback(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SparkScanViewFeedback() {
    }
}
