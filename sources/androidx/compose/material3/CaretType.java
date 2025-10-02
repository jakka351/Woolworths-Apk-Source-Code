package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0083\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/CaretType;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CaretType {
    public static final CaretType d;
    public static final CaretType e;
    public static final /* synthetic */ CaretType[] f;

    static {
        CaretType caretType = new CaretType("Plain", 0);
        d = caretType;
        CaretType caretType2 = new CaretType("Rich", 1);
        e = caretType2;
        f = new CaretType[]{caretType, caretType2};
    }

    public static CaretType valueOf(String str) {
        return (CaretType) Enum.valueOf(CaretType.class, str);
    }

    public static CaretType[] values() {
        return (CaretType[]) f.clone();
    }
}
