package au.com.woolworths.feature.shop.barcode.scanner;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.supers.barcode.BarcodeReaderAnalytics;
import au.com.woolworths.analytics.supers.barcode.BarcodeReaderAnalytics$BarcodeScanner$Action$Companion$onScanBarcode$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerContract;
import au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerScreenActionData;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeData;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeSymbology;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerViewModel;", "Landroidx/lifecycle/ViewModel;", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BarcodeScannerViewModel extends ViewModel {
    public final BarcodeScannerInteractor e;
    public final AnalyticsManager f;
    public final SchedulersProvider g;
    public final FeatureToggleManager h;
    public final PublishSubject i;
    public final MutableLiveData j;
    public LambdaObserver k;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[BarcodeScannerContract.ErrorState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BarcodeScannerContract.ErrorState errorState = BarcodeScannerContract.ErrorState.f;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BarcodeScannerContract.ErrorState errorState2 = BarcodeScannerContract.ErrorState.f;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                BarcodeScannerContract.ErrorState errorState3 = BarcodeScannerContract.ErrorState.f;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public BarcodeScannerViewModel(BarcodeScannerInteractor barcodeScannerInteractor, AnalyticsManager analyticsManager, SchedulersProvider schedulersProvider, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = barcodeScannerInteractor;
        this.f = analyticsManager;
        this.g = schedulersProvider;
        this.h = featureToggleManager;
        this.i = new PublishSubject();
        this.j = new MutableLiveData();
    }

    public static void r6(BarcodeScannerViewModel barcodeScannerViewModel, MutableLiveData mutableLiveData, boolean z, boolean z2, BarcodeScannerContract.ErrorState errorState, int i) {
        if ((i & 1) != 0) {
            BarcodeScannerContract.ViewState viewState = (BarcodeScannerContract.ViewState) mutableLiveData.e();
            z = viewState != null ? viewState.f6645a : false;
        }
        if ((i & 2) != 0) {
            BarcodeScannerContract.ViewState viewState2 = (BarcodeScannerContract.ViewState) mutableLiveData.e();
            z2 = viewState2 != null ? viewState2.b : false;
        }
        if ((i & 4) != 0) {
            BarcodeScannerContract.ViewState viewState3 = (BarcodeScannerContract.ViewState) mutableLiveData.e();
            errorState = viewState3 != null ? viewState3.c : null;
        }
        barcodeScannerViewModel.getClass();
        mutableLiveData.m(new BarcodeScannerContract.ViewState(z, z2, errorState));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        LambdaObserver lambdaObserver = this.k;
        if (lambdaObserver != null) {
            DisposableHelper.a(lambdaObserver);
        }
    }

    public final void p6(BarcodeData barcode) {
        Intrinsics.h(barcode, "barcode");
        this.i.onNext(BarcodeScannerContract.Actions.BarcodeDetected.f6639a);
        BarcodeReaderAnalytics.BarcodeScanner.Action.Companion companion = BarcodeReaderAnalytics.BarcodeScanner.Action.d;
        String barcode2 = barcode.f8476a;
        BarcodeSymbology barcodeSymbology = barcode.b;
        String symbology = barcodeSymbology.toString();
        companion.getClass();
        Intrinsics.h(symbology, "symbology");
        Intrinsics.h(barcode2, "barcode");
        this.f.g(new BarcodeReaderAnalytics$BarcodeScanner$Action$Companion$onScanBarcode$1(symbology, barcode2, "ProductSearch", "ML Kit"));
        if (!this.h.c(BaseShopAppFeature.G)) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new BarcodeScannerViewModel$onBarcodeDetectedLegacy$1(this, barcode, null), 3);
        } else if (barcodeSymbology != BarcodeSymbology.K) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new BarcodeScannerViewModel$onBarcodeDetectedPdpUplift$1(this, barcode, null), 3);
        } else {
            r6(this, this.j, false, false, BarcodeScannerContract.ErrorState.h, 1);
        }
    }

    public final void q6(BarcodeScannerContract.ErrorState errorState) {
        BarcodeScannerScreenActionData barcodeScannerScreenActionData;
        Intrinsics.h(errorState, "errorState");
        r6(this, this.j, false, false, null, 1);
        int iOrdinal = errorState.ordinal();
        if (iOrdinal == 0) {
            barcodeScannerScreenActionData = BarcodeScannerScreenActionData.f;
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            barcodeScannerScreenActionData = BarcodeScannerScreenActionData.k;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            barcodeScannerScreenActionData = BarcodeScannerScreenActionData.h;
        }
        this.f.c(barcodeScannerScreenActionData);
        this.i.onNext(BarcodeScannerContract.Actions.ResumeCamera.f6644a);
    }
}
