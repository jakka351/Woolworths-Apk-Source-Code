package au.com.woolworths.shop.lists.data.repository;

import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import au.com.woolworths.shop.lists.data.entity.TextListItemEntity;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$addOrUpdateTextItem$2", f = "ShoppingListItemsLocalRepositoryImpl.kt", l = {251}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListItemsLocalRepositoryImpl$addOrUpdateTextItem$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListItemsLocalRepositoryImpl q;
    public final /* synthetic */ TextListItemEntity r;
    public final /* synthetic */ Function1 s;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$addOrUpdateTextItem$2$1", f = "ShoppingListItemsLocalRepositoryImpl.kt", l = {255, 262, 269, 276}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$addOrUpdateTextItem$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        public String p;
        public int q;
        public final /* synthetic */ TextListItemEntity r;
        public final /* synthetic */ ShoppingListItemsLocalRepositoryImpl s;
        public final /* synthetic */ Function1 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextListItemEntity textListItemEntity, ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl, Continuation continuation, Function1 function1) {
            super(1, continuation);
            this.r = textListItemEntity;
            this.s = shoppingListItemsLocalRepositoryImpl;
            this.t = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.r, this.s, continuation, this.t);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        
            if (r3 == r2) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        
            if (r3 == r2) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[PHI: r3
  0x005f: PHI (r3v10 au.com.woolworths.shop.lists.data.entity.TextListItemEntity) = 
  (r3v5 au.com.woolworths.shop.lists.data.entity.TextListItemEntity)
  (r3v14 au.com.woolworths.shop.lists.data.entity.TextListItemEntity)
 binds: [B:21:0x004e, B:25:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                r23 = this;
                r0 = r23
                au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl r1 = r0.s
                au.com.woolworths.shop.lists.data.database.TextListItemDao r1 = r1.c
                kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r3 = r0.q
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                au.com.woolworths.shop.lists.data.entity.TextListItemEntity r8 = r0.r
                if (r3 == 0) goto L34
                if (r3 == r7) goto L2e
                if (r3 == r6) goto L28
                if (r3 == r5) goto L1a
                if (r3 != r4) goto L20
            L1a:
                java.lang.String r1 = r0.p
                kotlin.ResultKt.b(r24)
                return r1
            L20:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L28:
                kotlin.ResultKt.b(r24)
                r3 = r24
                goto L5d
            L2e:
                kotlin.ResultKt.b(r24)
                r3 = r24
                goto L4a
            L34:
                kotlin.ResultKt.b(r24)
                java.lang.String r3 = r8.getRemoteId()
                if (r3 == 0) goto L4d
                java.lang.String r3 = r8.getRemoteId()
                r0.q = r7
                java.lang.Object r3 = r1.g(r3, r0)
                if (r3 != r2) goto L4a
                goto La0
            L4a:
                au.com.woolworths.shop.lists.data.entity.TextListItemEntity r3 = (au.com.woolworths.shop.lists.data.entity.TextListItemEntity) r3
                goto L4e
            L4d:
                r3 = 0
            L4e:
                if (r3 != 0) goto L5f
                java.lang.String r3 = r8.getId()
                r0.q = r6
                java.lang.Object r3 = r1.e(r3, r0)
                if (r3 != r2) goto L5d
                goto La0
            L5d:
                au.com.woolworths.shop.lists.data.entity.TextListItemEntity r3 = (au.com.woolworths.shop.lists.data.entity.TextListItemEntity) r3
            L5f:
                kotlin.jvm.functions.Function1 r6 = r0.t
                java.lang.Object r6 = r6.invoke(r3)
                r7 = r6
                au.com.woolworths.shop.lists.data.entity.TextListItemEntity r7 = (au.com.woolworths.shop.lists.data.entity.TextListItemEntity) r7
                java.lang.String r8 = au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt.a()
                if (r3 != 0) goto L92
                r21 = 1022(0x3fe, float:1.432E-42)
                r22 = 0
                r9 = 0
                r10 = 0
                r12 = 0
                r14 = 0
                r15 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                au.com.woolworths.shop.lists.data.entity.TextListItemEntity r3 = au.com.woolworths.shop.lists.data.entity.TextListItemEntity.copy$default(r7, r8, r9, r10, r12, r14, r15, r17, r18, r19, r20, r21, r22)
                r0.p = r8
                r0.q = r5
                java.lang.Object r1 = r1.h(r3, r0)
                if (r1 != r2) goto L91
                goto La0
            L91:
                return r8
            L92:
                java.lang.String r3 = r7.getId()
                r0.p = r3
                r0.q = r4
                java.lang.Object r1 = r1.c(r7, r0)
                if (r1 != r2) goto La1
            La0:
                return r2
            La1:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$addOrUpdateTextItem$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsLocalRepositoryImpl$addOrUpdateTextItem$2(TextListItemEntity textListItemEntity, ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.q = shoppingListItemsLocalRepositoryImpl;
        this.r = textListItemEntity;
        this.s = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListItemsLocalRepositoryImpl$addOrUpdateTextItem$2(this.r, this.q, continuation, this.s);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListItemsLocalRepositoryImpl$addOrUpdateTextItem$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, shoppingListItemsLocalRepositoryImpl, null, this.s);
        this.p = 1;
        Object objA = RoomDatabaseKt.a(roomDatabase, anonymousClass1, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
