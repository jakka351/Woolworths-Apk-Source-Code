package com.scandit.datacapture.barcode.find.feedback;

import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.feedback.ResourceSound;
import com.scandit.datacapture.core.common.feedback.Sound;
import com.scandit.datacapture.core.common.feedback.Vibration;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002R*\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/barcode/find/feedback/BarcodeFindFeedback;", "", "", "toJson", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "value", "a", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "getFound", "()Lcom/scandit/datacapture/core/common/feedback/Feedback;", "setFound", "(Lcom/scandit/datacapture/core/common/feedback/Feedback;)V", "found", "b", "getItemListUpdated", "setItemListUpdated", "itemListUpdated", "<init>", "()V", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeFindFeedback {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Feedback found;

    /* renamed from: b, reason: from kotlin metadata */
    private Feedback itemListUpdated;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/find/feedback/BarcodeFindFeedback$Companion;", "", "Lcom/scandit/datacapture/barcode/find/feedback/BarcodeFindFeedback;", "defaultFeedback", "Lcom/scandit/datacapture/core/common/feedback/Sound;", "defaultFoundSound$scandit_barcode_capture", "()Lcom/scandit/datacapture/core/common/feedback/Sound;", "defaultFoundSound", "defaultItemListUpdatedSound$scandit_barcode_capture", "defaultItemListUpdatedSound", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BarcodeFindFeedback defaultFeedback() {
            Vibration.Companion companion = Vibration.INSTANCE;
            return new BarcodeFindFeedback(new Feedback(companion.defaultVibration(), defaultFoundSound$scandit_barcode_capture()), new Feedback(companion.defaultVibration(), defaultItemListUpdatedSound$scandit_barcode_capture()), null);
        }

        @NotNull
        public final Sound defaultFoundSound$scandit_barcode_capture() {
            return new ResourceSound(R.raw.sc_barcode_find_found);
        }

        @Nullable
        public final Sound defaultItemListUpdatedSound$scandit_barcode_capture() {
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BarcodeFindFeedback(Feedback feedback, Feedback feedback2, DefaultConstructorMarker defaultConstructorMarker) {
        this(feedback, feedback2);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeFindFeedback defaultFeedback() {
        return INSTANCE.defaultFeedback();
    }

    @NotNull
    public final Feedback getFound() {
        return this.found;
    }

    @NotNull
    public final Feedback getItemListUpdated() {
        return this.itemListUpdated;
    }

    public final void setFound(@NotNull Feedback value) {
        Intrinsics.h(value, "value");
        this.found.release();
        this.found = value;
    }

    public final void setItemListUpdated(@NotNull Feedback value) {
        Intrinsics.h(value, "value");
        this.itemListUpdated.release();
        this.itemListUpdated = value;
    }

    @NotNull
    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("found", new JSONObject(this.found.toJson()));
        jSONObject.put("itemListUpdated", new JSONObject(this.found.toJson()));
        String string = jSONObject.toString();
        Intrinsics.g(string, "JSONObject().apply {\n   …Json()))\n    }.toString()");
        return string;
    }

    private BarcodeFindFeedback(Feedback feedback, Feedback feedback2) {
        this.found = feedback;
        this.itemListUpdated = feedback2;
    }

    public BarcodeFindFeedback() {
        this(new Feedback(null, null), new Feedback(null, null));
    }
}
