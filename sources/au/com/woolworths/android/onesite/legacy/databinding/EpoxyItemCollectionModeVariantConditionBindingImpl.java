package au.com.woolworths.android.onesite.legacy.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.Condition;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemCollectionModeVariantConditionBindingImpl extends EpoxyItemCollectionModeVariantConditionBinding {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.variant_detail_icon, 2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (45 == i) {
            this.A = (Condition) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(45);
            y();
            return true;
        }
        if (123 == i) {
            this.B = (Boolean) obj;
            synchronized (this) {
                this.D |= 2;
            }
            h(123);
            y();
            return true;
        }
        if (127 != i) {
            return false;
        }
        this.C = (Boolean) obj;
        synchronized (this) {
            this.D |= 4;
        }
        h(127);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        Condition condition = this.A;
        Boolean bool = this.B;
        Boolean bool2 = this.C;
        long j2 = 9 & j;
        String str = (j2 == 0 || condition == null) ? null : condition.d;
        long j3 = 10 & j;
        boolean zB = j3 != 0 ? ViewDataBinding.B(bool) : false;
        long j4 = j & 12;
        boolean zB2 = j4 != 0 ? ViewDataBinding.B(bool2) : false;
        if (j3 != 0) {
            this.y.setChecked(zB);
        }
        if (j4 != 0) {
            this.y.setEnabled(zB2);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.z, str);
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
