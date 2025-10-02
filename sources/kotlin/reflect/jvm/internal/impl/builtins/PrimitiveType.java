package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PrimitiveType {
    public static final Set h;
    public static final PrimitiveType i;
    public static final PrimitiveType j;
    public static final PrimitiveType k;
    public static final PrimitiveType l;
    public static final PrimitiveType m;
    public static final PrimitiveType n;
    public static final PrimitiveType o;
    public static final PrimitiveType p;
    public static final /* synthetic */ PrimitiveType[] q;
    public static final /* synthetic */ EnumEntries r;
    public final Name d;
    public final Name e;
    public final Object f;
    public final Object g;

    public static final class Companion {
    }

    static {
        PrimitiveType primitiveType = new PrimitiveType("BOOLEAN", 0, "Boolean");
        i = primitiveType;
        PrimitiveType primitiveType2 = new PrimitiveType("CHAR", 1, "Char");
        j = primitiveType2;
        PrimitiveType primitiveType3 = new PrimitiveType("BYTE", 2, "Byte");
        k = primitiveType3;
        PrimitiveType primitiveType4 = new PrimitiveType("SHORT", 3, "Short");
        l = primitiveType4;
        PrimitiveType primitiveType5 = new PrimitiveType("INT", 4, "Int");
        m = primitiveType5;
        PrimitiveType primitiveType6 = new PrimitiveType("FLOAT", 5, "Float");
        n = primitiveType6;
        PrimitiveType primitiveType7 = new PrimitiveType("LONG", 6, "Long");
        o = primitiveType7;
        PrimitiveType primitiveType8 = new PrimitiveType("DOUBLE", 7, "Double");
        p = primitiveType8;
        PrimitiveType[] primitiveTypeArr = {primitiveType, primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7, primitiveType8};
        q = primitiveTypeArr;
        r = EnumEntriesKt.a(primitiveTypeArr);
        h = ArraysKt.r0(new PrimitiveType[]{primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7, primitiveType8});
    }

    public PrimitiveType(String str, int i2, String str2) {
        this.d = Name.e(str2);
        this.e = Name.e(str2.concat("Array"));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.d;
        this.f = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$$Lambda$0
            public final PrimitiveType d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set set = PrimitiveType.h;
                return StandardNames.l.a(this.d.d);
            }
        });
        this.g = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$$Lambda$1
            public final PrimitiveType d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set set = PrimitiveType.h;
                return StandardNames.l.a(this.d.e);
            }
        });
    }

    public static PrimitiveType valueOf(String str) {
        return (PrimitiveType) Enum.valueOf(PrimitiveType.class, str);
    }

    public static PrimitiveType[] values() {
        return (PrimitiveType[]) q.clone();
    }
}
