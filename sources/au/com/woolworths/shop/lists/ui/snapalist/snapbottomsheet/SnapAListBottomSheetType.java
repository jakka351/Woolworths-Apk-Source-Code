package au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/snapbottomsheet/SnapAListBottomSheetType;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SnapAListBottomSheetType {
    public static final SnapAListBottomSheetType d;
    public static final SnapAListBottomSheetType e;
    public static final /* synthetic */ SnapAListBottomSheetType[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        SnapAListBottomSheetType snapAListBottomSheetType = new SnapAListBottomSheetType("ADD_TO_LIST", 0);
        d = snapAListBottomSheetType;
        SnapAListBottomSheetType snapAListBottomSheetType2 = new SnapAListBottomSheetType("NEW_LIST", 1);
        e = snapAListBottomSheetType2;
        SnapAListBottomSheetType[] snapAListBottomSheetTypeArr = {snapAListBottomSheetType, snapAListBottomSheetType2};
        f = snapAListBottomSheetTypeArr;
        g = EnumEntriesKt.a(snapAListBottomSheetTypeArr);
    }

    public static SnapAListBottomSheetType valueOf(String str) {
        return (SnapAListBottomSheetType) Enum.valueOf(SnapAListBottomSheetType.class, str);
    }

    public static SnapAListBottomSheetType[] values() {
        return (SnapAListBottomSheetType[]) f.clone();
    }
}
