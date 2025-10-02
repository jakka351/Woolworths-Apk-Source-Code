package au.com.woolworths.shop.lists.data.repository;

import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import au.com.woolworths.shop.lists.data.entity.ShoppingListEntity;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$delete$2", f = "ShoppingListLocalRepository.kt", l = {252}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListLocalRepository$delete$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListLocalRepository q;
    public final /* synthetic */ ShoppingListEntity r;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$delete$2$1", f = "ShoppingListLocalRepository.kt", l = {254, 255, 259}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$delete$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
        public int p;
        public final /* synthetic */ ShoppingListLocalRepository q;
        public final /* synthetic */ ShoppingListEntity r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShoppingListLocalRepository shoppingListLocalRepository, ShoppingListEntity shoppingListEntity, Continuation continuation) {
            super(1, continuation);
            this.q = shoppingListLocalRepository;
            this.r = shoppingListEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
        
            if (r1.b(r4, r24) == r2) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
        
            if (r1.l(r4, r24) == r2) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                r24 = this;
                r0 = r24
                au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r1 = r0.q
                au.com.woolworths.shop.lists.data.database.ShoppingListDao r1 = r1.b
                kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r3 = r0.p
                au.com.woolworths.shop.lists.data.entity.ShoppingListEntity r4 = r0.r
                r5 = 3
                r6 = 2
                r7 = 1
                if (r3 == 0) goto L30
                if (r3 == r7) goto L2a
                if (r3 == r6) goto L26
                if (r3 != r5) goto L1e
                kotlin.ResultKt.b(r25)
                r23 = r7
                goto L8c
            L1e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L26:
                kotlin.ResultKt.b(r25)
                goto L54
            L2a:
                kotlin.ResultKt.b(r25)
                r3 = r25
                goto L40
            L30:
                kotlin.ResultKt.b(r25)
                java.lang.String r3 = r4.getId()
                r0.p = r7
                java.lang.Object r3 = r1.k(r3, r0)
                if (r3 != r2) goto L40
                goto L8b
            L40:
                kotlin.jvm.internal.Intrinsics.e(r3)
                au.com.woolworths.shop.lists.data.entity.ShoppingListEntity r3 = (au.com.woolworths.shop.lists.data.entity.ShoppingListEntity) r3
                java.lang.String r3 = r3.getRemoteId()
                if (r3 != 0) goto L56
                r0.p = r6
                java.lang.Object r1 = r1.b(r4, r0)
                if (r1 != r2) goto L54
                goto L8b
            L54:
                r7 = 0
                goto L8e
            L56:
                long r8 = au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt.b()
                r21 = 4027(0xfbb, float:5.643E-42)
                r22 = 0
                r3 = r5
                r5 = 0
                r10 = r7
                r6 = 0
                r11 = r10
                r10 = 0
                r13 = r11
                r11 = 0
                r14 = r13
                r13 = 0
                r15 = r14
                r14 = 1
                r16 = r15
                r15 = 0
                r18 = r16
                r16 = 0
                r19 = r18
                r18 = 0
                r20 = r19
                r19 = 0
                r23 = r20
                r20 = 0
                au.com.woolworths.shop.lists.data.entity.ShoppingListEntity r4 = au.com.woolworths.shop.lists.data.entity.ShoppingListEntity.copy$default(r4, r5, r6, r8, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22)
                r0.p = r3
                java.lang.Object r1 = r1.l(r4, r0)
                if (r1 != r2) goto L8c
            L8b:
                return r2
            L8c:
                r7 = r23
            L8e:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$delete$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListLocalRepository$delete$2(ShoppingListLocalRepository shoppingListLocalRepository, ShoppingListEntity shoppingListEntity, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListLocalRepository;
        this.r = shoppingListEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListLocalRepository$delete$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListLocalRepository$delete$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
        ShoppingListLocalRepository shoppingListLocalRepository = this.q;
        RoomDatabase roomDatabase = shoppingListLocalRepository.f12281a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(shoppingListLocalRepository, this.r, null);
        this.p = 1;
        Object objA = RoomDatabaseKt.a(roomDatabase, anonymousClass1, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
