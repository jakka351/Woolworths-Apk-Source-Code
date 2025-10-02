package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class UnsignedType {
    public static final /* synthetic */ UnsignedType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final ClassId d;
    public final Name e;
    public final ClassId f;

    static {
        UnsignedType[] unsignedTypeArr = {new UnsignedType("UBYTE", 0, ClassId.Companion.a("kotlin/UByte", false)), new UnsignedType("USHORT", 1, ClassId.Companion.a("kotlin/UShort", false)), new UnsignedType("UINT", 2, ClassId.Companion.a("kotlin/UInt", false)), new UnsignedType("ULONG", 3, ClassId.Companion.a("kotlin/ULong", false))};
        g = unsignedTypeArr;
        h = EnumEntriesKt.a(unsignedTypeArr);
    }

    public UnsignedType(String str, int i, ClassId classId) {
        this.d = classId;
        Name nameF = classId.f();
        this.e = nameF;
        this.f = new ClassId(classId.f24499a, Name.e(nameF.b() + "Array"));
    }

    public static UnsignedType valueOf(String str) {
        return (UnsignedType) Enum.valueOf(UnsignedType.class, str);
    }

    public static UnsignedType[] values() {
        return (UnsignedType[]) g.clone();
    }
}
