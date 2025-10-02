package au.com.woolworths.feature.rewards.offers.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.rewards.offers.RewardsOffersClickListener;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData;
import au.com.woolworths.feature.rewards.offers.generated.callback.OnClickListener;
import com.google.android.material.chip.Chip;

/* loaded from: classes3.dex */
public class EpoxyItemRewardsOffersFilterBindingImpl extends EpoxyItemRewardsOffersFilterBinding implements OnClickListener.Listener {
    public final Chip B;
    public final OnClickListener C;
    public long D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemRewardsOffersFilterBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
        this.D = -1L;
        Chip chip = (Chip) objArrT[0];
        this.B = chip;
        chip.setTag(null);
        E(view);
        this.C = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (139 == i) {
            this.y = (Boolean) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(139);
            y();
            return true;
        }
        if (79 == i) {
            this.z = (RewardsOfferFilterData) obj;
            synchronized (this) {
                this.D |= 2;
            }
            h(79);
            y();
            return true;
        }
        if (35 != i) {
            return false;
        }
        this.A = (RewardsOffersClickListener) obj;
        synchronized (this) {
            this.D |= 4;
        }
        h(35);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.offers.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        RewardsOfferFilterData rewardsOfferFilterData = this.z;
        RewardsOffersClickListener rewardsOffersClickListener = this.A;
        if (rewardsOffersClickListener != null) {
            rewardsOffersClickListener.o5(rewardsOfferFilterData);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        Boolean bool = this.y;
        RewardsOfferFilterData rewardsOfferFilterData = this.z;
        long j2 = 9 & j;
        boolean zB = j2 != 0 ? ViewDataBinding.B(bool) : false;
        long j3 = 10 & j;
        String str = (j3 == 0 || rewardsOfferFilterData == null) ? null : rewardsOfferFilterData.b;
        if (j2 != 0) {
            CompoundButtonBindingAdapter.a(this.B, zB);
        }
        if ((j & 8) != 0) {
            this.B.setOnClickListener(this.C);
        }
        if (j3 != 0) {
            TextViewBindingAdapter.b(this.B, str);
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
            this.D = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
