package com.woolworths.scanlibrary.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;
import com.woolworths.R;
import com.woolworths.scanlibrary.models.store.Store;
import com.woolworths.scanlibrary.models.store.StoreKt;

/* loaded from: classes7.dex */
public class ViewAvailableStoreItemBindingImpl extends ViewAvailableStoreItemBinding {
    public long D;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (257 != i) {
            return false;
        }
        this.C = (Store) obj;
        synchronized (this) {
            this.D |= 1;
        }
        h(257);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        String state;
        String suburb;
        String postcode;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        Store store = this.C;
        long j2 = j & 3;
        String str3 = null;
        if (j2 != 0) {
            String storeTime = StoreKt.formatStoreTime(store);
            if (store != null) {
                String name = store.getName();
                state = store.getState();
                String addressLine1 = store.getAddressLine1();
                postcode = store.getPostcode();
                suburb = store.getSuburb();
                str2 = name;
                str3 = addressLine1;
            } else {
                state = null;
                suburb = null;
                str2 = null;
                postcode = null;
            }
            str = String.format(this.A.getResources().getString(R.string.sng_fmt_store_address), str3, suburb, state, postcode);
            str3 = storeTime;
        } else {
            str = null;
            str2 = null;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.z, str3);
            TextViewBindingAdapter.b(this.A, str);
            TextViewBindingAdapter.b(this.B, str2);
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
