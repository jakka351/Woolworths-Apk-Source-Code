package ovh.plrapps.mapcompose.ui.paths;

import android.graphics.Path;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import ovh.plrapps.mapcompose.ui.state.DrawablePathState;
import ovh.plrapps.mapcompose.utils.Point;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", "Lovh/plrapps/mapcompose/ui/paths/PathWithOrigin;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.paths.PathComposerKt$PathCanvas$pathWithOrigin$2", f = "PathComposer.kt", l = {119}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PathComposerKt$PathCanvas$pathWithOrigin$2 extends SuspendLambda implements Function2<ProduceStateScope<PathWithOrigin>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ State s;
    public final /* synthetic */ PathData t;
    public final /* synthetic */ long u;
    public final /* synthetic */ DrawablePathState v;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lovh/plrapps/mapcompose/ui/paths/PathWithOrigin;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.paths.PathComposerKt$PathCanvas$pathWithOrigin$2$1", f = "PathComposer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ovh.plrapps.mapcompose.ui.paths.PathComposerKt$PathCanvas$pathWithOrigin$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PathWithOrigin>, Object> {
        public final /* synthetic */ PathData p;
        public final /* synthetic */ long q;
        public final /* synthetic */ double r;
        public final /* synthetic */ int s;
        public final /* synthetic */ int t;
        public final /* synthetic */ DrawablePathState u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PathData pathData, long j, double d, int i, int i2, DrawablePathState drawablePathState, Continuation continuation) {
            super(2, continuation);
            this.p = pathData;
            this.q = j;
            this.r = d;
            this.s = i;
            this.t = i2;
            this.u = drawablePathState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.p, this.q, this.r, this.s, this.t, this.u, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.Result$Failure] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayListA;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            long j = this.q;
            int i = (int) (j >> 32);
            final DrawablePathState drawablePathState = this.u;
            Function1<List<? extends Point>, Unit> function1 = new Function1<List<? extends Point>, Unit>() { // from class: ovh.plrapps.mapcompose.ui.paths.PathComposerKt.PathCanvas.pathWithOrigin.2.1.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    List it = (List) obj2;
                    Intrinsics.h(it, "it");
                    drawablePathState.f26953a.setValue(it);
                    return Unit.f24250a;
                }
            };
            Path path = new Path();
            List listSubList = this.p.f26948a.subList(i, ((int) (j & 4294967295L)) + i);
            double d = this.r;
            if (d > 0.0d) {
                try {
                    ArrayList arrayList = new ArrayList();
                    RamerDouglaPeuckerKt.a(listSubList, d, arrayList);
                    function1.invoke(arrayList);
                    arrayListA = arrayList;
                } catch (Throwable th) {
                    arrayListA = ResultKt.a(th);
                }
                if (Result.a(arrayListA) == null) {
                    listSubList = arrayListA;
                }
                listSubList = listSubList;
            }
            Iterator it = listSubList.iterator();
            int i2 = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                int i3 = this.s;
                int i4 = this.t;
                if (!zHasNext) {
                    return new PathWithOrigin(path, IntOffsetKt.a(i3, i4));
                }
                int i5 = i2 + 1;
                Point point = (Point) it.next();
                if (i2 == 0) {
                    path.moveTo((float) (point.f26966a - i3), (float) (point.b - i4));
                } else {
                    path.lineTo((float) (point.f26966a - i3), (float) (point.b - i4));
                }
                i2 = i5;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathComposerKt$PathCanvas$pathWithOrigin$2(MutableState mutableState, State state, PathData pathData, long j, DrawablePathState drawablePathState, Continuation continuation) {
        super(2, continuation);
        this.r = mutableState;
        this.s = state;
        this.t = pathData;
        this.u = j;
        this.v = drawablePathState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PathComposerKt$PathCanvas$pathWithOrigin$2 pathComposerKt$PathCanvas$pathWithOrigin$2 = new PathComposerKt$PathCanvas$pathWithOrigin$2(this.r, this.s, this.t, this.u, this.v, continuation);
        pathComposerKt$PathCanvas$pathWithOrigin$2.q = obj;
        return pathComposerKt$PathCanvas$pathWithOrigin$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PathComposerKt$PathCanvas$pathWithOrigin$2) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF;
        ProduceStateScope produceStateScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ProduceStateScope produceStateScope2 = (ProduceStateScope) this.q;
            MutableState mutableState = this.r;
            int i2 = (int) (((IntOffset) mutableState.getD()).f2200a >> 32);
            int i3 = (int) (((IntOffset) mutableState.getD()).f2200a & 4294967295L);
            double dDoubleValue = ((Number) this.s.getD()).doubleValue();
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.t, this.u, dDoubleValue, i2, i3, this.v, null);
            this.q = produceStateScope2;
            this.p = 1;
            objF = BuildersKt.f(defaultScheduler, anonymousClass1, this);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
            produceStateScope = produceStateScope2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            produceStateScope = (ProduceStateScope) this.q;
            ResultKt.b(obj);
            objF = obj;
        }
        produceStateScope.setValue(objF);
        return Unit.f24250a;
    }
}
