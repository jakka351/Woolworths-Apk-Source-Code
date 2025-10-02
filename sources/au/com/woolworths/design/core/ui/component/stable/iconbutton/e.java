package au.com.woolworths.design.core.ui.component.stable.iconbutton;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkState;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonSpec;
import au.com.woolworths.feature.shop.bundles.data.BundleProductCard;
import au.com.woolworths.feature.shop.bundles.data.BundlesProductCardConfig;
import au.com.woolworths.feature.shop.bundles.ui.BundleProductCardKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.onboarding.OliveVoiceOnboardingScreenKt;
import au.com.woolworths.product.composeui.ProductCardButtonsHorizontalKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.ui.ProductCardButtonsState;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfig;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.ui.recipe.RecipeCardKt;
import au.com.woolworths.shop.buyagain.domain.BuyAgainHeader;
import au.com.woolworths.shop.buyagain.ui.composable.BuyAgainHeaderKt;
import au.com.woolworths.shop.product.details.ui.ProductDetailsAccordionKt;
import com.woolworths.shop.product.ui.boost.BoostingState;
import com.woolworths.shop.product.ui.boost.ProductBoostKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ e(ProductCard productCard, String str, ProductClickListener productClickListener, ProductCardButtonsState productCardButtonsState, Modifier modifier, boolean z, int i, int i2) {
        this.d = 3;
        this.i = productCard;
        this.j = str;
        this.k = productClickListener;
        this.l = productCardButtonsState;
        this.f = modifier;
        this.e = z;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                TertiaryIconButtonKt.a((ImageVector) this.i, (String) this.j, (Function0) this.k, (Modifier) this.f, this.e, (IconButtonSpec.Size) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                BundleProductCardKt.a((Function1) this.i, (BundleProductCard) this.j, (BundlesProductCardConfig) this.k, (SharedIntrinsicHeightState) this.l, this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 2:
                ((Integer) obj2).getClass();
                OliveVoiceOnboardingScreenKt.a((Function0) this.k, (Function0) this.i, (Function0) this.j, (Function0) this.l, this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ProductCardButtonsHorizontalKt.b((ProductCard) this.i, (String) this.j, (ProductClickListener) this.k, (ProductCardButtonsState) this.l, (Modifier) this.f, this.e, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 4:
                ((Integer) obj2).getClass();
                RecipeCardKt.a((RecipeCardSummaryData) this.i, (RecipeCardSummaryConfig) this.j, (Function0) this.k, (Modifier) this.f, this.e, (SharedIntrinsicHeightState) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 5:
                ((Integer) obj2).getClass();
                BuyAgainHeaderKt.a((BuyAgainHeader) this.i, (List) this.j, this.e, (CoachMarkState) this.k, (Modifier) this.f, (Function1) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 6:
                ((Integer) obj2).getClass();
                ProductDetailsAccordionKt.a((String) this.j, (String) this.i, (IconAsset) this.f, this.e, (String) this.l, (Function0) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                ProductBoostKt.a((String) this.j, (Modifier) this.f, this.e, (BoostingState) this.i, (Function0) this.k, (String) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ e(BuyAgainHeader buyAgainHeader, List list, boolean z, CoachMarkState coachMarkState, Modifier modifier, Function1 function1, int i, int i2) {
        this.d = 5;
        this.i = buyAgainHeader;
        this.j = list;
        this.e = z;
        this.k = coachMarkState;
        this.f = modifier;
        this.l = function1;
        this.g = i;
        this.h = i2;
    }

    public /* synthetic */ e(Object obj, Object obj2, Function0 function0, Modifier modifier, boolean z, Object obj3, int i, int i2, int i3) {
        this.d = i3;
        this.i = obj;
        this.j = obj2;
        this.k = function0;
        this.f = modifier;
        this.e = z;
        this.l = obj3;
        this.g = i;
        this.h = i2;
    }

    public /* synthetic */ e(String str, Modifier modifier, boolean z, BoostingState boostingState, Function0 function0, String str2, int i, int i2) {
        this.d = 7;
        this.j = str;
        this.f = modifier;
        this.e = z;
        this.i = boostingState;
        this.k = function0;
        this.l = str2;
        this.g = i;
        this.h = i2;
    }

    public /* synthetic */ e(String str, String str2, IconAsset iconAsset, boolean z, String str3, Function0 function0, int i, int i2) {
        this.d = 6;
        this.j = str;
        this.i = str2;
        this.f = iconAsset;
        this.e = z;
        this.l = str3;
        this.k = function0;
        this.g = i;
        this.h = i2;
    }

    public /* synthetic */ e(Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z, Modifier modifier, int i, int i2) {
        this.d = 2;
        this.k = function0;
        this.i = function02;
        this.j = function03;
        this.l = function04;
        this.e = z;
        this.f = modifier;
        this.g = i;
        this.h = i2;
    }

    public /* synthetic */ e(Function1 function1, BundleProductCard bundleProductCard, BundlesProductCardConfig bundlesProductCardConfig, SharedIntrinsicHeightState sharedIntrinsicHeightState, boolean z, Modifier modifier, int i, int i2) {
        this.d = 1;
        this.i = function1;
        this.j = bundleProductCard;
        this.k = bundlesProductCardConfig;
        this.l = sharedIntrinsicHeightState;
        this.e = z;
        this.f = modifier;
        this.g = i;
        this.h = i2;
    }
}
