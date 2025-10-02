package com.scandit.datacapture.core.common.feedback;

import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.common.feedback.FeedbackDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB!\b\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001b\u0010\u001cB\u0013\b\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001b\u0010\u001dJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/core/common/feedback/Feedback;", "", "", "loadSoundResourceInternal$scandit_capture_core", "()V", "loadSoundResourceInternal", "emit", "release", "", "toJson", "other", "", "equals", "", "hashCode", "Lcom/scandit/datacapture/core/common/feedback/Vibration;", "a", "Lcom/scandit/datacapture/core/common/feedback/Vibration;", "getVibration", "()Lcom/scandit/datacapture/core/common/feedback/Vibration;", "vibration", "Lcom/scandit/datacapture/core/common/feedback/Sound;", "b", "Lcom/scandit/datacapture/core/common/feedback/Sound;", "getSound", "()Lcom/scandit/datacapture/core/common/feedback/Sound;", "sound", "<init>", "(Lcom/scandit/datacapture/core/common/feedback/Vibration;Lcom/scandit/datacapture/core/common/feedback/Sound;)V", "(Lcom/scandit/datacapture/core/common/feedback/Sound;)V", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class Feedback {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Vibration vibration;

    /* renamed from: b, reason: from kotlin metadata */
    private final Sound sound;
    private final a c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/common/feedback/Feedback$Companion;", "", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "defaultFeedback", "", "json", "fromJson", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Feedback defaultFeedback() {
            return new Feedback(Vibration.INSTANCE.defaultVibration(), Sound.INSTANCE.defaultSound());
        }

        @JvmStatic
        @NotNull
        public final Feedback fromJson(@NotNull String json) {
            Intrinsics.h(json, "json");
            return FeedbackDeserializer.fromJson(new JsonValue(json));
        }

        private Companion() {
        }
    }

    @JvmOverloads
    public Feedback() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Feedback this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.c.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Feedback this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.c.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Feedback this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.c.h();
    }

    @JvmStatic
    @NotNull
    public static final Feedback defaultFeedback() {
        return INSTANCE.defaultFeedback();
    }

    @JvmStatic
    @NotNull
    public static final Feedback fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    public final void emit() {
        a.j.getHandler().post(new b(this, 0));
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Feedback.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type com.scandit.datacapture.core.common.feedback.Feedback");
        Feedback feedback = (Feedback) other;
        return Intrinsics.c(this.vibration, feedback.vibration) && Intrinsics.c(this.sound, feedback.sound);
    }

    @Nullable
    public final Sound getSound() {
        return this.sound;
    }

    @Nullable
    public final Vibration getVibration() {
        return this.vibration;
    }

    public int hashCode() {
        Vibration vibration = this.vibration;
        int iHashCode = (vibration != null ? vibration.hashCode() : 0) * 31;
        Sound sound = this.sound;
        return iHashCode + (sound != null ? sound.hashCode() : 0);
    }

    public final void loadSoundResourceInternal$scandit_capture_core() {
        a.j.getHandler().post(new b(this, 1));
    }

    public final void release() {
        a.j.getHandler().post(new b(this, 2));
    }

    @NotNull
    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Sound sound = this.sound;
        if (sound != null) {
            jSONObject.put("sound", new JSONObject(sound.toJson()));
        }
        Vibration vibration = this.vibration;
        if (vibration != null) {
            jSONObject.put("vibration", new JSONObject(vibration.toJson()));
        }
        String string = jSONObject.toString();
        Intrinsics.g(string, "JSONObject().apply {\n   …       }\n    }.toString()");
        return string;
    }

    @JvmOverloads
    public Feedback(@Nullable Vibration vibration) {
        this(vibration, null, 2, 0 == true ? 1 : 0);
    }

    @JvmOverloads
    public Feedback(@Nullable Vibration vibration, @Nullable Sound sound) {
        this.vibration = vibration;
        this.sound = sound;
        this.c = new a(vibration, sound, AppAndroidEnvironment.INSTANCE.getApplicationContext());
        loadSoundResourceInternal$scandit_capture_core();
    }

    public /* synthetic */ Feedback(Vibration vibration, Sound sound, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : vibration, (i & 2) != 0 ? null : sound);
    }

    public Feedback(@Nullable Sound sound) {
        this(null, sound);
    }
}
