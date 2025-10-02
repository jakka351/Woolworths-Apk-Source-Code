package au.com.woolworths.shop.lists.data;

import au.com.woolworths.shop.lists.data.repository.PurchaseHistoryRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/PastShopInteractor;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PastShopInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final PurchaseHistoryRepository f12256a;

    public PastShopInteractor(PurchaseHistoryRepository repository) {
        Intrinsics.h(repository, "repository");
        this.f12256a = repository;
    }
}
