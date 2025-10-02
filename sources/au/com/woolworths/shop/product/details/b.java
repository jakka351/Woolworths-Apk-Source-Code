package au.com.woolworths.shop.product.details;

import android.os.Build;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.shop.product.details.ProductDetailsContract;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductDetailsActivity e;

    public /* synthetic */ b(ProductDetailsActivity productDetailsActivity, int i) {
        this.d = i;
        this.e = productDetailsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        int i = this.d;
        ProductDetailsActivity productDetailsActivity = this.e;
        switch (i) {
            case 0:
                int i2 = ProductDetailsActivity.C;
                Activities.ProductDetailsActivity.Extras extras = Build.VERSION.SDK_INT >= 33 ? (Activities.ProductDetailsActivity.Extras) productDetailsActivity.getIntent().getParcelableExtra("articleId", Activities.ProductDetailsActivity.Extras.class) : (Activities.ProductDetailsActivity.Extras) productDetailsActivity.getIntent().getParcelableExtra("articleId");
                if (extras == null || (str = extras.d) == null) {
                    throw new IllegalArgumentException("articleId must be provided");
                }
                return str;
            default:
                int i3 = ProductDetailsActivity.C;
                return Integer.valueOf(((ProductDetailsContract.ViewState) productDetailsActivity.O4().r.getValue()).f.size());
        }
    }
}
