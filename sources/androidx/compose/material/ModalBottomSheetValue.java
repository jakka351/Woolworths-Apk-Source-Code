package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ModalBottomSheetValue;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ModalBottomSheetValue {
    public static final ModalBottomSheetValue d;
    public static final ModalBottomSheetValue e;
    public static final ModalBottomSheetValue f;
    public static final /* synthetic */ ModalBottomSheetValue[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        ModalBottomSheetValue modalBottomSheetValue = new ModalBottomSheetValue("Hidden", 0);
        d = modalBottomSheetValue;
        ModalBottomSheetValue modalBottomSheetValue2 = new ModalBottomSheetValue("Expanded", 1);
        e = modalBottomSheetValue2;
        ModalBottomSheetValue modalBottomSheetValue3 = new ModalBottomSheetValue("HalfExpanded", 2);
        f = modalBottomSheetValue3;
        ModalBottomSheetValue[] modalBottomSheetValueArr = {modalBottomSheetValue, modalBottomSheetValue2, modalBottomSheetValue3};
        g = modalBottomSheetValueArr;
        h = EnumEntriesKt.a(modalBottomSheetValueArr);
    }

    public static ModalBottomSheetValue valueOf(String str) {
        return (ModalBottomSheetValue) Enum.valueOf(ModalBottomSheetValue.class, str);
    }

    public static ModalBottomSheetValue[] values() {
        return (ModalBottomSheetValue[]) g.clone();
    }
}
