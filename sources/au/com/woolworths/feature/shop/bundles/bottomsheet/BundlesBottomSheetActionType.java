package au.com.woolworths.feature.shop.bundles.bottomsheet;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/bottomsheet/BundlesBottomSheetActionType;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BundlesBottomSheetActionType {
    public static final BundlesBottomSheetActionType d;
    public static final BundlesBottomSheetActionType e;
    public static final BundlesBottomSheetActionType f;
    public static final /* synthetic */ BundlesBottomSheetActionType[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        BundlesBottomSheetActionType bundlesBottomSheetActionType = new BundlesBottomSheetActionType("ADD", 0);
        d = bundlesBottomSheetActionType;
        BundlesBottomSheetActionType bundlesBottomSheetActionType2 = new BundlesBottomSheetActionType("UPDATE", 1);
        e = bundlesBottomSheetActionType2;
        BundlesBottomSheetActionType bundlesBottomSheetActionType3 = new BundlesBottomSheetActionType("REMOVE", 2);
        f = bundlesBottomSheetActionType3;
        BundlesBottomSheetActionType[] bundlesBottomSheetActionTypeArr = {bundlesBottomSheetActionType, bundlesBottomSheetActionType2, bundlesBottomSheetActionType3};
        g = bundlesBottomSheetActionTypeArr;
        h = EnumEntriesKt.a(bundlesBottomSheetActionTypeArr);
    }

    public static BundlesBottomSheetActionType valueOf(String str) {
        return (BundlesBottomSheetActionType) Enum.valueOf(BundlesBottomSheetActionType.class, str);
    }

    public static BundlesBottomSheetActionType[] values() {
        return (BundlesBottomSheetActionType[]) g.clone();
    }
}
