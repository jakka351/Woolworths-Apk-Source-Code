package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import com.woolworths.R;
import com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment;

/* loaded from: classes7.dex */
public class FragmentTapOnBindingImpl extends FragmentTapOnBinding {
    public static final ViewDataBinding.IncludedLayouts H;
    public static final SparseIntArray I;
    public long G;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        H = includedLayouts;
        includedLayouts.a(4, new int[]{5}, new int[]{R.layout.dialog_scan_result_view}, new String[]{"dialog_scan_result_view"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.textView7, 6);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((TapOnFragment.ViewModel) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.FragmentTapOnBinding
    public final void L(TapOnFragment.ViewModel viewModel) throws Throwable {
        J(3, viewModel);
        this.F = viewModel;
        synchronized (this) {
            this.G |= 8;
        }
        h(273);
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            long r2 = r1.G     // Catch: java.lang.Throwable -> L8e
            r4 = 0
            r1.G = r4     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r20)     // Catch: java.lang.Throwable -> L8e
            com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment$ViewModel r0 = r1.F
            r6 = 61
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 56
            r9 = 44
            r11 = 41
            r13 = 0
            r14 = 0
            if (r6 == 0) goto L65
            long r15 = r2 & r11
            int r6 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r6 == 0) goto L31
            if (r0 == 0) goto L26
            androidx.databinding.ObservableField r6 = r0.h
            goto L27
        L26:
            r6 = r14
        L27:
            r1.J(r13, r6)
            if (r6 == 0) goto L31
            java.lang.Object r6 = r6.e
            java.lang.String r6 = (java.lang.String) r6
            goto L32
        L31:
            r6 = r14
        L32:
            long r15 = r2 & r9
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L4c
            if (r0 == 0) goto L3f
            androidx.databinding.ObservableField r15 = r0.g
        L3c:
            r16 = r4
            goto L41
        L3f:
            r15 = r14
            goto L3c
        L41:
            r4 = 2
            r1.J(r4, r15)
            if (r15 == 0) goto L4e
            java.lang.Object r4 = r15.e
            java.lang.String r4 = (java.lang.String) r4
            goto L4f
        L4c:
            r16 = r4
        L4e:
            r4 = r14
        L4f:
            long r18 = r2 & r7
            int r5 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r5 == 0) goto L63
            if (r0 == 0) goto L59
            androidx.databinding.ObservableBoolean r14 = r0.f
        L59:
            r0 = 4
            r1.J(r0, r14)
            if (r14 == 0) goto L61
            boolean r13 = r14.e
        L61:
            r13 = r13 ^ 1
        L63:
            r14 = r6
            goto L68
        L65:
            r16 = r4
            r4 = r14
        L68:
            long r5 = r2 & r7
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L73
            android.widget.ImageView r0 = r1.y
            r0.setEnabled(r13)
        L73:
            long r5 = r2 & r11
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L7e
            android.widget.TextView r0 = r1.B
            androidx.databinding.adapters.TextViewBindingAdapter.b(r0, r14)
        L7e:
            long r2 = r2 & r9
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 == 0) goto L88
            android.widget.TextView r0 = r1.E
            androidx.databinding.adapters.TextViewBindingAdapter.b(r0, r4)
        L88:
            com.woolworths.scanlibrary.databinding.DialogScanResultViewBinding r0 = r1.z
            r0.k()
            return
        L8e:
            r0 = move-exception
            monitor-exit(r20)     // Catch: java.lang.Throwable -> L8e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.databinding.FragmentTapOnBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.G != 0) {
                    return true;
                }
                return this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 32L;
        }
        this.z.r();
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
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.G |= 4;
            }
            return true;
        }
        if (i == 3) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.G |= 8;
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
            this.G |= 16;
        }
        return true;
    }
}
