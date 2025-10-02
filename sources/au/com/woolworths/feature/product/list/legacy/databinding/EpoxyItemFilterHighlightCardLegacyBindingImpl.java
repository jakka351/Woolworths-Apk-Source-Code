package au.com.woolworths.feature.product.list.legacy.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.bindings.TextViewBindingsKt;
import au.com.woolworths.feature.product.list.legacy.data.FilterHighlightCard;
import au.com.woolworths.feature.product.list.legacy.generated.callback.OnClickListener;
import au.com.woolworths.feature.product.list.legacy.ui.FilterCardClickListener;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemFilterHighlightCardLegacyBindingImpl extends EpoxyItemFilterHighlightCardLegacyBinding implements OnClickListener.Listener {
    public static final SparseIntArray D;
    public final OnClickListener B;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.filter_image, 3);
        sparseIntArray.put(R.id.content, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemFilterHighlightCardLegacyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, D);
        ImageView imageView = (ImageView) objArrT[1];
        super(view, imageView, (TextView) objArrT[2], dataBindingComponent);
        this.C = -1L;
        this.y.setTag(null);
        ((MaterialCardView) objArrT[0]).setTag(null);
        this.z.setTag(null);
        E(view);
        this.B = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (37 != i) {
            return false;
        }
        this.A = (FilterCardClickListener) obj;
        synchronized (this) {
            this.C |= 1;
        }
        h(37);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.product.list.legacy.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        FilterCardClickListener filterCardClickListener = this.A;
        if (filterCardClickListener != null) {
            filterCardClickListener.s();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        if ((j & 2) != 0) {
            this.y.setOnClickListener(this.B);
            TextViewBindingsKt.c(this.z, FilterHighlightCard.d, false);
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
