package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class TypeComponentPosition {
    public static final TypeComponentPosition d;
    public static final TypeComponentPosition e;
    public static final TypeComponentPosition f;
    public static final /* synthetic */ TypeComponentPosition[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        TypeComponentPosition typeComponentPosition = new TypeComponentPosition("FLEXIBLE_LOWER", 0);
        d = typeComponentPosition;
        TypeComponentPosition typeComponentPosition2 = new TypeComponentPosition("FLEXIBLE_UPPER", 1);
        e = typeComponentPosition2;
        TypeComponentPosition typeComponentPosition3 = new TypeComponentPosition("INFLEXIBLE", 2);
        f = typeComponentPosition3;
        TypeComponentPosition[] typeComponentPositionArr = {typeComponentPosition, typeComponentPosition2, typeComponentPosition3};
        g = typeComponentPositionArr;
        h = EnumEntriesKt.a(typeComponentPositionArr);
    }

    public static TypeComponentPosition valueOf(String str) {
        return (TypeComponentPosition) Enum.valueOf(TypeComponentPosition.class, str);
    }

    public static TypeComponentPosition[] values() {
        return (TypeComponentPosition[]) g.clone();
    }
}
