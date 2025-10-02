package au.com.woolworths.shop.cart.ui;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/cart/ui/CartActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class CartActivity extends Hilt_CartActivity {
    public CollectionModeInteractor x;
    public FeatureToggleManager y;

    @Override // au.com.woolworths.shop.cart.ui.Hilt_CartActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FeatureToggleManager featureToggleManager = this.y;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        if (featureToggleManager.c(BaseShopAppFeature.t)) {
            CollectionModeInteractor collectionModeInteractor = this.x;
            if (collectionModeInteractor == null) {
                Intrinsics.p("collectionModeInteractor");
                throw null;
            }
            if (collectionModeInteractor.b()) {
                startActivity(ActivityNavigatorKt.a(Activities.InstoreCart.f4481a, ApplicationType.e));
                finish();
                return;
            }
        }
        setContentView(R.layout.activity_cart);
    }
}
