package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.android.onesite.handlers.LinkHandler;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentPickupOrderOverview;
import au.com.woolworths.feature.shop.myorders.details.models.ui.PickUpInstructionsClickHandler;
import au.com.woolworths.feature.shop.myorders.generated.callback.ButtonClickHandler;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import com.woolworths.R;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public class EpoxyItemCurrentPickupOrderOverviewBindingImpl extends EpoxyItemCurrentPickupOrderOverviewBinding implements ButtonClickHandler.Listener {
    public static final ViewDataBinding.IncludedLayouts W;
    public final ButtonClickHandler R;
    public final ButtonClickHandler S;
    public final ButtonClickHandler T;
    public final ButtonClickHandler U;
    public long V;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        W = includedLayouts;
        includedLayouts.a(0, new int[]{8, 13}, new int[]{R.layout.layout_order_progress, R.layout.include_inset_banner}, new String[]{"layout_order_progress", "include_inset_banner"});
        includedLayouts.a(6, new int[]{9, 10, 11, 12}, new int[]{R.layout.epoxy_item_button, R.layout.epoxy_item_button, R.layout.epoxy_item_button, R.layout.epoxy_item_button}, new String[]{"epoxy_item_button", "epoxy_item_button", "epoxy_item_button", "epoxy_item_button"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemCurrentPickupOrderOverviewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 14, W, null);
        super(dataBindingComponent, view, (LinearLayout) objArrT[6], (EpoxyItemButtonBinding) objArrT[10], (EpoxyItemButtonBinding) objArrT[9], (EpoxyItemButtonBinding) objArrT[12], (EpoxyItemButtonBinding) objArrT[11], (TextView) objArrT[7], (IncludeInsetBannerBinding) objArrT[13], (TextView) objArrT[4], (LayoutOrderProgressBinding) objArrT[8], (TextView) objArrT[2], (ImageView) objArrT[3], (TextView) objArrT[1], (ComposeView) objArrT[5]);
        this.V = -1L;
        this.y.setTag(null);
        EpoxyItemButtonBinding epoxyItemButtonBinding = this.z;
        if (epoxyItemButtonBinding != null) {
            epoxyItemButtonBinding.n = this;
        }
        EpoxyItemButtonBinding epoxyItemButtonBinding2 = this.A;
        if (epoxyItemButtonBinding2 != null) {
            epoxyItemButtonBinding2.n = this;
        }
        EpoxyItemButtonBinding epoxyItemButtonBinding3 = this.B;
        if (epoxyItemButtonBinding3 != null) {
            epoxyItemButtonBinding3.n = this;
        }
        EpoxyItemButtonBinding epoxyItemButtonBinding4 = this.C;
        if (epoxyItemButtonBinding4 != null) {
            epoxyItemButtonBinding4.n = this;
        }
        this.D.setTag(null);
        IncludeInsetBannerBinding includeInsetBannerBinding = this.E;
        if (includeInsetBannerBinding != null) {
            includeInsetBannerBinding.n = this;
        }
        this.F.setTag(null);
        LayoutOrderProgressBinding layoutOrderProgressBinding = this.G;
        if (layoutOrderProgressBinding != null) {
            layoutOrderProgressBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        E(view);
        this.R = new ButtonClickHandler(this, 1);
        this.S = new ButtonClickHandler(this, 4);
        this.T = new ButtonClickHandler(this, 2);
        this.U = new ButtonClickHandler(this, 3);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (198 == i) {
            this.O = (PickUpInstructionsClickHandler) obj;
            synchronized (this) {
                this.V |= 64;
            }
            h(198);
            y();
            return true;
        }
        if (53 == i) {
            this.L = (CurrentPickupOrderOverview) obj;
            synchronized (this) {
                this.V |= 128;
            }
            h(53);
            y();
            return true;
        }
        if (153 == i) {
            this.M = (LinkHandler) obj;
            synchronized (this) {
                this.V |= 256;
            }
            h(153);
            y();
            return true;
        }
        if (113 == i) {
            this.P = (Function1) obj;
            synchronized (this) {
                this.V |= 512;
            }
            h(113);
            y();
            return true;
        }
        if (92 == i) {
            this.N = (au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler) obj;
            synchronized (this) {
                this.V |= llqqqql.c00630063c0063c0063;
            }
            h(92);
            y();
            return true;
        }
        if (243 != i) {
            return false;
        }
        this.Q = (Boolean) obj;
        synchronized (this) {
            this.V |= llqqqql.ccc00630063c0063;
        }
        h(243);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.ButtonClickHandler.Listener
    public final void g(int i) {
        ButtonApiData buttonApiData;
        if (i == 1) {
            au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler buttonClickHandler = this.N;
            CurrentPickupOrderOverview currentPickupOrderOverview = this.L;
            if (buttonClickHandler == null || currentPickupOrderOverview == null) {
                return;
            }
            buttonClickHandler.O2(currentPickupOrderOverview.g);
            return;
        }
        if (i == 2) {
            au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler buttonClickHandler2 = this.N;
            CurrentPickupOrderOverview currentPickupOrderOverview2 = this.L;
            if (buttonClickHandler2 == null || currentPickupOrderOverview2 == null) {
                return;
            }
            buttonClickHandler2.O2(currentPickupOrderOverview2.h);
            return;
        }
        if (i == 3) {
            PickUpInstructionsClickHandler pickUpInstructionsClickHandler = this.O;
            CurrentPickupOrderOverview currentPickupOrderOverview3 = this.L;
            if (pickUpInstructionsClickHandler == null || currentPickupOrderOverview3 == null || (buttonApiData = currentPickupOrderOverview3.m) == null) {
                return;
            }
            pickUpInstructionsClickHandler.a5(buttonApiData.getAction(), currentPickupOrderOverview3.n, currentPickupOrderOverview3.o, currentPickupOrderOverview3.p);
            return;
        }
        if (i != 4) {
            return;
        }
        PickUpInstructionsClickHandler pickUpInstructionsClickHandler2 = this.O;
        CurrentPickupOrderOverview currentPickupOrderOverview4 = this.L;
        if (pickUpInstructionsClickHandler2 == null || currentPickupOrderOverview4 == null) {
            return;
        }
        pickUpInstructionsClickHandler2.n1(currentPickupOrderOverview4.l);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e2  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 835
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemCurrentPickupOrderOverviewBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.V != 0) {
                    return true;
                }
                return this.G.p() || this.A.p() || this.z.p() || this.C.p() || this.B.p() || this.E.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.V = 4096L;
        }
        this.G.r();
        this.A.r();
        this.z.r();
        this.C.r();
        this.B.r();
        this.E.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.V |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.V |= 2;
            }
            return true;
        }
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.V |= 4;
            }
            return true;
        }
        if (i == 3) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.V |= 8;
            }
            return true;
        }
        if (i == 4) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.V |= 16;
            }
            return true;
        }
        if (i != 5) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 32;
        }
        return true;
    }
}
