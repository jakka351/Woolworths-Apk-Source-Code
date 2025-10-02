package au.com.woolworths.shop.checkout.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInlineMessageBinding;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import au.com.woolworths.shop.checkout.domain.model.breakdown.CheckoutOrderTotalDetails;
import au.com.woolworths.shop.checkout.generated.callback.OnClickListener;
import au.com.woolworths.shop.checkout.ui.listener.OrderTotalDetailsListener;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class IncludeCheckoutOrderTotalDetailsBindingImpl extends IncludeCheckoutOrderTotalDetailsBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts Q;
    public static final SparseIntArray R;
    public final Button L;
    public final OnClickListener M;
    public final OnClickListener N;
    public final OnClickListener O;
    public long P;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(13);
        Q = includedLayouts;
        includedLayouts.a(1, new int[]{8}, new int[]{R.layout.include_inline_message}, new String[]{"include_inline_message"});
        includedLayouts.a(3, new int[]{9}, new int[]{R.layout.include_horizontal_divider}, new String[]{"include_horizontal_divider"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(R.id.button_guideline, 10);
        sparseIntArray.put(R.id.breakdown_guideline, 11);
        sparseIntArray.put(R.id.totals_recycler_view, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeCheckoutOrderTotalDetailsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 13, Q, R);
        super(dataBindingComponent, view, (IncludeHorizontalDividerBinding) objArrT[9], (ImageButton) objArrT[4], (IncludeInlineMessageBinding) objArrT[8], (LinearLayout) objArrT[1], (ConstraintLayout) objArrT[3], (View) objArrT[2], (TextView) objArrT[5], (EpoxyRecyclerView) objArrT[12], (TextView) objArrT[6]);
        this.P = -1L;
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding = this.y;
        if (includeHorizontalDividerBinding != null) {
            includeHorizontalDividerBinding.n = this;
        }
        this.z.setTag(null);
        IncludeInlineMessageBinding includeInlineMessageBinding = this.A;
        if (includeInlineMessageBinding != null) {
            includeInlineMessageBinding.n = this;
        }
        this.B.setTag(null);
        ((LinearLayout) objArrT[0]).setTag(null);
        Button button = (Button) objArrT[7];
        this.L = button;
        button.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.G.setTag(null);
        E(view);
        this.M = new OnClickListener(this, 2);
        this.N = new OnClickListener(this, 3);
        this.O = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (117 == i) {
            L((InlineMessage) obj);
            return true;
        }
        if (190 == i) {
            O((CheckoutOrderTotalDetails) obj);
            return true;
        }
        if (122 == i) {
            M((Boolean) obj);
            return true;
        }
        if (157 != i) {
            return false;
        }
        N((OrderTotalDetailsListener) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.checkout.databinding.IncludeCheckoutOrderTotalDetailsBinding
    public final void L(InlineMessage inlineMessage) throws Throwable {
        this.I = inlineMessage;
        synchronized (this) {
            this.P |= 4;
        }
        h(117);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.IncludeCheckoutOrderTotalDetailsBinding
    public final void M(Boolean bool) throws Throwable {
        this.J = bool;
        synchronized (this) {
            this.P |= 16;
        }
        h(122);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.IncludeCheckoutOrderTotalDetailsBinding
    public final void N(OrderTotalDetailsListener orderTotalDetailsListener) throws Throwable {
        this.K = orderTotalDetailsListener;
        synchronized (this) {
            this.P |= 32;
        }
        h(157);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.IncludeCheckoutOrderTotalDetailsBinding
    public final void O(CheckoutOrderTotalDetails checkoutOrderTotalDetails) throws Throwable {
        this.H = checkoutOrderTotalDetails;
        synchronized (this) {
            this.P |= 8;
        }
        h(190);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        OrderTotalDetailsListener orderTotalDetailsListener;
        if (i == 1) {
            OrderTotalDetailsListener orderTotalDetailsListener2 = this.K;
            if (orderTotalDetailsListener2 != null) {
                orderTotalDetailsListener2.W2();
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && (orderTotalDetailsListener = this.K) != null) {
                orderTotalDetailsListener.N0();
                return;
            }
            return;
        }
        OrderTotalDetailsListener orderTotalDetailsListener3 = this.K;
        if (orderTotalDetailsListener3 != null) {
            orderTotalDetailsListener3.W2();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r15 = this;
            monitor-enter(r15)
            long r0 = r15.P     // Catch: java.lang.Throwable -> L95
            r2 = 0
            r15.P = r2     // Catch: java.lang.Throwable -> L95
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L95
            au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage r4 = r15.I
            au.com.woolworths.shop.checkout.domain.model.breakdown.CheckoutOrderTotalDetails r5 = r15.H
            java.lang.Boolean r6 = r15.J
            r7 = 68
            long r7 = r7 & r0
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r8 = 72
            long r8 = r8 & r0
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r9 = 0
            if (r8 == 0) goto L2d
            if (r5 == 0) goto L20
            au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsTotal r5 = r5.c
            goto L21
        L20:
            r5 = r9
        L21:
            if (r5 == 0) goto L2d
            java.lang.String r9 = r5.b
            java.lang.String r10 = r5.d
            java.lang.String r5 = r5.f10648a
            r14 = r10
            r10 = r9
            r9 = r14
            goto L2f
        L2d:
            r5 = r9
            r10 = r5
        L2f:
            r11 = 80
            long r11 = r11 & r0
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto L3b
            boolean r6 = androidx.databinding.ViewDataBinding.B(r6)
            goto L3c
        L3b:
            r6 = 0
        L3c:
            r12 = 64
            long r0 = r0 & r12
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L6b
            android.widget.ImageButton r0 = r15.z
            au.com.woolworths.shop.checkout.generated.callback.OnClickListener r1 = r15.M
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r15.L
            au.com.woolworths.shop.checkout.generated.callback.OnClickListener r1 = r15.N
            r0.setOnClickListener(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r15.C
            au.com.woolworths.shop.checkout.generated.callback.OnClickListener r1 = r15.O
            r0.setOnClickListener(r1)
            android.view.View r0 = r15.D
            r1 = 2131099801(0x7f060099, float:1.7811965E38)
            int r1 = androidx.databinding.ViewDataBinding.n(r1, r0)
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r1)
            r1 = 80
            au.com.woolworths.android.onesite.utils.ScrimUtil.a(r0, r1, r2)
        L6b:
            if (r7 == 0) goto L72
            au.com.woolworths.android.onesite.base.ui.databinding.IncludeInlineMessageBinding r0 = r15.A
            r0.L(r4)
        L72:
            if (r11 == 0) goto L79
            android.widget.Button r0 = r15.L
            r0.setEnabled(r6)
        L79:
            if (r8 == 0) goto L8a
            android.widget.Button r0 = r15.L
            androidx.databinding.adapters.TextViewBindingAdapter.b(r0, r9)
            android.widget.TextView r0 = r15.E
            androidx.databinding.adapters.TextViewBindingAdapter.b(r0, r5)
            android.widget.TextView r0 = r15.G
            androidx.databinding.adapters.TextViewBindingAdapter.b(r0, r10)
        L8a:
            au.com.woolworths.android.onesite.base.ui.databinding.IncludeInlineMessageBinding r0 = r15.A
            r0.k()
            au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding r0 = r15.y
            r0.k()
            return
        L95:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L95
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.databinding.IncludeCheckoutOrderTotalDetailsBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.P != 0) {
                    return true;
                }
                return this.A.p() || this.y.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.P = 64L;
        }
        this.A.r();
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
                this.P |= 1;
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
            this.P |= 2;
        }
        return true;
    }
}
