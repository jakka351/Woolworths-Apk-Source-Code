package au.com.woolworths.shop.lists.data.di;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor;
import au.com.woolworths.shop.lists.data.prefs.ShoppingListsRepository;
import au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository;
import au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository;
import au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository;
import au.com.woolworths.shop.lists.data.workers.ProductsSyncWorker;
import au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker;
import au.com.woolworths.shop.lists.data.workers.ShoppingListsSyncWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/di/ShoppingListsSyncWorkerFactory;", "Landroidx/work/WorkerFactory;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShoppingListsSyncWorkerFactory extends WorkerFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingListLocalRepository f12276a;
    public final ShoppingListItemsLocalRepository b;
    public final ShoppingListRemoteRepository c;
    public final ShoppingListsRepository d;
    public final ShoppingListItemsSyncInteractor e;
    public final FeatureToggleManager f;

    public ShoppingListsSyncWorkerFactory(ShoppingListLocalRepository listLocalRepository, ShoppingListItemsLocalRepository listItemsLocalRepository, ShoppingListRemoteRepository listRemoteRepository, ShoppingListsRepository listsRepository, ShoppingListItemsSyncInteractor listItemsSyncInteractor, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(listLocalRepository, "listLocalRepository");
        Intrinsics.h(listItemsLocalRepository, "listItemsLocalRepository");
        Intrinsics.h(listRemoteRepository, "listRemoteRepository");
        Intrinsics.h(listsRepository, "listsRepository");
        Intrinsics.h(listItemsSyncInteractor, "listItemsSyncInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f12276a = listLocalRepository;
        this.b = listItemsLocalRepository;
        this.c = listRemoteRepository;
        this.d = listsRepository;
        this.e = listItemsSyncInteractor;
        this.f = featureToggleManager;
    }

    @Override // androidx.work.WorkerFactory
    public final ListenableWorker a(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        Intrinsics.h(appContext, "appContext");
        Intrinsics.h(workerClassName, "workerClassName");
        Intrinsics.h(workerParameters, "workerParameters");
        if (workerClassName.equals(ShoppingListsSyncWorker.class.getName())) {
            return new ShoppingListsSyncWorker(appContext, workerParameters, this.f12276a, this.c, this.d, this.f);
        }
        boolean zEquals = workerClassName.equals(ShoppingListItemsSyncWorker.class.getName());
        ShoppingListItemsSyncInteractor shoppingListItemsSyncInteractor = this.e;
        if (zEquals) {
            return new ShoppingListItemsSyncWorker(appContext, workerParameters, this.f12276a, shoppingListItemsSyncInteractor);
        }
        if (workerClassName.equals(ProductsSyncWorker.class.getName())) {
            return new ProductsSyncWorker(appContext, workerParameters, this.b, shoppingListItemsSyncInteractor);
        }
        return null;
    }
}
