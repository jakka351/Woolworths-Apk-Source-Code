package au.com.woolworths.shop.lists.data;

import androidx.room.RoomDatabase;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.impl.WorkManagerImpl;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.utils.ConnectionManager;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.lists.data.database.CategoryDao;
import au.com.woolworths.shop.lists.data.database.ProductDao;
import au.com.woolworths.shop.lists.data.database.ProductListItemDao;
import au.com.woolworths.shop.lists.data.database.ShoppingListDao;
import au.com.woolworths.shop.lists.data.database.ShoppingListRoomDatabase;
import au.com.woolworths.shop.lists.data.database.TextListItemDao;
import au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository;
import au.com.woolworths.shop.lists.data.sync.ShoppingListSyncRepository;
import au.com.woolworths.shop.lists.data.sync.scheduler.SyncScheduler;
import au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt;
import au.com.woolworths.shop.lists.data.workers.ProductsSyncWorker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/ShoppingListSyncInteractor;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShoppingListSyncInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final SyncScheduler f12260a;
    public final ShoppingListLocalRepository b;
    public final ShoppingListItemsSyncInteractor c;
    public final RoomDatabase d;
    public final ShoppingListDao e;
    public final ProductListItemDao f;
    public final TextListItemDao g;
    public final ProductDao h;
    public final CategoryDao i;
    public final CollectionModeInteractor j;
    public final ShopAccountInteractor k;
    public final DispatcherProvider l;
    public final String m;
    public final ConnectionManager n;
    public final ShopAppRegionInteractor o;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$1", f = "ShoppingListSyncInteractor.kt", l = {61}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ShoppingListSyncInteractor.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final ShoppingListSyncInteractor shoppingListSyncInteractor = ShoppingListSyncInteractor.this;
                Flow flowG = shoppingListSyncInteractor.j.g();
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        SyncScheduler syncScheduler = shoppingListSyncInteractor.f12260a;
                        syncScheduler.getClass();
                        syncScheduler.c(ListsDataUtilsKt.b());
                        ShoppingListSyncRepository shoppingListSyncRepository = syncScheduler.f12291a;
                        shoppingListSyncRepository.getClass();
                        Timber.Forest forest = Timber.f27013a;
                        StringBuilder sb = new StringBuilder("XXXXX -> syncProducts:: workPolicy: ");
                        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.g;
                        sb.append(existingWorkPolicy);
                        forest.h(sb.toString(), new Object[0]);
                        WorkManagerImpl workManagerImpl = shoppingListSyncRepository.f12286a;
                        OneTimeWorkRequest.Builder builder = (OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(ProductsSyncWorker.class).e(shoppingListSyncRepository.b);
                        builder.d.add("SYNC_PRODUCTS_WORKER");
                        OneTimeWorkRequest oneTimeWorkRequest = (OneTimeWorkRequest) builder.a();
                        workManagerImpl.getClass();
                        workManagerImpl.d(existingWorkPolicy, CollectionsKt.Q(oneTimeWorkRequest)).a();
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (flowG.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$2", f = "ShoppingListSyncInteractor.kt", l = {66}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ShoppingListSyncInteractor.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final ShoppingListSyncInteractor shoppingListSyncInteractor = ShoppingListSyncInteractor.this;
                Flow flow = shoppingListSyncInteractor.k.m;
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) throws Throwable {
                        ShoppingListSyncInteractor shoppingListSyncInteractor2 = shoppingListSyncInteractor;
                        shoppingListSyncInteractor2.l.getClass();
                        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                        Object objF = BuildersKt.f(DefaultIoScheduler.f, new ShoppingListSyncInteractor$onUserLogin$2((ShopAccountInteractor.LoginDetails) obj2, shoppingListSyncInteractor2, null), continuation);
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.d;
                        Unit unit = Unit.f24250a;
                        if (objF != coroutineSingletons2) {
                            objF = unit;
                        }
                        return objF == coroutineSingletons2 ? objF : unit;
                    }
                };
                this.p = 1;
                if (flow.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$3", f = "ShoppingListSyncInteractor.kt", l = {71}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ShoppingListSyncInteractor.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final ShoppingListSyncInteractor shoppingListSyncInteractor = ShoppingListSyncInteractor.this;
                Flow flow = shoppingListSyncInteractor.k.o;
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) throws Throwable {
                        Object objB = shoppingListSyncInteractor.b(continuation);
                        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
                    }
                };
                this.p = 1;
                if (flow.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    public ShoppingListSyncInteractor(SyncScheduler syncScheduler, ShoppingListLocalRepository listLocalRepository, ShoppingListItemsSyncInteractor listItemsSyncInteractor, ShoppingListRoomDatabase database, ShoppingListDao listDao, ProductListItemDao productListItemDao, TextListItemDao textListItemDao, ProductDao productDao, CategoryDao categoryDao, CollectionModeInteractor collectionModeInteractor, ShopAccountInteractor accountInteractor, DispatcherProvider dispatcher, String str, ConnectionManager connectionManager, ShopAppRegionInteractor shopAppRegionInteractor) {
        Intrinsics.h(syncScheduler, "syncScheduler");
        Intrinsics.h(listLocalRepository, "listLocalRepository");
        Intrinsics.h(listItemsSyncInteractor, "listItemsSyncInteractor");
        Intrinsics.h(database, "database");
        Intrinsics.h(listDao, "listDao");
        Intrinsics.h(productListItemDao, "productListItemDao");
        Intrinsics.h(textListItemDao, "textListItemDao");
        Intrinsics.h(productDao, "productDao");
        Intrinsics.h(categoryDao, "categoryDao");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(dispatcher, "dispatcher");
        Intrinsics.h(connectionManager, "connectionManager");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        this.f12260a = syncScheduler;
        this.b = listLocalRepository;
        this.c = listItemsSyncInteractor;
        this.d = database;
        this.e = listDao;
        this.f = productListItemDao;
        this.g = textListItemDao;
        this.h = productDao;
        this.i = categoryDao;
        this.j = collectionModeInteractor;
        this.k = accountInteractor;
        this.l = dispatcher;
        this.m = str;
        this.n = connectionManager;
        this.o = shopAppRegionInteractor;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        ContextScope contextScopeA = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, DefaultIoScheduler.f));
        BuildersKt.c(contextScopeA, null, null, new AnonymousClass1(null), 3);
        BuildersKt.c(contextScopeA, null, null, new AnonymousClass2(null), 3);
        BuildersKt.c(contextScopeA, null, null, new AnonymousClass3(null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r0 = r7.b
            boolean r1 = r8 instanceof au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$addFirstList$1
            if (r1 == 0) goto L15
            r1 = r8
            au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$addFirstList$1 r1 = (au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$addFirstList$1) r1
            int r2 = r1.r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.r = r2
            goto L1a
        L15:
            au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$addFirstList$1 r1 = new au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$addFirstList$1
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.r
            kotlin.Unit r4 = kotlin.Unit.f24250a
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L3a
            if (r3 == r6) goto L36
            if (r3 != r5) goto L2e
            kotlin.ResultKt.b(r8)
            return r4
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.ResultKt.b(r8)
            goto L47
        L3a:
            kotlin.ResultKt.b(r8)
            r1.r = r6
            r8 = 0
            java.lang.Object r8 = r0.g(r8, r1)
            if (r8 != r2) goto L47
            goto L60
        L47:
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L50
            goto L61
        L50:
            au.com.woolworths.shop.lists.data.a r8 = new au.com.woolworths.shop.lists.data.a
            r3 = 2
            r8.<init>(r7, r3)
            r1.r = r5
            java.lang.String r7 = ""
            java.lang.Object r7 = r0.a(r7, r8, r1)
            if (r7 != r2) goto L61
        L60:
            return r2
        L61:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor.a(au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object b(Continuation continuation) throws Throwable {
        this.l.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        Object objF = BuildersKt.f(DefaultIoScheduler.f, new ShoppingListSyncInteractor$onUserLogout$2(this, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$refreshShoppingList$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$refreshShoppingList$1 r0 = (au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$refreshShoppingList$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$refreshShoppingList$1 r0 = new au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$refreshShoppingList$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$refreshShoppingList$2 r6 = new au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$refreshShoppingList$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.r = r3
            java.lang.Object r5 = au.com.woolworths.shop.lists.data.sync.SyncResultKt.a(r6, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            au.com.woolworths.shop.lists.data.sync.SyncResult$Success r5 = au.com.woolworths.shop.lists.data.sync.SyncResult.Success.f12290a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor.c(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws au.com.woolworths.android.onesite.network.NoConnectivityException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$refreshShoppingLists$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$refreshShoppingLists$1 r0 = (au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$refreshShoppingLists$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$refreshShoppingLists$1 r0 = new au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$refreshShoppingLists$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r5)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L27
            goto L54
        L27:
            r5 = move-exception
            goto L5d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor r5 = r4.o
            au.com.woolworths.android.onesite.modules.common.Region r5 = r5.b()
            au.com.woolworths.android.onesite.modules.common.Region r2 = au.com.woolworths.android.onesite.modules.common.Region.i
            if (r5 != r2) goto L63
            au.com.woolworths.shop.lists.data.sync.scheduler.SyncScheduler r5 = r4.f12260a     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L27
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L27
            au.com.woolworths.android.onesite.utils.ConnectionManager r2 = r5.c     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L27
            boolean r2 = r2.isConnected()     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L27
            if (r2 == 0) goto L57
            au.com.woolworths.shop.lists.data.sync.scheduler.SyncType r2 = au.com.woolworths.shop.lists.data.sync.scheduler.SyncType.d     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L27
            r3 = 0
            java.lang.Object r5 = r5.e(r3, r2, r0)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L27
            if (r5 != r1) goto L54
            return r1
        L54:
            au.com.woolworths.shop.lists.data.sync.SyncResult r5 = (au.com.woolworths.shop.lists.data.sync.SyncResult) r5     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L27
            return r5
        L57:
            au.com.woolworths.android.onesite.network.NoConnectivityException r5 = new au.com.woolworths.android.onesite.network.NoConnectivityException     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L27
            r5.<init>()     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L27
            throw r5     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L27
        L5d:
            au.com.woolworths.shop.lists.data.sync.SyncResult$Failure r0 = new au.com.woolworths.shop.lists.data.sync.SyncResult$Failure
            r0.<init>(r5)
            return r0
        L63:
            au.com.woolworths.shop.lists.data.sync.SyncResult$Success r5 = au.com.woolworths.shop.lists.data.sync.SyncResult.Success.f12290a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
