package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/Direction;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Direction {
    public static final Direction d;
    public static final Direction e;
    public static final Direction f;
    public static final /* synthetic */ Direction[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        Direction direction = new Direction("BEFORE", 0);
        d = direction;
        Direction direction2 = new Direction("ON", 1);
        e = direction2;
        Direction direction3 = new Direction("AFTER", 2);
        f = direction3;
        Direction[] directionArr = {direction, direction2, direction3};
        g = directionArr;
        h = EnumEntriesKt.a(directionArr);
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) g.clone();
    }
}
