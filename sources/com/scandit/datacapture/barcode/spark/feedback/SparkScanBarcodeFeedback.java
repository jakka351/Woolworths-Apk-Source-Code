package com.scandit.datacapture.barcode.spark.feedback;

import com.scandit.datacapture.barcode.AbstractC0618f6;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.sdk.feedback.SparkScanBarcodeFeedbackDeserializer;
import com.scandit.datacapture.barcode.spark.capture.SparkScanViewDefaults;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.feedback.ResourceSound;
import com.scandit.datacapture.core.common.feedback.Vibration;
import com.scandit.datacapture.core.common.feedback.WaveFormVibration;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.time.TimeInterval;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.core.ui.style.BrushSerializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006J\u0006\u0010\u0003\u001a\u00020\u0002\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback;", "", "", "toJson", "Companion", "Error", "Success", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback$Error;", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback$Success;", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public abstract class SparkScanBarcodeFeedback {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback$Companion;", "", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "defaultSuccessFeedback", "defaultErrorFeedback", "", "json", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback;", "fromJson", "", "DEFAULT_ERROR_VIBRATION_DURATION", "J", "DEFAULT_SUCCESS_VIBRATION_DURATION", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Feedback defaultErrorFeedback() {
            ResourceSound resourceSound = new ResourceSound(R.raw.sc_barcode_count_failure);
            Vibration vibration = new Vibration();
            vibration.setDuration(TimeInterval.INSTANCE.millis(600L));
            return new Feedback(vibration, resourceSound);
        }

        @JvmStatic
        @NotNull
        public final Feedback defaultSuccessFeedback() {
            ResourceSound resourceSound = new ResourceSound(R.raw.sc_spark_success_beep);
            WaveFormVibration waveFormVibration = new WaveFormVibration(new long[]{20, 40, 100, 60}, new int[]{0, 255, 0, 255});
            waveFormVibration.setDuration(TimeInterval.INSTANCE.millis(300L));
            return new Feedback(waveFormVibration, resourceSound);
        }

        @JvmStatic
        @NotNull
        public final SparkScanBarcodeFeedback fromJson(@NotNull String json) {
            Intrinsics.h(json, "json");
            return SparkScanBarcodeFeedbackDeserializer.fromJson(new JsonValue(json));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback$Error;", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback;", "", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "Lcom/scandit/datacapture/core/time/TimeInterval;", "b", "Lcom/scandit/datacapture/core/time/TimeInterval;", "getResumeCapturingDelay", "()Lcom/scandit/datacapture/core/time/TimeInterval;", "resumeCapturingDelay", "", "c", "I", "getVisualFeedbackColor", "()I", "visualFeedbackColor", "Lcom/scandit/datacapture/core/ui/style/Brush;", "d", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "brush", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "e", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "getFeedback", "()Lcom/scandit/datacapture/core/common/feedback/Feedback;", "feedback", "<init>", "(Ljava/lang/String;Lcom/scandit/datacapture/core/time/TimeInterval;ILcom/scandit/datacapture/core/ui/style/Brush;Lcom/scandit/datacapture/core/common/feedback/Feedback;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Error extends SparkScanBarcodeFeedback {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* renamed from: b, reason: from kotlin metadata */
        private final TimeInterval resumeCapturingDelay;

        /* renamed from: c, reason: from kotlin metadata */
        private final int visualFeedbackColor;

        /* renamed from: d, reason: from kotlin metadata */
        private final Brush brush;

        /* renamed from: e, reason: from kotlin metadata */
        private final Feedback feedback;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Error(@NotNull String message, @NotNull TimeInterval resumeCapturingDelay) {
            this(message, resumeCapturingDelay, 0, null, null, 28, null);
            Intrinsics.h(message, "message");
            Intrinsics.h(resumeCapturingDelay, "resumeCapturingDelay");
        }

        @NotNull
        public final Brush getBrush() {
            return this.brush;
        }

        @Nullable
        public final Feedback getFeedback() {
            return this.feedback;
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
            this(message, resumeCapturingDelay, i, null, null, 24, null);
            Intrinsics.h(message, "message");
            Intrinsics.h(resumeCapturingDelay, "resumeCapturingDelay");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Error(@NotNull String message, @NotNull TimeInterval resumeCapturingDelay, int i, @NotNull Brush brush) {
            this(message, resumeCapturingDelay, i, brush, null, 16, null);
            Intrinsics.h(message, "message");
            Intrinsics.h(resumeCapturingDelay, "resumeCapturingDelay");
            Intrinsics.h(brush, "brush");
        }

        public /* synthetic */ Error(String str, TimeInterval timeInterval, int i, Brush brush, Feedback feedback, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, timeInterval, (i2 & 4) != 0 ? SparkScanViewDefaults.getDefaultVisualFeedbackErrorColor() : i, (i2 & 8) != 0 ? SparkScanViewDefaults.getDefaultErrorBrush() : brush, (i2 & 16) != 0 ? SparkScanBarcodeFeedback.INSTANCE.defaultErrorFeedback() : feedback);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Error(@NotNull String message, @NotNull TimeInterval resumeCapturingDelay, int i, @NotNull Brush brush, @Nullable Feedback feedback) {
            super(null);
            Intrinsics.h(message, "message");
            Intrinsics.h(resumeCapturingDelay, "resumeCapturingDelay");
            Intrinsics.h(brush, "brush");
            this.message = message;
            this.resumeCapturingDelay = resumeCapturingDelay;
            this.visualFeedbackColor = i;
            this.brush = brush;
            this.feedback = feedback;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback$Success;", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback;", "", "a", "I", "getVisualFeedbackColor", "()I", "visualFeedbackColor", "Lcom/scandit/datacapture/core/ui/style/Brush;", "b", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "brush", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "c", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "getFeedback", "()Lcom/scandit/datacapture/core/common/feedback/Feedback;", "feedback", "<init>", "(ILcom/scandit/datacapture/core/ui/style/Brush;Lcom/scandit/datacapture/core/common/feedback/Feedback;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Success extends SparkScanBarcodeFeedback {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int visualFeedbackColor;

        /* renamed from: b, reason: from kotlin metadata */
        private final Brush brush;

        /* renamed from: c, reason: from kotlin metadata */
        private final Feedback feedback;

        @JvmOverloads
        public Success() {
            this(0, null, null, 7, null);
        }

        @NotNull
        public final Brush getBrush() {
            return this.brush;
        }

        @Nullable
        public final Feedback getFeedback() {
            return this.feedback;
        }

        public final int getVisualFeedbackColor() {
            return this.visualFeedbackColor;
        }

        @JvmOverloads
        public Success(int i) {
            this(i, null, null, 6, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Success(int i, @NotNull Brush brush) {
            this(i, brush, null, 4, null);
            Intrinsics.h(brush, "brush");
        }

        public /* synthetic */ Success(int i, Brush brush, Feedback feedback, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? SparkScanViewDefaults.getDefaultVisualFeedbackSuccessColor() : i, (i2 & 2) != 0 ? SparkScanViewDefaults.getDefaultBrush() : brush, (i2 & 4) != 0 ? SparkScanBarcodeFeedback.INSTANCE.defaultSuccessFeedback() : feedback);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Success(int i, @NotNull Brush brush, @Nullable Feedback feedback) {
            super(null);
            Intrinsics.h(brush, "brush");
            this.visualFeedbackColor = i;
            this.brush = brush;
            this.feedback = feedback;
        }
    }

    public /* synthetic */ SparkScanBarcodeFeedback(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public static final Feedback defaultErrorFeedback() {
        return INSTANCE.defaultErrorFeedback();
    }

    @JvmStatic
    @NotNull
    public static final Feedback defaultSuccessFeedback() {
        return INSTANCE.defaultSuccessFeedback();
    }

    @JvmStatic
    @NotNull
    public static final SparkScanBarcodeFeedback fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    @NotNull
    public final String toJson() throws JSONException {
        JSONObject jSONObject;
        if (this instanceof Error) {
            jSONObject = new JSONObject();
            jSONObject.put("type", "error");
            JSONObject jSONObject2 = new JSONObject();
            Error error = (Error) this;
            jSONObject2.put("visualFeedbackColor", AbstractC0618f6.a(error.getVisualFeedbackColor()));
            if (error.getFeedback() != null) {
                jSONObject2.put("feedback", new JSONObject(error.getFeedback().toJson()));
            }
            jSONObject2.put("message", error.getMessage());
            jSONObject2.put("resumeCapturingDelay", Float.valueOf(error.getResumeCapturingDelay().getF18874a()));
            jSONObject2.put("brush", new JSONObject(BrushSerializer.toJson(error.getBrush())));
            jSONObject.put("barcodeFeedback", jSONObject2);
        } else {
            if (!(this instanceof Success)) {
                throw new NoWhenBranchMatchedException();
            }
            jSONObject = new JSONObject();
            jSONObject.put("type", "success");
            JSONObject jSONObject3 = new JSONObject();
            Success success = (Success) this;
            jSONObject3.put("visualFeedbackColor", AbstractC0618f6.a(success.getVisualFeedbackColor()));
            jSONObject3.put("brush", new JSONObject(BrushSerializer.toJson(success.getBrush())));
            if (success.getFeedback() != null) {
                jSONObject3.put("feedback", new JSONObject(success.getFeedback().toJson()));
            }
            jSONObject.put("barcodeFeedback", jSONObject3);
        }
        String string = jSONObject.toString();
        Intrinsics.g(string, "when (this) {\n          …   }\n        }.toString()");
        return string;
    }

    private SparkScanBarcodeFeedback() {
    }
}
