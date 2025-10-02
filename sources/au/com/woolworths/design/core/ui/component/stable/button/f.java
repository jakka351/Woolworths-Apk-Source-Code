package au.com.woolworths.design.core.ui.component.stable.button;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.text.AnnotatedString;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.design.core.ui.component.stable.loadingbutton.PrimaryLoadingButtonKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ChoosePlanContentKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.Screen;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanFeed;
import au.com.woolworths.feature.rewards.offers.ui.ProductOfferCardTileKt;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferContract;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferSuccessScreenKt;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsContentKt;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsListener;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSelectedListener;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function2 {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ f(AnnotatedString annotatedString, Function0 function0, Modifier modifier, boolean z, PaddingValues paddingValues, String str, Map map, int i, int i2) {
        this.l = annotatedString;
        this.f = function0;
        this.h = modifier;
        this.g = z;
        this.m = paddingValues;
        this.e = str;
        this.i = map;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                TertiaryButtonKt.a((String) this.e, (Function0) this.f, (Modifier) this.h, this.g, (ImageVector) this.l, (ImageVector) this.m, (ButtonSpec.Size) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
            case 1:
                ((Integer) obj2).getClass();
                PrimaryLoadingButtonKt.a((String) this.e, (Function0) this.f, this.g, (Modifier) this.h, (String) this.l, (String) this.m, (ButtonSpec.Size) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
            case 2:
                ((Integer) obj2).getClass();
                au.com.woolworths.design.wx.component.button.SecondaryButtonKt.a((AnnotatedString) this.l, (Function0) this.f, (Modifier) this.h, this.g, (PaddingValues) this.m, (String) this.e, (Map) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ChoosePlanContentKt.a((Screen) this.f, (EverydayExtrasChoosePlanFeed) this.l, this.g, (String) this.e, (Function1) this.m, (Function1) this.i, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ProductOfferCardTileKt.a((RewardsOfferData) this.e, (StatefulButtonState) this.f, (Function1) this.l, (Function1) this.m, (Function2) this.i, this.g, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
            case 5:
                ((Integer) obj2).getClass();
                QuickAddOfferSuccessScreenKt.f(this.g, (QuickAddOfferContract.Content.Success) this.e, (Function1) this.f, (Function1) this.l, (Function1) this.m, (Function1) this.i, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
            default:
                ((Integer) obj2).getClass();
                CheckoutDetailsContentKt.a((List) this.e, (InlineMessage) this.f, (CheckoutDetailsListener) this.h, (FulfilmentWindowsListener) this.l, (FulfilmentWindowsSelectedListener) this.m, (EditOrderEventHandler) this.i, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ f(Screen screen, EverydayExtrasChoosePlanFeed everydayExtrasChoosePlanFeed, boolean z, String str, Function1 function1, Function1 function12, Modifier modifier, int i, int i2) {
        this.f = screen;
        this.l = everydayExtrasChoosePlanFeed;
        this.g = z;
        this.e = str;
        this.m = function1;
        this.i = function12;
        this.h = modifier;
        this.j = i;
        this.k = i2;
    }

    public /* synthetic */ f(RewardsOfferData rewardsOfferData, StatefulButtonState statefulButtonState, Function1 function1, Function1 function12, Function2 function2, boolean z, Modifier modifier, int i, int i2) {
        this.e = rewardsOfferData;
        this.f = statefulButtonState;
        this.l = function1;
        this.m = function12;
        this.i = function2;
        this.g = z;
        this.h = modifier;
        this.j = i;
        this.k = i2;
    }

    public /* synthetic */ f(String str, Function0 function0, Modifier modifier, boolean z, ImageVector imageVector, ImageVector imageVector2, ButtonSpec.Size size, int i, int i2) {
        this.e = str;
        this.f = function0;
        this.h = modifier;
        this.g = z;
        this.l = imageVector;
        this.m = imageVector2;
        this.i = size;
        this.j = i;
        this.k = i2;
    }

    public /* synthetic */ f(String str, Function0 function0, boolean z, Modifier modifier, String str2, String str3, ButtonSpec.Size size, int i, int i2) {
        this.e = str;
        this.f = function0;
        this.g = z;
        this.h = modifier;
        this.l = str2;
        this.m = str3;
        this.i = size;
        this.j = i;
        this.k = i2;
    }

    public /* synthetic */ f(List list, InlineMessage inlineMessage, CheckoutDetailsListener checkoutDetailsListener, FulfilmentWindowsListener fulfilmentWindowsListener, FulfilmentWindowsSelectedListener fulfilmentWindowsSelectedListener, EditOrderEventHandler editOrderEventHandler, boolean z, int i, int i2) {
        this.e = list;
        this.f = inlineMessage;
        this.h = checkoutDetailsListener;
        this.l = fulfilmentWindowsListener;
        this.m = fulfilmentWindowsSelectedListener;
        this.i = editOrderEventHandler;
        this.g = z;
        this.j = i;
        this.k = i2;
    }

    public /* synthetic */ f(boolean z, QuickAddOfferContract.Content.Success success, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Modifier modifier, int i, int i2) {
        this.g = z;
        this.e = success;
        this.f = function1;
        this.l = function12;
        this.m = function13;
        this.i = function14;
        this.h = modifier;
        this.j = i;
        this.k = i2;
    }
}
