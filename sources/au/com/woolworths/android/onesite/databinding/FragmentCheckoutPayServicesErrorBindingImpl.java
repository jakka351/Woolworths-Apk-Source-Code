package au.com.woolworths.android.onesite.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PayServicesErrorViewModel;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentCheckoutPayServicesErrorBindingImpl extends FragmentCheckoutPayServicesErrorBinding {
    public static final ViewDataBinding.IncludedLayouts C;
    public static final SparseIntArray D;
    public long B;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        C = includedLayouts;
        includedLayouts.a(0, new int[]{2}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.loading_layout, 1);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((PayServicesErrorViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.databinding.FragmentCheckoutPayServicesErrorBinding
    public final void L(PayServicesErrorViewModel payServicesErrorViewModel) throws Throwable {
        this.A = payServicesErrorViewModel;
        synchronized (this) {
            this.B |= 4;
        }
        h(273);
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b A[PHI: r8
  0x004b: PHI (r8v2 au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PaymentServicesFullPageErrorState) = 
  (r8v0 au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PaymentServicesFullPageErrorState)
  (r8v4 au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PaymentServicesFullPageErrorState)
  (r8v4 au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PaymentServicesFullPageErrorState)
 binds: [B:15:0x0028, B:22:0x003f, B:24:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r15 = this;
            monitor-enter(r15)
            long r0 = r15.B     // Catch: java.lang.Throwable -> L88
            r2 = 0
            r15.B = r2     // Catch: java.lang.Throwable -> L88
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L88
            au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PayServicesErrorViewModel r4 = r15.A
            r5 = 13
            long r7 = r0 & r5
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r8 = 0
            r9 = 0
            if (r7 == 0) goto L5f
            if (r4 == 0) goto L19
            androidx.lifecycle.LiveData r10 = r4.f
            goto L1a
        L19:
            r10 = r8
        L1a:
            r15.I(r9, r10)
            if (r10 == 0) goto L26
            java.lang.Object r10 = r10.e()
            au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PayServicesErrorContract$ViewState r10 = (au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PayServicesErrorContract.ViewState) r10
            goto L27
        L26:
            r10 = r8
        L27:
            r11 = 1
            if (r10 == 0) goto L4b
            au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PaymentServicesFullPageErrorState r8 = r10.a()
            au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus r12 = r10.f4302a
            au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus r13 = au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus.g
            if (r12 != r13) goto L3d
            au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PaymentServicesFullPageErrorState r13 = r10.a()
            au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PaymentServicesFullPageErrorState r14 = au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PaymentServicesFullPageErrorState.e
            if (r13 != r14) goto L3d
            goto L49
        L3d:
            au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus r13 = au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus.f
            if (r12 != r13) goto L4b
            au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PaymentServicesFullPageErrorState r10 = r10.a()
            au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PaymentServicesFullPageErrorState r12 = au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PaymentServicesFullPageErrorState.d
            if (r10 != r12) goto L4b
        L49:
            r10 = r11
            goto L4c
        L4b:
            r10 = r9
        L4c:
            if (r7 == 0) goto L57
            if (r10 == 0) goto L54
            r12 = 32
        L52:
            long r0 = r0 | r12
            goto L57
        L54:
            r12 = 16
            goto L52
        L57:
            if (r10 == 0) goto L5a
            goto L5c
        L5a:
            r9 = 8
        L5c:
            r7 = r10 ^ 1
            goto L60
        L5f:
            r7 = r9
        L60:
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L76
            au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding r5 = r15.y
            android.view.View r5 = r5.h
            r5.setVisibility(r9)
            au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding r5 = r15.y
            r5.M(r8)
            android.view.View r5 = r15.z
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(r5, r7)
        L76:
            r5 = 12
            long r0 = r0 & r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L82
            au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding r0 = r15.y
            r0.L(r4)
        L82:
            au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding r0 = r15.y
            r0.k()
            return
        L88:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L88
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.databinding.FragmentCheckoutPayServicesErrorBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.B != 0) {
                    return true;
                }
                return this.y.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.B = 8L;
        }
        this.y.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.B |= 1;
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 2;
        }
        return true;
    }
}
