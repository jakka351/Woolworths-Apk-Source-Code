package au.com.woolworths.feature.rewards.account.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.rewards.account.generated.callback.OnClickListener;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsClickHandler;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsFooterData;
import au.com.woolworths.rewards.base.data.RewardsWebLink;

/* loaded from: classes3.dex */
public class EpoxyItemPreferenceDetailsFooterBindingImpl extends EpoxyItemPreferenceDetailsFooterBinding implements OnClickListener.Listener {
    public final OnClickListener C;
    public long D;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemPreferenceDetailsFooterBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(view, (Button) objArrT[2], (TextView) objArrT[1], dataBindingComponent);
        this.D = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        E(view);
        this.C = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            this.B = (RewardsPreferenceDetailsClickHandler) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(35);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.A = (PreferenceDetailsFooterData) obj;
        synchronized (this) {
            this.D |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.account.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        RewardsPreferenceDetailsClickHandler rewardsPreferenceDetailsClickHandler = this.B;
        PreferenceDetailsFooterData preferenceDetailsFooterData = this.A;
        if (rewardsPreferenceDetailsClickHandler == null || preferenceDetailsFooterData == null) {
            return;
        }
        rewardsPreferenceDetailsClickHandler.H1(preferenceDetailsFooterData.b);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        boolean z;
        RewardsWebLink rewardsWebLink;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        PreferenceDetailsFooterData preferenceDetailsFooterData = this.A;
        long j2 = 6 & j;
        boolean z2 = false;
        if (j2 != 0) {
            if (preferenceDetailsFooterData != null) {
                rewardsWebLink = preferenceDetailsFooterData.b;
                str = preferenceDetailsFooterData.f5748a;
            } else {
                str = null;
                rewardsWebLink = null;
            }
            label = rewardsWebLink != null ? rewardsWebLink.getLabel() : null;
            z = str != null;
            if (label != null) {
                z2 = true;
            }
        } else {
            str = null;
            z = false;
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.C);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, label);
            BindingAdaptersKt.o(this.y, z2);
            TextViewBindingAdapter.b(this.z, str);
            BindingAdaptersKt.o(this.z, z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
