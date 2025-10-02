package au.com.woolworths.shop.lists.databinding;

/* loaded from: classes4.dex */
public class EpoxyItemPastShopsPaginationLoadingStateBindingImpl extends EpoxyItemPastShopsPaginationLoadingStateBinding {
    public long y;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.y = 1L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
