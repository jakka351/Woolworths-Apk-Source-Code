package au.com.woolworths.foundation.rewards.offers.ui;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.ColorResources_androidKt;
import au.com.woolworths.android.onesite.modules.customviews.tintabletext.TintableTextData;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.foundation.rewards.offers.model.RewardsStatusIcon;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferStatusExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsOfferDataExtKt {
    public static final int a(RewardsOfferData rewardsOfferData, int i) {
        Intrinsics.h(rewardsOfferData, "<this>");
        List list = rewardsOfferData.q;
        if (list.isEmpty() || i >= list.size()) {
            return 0;
        }
        return RewardsCalendarIconExtKt.a(((RewardsStatusIcon) list.get(i)).getIcon());
    }

    public static final TintableTextData b(BasicRewardsOfferStatusData basicRewardsOfferStatusData, Context context) {
        Intrinsics.h(context, "context");
        if (basicRewardsOfferStatusData == null || basicRewardsOfferStatusData.getM() == null) {
            return null;
        }
        String m = basicRewardsOfferStatusData.getM();
        Intrinsics.e(m);
        RewardsOfferStatus n = basicRewardsOfferStatusData.getN();
        Intrinsics.h(n, "<this>");
        int i = RewardsOfferStatusExtKt.WhenMappings.f8626a[n.ordinal()];
        int iC = com.woolworths.R.color.color_rewards_offer_activated;
        switch (i) {
            case 1:
                iC = RewardsOfferStatusExtKt.c(context);
                break;
            case 2:
            case 5:
                break;
            case 3:
                iC = RewardsOfferStatusExtKt.c(context);
                break;
            case 4:
                iC = RewardsOfferStatusExtKt.c(context);
                break;
            case 6:
                iC = com.woolworths.R.color.color_brand_always;
                break;
            case 7:
                iC = RewardsOfferStatusExtKt.c(context);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TintableTextData(iC, RewardsOfferStatusExtKt.b(basicRewardsOfferStatusData.getN()), RewardsOfferStatusExtKt.a(basicRewardsOfferStatusData.getN()), m);
    }

    public static final TintableTextSpec c(BasicRewardsOfferStatusData basicRewardsOfferStatusData, String str, Composer composer, int i) {
        long jF;
        TintableTextSpec tintableTextSpec;
        Intrinsics.h(basicRewardsOfferStatusData, "<this>");
        composer.o(-899781190);
        if ((i & 1) != 0) {
            str = basicRewardsOfferStatusData.getM();
        }
        String str2 = str;
        if (str2 == null) {
            tintableTextSpec = null;
        } else {
            RewardsOfferStatus n = basicRewardsOfferStatusData.getN();
            Intrinsics.h(n, "<this>");
            composer.o(-148518704);
            switch (RewardsOfferStatusExtKt.WhenMappings.f8626a[n.ordinal()]) {
                case 1:
                    composer.o(-992543712);
                    jF = WxTheme.a(composer).f();
                    composer.l();
                    break;
                case 2:
                    composer.o(-992547383);
                    jF = ColorResources_androidKt.a(composer, com.woolworths.R.color.color_rewards_offer_activated);
                    composer.l();
                    break;
                case 3:
                    composer.o(-992549248);
                    jF = WxTheme.a(composer).f();
                    composer.l();
                    break;
                case 4:
                    composer.o(-992541376);
                    jF = WxTheme.a(composer).f();
                    composer.l();
                    break;
                case 5:
                    composer.o(-992539511);
                    jF = ColorResources_androidKt.a(composer, com.woolworths.R.color.color_rewards_offer_activated);
                    composer.l();
                    break;
                case 6:
                    composer.o(-992536478);
                    jF = ColorResources_androidKt.a(composer, com.woolworths.R.color.color_brand_always);
                    composer.l();
                    break;
                case 7:
                    composer.o(-992533024);
                    jF = WxTheme.a(composer).f();
                    composer.l();
                    break;
                default:
                    throw au.com.woolworths.android.onesite.a.x(composer, -992551153);
            }
            long j = jF;
            composer.l();
            tintableTextSpec = new TintableTextSpec(str2, WxTheme.b(composer).s, j, RewardsOfferStatusExtKt.b(basicRewardsOfferStatusData.getN()), RewardsOfferStatusExtKt.a(basicRewardsOfferStatusData.getN()), 32);
        }
        composer.l();
        return tintableTextSpec;
    }
}
