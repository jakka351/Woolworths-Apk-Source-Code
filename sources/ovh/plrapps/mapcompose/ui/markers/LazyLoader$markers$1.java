package ovh.plrapps.mapcompose.ui.markers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import ovh.plrapps.mapcompose.ui.state.markers.model.MarkerData;
import ovh.plrapps.mapcompose.ui.state.markers.model.RenderingStrategy;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lovh/plrapps/mapcompose/ui/state/markers/model/MarkerData;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
final class LazyLoader$markers$1 extends Lambda implements Function1<List<? extends MarkerData>, List<? extends MarkerData>> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List it = (List) obj;
        Intrinsics.h(it, "it");
        ArrayList arrayList = new ArrayList();
        Iterator it2 = it.iterator();
        while (it2.hasNext()) {
            if (((MarkerData) it2.next()).b instanceof RenderingStrategy.LazyLoading) {
                throw null;
            }
        }
        return arrayList;
    }
}
