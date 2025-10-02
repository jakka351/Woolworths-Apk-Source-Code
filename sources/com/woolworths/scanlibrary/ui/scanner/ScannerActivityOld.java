package com.woolworths.scanlibrary.ui.scanner;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.analytics.supers.barcode.BarcodeReaderAnalytics;
import au.com.woolworths.analytics.supers.barcode.BarcodeReaderAnalytics$BarcodeScanner$Action$Companion$onScanBarcode$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.foundation.barcode.reader.BarcodeScanningHandler;
import au.com.woolworths.foundation.barcode.reader.mlkit.MlKitBarcodeScannerView;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeData;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeScanningConfig;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeSymbology;
import au.com.woolworths.foundation.barcode.reader.scandit.ScanditBarcodeScannerView;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.ClickCartButtonOnScannerViewTracking;
import com.woolworths.scanlibrary.analytics.ClickScannerCloseButtonTracking;
import com.woolworths.scanlibrary.analytics.ScannedItemBarcodeFormat;
import com.woolworths.scanlibrary.analytics.ScannerBarcodeInputTracking;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity;
import com.woolworths.scanlibrary.databinding.ActivityScannerBinding;
import com.woolworths.scanlibrary.di.session.CartSessionScopedActivity;
import com.woolworths.scanlibrary.ui.cart.ShoppingCartActivity;
import com.woolworths.scanlibrary.ui.home.HomeActivity;
import com.woolworths.scanlibrary.ui.scanner.ScannerContract;
import com.woolworths.scanlibrary.ui.scanner.additem.AddItemActivity;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import com.woolworths.scanlibrary.util.menu.MenuUtil;
import com.woolworths.scanlibrary.util.permission.SngPermissionWrapper;
import com.woolworths.scanlibrary.util.widget.LoadingViewDelegate;
import com.woolworths.scanlibrary.util.widget.WeightedListView;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/ScannerActivityOld;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseActivity;", "Lcom/woolworths/scanlibrary/ui/scanner/ScannerContract$Presenter;", "Lcom/woolworths/scanlibrary/di/session/CartSessionScopedActivity;", "Lcom/woolworths/scanlibrary/ui/scanner/ScannerContract$View;", "Lau/com/woolworths/foundation/barcode/reader/BarcodeScanningHandler;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ScannerActivityOld extends DaggerBaseActivity<ScannerContract.Presenter> implements CartSessionScopedActivity, ScannerContract.View, BarcodeScanningHandler {
    public static final /* synthetic */ int U = 0;
    public PermissionFlagInteractorImpl H;
    public LoadingViewDelegate I;
    public Menu K;
    public String L;
    public boolean M;
    public boolean N;
    public boolean O;
    public ScanditSymbologyNameMapper P;
    public RelativeLayout Q;
    public ActivityScannerBinding R;
    public ScannerActivityOld$getCountDownTimer$1 T;
    public final ScannerActivityOld$backButtonHandler$1 G = new OnBackPressedCallback() { // from class: com.woolworths.scanlibrary.ui.scanner.ScannerActivityOld$backButtonHandler$1
        {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void e() {
            i(false);
            ScannerActivityOld scannerActivityOld = this.d;
            scannerActivityOld.finish();
            scannerActivityOld.runOnUiThread(new androidx.camera.camera2.interop.b(false, scannerActivityOld));
            scannerActivityOld.overridePendingTransition(0, 0);
        }
    };
    public final AtomicBoolean J = new AtomicBoolean(false);
    public final Lazy S = LazyKt.b(new c(this, 22));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\n\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/ScannerActivityOld$Companion;", "", "", "quickSaleBarCodeLength", "S", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.widget.RelativeLayout, au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface] */
    public static final void f5(ScannerActivityOld scannerActivityOld) {
        scannerActivityOld.O = true;
        Pair[] pairArr = {new Pair("eanItemWeightRequired", scannerActivityOld.getIntent().getStringExtra("eanItemWeightRequired"))};
        Intent intent = new Intent(scannerActivityOld, (Class<?>) AddItemActivity.class);
        intent.addFlags(0);
        intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, 1)));
        scannerActivityOld.startActivityForResult(intent, 7000);
        ?? r4 = scannerActivityOld.Q;
        if (r4 != 0) {
            r4.a();
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, com.woolworths.scanlibrary.base.mvp.MvpView
    public final void N3(boolean z) {
        LoadingViewDelegate loadingViewDelegate = this.I;
        if (loadingViewDelegate != null) {
            loadingViewDelegate.b();
        } else {
            Intrinsics.p("loadingView");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final OnBackPressedCallback P4() {
        return this.G;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return R.layout.activity_scanner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [au.com.woolworths.foundation.barcode.reader.mlkit.MlKitBarcodeScannerView] */
    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void V4() throws Resources.NotFoundException {
        ScanditBarcodeScannerView scanditBarcodeScannerView;
        getWindow().addFlags(128);
        if (Q4().c(BaseShopAppFeature.B)) {
            scanditBarcodeScannerView = new MlKitBarcodeScannerView(this, this, 12);
        } else {
            String str = this.L;
            if (str == null) {
                Intrinsics.p("sScanditSdkAppKey");
                throw null;
            }
            scanditBarcodeScannerView = new ScanditBarcodeScannerView(this, str, 12);
        }
        this.Q = scanditBarcodeScannerView;
        scanditBarcodeScannerView.b(new BarcodeScanningConfig(CollectionsKt.R(BarcodeSymbology.f, BarcodeSymbology.d, BarcodeSymbology.o, BarcodeSymbology.i, BarcodeSymbology.e, BarcodeSymbology.w, BarcodeSymbology.v, BarcodeSymbology.x, BarcodeSymbology.p, BarcodeSymbology.g), c5(), Q4().c(BaseShopAppFeature.A)), this);
        final int i = 0;
        if (this.Q != null) {
            LayoutInflater layoutInflater = getLayoutInflater();
            int i2 = ActivityScannerBinding.H;
            DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
            ActivityScannerBinding activityScannerBinding = (ActivityScannerBinding) ViewDataBinding.q(layoutInflater, R.layout.activity_scanner, null, false, null);
            this.R = activityScannerBinding;
            if (activityScannerBinding == null) {
                Intrinsics.p("viewBinding");
                throw null;
            }
            View view = activityScannerBinding.h;
            Intrinsics.g(view, "getRoot(...)");
            RelativeLayout relativeLayout = this.Q;
            Intrinsics.f(relativeLayout, "null cannot be cast to non-null type android.widget.RelativeLayout");
            relativeLayout.addView(view);
        }
        RelativeLayout relativeLayout2 = this.Q;
        Intrinsics.f(relativeLayout2, "null cannot be cast to non-null type android.view.View");
        setContentView(relativeLayout2);
        ActivityScannerBinding activityScannerBinding2 = this.R;
        if (activityScannerBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityScannerBinding2.y.setVisibility(0);
        ActivityScannerBinding activityScannerBinding3 = this.R;
        if (activityScannerBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityScannerBinding3.y.setRect(c5());
        ActivityScannerBinding activityScannerBinding4 = this.R;
        if (activityScannerBinding4 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        CoordinatorLayout layoutBottom = activityScannerBinding4.z;
        Intrinsics.g(layoutBottom, "layoutBottom");
        ViewExtKt.a(layoutBottom);
        this.P = new ScanditSymbologyNameMapper();
        this.I = new LoadingViewDelegate(this);
        d5().setOnClickListener(new View.OnClickListener(this) { // from class: com.woolworths.scanlibrary.ui.scanner.a
            public final /* synthetic */ ScannerActivityOld e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.RelativeLayout, au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i;
                ScannerActivityOld scannerActivityOld = this.e;
                switch (i3) {
                    case 0:
                        int i4 = ScannerActivityOld.U;
                        Callback.g(view2);
                        try {
                            scannerActivityOld.setResult(0);
                            ScannerActivityOld$getCountDownTimer$1 scannerActivityOld$getCountDownTimer$1 = scannerActivityOld.T;
                            if (scannerActivityOld$getCountDownTimer$1 != null) {
                                scannerActivityOld$getCountDownTimer$1.cancel();
                            }
                            ?? r0 = scannerActivityOld.Q;
                            if (r0 != 0) {
                                r0.a();
                            }
                            HomeActivity.Companion.a(scannerActivityOld, false, null);
                            scannerActivityOld.N4().b(new ClickScannerCloseButtonTracking("Scan Close"));
                            return;
                        } finally {
                        }
                    default:
                        int i5 = ScannerActivityOld.U;
                        Callback.g(view2);
                        try {
                            ScannerActivityOld.f5(scannerActivityOld);
                            return;
                        } finally {
                        }
                }
            }
        });
        ActivityScannerBinding activityScannerBinding5 = this.R;
        if (activityScannerBinding5 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        final int i3 = 1;
        activityScannerBinding5.A.setOnClickListener(new View.OnClickListener(this) { // from class: com.woolworths.scanlibrary.ui.scanner.a
            public final /* synthetic */ ScannerActivityOld e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.RelativeLayout, au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i32 = i3;
                ScannerActivityOld scannerActivityOld = this.e;
                switch (i32) {
                    case 0:
                        int i4 = ScannerActivityOld.U;
                        Callback.g(view2);
                        try {
                            scannerActivityOld.setResult(0);
                            ScannerActivityOld$getCountDownTimer$1 scannerActivityOld$getCountDownTimer$1 = scannerActivityOld.T;
                            if (scannerActivityOld$getCountDownTimer$1 != null) {
                                scannerActivityOld$getCountDownTimer$1.cancel();
                            }
                            ?? r0 = scannerActivityOld.Q;
                            if (r0 != 0) {
                                r0.a();
                            }
                            HomeActivity.Companion.a(scannerActivityOld, false, null);
                            scannerActivityOld.N4().b(new ClickScannerCloseButtonTracking("Scan Close"));
                            return;
                        } finally {
                        }
                    default:
                        int i5 = ScannerActivityOld.U;
                        Callback.g(view2);
                        try {
                            ScannerActivityOld.f5(scannerActivityOld);
                            return;
                        } finally {
                        }
                }
            }
        });
        ActivityScannerBinding activityScannerBinding6 = this.R;
        if (activityScannerBinding6 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        Toolbar toolbar = activityScannerBinding6.E;
        TextView textView = activityScannerBinding6.F;
        int iL = ((ScannerContract.Presenter) S4()).l();
        String string = getString(R.string.sng_label_cart_amount, ((ScannerContract.Presenter) S4()).p());
        Intrinsics.g(string, "getString(...)");
        String quantityString = getResources().getQuantityString(R.plurals.sng_label_cart_count, iL, Integer.valueOf(iL));
        Intrinsics.g(quantityString, "getQuantityString(...)");
        textView.setText(string + " | " + quantityString);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.u();
        }
        if (!((ScannerContract.Presenter) S4()).f1()) {
            e5().setVisibility(8);
            return;
        }
        List listC = ((ScannerContract.Presenter) S4()).c();
        WeightedListView weightedListViewE5 = e5();
        String string2 = getString(R.string.sng_label_pw_weight_required, Integer.valueOf(listC.size()));
        Intrinsics.g(string2, "getString(...)");
        int i4 = WeightedListView.h;
        weightedListViewE5.a(listC, string2, null);
        e5().setVisibility(0);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final boolean X4() {
        return false;
    }

    public final Rect c5() throws Resources.NotFoundException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sng_scandit_active_scanning_area_start);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.sng_scandit_active_scanning_area_top);
        return new Rect(dimensionPixelSize, dimensionPixelSize2, i - getResources().getDimensionPixelSize(R.dimen.sng_scandit_active_scanning_area_end), (i2 - dimensionPixelSize2) - getResources().getDimensionPixelSize(R.dimen.sng_scandit_active_scanning_area_bottom));
    }

    public final ProgressBar d5() {
        ActivityScannerBinding activityScannerBinding = this.R;
        if (activityScannerBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        ProgressBar scanClose = activityScannerBinding.B;
        Intrinsics.g(scanClose, "scanClose");
        return scanClose;
    }

    public final WeightedListView e5() {
        ActivityScannerBinding activityScannerBinding = this.R;
        if (activityScannerBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        WeightedListView weightedItemsList = activityScannerBinding.G;
        Intrinsics.g(weightedItemsList, "weightedItemsList");
        return weightedItemsList;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.widget.RelativeLayout, au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface] */
    @Override // au.com.woolworths.foundation.barcode.reader.BarcodeScanningHandler
    public final void h2(List barcodeData) throws IllegalStateException {
        ApiSupportBarcodeSymbology apiSupportBarcodeSymbology;
        Intrinsics.h(barcodeData, "barcodeData");
        if (barcodeData.isEmpty()) {
            return;
        }
        BarcodeData barcodeData2 = (BarcodeData) CollectionsKt.D(barcodeData);
        AnalyticsManager analyticsManagerO4 = O4();
        BarcodeReaderAnalytics.BarcodeScanner.Action.Companion companion = BarcodeReaderAnalytics.BarcodeScanner.Action.d;
        String barcode = barcodeData2.f8476a;
        String symbology = barcodeData2.b.toString();
        String str = Q4().c(BaseShopAppFeature.B) ? "ML Kit" : "Scandit";
        companion.getClass();
        Intrinsics.h(symbology, "symbology");
        Intrinsics.h(barcode, "barcode");
        analyticsManagerO4.g(new BarcodeReaderAnalytics$BarcodeScanner$Action$Companion$onScanBarcode$1(symbology, barcode, "ScanAndGo", str));
        ?? r0 = this.Q;
        if (r0 != 0) {
            r0.a();
        }
        BarcodeData barcodeData3 = (BarcodeData) barcodeData.get(0);
        String barcodeFormat = barcodeData3.b.name();
        if (barcodeData3.b == BarcodeSymbology.p && barcodeData3.c) {
            ApiSupportBarcodeSymbology apiSupportBarcodeSymbology2 = ApiSupportBarcodeSymbology.e;
            barcodeFormat = "GS1DataMatrix";
        }
        AnalyticsProvider analyticsProviderN4 = N4();
        if (this.P == null) {
            Intrinsics.p("barcodeSymbologyNameMapper");
            throw null;
        }
        Intrinsics.h(barcodeFormat, "barcodeFormat");
        ScannedItemBarcodeFormat scannedItemBarcodeFormat = new ScannedItemBarcodeFormat("ScannedItemBarcodeFormat");
        scannedItemBarcodeFormat.a("barcodeFormat", barcodeFormat);
        scannedItemBarcodeFormat.a("library", "Scandit");
        analyticsProviderN4.b(scannedItemBarcodeFormat);
        String barcode2 = barcodeData3.f8476a;
        ScanditSymbologyNameMapper scanditSymbologyNameMapper = this.P;
        if (scanditSymbologyNameMapper == null) {
            Intrinsics.p("barcodeSymbologyNameMapper");
            throw null;
        }
        if (!scanditSymbologyNameMapper.a().containsKey(barcodeFormat) || (apiSupportBarcodeSymbology = (ApiSupportBarcodeSymbology) scanditSymbologyNameMapper.a().get(barcodeFormat)) == null) {
            apiSupportBarcodeSymbology = ApiSupportBarcodeSymbology.o;
        }
        String str2 = apiSupportBarcodeSymbology.d;
        boolean z = true;
        if ((barcode2.length() > 0) && (str2.length() > 0)) {
            runOnUiThread(new androidx.camera.camera2.interop.b(z, this));
            AnalyticsProvider analyticsProviderN42 = N4();
            Intrinsics.h(barcode2, "barcode");
            ScannerBarcodeInputTracking scannerBarcodeInputTracking = new ScannerBarcodeInputTracking("Scanned Item");
            scannerBarcodeInputTracking.a("scan.barcode", barcode2);
            scannerBarcodeInputTracking.a("scan.barcode.type", str2);
            analyticsProviderN42.b(scannerBarcodeInputTracking);
            this.J.set(true);
            ScannerActivityOld$getCountDownTimer$1 scannerActivityOld$getCountDownTimer$1 = this.T;
            if (scannerActivityOld$getCountDownTimer$1 != null) {
                scannerActivityOld$getCountDownTimer$1.cancel();
            }
            if (((ScannerContract.Presenter) S4()).G0()) {
                AppCompatActivityExtKt.h(this);
            }
            if (((ScannerContract.Presenter) S4()).F0()) {
                MediaPlayer mediaPlayerCreate = MediaPlayer.create(this, R.raw.beep_timber);
                try {
                    if (mediaPlayerCreate.isPlaying()) {
                        mediaPlayerCreate.stop();
                        mediaPlayerCreate.release();
                        mediaPlayerCreate = MediaPlayer.create(this, R.raw.beep_timber);
                    }
                    mediaPlayerCreate.start();
                } catch (Exception e) {
                    Timber.f27013a.f(e);
                }
            }
            this.O = true;
            Pair[] pairArr = {new Pair("barcode", barcode2), new Pair("barcodeType", str2), new Pair("eanItemWeightRequired", getIntent().getStringExtra("eanItemWeightRequired"))};
            Intent intent = new Intent(this, (Class<?>) AddItemActivity.class);
            intent.addFlags(0);
            intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, 3)));
            startActivityForResult(intent, 7000);
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.widget.RelativeLayout, au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        runOnUiThread(new androidx.camera.camera2.interop.b(false, this));
        this.O = false;
        if (i == 7000 && i2 == -1) {
            setResult(-1);
            if (intent != null) {
                String stringExtra = intent.getStringExtra("cartItemLineNo");
                if (stringExtra == null) {
                    stringExtra = "-1";
                }
                Intent intent2 = new Intent();
                Bundle bundle = new Bundle();
                bundle.putString("cartItemLineNo", stringExtra);
                intent2.putExtras(bundle);
                setResult(-1, intent2);
                ScannerActivityOld$getCountDownTimer$1 scannerActivityOld$getCountDownTimer$1 = this.T;
                if (scannerActivityOld$getCountDownTimer$1 != null) {
                    scannerActivityOld$getCountDownTimer$1.cancel();
                }
                ?? r4 = this.Q;
                if (r4 != 0) {
                    r4.a();
                }
                HomeActivity.Companion.a(this, false, bundle);
            }
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SngPermissionWrapper sngPermissionWrapper = (SngPermissionWrapper) this.S.getD();
        sngPermissionWrapper.getClass();
        if (sngPermissionWrapper.b != null) {
            throw new IllegalStateException("Cannot register with Activity while it is already registered to a Fragment");
        }
        sngPermissionWrapper.c = this;
        sngPermissionWrapper.g = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new com.woolworths.scanlibrary.util.permission.a(sngPermissionWrapper, 0));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        MenuInflater menuInflater = getMenuInflater();
        Intrinsics.g(menuInflater, "getMenuInflater(...)");
        this.K = menu;
        menuInflater.inflate(R.menu.sng_menu_scanner_view, menu);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [android.widget.RelativeLayout, au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface] */
    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ?? r0;
        if (this.M && (r0 = this.Q) != 0) {
            r0.m();
        }
        LoadingViewDelegate loadingViewDelegate = this.I;
        if (loadingViewDelegate == null) {
            Intrinsics.p("loadingView");
            throw null;
        }
        loadingViewDelegate.a();
        ((SngPermissionWrapper) this.S.getD()).b();
        super.onDestroy();
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == R.id.menu_item_cart) {
                N4().b(new ClickCartButtonOnScannerViewTracking("Cart via Scanner"));
                Intent intent = new Intent(this, (Class<?>) ShoppingCartActivity.class);
                intent.addFlags(67108864);
                startActivityForResult(intent, 5000);
                overridePendingTransition(R.anim.anim_enter, R.anim.anim_exit);
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            return zOnOptionsItemSelected;
        } finally {
            Callback.q();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.RelativeLayout, au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface] */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        ?? r0 = this.Q;
        if (r0 != 0) {
            r0.a();
        }
        ScannerActivityOld$getCountDownTimer$1 scannerActivityOld$getCountDownTimer$1 = this.T;
        if (scannerActivityOld$getCountDownTimer$1 != null) {
            scannerActivityOld$getCountDownTimer$1.cancel();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        MenuUtil.a(this, this.K, String.valueOf(((ScannerContract.Presenter) S4()).l()));
        return super.onPrepareOptionsMenu(menu);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.widget.RelativeLayout, au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.widget.RelativeLayout, au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.os.CountDownTimer, com.woolworths.scanlibrary.ui.scanner.ScannerActivityOld$getCountDownTimer$1] */
    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        ?? r0;
        super.onResume();
        this.J.set(false);
        final long jE0 = ((ScannerContract.Presenter) S4()).E0();
        if (jE0 != -1) {
            int i = (int) jE0;
            d5().setMax(i);
            d5().setSecondaryProgress(i);
            ScannerActivityOld$getCountDownTimer$1 scannerActivityOld$getCountDownTimer$1 = this.T;
            if (scannerActivityOld$getCountDownTimer$1 != null) {
                scannerActivityOld$getCountDownTimer$1.cancel();
            }
            ?? r2 = new CountDownTimer(jE0, this) { // from class: com.woolworths.scanlibrary.ui.scanner.ScannerActivityOld$getCountDownTimer$1

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f21321a;
                public final /* synthetic */ ScannerActivityOld b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(jE0, 50L);
                    this.f21321a = jE0;
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r1v4, types: [android.widget.RelativeLayout, au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface] */
                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    int i2 = ScannerActivityOld.U;
                    ScannerActivityOld scannerActivityOld = this.b;
                    scannerActivityOld.d5().setProgress((int) this.f21321a);
                    if (scannerActivityOld.J.get()) {
                        return;
                    }
                    ScannerActivityOld$getCountDownTimer$1 scannerActivityOld$getCountDownTimer$12 = scannerActivityOld.T;
                    if (scannerActivityOld$getCountDownTimer$12 != null) {
                        scannerActivityOld$getCountDownTimer$12.cancel();
                    }
                    ?? r1 = scannerActivityOld.Q;
                    if (r1 != 0) {
                        r1.a();
                    }
                    HomeActivity.Companion.a(scannerActivityOld, false, null);
                }

                @Override // android.os.CountDownTimer
                public final void onTick(long j) {
                    int i2 = ScannerActivityOld.U;
                    this.b.d5().setProgress((int) (this.f21321a - j));
                }
            };
            this.T = r2;
            r2.start();
        }
        if (this.M) {
            ?? r02 = this.Q;
            if (r02 != 0) {
                r02.c();
            }
            if (!this.O || (r0 = this.Q) == 0) {
                return;
            }
            r0.a();
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((SngPermissionWrapper) this.S.getD()).d(new String[]{"android.permission.CAMERA"}, new ScannerActivityOld$startScannerWithPermissionCheck$1(0, this, ScannerActivityOld.class, "startScanner", "startScanner()V", 0), new ScannerActivityOld$startScannerWithPermissionCheck$2(0, this, ScannerActivityOld.class, "onCameraPermissionDenied", "onCameraPermissionDenied()V", 0));
    }
}
