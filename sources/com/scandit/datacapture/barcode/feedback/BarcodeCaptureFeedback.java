package com.scandit.datacapture.barcode.feedback;

import com.scandit.datacapture.barcode.internal.sdk.feedback.BarcodeCaptureFeedbackDeserializer;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0006R*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/feedback/BarcodeCaptureFeedback;", "", "", "onScannedSuccessfully$scandit_barcode_capture", "()V", "onScannedSuccessfully", "", "toJson", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "value", "a", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "getSuccess", "()Lcom/scandit/datacapture/core/common/feedback/Feedback;", "setSuccess", "(Lcom/scandit/datacapture/core/common/feedback/Feedback;)V", "success", "<init>", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCaptureFeedback {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Feedback success;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/feedback/BarcodeCaptureFeedback$Companion;", "", "Lcom/scandit/datacapture/barcode/feedback/BarcodeCaptureFeedback;", "defaultFeedback", "", "json", "fromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BarcodeCaptureFeedback defaultFeedback() {
            return new BarcodeCaptureFeedback(Feedback.INSTANCE.defaultFeedback(), null);
        }

        @JvmStatic
        @NotNull
        public final BarcodeCaptureFeedback fromJson(@NotNull String json) {
            Intrinsics.h(json, "json");
            return BarcodeCaptureFeedbackDeserializer.fromJson(new JsonValue(json));
        }

        private Companion() {
        }
    }

    public /* synthetic */ BarcodeCaptureFeedback(Feedback feedback, DefaultConstructorMarker defaultConstructorMarker) {
        this(feedback);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCaptureFeedback defaultFeedback() {
        return INSTANCE.defaultFeedback();
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCaptureFeedback fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    @NotNull
    public final Feedback getSuccess() {
        return this.success;
    }

    public final void onScannedSuccessfully$scandit_barcode_capture() {
        this.success.emit();
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
        String string = jSONObject.toString();
        Intrinsics.g(string, "JSONObject().apply {\n   …Json()))\n    }.toString()");
        return string;
    }

    private BarcodeCaptureFeedback(Feedback feedback) {
        this.success = feedback;
    }

    public BarcodeCaptureFeedback() {
        this(new Feedback(null, null));
    }
}
