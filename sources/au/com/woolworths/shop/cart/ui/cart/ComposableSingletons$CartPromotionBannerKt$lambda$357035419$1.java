package au.com.woolworths.shop.cart.ui.cart;

import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.android.onesite.modules.insetbanner.ActionPlacement;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.promotion.banner.data.PromotionMarkdownContent;
import au.com.woolworths.promotion.banner.ui.PromotionBanner;
import au.com.woolworths.promotion.banner.ui.PromotionBannerAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.cart.ui.cart.ComposableSingletons$CartPromotionBannerKt$lambda$-357035419$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$CartPromotionBannerKt$lambda$357035419$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            InlineErrorType inlineErrorType = InlineErrorType.i;
            PlainText plainText = new PlainText("On Everyday Market orders $30 or more. No min. spend for Delivery Unlimited.");
            InlineErrorCause.IconConfig.CustomIcon customIcon = new InlineErrorCause.IconConfig.CustomIcon("https://uatcdn0.woolworths.media/content/mobile/marketplace/info/ic-em-free-shipping.png");
            PromotionBanner promotionBanner = new PromotionBanner(new InsetBannerData(null, ActionPlacement.BOTTOM, plainText, new InlineErrorAction.AppLocal(new PlainText("Terms Conditions")), inlineErrorType, customIcon), new PromotionBannerAction.LaunchPromotionDetails(new PromotionMarkdownContent("Title", "Terms and conditions in details.")));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objG);
            }
            composer.l();
            CartPromotionBannerKt.a(promotionBanner, (Function0) objG, composer, 48);
        }
        return Unit.f24250a;
    }
}
