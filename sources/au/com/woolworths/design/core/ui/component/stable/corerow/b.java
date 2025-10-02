package au.com.woolworths.design.core.ui.component.stable.corerow;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.AddCreditCardResponse;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardContentKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ b(String str, boolean z, AddCreditCardResponse addCreditCardResponse, boolean z2, Function1 function1, Function1 function12, Function0 function0, Function2 function2, Function2 function22, int i) {
        this.e = str;
        this.f = z;
        this.k = addCreditCardResponse;
        this.g = z2;
        this.h = function1;
        this.l = function12;
        this.i = function0;
        this.m = function2;
        this.n = function22;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                CheckboxRowKt.b(this.e, this.f, this.h, (Modifier) this.k, this.g, this.i, (CoreRowSpec.Image) this.l, (CoreRowSpec.TrailingDisplay) this.m, (CoreRowSpec.DividerType) this.n, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                AddCreditCardContentKt.b(this.e, this.f, (AddCreditCardResponse) this.k, this.g, this.h, (Function1) this.l, this.i, (Function2) this.m, (Function2) this.n, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(String str, boolean z, Function1 function1, Modifier modifier, boolean z2, Function0 function0, CoreRowSpec.Image image, CoreRowSpec.TrailingDisplay trailingDisplay, CoreRowSpec.DividerType dividerType, int i) {
        this.e = str;
        this.f = z;
        this.h = function1;
        this.k = modifier;
        this.g = z2;
        this.i = function0;
        this.l = image;
        this.m = trailingDisplay;
        this.n = dividerType;
        this.j = i;
    }
}
