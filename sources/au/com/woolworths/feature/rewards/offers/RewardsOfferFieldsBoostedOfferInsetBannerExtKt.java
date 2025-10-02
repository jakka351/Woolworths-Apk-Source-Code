package au.com.woolworths.feature.rewards.offers;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionPlacementTypeApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionTypeApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import au.com.woolworths.rewards.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.rewards.graphql.type.InsetBannerActionType;
import au.com.woolworths.rewards.graphql.type.InsetBannerDisplayType;
import com.woolworths.rewards.offers.fragment.RewardsOfferFields;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsOfferFieldsBoostedOfferInsetBannerExtKt {
    public static final InsetBannerApiData a(RewardsOfferFields.BoostedOfferInsetBanner boostedOfferInsetBanner) {
        InsetBannerActionApiData insetBannerActionApiData;
        Intrinsics.h(boostedOfferInsetBanner, "<this>");
        InsetBannerDisplayType insetBannerDisplayType = boostedOfferInsetBanner.f20943a;
        Intrinsics.h(insetBannerDisplayType, "<this>");
        int iOrdinal = insetBannerDisplayType.ordinal();
        InsetBannerTypeApiData insetBannerTypeApiData = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? InsetBannerTypeApiData.INFO : InsetBannerTypeApiData.GREEN : InsetBannerTypeApiData.REWARDS : InsetBannerTypeApiData.ERROR : InsetBannerTypeApiData.WARNING : InsetBannerTypeApiData.INFO;
        String str = boostedOfferInsetBanner.b;
        RewardsOfferFields.Action action = boostedOfferInsetBanner.e;
        if (action != null) {
            String str2 = action.c;
            String str3 = action.d;
            InsetBannerActionType insetBannerActionType = action.b;
            Intrinsics.h(insetBannerActionType, "<this>");
            int iOrdinal2 = insetBannerActionType.ordinal();
            InsetBannerActionTypeApiData insetBannerActionTypeApiData = iOrdinal2 != 0 ? iOrdinal2 != 1 ? InsetBannerActionTypeApiData.UNKNOWN : InsetBannerActionTypeApiData.APPLOCAL : InsetBannerActionTypeApiData.LINK;
            InsetBannerActionPlacement insetBannerActionPlacement = action.f20941a;
            Intrinsics.h(insetBannerActionPlacement, "<this>");
            int iOrdinal3 = insetBannerActionPlacement.ordinal();
            InsetBannerActionPlacementTypeApiData insetBannerActionPlacementTypeApiData = (iOrdinal3 == 0 || iOrdinal3 != 1) ? InsetBannerActionPlacementTypeApiData.BOTTOM : InsetBannerActionPlacementTypeApiData.RIGHT;
            insetBannerActionApiData = new InsetBannerActionApiData(str2, str3, insetBannerActionTypeApiData, insetBannerActionPlacementTypeApiData, action.e);
        } else {
            insetBannerActionApiData = null;
        }
        return new InsetBannerApiData(insetBannerTypeApiData, str, null, insetBannerActionApiData, boostedOfferInsetBanner.d, null, 32, null);
    }
}
