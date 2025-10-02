package com.woolworths.scanlibrary.ui.tap.tapon;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.databinding.BaseObservable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import au.com.woolworths.base.shopapp.utils.TextViewExtKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.tasks.Task;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment;
import com.woolworths.scanlibrary.databinding.FragmentTapOnBinding;
import com.woolworths.scanlibrary.models.receipt.Voucher;
import com.woolworths.scanlibrary.ui.home.HomeActivity;
import com.woolworths.scanlibrary.ui.message.MessageActivity;
import com.woolworths.scanlibrary.ui.message.Messages;
import com.woolworths.scanlibrary.ui.metrowifi.UseMetroWifiActivity;
import com.woolworths.scanlibrary.ui.parking.ParkingVoucherActivity;
import com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentActivity;
import com.woolworths.scanlibrary.ui.setupcomplete.SetupCompleteActivity;
import com.woolworths.scanlibrary.ui.stores.AvailableStoreListActivity;
import com.woolworths.scanlibrary.ui.tap.analytics.TapOnActionData;
import com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract;
import com.woolworths.scanlibrary.util.beacon.BeaconScanner;
import com.woolworths.scanlibrary.util.beacon.BeaconScannerError;
import com.woolworths.scanlibrary.util.beacon.bluecats.BlueCatsBeaconScanner;
import com.woolworths.scanlibrary.util.extensions.ContextExtKt;
import com.woolworths.scanlibrary.util.permission.SngPermissionWrapper;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnFragment;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseFragment;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$View;", "<init>", "()V", "ViewModel", "TapOnFragmentInteraction", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TapOnFragment extends DaggerBaseFragment<TapOnContract.Presenter> implements TapOnContract.View {
    public String l;
    public BlueCatsBeaconScanner m;
    public PermissionFlagInteractorImpl n;
    public FragmentTapOnBinding o;
    public ViewModel p;
    public boolean q;
    public View r;
    public Menu t;
    public TapOnFragmentInteraction u;
    public int s = -1;
    public final TapOnFragment$bluetoothBroadcastReceiver$1 v = new BroadcastReceiver() { // from class: com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment$bluetoothBroadcastReceiver$1
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE)) : null;
            if ((numValueOf != null && numValueOf.intValue() == 10) || (numValueOf != null && numValueOf.intValue() == 13)) {
                int i = MessageActivity.J;
                MessageActivity.Companion.a(this.f21355a, Messages.k);
            }
        }
    };
    public final Lazy w = LazyKt.b(new a(this, 0));
    public final AtomicBoolean x = new AtomicBoolean(false);
    public final String[] y = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    public final String[] z = {"android.permission.BLUETOOTH_CONNECT"};
    public final String[] A = {"android.permission.BLUETOOTH_SCAN"};

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnFragment$Companion;", "", "", "VIEW_UPDATE_DELAY_IN_MILLISECONDS", "J", "", "FRAGMENT_TAG_TAP_ON", "Ljava/lang/String;", "", "SDK_ANDROID_S", "I", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnFragment$TapOnFragmentInteraction;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface TapOnFragmentInteraction {
        void X2();

        void k(String str);

        void k4();

        void o1();

        void w1();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnFragment$ViewModel;", "Landroidx/databinding/BaseObservable;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ViewModel extends BaseObservable {
        public final FeatureToggleManager e;
        public final ObservableBoolean f = new ObservableBoolean(false);
        public final ObservableField g;
        public final ObservableField h;

        public ViewModel(TapOnFragment tapOnFragment, FeatureToggleManager featureToggleManager) {
            this.e = featureToggleManager;
            this.g = new ObservableField(tapOnFragment.getString(R.string.sng_label_scan_go_available_store_msg));
            this.h = new ObservableField(((TapOnContract.Presenter) tapOnFragment.Q1()).m0());
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, com.woolworths.scanlibrary.base.mvp.MvpView
    public final void N3(boolean z) {
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.View
    public final void d3() throws Throwable {
        ViewModel viewModel = this.p;
        if (viewModel == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel.f.i(false);
        TapOnFragmentInteraction tapOnFragmentInteraction = this.u;
        if (tapOnFragmentInteraction != null) {
            tapOnFragmentInteraction.w1();
        }
    }

    public final void h2() {
        ((SngPermissionWrapper) this.w.getD()).d(this.y, new TapOnFragment$bindTapOnListenerWithPermissionCheck$1(0, this, TapOnFragment.class, "startScanWithBluetoothCheck", "startScanWithBluetoothCheck()V", 0), new TapOnFragment$bindTapOnListenerWithPermissionCheck$2(0, this, TapOnFragment.class, "onLocationPermissionDenied", "onLocationPermissionDenied()V", 0));
    }

    public final BeaconScanner i2() {
        BlueCatsBeaconScanner blueCatsBeaconScanner = this.m;
        if (blueCatsBeaconScanner != null) {
            return blueCatsBeaconScanner;
        }
        Intrinsics.p("nativeBlueCatsBeaconScanner");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.View
    public final void m0(String tapOnDeviceId) {
        Intrinsics.h(tapOnDeviceId, "tapOnDeviceId");
        this.x.set(false);
        this.s = -1;
        int i = AddPaymentActivity.M;
        Pair[] pairArr = {new Pair("deviceIdentifier", tapOnDeviceId)};
        Intent intent = new Intent(requireContext(), (Class<?>) AddPaymentActivity.class);
        intent.addFlags(0);
        intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, 1)));
        startActivityForResult(intent, 4001);
    }

    public final void m2() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i = AvailableStoreListActivity.I;
            Intent intent = new Intent(activity, (Class<?>) AvailableStoreListActivity.class);
            intent.addFlags(0);
            activity.startActivity(intent);
            AnalyticsManager analyticsManager = this.h;
            if (analyticsManager != null) {
                analyticsManager.c(TapOnActionData.h);
            } else {
                Intrinsics.p("analyticsManager");
                throw null;
            }
        }
    }

    public final void n2() {
        TapOnContract.Presenter presenter = (TapOnContract.Presenter) Q1();
        if (presenter.g0()) {
            TapOnFragmentInteraction tapOnFragmentInteraction = this.u;
            if (tapOnFragmentInteraction == null) {
                return;
            }
            tapOnFragmentInteraction.k(presenter.g1());
            throw null;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (presenter.S0()) {
                Context contextRequireContext = requireContext();
                Intrinsics.g(contextRequireContext, "requireContext(...)");
                if (!ContextExtKt.b(contextRequireContext)) {
                    int i = UseMetroWifiActivity.v;
                    Intent intent = new Intent(activity, (Class<?>) UseMetroWifiActivity.class);
                    intent.addFlags(0);
                    activity.startActivity(intent);
                    return;
                }
            }
            int i2 = HomeActivity.W;
            HomeActivity.Companion.a(activity, (6 & 2) != 0, null);
        }
    }

    public final void o2() {
        FragmentTapOnBinding fragmentTapOnBinding = this.o;
        if (fragmentTapOnBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        TextView txtProgressUpdate = fragmentTapOnBinding.E;
        Intrinsics.g(txtProgressUpdate, "txtProgressUpdate");
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        String string = getString(R.string.sng_tapon_connect_error_message);
        Intrinsics.g(string, "getString(...)");
        String string2 = getString(R.string.sng_label_woolworth_stores);
        Intrinsics.g(string2, "getString(...)");
        TextViewExtKt.a(txtProgressUpdate, contextRequireContext, string, string2, R.color.sng_color_errors, R.color.sng_color_errors, new a(this, 5));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        final int i3 = 0;
        final int i4 = 1;
        if (i == 1) {
            if (i2 == -1) {
                Timber.f27013a.h("User agreed to make required location settings changes.", new Object[0]);
                return;
            } else {
                if (i2 != 0) {
                    return;
                }
                Timber.f27013a.h("User chose not to make required location settings changes.", new Object[0]);
                int i5 = MessageActivity.J;
                MessageActivity.Companion.a(this, Messages.j);
                return;
            }
        }
        if (i == 2) {
            if (i2 == -1) {
                Timber.f27013a.h("Location Service is turned On.", new Object[0]);
                h2();
                return;
            } else {
                if (i2 != 0) {
                    return;
                }
                Timber.f27013a.h("Location Service is NOT On", new Object[0]);
                int i6 = MessageActivity.J;
                MessageActivity.Companion.a(this, Messages.i);
                return;
            }
        }
        if (i == 4001) {
            if (i2 == -1) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) { // from class: com.woolworths.scanlibrary.ui.tap.tapon.b
                    public final /* synthetic */ TapOnFragment e;

                    {
                        this.e = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                this.e.h2();
                                break;
                            default:
                                this.e.h2();
                                break;
                        }
                    }
                }, 200L);
            }
        } else {
            if (i != 8000) {
                return;
            }
            if (i2 == -1) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) { // from class: com.woolworths.scanlibrary.ui.tap.tapon.b
                    public final /* synthetic */ TapOnFragment e;

                    {
                        this.e = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                this.e.h2();
                                break;
                            default:
                                this.e.h2();
                                break;
                        }
                    }
                }, 200L);
            } else {
                if (i2 != 0) {
                    return;
                }
                Timber.f27013a.h("User chose not to make required bluetooth settings changes.", new Object[0]);
                int i7 = MessageActivity.J;
                MessageActivity.Companion.a(this, Messages.k);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.h(context, "context");
        super.onAttach(context);
        if (context instanceof TapOnFragmentInteraction) {
            this.u = (TapOnFragmentInteraction) context;
            return;
        }
        throw new RuntimeException(context + " must implement TapOnFragmentInteraction");
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        ((SngPermissionWrapper) this.w.getD()).c(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.h(menu, "menu");
        Intrinsics.h(inflater, "inflater");
        inflater.inflate(R.menu.sng_menu_tapon, menu);
        super.onCreateOptionsMenu(menu, inflater);
        this.t = menu;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        FragmentTapOnBinding fragmentTapOnBinding = (FragmentTapOnBinding) DataBindingUtil.c(inflater, R.layout.fragment_tap_on, viewGroup, false, null);
        this.o = fragmentTapOnBinding;
        if (fragmentTapOnBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        View view = fragmentTapOnBinding.h;
        Intrinsics.h(view, "<set-?>");
        this.r = view;
        FeatureToggleManager featureToggleManager = this.f;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        ViewModel viewModel = new ViewModel(this, featureToggleManager);
        this.p = viewModel;
        FragmentTapOnBinding fragmentTapOnBinding2 = this.o;
        if (fragmentTapOnBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        fragmentTapOnBinding2.L(viewModel);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.s = arguments.getInt("store_no");
        }
        FragmentTapOnBinding fragmentTapOnBinding3 = this.o;
        if (fragmentTapOnBinding3 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        fragmentTapOnBinding3.y.setOnClickListener(new c(this, 0));
        View view2 = this.r;
        if (view2 != null) {
            return view2;
        }
        Intrinsics.p("rootView");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((SngPermissionWrapper) this.w.getD()).b();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.u = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.h(item, "item");
        if (item.getItemId() != R.id.menu_item_parking) {
            return super.onOptionsItemSelected(item);
        }
        Voucher voucherQ0 = ((TapOnContract.Presenter) Q1()).Q0();
        if (voucherQ0 == null) {
            return true;
        }
        int i = ParkingVoucherActivity.H;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
        ParkingVoucherActivity.Companion.a(fragmentActivityRequireActivity, voucherQ0);
        return true;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.unregisterReceiver(this.v);
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.registerReceiver(this.v, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), "android.permission.BLUETOOTH_ADMIN", null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() throws Throwable {
        super.onStart();
        d3();
        ((TapOnContract.Presenter) Q1()).e0().f(getViewLifecycleOwner(), new TapOnFragment$sam$androidx_lifecycle_Observer$0(new i(this, 21)));
        if (this.s == -1) {
            if (((TapOnContract.Presenter) Q1()).H0()) {
                return;
            }
            int i = SetupCompleteActivity.F;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
            SetupCompleteActivity.Companion.a(fragmentActivityRequireActivity);
            return;
        }
        ((TapOnContract.Presenter) Q1()).A(this.s);
        this.q = true;
        ViewModel viewModel = this.p;
        if (viewModel == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel.f.i(true);
        TapOnFragmentInteraction tapOnFragmentInteraction = this.u;
        if (tapOnFragmentInteraction != null) {
            tapOnFragmentInteraction.o1();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ((TapOnContract.Presenter) Q1()).e0().l(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        FragmentTapOnBinding fragmentTapOnBinding = this.o;
        if (fragmentTapOnBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        TextView txtProgressUpdate = fragmentTapOnBinding.E;
        Intrinsics.g(txtProgressUpdate, "txtProgressUpdate");
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        String string = getString(R.string.sng_label_scan_go_available_store_msg);
        Intrinsics.g(string, "getString(...)");
        String string2 = getString(R.string.sng_label_woolworth_stores);
        Intrinsics.g(string2, "getString(...)");
        TextViewExtKt.a(txtProgressUpdate, contextRequireContext, string, string2, R.color.sng_color_primary, R.color.sng_color_primary, new a(this, 3));
        FragmentTapOnBinding fragmentTapOnBinding2 = this.o;
        if (fragmentTapOnBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        fragmentTapOnBinding2.D.setAutoSizeTextTypeUniformWithConfiguration(24, 28, 2, 2);
        FragmentTapOnBinding fragmentTapOnBinding3 = this.o;
        if (fragmentTapOnBinding3 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        fragmentTapOnBinding3.E.setAutoSizeTextTypeUniformWithConfiguration(14, 16, 2, 2);
        FragmentTapOnBinding fragmentTapOnBinding4 = this.o;
        if (fragmentTapOnBinding4 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        ViewCompat.A(fragmentTapOnBinding4.E, new AccessibilityDelegateCompat() { // from class: com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment.onViewCreated.2
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void h(View host, int i) {
                Intrinsics.h(host, "host");
                super.h(host, i);
                host.setClickable(true);
                TapOnFragment tapOnFragment = TapOnFragment.this;
                Context contextRequireContext2 = tapOnFragment.requireContext();
                Intrinsics.g(contextRequireContext2, "requireContext(...)");
                if (au.com.woolworths.android.onesite.extensions.ContextExtKt.d(contextRequireContext2) && i == 1) {
                    tapOnFragment.m2();
                }
            }
        });
        BeaconScanner beaconScannerI2 = i2();
        TapOnFragment$initialiseNativeBeaconScanner$1 tapOnFragment$initialiseNativeBeaconScanner$1 = new TapOnFragment$initialiseNativeBeaconScanner$1(this);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BlueCatsBeaconScanner blueCatsBeaconScanner = (BlueCatsBeaconScanner) beaconScannerI2;
        try {
            blueCatsBeaconScanner.d = tapOnFragment$initialiseNativeBeaconScanner$1;
            blueCatsBeaconScanner.b();
            blueCatsBeaconScanner.f = new WeakReference(viewLifecycleOwner);
            viewLifecycleOwner.getD().a(blueCatsBeaconScanner.h);
        } catch (Throwable unused) {
            blueCatsBeaconScanner.a();
            TapOnFragment$initialiseNativeBeaconScanner$1 tapOnFragment$initialiseNativeBeaconScanner$12 = blueCatsBeaconScanner.d;
            if (tapOnFragment$initialiseNativeBeaconScanner$12 != null) {
                tapOnFragment$initialiseNativeBeaconScanner$12.b(new BeaconScannerError.ScannerFailure());
            }
        }
    }

    public final void p2() throws Throwable {
        LocationSettingsRequest.Builder builderAddLocationRequest = new LocationSettingsRequest.Builder().addLocationRequest(new LocationRequest());
        Intrinsics.g(builderAddLocationRequest, "addLocationRequest(...)");
        Task<LocationSettingsResponse> taskCheckLocationSettings = LocationServices.getSettingsClient((Activity) requireActivity()).checkLocationSettings(builderAddLocationRequest.build());
        Intrinsics.g(taskCheckLocationSettings, "checkLocationSettings(...)");
        taskCheckLocationSettings.addOnCompleteListener(new com.woolworths.scanlibrary.ui.tap.a(this, 2));
        this.q = true;
        ViewModel viewModel = this.p;
        String str = null;
        if (viewModel == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel.f.i(true);
        TapOnFragmentInteraction tapOnFragmentInteraction = this.u;
        if (tapOnFragmentInteraction != null) {
            tapOnFragmentInteraction.o1();
        }
        ((TapOnContract.Presenter) Q1()).V0();
        String str2 = this.l;
        if (str2 == null) {
            Intrinsics.p("mockBeaconId");
            throw null;
        }
        if (StringsKt.D(str2)) {
            ((TapOnContract.Presenter) Q1()).K();
        }
        BeaconScanner beaconScannerI2 = i2();
        String str3 = this.l;
        if (str3 == null) {
            Intrinsics.p("mockBeaconId");
            throw null;
        }
        if (!StringsKt.D(str3)) {
            String str4 = this.l;
            if (str4 == null) {
                Intrinsics.p("mockBeaconId");
                throw null;
            }
            str = str4;
        }
        ((BlueCatsBeaconScanner) beaconScannerI2).c(str);
    }

    public final void q2() {
        FragmentTapOnBinding fragmentTapOnBinding = this.o;
        if (fragmentTapOnBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        TextView txtProgressUpdate = fragmentTapOnBinding.E;
        Intrinsics.g(txtProgressUpdate, "txtProgressUpdate");
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        String string = getString(R.string.sng_label_scan_go_available_store_msg);
        Intrinsics.g(string, "getString(...)");
        String string2 = getString(R.string.sng_label_woolworth_stores);
        Intrinsics.g(string2, "getString(...)");
        TextViewExtKt.a(txtProgressUpdate, contextRequireContext, string, string2, R.color.sng_color_primary, R.color.sng_color_primary, new a(this, 4));
    }
}
