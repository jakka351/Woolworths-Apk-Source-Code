package au.com.woolworths.feature.rewards.offers.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeTintableTextBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonBindingKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.android.onesite.modules.customviews.tintabletext.TintableTextData;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.offers.generated.callback.OnClickListener;
import au.com.woolworths.feature.rewards.offers.generated.callback.StatefulButtonClickHandler;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItemKt;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferActionListener;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferDataExtKt;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class EpoxyItemRewardsProductOfferTileBindingImpl extends EpoxyItemRewardsProductOfferTileBinding implements OnClickListener.Listener, StatefulButtonClickHandler.Listener {
    public static final ViewDataBinding.IncludedLayouts M;
    public final MaterialCardView G;
    public final FrameLayout H;
    public final IncludeTintableTextBinding I;
    public final OnClickListener J;
    public final StatefulButtonClickHandler K;
    public long L;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        M = includedLayouts;
        includedLayouts.a(5, new int[]{7}, new int[]{R.layout.include_tintable_text}, new String[]{"include_tintable_text"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemRewardsProductOfferTileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 8, M, null);
        super(dataBindingComponent, view, (StatefulButton) objArrT[6], (ImageView) objArrT[2], (ImageView) objArrT[1], (TextView) objArrT[4], (TextView) objArrT[3]);
        this.L = -1L;
        this.y.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArrT[0];
        this.G = materialCardView;
        materialCardView.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArrT[5];
        this.H = frameLayout;
        frameLayout.setTag(null);
        IncludeTintableTextBinding includeTintableTextBinding = (IncludeTintableTextBinding) objArrT[7];
        this.I = includeTintableTextBinding;
        if (includeTintableTextBinding != null) {
            includeTintableTextBinding.n = this;
        }
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        E(view);
        this.J = new OnClickListener(this);
        this.K = new StatefulButtonClickHandler(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 == i) {
            this.F = (RewardsOfferActionListener) obj;
            synchronized (this) {
                this.L |= 1;
            }
            h(157);
            y();
            return true;
        }
        if (175 == i) {
            this.D = (OfferViewItem) obj;
            synchronized (this) {
                this.L |= 2;
            }
            h(175);
            y();
            return true;
        }
        if (91 != i) {
            return false;
        }
        this.E = (String) obj;
        synchronized (this) {
            this.L |= 4;
        }
        h(91);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.offers.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        OfferViewItem offerViewItem = this.D;
        RewardsOfferActionListener rewardsOfferActionListener = this.F;
        if (rewardsOfferActionListener == null || offerViewItem == null) {
            return;
        }
        rewardsOfferActionListener.L4(offerViewItem.b);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        long j3;
        long j4;
        boolean z;
        int i;
        boolean z2;
        String string;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        StatefulButtonState statefulButtonStateA;
        TintableTextData tintableTextDataB;
        char c;
        boolean z3;
        boolean z4;
        char c2;
        RewardsOfferStatus rewardsOfferStatus;
        String str6;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        OfferViewItem offerViewItem = this.D;
        String str7 = this.E;
        if ((j & 14) != 0) {
            long j5 = j & 10;
            statefulButtonStateA = j5 != 0 ? OfferViewItemKt.a(offerViewItem) : null;
            RewardsOfferData rewardsOfferData = offerViewItem != null ? offerViewItem.b : null;
            if (j5 != 0) {
                tintableTextDataB = RewardsOfferDataExtKt.b(rewardsOfferData, this.h.getContext());
                j2 = 0;
                if (rewardsOfferData != null) {
                    str = rewardsOfferData.i;
                    str2 = rewardsOfferData.w;
                    j3 = 14;
                    str3 = rewardsOfferData.m;
                    str4 = rewardsOfferData.e;
                    j4 = 10;
                    rewardsOfferStatus = rewardsOfferData.n;
                    str5 = rewardsOfferData.g;
                    c2 = 0;
                    str6 = rewardsOfferData.v;
                } else {
                    j3 = 14;
                    j4 = 10;
                    c2 = 0;
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    rewardsOfferStatus = null;
                    str5 = null;
                    str6 = null;
                }
                RewardsOfferStatus rewardsOfferStatus2 = RewardsOfferStatus.NOT_ACTIVATED;
                z4 = rewardsOfferStatus != rewardsOfferStatus2 ? true : c2 == true ? 1 : 0;
                boolean z5 = rewardsOfferStatus == rewardsOfferStatus2 ? true : c2 == true ? 1 : 0;
                z3 = str6 == null ? c2 == true ? 1 : 0 : true;
                if (j5 != 0) {
                    j |= z5 ? 32L : 16L;
                }
                if (z5) {
                    i = 8;
                    c = c2;
                } else {
                    i = c2 == true ? 1 : 0;
                    c = c2;
                }
            } else {
                j2 = 0;
                j3 = 14;
                j4 = 10;
                c = 0;
                i = 0;
                z3 = false;
                z4 = false;
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                tintableTextDataB = null;
            }
            String[] strArr = {str7};
            Intrinsics.h(rewardsOfferData, "<this>");
            StringBuilder sb = new StringBuilder();
            String str8 = rewardsOfferData.i;
            if (str8 != null) {
                sb.append(str8);
            }
            String str9 = strArr[c];
            if (str9 != null) {
                sb.append(". ");
                sb.append(str9);
            }
            string = sb.toString();
            Intrinsics.g(string, "toString(...)");
            z = z3;
            z2 = z4;
        } else {
            j2 = 0;
            j3 = 14;
            j4 = 10;
            z = false;
            i = 0;
            z2 = false;
            string = null;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            statefulButtonStateA = null;
            tintableTextDataB = null;
        }
        if ((j & 8) != j2) {
            this.y.setClickHandler(this.K);
            this.G.setOnClickListener(this.J);
        }
        if ((j & j4) != j2) {
            BindingAdaptersKt.j(this.y, z2);
            this.y.setStatefulButtonState(statefulButtonStateA);
            StatefulButtonBindingKt.a(this.y, str3);
            this.I.h.setVisibility(i);
            this.I.L(tintableTextDataB);
            BindingAdaptersKt.o(this.z, z);
            BindingAdaptersKt.f(this.z, str2, null);
            ImageView imageView = this.A;
            d.z(imageView, R.drawable.ic_product_offer_image_error, imageView, str4, null);
            TextViewBindingAdapter.b(this.B, str);
            TextViewBindingAdapter.b(this.C, str5);
        }
        if ((j & j3) != j2 && ViewDataBinding.s >= 4) {
            this.B.setContentDescription(string);
        }
        this.I.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.L != 0) {
                    return true;
                }
                return this.I.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.L = 8L;
        }
        this.I.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
