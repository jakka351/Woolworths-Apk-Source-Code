package au.com.woolworths.feature.shop.catalogue.home;

import android.content.SharedPreferences;
import androidx.activity.result.ActivityResultCallback;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.feature.shop.catalogue.CatalogueStoreRepositoryImpl;
import au.com.woolworths.feature.shop.catalogue.CatalogueStoreSelectionResult;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class CatalogueHomeActivity$selectSubsequentStore$1 implements ActivityResultCallback, FunctionAdapter {
    public final /* synthetic */ CatalogueHomeActivity d;

    public CatalogueHomeActivity$selectSubsequentStore$1(CatalogueHomeActivity catalogueHomeActivity) {
        this.d = catalogueHomeActivity;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void a(Object obj) {
        CatalogueStoreSelectionResult p0 = (CatalogueStoreSelectionResult) obj;
        Intrinsics.h(p0, "p0");
        int i = CatalogueHomeActivity.E;
        if (p0.f6780a == -1) {
            CatalogueHomeViewModel catalogueHomeViewModelO4 = this.d.O4();
            CatalogueStoreInfo catalogueStoreInfo = p0.b;
            CatalogueStoreRepositoryImpl catalogueStoreRepositoryImpl = catalogueHomeViewModelO4.f.f6778a;
            SharedPreferences.Editor editorEdit = catalogueStoreRepositoryImpl.f6779a.edit();
            if (catalogueStoreInfo == null) {
                editorEdit.remove("selected_store");
            } else {
                editorEdit.putString("selected_store", catalogueStoreRepositoryImpl.b.j(catalogueStoreInfo));
            }
            editorEdit.apply();
            BuildersKt.c(ViewModelKt.a(catalogueHomeViewModelO4), null, null, new CatalogueHomeViewModel$onStoreSelected$1(catalogueHomeViewModelO4, null), 3);
        }
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function b() {
        return new FunctionReferenceImpl(1, this.d, CatalogueHomeActivity.class, "handleSelectSubsequentStore", "handleSelectSubsequentStore(Lau/com/woolworths/feature/shop/catalogue/CatalogueStoreSelectionResult;)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ActivityResultCallback) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
