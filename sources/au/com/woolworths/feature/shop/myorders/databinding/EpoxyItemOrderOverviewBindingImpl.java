package au.com.woolworths.feature.shop.myorders.databinding;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler;
import au.com.woolworths.feature.shop.myorders.details.models.OrderDetailSummary;
import au.com.woolworths.feature.shop.myorders.details.models.OrderDetailsStatusData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderOverview;
import au.com.woolworths.feature.shop.myorders.details.models.OrderStatusTypeData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderTimeData;
import au.com.woolworths.feature.shop.myorders.generated.callback.ButtonClickHandler;
import au.com.woolworths.feature.shop.myorders.generated.callback.LinkHandler;
import com.google.android.material.textview.MaterialTextView;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemOrderOverviewBindingImpl extends EpoxyItemOrderOverviewBinding implements ButtonClickHandler.Listener, LinkHandler.Listener {
    public static final ViewDataBinding.IncludedLayouts T;
    public final ButtonClickHandler O;
    public final ButtonClickHandler P;
    public final ButtonClickHandler Q;
    public final LinkHandler R;
    public long S;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        T = includedLayouts;
        includedLayouts.a(0, new int[]{10, 11, 12, 13}, new int[]{R.layout.include_inset_banner, R.layout.epoxy_item_button, R.layout.epoxy_item_button, R.layout.epoxy_item_button}, new String[]{"include_inset_banner", "epoxy_item_button", "epoxy_item_button", "epoxy_item_button"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemOrderOverviewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 14, T, null);
        super(dataBindingComponent, view, (EpoxyItemButtonBinding) objArrT[12], (EpoxyItemButtonBinding) objArrT[11], (TextView) objArrT[9], (IncludeInsetBannerBinding) objArrT[10], (TextView) objArrT[7], (ConstraintLayout) objArrT[5], (MaterialTextView) objArrT[1], (TextView) objArrT[6], (ConstraintLayout) objArrT[2], (TextView) objArrT[8], (TextView) objArrT[3], (EpoxyItemButtonBinding) objArrT[13], (TextView) objArrT[4]);
        this.S = -1L;
        EpoxyItemButtonBinding epoxyItemButtonBinding = this.y;
        if (epoxyItemButtonBinding != null) {
            epoxyItemButtonBinding.n = this;
        }
        EpoxyItemButtonBinding epoxyItemButtonBinding2 = this.z;
        if (epoxyItemButtonBinding2 != null) {
            epoxyItemButtonBinding2.n = this;
        }
        this.A.setTag(null);
        IncludeInsetBannerBinding includeInsetBannerBinding = this.B;
        if (includeInsetBannerBinding != null) {
            includeInsetBannerBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        EpoxyItemButtonBinding epoxyItemButtonBinding3 = this.J;
        if (epoxyItemButtonBinding3 != null) {
            epoxyItemButtonBinding3.n = this;
        }
        this.K.setTag(null);
        E(view);
        this.O = new ButtonClickHandler(this, 3);
        this.P = new ButtonClickHandler(this, 2);
        this.Q = new ButtonClickHandler(this, 1);
        this.R = new LinkHandler(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (153 == i) {
            this.N = (OrderDetailsClickHandler) obj;
            synchronized (this) {
                this.S |= 16;
            }
            h(153);
            y();
            return true;
        }
        if (92 == i) {
            this.M = (au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler) obj;
            synchronized (this) {
                this.S |= 32;
            }
            h(92);
            y();
            return true;
        }
        if (189 != i) {
            return false;
        }
        this.L = (OrderOverview) obj;
        synchronized (this) {
            this.S |= 64;
        }
        h(189);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.ButtonClickHandler.Listener
    public final void g(int i) {
        if (i == 1) {
            au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler buttonClickHandler = this.M;
            OrderOverview orderOverview = this.L;
            if (buttonClickHandler == null || orderOverview == null) {
                return;
            }
            buttonClickHandler.O2(orderOverview.e);
            return;
        }
        if (i == 2) {
            au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler buttonClickHandler2 = this.M;
            OrderOverview orderOverview2 = this.L;
            if (buttonClickHandler2 == null || orderOverview2 == null) {
                return;
            }
            buttonClickHandler2.O2(orderOverview2.f);
            return;
        }
        if (i != 3) {
            return;
        }
        au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler buttonClickHandler3 = this.M;
        OrderOverview orderOverview3 = this.L;
        if (buttonClickHandler3 == null || orderOverview3 == null) {
            return;
        }
        buttonClickHandler3.O2(orderOverview3.g);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        long j2;
        long j3;
        long j4;
        char c;
        long j5;
        ButtonApiData buttonApiData;
        CharSequence charSequence;
        Drawable drawable;
        boolean z;
        boolean z2;
        ButtonApiData buttonApiData2;
        boolean z3;
        boolean z4;
        OrderDetailsStatusData orderDetailsStatusData;
        String str;
        boolean z5;
        String str2;
        boolean z6;
        OrderStatusTypeData orderStatusTypeData;
        String str3;
        InsetBannerApiData insetBannerApiData;
        String str4;
        ButtonApiData buttonApiData3;
        String str5;
        String str6;
        boolean z7;
        boolean z8;
        boolean z9;
        InsetBannerData insetBannerData;
        InsetBannerApiData insetBannerApiData2;
        ButtonApiData buttonApiData4;
        ButtonApiData buttonApiData5;
        OrderTimeData orderTimeData;
        OrderDetailsStatusData orderDetailsStatusData2;
        String str7;
        String str8;
        OrderDetailSummary orderDetailSummary;
        ButtonApiData buttonApiData6;
        String str9;
        String str10;
        String str11;
        String str12;
        OrderStatusTypeData orderStatusTypeData2;
        PlainText plainText;
        synchronized (this) {
            j = this.S;
            this.S = 0L;
        }
        OrderOverview orderOverview = this.L;
        long j6 = j & 192;
        if (j6 != 0) {
            if (orderOverview != null) {
                orderDetailSummary = orderOverview.d;
                buttonApiData6 = orderOverview.e;
                j2 = 0;
                buttonApiData4 = orderOverview.f;
                buttonApiData5 = orderOverview.g;
                j3 = 192;
                orderTimeData = orderOverview.c;
                orderDetailsStatusData2 = orderOverview.b;
                j4 = 512;
                str7 = orderOverview.h;
                str8 = orderOverview.i;
                insetBannerApiData2 = orderOverview.f7767a;
            } else {
                j2 = 0;
                j3 = 192;
                j4 = 512;
                insetBannerApiData2 = null;
                buttonApiData4 = null;
                buttonApiData5 = null;
                orderTimeData = null;
                orderDetailsStatusData2 = null;
                str7 = null;
                str8 = null;
                orderDetailSummary = null;
                buttonApiData6 = null;
            }
            boolean z10 = orderDetailSummary != null;
            boolean z11 = buttonApiData6 != null;
            boolean z12 = buttonApiData4 != null;
            boolean z13 = buttonApiData5 != null;
            boolean z14 = orderTimeData != null;
            boolean z15 = str7 != null;
            boolean z16 = str8 != null;
            boolean z17 = insetBannerApiData2 != null;
            if (j6 != 0) {
                j = z17 ? j | j4 : j | 256;
            }
            if (orderDetailSummary != null) {
                str9 = orderDetailSummary.d;
                str10 = orderDetailSummary.e;
            } else {
                str9 = null;
                str10 = null;
            }
            c = 1;
            if (orderTimeData != null) {
                str12 = orderTimeData.b;
                str11 = orderTimeData.f7771a;
            } else {
                str11 = null;
                str12 = null;
            }
            if (orderDetailsStatusData2 != null) {
                orderStatusTypeData2 = orderDetailsStatusData2.d;
                plainText = orderDetailsStatusData2.f;
            } else {
                orderStatusTypeData2 = null;
                plainText = null;
            }
            InsetBannerApiData insetBannerApiData3 = insetBannerApiData2;
            Drawable drawableA = orderStatusTypeData2 != null ? orderStatusTypeData2.a(this.h.getContext()) : null;
            if (plainText != null) {
                CharSequence text = plainText.getText(this.h.getContext());
                z6 = z12;
                z8 = z13;
                str4 = str12;
                z5 = z16;
                str6 = str7;
                orderDetailsStatusData = orderDetailsStatusData2;
                z3 = z14;
                buttonApiData3 = buttonApiData5;
                z2 = z11;
                j5 = j;
                drawable = drawableA;
                charSequence = text;
                buttonApiData = buttonApiData6;
                str3 = str10;
                orderStatusTypeData = orderStatusTypeData2;
                str2 = str8;
                str = str9;
                z4 = z17;
                z7 = z15;
            } else {
                buttonApiData = buttonApiData6;
                z6 = z12;
                z8 = z13;
                str4 = str12;
                str3 = str10;
                z5 = z16;
                str6 = str7;
                orderStatusTypeData = orderStatusTypeData2;
                orderDetailsStatusData = orderDetailsStatusData2;
                str2 = str8;
                z3 = z14;
                buttonApiData3 = buttonApiData5;
                str = str9;
                z2 = z11;
                z4 = z17;
                j5 = j;
                z7 = z15;
                drawable = drawableA;
                charSequence = null;
            }
            str5 = str11;
            buttonApiData2 = buttonApiData4;
            z = z10;
            insetBannerApiData = insetBannerApiData3;
        } else {
            j2 = 0;
            j3 = 192;
            j4 = 512;
            c = 1;
            j5 = j;
            buttonApiData = null;
            charSequence = null;
            drawable = null;
            z = false;
            z2 = false;
            buttonApiData2 = null;
            z3 = false;
            z4 = false;
            orderDetailsStatusData = null;
            str = null;
            z5 = false;
            str2 = null;
            z6 = false;
            orderStatusTypeData = null;
            str3 = null;
            insetBannerApiData = null;
            str4 = null;
            buttonApiData3 = null;
            str5 = null;
            str6 = null;
            z7 = false;
            z8 = false;
        }
        InsetBannerData uiModel = (j5 & j4) != j2 ? InsetBannerApiDataExtKt.toUiModel(insetBannerApiData) : null;
        long j7 = j5 & j3;
        if (j7 != j2) {
            if (!z4) {
                uiModel = null;
            }
            z9 = z3;
            insetBannerData = uiModel;
        } else {
            z9 = z3;
            insetBannerData = null;
        }
        if (j7 != j2) {
            String str13 = str;
            this.y.L(buttonApiData2);
            BindingAdaptersKt.o(this.y.h, z6);
            this.z.L(buttonApiData);
            BindingAdaptersKt.o(this.z.h, z2);
            BindingAdaptersKt.o(this.A, z5);
            BindingAdaptersKt.l(this.A, str2, false, this.R, null);
            this.B.L(insetBannerData);
            BindingAdaptersKt.o(this.B.h, z4);
            TextViewBindingAdapter.b(this.C, str3);
            BindingAdaptersKt.o(this.D, z);
            MaterialTextView materialTextView = this.E;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
            Drawable[] compoundDrawablesRelative = materialTextView.getCompoundDrawablesRelative();
            materialTextView.setCompoundDrawablesRelative(drawable, compoundDrawablesRelative[c], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
            BrandLabelKt.b(this.E, orderDetailsStatusData);
            TextViewBindingAdapter.b(this.E, charSequence);
            BrandLabelKt.a(this.E, orderStatusTypeData);
            BrandLabelKt.c(this.E, orderDetailsStatusData);
            TextViewBindingAdapter.b(this.F, str13);
            BindingAdaptersKt.o(this.G, z9);
            BindingAdaptersKt.o(this.H, z7);
            BindingAdaptersKt.l(this.H, str6, false, null, null);
            TextViewBindingAdapter.b(this.I, str5);
            this.J.L(buttonApiData3);
            BindingAdaptersKt.o(this.J.h, z8);
            TextViewBindingAdapter.b(this.K, str4);
        }
        if ((j5 & 128) != j2) {
            this.y.M(this.P);
            this.z.M(this.Q);
            this.J.M(this.O);
        }
        this.B.k();
        this.z.k();
        this.y.k();
        this.J.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.S != 0) {
                    return true;
                }
                return this.B.p() || this.z.p() || this.y.p() || this.J.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.S = 128L;
        }
        this.B.r();
        this.z.r();
        this.y.r();
        this.J.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.S |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.S |= 2;
            }
            return true;
        }
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.S |= 4;
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.S |= 8;
        }
        return true;
    }
}
