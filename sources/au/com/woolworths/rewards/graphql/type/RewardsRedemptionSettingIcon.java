package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/RewardsRedemptionSettingIcon;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsRedemptionSettingIcon {
    public static final Companion e;
    public static final EnumType f;
    public static final RewardsRedemptionSettingIcon g;
    public static final /* synthetic */ RewardsRedemptionSettingIcon[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/RewardsRedemptionSettingIcon$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        RewardsRedemptionSettingIcon rewardsRedemptionSettingIcon = new RewardsRedemptionSettingIcon("airplane", 0, "airplane");
        RewardsRedemptionSettingIcon rewardsRedemptionSettingIcon2 = new RewardsRedemptionSettingIcon("dollars_off", 1, "dollars_off");
        RewardsRedemptionSettingIcon rewardsRedemptionSettingIcon3 = new RewardsRedemptionSettingIcon("xmas_stocking", 2, "xmas_stocking");
        RewardsRedemptionSettingIcon rewardsRedemptionSettingIcon4 = new RewardsRedemptionSettingIcon("dollars_off_locked", 3, "dollars_off_locked");
        RewardsRedemptionSettingIcon rewardsRedemptionSettingIcon5 = new RewardsRedemptionSettingIcon("nz_airlines", 4, "nz_airlines");
        RewardsRedemptionSettingIcon rewardsRedemptionSettingIcon6 = new RewardsRedemptionSettingIcon("nz_save_for_occasion", 5, "nz_save_for_occasion");
        RewardsRedemptionSettingIcon rewardsRedemptionSettingIcon7 = new RewardsRedemptionSettingIcon("bfc_locked", 6, "bfc_locked");
        RewardsRedemptionSettingIcon rewardsRedemptionSettingIcon8 = new RewardsRedemptionSettingIcon("ten_dollars_off", 7, "ten_dollars_off");
        RewardsRedemptionSettingIcon rewardsRedemptionSettingIcon9 = new RewardsRedemptionSettingIcon("auto_unlocked", 8, "auto_unlocked");
        RewardsRedemptionSettingIcon rewardsRedemptionSettingIcon10 = new RewardsRedemptionSettingIcon("UNKNOWN__", 9, "UNKNOWN__");
        g = rewardsRedemptionSettingIcon10;
        RewardsRedemptionSettingIcon[] rewardsRedemptionSettingIconArr = {rewardsRedemptionSettingIcon, rewardsRedemptionSettingIcon2, rewardsRedemptionSettingIcon3, rewardsRedemptionSettingIcon4, rewardsRedemptionSettingIcon5, rewardsRedemptionSettingIcon6, rewardsRedemptionSettingIcon7, rewardsRedemptionSettingIcon8, rewardsRedemptionSettingIcon9, rewardsRedemptionSettingIcon10};
        h = rewardsRedemptionSettingIconArr;
        i = EnumEntriesKt.a(rewardsRedemptionSettingIconArr);
        e = new Companion();
        f = new EnumType("RewardsRedemptionSettingIcon", CollectionsKt.R("airplane", "dollars_off", "xmas_stocking", "dollars_off_locked", "nz_airlines", "nz_save_for_occasion", "bfc_locked", "ten_dollars_off", "auto_unlocked"));
    }

    public RewardsRedemptionSettingIcon(String str, int i2, String str2) {
        this.d = str2;
    }

    public static RewardsRedemptionSettingIcon valueOf(String str) {
        return (RewardsRedemptionSettingIcon) Enum.valueOf(RewardsRedemptionSettingIcon.class, str);
    }

    public static RewardsRedemptionSettingIcon[] values() {
        return (RewardsRedemptionSettingIcon[]) h.clone();
    }
}
