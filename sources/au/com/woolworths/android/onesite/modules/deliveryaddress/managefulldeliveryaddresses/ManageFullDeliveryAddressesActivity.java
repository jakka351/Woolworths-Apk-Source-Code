package au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ScrollView;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.compose.h;
import androidx.recyclerview.widget.LinearLayoutManager;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.legacy.databinding.ActivityManageFullDeliveryAddressesBinding;
import au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchActivity;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.utils.Logout;
import au.com.woolworths.android.onesite.utils.Strings;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/managefulldeliveryaddresses/ManageFullDeliveryAddressesActivity;", "Lau/com/woolworths/android/onesite/modules/BaseShopAppActivity;", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/managefulldeliveryaddresses/ManageFullDeliveryAddressesContract$View;", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/managefulldeliveryaddresses/ManageFullDeliveryAddressEventHandler;", "<init>", "()V", "Companion", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class ManageFullDeliveryAddressesActivity extends Hilt_ManageFullDeliveryAddressesActivity implements ManageFullDeliveryAddressesContract.View, ManageFullDeliveryAddressEventHandler {
    public static final /* synthetic */ int H = 0;
    public ManageFullDeliveryAddressesContract.Presenter B;
    public ShopAccountInteractor C;
    public ActivityManageFullDeliveryAddressesBinding D;
    public PreviouslyUsedAddressesRecyclerViewAdapter E;
    public boolean F;
    public boolean G;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/managefulldeliveryaddresses/ManageFullDeliveryAddressesActivity$Companion;", "", "", "ADD_NEW_ADDRESS_BY_SEARCH_REQUEST_CODE", "I", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ManageFullDeliveryAddressesActivity() {
        this.u = true;
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.View
    public final void J3() {
        String string = getString(R.string.delete_delivery_address_succeeded);
        Intrinsics.g(string, "getString(...)");
        W2(string);
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.View
    public final void K1() {
        S4().z.setVisibility(0);
        S4().z.setText(R.string.no_currently_selected_address_message);
        S4().z.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    @Override // au.com.woolworths.android.onesite.modules.BaseShopAppActivity
    /* renamed from: P4 */
    public final int getI() {
        return R.layout.activity_manage_full_delivery_addresses;
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.View
    public final String R0() {
        String string = getString(R.string.delete_delivery_address_failed);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    public final void R4(int i, String str) {
        if (Strings.b(str)) {
            setResult(i);
        } else {
            Intent intent = new Intent();
            intent.putExtra("RESULT_MESSAGE_EXTRA", str);
            setResult(i, intent);
        }
        finish();
    }

    public final ActivityManageFullDeliveryAddressesBinding S4() {
        ActivityManageFullDeliveryAddressesBinding activityManageFullDeliveryAddressesBinding = this.D;
        if (activityManageFullDeliveryAddressesBinding != null) {
            return activityManageFullDeliveryAddressesBinding;
        }
        Intrinsics.p("binding");
        throw null;
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.View
    public final String V0() {
        String string = getString(R.string.error_no_network);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.View
    public final void W2(String message) {
        Intrinsics.h(message, "message");
        if (Strings.b(message)) {
            return;
        }
        Snackbar.j(null, S4().A, message, 0).l();
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.View
    public final String e0() {
        String string = getString(R.string.delivery_address_details_updated_message);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.View
    public final void e3(boolean z, boolean z2) {
        DeliveryAddressSearchActivity.Companion.a(this, 1357, z, false, z2);
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.View
    public final void f3(int i) {
        PreviouslyUsedAddressesRecyclerViewAdapter previouslyUsedAddressesRecyclerViewAdapter = this.E;
        if (previouslyUsedAddressesRecyclerViewAdapter != null) {
            previouslyUsedAddressesRecyclerViewAdapter.m(i);
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.View
    public final void k2() {
        S4().A.setVisibility(0);
        if (S4().B.getAdapter() == null) {
            if (this.E == null) {
                ManageFullDeliveryAddressesContract.Presenter presenter = this.B;
                if (presenter == null) {
                    Intrinsics.p("manageFullDeliveryAddressesPresenter");
                    throw null;
                }
                this.E = new PreviouslyUsedAddressesRecyclerViewAdapter(this, presenter);
            }
            S4().B.setLayoutManager(new LinearLayoutManager(this));
            S4().B.setAdapter(this.E);
        } else {
            PreviouslyUsedAddressesRecyclerViewAdapter previouslyUsedAddressesRecyclerViewAdapter = this.E;
            if (previouslyUsedAddressesRecyclerViewAdapter != null) {
                previouslyUsedAddressesRecyclerViewAdapter.l();
            }
        }
        S4().B.setVisibility(0);
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressEventHandler
    public final void m3() {
        e3(this.F, this.G);
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.View
    public final void o4(String currentAddress) {
        Intrinsics.h(currentAddress, "currentAddress");
        S4().z.setVisibility(0);
        S4().z.setText(currentAddress);
        S4().z.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231724, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1357 && i2 == -1) {
            ManageFullDeliveryAddressesContract.Presenter presenter = this.B;
            if (presenter == null) {
                Intrinsics.p("manageFullDeliveryAddressesPresenter");
                throw null;
            }
            presenter.d();
            if (intent != null) {
                setResult(-1, intent);
            } else {
                setResult(-1);
            }
            finish();
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.Hilt_ManageFullDeliveryAddressesActivity, au.com.woolworths.android.onesite.modules.BaseShopAppActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getIntent() != null ? getIntent().getExtras() : null;
        }
        Activities.ManageFullDeliveryAddressesActivity.Extras extras = bundle != null ? (Activities.ManageFullDeliveryAddressesActivity.Extras) bundle.getParcelable("EXTRA_DATA") : null;
        if (extras != null) {
            this.F = extras.d;
            this.G = extras.e;
            int i = extras.f;
            if (i != 0) {
                String string = getString(i);
                Intrinsics.g(string, "getString(...)");
                W2(string);
            }
        }
        ActivityManageFullDeliveryAddressesBinding activityManageFullDeliveryAddressesBinding = (ActivityManageFullDeliveryAddressesBinding) DataBindingUtil.d(this, R.layout.activity_manage_full_delivery_addresses);
        Intrinsics.h(activityManageFullDeliveryAddressesBinding, "<set-?>");
        this.D = activityManageFullDeliveryAddressesBinding;
        FloatingActionButton addAddress = S4().y;
        Intrinsics.g(addAddress, "addAddress");
        byte b = 0;
        ViewExtKt.b(addAddress, new h(3, b));
        ScrollView scollView = S4().C;
        Intrinsics.g(scollView, "scollView");
        ViewExtKt.b(scollView, new h(4, b));
        S4().L(this);
        setSupportActionBar(S4().D);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t();
            supportActionBar.A(getString(this.F ? R.string.manage_full_billing_addresses_title : R.string.manage_full_delivery_addresses_title));
        }
        getOnBackPressedDispatcher().a(this, new OnBackPressedCallback() { // from class: au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesActivity.onCreate.4
            @Override // androidx.activity.OnBackPressedCallback
            public final void e() {
                int i2 = ManageFullDeliveryAddressesActivity.H;
                ManageFullDeliveryAddressesActivity.this.R4(0, "");
            }
        });
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                R4(0, "");
                Callback.q();
                return true;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.BaseShopAppActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        ManageFullDeliveryAddressesContract.Presenter presenter = this.B;
        if (presenter == null) {
            Intrinsics.p("manageFullDeliveryAddressesPresenter");
            throw null;
        }
        presenter.a();
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ManageFullDeliveryAddressesContract.Presenter presenter = this.B;
        if (presenter != null) {
            presenter.c(this, this.F, this.G);
        } else {
            Intrinsics.p("manageFullDeliveryAddressesPresenter");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.h(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("EXTRA_DATA", new Activities.ManageFullDeliveryAddressesActivity.Extras(0, this.F, this.G));
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.View
    public final void p1() {
        S4().A.setVisibility(8);
        S4().B.setVisibility(8);
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.View
    public final void r0() {
        ShopAccountInteractor shopAccountInteractor = this.C;
        if (shopAccountInteractor != null) {
            Logout.a(this, shopAccountInteractor);
        } else {
            Intrinsics.p("shopAccountInteractor");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.View
    public final void s2() {
        String string = getString(R.string.fetch_saved_delivery_address_failed);
        Intrinsics.g(string, "getString(...)");
        W2(string);
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.View
    public final String y2() {
        String string = getString(R.string.save_delivery_address_failed);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.View
    public final void z3(String message) {
        Intrinsics.h(message, "message");
        R4(-1, message);
    }
}
