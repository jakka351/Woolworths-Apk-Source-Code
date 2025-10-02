package au.com.woolworths.feature.shop.catalogue.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.catalogue.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroContract;
import au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroViewModel;
import au.com.woolworths.feature.shop.catalogue.intro.analytics.CatalogueIntroActions;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityCatalogueIntroBindingImpl extends ActivityCatalogueIntroBinding implements OnClickListener.Listener {
    public static final SparseIntArray D;
    public final OnClickListener B;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.appbar_layout, 2);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.catalogue_image_view, 4);
        sparseIntArray.put(R.id.catalogue_header_text_view, 5);
        sparseIntArray.put(R.id.catalogue_content_text_view, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityCatalogueIntroBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 7, null, D);
        super(dataBindingComponent, view, (Button) objArrT[1], (Toolbar) objArrT[3]);
        this.C = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.y.setTag(null);
        E(view);
        this.B = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((CatalogueIntroViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueIntroBinding
    public final void L(CatalogueIntroViewModel catalogueIntroViewModel) throws Throwable {
        this.A = catalogueIntroViewModel;
        synchronized (this) {
            this.C |= 1;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.feature.shop.catalogue.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        CatalogueIntroViewModel catalogueIntroViewModel = this.A;
        if (catalogueIntroViewModel != null) {
            catalogueIntroViewModel.e.c(CatalogueIntroActions.e);
            catalogueIntroViewModel.f.f(CatalogueIntroContract.Actions.LaunchCatalogueStoreSelection.f6861a);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        if ((j & 2) != 0) {
            this.y.setOnClickListener(this.B);
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
