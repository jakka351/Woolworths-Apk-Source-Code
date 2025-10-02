package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.extensions.ActivityExtKt;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.ManualBarcodeInputTracking;
import com.woolworths.scanlibrary.generated.callback.OnClickListener;
import com.woolworths.scanlibrary.generated.callback.OnTextChanged;
import com.woolworths.scanlibrary.ui.scanner.ApiSupportBarcodeSymbology;
import com.woolworths.scanlibrary.ui.scanner.additem.AddItemActivity;
import com.woolworths.scanlibrary.ui.scanner.additem.AddItemContract;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public class ActivityManualAddItemProcessBindingImpl extends ActivityManualAddItemProcessBinding implements OnClickListener.Listener, OnTextChanged.Listener {
    public static final ViewDataBinding.IncludedLayouts T;
    public static final SparseIntArray U;
    public final OnClickListener M;
    public final OnClickListener N;
    public final OnClickListener O;
    public final OnTextChanged P;
    public final OnClickListener Q;
    public final OnClickListener R;
    public long S;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(16);
        T = includedLayouts;
        includedLayouts.a(10, new int[]{12}, new int[]{R.layout.dialog_scan_result_view}, new String[]{"dialog_scan_result_view"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(R.id.included, 11);
        sparseIntArray.put(R.id.textView9, 13);
        sparseIntArray.put(R.id.errorMessage, 14);
        sparseIntArray.put(R.id.textView10, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityManualAddItemProcessBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 16, T, U);
        Button button = (Button) objArrT[5];
        Button button2 = (Button) objArrT[9];
        Button button3 = (Button) objArrT[8];
        Button button4 = (Button) objArrT[4];
        ImageView imageView = (ImageView) objArrT[3];
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        DialogScanResultViewBinding dialogScanResultViewBinding = (DialogScanResultViewBinding) objArrT[12];
        View view2 = (View) objArrT[11];
        FrameLayout frameLayout2 = (FrameLayout) objArrT[6];
        EditText editText = (EditText) objArrT[2];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[1];
        FrameLayout frameLayout3 = (FrameLayout) objArrT[7];
        FrameLayout frameLayout4 = (FrameLayout) objArrT[10];
        super(dataBindingComponent, view, button, button2, button3, button4, imageView, frameLayout, dialogScanResultViewBinding, view2, frameLayout2, editText, constraintLayout, frameLayout3, frameLayout4);
        this.S = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        DialogScanResultViewBinding dialogScanResultViewBinding2 = this.E;
        if (dialogScanResultViewBinding2 != null) {
            dialogScanResultViewBinding2.n = this;
        }
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        E(view);
        this.M = new OnClickListener(this, 6);
        this.N = new OnClickListener(this, 4);
        this.O = new OnClickListener(this, 2);
        this.P = new OnTextChanged(this);
        this.Q = new OnClickListener(this, 5);
        this.R = new OnClickListener(this, 3);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (93 != i) {
            return false;
        }
        L((AddItemActivity) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.ActivityManualAddItemProcessBinding
    public final void L(AddItemActivity addItemActivity) throws Throwable {
        this.L = addItemActivity;
        synchronized (this) {
            this.S |= 2;
        }
        h(93);
        y();
    }

    @Override // com.woolworths.scanlibrary.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        AddItemActivity addItemActivity;
        if (i == 2) {
            AddItemActivity addItemActivity2 = this.L;
            if (addItemActivity2 != null) {
                EditText manualBarCodeEntryText = addItemActivity2.d5().H;
                Intrinsics.g(manualBarCodeEntryText, "manualBarCodeEntryText");
                manualBarCodeEntryText.setText("");
                return;
            }
            return;
        }
        AddItemContract.ViewState.LOADING_VIEW loading_view = AddItemContract.ViewState.LOADING_VIEW.f21327a;
        if (i == 3) {
            AddItemActivity addItemActivity3 = this.L;
            if (addItemActivity3 != null) {
                ActivityExtKt.a(addItemActivity3);
                AnalyticsProvider analyticsProviderN4 = addItemActivity3.N4();
                EditText manualBarCodeEntryText2 = addItemActivity3.d5().H;
                Intrinsics.g(manualBarCodeEntryText2, "manualBarCodeEntryText");
                String barcode = manualBarCodeEntryText2.getText().toString();
                Intrinsics.h(barcode, "barcode");
                ManualBarcodeInputTracking manualBarcodeInputTracking = new ManualBarcodeInputTracking("Manual Barcode Entry");
                manualBarcodeInputTracking.a("manualInput.barcode", barcode);
                analyticsProviderN4.b(manualBarcodeInputTracking);
                addItemActivity3.H = loading_view;
                addItemActivity3.d5().L(addItemActivity3);
                AddItemContract.Presenter presenter = (AddItemContract.Presenter) addItemActivity3.S4();
                EditText manualBarCodeEntryText3 = addItemActivity3.d5().H;
                Intrinsics.g(manualBarCodeEntryText3, "manualBarCodeEntryText");
                String string = manualBarCodeEntryText3.getText().toString();
                ApiSupportBarcodeSymbology apiSupportBarcodeSymbology = ApiSupportBarcodeSymbology.e;
                presenter.K0(string, "Manual", true);
                return;
            }
            return;
        }
        if (i == 4) {
            AddItemActivity addItemActivity4 = this.L;
            if (addItemActivity4 != null) {
                addItemActivity4.c5();
                return;
            }
            return;
        }
        if (i != 5) {
            if (i == 6 && (addItemActivity = this.L) != null) {
                addItemActivity.c5();
                return;
            }
            return;
        }
        AddItemActivity addItemActivity5 = this.L;
        if (addItemActivity5 != null) {
            addItemActivity5.H = loading_view;
            addItemActivity5.d5().L(addItemActivity5);
            AddItemContract.Presenter presenter2 = (AddItemContract.Presenter) addItemActivity5.S4();
            EditText manualBarCodeEntryText4 = addItemActivity5.d5().H;
            Intrinsics.g(manualBarCodeEntryText4, "manualBarCodeEntryText");
            presenter2.T0(manualBarCodeEntryText4.getText().toString());
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        AddItemContract.ViewState viewState;
        int i;
        int i2;
        int i3;
        boolean z;
        synchronized (this) {
            j = this.S;
            this.S = 0L;
        }
        AddItemActivity addItemActivity = this.L;
        long j3 = j & 6;
        int i4 = 0;
        if (j3 != 0) {
            viewState = addItemActivity != null ? addItemActivity.H : null;
            boolean z2 = viewState instanceof AddItemContract.ViewState.PRODUCT_MANUAL_ADD_CONFIRM_VIEW;
            z = viewState instanceof AddItemContract.ViewState.CouponItem;
            j2 = 0;
            boolean z3 = viewState instanceof AddItemContract.ViewState.LOADING_VIEW;
            boolean z4 = viewState instanceof AddItemContract.ViewState.MANUAL_BAR_CODE_ENTRY_VIEW;
            if (j3 != 0) {
                j |= z2 ? 16L : 8L;
            }
            if ((j & 6) != 0) {
                j = z ? j | 4096 : j | llqqqql.ccc00630063c0063;
            }
            if ((j & 6) != 0) {
                j |= z3 ? 64L : 32L;
            }
            if ((j & 6) != 0) {
                j |= z4 ? llqqqql.c00630063c0063c0063 : 512L;
            }
            i3 = z2 ? 0 : 8;
            i = z3 ? 0 : 8;
            i2 = z4 ? 0 : 8;
        } else {
            j2 = 0;
            viewState = null;
            i = 0;
            i2 = 0;
            i3 = 0;
            z = false;
        }
        boolean z5 = (llqqqql.ccc00630063c0063 & j) != j2 ? viewState instanceof AddItemContract.ViewState.ScannedItemBlocked : false;
        long j4 = j & 6;
        if (j4 != j2) {
            if (z) {
                z5 = true;
            }
            if (j4 != j2) {
                j |= z5 ? 256L : 128L;
            }
            i4 = z5 ? 0 : 8;
        }
        if ((4 & j) != j2) {
            this.y.setOnClickListener(this.N);
            this.z.setOnClickListener(this.M);
            this.A.setOnClickListener(this.Q);
            this.B.setOnClickListener(this.R);
            this.C.setOnClickListener(this.O);
            TextViewBindingAdapter.c(this.H, this.P, null);
        }
        if ((j & 6) != j2) {
            this.G.setVisibility(i);
            this.I.setVisibility(i2);
            this.J.setVisibility(i3);
            this.K.setVisibility(i4);
        }
        this.E.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.S != 0) {
                    return true;
                }
                return this.E.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.S = 4L;
        }
        this.E.r();
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
            this.S |= 1;
        }
        return true;
    }
}
