package au.com.woolworths.feature.shop.storelocator.legacy.databinding;

import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorContract;

/* loaded from: classes3.dex */
public class ItemPickUpLocationItemHeaderBindingImpl extends ItemPickUpLocationItemHeaderBinding {
    public long A;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (97 != i) {
            return false;
        }
        L((PickUpLocatorContract.SectionType) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.storelocator.legacy.databinding.ItemPickUpLocationItemHeaderBinding
    public final void L(PickUpLocatorContract.SectionType sectionType) throws Throwable {
        this.z = sectionType;
        synchronized (this) {
            this.A |= 1;
        }
        h(97);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.A;
            this.A = 0L;
        }
        PickUpLocatorContract.SectionType sectionType = this.z;
        long j2 = j & 3;
        int i = (j2 == 0 || sectionType == null) ? 0 : sectionType.d;
        if (j2 != 0) {
            this.y.setText(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.A = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
