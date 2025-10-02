package au.com.woolworths.shop.lists.data.workers;

import androidx.work.ListenableWorker;
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

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncSingleListItems$2", f = "ShoppingListItemsSyncWorker.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListItemsSyncWorker$syncSingleListItems$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ShoppingListItemsSyncWorker r;
    public final /* synthetic */ String s;
    public final /* synthetic */ boolean t;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlin/jvm/internal/EnhancedNullability;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncSingleListItems$2$1", f = "ShoppingListItemsSyncWorker.kt", l = {93, 93, 96}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncSingleListItems$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super ListenableWorker.Result>, Object> {
        public int p;
        public final /* synthetic */ ShoppingListItemsSyncWorker q;
        public final /* synthetic */ CoroutineScope r;
        public final /* synthetic */ String s;
        public final /* synthetic */ boolean t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShoppingListItemsSyncWorker shoppingListItemsSyncWorker, CoroutineScope coroutineScope, String str, boolean z, Continuation continuation) {
            super(1, continuation);
            this.q = shoppingListItemsSyncWorker;
            this.r = coroutineScope;
            this.s = str;
            this.t = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, this.s, this.t, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        
            if (r8.k(r2, r7) != r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r7.p
                java.lang.String r2 = r7.s
                au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker r3 = r7.q
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L27
                if (r1 == r6) goto L23
                if (r1 == r5) goto L1f
                if (r1 != r4) goto L17
                kotlin.ResultKt.b(r8)
                goto L53
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.ResultKt.b(r8)
                goto L48
            L23:
                kotlin.ResultKt.b(r8)
                goto L3d
            L27:
                kotlin.ResultKt.b(r8)
                r7.p = r6
                au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$getSyncListItemsTaskAsync$2 r8 = new au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$getSyncListItemsTaskAsync$2
                boolean r1 = r7.t
                r6 = 0
                r8.<init>(r3, r2, r1, r6)
                kotlinx.coroutines.CoroutineScope r1 = r7.r
                kotlinx.coroutines.Deferred r8 = kotlinx.coroutines.BuildersKt.a(r1, r6, r8, r4)
                if (r8 != r0) goto L3d
                goto L52
            L3d:
                kotlinx.coroutines.Deferred r8 = (kotlinx.coroutines.Deferred) r8
                r7.p = r5
                java.lang.Object r8 = r8.await(r7)
                if (r8 != r0) goto L48
                goto L52
            L48:
                au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r8 = r3.h
                r7.p = r4
                java.lang.Object r8 = r8.k(r2, r7)
                if (r8 != r0) goto L53
            L52:
                return r0
            L53:
                androidx.work.ListenableWorker$Result$Success r8 = androidx.work.ListenableWorker.Result.a()
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncSingleListItems$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsSyncWorker$syncSingleListItems$2(ShoppingListItemsSyncWorker shoppingListItemsSyncWorker, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.r = shoppingListItemsSyncWorker;
        this.s = str;
        this.t = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShoppingListItemsSyncWorker$syncSingleListItems$2 shoppingListItemsSyncWorker$syncSingleListItems$2 = new ShoppingListItemsSyncWorker$syncSingleListItems$2(this.r, this.s, this.t, continuation);
        shoppingListItemsSyncWorker$syncSingleListItems$2.q = obj;
        return shoppingListItemsSyncWorker$syncSingleListItems$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListItemsSyncWorker$syncSingleListItems$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, (CoroutineScope) this.q, this.s, this.t, null);
            this.p = 1;
            obj = SyncResultKt.a(anonymousClass1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ListenableWorker.Result result = (ListenableWorker.Result) obj;
        return result == null ? new ListenableWorker.Result.Retry() : result;
    }
}
