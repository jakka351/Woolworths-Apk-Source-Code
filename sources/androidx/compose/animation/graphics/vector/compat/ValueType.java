package androidx.compose.animation.graphics.vector.compat;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/graphics/vector/compat/ValueType;", "", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ValueType {
    public static final ValueType d;
    public static final ValueType e;
    public static final ValueType f;
    public static final ValueType g;
    public static final /* synthetic */ ValueType[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        ValueType valueType = new ValueType("Float", 0);
        d = valueType;
        ValueType valueType2 = new ValueType("Int", 1);
        e = valueType2;
        ValueType valueType3 = new ValueType("Color", 2);
        f = valueType3;
        ValueType valueType4 = new ValueType("Path", 3);
        g = valueType4;
        ValueType[] valueTypeArr = {valueType, valueType2, valueType3, valueType4};
        h = valueTypeArr;
        i = EnumEntriesKt.a(valueTypeArr);
    }

    public static ValueType valueOf(String str) {
        return (ValueType) Enum.valueOf(ValueType.class, str);
    }

    public static ValueType[] values() {
        return (ValueType[]) h.clone();
    }
}
