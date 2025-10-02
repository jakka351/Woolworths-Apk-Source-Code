package au.com.woolworths.design.core.ui.component.stable.button;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.design.core.ui.component.stable.loadingbutton.DestructiveLoadingButtonKt;
import au.com.woolworths.feature.product.list.compose.FilterChipGroupKt;
import au.com.woolworths.feature.rewards.account.closeaccount.model.ConsentPage;
import au.com.woolworths.feature.rewards.account.closeaccount.ui.ConsentPageUiKt;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContentKt;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContract;
import au.com.woolworths.feature.rewards.offers.OfferFeedInlineBannerViewItem;
import au.com.woolworths.feature.rewards.offers.ui.OfferFeedInlineBannerKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.DirectionAndDistanceIndicatorData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListActionState;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListUiKt;
import au.com.woolworths.shop.product.details.ui.ProductDetailsHealthierOptionsAccordianKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d = 3;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    public /* synthetic */ d(ConsentPage consentPage, LazyListState lazyListState, Boolean bool, Function1 function1, Function1 function12, boolean z, int i) {
        this.e = consentPage;
        this.f = lazyListState;
        this.k = bool;
        this.h = function1;
        this.i = function12;
        this.g = z;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                PrimaryButtonKt.b((String) this.e, (Function0) this.f, (Function2) this.k, (Modifier) this.h, this.g, (ButtonSpec.Size) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                DestructiveLoadingButtonKt.a((String) this.e, (Function0) this.f, this.g, (Modifier) this.h, (String) this.k, (ButtonSpec.Size) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(7);
                FilterChipGroupKt.a((List) this.k, (Function0) this.f, (Function3) this.h, this.j, this.g, (String) this.e, (Function1) this.i, (Composer) obj, iA);
                break;
            case 3:
                ((Integer) obj2).intValue();
                ConsentPageUiKt.a((ConsentPage) this.e, (LazyListState) this.f, (Boolean) this.k, (Function1) this.h, (Function1) this.i, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                RewardsPreferenceDetailsContentKt.a((RewardsPreferenceDetailsContract.ViewState) this.e, (Function2) this.k, (Function1) this.h, (Function0) this.f, (Function0) this.i, this.g, (Composer) obj, iA2, this.j);
                break;
            case 5:
                ((Integer) obj2).getClass();
                OfferFeedInlineBannerKt.c((OfferFeedInlineBannerViewItem) this.e, this.g, (Function1) this.f, (Function1) this.k, (Function1) this.i, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                InstoreMapScreenKt.g((List) this.e, (ProductCard) this.f, (DirectionAndDistanceIndicatorData) this.k, (InstoreMapCallbacks) this.i, (Modifier) this.h, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                ScrollableListUiKt.b((String) this.e, (String) this.k, (String) this.h, (ScrollableListActionState) this.i, (Function0) this.f, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ProductDetailsHealthierOptionsAccordianKt.a((String) this.e, (IconAsset) this.k, this.g, (Function0) this.f, (String) this.h, (ComposableLambdaImpl) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ d(RewardsPreferenceDetailsContract.ViewState viewState, Function2 function2, Function1 function1, Function0 function0, Function0 function02, boolean z, int i, int i2) {
        this.e = viewState;
        this.k = function2;
        this.h = function1;
        this.f = function0;
        this.i = function02;
        this.g = z;
        this.j = i2;
    }

    public /* synthetic */ d(OfferFeedInlineBannerViewItem offerFeedInlineBannerViewItem, boolean z, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i) {
        this.e = offerFeedInlineBannerViewItem;
        this.g = z;
        this.f = function1;
        this.k = function12;
        this.i = function13;
        this.h = modifier;
        this.j = i;
    }

    public /* synthetic */ d(String str, IconAsset iconAsset, boolean z, Function0 function0, String str2, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.e = str;
        this.k = iconAsset;
        this.g = z;
        this.f = function0;
        this.h = str2;
        this.i = composableLambdaImpl;
        this.j = i;
    }

    public /* synthetic */ d(String str, String str2, String str3, ScrollableListActionState scrollableListActionState, Function0 function0, boolean z, int i) {
        this.e = str;
        this.k = str2;
        this.h = str3;
        this.i = scrollableListActionState;
        this.f = function0;
        this.g = z;
        this.j = i;
    }

    public /* synthetic */ d(String str, Function0 function0, Function2 function2, Modifier modifier, boolean z, ButtonSpec.Size size, int i) {
        this.e = str;
        this.f = function0;
        this.k = function2;
        this.h = modifier;
        this.g = z;
        this.i = size;
        this.j = i;
    }

    public /* synthetic */ d(String str, Function0 function0, boolean z, Modifier modifier, String str2, ButtonSpec.Size size, int i) {
        this.e = str;
        this.f = function0;
        this.g = z;
        this.h = modifier;
        this.k = str2;
        this.i = size;
        this.j = i;
    }

    public /* synthetic */ d(List list, ProductCard productCard, DirectionAndDistanceIndicatorData directionAndDistanceIndicatorData, InstoreMapCallbacks instoreMapCallbacks, Modifier modifier, boolean z, int i) {
        this.e = list;
        this.f = productCard;
        this.k = directionAndDistanceIndicatorData;
        this.i = instoreMapCallbacks;
        this.h = modifier;
        this.g = z;
        this.j = i;
    }

    public /* synthetic */ d(List list, Function0 function0, Function3 function3, int i, boolean z, String str, Function1 function1, int i2) {
        this.k = list;
        this.f = function0;
        this.h = function3;
        this.j = i;
        this.g = z;
        this.e = str;
        this.i = function1;
    }
}
