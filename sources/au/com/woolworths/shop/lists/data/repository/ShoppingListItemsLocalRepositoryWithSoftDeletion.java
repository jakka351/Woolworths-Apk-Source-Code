package au.com.woolworths.shop.lists.data.repository;

import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.models.ProductListByProductIdsApiData;
import au.com.woolworths.shop.lists.data.entity.TextListItemEntity;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/repository/ShoppingListItemsLocalRepositoryWithSoftDeletion;", "Lau/com/woolworths/shop/lists/data/repository/ShoppingListItemsLocalRepository;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ShoppingListItemsLocalRepositoryWithSoftDeletion implements ShoppingListItemsLocalRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingListItemsLocalRepository f12280a;
    public final MutableStateFlow b;
    public final MutableStateFlow c;

    public ShoppingListItemsLocalRepositoryWithSoftDeletion(ShoppingListItemsLocalRepositoryImpl wrappedRepository) {
        Intrinsics.h(wrappedRepository, "wrappedRepository");
        this.f12280a = wrappedRepository;
        EmptySet emptySet = EmptySet.d;
        this.b = StateFlowKt.a(emptySet);
        this.c = StateFlowKt.a(emptySet);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final void a(String listId, ProductId productId) {
        MutableStateFlow mutableStateFlow;
        Object value;
        Intrinsics.h(listId, "listId");
        Intrinsics.h(productId, "productId");
        this.f12280a.a(listId, productId);
        do {
            mutableStateFlow = this.b;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, SetsKt.d((Set) value, new Pair(listId, productId))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$textItemsListInShoppingList$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$textItemsListInShoppingList$1 r0 = (au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$textItemsListInShoppingList$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L1a
        L13:
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$textItemsListInShoppingList$1 r0 = new au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$textItemsListInShoppingList$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r6 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            r0.r = r3
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository r6 = r4.f12280a
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        L4a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r6.next()
            r1 = r0
            au.com.woolworths.shop.lists.data.entity.TextListItemEntity r1 = (au.com.woolworths.shop.lists.data.entity.TextListItemEntity) r1
            kotlinx.coroutines.flow.MutableStateFlow r2 = r4.c
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r1 = r1.getId()
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L4a
            r5.add(r0)
            goto L4a
        L6d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion.b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object c(ProductCard productCard, Continuation continuation) {
        return this.f12280a.c(productCard, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object d(TextListItemEntity textListItemEntity, Function1 function1, ContinuationImpl continuationImpl) {
        return this.f12280a.d(textListItemEntity, function1, continuationImpl);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object e(String str, Continuation continuation) {
        return this.f12280a.e(str, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object f(ProductListByProductIdsApiData productListByProductIdsApiData, List list, Continuation continuation) {
        return this.f12280a.f(productListByProductIdsApiData, list, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object g(List list, Continuation continuation) {
        return this.f12280a.g(list, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object h(String str, ProductId productId, ProductCard productCard, float f, ContinuationImpl continuationImpl) {
        return this.f12280a.h(str, productId, productCard, f, continuationImpl);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final void i(String id) {
        MutableStateFlow mutableStateFlow;
        Object value;
        Intrinsics.h(id, "id");
        this.f12280a.i(id);
        do {
            mutableStateFlow = this.c;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, SetsKt.d((Set) value, id)));
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object j(String str, Continuation continuation) {
        return this.f12280a.j(str, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object k(String str, Continuation continuation) {
        return this.f12280a.k(str, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Flow l(String listId) {
        Intrinsics.h(listId, "listId");
        return FlowKt.l(this.f12280a.l(listId), this.c, new ShoppingListItemsLocalRepositoryWithSoftDeletion$textItemsInShoppingList$1());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$productListInShoppingList$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$productListInShoppingList$1 r0 = (au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$productListInShoppingList$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L1a
        L13:
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$productListInShoppingList$1 r0 = new au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$productListInShoppingList$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r6 = r0.p
            kotlin.ResultKt.b(r7)
            goto L43
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r7)
            r0.p = r6
            r0.s = r3
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository r7 = r5.f12280a
            java.lang.Object r7 = r7.m(r6, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L4e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r7.next()
            r2 = r1
            au.com.woolworths.shop.lists.data.entity.ProductListItemEntity r2 = (au.com.woolworths.shop.lists.data.entity.ProductListItemEntity) r2
            kotlinx.coroutines.flow.MutableStateFlow r3 = r5.b
            java.lang.Object r3 = r3.getValue()
            java.util.Set r3 = (java.util.Set) r3
            au.com.woolworths.product.models.ProductId r2 = r2.getProductId()
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r6, r2)
            boolean r2 = r3.contains(r4)
            if (r2 != 0) goto L4e
            r0.add(r1)
            goto L4e
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion.m(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object n(String str, boolean z, Continuation continuation) {
        return this.f12280a.n(str, z, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Flow o(final String listId) {
        Intrinsics.h(listId, "listId");
        final MutableStateFlow mutableStateFlow = this.b;
        return FlowKt.l(this.f12280a.o(listId), new Flow<List<? extends Pair<? extends String, ? extends ProductId>>>() { // from class: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$$inlined$map$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;
                public final /* synthetic */ String e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$$inlined$map$1$2", f = "ShoppingListItemsLocalRepositoryWithSoftDeletion.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$$inlined$map$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object p;
                    public int q;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.p = obj;
                        this.q |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, String str) {
                    this.d = flowCollector;
                    this.e = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$$inlined$map$1$2$1 r0 = (au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$$inlined$map$1$2$1 r0 = new au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r8)
                        goto L65
                    L27:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L2f:
                        kotlin.ResultKt.b(r8)
                        java.util.Set r7 = (java.util.Set) r7
                        java.lang.Iterable r7 = (java.lang.Iterable) r7
                        java.util.ArrayList r8 = new java.util.ArrayList
                        r8.<init>()
                        java.util.Iterator r7 = r7.iterator()
                    L3f:
                        boolean r2 = r7.hasNext()
                        if (r2 == 0) goto L5a
                        java.lang.Object r2 = r7.next()
                        r4 = r2
                        kotlin.Pair r4 = (kotlin.Pair) r4
                        java.lang.Object r4 = r4.d
                        java.lang.String r5 = r6.e
                        boolean r4 = kotlin.jvm.internal.Intrinsics.c(r4, r5)
                        if (r4 == 0) goto L3f
                        r8.add(r2)
                        goto L3f
                    L5a:
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r7 = r6.d
                        java.lang.Object r7 = r7.emit(r8, r0)
                        if (r7 != r1) goto L65
                        return r1
                    L65:
                        kotlin.Unit r7 = kotlin.Unit.f24250a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = mutableStateFlow.collect(new AnonymousClass2(flowCollector, listId), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }, new ShoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$1(listId, null));
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object p(String str, ProductId productId, Function1 function1, ContinuationImpl continuationImpl) {
        return this.f12280a.p(str, productId, function1, continuationImpl);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object q(ProductId productId, Continuation continuation) {
        return this.f12280a.q(productId, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object r(boolean z, String str, ContinuationImpl continuationImpl) {
        return this.f12280a.r(z, str, continuationImpl);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object s(String str, Continuation continuation) {
        return this.f12280a.s(str, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository
    public final Object t(Continuation continuation) {
        return this.f12280a.t(continuation);
    }
}
