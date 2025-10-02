package androidx.compose.animation.graphics.vector;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/graphics/vector/Ordering;", "", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Ordering {
    public static final Ordering d;
    public static final Ordering e;
    public static final /* synthetic */ Ordering[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        Ordering ordering = new Ordering("Together", 0);
        d = ordering;
        Ordering ordering2 = new Ordering("Sequentially", 1);
        e = ordering2;
        Ordering[] orderingArr = {ordering, ordering2};
        f = orderingArr;
        g = EnumEntriesKt.a(orderingArr);
    }

    public static Ordering valueOf(String str) {
        return (Ordering) Enum.valueOf(Ordering.class, str);
    }

    public static Ordering[] values() {
        return (Ordering[]) f.clone();
    }
}
