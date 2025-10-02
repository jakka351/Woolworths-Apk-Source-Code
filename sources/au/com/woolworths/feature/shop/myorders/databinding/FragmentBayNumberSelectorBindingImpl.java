package au.com.woolworths.feature.shop.myorders.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorContract;
import au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorViewModel;
import au.com.woolworths.feature.shop.myorders.details.baynumber.analytics.BayNumberSelectorActions;
import au.com.woolworths.feature.shop.myorders.details.models.BayNumberPreferences;
import au.com.woolworths.feature.shop.myorders.generated.callback.ButtonClickHandler;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorView;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class FragmentBayNumberSelectorBindingImpl extends FragmentBayNumberSelectorBinding implements ButtonClickHandler.Listener {
    public static final ViewDataBinding.IncludedLayouts K;
    public static final SparseIntArray L;
    public final ButtonClickHandler H;
    public final ButtonClickHandler I;
    public long J;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        K = includedLayouts;
        includedLayouts.a(0, new int[]{4, 5}, new int[]{R.layout.epoxy_item_button, R.layout.epoxy_item_button}, new String[]{"epoxy_item_button", "epoxy_item_button"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.begin_guide_line, 6);
        sparseIntArray.put(R.id.end_guide_line, 7);
        sparseIntArray.put(R.id.grab_handle_image_view, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentBayNumberSelectorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 9, K, L);
        EpoxyItemButtonBinding epoxyItemButtonBinding = (EpoxyItemButtonBinding) objArrT[4];
        EpoxyItemButtonBinding epoxyItemButtonBinding2 = (EpoxyItemButtonBinding) objArrT[5];
        super(dataBindingComponent, view, epoxyItemButtonBinding, epoxyItemButtonBinding2, (HorizontalSelectorView) objArrT[3], (TextView) objArrT[2], (TextView) objArrT[1]);
        this.J = -1L;
        EpoxyItemButtonBinding epoxyItemButtonBinding3 = this.y;
        if (epoxyItemButtonBinding3 != null) {
            epoxyItemButtonBinding3.n = this;
        }
        EpoxyItemButtonBinding epoxyItemButtonBinding4 = this.z;
        if (epoxyItemButtonBinding4 != null) {
            epoxyItemButtonBinding4.n = this;
        }
        this.A.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        E(view);
        this.H = new ButtonClickHandler(this, 2);
        this.I = new ButtonClickHandler(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (272 == i) {
            M((HorizontalSelectorViewListener) obj);
            return true;
        }
        if (273 == i) {
            N((BayNumberSelectorViewModel) obj);
            return true;
        }
        if (53 != i) {
            return false;
        }
        L((BayNumberPreferences) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.FragmentBayNumberSelectorBinding
    public final void L(BayNumberPreferences bayNumberPreferences) throws Throwable {
        this.F = bayNumberPreferences;
        synchronized (this) {
            this.J |= 32;
        }
        h(53);
        y();
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.FragmentBayNumberSelectorBinding
    public final void M(HorizontalSelectorViewListener horizontalSelectorViewListener) throws Throwable {
        this.D = horizontalSelectorViewListener;
        synchronized (this) {
            this.J |= 8;
        }
        h(272);
        y();
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.FragmentBayNumberSelectorBinding
    public final void N(BayNumberSelectorViewModel bayNumberSelectorViewModel) throws Throwable {
        this.E = bayNumberSelectorViewModel;
        synchronized (this) {
            this.J |= 16;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.ButtonClickHandler.Listener
    public final void g(int i) {
        BayNumberSelectorViewModel bayNumberSelectorViewModel;
        if (i == 1) {
            BayNumberSelectorViewModel bayNumberSelectorViewModel2 = this.E;
            if (bayNumberSelectorViewModel2 != null) {
                bayNumberSelectorViewModel2.p6();
                return;
            }
            return;
        }
        if (i == 2 && (bayNumberSelectorViewModel = this.E) != null) {
            AnalyticsManager analyticsManager = bayNumberSelectorViewModel.e;
            Screen screen = bayNumberSelectorViewModel.k;
            if (screen == null) {
                Intrinsics.p("hostScreen");
                throw null;
            }
            analyticsManager.c(new BayNumberSelectorActions.NoBayNumber(screen));
            bayNumberSelectorViewModel.f.f(BayNumberSelectorContract.Actions.DontKnowBayNumber.f7687a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r15 = this;
            monitor-enter(r15)
            long r0 = r15.J     // Catch: java.lang.Throwable -> L99
            r2 = 0
            r15.J = r2     // Catch: java.lang.Throwable -> L99
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L99
            au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener r4 = r15.D
            au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorViewModel r5 = r15.E
            au.com.woolworths.feature.shop.myorders.details.models.BayNumberPreferences r6 = r15.F
            r7 = 72
            long r7 = r7 & r0
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r8 = 81
            long r8 = r8 & r0
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r9 = 0
            if (r8 == 0) goto L46
            if (r5 == 0) goto L26
            kotlin.Lazy r5 = r5.i
            java.lang.Object r5 = r5.getD()
            kotlinx.coroutines.flow.StateFlow r5 = (kotlinx.coroutines.flow.StateFlow) r5
            goto L27
        L26:
            r5 = r9
        L27:
            r10 = 0
            androidx.databinding.ViewDataBindingKtx.a(r15, r10, r5)
            if (r5 == 0) goto L34
            java.lang.Object r5 = r5.getValue()
            au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorContract$ViewState r5 = (au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorContract.ViewState) r5
            goto L35
        L34:
            r5 = r9
        L35:
            if (r5 == 0) goto L3a
            au.com.woolworths.feature.shop.myorders.details.models.BayNumberPreferences r5 = r5.f7688a
            goto L3b
        L3a:
            r5 = r9
        L3b:
            if (r5 == 0) goto L46
            java.lang.String r10 = r5.d
            java.lang.String r11 = r5.e
            au.com.woolworths.base.shopapp.modules.button.ButtonApiData r12 = r5.g
            au.com.woolworths.base.shopapp.modules.button.ButtonApiData r5 = r5.h
            goto L4a
        L46:
            r5 = r9
            r10 = r5
            r11 = r10
            r12 = r11
        L4a:
            r13 = 96
            long r13 = r13 & r0
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L55
            if (r6 == 0) goto L55
            java.util.List r9 = r6.f
        L55:
            if (r8 == 0) goto L6b
            au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding r6 = r15.y
            r6.L(r12)
            au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding r6 = r15.z
            r6.L(r5)
            android.widget.TextView r5 = r15.B
            androidx.databinding.adapters.TextViewBindingAdapter.b(r5, r11)
            android.widget.TextView r5 = r15.C
            androidx.databinding.adapters.TextViewBindingAdapter.b(r5, r10)
        L6b:
            r5 = 64
            long r0 = r0 & r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L80
            au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding r0 = r15.y
            au.com.woolworths.feature.shop.myorders.generated.callback.ButtonClickHandler r1 = r15.I
            r0.M(r1)
            au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding r0 = r15.z
            au.com.woolworths.feature.shop.myorders.generated.callback.ButtonClickHandler r1 = r15.H
            r0.M(r1)
        L80:
            if (r13 == 0) goto L87
            au.com.woolworths.views.horizontalselector.HorizontalSelectorView r0 = r15.A
            r0.setDataSet(r9)
        L87:
            if (r7 == 0) goto L8e
            au.com.woolworths.views.horizontalselector.HorizontalSelectorView r0 = r15.A
            r0.setViewListener(r4)
        L8e:
            au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding r0 = r15.y
            r0.k()
            au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding r0 = r15.z
            r0.k()
            return
        L99:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L99
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.databinding.FragmentBayNumberSelectorBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.J != 0) {
                    return true;
                }
                return this.y.p() || this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.J = 64L;
        }
        this.y.r();
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
                this.J |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.J |= 2;
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
            this.J |= 4;
        }
        return true;
    }
}
