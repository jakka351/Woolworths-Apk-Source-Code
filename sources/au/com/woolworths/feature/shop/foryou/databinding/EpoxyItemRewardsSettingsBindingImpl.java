package au.com.woolworths.feature.shop.foryou.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.foryou.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsContract;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsOption;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class EpoxyItemRewardsSettingsBindingImpl extends EpoxyItemRewardsSettingsBinding implements OnClickListener.Listener {
    public final TextView A;
    public final OnClickListener B;
    public long C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemRewardsSettingsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
        this.C = -1L;
        TextView textView = (TextView) objArrT[0];
        this.A = textView;
        textView.setTag(null);
        E(view);
        this.B = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 == i) {
            this.z = (RewardsSettingsViewModel) obj;
            synchronized (this) {
                this.C |= 1;
            }
            h(273);
            y();
            return true;
        }
        if (185 != i) {
            return false;
        }
        this.y = (RewardsSettingsOption) obj;
        synchronized (this) {
            this.C |= 2;
        }
        h(185);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.foryou.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        RewardsSettingsViewModel rewardsSettingsViewModel = this.z;
        RewardsSettingsOption rewardsSettingsOption = this.y;
        if (rewardsSettingsViewModel == null || rewardsSettingsOption == null) {
            return;
        }
        RewardsSettingsContract.Actions action = rewardsSettingsOption.getAction();
        Intrinsics.h(action, "action");
        rewardsSettingsViewModel.h.f(action);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int iC;
        int g;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        RewardsSettingsOption rewardsSettingsOption = this.y;
        long j2 = 6 & j;
        if (j2 == 0 || rewardsSettingsOption == null) {
            iC = 0;
            g = 0;
        } else {
            iC = rewardsSettingsOption.c(this.h.getContext());
            g = rewardsSettingsOption.getG();
        }
        if ((j & 4) != 0) {
            this.A.setOnClickListener(this.B);
        }
        if (j2 != 0) {
            this.A.setText(g);
            this.A.setTextColor(iC);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.C = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
