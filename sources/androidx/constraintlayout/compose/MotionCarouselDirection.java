package androidx.constraintlayout.compose;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/MotionCarouselDirection;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MotionCarouselDirection {
    public static final MotionCarouselDirection d;
    public static final /* synthetic */ MotionCarouselDirection[] e;

    static {
        MotionCarouselDirection motionCarouselDirection = new MotionCarouselDirection("FORWARD", 0);
        d = motionCarouselDirection;
        e = new MotionCarouselDirection[]{motionCarouselDirection, new MotionCarouselDirection("BACKWARD", 1)};
    }

    public static MotionCarouselDirection valueOf(String str) {
        return (MotionCarouselDirection) Enum.valueOf(MotionCarouselDirection.class, str);
    }

    public static MotionCarouselDirection[] values() {
        return (MotionCarouselDirection[]) e.clone();
    }
}
