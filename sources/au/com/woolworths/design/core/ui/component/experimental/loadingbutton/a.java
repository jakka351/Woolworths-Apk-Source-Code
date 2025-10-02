package au.com.woolworths.design.core.ui.component.experimental.loadingbutton;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesProductItemKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.product.details.data.FooterData;
import au.com.woolworths.shop.product.details.ui.ProductDetailsFooterUIKt;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Function k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ a(YourGroceriesProductItem yourGroceriesProductItem, Function1 function1, Function1 function12, Function2 function2, Map map, boolean z, boolean z2, int i, int i2) {
        this.i = yourGroceriesProductItem;
        this.j = function1;
        this.k = function12;
        this.l = function2;
        this.m = map;
        this.e = z;
        this.f = z2;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                PrimaryLoadingButtonKt.a((String) this.i, (Function0) this.k, this.e, this.f, (Modifier) this.l, (String) this.j, (ButtonSpec.Size) this.m, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                YourGroceriesProductItemKt.f((YourGroceriesProductItem) this.i, (Function1) this.j, (Function1) this.k, (Function2) this.l, (Map) this.m, this.e, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                ProductDetailsFooterUIKt.c((ProductCard) this.i, (FooterData) this.j, (Function1) this.k, (ProductClickListener) this.m, this.e, this.f, (Modifier) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(ProductCard productCard, FooterData footerData, Function1 function1, ProductClickListener productClickListener, boolean z, boolean z2, Modifier modifier, int i, int i2) {
        this.i = productCard;
        this.j = footerData;
        this.k = function1;
        this.m = productClickListener;
        this.e = z;
        this.f = z2;
        this.l = modifier;
        this.g = i;
        this.h = i2;
    }

    public /* synthetic */ a(String str, Function0 function0, boolean z, boolean z2, Modifier modifier, String str2, ButtonSpec.Size size, int i, int i2) {
        this.i = str;
        this.k = function0;
        this.e = z;
        this.f = z2;
        this.l = modifier;
        this.j = str2;
        this.m = size;
        this.g = i;
        this.h = i2;
    }
}
