package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/ClassDiscriminatorMode;", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClassDiscriminatorMode {
    public static final ClassDiscriminatorMode d;
    public static final ClassDiscriminatorMode e;
    public static final /* synthetic */ ClassDiscriminatorMode[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ClassDiscriminatorMode classDiscriminatorMode = new ClassDiscriminatorMode("NONE", 0);
        d = classDiscriminatorMode;
        ClassDiscriminatorMode classDiscriminatorMode2 = new ClassDiscriminatorMode("ALL_JSON_OBJECTS", 1);
        ClassDiscriminatorMode classDiscriminatorMode3 = new ClassDiscriminatorMode("POLYMORPHIC", 2);
        e = classDiscriminatorMode3;
        ClassDiscriminatorMode[] classDiscriminatorModeArr = {classDiscriminatorMode, classDiscriminatorMode2, classDiscriminatorMode3};
        f = classDiscriminatorModeArr;
        g = EnumEntriesKt.a(classDiscriminatorModeArr);
    }

    public static ClassDiscriminatorMode valueOf(String str) {
        return (ClassDiscriminatorMode) Enum.valueOf(ClassDiscriminatorMode.class, str);
    }

    public static ClassDiscriminatorMode[] values() {
        return (ClassDiscriminatorMode[]) f.clone();
    }
}
