package au.com.woolworths.shop.lists.data.repository;

import androidx.room.RoomDatabase;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.models.ProductListByProductIdsApiData;
import au.com.woolworths.shop.lists.data.database.CategoryDao;
import au.com.woolworths.shop.lists.data.database.ProductDao;
import au.com.woolworths.shop.lists.data.database.ProductListItemDao;
import au.com.woolworths.shop.lists.data.database.ShoppingListRoomDatabase;
import au.com.woolworths.shop.lists.data.database.TextListItemDao;
import au.com.woolworths.shop.lists.data.entity.TextListItemEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/repository/ShoppingListItemsLocalRepositoryImpl;", "Lau/com/woolworths/shop/lists/data/repository/ShoppingListItemsLocalRepository;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ShoppingListItemsLocalRepositoryImpl implements ShoppingListItemsLocalRepository {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f12279a;
    public final ProductListItemDao b;
    public final TextListItemDao c;
    public final ProductDao d;
    public final CategoryDao e;
    public final DispatcherProvider f;
    public final ContextScope g;

    public ShoppingListItemsLocalRepositoryImpl(ShoppingListRoomDatabase database, ProductListItemDao productListItemDao, TextListItemDao textListItemDao, ProductDao productDao, CategoryDao categoryDao, DispatcherProvider dispatcher) {
        Intrinsics.h(database, "database");
        Intrinsics.h(productListItemDao, "productListItemDao");
        Intrinsics.h(textListItemDao, "textListItemDao");
        Intrinsics.h(productDao, "productDao");
        Intrinsics.h(categoryDao, "categoryDao");
        Intrinsics.h(dispatcher, "dispatcher");
        this.f12279a = database;
        this.b = productListItemDao;
        this.c = textListItemDao;
        this.d = productDao;
        this.e = categoryDao;
        this.f = dispatcher;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        this.g = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, DefaultIoScheduler.f));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object u(au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            au.com.woolworths.shop.lists.data.database.ProductDao r0 = r8.d
            boolean r1 = r9 instanceof au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$removeOrphanedProducts$1
            if (r1 == 0) goto L15
            r1 = r9
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$removeOrphanedProducts$1 r1 = (au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$removeOrphanedProducts$1) r1
            int r2 = r1.s
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.s = r2
            goto L1a
        L15:
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$removeOrphanedProducts$1 r1 = new au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$removeOrphanedProducts$1
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.s
            kotlin.Unit r4 = kotlin.Unit.f24250a
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L45
            if (r3 == r7) goto L41
            if (r3 == r6) goto L39
            if (r3 != r5) goto L31
            kotlin.ResultKt.b(r9)
            return r4
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.util.List r8 = r1.p
            java.util.List r8 = (java.util.List) r8
            kotlin.ResultKt.b(r9)
            goto L64
        L41:
            kotlin.ResultKt.b(r9)
            goto L53
        L45:
            kotlin.ResultKt.b(r9)
            au.com.woolworths.shop.lists.data.database.ProductListItemDao r8 = r8.b
            r1.s = r7
            java.lang.Object r9 = r8.f(r1)
            if (r9 != r2) goto L53
            goto L81
        L53:
            r8 = r9
            java.util.List r8 = (java.util.List) r8
            r9 = r8
            java.util.List r9 = (java.util.List) r9
            r1.p = r9
            r1.s = r6
            java.lang.Object r9 = r0.c(r1)
            if (r9 != r2) goto L64
            goto L81
        L64:
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.ArrayList r9 = kotlin.collections.CollectionsKt.J0(r9)
            java.util.Collection r8 = (java.util.Collection) r8
            r9.removeAll(r8)
            boolean r8 = r9.isEmpty()
            if (r8 == 0) goto L76
            goto L82
        L76:
            r8 = 0
            r1.p = r8
            r1.s = r5
            java.lang.Object r8 = r0.b(r9, r1)
            if (r8 != r2) goto L82
        L81:
            return r2
        L82:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl.u(au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final void a(String listId, ProductId productId) {
        Intrinsics.h(listId, "listId");
        Intrinsics.h(productId, "productId");
        BuildersKt.c(this.g, null, null, new ShoppingListItemsLocalRepositoryImpl$deleteProductItem$1(this, listId, productId, null), 3);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object b(String str, Continuation continuation) {
        return this.c.b(str, (ContinuationImpl) continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object c(ProductCard productCard, Continuation continuation) throws Throwable {
        this.f.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        Object objF = BuildersKt.f(DefaultIoScheduler.f, new ShoppingListItemsLocalRepositoryImpl$updateProduct$2(this, productCard, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object d(TextListItemEntity textListItemEntity, Function1 function1, ContinuationImpl continuationImpl) {
        this.f.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new ShoppingListItemsLocalRepositoryImpl$addOrUpdateTextItem$2(textListItemEntity, this, null, function1), continuationImpl);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object e(String str, Continuation continuation) throws Throwable {
        this.f.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        Object objF = BuildersKt.f(DefaultIoScheduler.f, new ShoppingListItemsLocalRepositoryImpl$purgeListItemByRemoteId$2(this, str, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object f(ProductListByProductIdsApiData productListByProductIdsApiData, List list, Continuation continuation) throws Throwable {
        this.f.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        Object objF = BuildersKt.f(DefaultIoScheduler.f, new ShoppingListItemsLocalRepositoryImpl$saveAllProducts$2(productListByProductIdsApiData, this, list, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005b -> B:20:0x005e). Please report as a decompilation issue!!! */
    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.util.List r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$addProducts$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$addProducts$1 r0 = (au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$addProducts$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L1a
        L13:
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$addProducts$1 r0 = new au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$addProducts$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            au.com.woolworths.shop.lists.data.entity.ProductListItemEntity r6 = r0.q
            java.util.Iterator r2 = r0.p
            kotlin.ResultKt.b(r7)
            goto L5e
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r2 = r6
        L3f:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L6c
            java.lang.Object r6 = r2.next()
            au.com.woolworths.shop.lists.data.entity.ProductListItemEntity r6 = (au.com.woolworths.shop.lists.data.entity.ProductListItemEntity) r6
            au.com.woolworths.product.models.ProductId r7 = r6.getProductId()
            r0.p = r2
            r0.q = r6
            r0.t = r3
            au.com.woolworths.shop.lists.data.database.ProductDao r4 = r5.d
            java.lang.Object r7 = r4.e(r7, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            au.com.woolworths.shop.lists.data.entity.ProductsWithCategory r7 = (au.com.woolworths.shop.lists.data.entity.ProductsWithCategory) r7
            if (r7 == 0) goto L67
            au.com.woolworths.product.models.ProductCard r7 = au.com.woolworths.shop.lists.data.utils.ProductExtKt.b(r7)
            goto L68
        L67:
            r7 = 0
        L68:
            r6.setProduct(r7)
            goto L3f
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl.g(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object h(String str, ProductId productId, ProductCard productCard, float f, ContinuationImpl continuationImpl) {
        this.f.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new ShoppingListItemsLocalRepositoryImpl$addOrUpdateProductItem$2(f, productCard, productId, this, str, null), continuationImpl);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final void i(String id) {
        Intrinsics.h(id, "id");
        BuildersKt.c(this.g, null, null, new ShoppingListItemsLocalRepositoryImpl$deleteTextItem$1(this, id, null), 3);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object j(String str, Continuation continuation) {
        this.f.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new ShoppingListItemsLocalRepositoryImpl$fetchProductItemById$2(this, str, null), continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object k(String str, Continuation continuation) throws Throwable {
        this.f.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        Object objF = BuildersKt.f(DefaultIoScheduler.f, new ShoppingListItemsLocalRepositoryImpl$removeAllListItems$2(this, str, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Flow l(String listId) {
        Intrinsics.h(listId, "listId");
        return this.c.d(listId);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object m(String str, Continuation continuation) {
        return this.b.b(str, (ContinuationImpl) continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object n(String str, boolean z, Continuation continuation) throws Throwable {
        this.f.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        Object objF = BuildersKt.f(DefaultIoScheduler.f, new ShoppingListItemsLocalRepositoryImpl$updateTextCheckedStatus$2(this, str, z, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Flow o(String listId) {
        Intrinsics.h(listId, "listId");
        return FlowKt.i(this.b.d(listId), this.d.d(), this.e.c(), new ShoppingListItemsLocalRepositoryImpl$productsInShoppingList$1(this, null));
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object p(String str, ProductId productId, Function1 function1, ContinuationImpl continuationImpl) throws Throwable {
        this.f.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        Object objF = BuildersKt.f(DefaultIoScheduler.f, new ShoppingListItemsLocalRepositoryImpl$addOrUpdateProductItem$4(this, str, productId, function1, null), continuationImpl);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object q(ProductId productId, Continuation continuation) {
        return this.d.e(productId, (ContinuationImpl) continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object r(boolean z, String str, ContinuationImpl continuationImpl) throws Throwable {
        this.f.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        Object objF = BuildersKt.f(DefaultIoScheduler.f, new ShoppingListItemsLocalRepositoryImpl$updateProductCheckedStatus$2(this, str, z, null), continuationImpl);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object s(String str, Continuation continuation) {
        this.f.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new ShoppingListItemsLocalRepositoryImpl$fetchTextItemById$2(this, str, null), continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object t(Continuation continuation) {
        this.f.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new ShoppingListItemsLocalRepositoryImpl$getAllProductIds$2(this, null), continuation);
    }
}
