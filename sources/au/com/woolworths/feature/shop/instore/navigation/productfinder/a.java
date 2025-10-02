package au.com.woolworths.feature.shop.instore.navigation.productfinder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.marketplace.ui.facet.FacetItemKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderNumberDetailsItemKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesTotalPriceKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ a(int i, int i2, int i3, Modifier modifier, String str, String str2, Function0 function0) {
        this.d = i3;
        this.e = str;
        this.f = str2;
        this.g = modifier;
        this.h = function0;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(this.j | 1);
                HeroTileKt.a(this.i, iA, (Composer) obj, this.g, this.e, this.f, this.h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                FacetItemKt.a(RecomposeScopeImplKt.a(this.i | 1), this.j, (Composer) obj, this.g, this.e, this.f, this.h);
                break;
            case 2:
                ((Integer) obj2).getClass();
                OrderNumberDetailsItemKt.a(RecomposeScopeImplKt.a(this.i | 1), this.j, (Composer) obj, this.g, this.e, this.f, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                YourGroceriesTotalPriceKt.a(RecomposeScopeImplKt.a(this.i | 1), this.j, (Composer) obj, this.g, this.e, this.f, this.h);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(int i, Function0 function0, String str, String str2, Modifier modifier, int i2) {
        this.d = 0;
        this.i = i;
        this.h = function0;
        this.e = str;
        this.f = str2;
        this.g = modifier;
        this.j = i2;
    }

    public /* synthetic */ a(String str, Modifier modifier, String str2, Function0 function0, int i, int i2) {
        this.d = 2;
        this.e = str;
        this.g = modifier;
        this.f = str2;
        this.h = function0;
        this.i = i;
        this.j = i2;
    }
}
