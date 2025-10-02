package au.com.woolworths.feature.rewards.account.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.base.rewards.account.data.PreferenceToggleData;
import au.com.woolworths.feature.rewards.account.generated.callback.OnClickListener;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsClickHandler;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* loaded from: classes3.dex */
public class EpoxyItemPreferenceDetailsToggleBindingImpl extends EpoxyItemPreferenceDetailsToggleBinding implements OnClickListener.Listener {
    public final OnClickListener G;
    public long H;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemPreferenceDetailsToggleBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, null);
        super(dataBindingComponent, view, (ImageView) objArrT[1], (ConstraintLayout) objArrT[0], (SwitchMaterial) objArrT[4], (TextView) objArrT[3], (TextView) objArrT[2]);
        this.H = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        E(view);
        this.G = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            this.E = (RewardsPreferenceDetailsClickHandler) obj;
            synchronized (this) {
                this.H |= 1;
            }
            h(35);
            y();
            return true;
        }
        if (53 == i) {
            this.D = (PreferenceToggleData) obj;
            synchronized (this) {
                this.H |= 2;
            }
            h(53);
            y();
            return true;
        }
        if (131 != i) {
            return false;
        }
        this.F = (Boolean) obj;
        synchronized (this) {
            this.H |= 4;
        }
        h(131);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.account.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        RewardsPreferenceDetailsClickHandler rewardsPreferenceDetailsClickHandler = this.E;
        PreferenceToggleData preferenceToggleData = this.D;
        if (rewardsPreferenceDetailsClickHandler == null || preferenceToggleData == null) {
            return;
        }
        rewardsPreferenceDetailsClickHandler.x5(preferenceToggleData, !preferenceToggleData.getValue());
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String subtitle;
        String altText;
        boolean value;
        boolean z;
        boolean z2;
        String str2;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        PreferenceToggleData preferenceToggleData = this.D;
        Boolean bool = this.F;
        long j2 = 10 & j;
        String str3 = null;
        if (j2 != 0) {
            if (preferenceToggleData != null) {
                String title = preferenceToggleData.getTitle();
                String iconUrl = preferenceToggleData.getIconUrl();
                subtitle = preferenceToggleData.getSubtitle();
                altText = preferenceToggleData.getAltText();
                value = preferenceToggleData.getValue();
                str2 = title;
                str3 = iconUrl;
            } else {
                str2 = null;
                subtitle = null;
                altText = null;
                value = false;
            }
            z = str3 != null;
            z2 = subtitle != null;
            String str4 = str2;
            str = str3;
            str3 = str4;
        } else {
            str = null;
            subtitle = null;
            altText = null;
            value = false;
            z = false;
            z2 = false;
        }
        long j3 = j & 12;
        boolean z3 = j3 != 0 ? !ViewDataBinding.B(bool) : false;
        if (j2 != 0) {
            BindingAdaptersKt.d(this.y, str);
            BindingAdaptersKt.o(this.y, z);
            CompoundButtonBindingAdapter.a(this.A, value);
            TextViewBindingAdapter.b(this.B, subtitle);
            BindingAdaptersKt.o(this.B, z2);
            TextViewBindingAdapter.b(this.C, str3);
            if (ViewDataBinding.s >= 4) {
                this.z.setContentDescription(altText);
            }
        }
        if (j3 != 0) {
            this.z.setEnabled(z3);
            this.A.setEnabled(z3);
            this.C.setEnabled(z3);
        }
        if ((j & 8) != 0) {
            this.z.setOnClickListener(this.G);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.H = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
