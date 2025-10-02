package com.scandit.datacapture.core.time;

import android.support.v4.media.session.a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/core/time/TimeInterval;", "", "", "asSeconds", "", "asMillis", "other", "", "equals", "", "hashCode", "", "toString", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class TimeInterval {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final float f18874a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/time/TimeInterval$Companion;", "", "", "duration", "Lcom/scandit/datacapture/core/time/TimeInterval;", "millis", "", "seconds", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final TimeInterval millis(long duration) {
            return new TimeInterval(duration * 0.001f, null);
        }

        @JvmStatic
        @NotNull
        public final TimeInterval seconds(float duration) {
            return new TimeInterval(duration, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TimeInterval(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    @JvmStatic
    @NotNull
    public static final TimeInterval millis(long j) {
        return INSTANCE.millis(j);
    }

    @JvmStatic
    @NotNull
    public static final TimeInterval seconds(float f) {
        return INSTANCE.seconds(f);
    }

    public final long asMillis() {
        return (long) (this.f18874a * 1000);
    }

    /* renamed from: asSeconds, reason: from getter */
    public final float getF18874a() {
        return this.f18874a;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!TimeInterval.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type com.scandit.datacapture.core.time.TimeInterval");
        return this.f18874a == ((TimeInterval) other).f18874a;
    }

    public int hashCode() {
        return Float.hashCode(this.f18874a);
    }

    @NotNull
    public String toString() {
        return a.j(this.f18874a, "s}", new StringBuilder("TimeInterval{duration="));
    }

    private TimeInterval(float f) {
        this.f18874a = f;
    }
}
