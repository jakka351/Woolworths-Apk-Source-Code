package au.com.woolworths.design.core.ui.component.experimental.chip;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipSpec;
import au.com.woolworths.feature.shop.wpay.ui.wpay.CreditCardActions;
import au.com.woolworths.feature.shop.wpay.ui.wpay.CvvActions;
import au.com.woolworths.shop.checkout.ui.components.compose.CheckoutSummaryRowTileKt;
import au.com.woolworths.shop.checkout.ui.summary.common.DiscountItemUiKt;
import au.com.woolworths.shop.deliveryunlimited.signup.domain.model.DeliveryUnlimitedPaymentResponse;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContentKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d = 3;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ c(DeliveryUnlimitedPaymentResponse deliveryUnlimitedPaymentResponse, String str, boolean z, String str2, String str3, CreditCardActions creditCardActions, CvvActions cvvActions, Function0 function0, Function1 function1, Function2 function2, int i, int i2) {
        this.k = deliveryUnlimitedPaymentResponse;
        this.e = str;
        this.g = z;
        this.f = str2;
        this.l = str3;
        this.h = creditCardActions;
        this.o = cvvActions;
        this.m = function0;
        this.p = function1;
        this.n = function2;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ChipImplKt.b(this.g, (ChipSpec) this.k, this.e, this.f, (Function0) this.m, (Modifier) this.h, (String) this.l, (Function2) this.n, (Function2) this.o, (Arrangement.Horizontal) this.p, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1), this.j);
                break;
            case 1:
                ((Integer) obj2).getClass();
                CheckoutSummaryRowTileKt.a(this.e, this.f, this.g, (Modifier) this.h, (ImageVector) this.k, (Color) this.l, (Color) this.m, (ImageVector) this.n, (Color) this.o, (ImageVector) this.p, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1), this.j);
                break;
            case 2:
                ((Integer) obj2).getClass();
                DiscountItemUiKt.a(this.e, this.f, (String) this.l, (String) this.k, this.g, (Boolean) this.n, this.i, (Color) this.o, (Function0) this.m, (Function0) this.p, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                PaymentContentKt.a((DeliveryUnlimitedPaymentResponse) this.k, this.e, this.g, this.f, (String) this.l, (CreditCardActions) this.h, (CvvActions) this.o, (Function0) this.m, (Function1) this.p, (Function2) this.n, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1), RecomposeScopeImplKt.a(this.j));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, boolean z, Boolean bool, int i, Color color, Function0 function0, Function0 function02, Modifier modifier, int i2) {
        this.e = str;
        this.f = str2;
        this.l = str3;
        this.k = str4;
        this.g = z;
        this.n = bool;
        this.i = i;
        this.o = color;
        this.m = function0;
        this.p = function02;
        this.h = modifier;
        this.j = i2;
    }

    public /* synthetic */ c(String str, String str2, boolean z, Modifier modifier, ImageVector imageVector, Color color, Color color2, ImageVector imageVector2, Color color3, ImageVector imageVector3, int i, int i2) {
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = modifier;
        this.k = imageVector;
        this.l = color;
        this.m = color2;
        this.n = imageVector2;
        this.o = color3;
        this.p = imageVector3;
        this.i = i;
        this.j = i2;
    }

    public /* synthetic */ c(boolean z, ChipSpec chipSpec, String str, String str2, Function0 function0, Modifier modifier, String str3, Function2 function2, Function2 function22, Arrangement.Horizontal horizontal, int i, int i2) {
        this.g = z;
        this.k = chipSpec;
        this.e = str;
        this.f = str2;
        this.m = function0;
        this.h = modifier;
        this.l = str3;
        this.n = function2;
        this.o = function22;
        this.p = horizontal;
        this.i = i;
        this.j = i2;
    }
}
