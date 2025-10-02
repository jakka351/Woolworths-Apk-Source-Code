package au.com.woolworths.android.onesite.modules.deliveryaddress.search;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import au.com.woolworths.android.onesite.legacy.databinding.ActivityAddFullDeliveryAddressBySearchBinding;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchContract;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchViewModel;
import au.com.woolworths.android.onesite.utils.Logout;
import au.com.woolworths.base.shopapp.utils.Views;
import au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyActivity;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ DeliveryAddressSearchActivity e;

    public /* synthetic */ a(DeliveryAddressSearchActivity deliveryAddressSearchActivity, int i) {
        this.d = i;
        this.e = deliveryAddressSearchActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        DeliveryAddressSearchActivity deliveryAddressSearchActivity = this.e;
        switch (i) {
            case 0:
                DeliveryAddressSearchContract.Actions actions = (DeliveryAddressSearchContract.Actions) obj;
                int i2 = DeliveryAddressSearchActivity.J;
                Intrinsics.e(actions);
                if (actions.equals(DeliveryAddressSearchContract.Actions.LaunchAddDeliveryAddressManually.f4329a)) {
                    DeliveryAddressSearchContract.ViewState viewState = (DeliveryAddressSearchContract.ViewState) deliveryAddressSearchActivity.R4().r.e();
                    DeliveryAddressSearchViewModel.ScreenOptions screenOptions = viewState != null ? viewState.d : null;
                    ActivityResultLauncher activityResultLauncher = deliveryAddressSearchActivity.H;
                    Intent intentPutExtra = new Intent(deliveryAddressSearchActivity, (Class<?>) AddDeliveryAddressManuallyActivity.class).putExtra("ADD_DELIVERY_ADDRESS_MANUALLY_EXTRAS", new AddDeliveryAddressManuallyActivity.Extras(screenOptions != null ? screenOptions.f4333a : false, screenOptions != null ? screenOptions.b : false));
                    Intrinsics.g(intentPutExtra, "putExtra(...)");
                    activityResultLauncher.a(intentPutExtra, null);
                } else if (actions.equals(DeliveryAddressSearchContract.Actions.ForceLogoutEvent.f4327a)) {
                    ShopAccountInteractor shopAccountInteractor = deliveryAddressSearchActivity.B;
                    if (shopAccountInteractor == null) {
                        Intrinsics.p("accountInteractor");
                        throw null;
                    }
                    Logout.a(deliveryAddressSearchActivity, shopAccountInteractor);
                } else if (actions.equals(DeliveryAddressSearchContract.Actions.AddressSetSuccessfully.f4326a)) {
                    Intent intent = new Intent();
                    intent.putExtra("RESULT_MESSAGE_EXTRA", deliveryAddressSearchActivity.getString(R.string.delivery_address_details_updated_message));
                    deliveryAddressSearchActivity.setResult(-1, intent);
                    Views.a(deliveryAddressSearchActivity);
                    deliveryAddressSearchActivity.finish();
                } else if (actions.equals(DeliveryAddressSearchContract.Actions.HideKeyboard.f4328a)) {
                    Views.a(deliveryAddressSearchActivity);
                } else if (actions instanceof DeliveryAddressSearchContract.Actions.ShowErrorMessage) {
                    String str = ((DeliveryAddressSearchContract.Actions.ShowErrorMessage) actions).f4330a;
                    ActivityAddFullDeliveryAddressBySearchBinding activityAddFullDeliveryAddressBySearchBinding = deliveryAddressSearchActivity.E;
                    if (activityAddFullDeliveryAddressBySearchBinding == null) {
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                    Snackbar.j(null, activityAddFullDeliveryAddressBySearchBinding.h, str, 0).l();
                } else {
                    if (!(actions instanceof DeliveryAddressSearchContract.Actions.ShowErrorMessageWithResId)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i3 = ((DeliveryAddressSearchContract.Actions.ShowErrorMessageWithResId) actions).f4331a;
                    ActivityAddFullDeliveryAddressBySearchBinding activityAddFullDeliveryAddressBySearchBinding2 = deliveryAddressSearchActivity.E;
                    if (activityAddFullDeliveryAddressBySearchBinding2 == null) {
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                    Snackbar.i(activityAddFullDeliveryAddressBySearchBinding2.h, i3, 0).l();
                }
                return unit;
            default:
                String query = (String) obj;
                Intrinsics.h(query, "query");
                int i4 = DeliveryAddressSearchActivity.J;
                deliveryAddressSearchActivity.R4().q6(query);
                return unit;
        }
    }
}
