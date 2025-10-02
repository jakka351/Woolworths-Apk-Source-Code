package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PagingSource;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "K", "", "V", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1", f = "LegacyPageFetcher.jvm.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LegacyPageFetcher$scheduleLoad$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ LegacyPageFetcher r;
    public final /* synthetic */ PagingSource.LoadParams s;
    public final /* synthetic */ LoadType t;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "K", "", "V", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1$1", f = "LegacyPageFetcher.jvm.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.paging.LegacyPageFetcher$scheduleLoad$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ PagingSource.LoadResult p;
        public final /* synthetic */ LegacyPageFetcher q;
        public final /* synthetic */ LoadType r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PagingSource.LoadResult loadResult, LegacyPageFetcher legacyPageFetcher, LoadType loadType, Continuation continuation) {
            super(2, continuation);
            this.p = loadResult;
            this.q = legacyPageFetcher;
            this.r = loadType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.p, this.q, this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LegacyPageFetcher legacyPageFetcher = this.q;
            AtomicBoolean atomicBoolean = legacyPageFetcher.h;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            PagingSource.LoadResult loadResult = this.p;
            boolean z = loadResult instanceof PagingSource.LoadResult.Page;
            LoadType loadType = this.r;
            if (z) {
                legacyPageFetcher.a(loadType, (PagingSource.LoadResult.Page) loadResult);
            } else if (loadResult instanceof PagingSource.LoadResult.Error) {
                Throwable th = ((PagingSource.LoadResult.Error) loadResult).d;
                if (!atomicBoolean.get()) {
                    legacyPageFetcher.i.b(loadType, new LoadState.Error(th));
                }
            } else if (loadResult instanceof PagingSource.LoadResult.Invalid) {
                legacyPageFetcher.c.c();
                atomicBoolean.set(true);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyPageFetcher$scheduleLoad$1(LegacyPageFetcher legacyPageFetcher, PagingSource.LoadParams loadParams, LoadType loadType, Continuation continuation) {
        super(2, continuation);
        this.r = legacyPageFetcher;
        this.s = loadParams;
        this.t = loadType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LegacyPageFetcher$scheduleLoad$1 legacyPageFetcher$scheduleLoad$1 = new LegacyPageFetcher$scheduleLoad$1(this.r, this.s, this.t, continuation);
        legacyPageFetcher$scheduleLoad$1.q = obj;
        return legacyPageFetcher$scheduleLoad$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LegacyPageFetcher$scheduleLoad$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        LegacyPageFetcher legacyPageFetcher = this.r;
        PagingSource pagingSource = legacyPageFetcher.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.q;
            this.q = coroutineScope2;
            this.p = 1;
            Object objD = pagingSource.d(this.s, this);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
            coroutineScope = coroutineScope2;
            obj = objD;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.q;
            ResultKt.b(obj);
        }
        PagingSource.LoadResult loadResult = (PagingSource.LoadResult) obj;
        boolean z = pagingSource.f3581a.e;
        Unit unit = Unit.f24250a;
        if (z) {
            legacyPageFetcher.h.set(true);
            return unit;
        }
        BuildersKt.c(coroutineScope, legacyPageFetcher.d, null, new AnonymousClass1(loadResult, legacyPageFetcher, this.t, null), 2);
        return unit;
    }
}
