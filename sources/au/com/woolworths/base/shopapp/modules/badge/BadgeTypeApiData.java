package au.com.woolworths.base.shopapp.modules.badge;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/badge/BadgeTypeApiData;", "", "<init>", "(Ljava/lang/String;I)V", "ALWAYS", "DISABLED", "INFO", "NEW", "PRIMARY", "REWARDS", "SPECIAL", "TEMPORARY", "UNAVAILABLE", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BadgeTypeApiData {

    @SerializedName("ALWAYS")
    public static final BadgeTypeApiData ALWAYS;

    @SerializedName("DISABLED")
    public static final BadgeTypeApiData DISABLED;

    @SerializedName("INFO")
    public static final BadgeTypeApiData INFO;

    @SerializedName("NEW")
    public static final BadgeTypeApiData NEW;

    @SerializedName("PRIMARY")
    public static final BadgeTypeApiData PRIMARY;

    @SerializedName("REWARDS")
    public static final BadgeTypeApiData REWARDS;

    @SerializedName("SPECIAL")
    public static final BadgeTypeApiData SPECIAL;

    @SerializedName("TEMPORARY")
    public static final BadgeTypeApiData TEMPORARY;

    @SerializedName("UNAVAILABLE")
    public static final BadgeTypeApiData UNAVAILABLE;
    public static final BadgeTypeApiData d;
    public static final /* synthetic */ BadgeTypeApiData[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        BadgeTypeApiData badgeTypeApiData = new BadgeTypeApiData("ALWAYS", 0);
        ALWAYS = badgeTypeApiData;
        BadgeTypeApiData badgeTypeApiData2 = new BadgeTypeApiData("DISABLED", 1);
        DISABLED = badgeTypeApiData2;
        BadgeTypeApiData badgeTypeApiData3 = new BadgeTypeApiData("INFO", 2);
        INFO = badgeTypeApiData3;
        BadgeTypeApiData badgeTypeApiData4 = new BadgeTypeApiData("NEW", 3);
        NEW = badgeTypeApiData4;
        BadgeTypeApiData badgeTypeApiData5 = new BadgeTypeApiData("PRIMARY", 4);
        PRIMARY = badgeTypeApiData5;
        BadgeTypeApiData badgeTypeApiData6 = new BadgeTypeApiData("REWARDS", 5);
        REWARDS = badgeTypeApiData6;
        BadgeTypeApiData badgeTypeApiData7 = new BadgeTypeApiData("SPECIAL", 6);
        SPECIAL = badgeTypeApiData7;
        BadgeTypeApiData badgeTypeApiData8 = new BadgeTypeApiData("TEMPORARY", 7);
        TEMPORARY = badgeTypeApiData8;
        BadgeTypeApiData badgeTypeApiData9 = new BadgeTypeApiData("UNAVAILABLE", 8);
        UNAVAILABLE = badgeTypeApiData9;
        BadgeTypeApiData badgeTypeApiData10 = new BadgeTypeApiData("UNKNOWN", 9);
        d = badgeTypeApiData10;
        BadgeTypeApiData[] badgeTypeApiDataArr = {badgeTypeApiData, badgeTypeApiData2, badgeTypeApiData3, badgeTypeApiData4, badgeTypeApiData5, badgeTypeApiData6, badgeTypeApiData7, badgeTypeApiData8, badgeTypeApiData9, badgeTypeApiData10};
        e = badgeTypeApiDataArr;
        f = EnumEntriesKt.a(badgeTypeApiDataArr);
    }

    private BadgeTypeApiData(String str, int i) {
    }

    public static BadgeTypeApiData valueOf(String str) {
        return (BadgeTypeApiData) Enum.valueOf(BadgeTypeApiData.class, str);
    }

    public static BadgeTypeApiData[] values() {
        return (BadgeTypeApiData[]) e.clone();
    }
}
