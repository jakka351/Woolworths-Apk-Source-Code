package au.com.woolworths.shop.lists.data.repository;

import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import au.com.woolworths.product.models.ProductListByProductIdsApiData;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$saveAllProducts$2", f = "ShoppingListItemsLocalRepositoryImpl.kt", l = {381}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListItemsLocalRepositoryImpl$saveAllProducts$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListItemsLocalRepositoryImpl q;
    public final /* synthetic */ ProductListByProductIdsApiData r;
    public final /* synthetic */ List s;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$saveAllProducts$2$1", f = "ShoppingListItemsLocalRepositoryImpl.kt", l = {382, 383, KyberEngine.KyberPolyBytes}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$saveAllProducts$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ ShoppingListItemsLocalRepositoryImpl q;
        public final /* synthetic */ ProductListByProductIdsApiData r;
        public final /* synthetic */ List s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProductListByProductIdsApiData productListByProductIdsApiData, ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl, List list, Continuation continuation) {
            super(1, continuation);
            this.q = shoppingListItemsLocalRepositoryImpl;
            this.r = productListByProductIdsApiData;
            this.s = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.r, this.q, this.s, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r10.p
                kotlin.Unit r2 = kotlin.Unit.f24250a
                r3 = 3
                r4 = 2
                r5 = 1
                au.com.woolworths.product.models.ProductListByProductIdsApiData r6 = r10.r
                au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl r7 = r10.q
                if (r1 == 0) goto L29
                if (r1 == r5) goto L25
                if (r1 == r4) goto L21
                if (r1 != r3) goto L19
                kotlin.ResultKt.b(r11)
                return r2
            L19:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L21:
                kotlin.ResultKt.b(r11)
                goto L80
            L25:
                kotlin.ResultKt.b(r11)
                goto L60
            L29:
                kotlin.ResultKt.b(r11)
                au.com.woolworths.shop.lists.data.database.ProductDao r11 = r7.d
                java.util.List r1 = r6.getProducts()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r8 = new java.util.ArrayList
                r9 = 10
                int r9 = kotlin.collections.CollectionsKt.s(r1, r9)
                r8.<init>(r9)
                java.util.Iterator r1 = r1.iterator()
            L43:
                boolean r9 = r1.hasNext()
                if (r9 == 0) goto L57
                java.lang.Object r9 = r1.next()
                au.com.woolworths.product.models.ProductCard r9 = (au.com.woolworths.product.models.ProductCard) r9
                au.com.woolworths.shop.lists.data.entity.ProductEntity r9 = au.com.woolworths.shop.lists.data.utils.ProductExtKt.a(r9)
                r8.add(r9)
                goto L43
            L57:
                r10.p = r5
                java.lang.Object r11 = r11.g(r8, r10)
                if (r11 != r0) goto L60
                goto L9a
            L60:
                r10.p = r4
                au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r11 = r7.f
                r11.getClass()
                kotlinx.coroutines.scheduling.DefaultScheduler r11 = kotlinx.coroutines.Dispatchers.f24691a
                kotlinx.coroutines.scheduling.DefaultIoScheduler r11 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f
                au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$updateProductListItem$2 r1 = new au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$updateProductListItem$2
                r4 = 0
                java.util.List r5 = r10.s
                r1.<init>(r6, r7, r5, r4)
                java.lang.Object r11 = kotlinx.coroutines.BuildersKt.f(r11, r1, r10)
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                if (r11 != r1) goto L7c
                goto L7d
            L7c:
                r11 = r2
            L7d:
                if (r11 != r0) goto L80
                goto L9a
            L80:
                java.util.List r11 = r6.getProducts()
                r10.p = r3
                java.util.ArrayList r11 = au.com.woolworths.shop.lists.data.utils.ProductExtKt.c(r11)
                if (r11 == 0) goto L97
                au.com.woolworths.shop.lists.data.database.CategoryDao r1 = r7.e
                java.lang.Object r11 = r1.b(r11, r10)
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                if (r11 != r1) goto L97
                goto L98
            L97:
                r11 = r2
            L98:
                if (r11 != r0) goto L9b
            L9a:
                return r0
            L9b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$saveAllProducts$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsLocalRepositoryImpl$saveAllProducts$2(ProductListByProductIdsApiData productListByProductIdsApiData, ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl, List list, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListItemsLocalRepositoryImpl;
        this.r = productListByProductIdsApiData;
        this.s = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListItemsLocalRepositoryImpl$saveAllProducts$2(this.r, this.q, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListItemsLocalRepositoryImpl$saveAllProducts$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl = this.q;
            RoomDatabase roomDatabase = shoppingListItemsLocalRepositoryImpl.f12279a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, shoppingListItemsLocalRepositoryImpl, this.s, null);
            this.p = 1;
            if (RoomDatabaseKt.a(roomDatabase, anonymousClass1, this) == coroutineSingletons) {
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
