package au.com.woolworths.foundation.shop.bottomsheet.databinding;

import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.foundation.shop.bottomsheet.FinchInfoItem;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemFinchInfoBindingImpl extends EpoxyItemFinchInfoBinding {
    public long C;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (145 != i) {
            return false;
        }
        this.B = (FinchInfoItem) obj;
        synchronized (this) {
            this.C |= 1;
        }
        h(145);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String iconUrl;
        String title;
        String description;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        FinchInfoItem finchInfoItem = this.B;
        long j2 = j & 3;
        if (j2 == 0 || finchInfoItem == null) {
            iconUrl = null;
            title = null;
            description = null;
        } else {
            iconUrl = finchInfoItem.getIconUrl();
            title = finchInfoItem.getTitle();
            description = finchInfoItem.getDescription();
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, description);
            ImageView imageView = this.z;
            BindingAdaptersKt.f(imageView, iconUrl, AppCompatResources.b(R.drawable.ic_rewards_placeholder, imageView.getContext()));
            TextViewBindingAdapter.b(this.A, title);
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
