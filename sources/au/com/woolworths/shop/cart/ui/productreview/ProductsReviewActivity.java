package au.com.woolworths.shop.cart.ui.productreview;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavHostController;
import androidx.navigation.NavInflater;
import androidx.navigation.fragment.NavHostFragment;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductsReviewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class ProductsReviewActivity extends Hilt_ProductsReviewActivity {
    @Override // au.com.woolworths.shop.cart.ui.productreview.Hilt_ProductsReviewActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_products_review);
        Fragment fragmentF = getSupportFragmentManager().F(R.id.nav_host_fragment);
        Intrinsics.f(fragmentF, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavHostController navHostControllerE1 = ((NavHostFragment) fragmentF).E1();
        navHostControllerE1.b.q(((NavInflater) navHostControllerE1.h.getD()).b(R.navigation.product_review_navigation), getIntent().getExtras());
    }
}
