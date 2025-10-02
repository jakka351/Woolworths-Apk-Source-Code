package au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.rewards.offers.ProductSectionViewItem;
import au.com.woolworths.shared.ui.compose.filter.AllFiltersChipKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Function p;

    public /* synthetic */ a(ProductSectionViewItem productSectionViewItem, Function1 function1, Function1 function12, Function2 function2, Function1 function13, Function0 function0, Function1 function14, int i, boolean z, boolean z2, int i2, int i3) {
        this.l = productSectionViewItem;
        this.m = function1;
        this.n = function12;
        this.h = function2;
        this.o = function13;
        this.g = function0;
        this.p = function14;
        this.i = i;
        this.e = z;
        this.f = z2;
        this.j = i2;
        this.k = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                OfferCarouselViewKt.a((ProductSectionViewItem) this.l, (Function1) this.m, (Function1) this.n, this.h, (Function1) this.o, this.g, (Function1) this.p, this.i, this.e, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
            default:
                ((Integer) obj2).getClass();
                AllFiltersChipKt.a(this.e, this.f, (String) this.l, this.g, (Modifier) this.m, (String) this.n, (String) this.o, this.h, (Function2) this.p, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1), RecomposeScopeImplKt.a(this.j), this.k);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(boolean z, boolean z2, String str, Function0 function0, Modifier modifier, String str2, String str3, Function2 function2, Function2 function22, int i, int i2, int i3) {
        this.e = z;
        this.f = z2;
        this.l = str;
        this.g = function0;
        this.m = modifier;
        this.n = str2;
        this.o = str3;
        this.h = function2;
        this.p = function22;
        this.i = i;
        this.j = i2;
        this.k = i3;
    }
}
