package androidx.paging;

import androidx.paging.RemoteMediator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1", f = "RemoteMediatorAccessor.kt", l = {314}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RemoteMediatorAccessImpl$launchRefresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Ref.BooleanRef p;
    public int q;
    public final /* synthetic */ RemoteMediatorAccessImpl r;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1", f = "RemoteMediatorAccessor.kt", l = {321}, m = "invokeSuspend")
    /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public Object p;
        public Ref.BooleanRef q;
        public int r;
        public final /* synthetic */ RemoteMediatorAccessImpl s;
        public final /* synthetic */ Ref.BooleanRef t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RemoteMediatorAccessImpl remoteMediatorAccessImpl, Ref.BooleanRef booleanRef, Continuation continuation) {
            super(1, continuation);
            this.s = remoteMediatorAccessImpl;
            this.t = booleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.s, this.t, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((Continuation) obj);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.r;
            if (i == 0) {
                ResultKt.b(obj);
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RemoteMediatorAccessImpl remoteMediatorAccessImpl = (RemoteMediatorAccessImpl) this.p;
            ResultKt.b(obj);
            RemoteMediator.MediatorResult mediatorResult = (RemoteMediator.MediatorResult) obj;
            if (mediatorResult instanceof RemoteMediator.MediatorResult.Success) {
                remoteMediatorAccessImpl.getClass();
                new RemoteMediatorAccessImpl$launchRefresh$1$1$1$1(1);
                throw null;
            }
            if (!(mediatorResult instanceof RemoteMediator.MediatorResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            remoteMediatorAccessImpl.getClass();
            new RemoteMediatorAccessImpl$launchRefresh$1$1$1$2(1);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteMediatorAccessImpl$launchRefresh$1(RemoteMediatorAccessImpl remoteMediatorAccessImpl, Continuation continuation) {
        super(2, continuation);
        this.r = remoteMediatorAccessImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RemoteMediatorAccessImpl$launchRefresh$1(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoteMediatorAccessImpl$launchRefresh$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        RemoteMediatorAccessImpl remoteMediatorAccessImpl = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            new AnonymousClass1(remoteMediatorAccessImpl, booleanRef, null);
            this.p = booleanRef;
            this.q = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.BooleanRef booleanRef2 = this.p;
        ResultKt.b(obj);
        if (booleanRef2.d) {
            BuildersKt.c(null, null, null, new RemoteMediatorAccessImpl$launchBoundary$1(remoteMediatorAccessImpl, null), 3);
        }
        return Unit.f24250a;
    }
}
