package ovh.plrapps.mapcompose.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectImplementation;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.core.TileCollector$tileCollectorKernel$1", f = "TileCollector.kt", l = {309}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes8.dex */
final class TileCollector$tileCollectorKernel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public List p;
    public int q;
    public final /* synthetic */ BufferedChannel r;
    public final /* synthetic */ ReceiveChannel s;
    public final /* synthetic */ TileCollector t;
    public final /* synthetic */ BufferedChannel u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileCollector$tileCollectorKernel$1(BufferedChannel bufferedChannel, ReceiveChannel receiveChannel, TileCollector tileCollector, BufferedChannel bufferedChannel2, Continuation continuation) {
        super(2, continuation);
        this.r = bufferedChannel;
        this.s = receiveChannel;
        this.t = tileCollector;
        this.u = bufferedChannel2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TileCollector$tileCollectorKernel$1(this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((TileCollector$tileCollectorKernel$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List arrayList;
        SelectImplementation selectImplementation;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            arrayList = new ArrayList();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = this.p;
            ResultKt.b(obj);
        }
        do {
            selectImplementation = new SelectImplementation(getE());
            SelectClause1 selectClause1T = this.r.t();
            TileCollector tileCollector = this.t;
            selectImplementation.j(selectClause1T, new TileCollector$tileCollectorKernel$1$1$1(arrayList, tileCollector, null));
            selectImplementation.j(this.s.t(), new TileCollector$tileCollectorKernel$1$1$2(arrayList, tileCollector, this.u, null));
            this.p = arrayList;
            this.q = 1;
        } while (selectImplementation.g(this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
