package ovh.plrapps.mapcompose.api;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import ovh.plrapps.mapcompose.ui.state.markers.model.MarkerData;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.api.MarkerApiKt", f = "MarkerApi.kt", l = {241, 242}, m = "updateMarkerOffset-N2P6D1A")
/* loaded from: classes8.dex */
final class MarkerApiKt$updateMarkerOffset$1 extends ContinuationImpl {
    public MarkerData p;
    public MarkerData q;
    public MarkerData r;
    public /* synthetic */ Object s;
    public int t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        int i = (this.t | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.t = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        if (i == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            ((Boolean) obj).getClass();
            return Unit.f24250a;
        }
        MarkerData markerData = this.r;
        MarkerData markerData2 = this.q;
        Offset offset = (Offset) this.p;
        ResultKt.b(obj);
        new MarkerApiKt$updateMarkerOffset$2$1$1(null, offset, markerData, null, null);
        this.p = markerData2;
        this.q = null;
        this.r = null;
        this.t = 2;
        throw null;
    }
}
