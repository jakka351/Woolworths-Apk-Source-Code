package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.woolworths.R;
import com.woolworths.scanlibrary.models.store.Store;
import com.woolworths.scanlibrary.models.store.StoreKt;

/* loaded from: classes7.dex */
public class EpoxyViewAvailableStoreInfoBindingImpl extends EpoxyViewAvailableStoreInfoBinding {
    public final TextView B;
    public long C;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyViewAvailableStoreInfoBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
        super(dataBindingComponent, view, (TextView) objArrT[3], (TextView) objArrT[2]);
        this.C = -1L;
        ((LinearLayout) objArrT[0]).setTag(null);
        TextView textView = (TextView) objArrT[1];
        this.B = textView;
        textView.setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (257 != i) {
            return false;
        }
        this.A = (Store) obj;
        synchronized (this) {
            this.C |= 1;
        }
        h(257);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String storeTimeRefresh;
        String state;
        String str2;
        String postcode;
        String suburb;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        Store store = this.A;
        long j2 = j & 3;
        String str3 = null;
        if (j2 != 0) {
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
                str2 = null;
                postcode = null;
                suburb = null;
            }
            storeTimeRefresh = StoreKt.formatStoreTimeRefresh(store);
            str = String.format(this.z.getResources().getString(R.string.sng_fmt_store_address), str3, suburb, state, postcode);
            str3 = str2;
        } else {
            str = null;
            storeTimeRefresh = null;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.B, str3);
            TextViewBindingAdapter.b(this.y, storeTimeRefresh);
            TextViewBindingAdapter.b(this.z, str);
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
            this.C = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
