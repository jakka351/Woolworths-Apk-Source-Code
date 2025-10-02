package au.com.woolworths.feature.shop.more.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import au.com.woolworths.base.shopapp.modules.badge.BadgeBrandLabelType;
import au.com.woolworths.feature.shop.more.MoreClickListener;
import au.com.woolworths.feature.shop.more.data.MoreDeliveryUnlimited;
import au.com.woolworths.feature.shop.more.generated.callback.OnClickListener;
import au.com.woolworths.foundation.shop.model.deliveryunilimited.DeliveryUnlimitedStatus;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class EpoxyItemDeliveryUnlimitedBindingImpl extends EpoxyItemDeliveryUnlimitedBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts G;
    public final ConstraintLayout D;
    public final OnClickListener E;
    public long F;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        G = includedLayouts;
        includedLayouts.a(0, new int[]{3}, new int[]{R.layout.include_brand_label}, new String[]{"include_brand_label"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemDeliveryUnlimitedBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, G, null);
        super(view, (TextView) objArrT[2], (TextView) objArrT[1], dataBindingComponent, (IncludeBrandLabelBinding) objArrT[3]);
        this.F = -1L;
        this.y.setTag(null);
        IncludeBrandLabelBinding includeBrandLabelBinding = this.z;
        if (includeBrandLabelBinding != null) {
            includeBrandLabelBinding.n = this;
        }
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        E(view);
        this.E = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (37 == i) {
            this.C = (MoreClickListener) obj;
            synchronized (this) {
                this.F |= 2;
            }
            h(37);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.B = (MoreDeliveryUnlimited) obj;
        synchronized (this) {
            this.F |= 4;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.more.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        MoreClickListener moreClickListener = this.C;
        MoreDeliveryUnlimited moreDeliveryUnlimited = this.B;
        if (moreClickListener != null) {
            moreClickListener.j6(moreDeliveryUnlimited);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        BrandLabel brandLabel;
        boolean z;
        String subtitle;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        final MoreDeliveryUnlimited moreDeliveryUnlimited = this.B;
        long j2 = 12 & j;
        String str2 = null;
        if (j2 != 0) {
            if (moreDeliveryUnlimited != null) {
                String title = moreDeliveryUnlimited.getTitle();
                DeliveryUnlimitedStatus status = moreDeliveryUnlimited.getStatus();
                subtitle = moreDeliveryUnlimited.getSubtitle();
                str = title;
                str2 = status;
            } else {
                str = null;
                subtitle = null;
            }
            Intrinsics.h(moreDeliveryUnlimited, "<this>");
            brandLabel = new BrandLabel(moreDeliveryUnlimited) { // from class: au.com.woolworths.feature.shop.more.data.MoreDeliveryUnlimitedKt$toBrandLabel$1
                public final PlainText d;
                public final BrandLabelType e;

                {
                    String badge = moreDeliveryUnlimited.getBadge();
                    this.d = badge != null ? new PlainText(badge) : null;
                    this.e = BadgeBrandLabelType.k;
                }

                @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
                public final Text getText() {
                    return this.d;
                }

                @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
                /* renamed from: getType, reason: from getter */
                public final BrandLabelType getE() {
                    return this.e;
                }
            };
            z = str2 == DeliveryUnlimitedStatus.NOT_SUBSCRIBED;
            z = subtitle != null;
            str2 = subtitle;
        } else {
            str = null;
            brandLabel = null;
            z = false;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, str2);
            BindingAdaptersKt.o(this.y, z);
            this.z.L(brandLabel);
            BindingAdaptersKt.o(this.z.h, z);
            TextViewBindingAdapter.b(this.A, str);
        }
        if ((j & 8) != 0) {
            this.D.setOnClickListener(this.E);
        }
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.F != 0) {
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
            this.F = 8L;
        }
        this.z.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.F |= 1;
        }
        return true;
    }
}
