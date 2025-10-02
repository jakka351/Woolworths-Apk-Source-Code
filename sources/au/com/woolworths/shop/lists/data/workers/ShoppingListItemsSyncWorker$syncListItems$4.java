package au.com.woolworths.shop.lists.data.workers;

import au.com.woolworths.shop.lists.data.sync.SyncResultKt;
import java.util.Iterator;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncListItems$4", f = "ShoppingListItemsSyncWorker.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListItemsSyncWorker$syncListItems$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Unit>>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ List r;
    public final /* synthetic */ ShoppingListItemsSyncWorker s;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncListItems$4$1", f = "ShoppingListItemsSyncWorker.kt", l = {81, 84}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncListItems$4$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super List<? extends Unit>>, Object> {
        public List p;
        public ShoppingListItemsSyncWorker q;
        public CoroutineScope r;
        public Iterator s;
        public List t;
        public int u;
        public final /* synthetic */ List v;
        public final /* synthetic */ ShoppingListItemsSyncWorker w;
        public final /* synthetic */ CoroutineScope x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, ShoppingListItemsSyncWorker shoppingListItemsSyncWorker, CoroutineScope coroutineScope, Continuation continuation) {
            super(1, continuation);
            this.v = list;
            this.w = shoppingListItemsSyncWorker;
            this.x = coroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.v, this.w, this.x, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:18:0x0073). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r10.u
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                kotlin.ResultKt.b(r11)
                return r11
            L10:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L18:
                java.util.List r1 = r10.t
                java.util.List r1 = (java.util.List) r1
                java.util.Iterator r4 = r10.s
                kotlinx.coroutines.CoroutineScope r5 = r10.r
                au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker r6 = r10.q
                java.util.List r7 = r10.p
                java.util.List r7 = (java.util.List) r7
                kotlin.ResultKt.b(r11)
                goto L73
            L2a:
                kotlin.ResultKt.b(r11)
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.List r1 = r10.v
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
                au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker r4 = r10.w
                kotlinx.coroutines.CoroutineScope r5 = r10.x
                r6 = r4
                r4 = r1
                r1 = r11
            L41:
                boolean r11 = r4.hasNext()
                r7 = 0
                if (r11 == 0) goto L78
                java.lang.Object r11 = r4.next()
                au.com.woolworths.shop.lists.data.entity.ShoppingListEntity r11 = (au.com.woolworths.shop.lists.data.entity.ShoppingListEntity) r11
                java.lang.String r11 = r11.getId()
                r8 = r1
                java.util.List r8 = (java.util.List) r8
                r10.p = r8
                r10.q = r6
                r10.r = r5
                r10.s = r4
                r10.t = r8
                r10.u = r3
                r6.getClass()
                au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$getSyncListItemsTaskAsync$2 r8 = new au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$getSyncListItemsTaskAsync$2
                r9 = 0
                r8.<init>(r6, r11, r9, r7)
                r11 = 3
                kotlinx.coroutines.Deferred r11 = kotlinx.coroutines.BuildersKt.a(r5, r7, r8, r11)
                if (r11 != r0) goto L72
                goto L8c
            L72:
                r7 = r1
            L73:
                r1.add(r11)
                r1 = r7
                goto L41
            L78:
                java.util.Collection r1 = (java.util.Collection) r1
                r10.p = r7
                r10.q = r7
                r10.r = r7
                r10.s = r7
                r10.t = r7
                r10.u = r2
                java.lang.Object r11 = kotlinx.coroutines.AwaitKt.a(r1, r10)
                if (r11 != r0) goto L8d
            L8c:
                return r0
            L8d:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncListItems$4.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsSyncWorker$syncListItems$4(List list, ShoppingListItemsSyncWorker shoppingListItemsSyncWorker, Continuation continuation) {
        super(2, continuation);
        this.r = list;
        this.s = shoppingListItemsSyncWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShoppingListItemsSyncWorker$syncListItems$4 shoppingListItemsSyncWorker$syncListItems$4 = new ShoppingListItemsSyncWorker$syncListItems$4(this.r, this.s, continuation);
        shoppingListItemsSyncWorker$syncListItems$4.q = obj;
        return shoppingListItemsSyncWorker$syncListItems$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListItemsSyncWorker$syncListItems$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, (CoroutineScope) this.q, null);
        this.p = 1;
        Object objA = SyncResultKt.a(anonymousClass1, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
