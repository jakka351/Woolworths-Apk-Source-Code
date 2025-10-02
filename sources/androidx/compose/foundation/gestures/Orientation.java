package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/Orientation;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Orientation {
    public static final Orientation d;
    public static final Orientation e;
    public static final /* synthetic */ Orientation[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        Orientation orientation = new Orientation("Vertical", 0);
        d = orientation;
        Orientation orientation2 = new Orientation("Horizontal", 1);
        e = orientation2;
        Orientation[] orientationArr = {orientation, orientation2};
        f = orientationArr;
        g = EnumEntriesKt.a(orientationArr);
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) f.clone();
    }
}
