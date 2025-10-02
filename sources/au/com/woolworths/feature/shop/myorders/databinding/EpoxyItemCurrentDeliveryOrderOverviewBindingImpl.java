package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentDeliveryOrderOverview;
import au.com.woolworths.feature.shop.myorders.details.models.OrderSubtitleIcon;
import au.com.woolworths.feature.shop.myorders.details.models.ProgressStepper;
import au.com.woolworths.feature.shop.myorders.details.models.StepsToolTip;
import au.com.woolworths.feature.shop.myorders.details.progressstepper.ProgressStepperContainer;
import au.com.woolworths.feature.shop.myorders.generated.callback.ButtonClickHandler;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;
import com.woolworths.R;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public class EpoxyItemCurrentDeliveryOrderOverviewBindingImpl extends EpoxyItemCurrentDeliveryOrderOverviewBinding implements ButtonClickHandler.Listener, OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts R;
    public final TextView J;
    public final TextView K;
    public final ConstraintLayout L;
    public final View M;
    public final ButtonClickHandler N;
    public final ButtonClickHandler O;
    public final OnClickListener P;
    public long Q;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(13);
        R = includedLayouts;
        includedLayouts.a(0, new int[]{11, 12}, new int[]{R.layout.epoxy_item_button, R.layout.epoxy_item_button}, new String[]{"epoxy_item_button", "epoxy_item_button"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemCurrentDeliveryOrderOverviewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 13, R, null);
        super(dataBindingComponent, view, (EpoxyItemButtonBinding) objArrT[12], (TextView) objArrT[1], (EpoxyItemButtonBinding) objArrT[11], (ImageView) objArrT[6], (ImageView) objArrT[3], (TextView) objArrT[8], (TextView) objArrT[7], (ProgressStepperContainer) objArrT[2]);
        this.Q = -1L;
        EpoxyItemButtonBinding epoxyItemButtonBinding = this.y;
        if (epoxyItemButtonBinding != null) {
            epoxyItemButtonBinding.n = this;
        }
        this.z.setTag(null);
        EpoxyItemButtonBinding epoxyItemButtonBinding2 = this.A;
        if (epoxyItemButtonBinding2 != null) {
            epoxyItemButtonBinding2.n = this;
        }
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        ((LinearLayout) objArrT[0]).setTag(null);
        TextView textView = (TextView) objArrT[10];
        this.J = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArrT[4];
        this.K = textView2;
        textView2.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[5];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
        View view2 = (View) objArrT[9];
        this.M = view2;
        view2.setTag(null);
        this.F.setTag(null);
        E(view);
        this.N = new ButtonClickHandler(this, 2);
        this.O = new ButtonClickHandler(this, 3);
        this.P = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 == i) {
            this.G = (CurrentDeliveryOrderOverview) obj;
            synchronized (this) {
                this.Q |= 4;
            }
            h(53);
            y();
            return true;
        }
        if (113 == i) {
            this.I = (Function1) obj;
            synchronized (this) {
                this.Q |= 8;
            }
            h(113);
            y();
            return true;
        }
        if (92 != i) {
            return false;
        }
        this.H = (au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler) obj;
        synchronized (this) {
            this.Q |= 16;
        }
        h(92);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        CurrentDeliveryOrderOverview currentDeliveryOrderOverview = this.G;
        Function1 function1 = this.I;
        if (function1 == null || currentDeliveryOrderOverview == null) {
            return;
        }
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.ButtonClickHandler.Listener
    public final void g(int i) {
        if (i == 2) {
            au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler buttonClickHandler = this.H;
            CurrentDeliveryOrderOverview currentDeliveryOrderOverview = this.G;
            if (buttonClickHandler == null || currentDeliveryOrderOverview == null) {
                return;
            }
            buttonClickHandler.O2(currentDeliveryOrderOverview.g);
            return;
        }
        if (i != 3) {
            return;
        }
        au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler buttonClickHandler2 = this.H;
        CurrentDeliveryOrderOverview currentDeliveryOrderOverview2 = this.G;
        if (buttonClickHandler2 == null || currentDeliveryOrderOverview2 == null) {
            return;
        }
        buttonClickHandler2.O2(currentDeliveryOrderOverview2.h);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        long j3;
        int iZ;
        boolean z;
        String str;
        ProgressStepper progressStepper;
        ButtonApiData buttonApiData;
        String str2;
        boolean z2;
        boolean z3;
        ButtonApiData buttonApiData2;
        String str3;
        String str4;
        String str5;
        boolean z4;
        OrderSubtitleIcon orderSubtitleIcon;
        StepsToolTip stepsToolTip;
        synchronized (this) {
            j = this.Q;
            this.Q = 0L;
        }
        CurrentDeliveryOrderOverview currentDeliveryOrderOverview = this.G;
        long j4 = j & 36;
        if (j4 != 0) {
            if (currentDeliveryOrderOverview != null) {
                buttonApiData2 = currentDeliveryOrderOverview.h;
                str3 = currentDeliveryOrderOverview.j;
                str4 = currentDeliveryOrderOverview.e;
                str5 = currentDeliveryOrderOverview.f;
                j2 = 0;
                stepsToolTip = currentDeliveryOrderOverview.d;
                str = currentDeliveryOrderOverview.i;
                j3 = 36;
                progressStepper = currentDeliveryOrderOverview.c;
                buttonApiData = currentDeliveryOrderOverview.g;
                orderSubtitleIcon = currentDeliveryOrderOverview.k;
            } else {
                j2 = 0;
                j3 = 36;
                orderSubtitleIcon = null;
                stepsToolTip = null;
                str = null;
                progressStepper = null;
                buttonApiData = null;
                buttonApiData2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
            }
            boolean z5 = buttonApiData2 != null;
            z = stepsToolTip != null;
            boolean z6 = buttonApiData != null;
            if (j4 != 0) {
                j |= z6 ? 128L : 64L;
            }
            str2 = progressStepper != null ? progressStepper.f7775a : null;
            iZ = ViewDataBinding.z(orderSubtitleIcon != null ? orderSubtitleIcon.d : null);
            z2 = z5;
            z3 = z6;
        } else {
            j2 = 0;
            j3 = 36;
            iZ = 0;
            z = false;
            str = null;
            progressStepper = null;
            buttonApiData = null;
            str2 = null;
            z2 = false;
            z3 = false;
            buttonApiData2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        }
        long j5 = j & j3;
        if (j5 != j2) {
            z4 = z3 ? true : z2;
        } else {
            z4 = false;
        }
        if (j5 != j2) {
            this.y.L(buttonApiData2);
            BindingAdaptersKt.o(this.y.h, z2);
            TextViewBindingAdapter.b(this.z, str2);
            this.A.L(buttonApiData);
            BindingAdaptersKt.o(this.A.h, z3);
            BindingAdaptersKt.q(this.B, iZ);
            BindingAdaptersKt.m(this.B, iZ, null);
            BindingAdaptersKt.o(this.C, z);
            BindingAdaptersKt.n(this.D, str4);
            BindingAdaptersKt.l(this.D, str4, false, null, null);
            BindingAdaptersKt.n(this.E, str3);
            BindingAdaptersKt.l(this.E, str3, false, null, null);
            BindingAdaptersKt.n(this.J, str5);
            BindingAdaptersKt.l(this.J, str5, false, null, null);
            TextViewBindingAdapter.b(this.K, str);
            BindingAdaptersKt.n(this.K, str);
            BindingAdaptersKt.o(this.M, z4);
            this.F.setProgressStepper(progressStepper);
            if (ViewDataBinding.s >= 4) {
                this.L.setContentDescription(str3);
            }
        }
        if ((j & 32) != j2) {
            this.y.M(this.O);
            this.A.M(this.N);
            this.C.setOnClickListener(this.P);
        }
        this.A.k();
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.Q != 0) {
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
            this.Q = 32L;
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
                this.Q |= 1;
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
            this.Q |= 2;
        }
        return true;
    }
}
