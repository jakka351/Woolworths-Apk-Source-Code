package ovh.plrapps.mapcompose.api;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.MutexImpl;
import ovh.plrapps.mapcompose.utils.Point;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.api.LayoutApiKt", f = "LayoutApi.kt", l = {358, 360}, m = "scrollTo-38CYSgM")
/* loaded from: classes8.dex */
final class LayoutApiKt$scrollTo$3 extends ContinuationImpl {
    public BoundingBox p;
    public SpringSpec q;
    public /* synthetic */ Object r;
    public int s;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LayoutApiKt$scrollTo$3 layoutApiKt$scrollTo$3;
        this.r = obj;
        int i = this.s | Integer.MIN_VALUE;
        this.s = i;
        MutexImpl mutexImpl = LayoutApiKt.f26931a;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.s = i - Integer.MIN_VALUE;
            layoutApiKt$scrollTo$3 = this;
        } else {
            layoutApiKt$scrollTo$3 = new LayoutApiKt$scrollTo$3(this);
        }
        Object obj2 = layoutApiKt$scrollTo$3.r;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = layoutApiKt$scrollTo$3.s;
        if (i2 == 0) {
            ResultKt.b(obj2);
            throw null;
        }
        if (i2 == 1) {
            SpringSpec springSpec = layoutApiKt$scrollTo$3.q;
            BoundingBox boundingBox = layoutApiKt$scrollTo$3.p;
            ResultKt.b(obj2);
            Pair pairA = LayoutApiKt.a(null, boundingBox, 0L);
            Point point = (Point) pairA.d;
            double dDoubleValue = ((Number) pairA.e).doubleValue();
            double d = point.f26966a;
            double d2 = point.b;
            layoutApiKt$scrollTo$3.p = null;
            layoutApiKt$scrollTo$3.q = null;
            layoutApiKt$scrollTo$3.s = 2;
            if (LayoutApiKt.e(null, d, d2, dDoubleValue, (16 & 8) != 0 ? new SpringSpec(null, 5) : springSpec, OffsetKt.a(-0.5f, -0.5f), layoutApiKt$scrollTo$3) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
        }
        return Unit.f24250a;
    }
}
