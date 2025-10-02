package au.com.woolworths.feature.shop.more.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.more.MoreContract;
import au.com.woolworths.feature.shop.more.MoreViewModel;
import au.com.woolworths.feature.shop.more.data.MoreData;
import au.com.woolworths.feature.shop.more.generated.callback.OnClickListener;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemMoreRewardsCardOldBindingImpl extends EpoxyItemMoreRewardsCardOldBinding implements OnClickListener.Listener {
    public static final SparseIntArray G;
    public final OnClickListener D;
    public final OnClickListener E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.icon, 4);
        sparseIntArray.put(R.id.earn_points_text, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemMoreRewardsCardOldBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, G);
        super(dataBindingComponent, view, (ImageButton) objArrT[2], (MaterialCardView) objArrT[0], (TextView) objArrT[1], (Button) objArrT[3]);
        this.F = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        E(view);
        this.D = new OnClickListener(this, 1);
        this.E = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        this.C = (MoreViewModel) obj;
        synchronized (this) {
            this.F |= 2;
        }
        h(273);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.more.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        MoreViewModel moreViewModel;
        if (i != 1) {
            if (i == 2 && (moreViewModel = this.C) != null) {
                moreViewModel.v.f(MoreContract.Actions.LaunchShowBarcode.f7571a);
                return;
            }
            return;
        }
        MoreViewModel moreViewModel2 = this.C;
        if (moreViewModel2 != null) {
            moreViewModel2.v.f(MoreContract.Actions.UnlinkRewardsConfirmation.f7580a);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        MoreViewModel moreViewModel = this.C;
        long j2 = 7 & j;
        boolean z = false;
        String str = null;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = moreViewModel != null ? moreViewModel.u : null;
            I(0, mutableLiveData);
            MoreContract.ViewState viewState = mutableLiveData != null ? (MoreContract.ViewState) mutableLiveData.e() : null;
            MoreData moreData = viewState != null ? viewState.b : null;
            if (moreData != null) {
                z = moreData.e;
                str = moreData.d;
            }
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.D);
            this.B.setOnClickListener(this.E);
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.y, z);
            TextViewBindingAdapter.b(this.A, str);
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
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.F |= 1;
        }
        return true;
    }
}
