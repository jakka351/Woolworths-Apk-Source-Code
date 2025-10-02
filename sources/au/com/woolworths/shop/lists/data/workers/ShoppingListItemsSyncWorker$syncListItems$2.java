package au.com.woolworths.shop.lists.data.workers;

import androidx.work.ListenableWorker;
import au.com.woolworths.shop.lists.data.sync.SyncResultKt;
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
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncListItems$2", f = "ShoppingListItemsSyncWorker.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListItemsSyncWorker$syncListItems$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListItemsSyncWorker q;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlin/jvm/internal/EnhancedNullability;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncListItems$2$1", f = "ShoppingListItemsSyncWorker.kt", l = {43, 60}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncListItems$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super ListenableWorker.Result>, Object> {
        public List p;
        public int q;
        public int r;
        public final /* synthetic */ ShoppingListItemsSyncWorker s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShoppingListItemsSyncWorker shoppingListItemsSyncWorker, Continuation continuation) {
            super(1, continuation);
            this.s = shoppingListItemsSyncWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.s, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        
            if (r8 == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        
            if (kotlinx.coroutines.CoroutineScopeKt.c(new au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncListItems$4(r2, r3, null), r7) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005e -> B:7:0x0019). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r7.r
                r2 = 0
                au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker r3 = r7.s
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L27
                if (r1 == r5) goto L23
                if (r1 != r4) goto L1b
                int r1 = r7.q
                java.util.List r2 = r7.p
                java.util.List r2 = (java.util.List) r2
                kotlin.ResultKt.b(r8)
                r8 = r2
            L19:
                r2 = r1
                goto L37
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                kotlin.ResultKt.b(r8)
                goto L35
            L27:
                kotlin.ResultKt.b(r8)
                au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r8 = r3.h
                r7.r = r5
                java.lang.Object r8 = r8.g(r2, r7)
                if (r8 != r0) goto L35
                goto L60
            L35:
                java.util.List r8 = (java.util.List) r8
            L37:
                int r1 = r8.size()
                if (r2 >= r1) goto L61
                int r1 = r8.size()
                int r1 = r1 - r2
                r5 = 5
                if (r1 <= r5) goto L46
                r1 = r5
            L46:
                int r1 = r1 + r2
                java.util.List r2 = r8.subList(r2, r1)
                r5 = r8
                java.util.List r5 = (java.util.List) r5
                r7.p = r5
                r7.q = r1
                r7.r = r4
                au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncListItems$4 r5 = new au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncListItems$4
                r6 = 0
                r5.<init>(r2, r3, r6)
                java.lang.Object r2 = kotlinx.coroutines.CoroutineScopeKt.c(r5, r7)
                if (r2 != r0) goto L19
            L60:
                return r0
            L61:
                androidx.work.ListenableWorker$Result$Success r8 = androidx.work.ListenableWorker.Result.a()
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncListItems$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsSyncWorker$syncListItems$2(ShoppingListItemsSyncWorker shoppingListItemsSyncWorker, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListItemsSyncWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListItemsSyncWorker$syncListItems$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListItemsSyncWorker$syncListItems$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, null);
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
