package ovh.plrapps.mapcompose.ui.state.markers;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ovh.plrapps.mapcompose.ui.state.markers.model.MarkerData;
import ovh.plrapps.mapcompose.ui.state.markers.model.RenderingStrategy;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lovh/plrapps/mapcompose/ui/state/markers/model/MarkerData;", "invoke", "(Lovh/plrapps/mapcompose/ui/state/markers/model/MarkerData;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class MarkerState$removeClusterer$2 extends Lambda implements Function1<MarkerData, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MarkerData it = (MarkerData) obj;
        Intrinsics.h(it, "it");
        return Boolean.valueOf(it.b instanceof RenderingStrategy.Clustering);
    }
}
