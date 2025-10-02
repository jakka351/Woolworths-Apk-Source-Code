package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class UnsignedArrayType {
    public static final UnsignedArrayType e;
    public static final UnsignedArrayType f;
    public static final UnsignedArrayType g;
    public static final UnsignedArrayType h;
    public static final /* synthetic */ UnsignedArrayType[] i;
    public static final /* synthetic */ EnumEntries j;
    public final Name d;

    static {
        UnsignedArrayType unsignedArrayType = new UnsignedArrayType("UBYTEARRAY", 0, ClassId.Companion.a("kotlin/UByteArray", false));
        e = unsignedArrayType;
        UnsignedArrayType unsignedArrayType2 = new UnsignedArrayType("USHORTARRAY", 1, ClassId.Companion.a("kotlin/UShortArray", false));
        f = unsignedArrayType2;
        UnsignedArrayType unsignedArrayType3 = new UnsignedArrayType("UINTARRAY", 2, ClassId.Companion.a("kotlin/UIntArray", false));
        g = unsignedArrayType3;
        UnsignedArrayType unsignedArrayType4 = new UnsignedArrayType("ULONGARRAY", 3, ClassId.Companion.a("kotlin/ULongArray", false));
        h = unsignedArrayType4;
        UnsignedArrayType[] unsignedArrayTypeArr = {unsignedArrayType, unsignedArrayType2, unsignedArrayType3, unsignedArrayType4};
        i = unsignedArrayTypeArr;
        j = EnumEntriesKt.a(unsignedArrayTypeArr);
    }

    public UnsignedArrayType(String str, int i2, ClassId classId) {
        this.d = classId.f();
    }

    public static UnsignedArrayType valueOf(String str) {
        return (UnsignedArrayType) Enum.valueOf(UnsignedArrayType.class, str);
    }

    public static UnsignedArrayType[] values() {
        return (UnsignedArrayType[]) i.clone();
    }
}
