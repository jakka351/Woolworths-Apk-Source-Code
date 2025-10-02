package androidx.constraintlayout.compose;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MotionLayoutDebugFlags {
    public static final MotionLayoutDebugFlags d;
    public static final MotionLayoutDebugFlags e;
    public static final /* synthetic */ MotionLayoutDebugFlags[] f;

    /* JADX INFO: Fake field, exist only in values array */
    MotionLayoutDebugFlags EF0;

    static {
        MotionLayoutDebugFlags motionLayoutDebugFlags = new MotionLayoutDebugFlags("NONE", 0);
        MotionLayoutDebugFlags motionLayoutDebugFlags2 = new MotionLayoutDebugFlags("SHOW_ALL", 1);
        d = motionLayoutDebugFlags2;
        MotionLayoutDebugFlags motionLayoutDebugFlags3 = new MotionLayoutDebugFlags("UNKNOWN", 2);
        e = motionLayoutDebugFlags3;
        f = new MotionLayoutDebugFlags[]{motionLayoutDebugFlags, motionLayoutDebugFlags2, motionLayoutDebugFlags3};
    }

    public static MotionLayoutDebugFlags valueOf(String str) {
        return (MotionLayoutDebugFlags) Enum.valueOf(MotionLayoutDebugFlags.class, str);
    }

    public static MotionLayoutDebugFlags[] values() {
        return (MotionLayoutDebugFlags[]) f.clone();
    }
}
