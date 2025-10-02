package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionViewModel;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsAndConditionContract;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.TermItemUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.generated.callback.OnCheckedChangeListener;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingImpl extends EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsOldBinding implements OnCheckedChangeListener.Listener {
    public static final SparseIntArray E;
    public final OnCheckedChangeListener C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.terms_label, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, E);
        super(dataBindingComponent, view, (CheckBox) objArrT[1], (TextView) objArrT[2]);
        this.D = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.y.setTag(null);
        E(view);
        this.C = new OnCheckedChangeListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 == i) {
            this.B = (ConfirmSubscriptionViewModel) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(273);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.A = (TermItemUiModel) obj;
        synchronized (this) {
            this.D |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.deliveryunlimited.signup.generated.callback.OnCheckedChangeListener.Listener
    public final void c(CompoundButton compoundButton, boolean z) {
        ConfirmSubscriptionViewModel confirmSubscriptionViewModel = this.B;
        TermItemUiModel item = this.A;
        if (confirmSubscriptionViewModel != null) {
            Intrinsics.h(item, "item");
            MutableLiveData mutableLiveData = confirmSubscriptionViewModel.k;
            ConfirmSubscriptionTermsAndConditionContract.ViewState viewState = (ConfirmSubscriptionTermsAndConditionContract.ViewState) mutableLiveData.e();
            ConfirmSubscriptionTermsUiModel confirmSubscriptionTermsUiModel = viewState != null ? viewState.f10867a : null;
            if (confirmSubscriptionTermsUiModel == null) {
                throw new IllegalStateException("Terms clicked when state doesnt exist?");
            }
            List<TermItemUiModel> list = confirmSubscriptionTermsUiModel.b;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            for (TermItemUiModel termItemUiModelA : list) {
                if (Intrinsics.c(termItemUiModelA, item)) {
                    termItemUiModelA = TermItemUiModel.a(termItemUiModelA, z);
                }
                arrayList.add(termItemUiModelA);
            }
            mutableLiveData.m(new ConfirmSubscriptionTermsAndConditionContract.ViewState(ConfirmSubscriptionTermsUiModel.a(confirmSubscriptionTermsUiModel, arrayList)));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        TermItemUiModel termItemUiModel = this.A;
        long j2 = 6 & j;
        boolean z = (j2 == 0 || termItemUiModel == null) ? false : termItemUiModel.c;
        if (j2 != 0) {
            CompoundButtonBindingAdapter.a(this.y, z);
        }
        if ((j & 4) != 0) {
            this.y.setOnCheckedChangeListener(this.C);
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
