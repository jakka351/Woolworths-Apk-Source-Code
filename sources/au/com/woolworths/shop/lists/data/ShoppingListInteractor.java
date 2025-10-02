package au.com.woolworths.shop.lists.data;

import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/data/ShoppingListInteractor;", "", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingListLocalRepository f12257a;
    public final Flow b;
    public final ShoppingListInteractor$special$$inlined$map$1 c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/data/ShoppingListInteractor$Companion;", "", "", "MAX_SHOPPING_LIST_COUNT", "I", "MAX_SHOPPING_LIST_TITLE_LENGTH", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ShoppingListInteractor(ShoppingListLocalRepository shoppingListLocalRepository) {
        Intrinsics.h(shoppingListLocalRepository, "shoppingListLocalRepository");
        this.f12257a = shoppingListLocalRepository;
        this.b = shoppingListLocalRepository.e;
        this.c = new ShoppingListInteractor$special$$inlined$map$1(shoppingListLocalRepository.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.shop.lists.data.ShoppingListInteractor$canCreateList$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.shop.lists.data.ShoppingListInteractor$canCreateList$1 r0 = (au.com.woolworths.shop.lists.data.ShoppingListInteractor$canCreateList$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.ShoppingListInteractor$canCreateList$1 r0 = new au.com.woolworths.shop.lists.data.ShoppingListInteractor$canCreateList$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            r0.r = r3
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r5 = r4.f12257a
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r0 = 50
            if (r5 >= r0) goto L48
            goto L49
        L48:
            r3 = 0
        L49:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListInteractor.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r3.d(r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof au.com.woolworths.shop.lists.data.ShoppingListInteractor$deleteShoppingListById$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.shop.lists.data.ShoppingListInteractor$deleteShoppingListById$1 r0 = (au.com.woolworths.shop.lists.data.ShoppingListInteractor$deleteShoppingListById$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.ShoppingListInteractor$deleteShoppingListById$1 r0 = new au.com.woolworths.shop.lists.data.ShoppingListInteractor$deleteShoppingListById$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r3 = r6.f12257a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            au.com.woolworths.shop.lists.data.entity.ShoppingListEntity r7 = r0.p
            kotlin.ResultKt.b(r8)
            goto L57
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.ResultKt.b(r8)
            goto L46
        L3a:
            kotlin.ResultKt.b(r8)
            r0.s = r5
            java.lang.Object r8 = r3.f(r7, r0)
            if (r8 != r1) goto L46
            goto L56
        L46:
            r7 = r8
            au.com.woolworths.shop.lists.data.entity.ShoppingListEntity r7 = (au.com.woolworths.shop.lists.data.entity.ShoppingListEntity) r7
            kotlin.jvm.internal.Intrinsics.e(r7)
            r0.p = r7
            r0.s = r4
            java.lang.Object r8 = r3.d(r7, r0)
            if (r8 != r1) goto L57
        L56:
            return r1
        L57:
            java.lang.String r7 = r7.getId()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListInteractor.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable c(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.shop.lists.data.ShoppingListInteractor$fetchAllShoppingLists$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.shop.lists.data.ShoppingListInteractor$fetchAllShoppingLists$1 r0 = (au.com.woolworths.shop.lists.data.ShoppingListInteractor$fetchAllShoppingLists$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.ShoppingListInteractor$fetchAllShoppingLists$1 r0 = new au.com.woolworths.shop.lists.data.ShoppingListInteractor$fetchAllShoppingLists$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L3e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            r0.r = r3
            r5 = 0
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r2 = r4.f12257a
            java.lang.Object r5 = r2.g(r5, r0)
            if (r5 != r1) goto L3e
            return r1
        L3e:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.s(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L4f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r5.next()
            au.com.woolworths.shop.lists.data.entity.ShoppingListEntity r1 = (au.com.woolworths.shop.lists.data.entity.ShoppingListEntity) r1
            au.com.woolworths.shop.lists.data.model.ShoppingList r1 = au.com.woolworths.shop.lists.data.utils.ListsExtKt.b(r1)
            r0.add(r1)
            goto L4f
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListInteractor.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.shop.lists.data.ShoppingListInteractor$fetchShoppingList$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.lists.data.ShoppingListInteractor$fetchShoppingList$1 r0 = (au.com.woolworths.shop.lists.data.ShoppingListInteractor$fetchShoppingList$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.ShoppingListInteractor$fetchShoppingList$1 r0 = new au.com.woolworths.shop.lists.data.ShoppingListInteractor$fetchShoppingList$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            r0.r = r3
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r6 = r4.f12257a
            java.lang.Object r6 = r6.f(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            au.com.woolworths.shop.lists.data.entity.ShoppingListEntity r6 = (au.com.woolworths.shop.lists.data.entity.ShoppingListEntity) r6
            if (r6 == 0) goto L46
            au.com.woolworths.shop.lists.data.model.ShoppingList r5 = au.com.woolworths.shop.lists.data.utils.ListsExtKt.b(r6)
            return r5
        L46:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListInteractor.d(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.shop.lists.data.ShoppingListInteractor$fetchShoppingListWithItems$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.lists.data.ShoppingListInteractor$fetchShoppingListWithItems$1 r0 = (au.com.woolworths.shop.lists.data.ShoppingListInteractor$fetchShoppingListWithItems$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.ShoppingListInteractor$fetchShoppingListWithItems$1 r0 = new au.com.woolworths.shop.lists.data.ShoppingListInteractor$fetchShoppingListWithItems$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            r0.r = r3
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r6 = r4.f12257a
            java.lang.Object r6 = r6.h(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity r6 = (au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity) r6
            au.com.woolworths.shop.lists.data.model.ShoppingListWithItems r5 = au.com.woolworths.shop.lists.data.utils.ListsExtKt.c(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListInteractor.e(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [au.com.woolworths.shop.lists.data.ShoppingListInteractor$shoppingListWithItems$$inlined$map$1] */
    public final ShoppingListInteractor$shoppingListWithItems$$inlined$map$1 f(String listId) {
        Intrinsics.h(listId, "listId");
        final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1I = this.f12257a.i(listId);
        return new Flow<ShoppingListWithItems>() { // from class: au.com.woolworths.shop.lists.data.ShoppingListInteractor$shoppingListWithItems$$inlined$map$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.shop.lists.data.ShoppingListInteractor$shoppingListWithItems$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListInteractor$shoppingListWithItems$$inlined$map$1$2", f = "ShoppingListInteractor.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.shop.lists.data.ShoppingListInteractor$shoppingListWithItems$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.d = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof au.com.woolworths.shop.lists.data.ShoppingListInteractor$shoppingListWithItems$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.shop.lists.data.ShoppingListInteractor$shoppingListWithItems$$inlined$map$1$2$1 r0 = (au.com.woolworths.shop.lists.data.ShoppingListInteractor$shoppingListWithItems$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.shop.lists.data.ShoppingListInteractor$shoppingListWithItems$$inlined$map$1$2$1 r0 = new au.com.woolworths.shop.lists.data.ShoppingListInteractor$shoppingListWithItems$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L47
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity r5 = (au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity) r5
                        if (r5 == 0) goto L3b
                        au.com.woolworths.shop.lists.data.model.ShoppingListWithItems r5 = au.com.woolworths.shop.lists.data.utils.ListsExtKt.c(r5)
                        goto L3c
                    L3b:
                        r5 = 0
                    L3c:
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListInteractor$shoppingListWithItems$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1I.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        };
    }
}
