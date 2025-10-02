package androidx.room;

import androidx.room.InvalidationTracker;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\r\u0012\t\u0012\u0007H\u0002¢\u0006\u0002\b\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/jvm/JvmSuppressWildcards;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CoroutinesRoom$Companion$createFlow$1 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ RoomDatabase s;
    public final /* synthetic */ String[] t;
    public final /* synthetic */ Callable u;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", l = {137}, m = "invokeSuspend")
    /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public final /* synthetic */ boolean r;
        public final /* synthetic */ RoomDatabase s;
        public final /* synthetic */ FlowCollector t;
        public final /* synthetic */ String[] u;
        public final /* synthetic */ Callable v;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", l = {128, 130}, m = "invokeSuspend")
        /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public ChannelIterator p;
            public int q;
            public final /* synthetic */ RoomDatabase r;
            public final /* synthetic */ CoroutinesRoom$Companion$createFlow$1$1$observer$1 s;
            public final /* synthetic */ BufferedChannel t;
            public final /* synthetic */ Callable u;
            public final /* synthetic */ BufferedChannel v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00841(RoomDatabase roomDatabase, CoroutinesRoom$Companion$createFlow$1$1$observer$1 coroutinesRoom$Companion$createFlow$1$1$observer$1, BufferedChannel bufferedChannel, Callable callable, BufferedChannel bufferedChannel2, Continuation continuation) {
                super(2, continuation);
                this.r = roomDatabase;
                this.s = coroutinesRoom$Companion$createFlow$1$1$observer$1;
                this.t = bufferedChannel;
                this.u = callable;
                this.v = bufferedChannel2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00841(this.r, this.s, this.t, this.u, this.v, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00841) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
            
                if (r6.z(r9, r8) == r0) goto L26;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x004b A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:18:0x0035, B:22:0x0043, B:24:0x004b, B:14:0x0023, B:17:0x002f), top: B:31:0x000a }] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005e -> B:8:0x0015). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                    int r1 = r8.q
                    r2 = 2
                    r3 = 1
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1 r4 = r8.s
                    androidx.room.RoomDatabase r5 = r8.r
                    if (r1 == 0) goto L27
                    if (r1 == r3) goto L21
                    if (r1 != r2) goto L19
                    kotlinx.coroutines.channels.ChannelIterator r1 = r8.p
                    kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L17
                L15:
                    r9 = r1
                    goto L35
                L17:
                    r9 = move-exception
                    goto L69
                L19:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L21:
                    kotlinx.coroutines.channels.ChannelIterator r1 = r8.p
                    kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L17
                    goto L43
                L27:
                    kotlin.ResultKt.b(r9)
                    androidx.room.InvalidationTracker r9 = r5.e
                    r9.a(r4)
                    kotlinx.coroutines.channels.BufferedChannel r9 = r8.t     // Catch: java.lang.Throwable -> L17
                    kotlinx.coroutines.channels.ChannelIterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L17
                L35:
                    r8.p = r9     // Catch: java.lang.Throwable -> L17
                    r8.q = r3     // Catch: java.lang.Throwable -> L17
                    java.lang.Object r1 = r9.b(r8)     // Catch: java.lang.Throwable -> L17
                    if (r1 != r0) goto L40
                    goto L60
                L40:
                    r7 = r1
                    r1 = r9
                    r9 = r7
                L43:
                    java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L17
                    boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L17
                    if (r9 == 0) goto L61
                    r1.next()     // Catch: java.lang.Throwable -> L17
                    java.util.concurrent.Callable r9 = r8.u     // Catch: java.lang.Throwable -> L17
                    java.lang.Object r9 = r9.call()     // Catch: java.lang.Throwable -> L17
                    kotlinx.coroutines.channels.BufferedChannel r6 = r8.v     // Catch: java.lang.Throwable -> L17
                    r8.p = r1     // Catch: java.lang.Throwable -> L17
                    r8.q = r2     // Catch: java.lang.Throwable -> L17
                    java.lang.Object r9 = r6.z(r9, r8)     // Catch: java.lang.Throwable -> L17
                    if (r9 != r0) goto L15
                L60:
                    return r0
                L61:
                    androidx.room.InvalidationTracker r9 = r5.e
                    r9.c(r4)
                    kotlin.Unit r9 = kotlin.Unit.f24250a
                    return r9
                L69:
                    androidx.room.InvalidationTracker r0 = r5.e
                    r0.c(r4)
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1.C00841.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, RoomDatabase roomDatabase, FlowCollector flowCollector, String[] strArr, Callable callable, Continuation continuation) {
            super(2, continuation);
            this.r = z;
            this.s = roomDatabase;
            this.t = flowCollector;
            this.u = strArr;
            this.v = callable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, this.t, this.u, this.v, continuation);
            anonymousClass1.q = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Type inference failed for: r8v0, types: [androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineContext coroutineContextB;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            Unit unit = Unit.f24250a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.q;
            final BufferedChannel bufferedChannelA = ChannelKt.a(-1, 6, null);
            final String[] strArr = this.u;
            ?? r8 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1
                @Override // androidx.room.InvalidationTracker.Observer
                public final void a(Set set) {
                    bufferedChannelA.k(Unit.f24250a);
                }
            };
            bufferedChannelA.k(unit);
            TransactionElement transactionElement = (TransactionElement) coroutineScope.getE().get(TransactionElement.f);
            if (transactionElement != null) {
                coroutineContextB = transactionElement.d;
            } else {
                boolean z = this.r;
                RoomDatabase roomDatabase = this.s;
                coroutineContextB = z ? CoroutinesRoomKt.b(roomDatabase) : CoroutinesRoomKt.a(roomDatabase);
            }
            BufferedChannel bufferedChannelA2 = ChannelKt.a(0, 7, null);
            BuildersKt.c(coroutineScope, coroutineContextB, null, new C00841(this.s, r8, bufferedChannelA, this.v, bufferedChannelA2, null), 2);
            this.p = 1;
            return FlowKt.t(this.t, bufferedChannelA2, this) == coroutineSingletons ? coroutineSingletons : unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$createFlow$1(boolean z, RoomDatabase roomDatabase, String[] strArr, Callable callable, Continuation continuation) {
        super(2, continuation);
        this.r = z;
        this.s = roomDatabase;
        this.t = strArr;
        this.u = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new CoroutinesRoom$Companion$createFlow$1(this.r, this.s, this.t, this.u, continuation);
        coroutinesRoom$Companion$createFlow$1.q = obj;
        return coroutinesRoom$Companion$createFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutinesRoom$Companion$createFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, (FlowCollector) this.q, this.t, this.u, null);
            this.p = 1;
            if (CoroutineScopeKt.c(anonymousClass1, this) == coroutineSingletons) {
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
