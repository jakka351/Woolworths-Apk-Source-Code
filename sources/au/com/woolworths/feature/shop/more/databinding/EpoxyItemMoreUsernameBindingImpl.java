package au.com.woolworths.feature.shop.more.databinding;

import android.content.res.Resources;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.feature.shop.more.MoreContract;
import au.com.woolworths.feature.shop.more.MoreViewModel;
import au.com.woolworths.feature.shop.more.data.MoreData;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemMoreUsernameBindingImpl extends EpoxyItemMoreUsernameBinding {
    public long A;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        this.z = (MoreViewModel) obj;
        synchronized (this) {
            this.A |= 2;
        }
        h(273);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        synchronized (this) {
            j = this.A;
            this.A = 0L;
        }
        MoreViewModel moreViewModel = this.z;
        long j2 = j & 7;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = moreViewModel != null ? moreViewModel.u : null;
            I(0, mutableLiveData);
            MoreContract.ViewState viewState = mutableLiveData != null ? (MoreContract.ViewState) mutableLiveData.e() : null;
            MoreData moreData = viewState != null ? viewState.b : null;
            Text text = moreData != null ? moreData.c : null;
            string = this.y.getResources().getString(R.string.more_username, text != null ? text.getText(this.h.getContext()) : null);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, string);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.A = 4L;
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
            this.A |= 1;
        }
        return true;
    }
}
