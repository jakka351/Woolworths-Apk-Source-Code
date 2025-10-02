package au.com.woolworths.promotion.banner.data;

import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.promotion.banner.ui.PromotionBanner;
import au.com.woolworths.promotion.banner.ui.PromotionBannerAction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"promotion-banner_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PromotionBannerApiDataKt {
    public static final PromotionBanner a(PromotionBannerApiData promotionBannerApiData) {
        InsetBannerData uiModel = InsetBannerApiDataExtKt.toUiModel(promotionBannerApiData.getBanner());
        InlineErrorAction e = uiModel.getE();
        PromotionContent promotionContent = promotionBannerApiData.getPromotionContent();
        return new PromotionBanner(uiModel, ((e instanceof InlineErrorAction.AppLocal) && (promotionContent instanceof PromotionMarkdownContent)) ? new PromotionBannerAction.LaunchPromotionDetails((PromotionMarkdownContent) promotionContent) : e instanceof InlineErrorAction.Link ? new PromotionBannerAction.Link(((InlineErrorAction.Link) e).e) : PromotionBannerAction.None.d);
    }
}
