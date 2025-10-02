package au.com.woolworths.rewards.base.data;

import au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec;
import au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelStyle;
import au.com.woolworths.shared.ui.compose.brandlabel.RewardsBrandLabelStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toBrandLabelSpec", "Lau/com/woolworths/shared/ui/compose/brandlabel/BrandLabelSpec;", "Lau/com/woolworths/rewards/base/data/RewardsBadgeTypeApiData;", "base-rewards-app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsBadgeTypeApiDataKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RewardsBadgeTypeApiData.values().length];
            try {
                iArr[RewardsBadgeTypeApiData.ACCENT_TINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RewardsBadgeTypeApiData.ALWAYS_TINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RewardsBadgeTypeApiData.ALWAYS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RewardsBadgeTypeApiData.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RewardsBadgeTypeApiData.INFO_TINT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RewardsBadgeTypeApiData.NEW.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RewardsBadgeTypeApiData.REWARDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RewardsBadgeTypeApiData.SPECIAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[RewardsBadgeTypeApiData.STATUS_BACKGROUND_POSITIVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[RewardsBadgeTypeApiData.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[RewardsBadgeTypeApiData.PRIMARY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final BrandLabelSpec toBrandLabelSpec(@NotNull RewardsBadgeTypeApiData rewardsBadgeTypeApiData) {
        Intrinsics.h(rewardsBadgeTypeApiData, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[rewardsBadgeTypeApiData.ordinal()]) {
            case 1:
                return RewardsBrandLabelStyle.d;
            case 2:
                return RewardsBrandLabelStyle.e;
            case 3:
                return BrandLabelStyle.d;
            case 4:
                return BrandLabelStyle.f;
            case 5:
                return RewardsBrandLabelStyle.f;
            case 6:
                return BrandLabelStyle.g;
            case 7:
                return BrandLabelStyle.h;
            case 8:
                return BrandLabelStyle.i;
            case 9:
                return RewardsBrandLabelStyle.g;
            case 10:
            case 11:
                return BrandLabelStyle.e;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
