package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.pay.sdk.web.UpdateCreditCardView;
import com.woolworths.R;
import com.woolworths.scanlibrary.generated.callback.OnClickListener;
import com.woolworths.scanlibrary.util.widget.UpdateCreditCardExpirationView;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ViewUpdateCreditcardBindingImpl extends ViewUpdateCreditcardBinding implements OnClickListener.Listener {
    public static final SparseIntArray H;
    public final Button D;
    public final OnClickListener E;
    public final OnClickListener F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.sectionIframe, 3);
        sparseIntArray.put(R.id.getUpdateCreditLinearLayout, 4);
        sparseIntArray.put(R.id.dummyView, 5);
        sparseIntArray.put(R.id.progressLoadCaptureView, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewUpdateCreditcardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 7, null, H);
        View view2 = (View) objArrT[5];
        LinearLayout linearLayout = (LinearLayout) objArrT[4];
        LinearLayout linearLayout2 = (LinearLayout) objArrT[2];
        super(dataBindingComponent, view, view2, linearLayout, linearLayout2);
        this.G = -1L;
        this.A.setTag(null);
        ((RelativeLayout) objArrT[0]).setTag(null);
        Button button = (Button) objArrT[1];
        this.D = button;
        button.setTag(null);
        E(view);
        this.E = new OnClickListener(this, 1);
        this.F = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((UpdateCreditCardExpirationView.ViewModel) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.ViewUpdateCreditcardBinding
    public final void L(UpdateCreditCardExpirationView.ViewModel viewModel) throws Throwable {
        J(2, viewModel);
        this.B = viewModel;
        synchronized (this) {
            this.G |= 4;
        }
        h(273);
        y();
    }

    @Override // com.woolworths.scanlibrary.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        UpdateCreditCardExpirationView.ViewModel viewModel;
        if (i == 1 && (viewModel = this.B) != null) {
            UpdateCreditCardExpirationView updateCreditCardExpirationView = UpdateCreditCardExpirationView.this;
            UpdateCreditCardExpirationView.UpdateCardListener updateCardListener = updateCreditCardExpirationView.g;
            if (updateCardListener != null) {
                updateCardListener.m();
            }
            UpdateCreditCardView updateCreditCardView = updateCreditCardExpirationView.h;
            if (updateCreditCardView != null) {
                updateCreditCardView.d(new JSONObject());
            } else {
                Intrinsics.p("updateCreditCardExpirationView");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r14 = this;
            monitor-enter(r14)
            long r0 = r14.G     // Catch: java.lang.Throwable -> L7c
            r2 = 0
            r14.G = r2     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L7c
            com.woolworths.scanlibrary.util.widget.UpdateCreditCardExpirationView$ViewModel r4 = r14.B
            r5 = 15
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 14
            r8 = 13
            r10 = 0
            if (r5 == 0) goto L51
            long r11 = r0 & r8
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            r11 = 0
            if (r5 == 0) goto L2b
            if (r4 == 0) goto L22
            androidx.databinding.ObservableBoolean r5 = r4.e
            goto L23
        L22:
            r5 = r11
        L23:
            r14.J(r10, r5)
            if (r5 == 0) goto L2b
            boolean r5 = r5.e
            goto L2c
        L2b:
            r5 = r10
        L2c:
            long r12 = r0 & r6
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L52
            if (r4 == 0) goto L36
            androidx.databinding.ObservableBoolean r11 = r4.f
        L36:
            r4 = 1
            r14.J(r4, r11)
            if (r11 == 0) goto L3f
            boolean r4 = r11.e
            goto L40
        L3f:
            r4 = r10
        L40:
            if (r12 == 0) goto L4b
            if (r4 == 0) goto L48
            r11 = 32
        L46:
            long r0 = r0 | r11
            goto L4b
        L48:
            r11 = 16
            goto L46
        L4b:
            if (r4 == 0) goto L4e
            goto L52
        L4e:
            r10 = 8
            goto L52
        L51:
            r5 = r10
        L52:
            r11 = 8
            long r11 = r11 & r0
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L67
            android.widget.LinearLayout r4 = r14.A
            com.woolworths.scanlibrary.generated.callback.OnClickListener r11 = r14.F
            r4.setOnClickListener(r11)
            android.widget.Button r4 = r14.D
            com.woolworths.scanlibrary.generated.callback.OnClickListener r11 = r14.E
            r4.setOnClickListener(r11)
        L67:
            long r6 = r6 & r0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L71
            android.widget.LinearLayout r4 = r14.A
            r4.setVisibility(r10)
        L71:
            long r0 = r0 & r8
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L7b
            android.widget.Button r0 = r14.D
            r0.setEnabled(r5)
        L7b:
            return
        L7c:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L7c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.databinding.ViewUpdateCreditcardBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 8L;
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
                this.G |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.G |= 2;
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 4;
        }
        return true;
    }
}
