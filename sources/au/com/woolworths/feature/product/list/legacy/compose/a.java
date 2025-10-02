package au.com.woolworths.feature.product.list.legacy.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.SubscribePlanItemUiKt;
import au.com.woolworths.feature.shop.wpay.ui.common.component.WebViewScreenKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.ui.SortByViewScreenKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d = 3;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ a(SortByViewContract.ViewState viewState, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i) {
        this.j = viewState;
        this.e = z;
        this.h = z2;
        this.i = function0;
        this.k = function02;
        this.f = function03;
        this.l = function04;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                FilterChipGroupKt.a(this.e, (List) this.j, this.i, (Function3) this.k, this.g, this.h, (String) this.f, (Function1) this.l, (Composer) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                SubscribePlanItemUiKt.a(this.e, (String) this.f, (String) this.j, this.g, (BrandLabel) this.k, this.h, this.i, (Modifier) this.l, (Composer) obj, iA2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                WebViewScreenKt.a((Function1) this.l, this.i, (Function2) this.j, (Function2) this.k, (Modifier) this.f, this.e, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                SortByViewScreenKt.f((SortByViewContract.ViewState) this.j, this.e, this.h, this.i, (Function0) this.k, (Function0) this.f, (Function0) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(Function1 function1, Function0 function0, Function2 function2, Function2 function22, Modifier modifier, boolean z, boolean z2, int i) {
        this.l = function1;
        this.i = function0;
        this.j = function2;
        this.k = function22;
        this.f = modifier;
        this.e = z;
        this.h = z2;
        this.g = i;
    }

    public /* synthetic */ a(boolean z, String str, String str2, int i, BrandLabel brandLabel, boolean z2, Function0 function0, Modifier modifier, int i2) {
        this.e = z;
        this.f = str;
        this.j = str2;
        this.g = i;
        this.k = brandLabel;
        this.h = z2;
        this.i = function0;
        this.l = modifier;
    }

    public /* synthetic */ a(boolean z, List list, Function0 function0, Function3 function3, int i, boolean z2, String str, Function1 function1, int i2) {
        this.e = z;
        this.j = list;
        this.i = function0;
        this.k = function3;
        this.g = i;
        this.h = z2;
        this.f = str;
        this.l = function1;
    }
}
