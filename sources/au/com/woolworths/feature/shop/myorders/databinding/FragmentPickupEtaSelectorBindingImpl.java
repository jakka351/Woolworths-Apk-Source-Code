package au.com.woolworths.feature.shop.myorders.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorViewModel;
import au.com.woolworths.feature.shop.myorders.generated.callback.ButtonClickHandler;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorView;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentPickupEtaSelectorBindingImpl extends FragmentPickupEtaSelectorBinding implements ButtonClickHandler.Listener {
    public static final ViewDataBinding.IncludedLayouts H;
    public static final SparseIntArray I;
    public final ButtonClickHandler F;
    public long G;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        H = includedLayouts;
        includedLayouts.a(0, new int[]{4}, new int[]{R.layout.epoxy_item_button}, new String[]{"epoxy_item_button"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.begin_guide_line, 5);
        sparseIntArray.put(R.id.end_guide_line, 6);
        sparseIntArray.put(R.id.grab_handle_image_view, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentPickupEtaSelectorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 8, H, I);
        EpoxyItemButtonBinding epoxyItemButtonBinding = (EpoxyItemButtonBinding) objArrT[4];
        super(dataBindingComponent, view, epoxyItemButtonBinding, (HorizontalSelectorView) objArrT[3], (TextView) objArrT[2], (TextView) objArrT[1]);
        this.G = -1L;
        EpoxyItemButtonBinding epoxyItemButtonBinding2 = this.y;
        if (epoxyItemButtonBinding2 != null) {
            epoxyItemButtonBinding2.n = this;
        }
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        E(view);
        this.F = new ButtonClickHandler(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (272 == i) {
            L((HorizontalSelectorViewListener) obj);
            return true;
        }
        if (273 != i) {
            return false;
        }
        M((PickupEtaSelectorViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.FragmentPickupEtaSelectorBinding
    public final void L(HorizontalSelectorViewListener horizontalSelectorViewListener) throws Throwable {
        this.C = horizontalSelectorViewListener;
        synchronized (this) {
            this.G |= 4;
        }
        h(272);
        y();
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.FragmentPickupEtaSelectorBinding
    public final void M(PickupEtaSelectorViewModel pickupEtaSelectorViewModel) throws Throwable {
        this.D = pickupEtaSelectorViewModel;
        synchronized (this) {
            this.G |= 8;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.ButtonClickHandler.Listener
    public final void g(int i) {
        PickupEtaSelectorViewModel pickupEtaSelectorViewModel = this.D;
        if (pickupEtaSelectorViewModel != null) {
            pickupEtaSelectorViewModel.p6();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
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
            long r2 = r1.G     // Catch: java.lang.Throwable -> Lb2
            r4 = 0
            r1.G = r4     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r17)     // Catch: java.lang.Throwable -> Lb2
            au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener r0 = r1.C
            au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorViewModel r6 = r1.D
            r7 = 20
            long r7 = r7 & r2
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            r8 = 25
            long r8 = r8 & r2
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            r9 = 0
            if (r8 == 0) goto L7e
            if (r6 == 0) goto L26
            kotlin.Lazy r6 = r6.i
            java.lang.Object r6 = r6.getD()
            kotlinx.coroutines.flow.StateFlow r6 = (kotlinx.coroutines.flow.StateFlow) r6
            goto L27
        L26:
            r6 = r9
        L27:
            r10 = 0
            androidx.databinding.ViewDataBindingKtx.a(r1, r10, r6)
            if (r6 == 0) goto L34
            java.lang.Object r6 = r6.getValue()
            au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorContract$ViewState r6 = (au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorContract.ViewState) r6
            goto L35
        L34:
            r6 = r9
        L35:
            if (r6 == 0) goto L3a
            au.com.woolworths.feature.shop.myorders.details.models.OnMyWayPreferences r6 = r6.f7783a
            goto L3b
        L3a:
            r6 = r9
        L3b:
            if (r6 == 0) goto L7e
            java.lang.String r9 = r6.e
            au.com.woolworths.base.shopapp.modules.button.ButtonApiData r10 = r6.i
            java.util.List r11 = r6.f
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = kotlin.collections.CollectionsKt.s(r11, r13)
            r12.<init>(r13)
            java.util.Iterator r11 = r11.iterator()
        L54:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L75
            java.lang.Object r13 = r11.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = r6.g
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r13)
            r15.append(r14)
            java.lang.String r13 = r15.toString()
            r12.add(r13)
            goto L54
        L75:
            java.lang.String r6 = r6.d
            r16 = r10
            r10 = r6
            r6 = r9
            r9 = r16
            goto L81
        L7e:
            r6 = r9
            r10 = r6
            r12 = r10
        L81:
            if (r8 == 0) goto L97
            au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding r8 = r1.y
            r8.L(r9)
            au.com.woolworths.views.horizontalselector.HorizontalSelectorView r8 = r1.z
            r8.setDataSet(r12)
            android.widget.TextView r8 = r1.A
            androidx.databinding.adapters.TextViewBindingAdapter.b(r8, r6)
            android.widget.TextView r6 = r1.B
            androidx.databinding.adapters.TextViewBindingAdapter.b(r6, r10)
        L97:
            r8 = 16
            long r2 = r2 & r8
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto La5
            au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding r2 = r1.y
            au.com.woolworths.feature.shop.myorders.generated.callback.ButtonClickHandler r3 = r1.F
            r2.M(r3)
        La5:
            if (r7 == 0) goto Lac
            au.com.woolworths.views.horizontalselector.HorizontalSelectorView r2 = r1.z
            r2.setViewListener(r0)
        Lac:
            au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding r0 = r1.y
            r0.k()
            return
        Lb2:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> Lb2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.databinding.FragmentPickupEtaSelectorBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.G != 0) {
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
            this.G = 16L;
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
                this.G |= 1;
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
            this.G |= 2;
        }
        return true;
    }
}
