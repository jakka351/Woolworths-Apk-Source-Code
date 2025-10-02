package com.woolworths.scanlibrary.ui.home.homeview;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.api.ResolvableApiException;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.ClickHomeScreenCartButtonTracking;
import com.woolworths.scanlibrary.analytics.ClickHomeScreenScanButtonTracking;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment;
import com.woolworths.scanlibrary.databinding.FragmentHomeBinding;
import com.woolworths.scanlibrary.ui.home.homeview.HomeContract;
import com.woolworths.scanlibrary.ui.home.itemview.ItemViewFragment;
import com.woolworths.scanlibrary.ui.message.MessageActivity;
import com.woolworths.scanlibrary.ui.message.Messages;
import com.woolworths.scanlibrary.util.location.StoreLocationListener;
import com.woolworths.scanlibrary.util.menu.MenuUtil;
import com.woolworths.scanlibrary.util.permission.SngPermissionWrapper;
import com.woolworths.scanlibrary.util.widget.LoadingViewDelegate;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/homeview/HomeFragment;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseFragment;", "Lcom/woolworths/scanlibrary/ui/home/homeview/HomeContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/home/homeview/HomeContract$View;", "<init>", "()V", "StoreNearByLocationListener", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HomeFragment extends DaggerBaseFragment<HomeContract.Presenter> implements HomeContract.View {
    public ItemViewFragment.ProductViewInteractionListener m;
    public FragmentHomeBinding n;
    public Menu o;
    public PermissionFlagInteractorImpl p;
    public boolean r;
    public final StoreNearByLocationListener l = new StoreNearByLocationListener();
    public final Lazy q = LazyKt.b(new c(this, 13));

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/homeview/HomeFragment$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/homeview/HomeFragment$StoreNearByLocationListener;", "Lcom/woolworths/scanlibrary/util/location/StoreLocationListener;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class StoreNearByLocationListener implements StoreLocationListener {
        public StoreNearByLocationListener() {
        }

        @Override // com.woolworths.scanlibrary.util.location.StoreLocationListener
        public final void a(Exception exception) {
            Intrinsics.h(exception, "exception");
            HomeFragment homeFragment = HomeFragment.this;
            if (homeFragment.r) {
                return;
            }
            Timber.f27013a.h("Location settings are not satisfied. ", new Object[0]);
            try {
                homeFragment.startIntentSenderForResult(((ResolvableApiException) exception).getResolution().getIntentSender(), 1, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e) {
                Timber.f27013a.n("PendingIntent unable to execute request.", e, new Object[0]);
            }
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            Intrinsics.h(location, "location");
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String provider) {
            Intrinsics.h(provider, "provider");
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String provider) {
            Intrinsics.h(provider, "provider");
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String provider, int i, Bundle extras) {
            Intrinsics.h(provider, "provider");
            Intrinsics.h(extras, "extras");
        }
    }

    @Override // com.woolworths.scanlibrary.ui.home.homeview.HomeContract.View
    public final void B1(String name) {
        Intrinsics.h(name, "name");
        if (StringsKt.k0(name).toString().length() > 0) {
            FragmentHomeBinding fragmentHomeBinding = this.n;
            Intrinsics.e(fragmentHomeBinding);
            AppCompatTextView appCompatTextView = fragmentHomeBinding.A;
            String string = getString(R.string.sng_label_welcome_customer_to);
            Intrinsics.g(string, "getString(...)");
            appCompatTextView.setText(String.format(string, Arrays.copyOf(new Object[]{name}, 1)));
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, com.woolworths.scanlibrary.base.mvp.MvpView
    public final void N3(boolean z) {
        LoadingViewDelegate loadingViewDelegate = this.k;
        if (loadingViewDelegate != null) {
            loadingViewDelegate.b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                Timber.f27013a.h("User agreed to make required location settings changes.", new Object[0]);
            } else {
                if (i2 != 0) {
                    return;
                }
                Timber.f27013a.h("User chose not to make required location settings changes.", new Object[0]);
                int i3 = MessageActivity.J;
                MessageActivity.Companion.a(this, Messages.j);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.h(context, "context");
        super.onAttach(context);
        if (context instanceof ItemViewFragment.ProductViewInteractionListener) {
            this.m = (ItemViewFragment.ProductViewInteractionListener) context;
            return;
        }
        throw new RuntimeException(context + " must implement ProductViewInteractionListener");
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        ((SngPermissionWrapper) this.q.getD()).c(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.h(menu, "menu");
        Intrinsics.h(inflater, "inflater");
        inflater.inflate(R.menu.sng_menu_shopping_cart_view, menu);
        this.o = menu;
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentHomeBinding.D;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        final int i2 = 0;
        this.n = (FragmentHomeBinding) ViewDataBinding.q(inflater, R.layout.fragment_home, viewGroup, false, null);
        if (((HomeContract.Presenter) Q1()).P0()) {
            ((SngPermissionWrapper) this.q.getD()).d(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new HomeFragment$getUserLocationWithPermissionCheck$1(0, this, HomeFragment.class, "bindLocationListener", "bindLocationListener()V", 0), new HomeFragment$getUserLocationWithPermissionCheck$2(0, this, HomeFragment.class, "onLocationPermissionDenied", "onLocationPermissionDenied()V", 0));
        }
        FragmentHomeBinding fragmentHomeBinding = this.n;
        Intrinsics.e(fragmentHomeBinding);
        fragmentHomeBinding.z.setOnClickListener(new View.OnClickListener(this) { // from class: com.woolworths.scanlibrary.ui.home.homeview.a
            public final /* synthetic */ HomeFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        HomeFragment homeFragment = this.e;
                        Callback.g(view);
                        try {
                            ItemViewFragment.ProductViewInteractionListener productViewInteractionListener = homeFragment.m;
                            if (productViewInteractionListener != null) {
                                productViewInteractionListener.m2();
                            }
                            homeFragment.I1().b(new ClickHomeScreenScanButtonTracking("Clicked Scan Button from Homescreen"));
                            return;
                        } finally {
                        }
                    default:
                        HomeFragment homeFragment2 = this.e;
                        Callback.g(view);
                        try {
                            ItemViewFragment.ProductViewInteractionListener productViewInteractionListener2 = homeFragment2.m;
                            if (productViewInteractionListener2 != null) {
                                productViewInteractionListener2.A1();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        FragmentHomeBinding fragmentHomeBinding2 = this.n;
        Intrinsics.e(fragmentHomeBinding2);
        final int i3 = 1;
        fragmentHomeBinding2.y.setOnClickListener(new View.OnClickListener(this) { // from class: com.woolworths.scanlibrary.ui.home.homeview.a
            public final /* synthetic */ HomeFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        HomeFragment homeFragment = this.e;
                        Callback.g(view);
                        try {
                            ItemViewFragment.ProductViewInteractionListener productViewInteractionListener = homeFragment.m;
                            if (productViewInteractionListener != null) {
                                productViewInteractionListener.m2();
                            }
                            homeFragment.I1().b(new ClickHomeScreenScanButtonTracking("Clicked Scan Button from Homescreen"));
                            return;
                        } finally {
                        }
                    default:
                        HomeFragment homeFragment2 = this.e;
                        Callback.g(view);
                        try {
                            ItemViewFragment.ProductViewInteractionListener productViewInteractionListener2 = homeFragment2.m;
                            if (productViewInteractionListener2 != null) {
                                productViewInteractionListener2.A1();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        FragmentHomeBinding fragmentHomeBinding3 = this.n;
        Intrinsics.e(fragmentHomeBinding3);
        CoordinatorLayout root = fragmentHomeBinding3.B;
        Intrinsics.g(root, "root");
        return root;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((SngPermissionWrapper) this.q.getD()).b();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.n = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.h(item, "item");
        if (item.getItemId() != R.id.menu_item_cart) {
            return super.onOptionsItemSelected(item);
        }
        ItemViewFragment.ProductViewInteractionListener productViewInteractionListener = this.m;
        if (productViewInteractionListener != null) {
            productViewInteractionListener.C3();
        }
        I1().b(new ClickHomeScreenCartButtonTracking("Clicked Cart Button from Homescreen"));
        return true;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.r = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        Menu menu2 = this.o;
        if (menu2 != null) {
            MenuUtil.a(contextRequireContext, menu2, "0");
        } else {
            Intrinsics.p("mainMenu");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.r = false;
    }

    @Override // com.woolworths.scanlibrary.ui.home.homeview.HomeContract.View
    public final void r2(String name) {
        Intrinsics.h(name, "name");
        if (StringsKt.D(name)) {
            FragmentHomeBinding fragmentHomeBinding = this.n;
            Intrinsics.e(fragmentHomeBinding);
            fragmentHomeBinding.C.setText(getString(R.string.sng_default_store_name));
        } else {
            FragmentHomeBinding fragmentHomeBinding2 = this.n;
            Intrinsics.e(fragmentHomeBinding2);
            TextView textView = fragmentHomeBinding2.C;
            String string = getString(R.string.sng_store_name);
            Intrinsics.g(string, "getString(...)");
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.B(new Object[]{name}, 1, string, textView);
        }
    }
}
