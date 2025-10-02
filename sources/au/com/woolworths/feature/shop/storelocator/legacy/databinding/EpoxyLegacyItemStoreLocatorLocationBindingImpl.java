package au.com.woolworths.feature.shop.storelocator.legacy.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.widget.TextView;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.foundation.shop.storelocator.models.LocationDivision;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import com.woolworths.R;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class EpoxyLegacyItemStoreLocatorLocationBindingImpl extends EpoxyLegacyItemStoreLocatorLocationBinding {
    public static final SparseIntArray F;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.store_icon_guideline, 6);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (159 != i) {
            return false;
        }
        L((Store) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.storelocator.legacy.databinding.EpoxyLegacyItemStoreLocatorLocationBinding
    public final void L(Store store) throws Throwable {
        this.D = store;
        synchronized (this) {
            this.E |= 1;
        }
        h(159);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        int iA;
        boolean z;
        String str;
        List list;
        String str2;
        String string;
        String str3;
        LocationDivision locationDivision;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        Store store = this.D;
        long j2 = j & 3;
        if (j2 != 0) {
            if (store != null) {
                str = store.f;
                str2 = store.g;
                str3 = store.j;
                locationDivision = store.e;
                list = store.q;
            } else {
                str = null;
                list = null;
                str2 = null;
                str3 = null;
                locationDivision = null;
            }
            z = str3 != null;
            string = this.z.getResources().getString(R.string.pickup_store_locator_distance, str3);
            iA = locationDivision != null ? locationDivision.a() : 0;
        } else {
            iA = 0;
            z = false;
            str = null;
            list = null;
            str2 = null;
            string = null;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, str2);
            TextViewBindingAdapter.b(this.z, string);
            BindingAdaptersKt.o(this.z, z);
            BindingAdaptersKt.m(this.A, iA, null);
            TextViewBindingAdapter.b(this.B, str);
            TextView textView = this.C;
            Intrinsics.h(textView, "textView");
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                textView.setText((CharSequence) null);
            } else {
                textView.setText(CollectionsKt.M(list, "\n", null, null, null, 62));
            }
            TextView textView2 = this.C;
            Intrinsics.h(textView2, "textView");
            textView2.setVisibility((list2 == null || list2.isEmpty()) ? 8 : 0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.E = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
