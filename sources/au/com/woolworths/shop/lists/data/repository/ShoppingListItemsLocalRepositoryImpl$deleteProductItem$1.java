package au.com.woolworths.shop.lists.data.repository;

import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$deleteProductItem$1", f = "ShoppingListItemsLocalRepositoryImpl.kt", l = {310}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListItemsLocalRepositoryImpl$deleteProductItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListItemsLocalRepositoryImpl q;
    public final /* synthetic */ String r;
    public final /* synthetic */ ProductId s;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$deleteProductItem$1$1", f = "ShoppingListItemsLocalRepositoryImpl.kt", l = {311, 316, 317, 319}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$deleteProductItem$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public ShoppingListItemsLocalRepositoryImpl p;
        public int q;
        public final /* synthetic */ ShoppingListItemsLocalRepositoryImpl r;
        public final /* synthetic */ String s;
        public final /* synthetic */ ProductId t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl, String str, ProductId productId, Continuation continuation) {
            super(1, continuation);
            this.r = shoppingListItemsLocalRepositoryImpl;
            this.s = str;
            this.t = productId;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.r, this.s, this.t, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
        
            if (au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl.u(r1, r26) != r3) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
        
            if (r2.k(r1, r26) == r3) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                r26 = this;
                r0 = r26
                au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl r1 = r0.r
                au.com.woolworths.shop.lists.data.database.ProductListItemDao r2 = r1.b
                kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r4 = r0.q
                r5 = 4
                r6 = 3
                r7 = 2
                r8 = 1
                if (r4 == 0) goto L31
                if (r4 == r8) goto L2b
                if (r4 == r7) goto L25
                if (r4 == r6) goto L21
                if (r4 != r5) goto L19
                goto L21
            L19:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L21:
                kotlin.ResultKt.b(r27)
                goto L8b
            L25:
                au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl r1 = r0.p
                kotlin.ResultKt.b(r27)
                goto L57
            L2b:
                kotlin.ResultKt.b(r27)
                r4 = r27
                goto L41
            L31:
                kotlin.ResultKt.b(r27)
                r0.q = r8
                java.lang.String r4 = r0.s
                au.com.woolworths.product.models.ProductId r8 = r0.t
                java.lang.Object r4 = r2.i(r4, r8, r0)
                if (r4 != r3) goto L41
                goto L8a
            L41:
                r8 = r4
                au.com.woolworths.shop.lists.data.entity.ProductListItemEntity r8 = (au.com.woolworths.shop.lists.data.entity.ProductListItemEntity) r8
                if (r8 == 0) goto L8b
                java.lang.String r4 = r8.getRemoteId()
                if (r4 != 0) goto L63
                r0.p = r1
                r0.q = r7
                java.lang.Object r2 = r2.j(r8, r0)
                if (r2 != r3) goto L57
                goto L8a
            L57:
                r2 = 0
                r0.p = r2
                r0.q = r6
                java.lang.Object r1 = au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl.u(r1, r0)
                if (r1 != r3) goto L8b
                goto L8a
            L63:
                long r13 = au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt.b()
                r24 = 3959(0xf77, float:5.548E-42)
                r25 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r15 = 0
                r16 = 0
                r18 = 0
                r19 = 1
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                au.com.woolworths.shop.lists.data.entity.ProductListItemEntity r1 = au.com.woolworths.shop.lists.data.entity.ProductListItemEntity.copy$default(r8, r9, r10, r11, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25)
                r0.q = r5
                java.lang.Object r1 = r2.k(r1, r0)
                if (r1 != r3) goto L8b
            L8a:
                return r3
            L8b:
                kotlin.Unit r1 = kotlin.Unit.f24250a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$deleteProductItem$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsLocalRepositoryImpl$deleteProductItem$1(ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl, String str, ProductId productId, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListItemsLocalRepositoryImpl;
        this.r = str;
        this.s = productId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListItemsLocalRepositoryImpl$deleteProductItem$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListItemsLocalRepositoryImpl$deleteProductItem$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl = this.q;
            RoomDatabase roomDatabase = shoppingListItemsLocalRepositoryImpl.f12279a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(shoppingListItemsLocalRepositoryImpl, this.r, this.s, null);
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
