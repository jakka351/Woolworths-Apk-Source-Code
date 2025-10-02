package au.com.woolworths.feature.rewards.offers.domain.model;

import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAssetFit;
import au.com.woolworths.android.onesite.data.DownloadableAssetType;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsHeader;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsStatusBadge;
import au.com.woolworths.rewards.base.data.IconAsset;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerModel;
import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerStyle;
import au.com.woolworths.sdui.rewards.model.ActionData;
import au.com.woolworths.sdui.rewards.model.ActionType;
import au.com.woolworths.sdui.rewards.model.broadcastbanner.BasicCoreBroadcastBannerModel;
import com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment;
import com.woolworths.rewards.offers.fragment.IconAssetExtensionKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfferDetailsPageFragmentHeaderExtKt {
    public static final OfferDetailsHeader a(OfferDetailsPageFragment.Header header) {
        DownloadableAssetFit downloadableAssetFit;
        IconAsset hostedIcon;
        BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel;
        OfferDetailsPageFragment.HeroAsset heroAsset = header.f20849a;
        int iOrdinal = heroAsset.b.ordinal();
        DownloadableAssetType downloadableAssetType = iOrdinal != 0 ? iOrdinal != 1 ? DownloadableAssetType.d : DownloadableAssetType.IMAGE : DownloadableAssetType.LOTTIE_ANIMATION;
        String str = heroAsset.c;
        int i = heroAsset.d;
        int i2 = heroAsset.e;
        au.com.woolworths.rewards.graphql.type.DownloadableAssetFit downloadableAssetFit2 = heroAsset.f;
        ActionData actionData = null;
        if (downloadableAssetFit2 != null) {
            int iOrdinal2 = downloadableAssetFit2.ordinal();
            downloadableAssetFit = (iOrdinal2 == 0 || iOrdinal2 != 1) ? DownloadableAssetFit.ASPECT_FILL : DownloadableAssetFit.CENTER;
        } else {
            downloadableAssetFit = null;
        }
        DownloadableAsset downloadableAsset = new DownloadableAsset(downloadableAssetType, str, i, i2, downloadableAssetFit, heroAsset.g);
        OfferDetailsPageFragment.LeafAsset leafAsset = header.b;
        OfferDetailsPageFragment.OnLocalAsset onLocalAsset = leafAsset.b;
        if (onLocalAsset != null) {
            hostedIcon = new IconAsset.LocalAsset(LocalAssetIconNameExtKt.a(onLocalAsset.f20856a));
        } else {
            OfferDetailsPageFragment.OnHostedIcon onHostedIcon = leafAsset.c;
            if (onHostedIcon == null) {
                throw new IllegalStateException("Error mapping `LeafAsset`: missing non-null synthetic field!");
            }
            hostedIcon = new IconAsset.HostedIcon(onHostedIcon.f20854a);
        }
        OfferDetailsPageFragment.RoundelAsset roundelAsset = header.c;
        IconAsset iconAssetA = roundelAsset != null ? IconAssetExtensionKt.a(roundelAsset.b) : null;
        String str2 = header.d;
        String str3 = header.e;
        OfferDetailsPageFragment.StatusBadge statusBadge = header.f;
        OfferDetailsStatusBadge offerDetailsStatusBadge = statusBadge != null ? new OfferDetailsStatusBadge(statusBadge.f20860a, RewardsOfferStatusExtKt.a(statusBadge.b)) : null;
        OfferDetailsPageFragment.BroadcastBanner broadcastBanner = header.g;
        if (broadcastBanner != null) {
            OfferDetailsPageFragment.BroadcastBannerUI broadcastBannerUI = broadcastBanner.f20843a;
            String str4 = broadcastBannerUI.f20845a;
            String str5 = broadcastBannerUI.b;
            int iOrdinal3 = broadcastBannerUI.c.ordinal();
            CoreBroadcastBannerStyle coreBroadcastBannerStyle = iOrdinal3 != 0 ? iOrdinal3 != 1 ? iOrdinal3 != 2 ? iOrdinal3 != 3 ? iOrdinal3 != 4 ? CoreBroadcastBannerStyle.d : CoreBroadcastBannerStyle.h : CoreBroadcastBannerStyle.g : CoreBroadcastBannerStyle.f : CoreBroadcastBannerStyle.e : CoreBroadcastBannerStyle.d;
            OfferDetailsPageFragment.OnHostedIcon1 onHostedIcon1 = broadcastBannerUI.d.b;
            if (onHostedIcon1 == null) {
                throw new IllegalStateException("Error mapping `Icon`: missing non-null synthetic field!");
            }
            CoreBroadcastBannerModel coreBroadcastBannerModel = new CoreBroadcastBannerModel(str4, str5, coreBroadcastBannerStyle, new IconAsset.HostedIcon(onHostedIcon1.f20855a));
            String str6 = broadcastBanner.c;
            OfferDetailsPageFragment.BroadcastBannerAction broadcastBannerAction = broadcastBanner.b;
            if (broadcastBannerAction != null) {
                String str7 = broadcastBannerAction.c;
                int iOrdinal4 = broadcastBannerAction.b.ordinal();
                ActionType actionType = (iOrdinal4 == 0 || iOrdinal4 != 1) ? ActionType.e : ActionType.d;
                actionData = new ActionData(str7, actionType, broadcastBannerAction.f20844a, null);
            }
            basicCoreBroadcastBannerModel = new BasicCoreBroadcastBannerModel(coreBroadcastBannerModel, str6, actionData);
        } else {
            basicCoreBroadcastBannerModel = null;
        }
        return new OfferDetailsHeader(downloadableAsset, hostedIcon, iconAssetA, str2, str3, offerDetailsStatusBadge, basicCoreBroadcastBannerModel);
    }
}
