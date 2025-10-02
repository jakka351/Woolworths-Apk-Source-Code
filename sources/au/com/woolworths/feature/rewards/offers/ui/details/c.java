package au.com.woolworths.feature.rewards.offers.ui.details;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.banners.imagetextbanner.ImageTextBannerUiKt;
import au.com.woolworths.feature.shop.banners.imagetextbanner.data.ImageTextBanner;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsStatusBadge;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ float f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ c(ImageTextBanner imageTextBanner, Modifier modifier, float f, int i, int i2) {
        this.i = imageTextBanner;
        this.e = modifier;
        this.f = f;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                OfferDetailsScreenKt.h((OfferDetailsStatusBadge) this.i, this.f, this.e, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                ImageTextBannerUiKt.a((ImageTextBanner) this.i, this.e, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ c(OfferDetailsStatusBadge offerDetailsStatusBadge, float f, Modifier modifier, int i, int i2) {
        this.i = offerDetailsStatusBadge;
        this.f = f;
        this.e = modifier;
        this.g = i;
        this.h = i2;
    }
}
