package au.com.woolworths.shop.lists.data.workers;

import au.com.woolworths.shop.lists.data.sync.SyncResultKt;
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
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$getSyncListItemsTaskAsync$2", f = "ShoppingListItemsSyncWorker.kt", l = {109}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListItemsSyncWorker$getSyncListItemsTaskAsync$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListItemsSyncWorker q;
    public final /* synthetic */ String r;
    public final /* synthetic */ boolean s;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$getSyncListItemsTaskAsync$2$1", f = "ShoppingListItemsSyncWorker.kt", l = {110, 111}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$getSyncListItemsTaskAsync$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ ShoppingListItemsSyncWorker q;
        public final /* synthetic */ String r;
        public final /* synthetic */ boolean s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShoppingListItemsSyncWorker shoppingListItemsSyncWorker, String str, boolean z, Continuation continuation) {
            super(1, continuation);
            this.q = shoppingListItemsSyncWorker;
            this.r = str;
            this.s = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, this.s, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            if (r1.c((au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity) r6, r5.s, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r5.p
                au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker r2 = r5.q
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L1a
                if (r1 != r3) goto L12
                kotlin.ResultKt.b(r6)
                goto L3d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                kotlin.ResultKt.b(r6)
                goto L2e
            L1e:
                kotlin.ResultKt.b(r6)
                au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r6 = r2.h
                r5.p = r4
                java.lang.String r1 = r5.r
                java.lang.Object r6 = r6.h(r1, r5)
                if (r6 != r0) goto L2e
                goto L3c
            L2e:
                au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity r6 = (au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity) r6
                au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor r1 = r2.i
                r5.p = r3
                boolean r2 = r5.s
                java.lang.Object r6 = r1.c(r6, r2, r5)
                if (r6 != r0) goto L3d
            L3c:
                return r0
            L3d:
                kotlin.Unit r6 = kotlin.Unit.f24250a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$getSyncListItemsTaskAsync$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsSyncWorker$getSyncListItemsTaskAsync$2(ShoppingListItemsSyncWorker shoppingListItemsSyncWorker, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListItemsSyncWorker;
        this.r = str;
        this.s = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListItemsSyncWorker$getSyncListItemsTaskAsync$2(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListItemsSyncWorker$getSyncListItemsTaskAsync$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, this.r, this.s, null);
            this.p = 1;
            if (SyncResultKt.a(anonymousClass1, this) == coroutineSingletons) {
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
