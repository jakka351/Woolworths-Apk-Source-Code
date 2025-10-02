package com.scandit.datacapture.barcode.spark.feedback;

import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.sdk.feedback.SparkScanFeedbackDeserializer;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.feedback.ResourceSound;
import com.scandit.datacapture.core.common.feedback.Vibration;
import com.scandit.datacapture.core.common.feedback.WaveFormVibration;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.time.TimeInterval;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\t\b\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0006\u0010\b\u001a\u00020\u0007R*\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanFeedback;", "", "other", "", "equals", "", "hashCode", "", "toJson", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "value", "a", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "getSuccess", "()Lcom/scandit/datacapture/core/common/feedback/Feedback;", "setSuccess", "(Lcom/scandit/datacapture/core/common/feedback/Feedback;)V", "success", "b", "getError", "setError", "error", "<init>", "()V", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SparkScanFeedback {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Feedback success;

    /* renamed from: b, reason: from kotlin metadata */
    private Feedback error;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanFeedback$Companion;", "", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanFeedback;", "defaultFeedback", "", "json", "fromJson", "", "DEFAULT_ERROR_VIBRATION_DURATION", "J", "DEFAULT_SUCCESS_VIBRATION_DURATION", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SparkScanFeedback defaultFeedback() {
            ResourceSound resourceSound = new ResourceSound(R.raw.sc_spark_success_beep);
            WaveFormVibration waveFormVibration = new WaveFormVibration(new long[]{20, 40, 100, 60}, new int[]{0, 255, 0, 255});
            TimeInterval.Companion companion = TimeInterval.INSTANCE;
            waveFormVibration.setDuration(companion.millis(300L));
            Feedback feedback = new Feedback(waveFormVibration, resourceSound);
            ResourceSound resourceSound2 = new ResourceSound(R.raw.sc_barcode_count_failure);
            Vibration vibration = new Vibration();
            vibration.setDuration(companion.millis(600L));
            return new SparkScanFeedback(feedback, new Feedback(vibration, resourceSound2), null);
        }

        @JvmStatic
        @NotNull
        public final SparkScanFeedback fromJson(@NotNull String json) {
            Intrinsics.h(json, "json");
            return SparkScanFeedbackDeserializer.fromJson(new JsonValue(json));
        }

        private Companion() {
        }
    }

    public /* synthetic */ SparkScanFeedback(Feedback feedback, Feedback feedback2, DefaultConstructorMarker defaultConstructorMarker) {
        this(feedback, feedback2);
    }

    @JvmStatic
    @NotNull
    public static final SparkScanFeedback defaultFeedback() {
        return INSTANCE.defaultFeedback();
    }

    @JvmStatic
    @NotNull
    public static final SparkScanFeedback fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SparkScanFeedback)) {
            return false;
        }
        SparkScanFeedback sparkScanFeedback = (SparkScanFeedback) other;
        return Intrinsics.c(this.success, sparkScanFeedback.success) && Intrinsics.c(this.error, sparkScanFeedback.error);
    }

    @NotNull
    public final Feedback getError() {
        return this.error;
    }

    @NotNull
    public final Feedback getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return this.error.hashCode() + (this.success.hashCode() * 31);
    }

    public final void setError(@NotNull Feedback value) {
        Intrinsics.h(value, "value");
        this.error.release();
        this.error = value;
    }

    public final void setSuccess(@NotNull Feedback value) {
        Intrinsics.h(value, "value");
        this.success.release();
        this.success = value;
    }

    @NotNull
    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", new JSONObject(this.success.toJson()));
        jSONObject.put("error", new JSONObject(this.error.toJson()));
        String string = jSONObject.toString();
        Intrinsics.g(string, "JSONObject().apply {\n   …Json()))\n    }.toString()");
        return string;
    }

    private SparkScanFeedback(Feedback feedback, Feedback feedback2) {
        this.success = feedback;
        this.error = feedback2;
    }

    public SparkScanFeedback() {
        this(new Feedback(null, null), new Feedback(null, null));
    }
}
