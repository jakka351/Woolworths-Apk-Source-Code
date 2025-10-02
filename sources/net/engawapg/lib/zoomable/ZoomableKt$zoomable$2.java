package net.engawapg.lib.zoomable;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.geometry.Offset;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "position", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomableKt$zoomable$2", f = "Zoomable.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ZoomableKt$zoomable$2 extends SuspendLambda implements Function2<Offset, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ long q;
    public final /* synthetic */ ZoomState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableKt$zoomable$2(ZoomState zoomState, Continuation continuation) {
        super(2, continuation);
        this.r = zoomState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ZoomableKt$zoomable$2 zoomableKt$zoomable$2 = new ZoomableKt$zoomable$2(this.r, continuation);
        zoomableKt$zoomable$2.q = ((Offset) obj).f1751a;
        return zoomableKt$zoomable$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoomableKt$zoomable$2) create(new Offset(((Offset) obj).f1751a), (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        long j = this.q;
        this.p = 1;
        SpringSpec springSpecD = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7);
        ZoomState zoomState = this.r;
        Object objC = CoroutineScopeKt.c(new ZoomState$changeScale$2(zoomState.c() == 1.0f ? 2.5f : 1.0f, zoomState, j, springSpecD, null), this);
        if (objC != coroutineSingletons) {
            objC = unit;
        }
        return objC == coroutineSingletons ? coroutineSingletons : unit;
    }
}
