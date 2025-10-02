package au.com.woolworths.feature.rewards.account.databinding;

import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsHeaderData;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemPreferenceDetailsHeaderBindingImpl extends EpoxyItemPreferenceDetailsHeaderBinding {
    public long D;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        this.C = (PreferenceDetailsHeaderData) obj;
        synchronized (this) {
            this.D |= 1;
        }
        h(53);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        String str3;
        String str4;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        PreferenceDetailsHeaderData preferenceDetailsHeaderData = this.C;
        long j2 = j & 3;
        String str5 = null;
        if (j2 != 0) {
            if (preferenceDetailsHeaderData != null) {
                String str6 = preferenceDetailsHeaderData.b;
                String str7 = preferenceDetailsHeaderData.f5749a;
                str2 = preferenceDetailsHeaderData.c;
                str4 = preferenceDetailsHeaderData.d;
                str = str6;
                str5 = str7;
            } else {
                str = null;
                str4 = null;
                str2 = null;
            }
            z2 = str5 != null;
            z3 = str2 != null;
            str3 = str5;
            str5 = str4;
            z = str4 != null;
        } else {
            str = null;
            str2 = null;
            z = false;
            z2 = false;
            z3 = false;
            str3 = null;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, str5);
            BindingAdaptersKt.o(this.y, z);
            TextViewBindingAdapter.b(this.z, str2);
            BindingAdaptersKt.o(this.z, z3);
            BindingAdaptersKt.o(this.A, z2);
            ImageView imageView = this.A;
            BindingAdaptersKt.f(imageView, str3, AppCompatResources.b(R.drawable.ic_rewards_logo_placeholder, imageView.getContext()));
            TextViewBindingAdapter.b(this.B, str);
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
