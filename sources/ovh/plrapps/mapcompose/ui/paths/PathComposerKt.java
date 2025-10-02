package ovh.plrapps.mapcompose.ui.paths;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import ovh.plrapps.mapcompose.ui.paths.model.Cap;
import ovh.plrapps.mapcompose.ui.paths.model.PatternItem;
import ovh.plrapps.mapcompose.ui.state.DrawablePathState;
import ovh.plrapps.mapcompose.ui.state.PathState;
import ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0006²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "origin", "", "epsilon", "Lovh/plrapps/mapcompose/ui/paths/PathWithOrigin;", "pathWithOrigin", "mapcompose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PathComposerKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Cap.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Cap cap = Cap.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Cap cap2 = Cap.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState r23, final ovh.plrapps.mapcompose.ui.state.DrawablePathState r24, androidx.compose.runtime.Composer r25, final int r26) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.paths.PathComposerKt.a(ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState, ovh.plrapps.mapcompose.ui.state.DrawablePathState, androidx.compose.runtime.Composer, int):void");
    }

    public static final void b(final ZoomPanRotateState zoomPRState, final PathState pathState, Composer composer, final int i) {
        int i2;
        Intrinsics.h(zoomPRState, "zoomPRState");
        Intrinsics.h(pathState, "pathState");
        ComposerImpl composerImplV = composer.v(1621128806);
        int i3 = 0;
        for (DrawablePathState drawablePathState : CollectionsKt.u0(new PathComposerKt$PathComposer$$inlined$sortedBy$1(), pathState.c.g)) {
            drawablePathState.getClass();
            composerImplV.J(1833129688, "primary-path-id");
            MutableStateFlow mutableStateFlow = drawablePathState.m;
            while (true) {
                Object value = mutableStateFlow.getValue();
                ((Number) value).intValue();
                i2 = i3 + 1;
                if (mutableStateFlow.d(value, Integer.valueOf(i3))) {
                    break;
                } else {
                    i3 = i2;
                }
            }
            a(zoomPRState, drawablePathState, composerImplV, 582);
            composerImplV.V(false);
            i3 = i2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(pathState, i) { // from class: ovh.plrapps.mapcompose.ui.paths.PathComposerKt$PathComposer$3
                public final /* synthetic */ PathState i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(583);
                    PathComposerKt.b(this.h, this.i, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final ListBuilder c(List list) {
        float f;
        ListBuilder listBuilderV = CollectionsKt.v();
        float f2 = 0;
        Iterator it = list.iterator();
        loop0: while (true) {
            f = f2;
            while (it.hasNext()) {
                PatternItem patternItem = (PatternItem) it.next();
                if (patternItem instanceof PatternItem.Gap) {
                    f += ((PatternItem.Gap) patternItem).f26952a;
                } else {
                    if (f > BitmapDescriptorFactory.HUE_RED) {
                        listBuilderV.add(new PatternItem.Gap(f));
                    }
                    listBuilderV.add(patternItem);
                }
            }
            break loop0;
        }
        if (f > BitmapDescriptorFactory.HUE_RED) {
            listBuilderV.add(new PatternItem.Gap(f));
        }
        return CollectionsKt.q(listBuilderV);
    }

    public static final void d(ListBuilder listBuilder, float f, Density density, float f2, PatternItem patternItem) {
        if (patternItem instanceof PatternItem.Gap) {
            listBuilder.add(Float.valueOf((density.T1(((PatternItem.Gap) patternItem).f26952a) + f) / f2));
        } else {
            listBuilder.add(Float.valueOf(f / f2));
        }
    }
}
