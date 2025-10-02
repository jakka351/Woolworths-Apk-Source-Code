package com.scandit.datacapture.core.common.feedback;

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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001d\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u001c\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u000b\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/core/common/feedback/Vibration;", "", "", "toJson", "other", "", "equals", "", "hashCode", "Lcom/scandit/datacapture/core/time/TimeInterval;", "a", "Lcom/scandit/datacapture/core/time/TimeInterval;", "getDuration", "()Lcom/scandit/datacapture/core/time/TimeInterval;", "setDuration", "(Lcom/scandit/datacapture/core/time/TimeInterval;)V", "duration", "b", "I", "getAmplitude", "()I", "setAmplitude", "(I)V", "amplitude", "c", "getVibrateTime", "getVibrateTime$annotations", "()V", "vibrateTime", "<init>", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public class Vibration {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEFAULT_AMPLITUDE = -1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private TimeInterval duration;

    /* renamed from: b, reason: from kotlin metadata */
    private int amplitude;

    /* renamed from: c, reason: from kotlin metadata */
    private final TimeInterval vibrateTime;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/common/feedback/Vibration$Companion;", "", "Lcom/scandit/datacapture/core/common/feedback/Vibration;", "defaultVibration", "", "DEFAULT_AMPLITUDE", "I", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Vibration defaultVibration() {
            return new Vibration();
        }

        private Companion() {
        }
    }

    public Vibration() {
        TimeInterval timeIntervalMillis = TimeInterval.INSTANCE.millis(300L);
        this.duration = timeIntervalMillis;
        this.amplitude = -1;
        this.vibrateTime = timeIntervalMillis;
    }

    @JvmStatic
    @NotNull
    public static final Vibration defaultVibration() {
        return INSTANCE.defaultVibration();
    }

    @Deprecated
    public static /* synthetic */ void getVibrateTime$annotations() {
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type com.scandit.datacapture.core.common.feedback.Vibration");
        Vibration vibration = (Vibration) other;
        return Intrinsics.c(this.duration, vibration.duration) && this.amplitude == vibration.amplitude && Intrinsics.c(this.duration, vibration.duration);
    }

    public final int getAmplitude() {
        return this.amplitude;
    }

    @NotNull
    public final TimeInterval getDuration() {
        return this.duration;
    }

    @NotNull
    public final TimeInterval getVibrateTime() {
        return this.vibrateTime;
    }

    public int hashCode() {
        return (this.duration.hashCode() * 31) + this.amplitude;
    }

    public final void setAmplitude(int i) {
        this.amplitude = i;
    }

    public final void setDuration(@NotNull TimeInterval timeInterval) {
        Intrinsics.h(timeInterval, "<set-?>");
        this.duration = timeInterval;
    }

    @NotNull
    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "default");
        String string = jSONObject.toString();
        Intrinsics.g(string, "JSONObject().apply {\n   …efault\")\n    }.toString()");
        return string;
    }
}
