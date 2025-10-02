package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.IntentCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PaymentActivity extends Hilt_PaymentActivity {
    public static final /* synthetic */ int z = 0;
    public final Lazy x = LazyKt.b(new Function0<Activities.DeliveryUnlimitedPaymentActivity.Extras>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentActivity$special$$inlined$extraOrThrow$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Parcelable parcelable = (Parcelable) IntentCompat.a(this.d.getIntent(), "deliveryUnlimitedPaymentExtra", Activities.DeliveryUnlimitedPaymentActivity.Extras.class);
            if (parcelable != null) {
                return parcelable;
            }
            throw new IllegalArgumentException("Value for deliveryUnlimitedPaymentExtra must be provided and not null.");
        }
    });
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(PaymentViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentActivity$special$$inlined$assistedViewModels$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentActivity$special$$inlined$assistedViewModels$2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentActivity$special$$inlined$assistedViewModels$3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras defaultViewModelCreationExtras = this.d.getDefaultViewModelCreationExtras();
            final PaymentActivity paymentActivity = this;
            return HiltViewModelExtensions.a(defaultViewModelCreationExtras, new Function1<PaymentViewModel.Factory, ViewModel>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentActivity$special$$inlined$assistedViewModels$3.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ((PaymentViewModel.Factory) obj).a(((Activities.DeliveryUnlimitedPaymentActivity.Extras) paymentActivity.x.getD()).d);
                }
            });
        }
    });

    @Override // au.com.woolworths.shop.deliveryunlimited.signup.payment.Hilt_PaymentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final PaymentActivity paymentActivity = PaymentActivity.this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(739853316, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                int i = PaymentActivity.z;
                                PaymentScreenKt.a((PaymentViewModel) paymentActivity.y.getD(), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -836931928));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        PaymentViewModel.q6((PaymentViewModel) this.y.getD(), 7);
    }
}
