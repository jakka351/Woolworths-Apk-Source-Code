package au.com.woolworths.feature.shop.myorders.databinding;

import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesSubstitutedProduct;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemOrderYourGroceriesSubstitutionCardBindingImpl extends EpoxyItemOrderYourGroceriesSubstitutionCardBinding implements OnClickListener.Listener {
    public static final SparseIntArray L;
    public final FrameLayout G;
    public final MaterialCardView H;
    public final View I;
    public final OnClickListener J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.substitution_label, 9);
        sparseIntArray.put(R.id.item_barrier, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemOrderYourGroceriesSubstitutionCardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 11, null, L);
        Group group = (Group) objArrT[5];
        ImageView imageView = (ImageView) objArrT[2];
        TextView textView = (TextView) objArrT[8];
        ImageView imageView2 = (ImageView) objArrT[6];
        TextView textView2 = (TextView) objArrT[7];
        super(dataBindingComponent, view, group, imageView, textView, imageView2, textView2, (TextView) objArrT[3]);
        this.K = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.G = frameLayout;
        frameLayout.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArrT[1];
        this.H = materialCardView;
        materialCardView.setTag(null);
        View view2 = (View) objArrT[4];
        this.I = view2;
        view2.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        E(view);
        this.J = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (145 == i) {
            this.E = (YourGroceriesSubstitutedProduct) obj;
            synchronized (this) {
                this.K |= 1;
            }
            h(145);
            y();
            return true;
        }
        if (35 != i) {
            return false;
        }
        this.F = (YourGroceriesContract.YourGroceriesClickHandler) obj;
        synchronized (this) {
            this.K |= 2;
        }
        h(35);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        YourGroceriesSubstitutedProduct yourGroceriesSubstitutedProduct = this.E;
        YourGroceriesContract.YourGroceriesClickHandler yourGroceriesClickHandler = this.F;
        if (yourGroceriesClickHandler != null) {
            yourGroceriesClickHandler.O4(yourGroceriesSubstitutedProduct);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        SpannableString spannableString;
        String str;
        int i;
        String str2;
        boolean z;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        YourGroceriesSubstitutedProduct yourGroceriesSubstitutedProduct = this.E;
        long j2 = j & 5;
        String str3 = null;
        if (j2 != 0) {
            if (yourGroceriesSubstitutedProduct != null) {
                z = yourGroceriesSubstitutedProduct.m;
                spannableString = yourGroceriesSubstitutedProduct.l;
                str = yourGroceriesSubstitutedProduct.c;
                str2 = yourGroceriesSubstitutedProduct.b;
            } else {
                str2 = null;
                spannableString = null;
                str = null;
                z = false;
            }
            if (j2 != 0) {
                j |= z ? 80L : 40L;
            }
            int i2 = z ? 0 : 8;
            i = z ? 8 : 0;
            str3 = str2;
            i = i;
            i = i2;
        } else {
            spannableString = null;
            str = null;
            i = 0;
        }
        if ((5 & j) != 0) {
            this.y.setVisibility(i);
            ImageView imageView = this.z;
            d.z(this.z, R.drawable.ic_product_image_unavailable, imageView, str3, AppCompatResources.b(R.drawable.ic_product_image_loading, imageView.getContext()));
            this.I.setVisibility(i);
            TextViewBindingAdapter.b(this.A, spannableString);
            this.A.setVisibility(i);
            this.B.setVisibility(i);
            this.C.setVisibility(i);
            TextViewBindingAdapter.b(this.D, str);
        }
        if ((j & 4) != 0) {
            this.H.setOnClickListener(this.J);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.K = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
