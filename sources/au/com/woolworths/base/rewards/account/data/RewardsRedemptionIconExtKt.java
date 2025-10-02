package au.com.woolworths.base.rewards.account.data;

import android.content.res.Resources;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.res.VectorResources_androidKt;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.base.rewards.account.R;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0019\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"getIconRes", "", "Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionIcon;", "isSelected", "", "getCoreIcon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionIcon;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "getCoreIconOrTick", "tick", "(Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionIcon;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "base-rewards-account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsRedemptionIconExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RewardsRedemptionIcon.values().length];
            try {
                iArr[RewardsRedemptionIcon.AIRPLANE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RewardsRedemptionIcon.CHRISTMAS_STOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RewardsRedemptionIcon.AUTOMATIC_LOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RewardsRedemptionIcon.NZ_AIRLINES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RewardsRedemptionIcon.NZ_SAVE_FOR_ANOTHER_OCCASION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RewardsRedemptionIcon.BFC_LOCKED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RewardsRedemptionIcon.TEN_DOLLARS_OFF.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RewardsRedemptionIcon.AUTOMATIC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[RewardsRedemptionIcon.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[RewardsRedemptionIcon.AUTO_UNLOCKED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Composable
    @NotNull
    public static final ImageVector getCoreIcon(@NotNull RewardsRedemptionIcon rewardsRedemptionIcon, @Nullable Composer composer, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        ImageVector imageVectorB;
        Intrinsics.h(rewardsRedemptionIcon, "<this>");
        composer.o(657256164);
        switch (WhenMappings.$EnumSwitchMapping$0[rewardsRedemptionIcon.ordinal()]) {
            case 1:
                composer.o(262985712);
                imageVectorB = CoreTheme.e(composer).g.J;
                composer.l();
                break;
            case 2:
                composer.o(262988522);
                imageVectorB = CoreTheme.e(composer).j.r;
                composer.l();
                break;
            case 3:
                composer.o(262991080);
                imageVectorB = CoreTheme.e(composer).j.j;
                composer.l();
                break;
            case 4:
                composer.o(262992981);
                imageVectorB = VectorResources_androidKt.b(R.drawable.ic_rewards_nz_airlines, 6, composer);
                composer.l();
                break;
            case 5:
                composer.o(262996817);
                imageVectorB = VectorResources_androidKt.b(R.drawable.ic_rewards_nz_sfao, 6, composer);
                composer.l();
                break;
            case 6:
                composer.o(263000346);
                imageVectorB = CoreTheme.e(composer).g.g;
                composer.l();
                break;
            case 7:
                composer.o(263003311);
                imageVectorB = CoreTheme.e(composer).g.e;
                composer.l();
                break;
            case 8:
                composer.o(263005705);
                imageVectorB = CoreTheme.e(composer).f.m;
                composer.l();
                break;
            case 9:
                composer.o(263010313);
                imageVectorB = CoreTheme.e(composer).f.m;
                composer.l();
                break;
            case 10:
                composer.o(263008138);
                imageVectorB = CoreTheme.e(composer).j.r;
                composer.l();
                break;
            default:
                throw a.x(composer, 262984089);
        }
        composer.l();
        return imageVectorB;
    }

    @Composable
    @NotNull
    public static final ImageVector getCoreIconOrTick(@NotNull RewardsRedemptionIcon rewardsRedemptionIcon, boolean z, @Nullable Composer composer, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        ImageVector coreIcon;
        Intrinsics.h(rewardsRedemptionIcon, "<this>");
        composer.o(711898744);
        if (z) {
            composer.o(1234897148);
            coreIcon = CoreTheme.e(composer).j.q;
            composer.l();
        } else {
            composer.o(1234897861);
            coreIcon = getCoreIcon(rewardsRedemptionIcon, composer, i & 14);
            composer.l();
        }
        composer.l();
        return coreIcon;
    }

    @Deprecated
    @DrawableRes
    public static final int getIconRes(@Nullable RewardsRedemptionIcon rewardsRedemptionIcon, boolean z) {
        if (z) {
            return com.woolworths.R.drawable.ic_tick;
        }
        switch (rewardsRedemptionIcon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[rewardsRedemptionIcon.ordinal()]) {
        }
        return R.drawable.ic_rewards_redeem_automatic;
    }

    public static /* synthetic */ int getIconRes$default(RewardsRedemptionIcon rewardsRedemptionIcon, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return getIconRes(rewardsRedemptionIcon, z);
    }
}
