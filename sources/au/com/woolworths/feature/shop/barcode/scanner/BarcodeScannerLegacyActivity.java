package au.com.woolworths.feature.shop.barcode.scanner;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.extensions.ActivityExtKt;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.base.shopapp.modules.products.detailsold.ProductDetailsParams;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerContract;
import au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerOnboardingActionData;
import au.com.woolworths.feature.shop.barcode.scanner.analyzer.BarcodeAnalyzer;
import au.com.woolworths.feature.shop.barcode.scanner.databinding.ActivityBarcodeScannerBinding;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeData;
import com.dynatrace.android.callback.Callback;
import com.google.common.util.concurrent.ListenableFuture;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerLegacyActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/feature/shop/barcode/scanner/ScannerHandler;", "Lau/com/woolworths/foundation/barcode/reader/models/BarcodeData;", "<init>", "()V", "Companion", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BarcodeScannerLegacyActivity extends Hilt_BarcodeScannerLegacyActivity implements ScannerHandler<BarcodeData> {
    public static final /* synthetic */ int E = 0;
    public ActivityBarcodeScannerBinding A;
    public AnalyticsManager x;
    public ShopAppNavigator y;
    public final ViewModelLazy z = new ViewModelLazy(Reflection.f24268a.b(BarcodeScannerViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerLegacyActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerLegacyActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerLegacyActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final CompositeDisposable B = new CompositeDisposable();
    public final Lazy C = LazyKt.b(new au.com.woolworths.feature.rewards.offers.home.ui.a(28));
    public final BarcodeAnalyzer D = new BarcodeAnalyzer();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerLegacyActivity$Companion;", "", "", "SCAN_VIBRATE_DURATION", "J", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerLegacyActivity$onResume$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<BarcodeScannerContract.Actions, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) throws NumberFormatException {
            BarcodeScannerContract.Actions p0 = (BarcodeScannerContract.Actions) obj;
            Intrinsics.h(p0, "p0");
            final BarcodeScannerLegacyActivity barcodeScannerLegacyActivity = (BarcodeScannerLegacyActivity) this.receiver;
            int i = BarcodeScannerLegacyActivity.E;
            barcodeScannerLegacyActivity.getClass();
            Lazy lazy = barcodeScannerLegacyActivity.C;
            if (p0 instanceof BarcodeScannerContract.Actions.EnableCameraAccess) {
                ActivityCompat.j(barcodeScannerLegacyActivity, Camera.f6649a, 1002);
            } else if (p0 instanceof BarcodeScannerContract.Actions.CameraAccessPermanentlyDenied) {
                final int i2 = 0;
                final int i3 = 1;
                new AlertDialog.Builder(barcodeScannerLegacyActivity).setTitle(com.woolworths.R.string.camera_access_permanently_denied_title).setMessage(com.woolworths.R.string.camera_access_permanently_denied_message).setNegativeButton(com.woolworths.R.string.not_now, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.feature.shop.barcode.scanner.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        int i5 = i2;
                        BarcodeScannerLegacyActivity barcodeScannerLegacyActivity2 = barcodeScannerLegacyActivity;
                        switch (i5) {
                            case 0:
                                int i6 = BarcodeScannerLegacyActivity.E;
                                barcodeScannerLegacyActivity2.O4().c(BarcodeScannerOnboardingActionData.j);
                                barcodeScannerLegacyActivity2.finish();
                                break;
                            default:
                                int i7 = BarcodeScannerLegacyActivity.E;
                                barcodeScannerLegacyActivity2.O4().c(BarcodeScannerOnboardingActionData.i);
                                ActivityExtKt.b(barcodeScannerLegacyActivity2);
                                break;
                        }
                    }
                }).setPositiveButton(com.woolworths.R.string.permission_settings, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.feature.shop.barcode.scanner.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        int i5 = i3;
                        BarcodeScannerLegacyActivity barcodeScannerLegacyActivity2 = barcodeScannerLegacyActivity;
                        switch (i5) {
                            case 0:
                                int i6 = BarcodeScannerLegacyActivity.E;
                                barcodeScannerLegacyActivity2.O4().c(BarcodeScannerOnboardingActionData.j);
                                barcodeScannerLegacyActivity2.finish();
                                break;
                            default:
                                int i7 = BarcodeScannerLegacyActivity.E;
                                barcodeScannerLegacyActivity2.O4().c(BarcodeScannerOnboardingActionData.i);
                                ActivityExtKt.b(barcodeScannerLegacyActivity2);
                                break;
                        }
                    }
                }).setCancelable(false).show();
            } else if (p0 instanceof BarcodeScannerContract.Actions.BarcodeDetected) {
                ProcessCameraProvider processCameraProvider = ((BarcodeScannerFragment) lazy.getD()).e;
                if (processCameraProvider == null) {
                    Intrinsics.p("cameraProvider");
                    throw null;
                }
                processCameraProvider.g();
                ContextExtKt.k(barcodeScannerLegacyActivity, 200L, null);
            } else if (p0 instanceof BarcodeScannerContract.Actions.LaunchLegacyProductDetails) {
                Activities.LegacyProductDetails.Extras extras = ((BarcodeScannerContract.Actions.LaunchLegacyProductDetails) p0).f6642a;
                Intent intentA = ActivityNavigatorKt.a(Activities.LegacyProductDetails.f4484a, ApplicationType.e);
                intentA.putExtra("EXTRA_PRODUCT_DETAILS_DATA", extras);
                barcodeScannerLegacyActivity.startActivity(intentA);
            } else if (p0 instanceof BarcodeScannerContract.Actions.LaunchProductDetails) {
                ShopAppNavigator shopAppNavigator = barcodeScannerLegacyActivity.y;
                if (shopAppNavigator == null) {
                    Intrinsics.p("shopAppNavigator");
                    throw null;
                }
                shopAppNavigator.d(new ProductDetailsParams(((BarcodeScannerContract.Actions.LaunchProductDetails) p0).f6643a.getProductId(), 12).getD());
            } else {
                if (!(p0 instanceof BarcodeScannerContract.Actions.ResumeCamera)) {
                    throw new NoWhenBranchMatchedException();
                }
                BarcodeScannerFragment barcodeScannerFragment = (BarcodeScannerFragment) lazy.getD();
                ((ListenableFuture) barcodeScannerFragment.h.getD()).addListener(new androidx.camera.camera2.interop.d(barcodeScannerFragment, 19), ContextCompat.d(barcodeScannerFragment.requireContext()));
                Observable observable = (Observable) ((BarcodeScannerFragment) lazy.getD()).i.getD();
                Intrinsics.g(observable, "<get-scannerEvents>(...)");
                barcodeScannerLegacyActivity.I1(observable);
            }
            return Unit.f24250a;
        }
    }

    @Override // au.com.woolworths.feature.shop.barcode.scanner.ScannerHandler
    public final void I1(Observable observable) {
        BarcodeScannerViewModel barcodeScannerViewModelP4 = P4();
        SchedulersProvider schedulersProvider = barcodeScannerViewModelP4.g;
        BarcodeScannerViewModel.r6(barcodeScannerViewModelP4, barcodeScannerViewModelP4.j, false, false, null, 6);
        barcodeScannerViewModelP4.e.f6646a.d("android.permission.CAMERA", false);
        LambdaObserver lambdaObserver = barcodeScannerViewModelP4.k;
        if (lambdaObserver != null) {
            DisposableHelper.a(lambdaObserver);
        }
        ObservableSubscribeOn observableSubscribeOnI = observable.f(schedulersProvider.b()).i(schedulersProvider.b());
        LambdaObserver lambdaObserver2 = new LambdaObserver(new au.com.woolworths.android.onesite.modules.deliveryaddress.search.e(new l(barcodeScannerViewModelP4, 10), 28), Functions.e);
        observableSubscribeOnI.a(lambdaObserver2);
        barcodeScannerViewModelP4.k = lambdaObserver2;
    }

    public final AnalyticsManager O4() {
        AnalyticsManager analyticsManager = this.x;
        if (analyticsManager != null) {
            return analyticsManager;
        }
        Intrinsics.p("analyticsManager");
        throw null;
    }

    public final BarcodeScannerViewModel P4() {
        return (BarcodeScannerViewModel) this.z.getD();
    }

    @Override // au.com.woolworths.feature.shop.barcode.scanner.ScannerHandler
    public final void Y() {
        BarcodeScannerViewModel barcodeScannerViewModelP4 = P4();
        BarcodeScannerViewModel.r6(barcodeScannerViewModelP4, barcodeScannerViewModelP4.j, true, false, null, 6);
    }

    @Override // au.com.woolworths.feature.shop.barcode.scanner.ScannerHandler
    /* renamed from: h3, reason: from getter */
    public final BarcodeAnalyzer getD() {
        return this.D;
    }

    @Override // au.com.woolworths.feature.shop.barcode.scanner.Hilt_BarcodeScannerLegacyActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityBarcodeScannerBinding activityBarcodeScannerBinding = (ActivityBarcodeScannerBinding) DataBindingUtil.d(this, com.woolworths.R.layout.activity_barcode_scanner);
        this.A = activityBarcodeScannerBinding;
        if (activityBarcodeScannerBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        activityBarcodeScannerBinding.D(this);
        activityBarcodeScannerBinding.L(P4());
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction fragmentTransactionE = supportFragmentManager.e();
        fragmentTransactionE.j(com.woolworths.R.id.barcode_scanner_container, (BarcodeScannerFragment) this.C.getD(), null);
        fragmentTransactionE.d();
        ActivityBarcodeScannerBinding activityBarcodeScannerBinding2 = this.A;
        if (activityBarcodeScannerBinding2 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        setSupportActionBar(activityBarcodeScannerBinding2.D);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        ActionBar supportActionBar2 = getSupportActionBar();
        Intrinsics.e(supportActionBar2);
        supportActionBar2.A(null);
        P4().j.f(this, new BarcodeScannerLegacyActivity$sam$androidx_lifecycle_Observer$0(new e(this, 1)));
        OnBackPressedDispatcherKt.a(getF(), this, new e(this, 0), 2);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                finish();
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        this.B.e();
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.h(permissions, "permissions");
        Intrinsics.h(grantResults, "grantResults");
        if (grantResults.length != 0 && grantResults[0] == 0) {
            O4().c(BarcodeScannerOnboardingActionData.f);
        } else if (ActivityCompat.m(this, "android.permission.CAMERA")) {
            O4().c(BarcodeScannerOnboardingActionData.g);
        } else {
            BarcodeScannerViewModel barcodeScannerViewModelP4 = P4();
            barcodeScannerViewModelP4.e.f6646a.d("android.permission.CAMERA", true);
            AnalyticsManager analyticsManager = barcodeScannerViewModelP4.f;
            BarcodeScannerOnboardingActionData barcodeScannerOnboardingActionData = BarcodeScannerOnboardingActionData.h;
            analyticsManager.c(barcodeScannerOnboardingActionData);
            O4().c(barcodeScannerOnboardingActionData);
            finish();
        }
        super.onRequestPermissionsResult(i, permissions, grantResults);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        O4().a(Screens.f);
        PublishSubject publishSubject = P4().i;
        androidx.camera.lifecycle.b bVar = new androidx.camera.lifecycle.b(2, new AnonymousClass1(1, this, BarcodeScannerLegacyActivity.class, "handleActions", "handleActions(Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions;)V", 0));
        publishSubject.getClass();
        LambdaObserver lambdaObserver = new LambdaObserver(bVar, Functions.e);
        publishSubject.a(lambdaObserver);
        DisposableKt.a(this.B, lambdaObserver);
    }
}
