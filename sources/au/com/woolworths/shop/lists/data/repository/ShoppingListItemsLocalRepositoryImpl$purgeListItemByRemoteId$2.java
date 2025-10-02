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
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$purgeListItemByRemoteId$2", f = "ShoppingListItemsLocalRepositoryImpl.kt", l = {356}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListItemsLocalRepositoryImpl$purgeListItemByRemoteId$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListItemsLocalRepositoryImpl q;
    public final /* synthetic */ String r;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$purgeListItemByRemoteId$2$1", f = "ShoppingListItemsLocalRepositoryImpl.kt", l = {357, 359, 360, 364, 366}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$purgeListItemByRemoteId$2$1, reason: invalid class name */
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

        /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0072 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0073 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl r0 = r12.q
                au.com.woolworths.shop.lists.data.database.TextListItemDao r1 = r0.c
                au.com.woolworths.shop.lists.data.database.ProductListItemDao r2 = r0.b
                kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r4 = r12.p
                kotlin.Unit r5 = kotlin.Unit.f24250a
                java.lang.String r6 = r12.r
                r7 = 5
                r8 = 4
                r9 = 3
                r10 = 2
                r11 = 1
                if (r4 == 0) goto L3b
                if (r4 == r11) goto L37
                if (r4 == r10) goto L33
                if (r4 == r9) goto L2f
                if (r4 == r8) goto L2b
                if (r4 != r7) goto L23
                kotlin.ResultKt.b(r13)
                return r5
            L23:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L2b:
                kotlin.ResultKt.b(r13)
                goto L66
            L2f:
                kotlin.ResultKt.b(r13)
                return r5
            L33:
                kotlin.ResultKt.b(r13)
                goto L54
            L37:
                kotlin.ResultKt.b(r13)
                goto L47
            L3b:
                kotlin.ResultKt.b(r13)
                r12.p = r11
                java.lang.Object r13 = r2.h(r6, r12)
                if (r13 != r3) goto L47
                goto L72
            L47:
                au.com.woolworths.shop.lists.data.entity.ProductListItemEntity r13 = (au.com.woolworths.shop.lists.data.entity.ProductListItemEntity) r13
                if (r13 == 0) goto L5d
                r12.p = r10
                java.lang.Object r13 = r2.j(r13, r12)
                if (r13 != r3) goto L54
                goto L72
            L54:
                r12.p = r9
                java.lang.Object r13 = au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl.u(r0, r12)
                if (r13 != r3) goto L73
                goto L72
            L5d:
                r12.p = r8
                java.lang.Object r13 = r1.g(r6, r12)
                if (r13 != r3) goto L66
                goto L72
            L66:
                au.com.woolworths.shop.lists.data.entity.TextListItemEntity r13 = (au.com.woolworths.shop.lists.data.entity.TextListItemEntity) r13
                if (r13 == 0) goto L73
                r12.p = r7
                java.lang.Object r13 = r1.f(r13, r12)
                if (r13 != r3) goto L73
            L72:
                return r3
            L73:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$purgeListItemByRemoteId$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsLocalRepositoryImpl$purgeListItemByRemoteId$2(ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl, String str, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListItemsLocalRepositoryImpl;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListItemsLocalRepositoryImpl$purgeListItemByRemoteId$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListItemsLocalRepositoryImpl$purgeListItemByRemoteId$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
