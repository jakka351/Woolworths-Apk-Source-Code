package au.com.woolworths.shop.lists.data;

import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.CancelWorkRunnable;
import au.com.woolworths.shop.lists.data.sync.scheduler.SyncScheduler;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$clearLocalData$2", f = "ShoppingListSyncInteractor.kt", l = {163}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListSyncInteractor$clearLocalData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListSyncInteractor q;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$clearLocalData$2$1", f = "ShoppingListSyncInteractor.kt", l = {164, 165, 166, 167, 168}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$clearLocalData$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Integer>, Object> {
        public int p;
        public final /* synthetic */ ShoppingListSyncInteractor q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShoppingListSyncInteractor shoppingListSyncInteractor, Continuation continuation) {
            super(1, continuation);
            this.q = shoppingListSyncInteractor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r8.p
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor r7 = r8.q
                if (r1 == 0) goto L33
                if (r1 == r6) goto L2f
                if (r1 == r5) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                kotlin.ResultKt.b(r9)
                return r9
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                kotlin.ResultKt.b(r9)
                goto L62
            L27:
                kotlin.ResultKt.b(r9)
                goto L57
            L2b:
                kotlin.ResultKt.b(r9)
                goto L4c
            L2f:
                kotlin.ResultKt.b(r9)
                goto L41
            L33:
                kotlin.ResultKt.b(r9)
                au.com.woolworths.shop.lists.data.database.ShoppingListDao r9 = r7.e
                r8.p = r6
                java.lang.Object r9 = r9.a(r8)
                if (r9 != r0) goto L41
                goto L6c
            L41:
                au.com.woolworths.shop.lists.data.database.ProductListItemDao r9 = r7.f
                r8.p = r5
                java.lang.Object r9 = r9.a(r8)
                if (r9 != r0) goto L4c
                goto L6c
            L4c:
                au.com.woolworths.shop.lists.data.database.TextListItemDao r9 = r7.g
                r8.p = r4
                java.lang.Object r9 = r9.a(r8)
                if (r9 != r0) goto L57
                goto L6c
            L57:
                au.com.woolworths.shop.lists.data.database.ProductDao r9 = r7.h
                r8.p = r3
                java.lang.Object r9 = r9.a(r8)
                if (r9 != r0) goto L62
                goto L6c
            L62:
                au.com.woolworths.shop.lists.data.database.CategoryDao r9 = r7.i
                r8.p = r2
                java.lang.Object r9 = r9.a(r8)
                if (r9 != r0) goto L6d
            L6c:
                return r0
            L6d:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$clearLocalData$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListSyncInteractor$clearLocalData$2(ShoppingListSyncInteractor shoppingListSyncInteractor, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListSyncInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListSyncInteractor$clearLocalData$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListSyncInteractor$clearLocalData$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
        ShoppingListSyncInteractor shoppingListSyncInteractor = this.q;
        SyncScheduler syncScheduler = shoppingListSyncInteractor.f12260a;
        WorkManagerImpl workManagerImpl = syncScheduler.d;
        workManagerImpl.getClass();
        CancelWorkRunnable.c(workManagerImpl);
        syncScheduler.c(0L);
        RoomDatabase roomDatabase = shoppingListSyncInteractor.d;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(shoppingListSyncInteractor, null);
        this.p = 1;
        Object objA = RoomDatabaseKt.a(roomDatabase, anonymousClass1, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
