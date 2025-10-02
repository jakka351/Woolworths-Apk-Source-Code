package au.com.woolworths.design.core.ui.component.experimental.dialog;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.ScaffoldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertKt;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertSpec;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertType;
import au.com.woolworths.design.core.ui.component.stable.alert.Placement;
import au.com.woolworths.dynamic.page.ui.DynamicPageContract;
import au.com.woolworths.dynamic.page.ui.content.LandingPageScreenUiKt;
import au.com.woolworths.feature.product.list.v2.ui.ProductCardGridTileUiKt;
import au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountContract;
import au.com.woolworths.feature.rewards.account.closeaccount.ui.CloseAccountScreenKt;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.feature.shop.bundles.data.BundlesData;
import au.com.woolworths.feature.shop.bundles.data.BundlesProductCardConfig;
import au.com.woolworths.feature.shop.bundles.ui.BundleUIKt;
import au.com.woolworths.feature.shop.voc.score.VocContract;
import au.com.woolworths.feature.shop.voc.score.VocSurveyCardKt;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsTrackerState;
import au.com.woolworths.foundation.shop.olive.voice.ui.permission.OliveVoicePermissionScreenKt;
import au.com.woolworths.product.composeui.CartButtonKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.ui.ProductCardButtonType;
import com.google.accompanist.permissions.PermissionState;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ b(AlertStyle alertStyle, AlertType alertType, String str, Modifier modifier, AlertSpec.Action action, String str2, ImageVector imageVector, int i, int i2) {
        this.d = 2;
        this.j = alertStyle;
        this.k = alertType;
        this.f = str;
        this.e = modifier;
        this.l = action;
        this.g = str2;
        this.m = imageVector;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                AlertDialogKt.a((String) this.f, (String) this.g, (Modifier) this.e, (String) this.j, (String) this.k, (Function0) this.l, (Function0) this.m, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 1:
                ((Integer) obj2).getClass();
                AlertKt.c((AlertStyle) this.j, (Placement) this.k, (Modifier) this.e, (AlertSpec.Action) this.l, (String) this.f, (String) this.g, (ImageVector) this.m, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 2:
                ((Integer) obj2).getClass();
                AlertKt.a((AlertStyle) this.j, (AlertType) this.k, (String) this.f, (Modifier) this.e, (AlertSpec.Action) this.l, (String) this.g, (ImageVector) this.m, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 3:
                ((Integer) obj2).getClass();
                LandingPageScreenUiKt.c((DynamicPageContract.ViewState) this.f, (Function2) this.g, (Function0) this.l, (Function0) this.m, (Function0) this.j, (Function0) this.k, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ProductCardGridTileUiKt.a((ProductCard) this.f, (ProductClickListener) this.g, (ProductCardConfig) this.j, (List) this.k, (Modifier) this.e, (Function0) this.l, (SharedIntrinsicHeightState) this.m, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 5:
                ((Integer) obj2).getClass();
                CloseAccountScreenKt.a((CloseAccountContract.ViewState) this.f, (Function0) this.l, (Function1) this.g, (Function1) this.j, (Function0) this.m, (Function0) this.k, (ScaffoldState) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 6:
                ((Integer) obj2).intValue();
                BundleUIKt.a((Bundle) this.f, this.h, (ListItemsTrackerState) this.g, (BundlesData.BundlesLandingPage) this.j, (LazyListState) this.k, (BundlesProductCardConfig) this.e, (Function1) this.l, (Map) this.m, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                VocSurveyCardKt.j((VocContract.ViewState) this.f, (Modifier) this.e, (Function1) this.g, (Function0) this.l, (Function3) this.j, (Function0) this.m, (Function1) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 8:
                ((Integer) obj2).getClass();
                OliveVoicePermissionScreenKt.a((PermissionState) this.f, (Function2) this.g, (Function0) this.l, (Function0) this.m, (Function0) this.j, (Function1) this.k, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                CartButtonKt.a((ProductCardButtonType) this.f, (ProductCard) this.g, (Function0) this.l, (Function0) this.m, (Function0) this.j, (Function0) this.k, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(AlertStyle alertStyle, Placement placement, Modifier modifier, AlertSpec.Action action, String str, String str2, ImageVector imageVector, int i, int i2) {
        this.d = 1;
        this.j = alertStyle;
        this.k = placement;
        this.e = modifier;
        this.l = action;
        this.f = str;
        this.g = str2;
        this.m = imageVector;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ b(CloseAccountContract.ViewState viewState, Function0 function0, Function1 function1, Function1 function12, Function0 function02, Function0 function03, ScaffoldState scaffoldState, int i, int i2) {
        this.d = 5;
        this.f = viewState;
        this.l = function0;
        this.g = function1;
        this.j = function12;
        this.m = function02;
        this.k = function03;
        this.e = scaffoldState;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ b(Bundle bundle, int i, ListItemsTrackerState listItemsTrackerState, BundlesData.BundlesLandingPage bundlesLandingPage, LazyListState lazyListState, BundlesProductCardConfig bundlesProductCardConfig, Function1 function1, Map map, int i2) {
        this.d = 6;
        this.f = bundle;
        this.h = i;
        this.g = listItemsTrackerState;
        this.j = bundlesLandingPage;
        this.k = lazyListState;
        this.e = bundlesProductCardConfig;
        this.l = function1;
        this.m = map;
        this.i = i2;
    }

    public /* synthetic */ b(VocContract.ViewState viewState, Modifier modifier, Function1 function1, Function0 function0, Function3 function3, Function0 function02, Function1 function12, int i, int i2) {
        this.d = 7;
        this.f = viewState;
        this.e = modifier;
        this.g = function1;
        this.l = function0;
        this.j = function3;
        this.m = function02;
        this.k = function12;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ b(ProductCard productCard, ProductClickListener productClickListener, ProductCardConfig productCardConfig, List list, Modifier modifier, Function0 function0, SharedIntrinsicHeightState sharedIntrinsicHeightState, int i, int i2) {
        this.d = 4;
        this.f = productCard;
        this.g = productClickListener;
        this.j = productCardConfig;
        this.k = list;
        this.e = modifier;
        this.l = function0;
        this.m = sharedIntrinsicHeightState;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ b(Object obj, Object obj2, Function0 function0, Function0 function02, Function0 function03, Function function, Modifier modifier, int i, int i2, int i3) {
        this.d = i3;
        this.f = obj;
        this.g = obj2;
        this.l = function0;
        this.m = function02;
        this.j = function03;
        this.k = function;
        this.e = modifier;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ b(String str, String str2, Modifier modifier, String str3, String str4, Function0 function0, Function0 function02, int i, int i2) {
        this.d = 0;
        this.f = str;
        this.g = str2;
        this.e = modifier;
        this.j = str3;
        this.k = str4;
        this.l = function0;
        this.m = function02;
        this.h = i;
        this.i = i2;
    }
}
