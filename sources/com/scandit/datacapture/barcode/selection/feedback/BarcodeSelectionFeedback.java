package com.scandit.datacapture.barcode.selection.feedback;

import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.sdk.feedback.BarcodeSelectionFeedbackDeserializer;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.feedback.ResourceSound;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R*\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/feedback/BarcodeSelectionFeedback;", "", "", "emitSelection$scandit_barcode_capture", "()V", "emitSelection", "", "toJson", "other", "", "equals", "", "hashCode", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "value", "a", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "getSelection", "()Lcom/scandit/datacapture/core/common/feedback/Feedback;", "setSelection", "(Lcom/scandit/datacapture/core/common/feedback/Feedback;)V", "selection", "<init>", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionFeedback {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Feedback selection;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/feedback/BarcodeSelectionFeedback$Companion;", "", "Lcom/scandit/datacapture/barcode/selection/feedback/BarcodeSelectionFeedback;", "defaultFeedback", "", "json", "fromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BarcodeSelectionFeedback defaultFeedback() {
            return new BarcodeSelectionFeedback(new Feedback(new ResourceSound(R.raw.sc_selection_beep)), null);
        }

        @JvmStatic
        @NotNull
        public final BarcodeSelectionFeedback fromJson(@NotNull String json) {
            Intrinsics.h(json, "json");
            return BarcodeSelectionFeedbackDeserializer.fromJson(new JsonValue(json));
        }

        private Companion() {
        }
    }

    public /* synthetic */ BarcodeSelectionFeedback(Feedback feedback, DefaultConstructorMarker defaultConstructorMarker) {
        this(feedback);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeSelectionFeedback defaultFeedback() {
        return INSTANCE.defaultFeedback();
    }

    @JvmStatic
    @NotNull
    public static final BarcodeSelectionFeedback fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    public final void emitSelection$scandit_barcode_capture() {
        this.selection.emit();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof BarcodeSelectionFeedback) {
            return Intrinsics.c(this.selection, ((BarcodeSelectionFeedback) other).selection);
        }
        return false;
    }

    @NotNull
    public final Feedback getSelection() {
        return this.selection;
    }

    public int hashCode() {
        return this.selection.hashCode();
    }

    public final void setSelection(@NotNull Feedback value) {
        Intrinsics.h(value, "value");
        this.selection.release();
        this.selection = value;
    }

    @NotNull
    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("selection", new JSONObject(this.selection.toJson()));
        String string = jSONObject.toString();
        Intrinsics.g(string, "JSONObject().apply {\n   …Json()))\n    }.toString()");
        return string;
    }

    private BarcodeSelectionFeedback(Feedback feedback) {
        this.selection = feedback;
    }

    public BarcodeSelectionFeedback() {
        this(new Feedback(null, null));
    }
}
