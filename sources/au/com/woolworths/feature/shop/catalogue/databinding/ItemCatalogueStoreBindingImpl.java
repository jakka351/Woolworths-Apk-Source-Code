package au.com.woolworths.feature.shop.catalogue.databinding;

import android.content.SharedPreferences;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.feature.shop.catalogue.CatalogueStoreRepositoryImpl;
import au.com.woolworths.feature.shop.catalogue.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo;
import au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorContract;
import au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorInteractor;
import au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorViewModel;
import au.com.woolworths.feature.shop.catalogue.storeselector.analytics.CatalogueStoreSelectorActions;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class ItemCatalogueStoreBindingImpl extends ItemCatalogueStoreBinding implements OnClickListener.Listener {
    public static final SparseIntArray H;
    public final ConstraintLayout E;
    public final OnClickListener F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.store_icon_guideline, 3);
        sparseIntArray.put(R.id.store_icon_image_view, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemCatalogueStoreBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, H);
        super(dataBindingComponent, view, (TextView) objArrT[1], (TextView) objArrT[2]);
        this.G = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        E(view);
        this.F = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (257 == i) {
            N((CatalogueStoreInfo) obj);
            return true;
        }
        if (199 == i) {
            M((CharSequence) obj);
            return true;
        }
        if (64 == i) {
            L((String) obj);
            return true;
        }
        if (273 != i) {
            return false;
        }
        O((CatalogueStoreSelectorViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueStoreBinding
    public final void L(String str) throws Throwable {
        this.A = str;
        synchronized (this) {
            this.G |= 4;
        }
        h(64);
        y();
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueStoreBinding
    public final void M(CharSequence charSequence) throws Throwable {
        this.B = charSequence;
        synchronized (this) {
            this.G |= 2;
        }
        h(199);
        y();
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueStoreBinding
    public final void N(CatalogueStoreInfo catalogueStoreInfo) throws Throwable {
        this.C = catalogueStoreInfo;
        synchronized (this) {
            this.G |= 1;
        }
        h(257);
        y();
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueStoreBinding
    public final void O(CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel) throws Throwable {
        this.D = catalogueStoreSelectorViewModel;
        synchronized (this) {
            this.G |= 8;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.feature.shop.catalogue.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        CatalogueStoreInfo store = this.C;
        CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel = this.D;
        if (catalogueStoreSelectorViewModel != null) {
            Intrinsics.h(store, "store");
            String storeId = store.getStoreId();
            String displayName = store.getDisplayName();
            TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.I, storeId);
            trackingMetadataA.b(TrackableValue.x3, displayName);
            catalogueStoreSelectorViewModel.f.j(CatalogueStoreSelectorActions.h, trackingMetadataA);
            CatalogueStoreSelectorInteractor catalogueStoreSelectorInteractor = catalogueStoreSelectorViewModel.e;
            catalogueStoreSelectorInteractor.getClass();
            CatalogueStoreRepositoryImpl catalogueStoreRepositoryImpl = catalogueStoreSelectorInteractor.b.f6778a;
            SharedPreferences.Editor editorEdit = catalogueStoreRepositoryImpl.f6779a.edit();
            editorEdit.putString("selected_store", catalogueStoreRepositoryImpl.b.j(store));
            editorEdit.apply();
            catalogueStoreSelectorViewModel.h.f(new CatalogueStoreSelectorContract.Actions.PickStoreForCatalogue(store));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        CharSequence charSequence = this.B;
        String str = this.A;
        long j2 = 18 & j;
        long j3 = 20 & j;
        if ((j & 16) != 0) {
            this.E.setOnClickListener(this.F);
        }
        if (j3 != 0) {
            TextViewBindingAdapter.b(this.y, str);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.z, charSequence);
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
            this.G = 16L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
