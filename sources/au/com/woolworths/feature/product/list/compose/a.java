package au.com.woolworths.feature.product.list.compose;

import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ ProductCard f;

    public /* synthetic */ a(Function2 function2, ProductCard productCard, int i) {
        this.d = i;
        this.e = function2;
        this.f = productCard;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke("", ProductCardExtKt.g(this.f));
                break;
            default:
                this.e.invoke("", ProductCardExtKt.g(this.f));
                break;
        }
        return Unit.f24250a;
    }
}
