package au.com.woolworths.rewards.base.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.rewards.base.RewardsEmptyStateClickHandler;
import au.com.woolworths.rewards.base.data.EmptyStateButtonData;
import au.com.woolworths.rewards.base.data.RewardsEmptyStateData;
import au.com.woolworths.rewards.base.generated.callback.OnClickListener;

/* loaded from: classes4.dex */
public class EpoxyIncludeRewardsEmptyStateBindingImpl extends EpoxyIncludeRewardsEmptyStateBinding implements OnClickListener.Listener {
    public final OnClickListener F;
    public long G;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyIncludeRewardsEmptyStateBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, null);
        super(dataBindingComponent, view, (Button) objArrT[5], (ImageView) objArrT[2], (ImageView) objArrT[1], (TextView) objArrT[4], (TextView) objArrT[3]);
        this.G = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        E(view);
        this.F = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            this.E = (RewardsEmptyStateClickHandler) obj;
            synchronized (this) {
                this.G |= 1;
            }
            h(35);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.D = (RewardsEmptyStateData) obj;
        synchronized (this) {
            this.G |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.rewards.base.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        EmptyStateButtonData button;
        RewardsEmptyStateClickHandler rewardsEmptyStateClickHandler = this.E;
        RewardsEmptyStateData rewardsEmptyStateData = this.D;
        if (rewardsEmptyStateClickHandler == null || rewardsEmptyStateData == null || (button = rewardsEmptyStateData.getButton()) == null) {
            return;
        }
        button.getUrl();
        rewardsEmptyStateClickHandler.a();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int icon;
        boolean z;
        String title;
        String iconUrl;
        String message;
        String title2;
        EmptyStateButtonData button;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        RewardsEmptyStateData rewardsEmptyStateData = this.D;
        long j2 = 6 & j;
        if (j2 != 0) {
            if (rewardsEmptyStateData != null) {
                title = rewardsEmptyStateData.getTitle();
                iconUrl = rewardsEmptyStateData.getIconUrl();
                message = rewardsEmptyStateData.getMessage();
                button = rewardsEmptyStateData.getButton();
                icon = rewardsEmptyStateData.getIcon();
            } else {
                icon = 0;
                title = null;
                iconUrl = null;
                message = null;
                button = null;
            }
            z = iconUrl == null;
            z = button != null;
            title2 = button != null ? button.getTitle() : null;
        } else {
            icon = 0;
            z = false;
            title = null;
            iconUrl = null;
            message = null;
            title2 = null;
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.F);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, title2);
            BindingAdaptersKt.o(this.y, z);
            BindingAdaptersKt.j(this.z, z);
            BindingAdaptersKt.f(this.z, iconUrl, null);
            BindingAdaptersKt.q(this.A, icon);
            BindingAdaptersKt.m(this.A, icon, null);
            TextViewBindingAdapter.b(this.B, message);
            TextViewBindingAdapter.b(this.C, title);
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
