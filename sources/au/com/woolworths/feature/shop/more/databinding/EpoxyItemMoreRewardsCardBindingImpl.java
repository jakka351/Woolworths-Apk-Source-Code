package au.com.woolworths.feature.shop.more.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.more.MoreContract;
import au.com.woolworths.feature.shop.more.MoreViewModel;
import au.com.woolworths.feature.shop.more.data.MoreRewardsCard;
import au.com.woolworths.feature.shop.more.generated.callback.OnClickListener;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemMoreRewardsCardBindingImpl extends EpoxyItemMoreRewardsCardBinding implements OnClickListener.Listener {
    public static final SparseIntArray H;
    public final OnClickListener E;
    public final OnClickListener F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.icon, 4);
        sparseIntArray.put(R.id.earn_points_text, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemMoreRewardsCardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, H);
        super(dataBindingComponent, view, (ImageButton) objArrT[2], (MaterialCardView) objArrT[0], (TextView) objArrT[1], (Button) objArrT[3]);
        this.G = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        E(view);
        this.E = new OnClickListener(this, 1);
        this.F = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 == i) {
            this.C = (MoreViewModel) obj;
            synchronized (this) {
                this.G |= 1;
            }
            h(273);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.D = (MoreRewardsCard) obj;
        synchronized (this) {
            this.G |= 2;
        }
        h(53);
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
        boolean canBeUnlinked;
        String cardNumber;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        MoreRewardsCard moreRewardsCard = this.D;
        long j2 = 6 & j;
        if (j2 == 0 || moreRewardsCard == null) {
            canBeUnlinked = false;
            cardNumber = null;
        } else {
            canBeUnlinked = moreRewardsCard.getCanBeUnlinked();
            cardNumber = moreRewardsCard.getCardNumber();
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.E);
            this.B.setOnClickListener(this.F);
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.y, canBeUnlinked);
            TextViewBindingAdapter.b(this.A, cardNumber);
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
            this.G = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
