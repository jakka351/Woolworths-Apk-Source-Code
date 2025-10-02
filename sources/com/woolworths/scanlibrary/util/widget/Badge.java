package com.woolworths.scanlibrary.util.widget;

import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/Badge;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Badge {
    public static final Badge f;
    public static final Badge g;
    public static final Badge h;
    public static final Badge i;
    public static final /* synthetic */ Badge[] j;
    public static final /* synthetic */ EnumEntries k;
    public final String d;
    public final int e;

    static {
        Badge badge = new Badge("WEIGHT_REQUIRED", 0, "Weight Required", R.drawable.sng_background_badge_yellow);
        f = badge;
        Badge badge2 = new Badge("REDUCED", 1, "Reduced", R.drawable.sng_background_badge_blue);
        g = badge2;
        Badge badge3 = new Badge("SPECIAL", 2, "Special", R.drawable.sng_background_badge_blue);
        h = badge3;
        Badge badge4 = new Badge("PAY_AT_REGISTER", 3, "Pay at Scan&Go Checkout", R.drawable.sng_background_badge_yellow);
        i = badge4;
        Badge[] badgeArr = {badge, badge2, badge3, badge4};
        j = badgeArr;
        k = EnumEntriesKt.a(badgeArr);
    }

    public Badge(String str, int i2, String str2, int i3) {
        this.d = str2;
        this.e = i3;
    }

    public static Badge valueOf(String str) {
        return (Badge) Enum.valueOf(Badge.class, str);
    }

    public static Badge[] values() {
        return (Badge[]) j.clone();
    }
}
