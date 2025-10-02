package au.com.woolworths.shop.lists.data.repository;

import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
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
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$deleteTextItem$1", f = "ShoppingListItemsLocalRepositoryImpl.kt", l = {333}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListItemsLocalRepositoryImpl$deleteTextItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListItemsLocalRepositoryImpl q;
    public final /* synthetic */ String r;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$deleteTextItem$1$1", f = "ShoppingListItemsLocalRepositoryImpl.kt", l = {334, 336, 338}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$deleteTextItem$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ ShoppingListItemsLocalRepositoryImpl q;
        public final /* synthetic */ String r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl, String str, Continuation continuation) {
            super(1, continuation);
            this.q = shoppingListItemsLocalRepositoryImpl;
            this.r = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        
            if (r1.f(r6, r22) == r2) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
        
            if (r1.c(r3, r22) == r2) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl r1 = r0.q
                au.com.woolworths.shop.lists.data.database.TextListItemDao r1 = r1.c
                kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r3 = r0.p
                r4 = 3
                r5 = 2
                r6 = 1
                if (r3 == 0) goto L28
                if (r3 == r6) goto L22
                if (r3 == r5) goto L1e
                if (r3 != r4) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L1e:
                kotlin.ResultKt.b(r23)
                goto L6e
            L22:
                kotlin.ResultKt.b(r23)
                r3 = r23
                goto L36
            L28:
                kotlin.ResultKt.b(r23)
                r0.p = r6
                java.lang.String r3 = r0.r
                java.lang.Object r3 = r1.e(r3, r0)
                if (r3 != r2) goto L36
                goto L6d
            L36:
                r6 = r3
                au.com.woolworths.shop.lists.data.entity.TextListItemEntity r6 = (au.com.woolworths.shop.lists.data.entity.TextListItemEntity) r6
                if (r6 == 0) goto L6e
                java.lang.String r3 = r6.getRemoteId()
                if (r3 != 0) goto L4a
                r0.p = r5
                java.lang.Object r1 = r1.f(r6, r0)
                if (r1 != r2) goto L6e
                goto L6d
            L4a:
                long r11 = au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt.b()
                r20 = 887(0x377, float:1.243E-42)
                r21 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r13 = 0
                r14 = 0
                r16 = 0
                r17 = 1
                r18 = 0
                r19 = 0
                au.com.woolworths.shop.lists.data.entity.TextListItemEntity r3 = au.com.woolworths.shop.lists.data.entity.TextListItemEntity.copy$default(r6, r7, r8, r9, r11, r13, r14, r16, r17, r18, r19, r20, r21)
                r0.p = r4
                java.lang.Object r1 = r1.c(r3, r0)
                if (r1 != r2) goto L6e
            L6d:
                return r2
            L6e:
                kotlin.Unit r1 = kotlin.Unit.f24250a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$deleteTextItem$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsLocalRepositoryImpl$deleteTextItem$1(ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl, String str, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListItemsLocalRepositoryImpl;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListItemsLocalRepositoryImpl$deleteTextItem$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListItemsLocalRepositoryImpl$deleteTextItem$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl = this.q;
            RoomDatabase roomDatabase = shoppingListItemsLocalRepositoryImpl.f12279a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(shoppingListItemsLocalRepositoryImpl, this.r, null);
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
