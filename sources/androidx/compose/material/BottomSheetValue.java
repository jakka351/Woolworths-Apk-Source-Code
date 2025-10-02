package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/BottomSheetValue;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BottomSheetValue {
    public static final BottomSheetValue d;
    public static final BottomSheetValue e;
    public static final /* synthetic */ BottomSheetValue[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        BottomSheetValue bottomSheetValue = new BottomSheetValue("Collapsed", 0);
        d = bottomSheetValue;
        BottomSheetValue bottomSheetValue2 = new BottomSheetValue("Expanded", 1);
        e = bottomSheetValue2;
        BottomSheetValue[] bottomSheetValueArr = {bottomSheetValue, bottomSheetValue2};
        f = bottomSheetValueArr;
        g = EnumEntriesKt.a(bottomSheetValueArr);
    }

    public static BottomSheetValue valueOf(String str) {
        return (BottomSheetValue) Enum.valueOf(BottomSheetValue.class, str);
    }

    public static BottomSheetValue[] values() {
        return (BottomSheetValue[]) f.clone();
    }
}
