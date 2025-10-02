package androidx.compose.material;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BackdropScaffoldKt$BackdropStack$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ ComposableLambdaImpl i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ ComposableLambdaImpl k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropStack$2(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Function1 function1, ComposableLambdaImpl composableLambdaImpl2, int i) {
        super(2);
        this.h = modifier;
        this.i = composableLambdaImpl;
        this.j = function1;
        this.k = composableLambdaImpl2;
        this.l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.l | 1);
        float f = BackdropScaffoldKt.f1240a;
        ComposerImpl composerImplV = ((Composer) obj).v(-1248995194);
        int i2 = iA & 6;
        Modifier modifier = this.h;
        if (i2 == 0) {
            i = (composerImplV.n(modifier) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i3 = iA & 48;
        final ComposableLambdaImpl composableLambdaImpl = this.i;
        if (i3 == 0) {
            i |= composerImplV.I(composableLambdaImpl) ? 32 : 16;
        }
        int i4 = iA & KyberEngine.KyberPolyBytes;
        final Function1 function1 = this.j;
        if (i4 == 0) {
            i |= composerImplV.I(function1) ? 256 : 128;
        }
        int i5 = iA & 3072;
        final ComposableLambdaImpl composableLambdaImpl2 = this.k;
        if (i5 == 0) {
            i |= composerImplV.I(composableLambdaImpl2) ? 2048 : 1024;
        }
        if (composerImplV.z(i & 1, (i & 1171) != 1170)) {
            boolean z = ((i & 7168) == 2048) | ((i & 112) == 32) | ((i & 896) == 256);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj3;
                        final long j = ((Constraints) obj4).f2197a;
                        final Placeable placeableC0 = ((Measurable) CollectionsKt.D(subcomposeMeasureScope.X0(BackdropLayers.d, composableLambdaImpl))).c0(((Constraints) function1.invoke(new Constraints(j))).f2197a);
                        final float f2 = placeableC0.e;
                        BackdropLayers backdropLayers = BackdropLayers.e;
                        final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                        List listX0 = subcomposeMeasureScope.X0(backdropLayers, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1$placeables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                Composer composer = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    composableLambdaImpl3.invoke(new Constraints(j), Float.valueOf(f2), composer, 0);
                                } else {
                                    composer.j();
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1222642649));
                        final ArrayList arrayList = new ArrayList(listX0.size());
                        int size = listX0.size();
                        for (int iF = 0; iF < size; iF = b.f((Measurable) listX0.get(iF), j, arrayList, iF, 1)) {
                        }
                        int iMax = Math.max(Constraints.j(j), placeableC0.d);
                        int iMax2 = Math.max(Constraints.i(j), placeableC0.e);
                        int size2 = arrayList.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            Placeable placeable = (Placeable) arrayList.get(i6);
                            iMax = Math.max(iMax, placeable.d);
                            iMax2 = Math.max(iMax2, placeable.e);
                        }
                        return subcomposeMeasureScope.L0(iMax, iMax2, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj5;
                                Placeable.PlacementScope.h(placementScope, placeableC0, 0, 0);
                                ArrayList arrayList2 = arrayList;
                                int size3 = arrayList2.size();
                                for (int i7 = 0; i7 < size3; i7++) {
                                    Placeable.PlacementScope.h(placementScope, (Placeable) arrayList2.get(i7), 0, 0);
                                }
                                return Unit.f24250a;
                            }
                        });
                    }
                };
                composerImplV.A(objG);
            }
            SubcomposeLayoutKt.a(modifier, (Function2) objG, composerImplV, i & 14, 0);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new BackdropScaffoldKt$BackdropStack$2(modifier, composableLambdaImpl, function1, composableLambdaImpl2, iA);
        }
        return Unit.f24250a;
    }
}
