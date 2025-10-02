package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.foundation.barcode.ui.BarcodeView;
import com.woolworths.R;
import com.woolworths.scanlibrary.generated.callback.OnClickListener;
import com.woolworths.scanlibrary.ui.exit.ExitScanCodeViewModel;

/* loaded from: classes7.dex */
public class ActivityExitScanCodeBindingImpl extends ActivityExitScanCodeBinding implements OnClickListener.Listener {
    public static final SparseIntArray J;
    public final BarcodeView G;
    public final OnClickListener H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.guideline4, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityExitScanCodeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 9, null, J);
        TextView textView = (TextView) objArrT[7];
        BarcodeView barcodeView = (BarcodeView) objArrT[5];
        FrameLayout frameLayout = (FrameLayout) objArrT[3];
        super(dataBindingComponent, view, textView, barcodeView, frameLayout, (ConstraintLayout) objArrT[0], (TextView) objArrT[6], (TextView) objArrT[2], (TextView) objArrT[1]);
        this.I = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        BarcodeView barcodeView2 = (BarcodeView) objArrT[4];
        this.G = barcodeView2;
        barcodeView2.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        E(view);
        this.H = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((ExitScanCodeViewModel) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.ActivityExitScanCodeBinding
    public final void L(ExitScanCodeViewModel exitScanCodeViewModel) throws Throwable {
        this.F = exitScanCodeViewModel;
        synchronized (this) {
            this.I |= 32;
        }
        h(273);
        y();
    }

    @Override // com.woolworths.scanlibrary.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ExitScanCodeViewModel exitScanCodeViewModel = this.F;
        if (exitScanCodeViewModel != null) {
            exitScanCodeViewModel.u6();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0132  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.databinding.ActivityExitScanCodeBindingImpl.j():void");
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
            this.I = 64L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.I |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.I |= 2;
            }
            return true;
        }
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.I |= 4;
            }
            return true;
        }
        if (i == 3) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.I |= 8;
            }
            return true;
        }
        if (i != 4) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.I |= 16;
        }
        return true;
    }
}
