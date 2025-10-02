package au.com.woolworths.shop.deliveryunlimited.signup.confirmation;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.product.details.d;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.ActivityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmation/ConfirmationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ConfirmationActivity extends Hilt_ConfirmationActivity {
    public static final /* synthetic */ int A = 0;
    public ActivityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding y;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(ConfirmationViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final ConfirmationEpoxyController z = new ConfirmationEpoxyController();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmation/ConfirmationActivity$Companion;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // au.com.woolworths.shop.deliveryunlimited.signup.confirmation.Hilt_ConfirmationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding activityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding = (ActivityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding) DataBindingUtil.d(this, R.layout.activity_delivery_unlimited_sign_up_subscription_confirmation);
        this.y = activityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding;
        if (activityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        EpoxyRecyclerView epoxyRecyclerView = activityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding.y;
        activityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding.D(this);
        ViewModelLazy viewModelLazy = this.x;
        activityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding.L((ConfirmationViewModel) viewModelLazy.getD());
        epoxyRecyclerView.setController(this.z);
        epoxyRecyclerView.i(new ConfirmationItemDecorator(this));
        FrameLayout footer = activityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding.z;
        Intrinsics.g(footer, "footer");
        ViewExtKt.a(footer);
        ActivityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding activityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding2 = this.y;
        if (activityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        setSupportActionBar(activityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding2.C);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        ((ConfirmationViewModel) viewModelLazy.getD()).g.f(this, new ConfirmationActivity$sam$androidx_lifecycle_Observer$0(new d(this, 23)));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ConfirmationActivity$observeActions$1(this, null), 3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean zOnOptionsItemSelected;
        Callback.p(menuItem);
        try {
            Intrinsics.h(menuItem, "menuItem");
            if (menuItem.getItemId() == 16908332) {
                Activities.MainActivity.f4487a.d(this, Activities.MainActivity.Tab.d);
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            }
            return zOnOptionsItemSelected;
        } finally {
            Callback.q();
        }
    }
}
