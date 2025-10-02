package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "K", "", "V", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.ContiguousPagedList$deferBoundaryCallbacks$1", f = "ContiguousPagedList.jvm.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ContiguousPagedList$deferBoundaryCallbacks$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean p;
    public final /* synthetic */ ContiguousPagedList q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContiguousPagedList$deferBoundaryCallbacks$1(boolean z, ContiguousPagedList contiguousPagedList, boolean z2, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.p = z;
        this.q = contiguousPagedList;
        this.r = z2;
        this.s = z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContiguousPagedList$deferBoundaryCallbacks$1(this.p, this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ContiguousPagedList$deferBoundaryCallbacks$1 contiguousPagedList$deferBoundaryCallbacks$1 = (ContiguousPagedList$deferBoundaryCallbacks$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        contiguousPagedList$deferBoundaryCallbacks$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        if (this.p) {
            throw null;
        }
        boolean z = this.r;
        ContiguousPagedList contiguousPagedList = this.q;
        if (z) {
            contiguousPagedList.r = true;
        }
        if (this.s) {
            contiguousPagedList.s = true;
        }
        int i = ContiguousPagedList.y;
        contiguousPagedList.u(false);
        return Unit.f24250a;
    }
}
