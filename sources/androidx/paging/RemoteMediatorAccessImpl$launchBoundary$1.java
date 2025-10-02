package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.RemoteMediator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1", f = "RemoteMediatorAccessor.kt", l = {386}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RemoteMediatorAccessImpl$launchBoundary$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RemoteMediatorAccessImpl q;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1", f = "RemoteMediatorAccessor.kt", l = {393}, m = "invokeSuspend")
    /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public LoadType p;
        public int q;
        public final /* synthetic */ RemoteMediatorAccessImpl r;

        @Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0003\u0018\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0006\"\b\b\u0001\u0010\u0005*\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/paging/LoadType;", "Landroidx/paging/PagingState;", "Key", "Value", "", "it", "Landroidx/paging/AccessorState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00801 extends Lambda implements Function1<AccessorState<Object, Object>, Pair<? extends LoadType, ? extends PagingState<Object, Object>>> {
            public static final C00801 h = new C00801(1);

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AccessorState it = (AccessorState) obj;
                Intrinsics.h(it, "it");
                it.getClass();
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RemoteMediatorAccessImpl remoteMediatorAccessImpl, Continuation continuation) {
            super(1, continuation);
            this.r = remoteMediatorAccessImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.r, continuation);
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
            int i = this.q;
            if (i == 0) {
                ResultKt.b(obj);
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LoadType loadType = this.p;
            ResultKt.b(obj);
            RemoteMediator.MediatorResult mediatorResult = (RemoteMediator.MediatorResult) obj;
            if (mediatorResult instanceof RemoteMediator.MediatorResult.Success) {
                new Function1<AccessorState<Object, Object>, Unit>((RemoteMediator.MediatorResult.Success) mediatorResult) { // from class: androidx.paging.RemoteMediatorAccessImpl.launchBoundary.1.1.2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        AccessorState it = (AccessorState) obj2;
                        Intrinsics.h(it, "it");
                        it.a(this.h);
                        return Unit.f24250a;
                    }
                };
                throw null;
            }
            if (!(mediatorResult instanceof RemoteMediator.MediatorResult.Error)) {
                throw null;
            }
            new Function1<AccessorState<Object, Object>, Unit>((RemoteMediator.MediatorResult.Error) mediatorResult) { // from class: androidx.paging.RemoteMediatorAccessImpl.launchBoundary.1.1.3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    AccessorState it = (AccessorState) obj2;
                    Intrinsics.h(it, "it");
                    it.a(this.h);
                    new LoadState.Error(null);
                    throw null;
                }
            };
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteMediatorAccessImpl$launchBoundary$1(RemoteMediatorAccessImpl remoteMediatorAccessImpl, Continuation continuation) {
        super(2, continuation);
        this.q = remoteMediatorAccessImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RemoteMediatorAccessImpl$launchBoundary$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoteMediatorAccessImpl$launchBoundary$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
            return Unit.f24250a;
        }
        ResultKt.b(obj);
        new AnonymousClass1(this.q, null);
        this.p = 1;
        throw null;
    }
}
