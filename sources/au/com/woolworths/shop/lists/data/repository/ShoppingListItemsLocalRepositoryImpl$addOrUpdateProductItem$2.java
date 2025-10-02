package au.com.woolworths.shop.lists.data.repository;

import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$addOrUpdateProductItem$2", f = "ShoppingListItemsLocalRepositoryImpl.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListItemsLocalRepositoryImpl$addOrUpdateProductItem$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListItemsLocalRepositoryImpl q;
    public final /* synthetic */ ProductCard r;
    public final /* synthetic */ String s;
    public final /* synthetic */ ProductId t;
    public final /* synthetic */ float u;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$addOrUpdateProductItem$2$1", f = "ShoppingListItemsLocalRepositoryImpl.kt", l = {105, 111, 124, 136}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$addOrUpdateProductItem$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public int p;
        public int q;
        public final /* synthetic */ ProductCard r;
        public final /* synthetic */ ShoppingListItemsLocalRepositoryImpl s;
        public final /* synthetic */ String t;
        public final /* synthetic */ ProductId u;
        public final /* synthetic */ float v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, ProductCard productCard, ProductId productId, ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl, String str, Continuation continuation) {
            super(1, continuation);
            this.r = productCard;
            this.s = shoppingListItemsLocalRepositoryImpl;
            this.t = str;
            this.u = productId;
            this.v = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.v, this.r, this.u, this.s, this.t, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
        
            if (r1.c(r5, r31) == r3) goto L39;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c9 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r32) {
            /*
                r31 = this;
                r0 = r31
                au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl r1 = r0.s
                au.com.woolworths.shop.lists.data.database.ProductListItemDao r2 = r1.b
                kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r4 = r0.q
                au.com.woolworths.product.models.ProductCard r5 = r0.r
                r6 = 4
                r7 = 3
                r8 = 2
                r9 = 0
                r10 = 1
                if (r4 == 0) goto L35
                if (r4 == r10) goto L2d
                if (r4 == r8) goto L28
                if (r4 == r7) goto L28
                if (r4 != r6) goto L20
                kotlin.ResultKt.b(r32)
                goto Lc6
            L20:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L28:
                kotlin.ResultKt.b(r32)
                goto Lbb
            L2d:
                int r4 = r0.p
                kotlin.ResultKt.b(r32)
                r11 = r32
                goto L4d
            L35:
                kotlin.ResultKt.b(r32)
                if (r5 == 0) goto L3c
                r4 = r10
                goto L3d
            L3c:
                r4 = r9
            L3d:
                r0.p = r4
                r0.q = r10
                java.lang.String r11 = r0.t
                au.com.woolworths.product.models.ProductId r12 = r0.u
                java.lang.Object r11 = r2.i(r11, r12, r0)
                if (r11 != r3) goto L4d
                goto Lc5
            L4d:
                r12 = r11
                au.com.woolworths.shop.lists.data.entity.ProductListItemEntity r12 = (au.com.woolworths.shop.lists.data.entity.ProductListItemEntity) r12
                if (r12 != 0) goto L8b
                java.lang.String r14 = au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt.a()
                long r16 = au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt.b()
                long r18 = au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt.b()
                au.com.woolworths.shop.lists.data.entity.ProductListItemEntity r13 = new au.com.woolworths.shop.lists.data.entity.ProductListItemEntity
                if (r4 == 0) goto L65
                r28 = r10
                goto L67
            L65:
                r28 = r9
            L67:
                r29 = 432(0x1b0, float:6.05E-43)
                r30 = 0
                java.lang.String r15 = r0.t
                r20 = 0
                r21 = 0
                r23 = 1
                r24 = 0
                r25 = 0
                au.com.woolworths.product.models.ProductId r4 = r0.u
                float r7 = r0.v
                r26 = r4
                r27 = r7
                r13.<init>(r14, r15, r16, r18, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30)
                r0.q = r8
                java.lang.Object r2 = r2.g(r13, r0)
                if (r2 != r3) goto Lbb
                goto Lc5
            L8b:
                long r17 = au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt.b()
                if (r4 == 0) goto L94
                r27 = r10
                goto L96
            L94:
                r27 = r9
            L96:
                r28 = 823(0x337, float:1.153E-42)
                r29 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r19 = 0
                r20 = 0
                r22 = 1
                r23 = 0
                r24 = 0
                r25 = 0
                float r4 = r0.v
                r26 = r4
                au.com.woolworths.shop.lists.data.entity.ProductListItemEntity r4 = au.com.woolworths.shop.lists.data.entity.ProductListItemEntity.copy$default(r12, r13, r14, r15, r17, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29)
                r0.q = r7
                java.lang.Object r2 = r2.k(r4, r0)
                if (r2 != r3) goto Lbb
                goto Lc5
            Lbb:
                if (r5 == 0) goto Lc9
                r0.q = r6
                java.lang.Object r1 = r1.c(r5, r0)
                if (r1 != r3) goto Lc6
            Lc5:
                return r3
            Lc6:
                kotlin.Unit r1 = kotlin.Unit.f24250a
                return r1
            Lc9:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$addOrUpdateProductItem$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsLocalRepositoryImpl$addOrUpdateProductItem$2(float f, ProductCard productCard, ProductId productId, ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl, String str, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListItemsLocalRepositoryImpl;
        this.r = productCard;
        this.s = str;
        this.t = productId;
        this.u = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListItemsLocalRepositoryImpl$addOrUpdateProductItem$2(this.u, this.r, this.t, this.q, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListItemsLocalRepositoryImpl$addOrUpdateProductItem$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl = this.q;
        RoomDatabase roomDatabase = shoppingListItemsLocalRepositoryImpl.f12279a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.u, this.r, this.t, shoppingListItemsLocalRepositoryImpl, this.s, null);
        this.p = 1;
        Object objA = RoomDatabaseKt.a(roomDatabase, anonymousClass1, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
