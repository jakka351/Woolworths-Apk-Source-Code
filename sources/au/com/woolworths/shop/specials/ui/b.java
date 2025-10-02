package au.com.woolworths.shop.specials.ui;

import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductClickListener e;
    public final /* synthetic */ String f;
    public final /* synthetic */ ProductCard g;

    public /* synthetic */ b(ProductClickListener productClickListener, String str, ProductCard productCard, int i) {
        this.d = i;
        this.e = productClickListener;
        this.f = str;
        this.g = productCard;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                String str = this.f;
                if (str == null) {
                    str = "";
                }
                this.e.J1(this.g, str);
                break;
            case 1:
                String str2 = this.f;
                if (str2 == null) {
                    str2 = "";
                }
                this.e.g6(this.g, str2);
                break;
            default:
                String str3 = this.f;
                if (str3 == null) {
                    str3 = "";
                }
                this.e.Q2(str3, ProductCardExtKt.g(this.g));
                break;
        }
        return Unit.f24250a;
    }
}
