package au.com.woolworths.feature.shop.barcode.scanner;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.core.view.KeyEventDispatcher;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.shop.barcode.scanner.databinding.FragmentCameraViewBinding;
import io.reactivex.Observable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.ObservableDoOnLifecycle;
import io.reactivex.internal.operators.observable.ObservableTake;
import io.reactivex.subjects.PublishSubject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/BarcodeScannerFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BarcodeScannerFragment extends Fragment {
    public FragmentCameraViewBinding d;
    public ProcessCameraProvider e;
    public ScannerHandler f;
    public ImageAnalysis g;
    public final Lazy h;
    public final Lazy i;

    public BarcodeScannerFragment() {
        final int i = 0;
        this.h = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.shop.barcode.scanner.c
            public final /* synthetic */ BarcodeScannerFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BarcodeScannerFragment barcodeScannerFragment = this.e;
                switch (i2) {
                    case 0:
                        ProcessCameraProvider processCameraProvider = ProcessCameraProvider.h;
                        Context contextRequireContext = barcodeScannerFragment.requireContext();
                        Intrinsics.g(contextRequireContext, "requireContext(...)");
                        return ProcessCameraProvider.Companion.a(contextRequireContext);
                    default:
                        ScannerHandler scannerHandler = barcodeScannerFragment.f;
                        if (scannerHandler == null) {
                            Intrinsics.p("handler");
                            throw null;
                        }
                        PublishSubject publishSubject = scannerHandler.getD().d;
                        publishSubject.getClass();
                        return new ObservableDoOnLifecycle(new ObservableDoOnLifecycle(new ObservableTake(publishSubject), new au.com.woolworths.android.onesite.modules.deliveryaddress.search.e(new l(barcodeScannerFragment, 9), 27), Functions.c), Functions.d, new au.com.woolworths.feature.shop.account.viewmodel.delete.a(barcodeScannerFragment, 1));
                }
            }
        });
        final int i2 = 1;
        this.i = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.shop.barcode.scanner.c
            public final /* synthetic */ BarcodeScannerFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BarcodeScannerFragment barcodeScannerFragment = this.e;
                switch (i22) {
                    case 0:
                        ProcessCameraProvider processCameraProvider = ProcessCameraProvider.h;
                        Context contextRequireContext = barcodeScannerFragment.requireContext();
                        Intrinsics.g(contextRequireContext, "requireContext(...)");
                        return ProcessCameraProvider.Companion.a(contextRequireContext);
                    default:
                        ScannerHandler scannerHandler = barcodeScannerFragment.f;
                        if (scannerHandler == null) {
                            Intrinsics.p("handler");
                            throw null;
                        }
                        PublishSubject publishSubject = scannerHandler.getD().d;
                        publishSubject.getClass();
                        return new ObservableDoOnLifecycle(new ObservableDoOnLifecycle(new ObservableTake(publishSubject), new au.com.woolworths.android.onesite.modules.deliveryaddress.search.e(new l(barcodeScannerFragment, 9), 27), Functions.c), Functions.d, new au.com.woolworths.feature.shop.account.viewmodel.delete.a(barcodeScannerFragment, 1));
                }
            }
        });
    }

    public final void E1() {
        boolean zE;
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        if (CameraKt.a(contextRequireContext)) {
            ImageAnalysis imageAnalysis = this.g;
            if (imageAnalysis != null) {
                ProcessCameraProvider processCameraProvider = this.e;
                if (processCameraProvider == null) {
                    Intrinsics.p("cameraProvider");
                    throw null;
                }
                zE = processCameraProvider.e(imageAnalysis);
            } else {
                zE = false;
            }
            if (!zE) {
                ScannerHandler scannerHandler = this.f;
                if (scannerHandler == null) {
                    Intrinsics.p("handler");
                    throw null;
                }
                Observable observable = (Observable) this.i.getD();
                Intrinsics.g(observable, "<get-scannerEvents>(...)");
                scannerHandler.I1(observable);
                return;
            }
        }
        Context contextRequireContext2 = requireContext();
        Intrinsics.g(contextRequireContext2, "requireContext(...)");
        if (CameraKt.a(contextRequireContext2)) {
            return;
        }
        ScannerHandler scannerHandler2 = this.f;
        if (scannerHandler2 != null) {
            scannerHandler2.Y();
        } else {
            Intrinsics.p("handler");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.h(context, "context");
        super.onAttach(context);
        KeyEventDispatcher.Component activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type au.com.woolworths.feature.shop.barcode.scanner.ScannerHandler<au.com.woolworths.foundation.barcode.reader.models.BarcodeData>");
        this.f = (ScannerHandler) activity;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentCameraViewBinding.z;
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentCameraViewBinding fragmentCameraViewBinding = (FragmentCameraViewBinding) ViewDataBinding.q(inflater, com.woolworths.R.layout.fragment_camera_view, viewGroup, false, null);
        this.d = fragmentCameraViewBinding;
        if (fragmentCameraViewBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        fragmentCameraViewBinding.D(getViewLifecycleOwner());
        FragmentCameraViewBinding fragmentCameraViewBinding2 = this.d;
        if (fragmentCameraViewBinding2 != null) {
            return fragmentCameraViewBinding2.h;
        }
        Intrinsics.p("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.h(permissions, "permissions");
        Intrinsics.h(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, permissions, grantResults);
        if (i == 1002) {
            E1();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        E1();
    }
}
