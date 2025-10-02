package au.com.woolworths.feature.rewards.card.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.rewards.card.generated.callback.OnClickListener;
import au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableContract;
import au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableViewModel;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentRewardsCardOutageBottomSheetBindingImpl extends FragmentRewardsCardOutageBottomSheetBinding implements OnClickListener.Listener {
    public static final SparseIntArray E;
    public final OnClickListener C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.rewards_card_outage_title, 2);
        sparseIntArray.put(R.id.rewards_card_outage_message, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentRewardsCardOutageBottomSheetBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, E);
        super(dataBindingComponent, view, (Button) objArrT[1], (TextView) objArrT[3], (TextView) objArrT[2]);
        this.D = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.y.setTag(null);
        E(view);
        this.C = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((ServiceUnavailableViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.card.databinding.FragmentRewardsCardOutageBottomSheetBinding
    public final void L(ServiceUnavailableViewModel serviceUnavailableViewModel) throws Throwable {
        this.B = serviceUnavailableViewModel;
        synchronized (this) {
            this.D |= 1;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.feature.rewards.card.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ServiceUnavailableViewModel serviceUnavailableViewModel = this.B;
        if (serviceUnavailableViewModel != null) {
            serviceUnavailableViewModel.e.f(ServiceUnavailableContract.Actions.DismissBottomSheet.f5823a);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        if ((j & 2) != 0) {
            this.y.setOnClickListener(this.C);
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
