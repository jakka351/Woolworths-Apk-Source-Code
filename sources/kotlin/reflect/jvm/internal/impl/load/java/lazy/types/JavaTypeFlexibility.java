package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class JavaTypeFlexibility {
    public static final JavaTypeFlexibility d;
    public static final JavaTypeFlexibility e;
    public static final JavaTypeFlexibility f;
    public static final /* synthetic */ JavaTypeFlexibility[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        JavaTypeFlexibility javaTypeFlexibility = new JavaTypeFlexibility("INFLEXIBLE", 0);
        d = javaTypeFlexibility;
        JavaTypeFlexibility javaTypeFlexibility2 = new JavaTypeFlexibility("FLEXIBLE_UPPER_BOUND", 1);
        e = javaTypeFlexibility2;
        JavaTypeFlexibility javaTypeFlexibility3 = new JavaTypeFlexibility("FLEXIBLE_LOWER_BOUND", 2);
        f = javaTypeFlexibility3;
        JavaTypeFlexibility[] javaTypeFlexibilityArr = {javaTypeFlexibility, javaTypeFlexibility2, javaTypeFlexibility3};
        g = javaTypeFlexibilityArr;
        h = EnumEntriesKt.a(javaTypeFlexibilityArr);
    }

    public static JavaTypeFlexibility valueOf(String str) {
        return (JavaTypeFlexibility) Enum.valueOf(JavaTypeFlexibility.class, str);
    }

    public static JavaTypeFlexibility[] values() {
        return (JavaTypeFlexibility[]) g.clone();
    }
}
