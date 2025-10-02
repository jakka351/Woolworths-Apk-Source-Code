package au.com.woolworths.feature.product.list.databinding;

import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class IncludeCircledCountBindingImpl extends IncludeCircledCountBinding {
    public long C;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (49 == i) {
            L((Integer) obj);
            return true;
        }
        if (239 != i) {
            if (108 != i) {
                return false;
            }
            M((Integer) obj);
            return true;
        }
        this.z = (Boolean) obj;
        synchronized (this) {
            this.C |= 2;
        }
        h(239);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.product.list.databinding.IncludeCircledCountBinding
    public final void L(Integer num) throws Throwable {
        this.A = num;
        synchronized (this) {
            this.C |= 1;
        }
        h(49);
        y();
    }

    @Override // au.com.woolworths.feature.product.list.databinding.IncludeCircledCountBinding
    public final void M(Integer num) throws Throwable {
        this.B = num;
        synchronized (this) {
            this.C |= 4;
        }
        h(108);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        Integer num = this.A;
        Boolean bool = this.z;
        Integer num2 = this.B;
        int iZ = (j & 9) != 0 ? ViewDataBinding.z(num) : 0;
        boolean z2 = (j & 10) != 0 ? !ViewDataBinding.B(bool) : false;
        long j2 = j & 12;
        if (j2 != 0) {
            z = num2 == null;
            if (j2 != 0) {
                j |= z ? 32L : 16L;
            }
        } else {
            z = false;
        }
        long j3 = 12 & j;
        int iIntValue = (j3 == 0 || z) ? 0 : num2.intValue();
        if ((10 & j) != 0) {
            this.y.setEnabled(z2);
        }
        if ((j & 9) != 0) {
            TextView filterCount = this.y;
            Intrinsics.h(filterCount, "filterCount");
            boolean z3 = iZ > 0;
            filterCount.setVisibility(z3 ? 0 : 8);
            if (z3) {
                filterCount.setText(iZ > 0 ? iZ > 99 ? "☻" : String.valueOf(iZ) : null);
            }
        }
        if (j3 == 0 || ViewDataBinding.s < 16) {
            return;
        }
        this.y.setImportantForAccessibility(iIntValue);
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
            this.C = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
