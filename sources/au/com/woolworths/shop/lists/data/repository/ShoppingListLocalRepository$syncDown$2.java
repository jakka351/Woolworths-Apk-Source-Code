package au.com.woolworths.shop.lists.data.repository;

import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import java.util.ArrayList;
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
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$syncDown$2", f = "ShoppingListLocalRepository.kt", l = {301}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListLocalRepository$syncDown$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListLocalRepository q;
    public final /* synthetic */ ArrayList r;
    public final /* synthetic */ ArrayList s;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$syncDown$2$1", f = "ShoppingListLocalRepository.kt", l = {304, 309}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$syncDown$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Integer>, Object> {
        public int p;
        public final /* synthetic */ ShoppingListLocalRepository q;
        public final /* synthetic */ ArrayList r;
        public final /* synthetic */ ArrayList s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShoppingListLocalRepository shoppingListLocalRepository, ArrayList arrayList, ArrayList arrayList2, Continuation continuation) {
            super(1, continuation);
            this.q = shoppingListLocalRepository;
            this.r = arrayList;
            this.s = arrayList2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, this.s, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r6.p
                au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r2 = r6.q
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L1a
                if (r1 != r3) goto L12
                kotlin.ResultKt.b(r7)
                goto L3e
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                kotlin.ResultKt.b(r7)
                goto L2a
            L1e:
                kotlin.ResultKt.b(r7)
                r6.p = r4
                java.lang.Object r7 = r2.g(r4, r6)
                if (r7 != r0) goto L2a
                goto L3d
            L2a:
                java.util.List r7 = (java.util.List) r7
                au.com.woolworths.shop.lists.data.sync.ShoppingListsSyncDownDelta r1 = new au.com.woolworths.shop.lists.data.sync.ShoppingListsSyncDownDelta
                java.util.ArrayList r4 = r6.r
                java.util.ArrayList r5 = r6.s
                r1.<init>(r7, r4, r5)
                r6.p = r3
                java.lang.Object r7 = r2.b(r1, r6)
                if (r7 != r0) goto L3e
            L3d:
                return r0
            L3e:
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                java.lang.Integer r0 = new java.lang.Integer
                r0.<init>(r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$syncDown$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListLocalRepository$syncDown$2(ShoppingListLocalRepository shoppingListLocalRepository, ArrayList arrayList, ArrayList arrayList2, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListLocalRepository;
        this.r = arrayList;
        this.s = arrayList2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListLocalRepository$syncDown$2(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListLocalRepository$syncDown$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(shoppingListLocalRepository, this.r, this.s, null);
        this.p = 1;
        Object objA = RoomDatabaseKt.a(roomDatabase, anonymousClass1, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
