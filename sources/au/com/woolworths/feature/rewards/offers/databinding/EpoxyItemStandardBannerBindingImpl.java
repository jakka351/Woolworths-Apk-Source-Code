package au.com.woolworths.feature.rewards.offers.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.rewards.offers.StandardBannerViewItem;
import au.com.woolworths.feature.rewards.offers.generated.callback.OnClickListener;
import com.google.android.material.card.MaterialCardView;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public class EpoxyItemStandardBannerBindingImpl extends EpoxyItemStandardBannerBinding implements OnClickListener.Listener {
    public final MaterialCardView E;
    public final OnClickListener F;
    public long G;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemStandardBannerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, null);
        super(view, (ImageView) objArrT[1], (TextView) objArrT[3], (TextView) objArrT[4], (TextView) objArrT[2], dataBindingComponent);
        this.G = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArrT[0];
        this.E = materialCardView;
        materialCardView.setTag(null);
        this.B.setTag(null);
        E(view);
        this.F = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (11 == i) {
            this.C = (StandardBannerViewItem) obj;
            synchronized (this) {
                this.G |= 1;
            }
            h(11);
            y();
            return true;
        }
        if (177 != i) {
            return false;
        }
        this.D = (Function1) obj;
        synchronized (this) {
            this.G |= 2;
        }
        h(177);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.offers.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        StandardBannerViewItem standardBannerViewItem = this.C;
        Function1 function1 = this.D;
        if (function1 != null) {
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        StandardBannerViewItem standardBannerViewItem = this.C;
        long j2 = 5 & j;
        if (j2 != 0) {
            if (standardBannerViewItem != null) {
                str5 = standardBannerViewItem.e;
                str6 = standardBannerViewItem.g;
                str7 = standardBannerViewItem.c;
                str = standardBannerViewItem.d;
            } else {
                str = null;
                str5 = null;
                str6 = null;
                str7 = null;
            }
            boolean z2 = str5 != null;
            z = str6 != null;
            str4 = str7;
            str3 = str6;
            str2 = str5;
            z = z;
            z = z2;
        } else {
            z = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, str2);
            BindingAdaptersKt.o(this.y, z);
            TextViewBindingAdapter.b(this.z, str3);
            BindingAdaptersKt.o(this.z, z);
            BindingAdaptersKt.f(this.A, str, null);
            TextViewBindingAdapter.b(this.B, str4);
        }
        if ((j & 4) != 0) {
            this.E.setOnClickListener(this.F);
        }
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
            this.G = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
