package au.com.woolworths.feature.shop.more.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.base.shopapp.bindings.TextViewBindingsKt;
import au.com.woolworths.feature.shop.more.MoreClickListener;
import au.com.woolworths.feature.shop.more.data.MoreTileItem;
import au.com.woolworths.feature.shop.more.generated.callback.OnClickListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class EpoxyItemMoreTileBindingImpl extends EpoxyItemMoreTileBinding implements OnClickListener.Listener {
    public final ConstraintLayout D;
    public final OnClickListener E;
    public long F;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemMoreTileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
        super(view, (ImageView) objArrT[3], (TextView) objArrT[2], (TextView) objArrT[1], dataBindingComponent);
        this.F = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        this.A.setTag(null);
        E(view);
        this.E = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (147 == i) {
            this.B = (MoreTileItem) obj;
            synchronized (this) {
                this.F |= 1;
            }
            h(147);
            y();
            return true;
        }
        if (37 != i) {
            return false;
        }
        this.C = (MoreClickListener) obj;
        synchronized (this) {
            this.F |= 2;
        }
        h(37);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.more.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        MoreTileItem moreTileItem = this.B;
        MoreClickListener moreClickListener = this.C;
        if (moreClickListener == null || moreTileItem == null) {
            return;
        }
        moreClickListener.V(moreTileItem.j, moreTileItem.k);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        CharSequence text;
        CharSequence text2;
        boolean z;
        int iZ;
        boolean z2;
        Integer num;
        Text text3;
        Text text4;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        MoreTileItem moreTileItem = this.B;
        long j2 = 5 & j;
        if (j2 != 0) {
            if (moreTileItem != null) {
                num = moreTileItem.l;
                text3 = moreTileItem.f;
                text4 = moreTileItem.e;
            } else {
                num = null;
                text3 = null;
                text4 = null;
            }
            iZ = ViewDataBinding.z(num);
            z = num != null;
            z2 = text4 != null;
            text = text3 != null ? text3.getText(this.h.getContext()) : null;
            text2 = text4 != null ? text4.getText(this.h.getContext()) : null;
        } else {
            text = null;
            text2 = null;
            z = false;
            iZ = 0;
            z2 = false;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, text2);
            BindingAdaptersKt.o(this.y, z2);
            TextViewBindingsKt.c(this.z, moreTileItem, false);
            ImageView view = this.A;
            Intrinsics.h(view, "view");
            if (iZ != 0) {
                view.setImageResource(iZ);
            } else {
                view.setImageDrawable(null);
            }
            BindingAdaptersKt.o(this.A, z);
            if (ViewDataBinding.s >= 4) {
                this.D.setContentDescription(text);
            }
        }
        if ((j & 4) != 0) {
            this.D.setOnClickListener(this.E);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
