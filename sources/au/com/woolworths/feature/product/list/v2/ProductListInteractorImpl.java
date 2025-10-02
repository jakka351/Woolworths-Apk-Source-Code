package au.com.woolworths.feature.product.list.v2;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListInteractorImpl;", "Lau/com/woolworths/feature/product/list/v2/ProductListInteractor;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListInteractorImpl implements ProductListInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ProductListRepository f5401a;

    public ProductListInteractorImpl(ProductListRepository productListRepository) {
        this.f5401a = productListRepository;
    }

    public final void a(String chipId) {
        Intrinsics.h(chipId, "chipId");
        ProductListRepository productListRepository = this.f5401a;
        List listB = productListRepository.b();
        if (listB == null) {
            listB = EmptyList.d;
        }
        ArrayList arrayListJ0 = CollectionsKt.J0(listB);
        arrayListJ0.remove(chipId);
        SharedPreferences.Editor editorEdit = productListRepository.c.edit();
        editorEdit.putStringSet("product_list_persisted_chip_ids", CollectionsKt.L0(arrayListJ0));
        editorEdit.apply();
    }
}
