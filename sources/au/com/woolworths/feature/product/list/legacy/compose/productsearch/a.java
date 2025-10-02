package au.com.woolworths.feature.product.list.legacy.compose.productsearch;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ChoosePlanContentKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanFeed;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.DirectionAndDistanceIndicatorData;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.ui.wpay.CvvActions;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContentKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionsInfo;
import au.com.woolworths.shop.checkout.ui.compose.FulfilmentSelectionOptionsUiKt;
import au.com.woolworths.shop.lists.ui.substitutions.SimilarProductsScreenKt;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ a(EverydayExtrasChoosePlanFeed everydayExtrasChoosePlanFeed, TextAlign textAlign, boolean z, String str, Function1 function1, Function1 function12, Modifier modifier, int i) {
        this.i = everydayExtrasChoosePlanFeed;
        this.j = textAlign;
        this.e = z;
        this.k = str;
        this.f = function1;
        this.l = function12;
        this.g = modifier;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                SearchTilesSectionKt.f((Function0) this.i, (Function0) this.j, (Function0) this.k, (Function0) this.l, this.f, this.e, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ChoosePlanContentKt.c((EverydayExtrasChoosePlanFeed) this.i, (TextAlign) this.j, this.e, (String) this.k, this.f, (Function1) this.l, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                InstoreMapScreenKt.i(this.f, (List) this.j, (ProductCard) this.k, (DirectionAndDistanceIndicatorData) this.l, this.e, (Function0) this.i, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                WPayForOrderContentKt.e((PaymentMethodItem.CreditCard) this.i, (String) this.j, (Map) this.k, this.e, (String) this.l, (CvvActions) this.g, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                FulfilmentSelectionOptionsUiKt.d((String) this.k, this.e, (FulfilmentSlotSelectionOptionsInfo) this.l, (Function0) this.i, (Function0) this.j, this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                SimilarProductsScreenKt.k((ViewSimilarProductsContract.ViewState) this.j, this.e, this.f, (Function1) this.k, (Function0) this.i, (Function1) this.l, (ProductClickListener) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(PaymentMethodItem.CreditCard creditCard, String str, Map map, boolean z, String str2, CvvActions cvvActions, Function1 function1, int i) {
        this.i = creditCard;
        this.j = str;
        this.k = map;
        this.e = z;
        this.l = str2;
        this.g = cvvActions;
        this.f = function1;
        this.h = i;
    }

    public /* synthetic */ a(ViewSimilarProductsContract.ViewState viewState, boolean z, Function1 function1, Function1 function12, Function0 function0, Function1 function13, ProductClickListener productClickListener, int i) {
        this.j = viewState;
        this.e = z;
        this.f = function1;
        this.k = function12;
        this.i = function0;
        this.l = function13;
        this.g = productClickListener;
        this.h = i;
    }

    public /* synthetic */ a(String str, boolean z, FulfilmentSlotSelectionOptionsInfo fulfilmentSlotSelectionOptionsInfo, Function0 function0, Function0 function02, Function1 function1, Modifier modifier, int i) {
        this.k = str;
        this.e = z;
        this.l = fulfilmentSlotSelectionOptionsInfo;
        this.i = function0;
        this.j = function02;
        this.f = function1;
        this.g = modifier;
        this.h = i;
    }

    public /* synthetic */ a(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function1, boolean z, Modifier modifier, int i) {
        this.i = function0;
        this.j = function02;
        this.k = function03;
        this.l = function04;
        this.f = function1;
        this.e = z;
        this.g = modifier;
        this.h = i;
    }

    public /* synthetic */ a(Function1 function1, List list, ProductCard productCard, DirectionAndDistanceIndicatorData directionAndDistanceIndicatorData, boolean z, Function0 function0, Modifier modifier, int i) {
        this.f = function1;
        this.j = list;
        this.k = productCard;
        this.l = directionAndDistanceIndicatorData;
        this.e = z;
        this.i = function0;
        this.g = modifier;
        this.h = i;
    }
}
