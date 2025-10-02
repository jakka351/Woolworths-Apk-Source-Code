package au.com.woolworths.feature.shop.homepage.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.shop.homepage.data.AddRewardsTileData;
import au.com.woolworths.feature.shop.homepage.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.homepage.presentation.AddRewardsClickListener;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemAddRewardsTileBindingImpl extends EpoxyItemAddRewardsTileBinding implements OnClickListener.Listener {
    public static final SparseIntArray F;
    public final ConstraintLayout C;
    public final OnClickListener D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.redeem_image_view, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemAddRewardsTileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, F);
        TextView textView = (TextView) objArrT[2];
        TextView textView2 = (TextView) objArrT[1];
        super(dataBindingComponent, view, textView, textView2);
        this.E = -1L;
        this.y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.C = constraintLayout;
        constraintLayout.setTag(null);
        this.z.setTag(null);
        E(view);
        this.D = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 == i) {
            this.B = (AddRewardsClickListener) obj;
            synchronized (this) {
                this.E |= 1;
            }
            h(157);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.A = (AddRewardsTileData) obj;
        synchronized (this) {
            this.E |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.homepage.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        AddRewardsClickListener addRewardsClickListener = this.B;
        if (addRewardsClickListener != null) {
            addRewardsClickListener.u1();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        AddRewardsTileData addRewardsTileData = this.A;
        long j2 = 6 & j;
        if (j2 == 0 || addRewardsTileData == null) {
            str = null;
            str2 = null;
        } else {
            str = addRewardsTileData.f7177a;
            str2 = addRewardsTileData.b;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, str);
            TextViewBindingAdapter.b(this.z, str2);
        }
        if ((j & 4) != 0) {
            this.C.setOnClickListener(this.D);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.E = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
