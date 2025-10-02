package au.com.woolworths.android.onesite.legacy.databinding;

import android.util.SparseIntArray;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityWebViewBindingImpl extends ActivityWebViewBinding {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.loading_layout, 3);
        sparseIntArray.put(R.id.main_appbar_layout, 4);
        sparseIntArray.put(R.id.observable_web_view, 5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (152 != i) {
            return false;
        }
        L(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // au.com.woolworths.android.onesite.legacy.databinding.ActivityWebViewBinding
    public final void L(boolean z) throws Throwable {
        this.C = z;
        synchronized (this) {
            this.D |= 1;
        }
        h(152);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        boolean z = this.C;
        long j2 = j & 3;
        boolean z2 = j2 != 0 ? !z : false;
        if (j2 != 0) {
            BindingAdaptersKt.o(this.A, z2);
            BindingAdaptersKt.o(this.B, z);
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
