package au.com.woolworths.base.shopapp.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.base.shopapp.data.models.InfoSectionItem;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemInfoSectionItemBindingImpl extends EpoxyItemInfoSectionItemBinding {
    public final TextView B;
    public long C;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemInfoSectionItemBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
        super(view, (ImageView) objArrT[1], (TextView) objArrT[2], dataBindingComponent);
        this.C = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        TextView textView = (TextView) objArrT[3];
        this.B = textView;
        textView.setTag(null);
        this.z.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (114 != i) {
            return false;
        }
        this.A = (InfoSectionItem) obj;
        synchronized (this) {
            this.C |= 1;
        }
        h(114);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String description;
        String imageUrl;
        String title;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        InfoSectionItem infoSectionItem = this.A;
        long j2 = j & 3;
        if (j2 == 0 || infoSectionItem == null) {
            description = null;
            imageUrl = null;
            title = null;
        } else {
            description = infoSectionItem.getDescription();
            imageUrl = infoSectionItem.getImageUrl();
            title = infoSectionItem.getTitle();
        }
        if (j2 != 0) {
            ImageView imageView = this.y;
            BindingAdaptersKt.f(imageView, imageUrl, AppCompatResources.b(R.drawable.ic_info_section_item_loading, imageView.getContext()));
            TextViewBindingAdapter.b(this.B, description);
            TextViewBindingAdapter.b(this.z, title);
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
