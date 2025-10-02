package au.com.woolworths.feature.shop.recipes.details.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.wpay.ui.common.component.WappleLoadingScreenKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.GlowBlurLottieKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.search.ContentStateKt;
import au.com.woolworths.shop.aem.components.ui.contentcard.VideoTagKt;
import au.com.woolworths.shop.checkout.ui.compose.VocPlaceholderKt;
import au.com.woolworths.shop.lists.ui.lists.compose.ListHeaderItemKt;
import com.woolworths.shop.product.ui.tags.availabilitylabels.ProductUnavailableLabelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ int f;

    public /* synthetic */ a(int i, int i2, Modifier modifier) {
        this.d = i2;
        this.e = modifier;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                NutritionCircleIndicatorKt.b(this.f, RecomposeScopeImplKt.a(1), composer, this.e);
                break;
            case 1:
                WappleLoadingScreenKt.a(RecomposeScopeImplKt.a(1), this.f, composer, this.e);
                break;
            case 2:
                GlowBlurLottieKt.a(this.e, composer, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 3:
                ContentStateKt.h(this.f, RecomposeScopeImplKt.a(1), composer, this.e);
                break;
            case 4:
                ContentStateKt.d(this.e, composer, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 5:
                VideoTagKt.a(RecomposeScopeImplKt.a(1), this.f, composer, this.e);
                break;
            case 6:
                VocPlaceholderKt.a(this.f, RecomposeScopeImplKt.a(1), composer, this.e);
                break;
            case 7:
                ListHeaderItemKt.a(this.f, RecomposeScopeImplKt.a(1), composer, this.e);
                break;
            default:
                ProductUnavailableLabelKt.a(RecomposeScopeImplKt.a(1), this.f, composer, this.e);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(int i, Modifier modifier, int i2, int i3) {
        this.d = i3;
        this.f = i;
        this.e = modifier;
    }

    public /* synthetic */ a(Modifier modifier, int i, int i2, int i3) {
        this.d = i3;
        this.e = modifier;
        this.f = i2;
    }
}
