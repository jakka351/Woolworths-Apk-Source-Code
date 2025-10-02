package au.com.woolworths.product.databinding;

import android.util.SparseIntArray;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.product.models.MemberPriceInfo;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class LayoutMemberPriceLabelBindingImpl extends LayoutMemberPriceLabelBinding {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.reward_card_imageview, 4);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (170 != i) {
            return false;
        }
        L((MemberPriceInfo) obj);
        return true;
    }

    @Override // au.com.woolworths.product.databinding.LayoutMemberPriceLabelBinding
    public final void L(MemberPriceInfo memberPriceInfo) throws Throwable {
        this.B = memberPriceInfo;
        synchronized (this) {
            this.C |= 1;
        }
        h(170);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String title;
        String subtitle;
        String header;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        MemberPriceInfo memberPriceInfo = this.B;
        long j2 = j & 3;
        if (j2 == 0 || memberPriceInfo == null) {
            title = null;
            subtitle = null;
            header = null;
        } else {
            title = memberPriceInfo.getTitle();
            subtitle = memberPriceInfo.getSubtitle();
            header = memberPriceInfo.getHeader();
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, header);
            TextViewBindingAdapter.b(this.z, subtitle);
            TextViewBindingAdapter.b(this.A, title);
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
