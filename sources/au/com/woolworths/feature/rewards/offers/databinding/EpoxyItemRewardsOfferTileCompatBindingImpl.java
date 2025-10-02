package au.com.woolworths.feature.rewards.offers.databinding;

/* loaded from: classes3.dex */
public class EpoxyItemRewardsOfferTileCompatBindingImpl extends EpoxyItemRewardsOfferTileCompatBinding {
    public long z;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        if (145 != i) {
            return false;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.z = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.z = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
