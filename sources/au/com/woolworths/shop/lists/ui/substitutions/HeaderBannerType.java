package au.com.woolworths.shop.lists.ui.substitutions;

import au.com.woolworths.design.wx.foundation.TintColors;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/HeaderBannerType;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HeaderBannerType {
    public static final HeaderBannerType f;
    public static final HeaderBannerType g;
    public static final HeaderBannerType h;
    public static final HeaderBannerType i;
    public static final /* synthetic */ HeaderBannerType[] j;
    public static final /* synthetic */ EnumEntries k;
    public final int d;
    public final long e;

    static {
        int i2 = TintColors.f;
        long j2 = TintColors.b;
        HeaderBannerType headerBannerType = new HeaderBannerType(0, R.drawable.ic_shops_lists_icon_price, "PRICE", j2);
        f = headerBannerType;
        HeaderBannerType headerBannerType2 = new HeaderBannerType(1, R.drawable.ic_shops_lists_icon_specials, "SPECIALS", TintColors.d);
        g = headerBannerType2;
        HeaderBannerType headerBannerType3 = new HeaderBannerType(2, R.drawable.ic_shops_lists_icon_rewards, "REWARDS", TintColors.c);
        h = headerBannerType3;
        HeaderBannerType headerBannerType4 = new HeaderBannerType(3, R.drawable.ic_info_filled, "UNKNOWN", j2);
        i = headerBannerType4;
        HeaderBannerType[] headerBannerTypeArr = {headerBannerType, headerBannerType2, headerBannerType3, headerBannerType4};
        j = headerBannerTypeArr;
        k = EnumEntriesKt.a(headerBannerTypeArr);
    }

    public HeaderBannerType(int i2, int i3, String str, long j2) {
        this.d = i3;
        this.e = j2;
    }

    public static HeaderBannerType valueOf(String str) {
        return (HeaderBannerType) Enum.valueOf(HeaderBannerType.class, str);
    }

    public static HeaderBannerType[] values() {
        return (HeaderBannerType[]) j.clone();
    }
}
