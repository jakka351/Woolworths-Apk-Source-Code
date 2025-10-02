package au.com.woolworths.feature.product.list.compose.productsearch;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.rewards.account.settings.v2.ui.SectionTitleUiKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.SubheadTextItemUiKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.TitleTextItemUiKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummarySubheadTextItemUiKt;
import au.com.woolworths.feature.shop.product.availability.ui.CurrentStorePanelUiKt;
import au.com.woolworths.foundation.shop.instore.navigation.productfinder.ProductFinderTitleKt;
import au.com.woolworths.shop.product.details.ui.ProductUnitPriceDescriptionKt;
import au.com.woolworths.shop.productcard.ui.components.ProductNameKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ f(String str, Modifier modifier, int i, int i2, int i3) {
        this.d = i3;
        this.e = str;
        this.f = modifier;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                SearchTilesSectionKt.g(RecomposeScopeImplKt.a(this.g | 1), this.h, composer, this.f, this.e);
                break;
            case 1:
                au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTilesSectionKt.g(RecomposeScopeImplKt.a(this.g | 1), this.h, composer, this.f, this.e);
                break;
            case 2:
                SectionTitleUiKt.a(RecomposeScopeImplKt.a(this.g | 1), this.h, composer, this.f, this.e);
                break;
            case 3:
                SubheadTextItemUiKt.a(RecomposeScopeImplKt.a(this.g | 1), this.h, composer, this.f, this.e);
                break;
            case 4:
                TitleTextItemUiKt.a(RecomposeScopeImplKt.a(this.g | 1), this.h, composer, this.f, this.e);
                break;
            case 5:
                SummarySubheadTextItemUiKt.a(RecomposeScopeImplKt.a(this.g | 1), this.h, composer, this.f, this.e);
                break;
            case 6:
                CurrentStorePanelUiKt.a(RecomposeScopeImplKt.a(this.g | 1), this.h, composer, this.f, this.e);
                break;
            case 7:
                ProductFinderTitleKt.b(RecomposeScopeImplKt.a(this.g | 1), this.h, composer, this.f, this.e);
                break;
            case 8:
                ProductUnitPriceDescriptionKt.a(RecomposeScopeImplKt.a(this.g | 1), this.h, composer, this.f, this.e);
                break;
            default:
                ProductNameKt.a(this.g, RecomposeScopeImplKt.a(this.h | 1), composer, this.f, this.e);
                break;
        }
        return Unit.f24250a;
    }
}
