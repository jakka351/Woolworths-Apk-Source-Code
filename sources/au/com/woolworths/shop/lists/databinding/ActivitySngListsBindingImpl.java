package au.com.woolworths.shop.lists.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class ActivitySngListsBindingImpl extends ActivitySngListsBinding {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.app_bar, 3);
        sparseIntArray.put(R.id.toolbar, 4);
        sparseIntArray.put(R.id.fragment_container, 5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (131 != i) {
            return false;
        }
        L((Boolean) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.lists.databinding.ActivitySngListsBinding
    public final void L(Boolean bool) throws Throwable {
        this.C = bool;
        synchronized (this) {
            this.D |= 1;
        }
        h(131);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        long j2 = j & 3;
        boolean zB = j2 != 0 ? ViewDataBinding.B(this.C) : false;
        if (j2 != 0) {
            BindingAdaptersKt.o(this.z, zB);
            BindingAdaptersKt.o(this.A, zB);
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
