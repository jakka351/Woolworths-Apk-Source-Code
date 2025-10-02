package au.com.woolworths.feature.shop.barcode.scanner;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.extensions.ActivityExtKt;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.modules.products.detailsold.ProductDetailsParams;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerContract;
import au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerOnboardingActionData;
import au.com.woolworths.feature.shop.barcode.scanner.databinding.ActivityBarcodeScannerBinding;
import au.com.woolworths.foundation.barcode.reader.BarcodeScanningHandler;
import au.com.woolworths.foundation.barcode.reader.mlkit.MlKitBarcodeScannerView;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeData;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeScanningConfig;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeSymbology;
import com.dynatrace.android.callback.Callback;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/foundation/barcode/reader/BarcodeScanningHandler;", "<init>", "()V", "Companion", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BarcodeScannerActivity extends Hilt_BarcodeScannerActivity implements BarcodeScanningHandler {
    public static final /* synthetic */ int G = 0;
    public FeatureToggleManager A;
    public ActivityBarcodeScannerBinding C;
    public MlKitBarcodeScannerView E;
    public MediaPlayer F;
    public AnalyticsManager x;
    public AppConfig y;
    public ShopAppNavigator z;
    public final ViewModelLazy B = new ViewModelLazy(Reflection.f24268a.b(BarcodeScannerViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final CompositeDisposable D = new CompositeDisposable();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerActivity$Companion;", "", "", "SCAN_VIBRATE_DURATION", "J", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerActivity$onResume$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<BarcodeScannerContract.Actions, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) throws IllegalStateException, NumberFormatException {
            BarcodeScannerContract.Actions p0 = (BarcodeScannerContract.Actions) obj;
            Intrinsics.h(p0, "p0");
            final BarcodeScannerActivity barcodeScannerActivity = (BarcodeScannerActivity) this.receiver;
            int i = BarcodeScannerActivity.G;
            barcodeScannerActivity.getClass();
            if (p0 instanceof BarcodeScannerContract.Actions.EnableCameraAccess) {
                ActivityCompat.j(barcodeScannerActivity, Camera.f6649a, 1002);
            } else if (p0 instanceof BarcodeScannerContract.Actions.CameraAccessPermanentlyDenied) {
                final int i2 = 0;
                final int i3 = 1;
                new AlertDialog.Builder(barcodeScannerActivity).setTitle(com.woolworths.R.string.camera_access_permanently_denied_title).setMessage(com.woolworths.R.string.camera_access_permanently_denied_message).setNegativeButton(com.woolworths.R.string.not_now, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.feature.shop.barcode.scanner.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        int i5 = i2;
                        BarcodeScannerActivity barcodeScannerActivity2 = barcodeScannerActivity;
                        switch (i5) {
                            case 0:
                                int i6 = BarcodeScannerActivity.G;
                                barcodeScannerActivity2.O4().c(BarcodeScannerOnboardingActionData.j);
                                barcodeScannerActivity2.finish();
                                break;
                            default:
                                int i7 = BarcodeScannerActivity.G;
                                barcodeScannerActivity2.O4().c(BarcodeScannerOnboardingActionData.i);
                                ActivityExtKt.b(barcodeScannerActivity2);
                                break;
                        }
                    }
                }).setPositiveButton(com.woolworths.R.string.permission_settings, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.feature.shop.barcode.scanner.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        int i5 = i3;
                        BarcodeScannerActivity barcodeScannerActivity2 = barcodeScannerActivity;
                        switch (i5) {
                            case 0:
                                int i6 = BarcodeScannerActivity.G;
                                barcodeScannerActivity2.O4().c(BarcodeScannerOnboardingActionData.j);
                                barcodeScannerActivity2.finish();
                                break;
                            default:
                                int i7 = BarcodeScannerActivity.G;
                                barcodeScannerActivity2.O4().c(BarcodeScannerOnboardingActionData.i);
                                ActivityExtKt.b(barcodeScannerActivity2);
                                break;
                        }
                    }
                }).setCancelable(false).show();
            } else if (p0 instanceof BarcodeScannerContract.Actions.BarcodeDetected) {
                MlKitBarcodeScannerView mlKitBarcodeScannerView = barcodeScannerActivity.E;
                if (mlKitBarcodeScannerView != null) {
                    mlKitBarcodeScannerView.a();
                }
                ContextExtKt.k(barcodeScannerActivity, 200L, null);
                MediaPlayer mediaPlayerCreate = MediaPlayer.create(barcodeScannerActivity, com.woolworths.R.raw.beep_timber);
                barcodeScannerActivity.F = mediaPlayerCreate;
                if (mediaPlayerCreate != null) {
                    try {
                        if (mediaPlayerCreate.isPlaying()) {
                            mediaPlayerCreate.stop();
                            mediaPlayerCreate.release();
                            barcodeScannerActivity.F = MediaPlayer.create(barcodeScannerActivity, com.woolworths.R.raw.beep_timber);
                        }
                        MediaPlayer mediaPlayer = barcodeScannerActivity.F;
                        if (mediaPlayer != null) {
                            mediaPlayer.start();
                        }
                    } catch (Exception e) {
                        Timber.f27013a.f(e);
                    }
                }
            } else if (p0 instanceof BarcodeScannerContract.Actions.LaunchLegacyProductDetails) {
                Activities.LegacyProductDetails.Extras extras = ((BarcodeScannerContract.Actions.LaunchLegacyProductDetails) p0).f6642a;
                Intent intentA = ActivityNavigatorKt.a(Activities.LegacyProductDetails.f4484a, ApplicationType.e);
                intentA.putExtra("EXTRA_PRODUCT_DETAILS_DATA", extras);
                barcodeScannerActivity.startActivity(intentA);
            } else if (p0 instanceof BarcodeScannerContract.Actions.LaunchProductDetails) {
                ShopAppNavigator shopAppNavigator = barcodeScannerActivity.z;
                if (shopAppNavigator == null) {
                    Intrinsics.p("shopAppNavigator");
                    throw null;
                }
                shopAppNavigator.d(new ProductDetailsParams(((BarcodeScannerContract.Actions.LaunchProductDetails) p0).f6643a.getProductId(), 12).getD());
            } else {
                if (!(p0 instanceof BarcodeScannerContract.Actions.ResumeCamera)) {
                    throw new NoWhenBranchMatchedException();
                }
                MlKitBarcodeScannerView mlKitBarcodeScannerView2 = barcodeScannerActivity.E;
                if (mlKitBarcodeScannerView2 != null) {
                    mlKitBarcodeScannerView2.c();
                }
            }
            return Unit.f24250a;
        }
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
        return (BarcodeScannerViewModel) this.B.getD();
    }

    @Override // au.com.woolworths.foundation.barcode.reader.BarcodeScanningHandler
    public final void h2(List barcodeData) {
        Intrinsics.h(barcodeData, "barcodeData");
        if (barcodeData.isEmpty()) {
            return;
        }
        P4().p6((BarcodeData) CollectionsKt.D(barcodeData));
    }

    @Override // au.com.woolworths.feature.shop.barcode.scanner.Hilt_BarcodeScannerActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = ActivityBarcodeScannerBinding.F;
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        this.C = (ActivityBarcodeScannerBinding) ViewDataBinding.q(layoutInflater, com.woolworths.R.layout.activity_barcode_scanner, null, false, null);
        MlKitBarcodeScannerView mlKitBarcodeScannerView = new MlKitBarcodeScannerView(this, this, 12);
        this.E = mlKitBarcodeScannerView;
        List listR = CollectionsKt.R(BarcodeSymbology.f, BarcodeSymbology.d, BarcodeSymbology.o, BarcodeSymbology.i, BarcodeSymbology.e, BarcodeSymbology.w, BarcodeSymbology.v, BarcodeSymbology.x, BarcodeSymbology.p, BarcodeSymbology.g);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.woolworths.R.dimen.scandit_active_scanning_area_start);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.woolworths.R.dimen.scandit_active_scanning_area_top);
        Rect rect = new Rect(dimensionPixelSize, dimensionPixelSize2, i2 - getResources().getDimensionPixelSize(com.woolworths.R.dimen.scandit_active_scanning_area_end), (i3 - dimensionPixelSize2) - getResources().getDimensionPixelSize(com.woolworths.R.dimen.scandit_active_scanning_area_bottom));
        FeatureToggleManager featureToggleManager = this.A;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        mlKitBarcodeScannerView.b(new BarcodeScanningConfig(listR, rect, featureToggleManager.c(BaseShopAppFeature.A)), this);
        if (this.E != null) {
            ActivityBarcodeScannerBinding activityBarcodeScannerBinding = this.C;
            if (activityBarcodeScannerBinding == null) {
                Intrinsics.p("activityBinding");
                throw null;
            }
            View view = activityBarcodeScannerBinding.h;
            Intrinsics.g(view, "getRoot(...)");
            view.setLayoutParams(new ConstraintLayout.LayoutParams(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels));
            MlKitBarcodeScannerView mlKitBarcodeScannerView2 = this.E;
            Intrinsics.f(mlKitBarcodeScannerView2, "null cannot be cast to non-null type android.widget.RelativeLayout");
            mlKitBarcodeScannerView2.addView(view);
        }
        MlKitBarcodeScannerView mlKitBarcodeScannerView3 = this.E;
        Intrinsics.f(mlKitBarcodeScannerView3, "null cannot be cast to non-null type android.view.View");
        setContentView(mlKitBarcodeScannerView3);
        ActivityBarcodeScannerBinding activityBarcodeScannerBinding2 = this.C;
        if (activityBarcodeScannerBinding2 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        activityBarcodeScannerBinding2.D(this);
        activityBarcodeScannerBinding2.L(P4());
        ActivityBarcodeScannerBinding activityBarcodeScannerBinding3 = this.C;
        if (activityBarcodeScannerBinding3 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        setSupportActionBar(activityBarcodeScannerBinding3.D);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        ActionBar supportActionBar2 = getSupportActionBar();
        Intrinsics.e(supportActionBar2);
        supportActionBar2.A(null);
        P4().j.f(this, new BarcodeScannerActivity$sam$androidx_lifecycle_Observer$0(new b(this, 1)));
        OnBackPressedDispatcherKt.a(getF(), this, new b(this, 0), 2);
    }

    @Override // au.com.woolworths.feature.shop.barcode.scanner.Hilt_BarcodeScannerActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        MlKitBarcodeScannerView mlKitBarcodeScannerView = this.E;
        if (mlKitBarcodeScannerView != null) {
            mlKitBarcodeScannerView.m();
        }
        super.onDestroy();
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
        this.D.e();
        super.onPause();
        MlKitBarcodeScannerView mlKitBarcodeScannerView = this.E;
        if (mlKitBarcodeScannerView != null) {
            mlKitBarcodeScannerView.a();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.h(permissions, "permissions");
        Intrinsics.h(grantResults, "grantResults");
        if (grantResults.length != 0 && grantResults[0] == 0) {
            O4().c(BarcodeScannerOnboardingActionData.f);
            BarcodeScannerViewModel barcodeScannerViewModelP4 = P4();
            BarcodeScannerViewModel.r6(barcodeScannerViewModelP4, barcodeScannerViewModelP4.j, false, false, null, 6);
            MlKitBarcodeScannerView mlKitBarcodeScannerView = this.E;
            if (mlKitBarcodeScannerView != null) {
                mlKitBarcodeScannerView.c();
            }
        } else if (ActivityCompat.m(this, "android.permission.CAMERA")) {
            O4().c(BarcodeScannerOnboardingActionData.g);
        } else {
            BarcodeScannerViewModel barcodeScannerViewModelP42 = P4();
            barcodeScannerViewModelP42.e.f6646a.d("android.permission.CAMERA", true);
            AnalyticsManager analyticsManager = barcodeScannerViewModelP42.f;
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
        androidx.camera.lifecycle.b bVar = new androidx.camera.lifecycle.b(1, new AnonymousClass1(1, this, BarcodeScannerActivity.class, "handleActions", "handleActions(Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerContract$Actions;)V", 0));
        publishSubject.getClass();
        LambdaObserver lambdaObserver = new LambdaObserver(bVar, Functions.e);
        publishSubject.a(lambdaObserver);
        DisposableKt.a(this.D, lambdaObserver);
        if (!CameraKt.a(this)) {
            BarcodeScannerViewModel barcodeScannerViewModelP4 = P4();
            BarcodeScannerViewModel.r6(barcodeScannerViewModelP4, barcodeScannerViewModelP4.j, true, false, null, 6);
        } else {
            MlKitBarcodeScannerView mlKitBarcodeScannerView = this.E;
            if (mlKitBarcodeScannerView != null) {
                mlKitBarcodeScannerView.c();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        MediaPlayer mediaPlayer = this.F;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.F = null;
        super.onStop();
    }
}
