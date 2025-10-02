package ovh.plrapps.mapcompose.ui.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.crypto.CryptoServicesPermission;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", CryptoServicesPermission.CONSTRAINTS, "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
final class ZoomPanRotateKt$ZoomPanRotate$4 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final ZoomPanRotateKt$ZoomPanRotate$4 f26944a = new ZoomPanRotateKt$ZoomPanRotate$4();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope Layout, List measurables, long j) {
        Intrinsics.h(Layout, "$this$Layout");
        Intrinsics.h(measurables, "measurables");
        List list = measurables;
        final ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).c0(j));
        }
        return Layout.L0(Constraints.h(j), Constraints.g(j), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$4.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
                Intrinsics.h(layout, "$this$layout");
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    layout.e((Placeable) it2.next(), 0, 0, BitmapDescriptorFactory.HUE_RED);
                }
                return Unit.f24250a;
            }
        });
    }
}
