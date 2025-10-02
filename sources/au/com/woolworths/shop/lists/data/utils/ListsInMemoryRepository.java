package au.com.woolworths.shop.lists.data.utils;

import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.products.models.ListExtras;
import au.com.woolworths.android.onesite.products.models.ListLaunchSource;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.lists.data.prefs.ShoppingListsRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/utils/ListsInMemoryRepository;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListsInMemoryRepository {

    /* renamed from: a, reason: collision with root package name */
    public final CollectionModeInteractor f12294a;
    public final RepositoryManager b;
    public final ShoppingListsRepository c;
    public final CartUpdateInteractor d;
    public ListExtras e;

    public ListsInMemoryRepository(CollectionModeInteractor collectionModeInteractor, RepositoryManager repositoryManager, ShoppingListsRepository shoppingListsRepository, CartUpdateInteractor cartUpdateInteractor) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(repositoryManager, "repositoryManager");
        Intrinsics.h(shoppingListsRepository, "shoppingListsRepository");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        this.f12294a = collectionModeInteractor;
        this.b = repositoryManager;
        this.c = shoppingListsRepository;
        this.d = cartUpdateInteractor;
        this.e = new ListExtras(31);
    }

    public final ListsAnalyticsAppSection a() {
        return e() ? ListsAnalyticsAppSection.f : ListsAnalyticsAppSection.e;
    }

    public final CollectionMode b() {
        return e() ? CollectionMode.InStore.d : this.f12294a.w();
    }

    public final boolean c() {
        return e() ? this.e.e != -1 : this.d.b.z();
    }

    public final String d() {
        if (e()) {
            return String.valueOf(this.e.e);
        }
        if (this.f12294a.b()) {
            return this.b.f();
        }
        return null;
    }

    public final boolean e() {
        return this.e.d == ListLaunchSource.e;
    }

    public final boolean f() {
        return e() && this.e.e != -1;
    }

    public final boolean g() {
        return e() || this.f12294a.b();
    }

    public final void h(String value) {
        Intrinsics.h(value, "value");
        ShoppingListsRepository shoppingListsRepository = this.c;
        shoppingListsRepository.getClass();
        shoppingListsRepository.h.setValue(shoppingListsRepository, ShoppingListsRepository.j[6], value);
    }
}
