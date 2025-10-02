package androidx.constraintlayout.compose;

import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/MotionLayoutFlag;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MotionLayoutFlag {
    public static final /* synthetic */ MotionLayoutFlag[] d = {new MotionLayoutFlag("Default", 0), new MotionLayoutFlag("FullMeasure", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    MotionLayoutFlag EF5;

    public static MotionLayoutFlag valueOf(String str) {
        return (MotionLayoutFlag) Enum.valueOf(MotionLayoutFlag.class, str);
    }

    public static MotionLayoutFlag[] values() {
        return (MotionLayoutFlag[]) d.clone();
    }
}
