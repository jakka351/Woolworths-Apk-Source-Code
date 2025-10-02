package com.scandit.datacapture.barcode.count.feedback;

import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.sdk.feedback.BarcodeCountFeedbackDeserializer;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.feedback.ResourceSound;
import com.scandit.datacapture.core.common.feedback.Vibration;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\t\b\u0016¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\nR*\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R*\u0010\u001c\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback;", "", "", "emitSuccess$scandit_barcode_capture", "()V", "emitSuccess", "emitUnrecognized$scandit_barcode_capture", "emitUnrecognized", "emitFailure$scandit_barcode_capture", "emitFailure", "", "toJson", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "value", "a", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "getSuccess", "()Lcom/scandit/datacapture/core/common/feedback/Feedback;", "setSuccess", "(Lcom/scandit/datacapture/core/common/feedback/Feedback;)V", "success", "b", "getUnrecognized", "setUnrecognized", "unrecognized", "c", "getFailure", "setFailure", "failure", "<init>", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountFeedback {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Feedback success;

    /* renamed from: b, reason: from kotlin metadata */
    private Feedback unrecognized;

    /* renamed from: c, reason: from kotlin metadata */
    private Feedback failure;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u001f\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback$Companion;", "", "Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback;", "defaultFeedback", "", "soundEnabled", "vibrationEnabled", "defaultFeedback$scandit_barcode_capture", "(ZZ)Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback;", "", "json", "fromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BarcodeCountFeedback defaultFeedback() {
            return defaultFeedback$scandit_barcode_capture(true, true);
        }

        @NotNull
        public final BarcodeCountFeedback defaultFeedback$scandit_barcode_capture(boolean soundEnabled, boolean vibrationEnabled) {
            return new BarcodeCountFeedback(new Feedback(vibrationEnabled ? Vibration.INSTANCE.defaultVibration() : null, soundEnabled ? new ResourceSound(R.raw.sc_barcode_count_success) : null), new Feedback(vibrationEnabled ? Vibration.INSTANCE.defaultVibration() : null, soundEnabled ? new ResourceSound(R.raw.sc_barcode_count_unrecognized) : null), new Feedback(vibrationEnabled ? Vibration.INSTANCE.defaultVibration() : null, soundEnabled ? new ResourceSound(R.raw.sc_barcode_count_failure) : null), null);
        }

        @JvmStatic
        @NotNull
        public final BarcodeCountFeedback fromJson(@NotNull String json) {
            Intrinsics.h(json, "json");
            return BarcodeCountFeedbackDeserializer.fromJson(new JsonValue(json));
        }

        private Companion() {
        }
    }

    public /* synthetic */ BarcodeCountFeedback(Feedback feedback, Feedback feedback2, Feedback feedback3, DefaultConstructorMarker defaultConstructorMarker) {
        this(feedback, feedback2, feedback3);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCountFeedback defaultFeedback() {
        return INSTANCE.defaultFeedback();
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCountFeedback fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    public final void emitFailure$scandit_barcode_capture() {
        this.failure.emit();
    }

    public final void emitSuccess$scandit_barcode_capture() {
        this.success.emit();
    }

    public final void emitUnrecognized$scandit_barcode_capture() {
        this.unrecognized.emit();
    }

    @NotNull
    public final Feedback getFailure() {
        return this.failure;
    }

    @NotNull
    public final Feedback getSuccess() {
        return this.success;
    }

    @NotNull
    public final Feedback getUnrecognized() {
        return this.unrecognized;
    }

    public final void setFailure(@NotNull Feedback value) {
        Intrinsics.h(value, "value");
        this.failure.release();
        this.failure = value;
    }

    public final void setSuccess(@NotNull Feedback value) {
        Intrinsics.h(value, "value");
        this.success.release();
        this.success = value;
    }

    public final void setUnrecognized(@NotNull Feedback value) {
        Intrinsics.h(value, "value");
        this.unrecognized.release();
        this.unrecognized = value;
    }

    @NotNull
    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", new JSONObject(this.success.toJson()));
        jSONObject.put("unrecognized", new JSONObject(this.unrecognized.toJson()));
        jSONObject.put("failure", new JSONObject(this.failure.toJson()));
        String string = jSONObject.toString();
        Intrinsics.g(string, "JSONObject().apply {\n   …Json()))\n    }.toString()");
        return string;
    }

    private BarcodeCountFeedback(Feedback feedback, Feedback feedback2, Feedback feedback3) {
        this.success = feedback;
        this.unrecognized = feedback2;
        this.failure = feedback3;
    }

    public BarcodeCountFeedback() {
        this(new Feedback(null, null), new Feedback(null, null), new Feedback(null, null));
    }
}
