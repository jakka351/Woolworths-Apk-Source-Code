package au.com.woolworths.feature.shop.storelocator.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.foundation.shop.storelocator.models.LocationDivision;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;

/* loaded from: classes3.dex */
public class StoreLocatorLocationMapInfoWindowBindingImpl extends StoreLocatorLocationMapInfoWindowBinding {
    public long D;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        L((Store) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.storelocator.databinding.StoreLocatorLocationMapInfoWindowBinding
    public final void L(Store store) throws Throwable {
        this.B = store;
        synchronized (this) {
            this.D |= 1;
        }
        h(53);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        LocationDivision locationDivision;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        Store store = this.B;
        long j2 = j & 3;
        int iA = 0;
        if (j2 != 0) {
            if (store != null) {
                str = store.g;
                str2 = store.f;
                locationDivision = store.e;
            } else {
                str = null;
                locationDivision = null;
                str2 = null;
            }
            if (locationDivision != null) {
                iA = locationDivision.a();
            }
        } else {
            str = null;
            str2 = null;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, str);
            BindingAdaptersKt.m(this.z, iA, null);
            TextViewBindingAdapter.b(this.A, str2);
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
            this.D = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
