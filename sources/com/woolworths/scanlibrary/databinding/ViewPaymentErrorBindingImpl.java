package com.woolworths.scanlibrary.databinding;

import com.woolworths.scanlibrary.util.payment.InfoBarError;

/* loaded from: classes7.dex */
public class ViewPaymentErrorBindingImpl extends ViewPaymentErrorBinding {
    public long G;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (240 == i) {
            O((Boolean) obj);
            return true;
        }
        if (71 == i) {
            L((String) obj);
            return true;
        }
        if (112 == i) {
            N((InfoBarError) obj);
            return true;
        }
        if (72 != i) {
            return false;
        }
        M((String) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.ViewPaymentErrorBinding
    public final void L(String str) throws Throwable {
        this.D = str;
        synchronized (this) {
            this.G |= 2;
        }
        h(71);
        y();
    }

    @Override // com.woolworths.scanlibrary.databinding.ViewPaymentErrorBinding
    public final void M(String str) throws Throwable {
        this.C = str;
        synchronized (this) {
            this.G |= 8;
        }
        h(72);
        y();
    }

    @Override // com.woolworths.scanlibrary.databinding.ViewPaymentErrorBinding
    public final void N(InfoBarError infoBarError) throws Throwable {
        this.F = infoBarError;
        synchronized (this) {
            this.G |= 4;
        }
        h(112);
        y();
    }

    @Override // com.woolworths.scanlibrary.databinding.ViewPaymentErrorBinding
    public final void O(Boolean bool) throws Throwable {
        this.E = bool;
        synchronized (this) {
            this.G |= 1;
        }
        h(240);
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[PHI: r2
  0x0030: PHI (r2v1 long) = (r2v0 long), (r2v6 long) binds: [B:7:0x0019, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            long r2 = r1.G     // Catch: java.lang.Throwable -> L7e
            r4 = 0
            r1.G = r4     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L7e
            java.lang.Boolean r0 = r1.E
            java.lang.String r6 = r1.D
            com.woolworths.scanlibrary.util.payment.InfoBarError r7 = r1.F
            java.lang.String r8 = r1.C
            r9 = 17
            long r11 = r2 & r9
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            r12 = 0
            if (r11 == 0) goto L30
            boolean r0 = androidx.databinding.ViewDataBinding.B(r0)
            if (r11 == 0) goto L2a
            if (r0 == 0) goto L27
            r13 = 64
        L25:
            long r2 = r2 | r13
            goto L2a
        L27:
            r13 = 32
            goto L25
        L2a:
            if (r0 == 0) goto L2d
            goto L30
        L2d:
            r0 = 8
            goto L31
        L30:
            r0 = r12
        L31:
            r13 = 18
            long r13 = r13 & r2
            int r11 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            r13 = 20
            long r13 = r13 & r2
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 == 0) goto L49
            if (r7 == 0) goto L49
            int r12 = r7.d
            int r7 = r7.e
            r16 = r12
            r12 = r7
            r7 = r16
            goto L4a
        L49:
            r7 = r12
        L4a:
            r14 = 24
            long r14 = r14 & r2
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r13 == 0) goto L65
            android.widget.ImageView r13 = r1.y
            java.lang.String r15 = "imageView"
            kotlin.jvm.internal.Intrinsics.h(r13, r15)
            r13.setImageResource(r12)
            android.widget.RelativeLayout r12 = r1.z
            java.lang.String r13 = "view"
            kotlin.jvm.internal.Intrinsics.h(r12, r13)
            r12.setBackgroundResource(r7)
        L65:
            long r2 = r2 & r9
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L6f
            android.widget.RelativeLayout r2 = r1.z
            r2.setVisibility(r0)
        L6f:
            if (r11 == 0) goto L76
            android.widget.TextView r0 = r1.A
            androidx.databinding.adapters.TextViewBindingAdapter.b(r0, r6)
        L76:
            if (r14 == 0) goto L7d
            android.widget.TextView r0 = r1.B
            androidx.databinding.adapters.TextViewBindingAdapter.b(r0, r8)
        L7d:
            return
        L7e:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L7e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.databinding.ViewPaymentErrorBindingImpl.j():void");
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
            this.G = 16L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
