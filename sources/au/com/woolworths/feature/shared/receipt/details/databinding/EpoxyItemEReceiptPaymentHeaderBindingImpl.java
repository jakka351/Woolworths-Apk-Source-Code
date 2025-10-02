package au.com.woolworths.feature.shared.receipt.details.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsClickHandler;
import au.com.woolworths.feature.shared.receipt.details.generated.callback.OnClickListener;

/* loaded from: classes3.dex */
public class EpoxyItemEReceiptPaymentHeaderBindingImpl extends EpoxyItemEReceiptPaymentHeaderBinding implements OnClickListener.Listener {
    public final OnClickListener C;
    public long D;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemEReceiptPaymentHeaderBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
        super(dataBindingComponent, view, (ImageView) objArrT[1]);
        this.D = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        E(view);
        this.C = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (129 == i) {
            this.z = (Boolean) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(129);
            y();
            return true;
        }
        if (35 == i) {
            this.B = (EReceiptDetailsClickHandler) obj;
            synchronized (this) {
                this.D |= 2;
            }
            h(35);
            y();
            return true;
        }
        if (128 != i) {
            return false;
        }
        this.A = (Boolean) obj;
        synchronized (this) {
            this.D |= 4;
        }
        h(128);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shared.receipt.details.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        EReceiptDetailsClickHandler eReceiptDetailsClickHandler = this.B;
        if (eReceiptDetailsClickHandler != null) {
            eReceiptDetailsClickHandler.P();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[PHI: r0
  0x0029: PHI (r0v2 long) = (r0v1 long), (r0v9 long) binds: [B:6:0x0013, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r12 = this;
            monitor-enter(r12)
            long r0 = r12.D     // Catch: java.lang.Throwable -> L5c
            r2 = 0
            r12.D = r2     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L5c
            java.lang.Boolean r4 = r12.z
            java.lang.Boolean r5 = r12.A
            r6 = 9
            long r8 = r0 & r6
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r9 = 0
            if (r8 == 0) goto L29
            boolean r4 = androidx.databinding.ViewDataBinding.B(r4)
            if (r8 == 0) goto L24
            if (r4 == 0) goto L21
            r10 = 32
        L1f:
            long r0 = r0 | r10
            goto L24
        L21:
            r10 = 16
            goto L1f
        L24:
            if (r4 == 0) goto L29
            r4 = 180(0xb4, float:2.52E-43)
            goto L2a
        L29:
            r4 = r9
        L2a:
            r10 = 12
            long r10 = r10 & r0
            int r8 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r8 == 0) goto L35
            boolean r9 = androidx.databinding.ViewDataBinding.B(r5)
        L35:
            r10 = 8
            long r10 = r10 & r0
            int r5 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r5 == 0) goto L43
            android.widget.ImageView r5 = r12.y
            au.com.woolworths.feature.shared.receipt.details.generated.callback.OnClickListener r10 = r12.C
            r5.setOnClickListener(r10)
        L43:
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L54
            int r0 = androidx.databinding.ViewDataBinding.s
            r1 = 11
            if (r0 < r1) goto L54
            android.widget.ImageView r0 = r12.y
            float r1 = (float) r4
            r0.setRotation(r1)
        L54:
            if (r8 == 0) goto L5b
            android.widget.ImageView r0 = r12.y
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(r0, r9)
        L5b:
            return
        L5c:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L5c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shared.receipt.details.databinding.EpoxyItemEReceiptPaymentHeaderBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
