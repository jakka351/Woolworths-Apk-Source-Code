package au.com.woolworths.feature.rewards.account.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsTextData;

/* loaded from: classes3.dex */
public class EpoxyItemPreferenceDetailsTextBindingImpl extends EpoxyItemPreferenceDetailsTextBinding {
    public long A;
    public final TextView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemPreferenceDetailsTextBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
        this.A = -1L;
        TextView textView = (TextView) objArrT[0];
        this.z = textView;
        textView.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        this.y = (PreferenceDetailsTextData) obj;
        synchronized (this) {
            this.A |= 1;
        }
        h(53);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        synchronized (this) {
            j = this.A;
            this.A = 0L;
        }
        PreferenceDetailsTextData preferenceDetailsTextData = this.y;
        long j2 = j & 3;
        String str2 = null;
        if (j2 != 0) {
            if (preferenceDetailsTextData != null) {
                str2 = preferenceDetailsTextData.b;
                str = preferenceDetailsTextData.f5750a;
            } else {
                str = null;
            }
            i = str2 != null ? 1 : 0;
            if (j2 != 0) {
                j |= i != 0 ? 8L : 4L;
            }
            i = i != 0 ? 1 : 2;
        } else {
            str = null;
        }
        if ((j & 3) != 0) {
            int i = ViewDataBinding.s;
            if (i >= 4) {
                this.z.setContentDescription(str2);
            }
            if (i >= 16) {
                this.z.setImportantForAccessibility(i);
            }
            TextViewBindingAdapter.b(this.z, str);
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
