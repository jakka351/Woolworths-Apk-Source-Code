package au.com.woolworths.feature.shared.receipt.details.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsClickHandler;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsHeader;
import au.com.woolworths.feature.shared.receipt.details.generated.callback.OnClickListener;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes3.dex */
public class EpoxyItemEReceiptHeaderBindingImpl extends EpoxyItemEReceiptHeaderBinding implements OnClickListener.Listener {
    public final ConstraintLayout E;
    public final OnClickListener F;
    public long G;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemEReceiptHeaderBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, null);
        super(view, (ImageView) objArrT[2], (TextView) objArrT[4], (TextView) objArrT[3], dataBindingComponent);
        this.G = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ((MaterialCardView) objArrT[0]).setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[1];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        this.A.setTag(null);
        E(view);
        this.F = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (98 == i) {
            this.D = (Boolean) obj;
            synchronized (this) {
                this.G |= 1;
            }
            h(98);
            y();
            return true;
        }
        if (35 == i) {
            this.C = (EReceiptDetailsClickHandler) obj;
            synchronized (this) {
                this.G |= 2;
            }
            h(35);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.B = (EReceiptDetailsHeader) obj;
        synchronized (this) {
            this.G |= 4;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shared.receipt.details.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        EReceiptDetailsClickHandler eReceiptDetailsClickHandler = this.C;
        EReceiptDetailsHeader eReceiptDetailsHeader = this.B;
        if (eReceiptDetailsClickHandler == null || eReceiptDetailsHeader == null) {
            return;
        }
        eReceiptDetailsClickHandler.x0(eReceiptDetailsHeader.getDivision(), eReceiptDetailsHeader.getStoreNo());
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String title;
        String iconUrl;
        String content;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        Boolean bool = this.D;
        EReceiptDetailsHeader eReceiptDetailsHeader = this.B;
        long j2 = 9 & j;
        boolean zB = j2 != 0 ? ViewDataBinding.B(bool) : false;
        long j3 = j & 12;
        if (j3 == 0 || eReceiptDetailsHeader == null) {
            title = null;
            iconUrl = null;
            content = null;
        } else {
            title = eReceiptDetailsHeader.getTitle();
            iconUrl = eReceiptDetailsHeader.getIconUrl();
            content = eReceiptDetailsHeader.getContent();
        }
        if (j3 != 0) {
            TextViewBindingAdapter.b(this.y, content);
            BindingAdaptersKt.d(this.z, iconUrl);
            TextViewBindingAdapter.b(this.A, title);
        }
        if (j2 != 0) {
            ViewBindingAdapter.b(this.E, this.F, zB);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
