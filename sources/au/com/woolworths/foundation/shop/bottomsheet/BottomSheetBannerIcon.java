package au.com.woolworths.foundation.shop.bottomsheet;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetBannerIcon;", "", "bottomsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BottomSheetBannerIcon {
    public static final BottomSheetBannerIcon d;
    public static final /* synthetic */ BottomSheetBannerIcon[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        BottomSheetBannerIcon bottomSheetBannerIcon = new BottomSheetBannerIcon("MARKETPLACE", 0);
        d = bottomSheetBannerIcon;
        BottomSheetBannerIcon[] bottomSheetBannerIconArr = {bottomSheetBannerIcon};
        e = bottomSheetBannerIconArr;
        f = EnumEntriesKt.a(bottomSheetBannerIconArr);
    }

    public static BottomSheetBannerIcon valueOf(String str) {
        return (BottomSheetBannerIcon) Enum.valueOf(BottomSheetBannerIcon.class, str);
    }

    public static BottomSheetBannerIcon[] values() {
        return (BottomSheetBannerIcon[]) e.clone();
    }
}
