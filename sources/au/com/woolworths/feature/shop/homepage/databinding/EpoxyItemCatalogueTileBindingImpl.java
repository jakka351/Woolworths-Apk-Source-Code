package au.com.woolworths.feature.shop.homepage.databinding;

import YU.a;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.homepage.data.CatalogueCard;
import au.com.woolworths.feature.shop.homepage.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.homepage.presentation.CatalogueClickListener;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemCatalogueTileBindingImpl extends EpoxyItemCatalogueTileBinding implements OnClickListener.Listener {
    public static final SparseIntArray H;
    public final ConstraintLayout D;
    public final ImageView E;
    public final OnClickListener F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.start_guideline, 5);
        sparseIntArray.put(R.id.catalogue_image_guideline, 6);
        sparseIntArray.put(R.id.catalogue_left_card_view, 7);
        sparseIntArray.put(R.id.end_guideline, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemCatalogueTileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 9, null, H);
        ImageView imageView = (ImageView) objArrT[2];
        MaterialCardView materialCardView = (MaterialCardView) objArrT[0];
        ImageView imageView2 = (ImageView) objArrT[4];
        super(dataBindingComponent, view, imageView, materialCardView, imageView2);
        this.G = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[1];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView3 = (ImageView) objArrT[3];
        this.E = imageView3;
        imageView3.setTag(null);
        E(view);
        this.F = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 == i) {
            this.C = (CatalogueClickListener) obj;
            synchronized (this) {
                this.G |= 1;
            }
            h(157);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.B = (CatalogueCard) obj;
        synchronized (this) {
            this.G |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.homepage.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        CatalogueClickListener catalogueClickListener = this.C;
        if (catalogueClickListener != null) {
            catalogueClickListener.L1();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String strG;
        String str;
        String str2;
        String str3;
        String str4;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        CatalogueCard catalogueCard = this.B;
        long j2 = 6 & j;
        String str5 = null;
        if (j2 != 0) {
            if (catalogueCard != null) {
                str5 = catalogueCard.f7180a;
                str4 = catalogueCard.c;
                str = catalogueCard.e;
                str2 = catalogueCard.d;
                str3 = catalogueCard.b;
            } else {
                str3 = null;
                str4 = null;
                str = null;
                str2 = null;
            }
            strG = a.g(a.g(str5, " "), str3);
            str5 = str4;
        } else {
            strG = null;
            str = null;
            str2 = null;
        }
        if (j2 != 0) {
            BindingAdaptersKt.d(this.y, str5);
            ImageView imageView = this.A;
            BindingAdaptersKt.f(imageView, str, AppCompatResources.b(R.drawable.catalogue_image_right, imageView.getContext()));
            ImageView imageView2 = this.E;
            BindingAdaptersKt.f(imageView2, str2, AppCompatResources.b(R.drawable.catalogue_image_left, imageView2.getContext()));
            if (ViewDataBinding.s >= 4) {
                this.D.setContentDescription(strG);
            }
        }
        if ((j & 4) != 0) {
            this.z.setOnClickListener(this.F);
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
