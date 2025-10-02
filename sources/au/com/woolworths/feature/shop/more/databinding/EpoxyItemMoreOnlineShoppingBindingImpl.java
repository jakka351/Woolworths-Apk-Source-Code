package au.com.woolworths.feature.shop.more.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.shop.more.MoreContract;
import au.com.woolworths.feature.shop.more.MoreViewModel;
import au.com.woolworths.feature.shop.more.analytics.MoreActions;
import au.com.woolworths.feature.shop.more.data.MoreOnlineShopping;
import au.com.woolworths.feature.shop.more.generated.callback.OnClickListener;

/* loaded from: classes3.dex */
public class EpoxyItemMoreOnlineShoppingBindingImpl extends EpoxyItemMoreOnlineShoppingBinding implements OnClickListener.Listener {
    public final ConstraintLayout B;
    public final OnClickListener C;
    public long D;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemMoreOnlineShoppingBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
        super(dataBindingComponent, view, (TextView) objArrT[1]);
        this.D = -1L;
        this.y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.B = constraintLayout;
        constraintLayout.setTag(null);
        E(view);
        this.C = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (147 == i) {
            this.z = (MoreOnlineShopping) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(147);
            y();
            return true;
        }
        if (273 != i) {
            return false;
        }
        this.A = (MoreViewModel) obj;
        synchronized (this) {
            this.D |= 2;
        }
        h(273);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.more.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        String url;
        MoreOnlineShopping moreOnlineShopping = this.z;
        MoreViewModel moreViewModel = this.A;
        if (moreViewModel == null || moreOnlineShopping == null || (url = moreOnlineShopping.getUrl()) == null) {
            return;
        }
        moreViewModel.f.c(MoreActions.r);
        moreViewModel.v.f(new MoreContract.Actions.LaunchDeepLink(url));
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        MoreOnlineShopping moreOnlineShopping = this.z;
        long j2 = 5 & j;
        String title = (j2 == 0 || moreOnlineShopping == null) ? null : moreOnlineShopping.getTitle();
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, title);
        }
        if ((j & 4) != 0) {
            this.B.setOnClickListener(this.C);
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
            this.D = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
