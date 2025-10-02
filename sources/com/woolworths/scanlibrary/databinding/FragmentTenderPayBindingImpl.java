package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import com.woolworths.R;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.generated.callback.OnClickListener;
import com.woolworths.scanlibrary.ui.checkout.pay.PayContract;
import com.woolworths.scanlibrary.ui.checkout.pay.PayFragment;
import com.woolworths.scanlibrary.util.widget.DiscountListView;

/* loaded from: classes7.dex */
public class FragmentTenderPayBindingImpl extends FragmentTenderPayBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts U;
    public static final SparseIntArray V;
    public final FrameLayout O;
    public final ViewPaymentErrorBinding P;
    public final LayoutInstrumentListBinding Q;
    public final OnClickListener R;
    public final OnClickListener S;
    public long T;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(23);
        U = includedLayouts;
        includedLayouts.a(1, new int[]{12, 13}, new int[]{R.layout.layout_dark_toolbar_progress, R.layout.view_payment_error}, new String[]{"layout_dark_toolbar_progress", "view_payment_error"});
        includedLayouts.a(11, new int[]{14}, new int[]{R.layout.layout_instrument_list}, new String[]{"layout_instrument_list"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(R.id.transitionsContainer, 15);
        sparseIntArray.put(R.id.lblSummary, 16);
        sparseIntArray.put(R.id.textTotalQuantityPrice, 17);
        sparseIntArray.put(R.id.txtLabelSelectedPaymentMethod, 18);
        sparseIntArray.put(R.id.layoutSelectedPaymentMethod, 19);
        sparseIntArray.put(R.id.selectedInstrumentIcon, 20);
        sparseIntArray.put(R.id.selectedInstrumentName, 21);
        sparseIntArray.put(R.id.card_status_warning, 22);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentTenderPayBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 23, U, V);
        Button button = (Button) objArrT[2];
        TextView textView = (TextView) objArrT[3];
        TextView textView2 = (TextView) objArrT[22];
        TextView textView3 = (TextView) objArrT[10];
        LayoutDarkToolbarProgressBinding layoutDarkToolbarProgressBinding = (LayoutDarkToolbarProgressBinding) objArrT[12];
        TextView textView4 = (TextView) objArrT[7];
        DiscountListView discountListView = (DiscountListView) objArrT[5];
        TextView textView5 = (TextView) objArrT[8];
        ImageView imageView = (ImageView) objArrT[4];
        RelativeLayout relativeLayout = (RelativeLayout) objArrT[11];
        ImageView imageView2 = (ImageView) objArrT[20];
        TextView textView6 = (TextView) objArrT[21];
        LinearLayout linearLayout = (LinearLayout) objArrT[9];
        FrameLayout frameLayout = (FrameLayout) objArrT[6];
        super(dataBindingComponent, view, button, textView, textView2, textView3, layoutDarkToolbarProgressBinding, textView4, discountListView, textView5, imageView, relativeLayout, imageView2, textView6, linearLayout, frameLayout);
        this.T = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.B.setTag(null);
        LayoutDarkToolbarProgressBinding layoutDarkToolbarProgressBinding2 = this.C;
        if (layoutDarkToolbarProgressBinding2 != null) {
            layoutDarkToolbarProgressBinding2.n = this;
        }
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        FrameLayout frameLayout2 = (FrameLayout) objArrT[0];
        this.O = frameLayout2;
        frameLayout2.setTag(null);
        ((LinearLayout) objArrT[1]).setTag(null);
        ViewPaymentErrorBinding viewPaymentErrorBinding = (ViewPaymentErrorBinding) objArrT[13];
        this.P = viewPaymentErrorBinding;
        if (viewPaymentErrorBinding != null) {
            viewPaymentErrorBinding.n = this;
        }
        LayoutInstrumentListBinding layoutInstrumentListBinding = (LayoutInstrumentListBinding) objArrT[14];
        this.Q = layoutInstrumentListBinding;
        if (layoutInstrumentListBinding != null) {
            layoutInstrumentListBinding.n = this;
        }
        this.K.setTag(null);
        this.L.setTag(null);
        E(view);
        this.R = new OnClickListener(this, 1);
        this.S = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (30 == i) {
            L((Cart) obj);
            return true;
        }
        if (273 != i) {
            return false;
        }
        M((PayFragment.ViewModel) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.FragmentTenderPayBinding
    public final void L(Cart cart) throws Throwable {
        this.M = cart;
        synchronized (this) {
            this.T |= 8192;
        }
        h(30);
        y();
    }

    @Override // com.woolworths.scanlibrary.databinding.FragmentTenderPayBinding
    public final void M(PayFragment.ViewModel viewModel) throws Throwable {
        J(12, viewModel);
        this.N = viewModel;
        synchronized (this) {
            this.T |= 4096;
        }
        h(273);
        y();
    }

    @Override // com.woolworths.scanlibrary.generated.callback.OnClickListener.Listener
    public final void a(int i) throws Throwable {
        PayFragment.ViewModel viewModel;
        if (i != 1) {
            if (i == 2 && (viewModel = this.N) != null) {
                viewModel.j();
                return;
            }
            return;
        }
        PayFragment.ViewModel viewModel2 = this.N;
        if (viewModel2 != null) {
            PayFragment payFragment = PayFragment.this;
            int iOrdinal = viewModel2.e.ordinal();
            if (iOrdinal == 5 || iOrdinal == 6) {
                ((PayContract.Presenter) payFragment.Q1()).k0();
            } else if (((PayContract.Presenter) payFragment.Q1()).s()) {
                ((PayContract.Presenter) payFragment.Q1()).e1();
            } else {
                payFragment.m2();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0100 A[PHI: r2
  0x0100: PHI (r2v20 long) = (r2v1 long), (r2v63 long) binds: [B:46:0x00db, B:59:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0158 A[PHI: r2
  0x0158: PHI (r2v22 long) = (r2v21 long), (r2v61 long) binds: [B:82:0x0132, B:95:0x0152] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 889
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.databinding.FragmentTenderPayBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.T != 0) {
                    return true;
                }
                return this.C.p() || this.P.p() || this.Q.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.T = llqqqql.c0063006300630063c0063;
        }
        this.C.r();
        this.P.r();
        this.Q.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        switch (i) {
            case 0:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.T |= 1;
                }
                return true;
            case 1:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.T |= 2;
                }
                return true;
            case 2:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.T |= 4;
                }
                return true;
            case 3:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.T |= 8;
                }
                return true;
            case 4:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.T |= 16;
                }
                return true;
            case 5:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.T |= 32;
                }
                return true;
            case 6:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.T |= 64;
                }
                return true;
            case 7:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.T |= 128;
                }
                return true;
            case 8:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.T |= 256;
                }
                return true;
            case 9:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.T |= 512;
                }
                return true;
            case 10:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.T |= llqqqql.c00630063c0063c0063;
                }
                return true;
            case 11:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.T |= llqqqql.ccc00630063c0063;
                }
                return true;
            case 12:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.T |= 4096;
                }
                return true;
            default:
                return false;
        }
    }
}
