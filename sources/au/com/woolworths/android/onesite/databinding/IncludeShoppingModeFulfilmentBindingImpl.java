package au.com.woolworths.android.onesite.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.modules.main.MainViewModel;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.text.TextWithAltApiData;
import au.com.woolworths.feature.shop.homepage.data.HomeFulfilmentWindowState;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class IncludeShoppingModeFulfilmentBindingImpl extends IncludeShoppingModeFulfilmentBinding {
    public static final ViewDataBinding.IncludedLayouts E;
    public static final SparseIntArray F;
    public long D;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        E = includedLayouts;
        includedLayouts.a(0, new int[]{3}, new int[]{R.layout.epoxy_item_button}, new String[]{"epoxy_item_button"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.window_flow_container, 4);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (87 == i) {
            this.B = (HomeFulfilmentWindowState) obj;
            synchronized (this) {
                this.D |= 2;
            }
            h(87);
            y();
            return true;
        }
        if (35 != i) {
            return false;
        }
        this.C = (MainViewModel) obj;
        synchronized (this) {
            this.D |= 4;
        }
        h(35);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String text;
        String str2;
        ButtonApiData buttonApiData;
        TextWithAltApiData textWithAltApiData;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        HomeFulfilmentWindowState homeFulfilmentWindowState = this.B;
        MainViewModel mainViewModel = this.C;
        long j2 = 10 & j;
        ButtonApiData buttonApiData2 = null;
        if (j2 != 0) {
            if (homeFulfilmentWindowState != null) {
                textWithAltApiData = homeFulfilmentWindowState.e;
                str2 = homeFulfilmentWindowState.d;
                buttonApiData = homeFulfilmentWindowState.f;
            } else {
                buttonApiData = null;
                textWithAltApiData = null;
                str2 = null;
            }
            if (textWithAltApiData != null) {
                String altText = textWithAltApiData.getAltText();
                text = textWithAltApiData.getText();
                buttonApiData2 = buttonApiData;
                str = altText;
            } else {
                text = null;
                buttonApiData2 = buttonApiData;
                str = null;
            }
        } else {
            str = null;
            text = null;
            str2 = null;
        }
        long j3 = j & 12;
        if (j2 != 0) {
            this.y.L(buttonApiData2);
            TextViewBindingAdapter.b(this.z, text);
            TextViewBindingAdapter.b(this.A, str2);
            if (ViewDataBinding.s >= 4) {
                this.z.setContentDescription(str);
            }
        }
        if (j3 != 0) {
            this.y.M(mainViewModel);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.D != 0) {
                    return true;
                }
                return this.y.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 8L;
        }
        this.y.r();
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
            this.D |= 1;
        }
        return true;
    }
}
