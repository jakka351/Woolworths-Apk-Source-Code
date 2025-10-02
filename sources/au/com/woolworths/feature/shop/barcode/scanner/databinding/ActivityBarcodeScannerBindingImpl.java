package au.com.woolworths.feature.shop.barcode.scanner.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerContract;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerViewModel;
import au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerOnboardingActionData;
import au.com.woolworths.feature.shop.barcode.scanner.generated.callback.OnClickListener;
import com.woolworths.R;
import io.reactivex.subjects.PublishSubject;

/* loaded from: classes3.dex */
public class ActivityBarcodeScannerBindingImpl extends ActivityBarcodeScannerBinding implements OnClickListener.Listener {
    public static final SparseIntArray J;
    public final OnClickListener G;
    public final OnClickListener H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.loading_layout, 4);
        sparseIntArray.put(R.id.appbar_layout, 5);
        sparseIntArray.put(R.id.toolbar, 6);
        sparseIntArray.put(R.id.barcode_scanner_container, 7);
        sparseIntArray.put(R.id.cross_hairs_image_view, 8);
        sparseIntArray.put(R.id.barcode_image_view, 9);
        sparseIntArray.put(R.id.scan_title_text_view, 10);
        sparseIntArray.put(R.id.scan_intro_text_view, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityBarcodeScannerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 12, null, J);
        FrameLayout frameLayout = (FrameLayout) objArrT[7];
        Button button = (Button) objArrT[3];
        View view2 = (View) objArrT[4];
        Group group = (Group) objArrT[1];
        Group group2 = (Group) objArrT[2];
        super(dataBindingComponent, view, frameLayout, button, view2, group, group2, (Toolbar) objArrT[6]);
        this.I = -1L;
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        E(view);
        this.G = new OnClickListener(this, 1);
        this.H = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((BarcodeScannerViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.barcode.scanner.databinding.ActivityBarcodeScannerBinding
    public final void L(BarcodeScannerViewModel barcodeScannerViewModel) throws Throwable {
        this.E = barcodeScannerViewModel;
        synchronized (this) {
            this.I |= 2;
        }
        h(273);
        y();
    }

    public final void a(int i) {
        BarcodeScannerViewModel barcodeScannerViewModel;
        if (i == 1 && (barcodeScannerViewModel = this.E) != null) {
            PublishSubject publishSubject = barcodeScannerViewModel.i;
            AnalyticsManager analyticsManager = barcodeScannerViewModel.f;
            analyticsManager.c(BarcodeScannerOnboardingActionData.e);
            if (barcodeScannerViewModel.e.f6646a.a("android.permission.CAMERA")) {
                analyticsManager.c(BarcodeScannerOnboardingActionData.l);
                publishSubject.onNext(BarcodeScannerContract.Actions.CameraAccessPermanentlyDenied.f6640a);
            } else {
                analyticsManager.c(BarcodeScannerOnboardingActionData.k);
                publishSubject.onNext(BarcodeScannerContract.Actions.EnableCameraAccess.f6641a);
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        BarcodeScannerViewModel barcodeScannerViewModel = this.E;
        long j2 = 7 & j;
        boolean z4 = false;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = barcodeScannerViewModel != null ? barcodeScannerViewModel.j : null;
            I(0, mutableLiveData);
            BarcodeScannerContract.ViewState viewState = mutableLiveData != null ? (BarcodeScannerContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                boolean z5 = viewState.b;
                z4 = viewState.f6645a;
                z3 = z5;
            } else {
                z3 = false;
            }
            z2 = !z4;
            boolean z6 = z4;
            z4 = z3;
            z = z6;
        } else {
            z = false;
            z2 = false;
        }
        if ((j & 4) != 0) {
            this.z.setOnClickListener(this.G);
            this.A.setOnClickListener(this.H);
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.A, z4);
            BindingAdaptersKt.p(this.B, z);
            BindingAdaptersKt.p(this.C, z2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.I = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }
}
