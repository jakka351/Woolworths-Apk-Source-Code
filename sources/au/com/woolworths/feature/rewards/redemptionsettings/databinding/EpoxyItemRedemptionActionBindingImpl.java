package au.com.woolworths.feature.rewards.redemptionsettings.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.rewards.redemptionsettings.RedemptionItemClickListener;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionAction;
import au.com.woolworths.feature.rewards.redemptionsettings.generated.callback.OnClickListener;

/* loaded from: classes3.dex */
public class EpoxyItemRedemptionActionBindingImpl extends EpoxyItemRedemptionActionBinding implements OnClickListener.Listener {
    public final ConstraintLayout D;
    public final OnClickListener E;
    public long F;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemRedemptionActionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
        super(view, (ImageView) objArrT[1], (TextView) objArrT[3], (TextView) objArrT[2], dataBindingComponent);
        this.F = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        E(view);
        this.E = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (37 == i) {
            this.C = (RedemptionItemClickListener) obj;
            synchronized (this) {
                this.F |= 1;
            }
            h(37);
            y();
            return true;
        }
        if (1 != i) {
            return false;
        }
        this.B = (RewardsRedemptionAction) obj;
        synchronized (this) {
            this.F |= 2;
        }
        h(1);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.redemptionsettings.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        RedemptionItemClickListener redemptionItemClickListener = this.C;
        RewardsRedemptionAction rewardsRedemptionAction = this.B;
        if (redemptionItemClickListener != null) {
            redemptionItemClickListener.X4(rewardsRedemptionAction);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String iconUrl;
        String title;
        String body;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        RewardsRedemptionAction rewardsRedemptionAction = this.B;
        long j2 = 6 & j;
        if (j2 == 0 || rewardsRedemptionAction == null) {
            iconUrl = null;
            title = null;
            body = null;
        } else {
            title = rewardsRedemptionAction.getTitle();
            body = rewardsRedemptionAction.getBody();
            iconUrl = rewardsRedemptionAction.getIconUrl();
        }
        if ((j & 4) != 0) {
            this.D.setOnClickListener(this.E);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, body);
            BindingAdaptersKt.f(this.z, iconUrl, null);
            TextViewBindingAdapter.b(this.A, title);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
