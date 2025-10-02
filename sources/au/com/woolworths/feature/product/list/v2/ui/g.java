package au.com.woolworths.feature.product.list.v2.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.product.list.v2.data.ProductListZeroResults;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinInStoreWifiScreenKt;
import au.com.woolworths.feature.shop.inbox.domain.NotificationItem;
import au.com.woolworths.feature.shop.inbox.ui.MessageRowKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionLinkedPayPalItemKt;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsBottomSheetData;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsContentKt;
import au.com.woolworths.shop.product.details.data.ProductDetailsProductPanel;
import au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt;
import au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingViewModel;
import au.com.woolworths.shop.rewards.priming.ui.RewardsSetupPrimingScreenKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ g(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.d = i2;
        this.g = obj;
        this.h = obj2;
        this.f = obj3;
        this.i = obj4;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(24577);
                ProductListZeroResultsViewKt.a((ProductListZeroResults) this.g, this.e, (ProductClickListener) this.h, (Function1) this.f, (Modifier) this.i, (Composer) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                JoinInStoreWifiScreenKt.j(this.e, (Function1) this.f, (Function2) this.g, (String) this.h, (String) this.i, (Composer) obj, iA2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(1);
                MessageRowKt.a((NotificationItem) this.g, this.e, (Function0) this.h, (Function0) this.f, (Modifier) this.i, (Composer) obj, iA3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iA4 = RecomposeScopeImplKt.a(1);
                InstoreMapScreenKt.d((InstoreMapContract.ViewState.Content) this.g, (InstoreMapCallbacks) this.h, (InstoreMapContract.ViewState) this.f, (Modifier) this.i, this.e, (Composer) obj, iA4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iA5 = RecomposeScopeImplKt.a(1);
                SectionOptionLinkedPayPalItemKt.a((PaymentMethodItem.PayPal.Linked) this.g, this.e, (Function0) this.h, (Function0) this.f, (Modifier) this.i, (Composer) obj, iA5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iA6 = RecomposeScopeImplKt.a(1);
                TermsContentKt.a((TermsBottomSheetData.Terms) this.g, (Function2) this.h, (Function1) this.f, (Function1) this.i, this.e, (Composer) obj, iA6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iA7 = RecomposeScopeImplKt.a(3073);
                ProductDetailsScreenKt.f((ProductDetailsProductPanel) this.g, (Function0) this.h, this.e, (Modifier) this.i, (Function1) this.f, (Composer) obj, iA7);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA8 = RecomposeScopeImplKt.a(1);
                RewardsSetupPrimingScreenKt.a((RewardsSetupPrimingViewModel) this.g, (Function0) this.h, (Function0) this.f, (Function0) this.i, this.e, (Composer) obj, iA8);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ g(ProductDetailsProductPanel productDetailsProductPanel, Function0 function0, boolean z, Modifier modifier, Function1 function1, int i) {
        this.d = 6;
        this.g = productDetailsProductPanel;
        this.h = function0;
        this.e = z;
        this.i = modifier;
        this.f = function1;
    }

    public /* synthetic */ g(Object obj, boolean z, Object obj2, Function function, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.g = obj;
        this.e = z;
        this.h = obj2;
        this.f = function;
        this.i = modifier;
    }

    public /* synthetic */ g(boolean z, Function1 function1, Function2 function2, String str, String str2, int i) {
        this.d = 1;
        this.e = z;
        this.f = function1;
        this.g = function2;
        this.h = str;
        this.i = str2;
    }
}
