package au.com.woolworths.feature.rewards.account.databinding;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.rewards.account.data.AccountSettingsAppVersionData;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemAccountSettingsAppVersionBindingImpl extends EpoxyItemAccountSettingsAppVersionBinding {
    public long A;
    public final TextView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemAccountSettingsAppVersionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
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
        this.y = (AccountSettingsAppVersionData) obj;
        synchronized (this) {
            this.A |= 1;
        }
        h(53);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        int i;
        String str;
        synchronized (this) {
            j = this.A;
            this.A = 0L;
        }
        AccountSettingsAppVersionData accountSettingsAppVersionData = this.y;
        long j2 = j & 3;
        String string = null;
        if (j2 != 0) {
            if (accountSettingsAppVersionData != null) {
                string = accountSettingsAppVersionData.b;
                str = accountSettingsAppVersionData.c;
                i = accountSettingsAppVersionData.f5714a;
            } else {
                i = 0;
                str = null;
            }
            string = this.z.getResources().getString(R.string.app_version, Integer.valueOf(i), string, str);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.z, string);
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
