package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.pay.sdk.models.SaveOptions;
import au.com.woolworths.pay.sdk.web.CardCaptureView;
import com.woolworths.R;
import com.woolworths.scanlibrary.generated.callback.OnClickListener;
import com.woolworths.scanlibrary.util.widget.AddCreditCardView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public class ViewAddCreditcardBindingImpl extends ViewAddCreditcardBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts R;
    public static final SparseIntArray S;
    public final ViewAddcardErrorBinding H;
    public final ViewAcceptedCreditcardsBinding I;
    public final Button J;
    public final OnClickListener K;
    public final OnClickListener L;
    public final OnClickListener M;
    public final OnClickListener N;
    public final OnClickListener O;
    public final OnClickListener P;
    public long Q;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        R = includedLayouts;
        includedLayouts.a(1, new int[]{8, 9}, new int[]{R.layout.view_addcard_error, R.layout.view_accepted_creditcards}, new String[]{"view_addcard_error", "view_accepted_creditcards"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(R.id.creditCardCaptureViewConstraintLayout, 10);
        sparseIntArray.put(R.id.creditCardCaptureHostView, 11);
        sparseIntArray.put(R.id.progressLoadCaptureView, 12);
        sparseIntArray.put(R.id.initialisationFailTextView, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewAddCreditcardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 14, R, S);
        ImageView imageView = (ImageView) objArrT[2];
        TextView textView = (TextView) objArrT[3];
        LinearLayout linearLayout = (LinearLayout) objArrT[6];
        LinearLayout linearLayout2 = (LinearLayout) objArrT[11];
        LinearLayout linearLayout3 = (LinearLayout) objArrT[5];
        super(dataBindingComponent, view, imageView, textView, linearLayout, linearLayout2, linearLayout3, (Button) objArrT[7], (LinearLayout) objArrT[1]);
        this.Q = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.C.setTag(null);
        ((RelativeLayout) objArrT[0]).setTag(null);
        ViewAddcardErrorBinding viewAddcardErrorBinding = (ViewAddcardErrorBinding) objArrT[8];
        this.H = viewAddcardErrorBinding;
        if (viewAddcardErrorBinding != null) {
            viewAddcardErrorBinding.n = this;
        }
        ViewAcceptedCreditcardsBinding viewAcceptedCreditcardsBinding = (ViewAcceptedCreditcardsBinding) objArrT[9];
        this.I = viewAcceptedCreditcardsBinding;
        if (viewAcceptedCreditcardsBinding != null) {
            viewAcceptedCreditcardsBinding.n = this;
        }
        Button button = (Button) objArrT[4];
        this.J = button;
        button.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        E(view);
        this.K = new OnClickListener(this, 5);
        this.L = new OnClickListener(this, 2);
        this.M = new OnClickListener(this, 6);
        this.N = new OnClickListener(this, 4);
        this.O = new OnClickListener(this, 3);
        this.P = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((AddCreditCardView.ViewModel) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.ViewAddCreditcardBinding
    public final void L(AddCreditCardView.ViewModel viewModel) throws Throwable {
        J(7, viewModel);
        this.F = viewModel;
        synchronized (this) {
            this.Q |= 128;
        }
        h(273);
        y();
    }

    @Override // com.woolworths.scanlibrary.generated.callback.OnClickListener.Listener
    public final void a(int i) throws Throwable {
        AddCreditCardView.ViewModel viewModel;
        if (i == 1) {
            AddCreditCardView.ViewModel viewModel2 = this.F;
            if (viewModel2 != null) {
                AddCreditCardView addCreditCardView = AddCreditCardView.this;
                AddCreditCardView.b(addCreditCardView);
                CardCaptureView cardCaptureView = addCreditCardView.i;
                if (cardCaptureView != null) {
                    cardCaptureView.b();
                }
                viewModel2.m.i(false);
                AddCreditCardView.AddCardListener addCardListener = addCreditCardView.e;
                if (addCardListener != null) {
                    addCardListener.s0();
                    return;
                } else {
                    Intrinsics.p("addCardListener");
                    throw null;
                }
            }
            return;
        }
        if (i == 2) {
            AddCreditCardView.ViewModel viewModel3 = this.F;
            if (viewModel3 != null) {
                CardCaptureView cardCaptureView2 = AddCreditCardView.this.i;
                if (cardCaptureView2 != null) {
                    cardCaptureView2.b();
                }
                viewModel3.m.i(false);
                return;
            }
            return;
        }
        if (i != 3) {
            if (i == 6 && (viewModel = this.F) != null) {
                viewModel.k.i(false);
                AddCreditCardView.this.f();
                return;
            }
            return;
        }
        AddCreditCardView.ViewModel viewModel4 = this.F;
        if (viewModel4 != null) {
            AddCreditCardView addCreditCardView2 = AddCreditCardView.this;
            AddCreditCardView.AddCardListener addCardListener2 = addCreditCardView2.e;
            if (addCardListener2 == null) {
                Intrinsics.p("addCardListener");
                throw null;
            }
            addCardListener2.m();
            CardCaptureView cardCaptureView3 = addCreditCardView2.i;
            if (cardCaptureView3 != null) {
                cardCaptureView3.e(SaveOptions.SAVE_MAKE_PRIMARY, Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c A[PHI: r2
  0x004c: PHI (r2v3 long) = (r2v0 long), (r2v17 long) binds: [B:9:0x0026, B:22:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4 A[PHI: r2
  0x00a4: PHI (r2v7 long) = (r2v6 long), (r2v13 long) binds: [B:47:0x007f, B:60:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00de  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.databinding.ViewAddCreditcardBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.Q != 0) {
                    return true;
                }
                return this.H.p() || this.I.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.Q = 256L;
        }
        this.H.r();
        this.I.r();
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
                    this.Q |= 1;
                }
                return true;
            case 1:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.Q |= 2;
                }
                return true;
            case 2:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.Q |= 4;
                }
                return true;
            case 3:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.Q |= 8;
                }
                return true;
            case 4:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.Q |= 16;
                }
                return true;
            case 5:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.Q |= 32;
                }
                return true;
            case 6:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.Q |= 64;
                }
                return true;
            case 7:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.Q |= 128;
                }
                return true;
            default:
                return false;
        }
    }
}
