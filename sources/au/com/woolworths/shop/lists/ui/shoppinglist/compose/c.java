package au.com.woolworths.shop.lists.ui.shoppinglist.compose;

import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ ProductItemUiModel f;

    public /* synthetic */ c(Function1 function1, ProductItemUiModel productItemUiModel, int i) {
        this.d = i;
        this.e = function1;
        this.f = productItemUiModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke(this.f);
                break;
            case 1:
                this.e.invoke(this.f);
                break;
            case 2:
                this.e.invoke(this.f);
                break;
            default:
                this.e.invoke(this.f);
                break;
        }
        return Unit.f24250a;
    }
}
