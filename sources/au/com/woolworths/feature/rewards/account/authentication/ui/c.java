package au.com.woolworths.feature.rewards.account.authentication.ui;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationViewModelNew;
import au.com.woolworths.feature.shared.instore.wifi.ui.content.AppSpecificContent;
import au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel;
import au.com.woolworths.feature.shop.brandedshop.ViewState;
import au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopHomeKt;
import au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d = 3;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Function i;
    public final /* synthetic */ Function j;
    public final /* synthetic */ Object k;

    public /* synthetic */ c(PagerState pagerState, ArrayList arrayList, ArrayList arrayList2, Function2 function2, Function1 function1, Function2 function22, Modifier modifier, int i) {
        this.e = pagerState;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = function2;
        this.i = function1;
        this.j = function22;
        this.k = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                RewardsLoginScreenKt.c((Function0) this.e, (Function0) this.f, (Function0) this.g, (Function0) this.h, (Function3) this.j, (Function0) this.i, (RewardsAuthenticationViewModelNew) this.k, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                AppSpecificContent appSpecificContent = (AppSpecificContent) this.e;
                Function1 function1 = (Function1) this.f;
                MutableState mutableState = (MutableState) this.g;
                Function1 function12 = (Function1) this.h;
                Function2 function2 = (Function2) this.i;
                Function2 function22 = (Function2) this.j;
                Function2 function23 = (Function2) this.k;
                String url = (String) obj;
                String linkText = (String) obj2;
                Intrinsics.h(url, "url");
                Intrinsics.h(linkText, "linkText");
                String strD = appSpecificContent.d();
                String strH = appSpecificContent.h();
                String strF = appSpecificContent.f();
                String strC = appSpecificContent.c();
                if (url.equals("com.woolworths.shop://feedbackForm?formid=5952")) {
                    Boolean bool = (Boolean) mutableState.getD();
                    function1.invoke(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
                } else if (url.equals(strD)) {
                    Boolean bool2 = (Boolean) mutableState.getD();
                    function12.invoke(Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
                } else if (url.equals(strH)) {
                    Boolean bool3 = (Boolean) mutableState.getD();
                    function2.invoke(Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false), linkText);
                } else if (url.equals(strF)) {
                    Boolean bool4 = (Boolean) mutableState.getD();
                    function22.invoke(Boolean.valueOf(bool4 != null ? bool4.booleanValue() : false), linkText);
                } else if (url.equals(strC)) {
                    Boolean bool5 = (Boolean) mutableState.getD();
                    function23.invoke(Boolean.valueOf(bool5 != null ? bool5.booleanValue() : false), linkText);
                }
                return Unit.f24250a;
            case 2:
                ((Integer) obj2).getClass();
                BrandedShopHomeKt.b((ViewState) this.h, (Function0) this.e, (Function0) this.f, (Function0) this.g, (Function1) this.i, (Function1) this.j, (BrandedShopViewModel) this.k, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ProductDetailsScreenKt.l((PagerState) this.e, (ArrayList) this.f, (ArrayList) this.g, (Function2) this.h, (Function1) this.i, (Function2) this.j, (Modifier) this.k, (Composer) obj, RecomposeScopeImplKt.a(1572865));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ c(AppSpecificContent appSpecificContent, Function1 function1, MutableState mutableState, Function1 function12, Function2 function2, Function2 function22, Function2 function23) {
        this.e = appSpecificContent;
        this.f = function1;
        this.g = mutableState;
        this.h = function12;
        this.i = function2;
        this.j = function22;
        this.k = function23;
    }

    public /* synthetic */ c(ViewState viewState, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, BrandedShopViewModel brandedShopViewModel, int i) {
        this.h = viewState;
        this.e = function0;
        this.f = function02;
        this.g = function03;
        this.i = function1;
        this.j = function12;
        this.k = brandedShopViewModel;
    }

    public /* synthetic */ c(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function3 function3, Function0 function05, RewardsAuthenticationViewModelNew rewardsAuthenticationViewModelNew, int i) {
        this.e = function0;
        this.f = function02;
        this.g = function03;
        this.h = function04;
        this.j = function3;
        this.i = function05;
        this.k = rewardsAuthenticationViewModelNew;
    }
}
