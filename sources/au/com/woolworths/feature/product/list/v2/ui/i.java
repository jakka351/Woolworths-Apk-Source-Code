package au.com.woolworths.feature.product.list.v2.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.product.list.v2.data.ProductListZeroResults;
import au.com.woolworths.feature.rewards.account.closeaccount.model.DeleteAccount;
import au.com.woolworths.feature.rewards.account.closeaccount.ui.ConsentPageUiKt;
import au.com.woolworths.product.tile.ProductClickListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ i(ProductListZeroResults.ZeroResultData zeroResultData, boolean z, ProductClickListener productClickListener, boolean z2, Function1 function1, Modifier modifier, int i, int i2) {
        this.j = zeroResultData;
        this.e = z;
        this.k = productClickListener;
        this.g = z2;
        this.f = function1;
        this.l = modifier;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ZeroResultContentViewKt.b((ProductListZeroResults.ZeroResultData) this.j, this.e, (ProductClickListener) this.k, this.g, this.f, (Modifier) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                ConsentPageUiKt.c((DeleteAccount) this.j, this.e, this.f, (Function1) this.k, this.g, (LazyListState) this.l, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ i(DeleteAccount deleteAccount, boolean z, Function1 function1, Function1 function12, boolean z2, LazyListState lazyListState, int i, int i2) {
        this.j = deleteAccount;
        this.e = z;
        this.f = function1;
        this.k = function12;
        this.g = z2;
        this.l = lazyListState;
        this.h = i;
        this.i = i2;
    }
}
