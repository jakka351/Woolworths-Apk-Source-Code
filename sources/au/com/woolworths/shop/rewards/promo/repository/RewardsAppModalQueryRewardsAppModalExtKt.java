package au.com.woolworths.shop.rewards.promo.repository;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAssetFit;
import au.com.woolworths.android.onesite.data.DownloadableAssetType;
import au.com.woolworths.rewards.base.info.FeatureInfoBulletItem;
import au.com.woolworths.rewards.base.info.FeatureInfoFooter;
import au.com.woolworths.rewards.base.info.FeatureInfoTextItem;
import au.com.woolworths.rewards.modal.RewardsAppModalData;
import com.woolworths.rewards.promo.RewardsAppModalQuery;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-rewards_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsAppModalQueryRewardsAppModalExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [au.com.woolworths.rewards.base.info.FeatureInfoTextItem] */
    public static final RewardsAppModalData a(RewardsAppModalQuery.RewardsAppModal rewardsAppModal) {
        DownloadableAsset downloadableAsset;
        FeatureInfoFooter featureInfoFooter;
        FeatureInfoBulletItem featureInfoTextItem;
        DownloadableAssetFit downloadableAssetFit;
        Intrinsics.h(rewardsAppModal, "<this>");
        RewardsAppModalQuery.HeaderImage headerImage = rewardsAppModal.f21064a;
        if (headerImage != null) {
            int iOrdinal = headerImage.f21059a.ordinal();
            DownloadableAssetType downloadableAssetType = iOrdinal != 0 ? iOrdinal != 1 ? DownloadableAssetType.d : DownloadableAssetType.IMAGE : DownloadableAssetType.LOTTIE_ANIMATION;
            String str = headerImage.b;
            int i = headerImage.c;
            int i2 = headerImage.d;
            au.com.woolworths.rewards.graphql.type.DownloadableAssetFit downloadableAssetFit2 = headerImage.e;
            if (downloadableAssetFit2 != null) {
                int iOrdinal2 = downloadableAssetFit2.ordinal();
                downloadableAssetFit = (iOrdinal2 == 0 || iOrdinal2 != 1) ? DownloadableAssetFit.ASPECT_FILL : DownloadableAssetFit.CENTER;
            } else {
                downloadableAssetFit = null;
            }
            downloadableAsset = new DownloadableAsset(downloadableAssetType, str, i, i2, downloadableAssetFit, headerImage.f);
        } else {
            downloadableAsset = null;
        }
        String str2 = rewardsAppModal.b;
        String str3 = rewardsAppModal.c;
        ArrayList<RewardsAppModalQuery.InfoItem> arrayList = rewardsAppModal.d;
        ArrayList arrayList2 = new ArrayList();
        for (RewardsAppModalQuery.InfoItem infoItem : arrayList) {
            RewardsAppModalQuery.OnFeatureInfoBulletItem onFeatureInfoBulletItem = infoItem.b;
            if (onFeatureInfoBulletItem != null) {
                featureInfoTextItem = new FeatureInfoBulletItem(onFeatureInfoBulletItem.f21061a, onFeatureInfoBulletItem.b, onFeatureInfoBulletItem.c);
            } else {
                RewardsAppModalQuery.OnFeatureInfoText onFeatureInfoText = infoItem.c;
                featureInfoTextItem = onFeatureInfoText != null ? new FeatureInfoTextItem(onFeatureInfoText.f21062a) : null;
            }
            if (featureInfoTextItem != null) {
                arrayList2.add(featureInfoTextItem);
            }
        }
        RewardsAppModalQuery.Footer footer = rewardsAppModal.e;
        if (footer != null) {
            RewardsAppModalQuery.PrimaryCta primaryCta = footer.f21058a;
            ContentCta contentCta = new ContentCta(primaryCta.f21063a, primaryCta.b, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null);
            RewardsAppModalQuery.SecondaryCta secondaryCta = footer.b;
            featureInfoFooter = new FeatureInfoFooter(contentCta, secondaryCta != null ? new ContentCta(secondaryCta.f21065a, secondaryCta.b, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null) : null);
        } else {
            featureInfoFooter = null;
        }
        return new RewardsAppModalData(downloadableAsset, str2, str3, (String) null, arrayList2, featureInfoFooter, (AnalyticsData) null, (AnalyticsData) null, 200, (DefaultConstructorMarker) null);
    }
}
