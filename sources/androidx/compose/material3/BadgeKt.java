package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.tokens.BadgeTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0005¨\u0006\u0005²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "layoutAbsoluteLeft", "layoutAbsoluteTop", "greatGrandParentAbsoluteRight", "greatGrandParentAbsoluteTop", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class BadgeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1397a = 12;
    public static final float b = 14;
    public static final float c = 6;

    public static final void a(final ComposableLambdaImpl composableLambdaImpl, Modifier modifier, final ComposableLambdaImpl composableLambdaImpl2, Composer composer, final int i) {
        final Modifier modifier2;
        ComposerImpl composerImplV = composer.v(1404022535);
        if (((i | 48) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
                composerImplV.A(objG);
            }
            final MutableFloatState mutableFloatState = (MutableFloatState) objG;
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
                composerImplV.A(objG2);
            }
            final MutableFloatState mutableFloatState2 = (MutableFloatState) objG2;
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = PrimitiveSnapshotStateKt.a(Float.POSITIVE_INFINITY);
                composerImplV.A(objG3);
            }
            final MutableFloatState mutableFloatState3 = (MutableFloatState) objG3;
            Object objG4 = composerImplV.G();
            if (objG4 == composer$Companion$Empty$1) {
                objG4 = PrimitiveSnapshotStateKt.a(Float.NEGATIVE_INFINITY);
                composerImplV.A(objG4);
            }
            final MutableFloatState mutableFloatState4 = (MutableFloatState) objG4;
            Object objG5 = composerImplV.G();
            if (objG5 == composer$Companion$Empty$1) {
                objG5 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LayoutCoordinates layoutCoordinatesE;
                        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                        Rect rectB = LayoutCoordinatesKt.b(layoutCoordinates);
                        float f = rectB.f1752a;
                        float f2 = BadgeKt.f1397a;
                        mutableFloatState.p(f);
                        mutableFloatState2.p(rectB.b);
                        LayoutCoordinates layoutCoordinatesE2 = layoutCoordinates.E();
                        LayoutCoordinates layoutCoordinatesN = (layoutCoordinatesE2 == null || (layoutCoordinatesE = layoutCoordinatesE2.E()) == null) ? null : layoutCoordinatesE.N();
                        if (layoutCoordinatesN != null) {
                            Rect rectB2 = LayoutCoordinatesKt.b(layoutCoordinatesN);
                            mutableFloatState3.p(rectB2.c);
                            mutableFloatState4.p(rectB2.b);
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG5);
            }
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierA = OnGloballyPositionedModifierKt.a(companion, (Function1) objG5);
            Object objG6 = composerImplV.G();
            if (objG6 == composer$Companion$Empty$1) {
                objG6 = new MeasurePolicy() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$3$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult c(final MeasureScope measureScope, List list, long j) {
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            Measurable measurable = (Measurable) list.get(i2);
                            if (Intrinsics.c(LayoutIdKt.a(measurable), "badge")) {
                                final Placeable placeableC0 = measurable.c0(Constraints.a(j, 0, 0, 0, 0, 11));
                                int size2 = list.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    Measurable measurable2 = (Measurable) list.get(i3);
                                    if (Intrinsics.c(LayoutIdKt.a(measurable2), "anchor")) {
                                        final Placeable placeableC02 = measurable2.c0(j);
                                        HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLineKt.f1871a;
                                        int iD0 = placeableC02.d0(horizontalAlignmentLine);
                                        HorizontalAlignmentLine horizontalAlignmentLine2 = AlignmentLineKt.b;
                                        int iD02 = placeableC02.d0(horizontalAlignmentLine2);
                                        int i4 = placeableC02.d;
                                        int i5 = placeableC02.e;
                                        Map mapJ = MapsKt.j(new Pair(horizontalAlignmentLine, Integer.valueOf(iD0)), new Pair(horizontalAlignmentLine2, Integer.valueOf(iD02)));
                                        final MutableFloatState mutableFloatState5 = mutableFloatState3;
                                        final MutableFloatState mutableFloatState6 = mutableFloatState4;
                                        final MutableFloatState mutableFloatState7 = mutableFloatState2;
                                        final MutableFloatState mutableFloatState8 = mutableFloatState;
                                        return measureScope.L0(i4, i5, mapJ, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$3$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                                                Placeable placeable = placeableC0;
                                                int i6 = placeable.d;
                                                float f = BadgeTokens.f1570a;
                                                MeasureScope measureScope2 = measureScope;
                                                boolean z = i6 > measureScope2.r1(f);
                                                float f2 = z ? BadgeKt.f1397a : BadgeKt.c;
                                                float f3 = z ? BadgeKt.b : BadgeKt.c;
                                                Placeable placeable2 = placeableC02;
                                                Placeable.PlacementScope.h(placementScope, placeable2, 0, 0);
                                                int iR1 = placeable2.d - measureScope2.r1(f2);
                                                int iR12 = measureScope2.r1(f3) + (-placeable.e);
                                                float fA = mutableFloatState7.a() + iR12;
                                                float fA2 = mutableFloatState5.a() - ((mutableFloatState8.a() + iR1) + placeable.d);
                                                float fA3 = fA - mutableFloatState6.a();
                                                if (fA2 < BitmapDescriptorFactory.HUE_RED) {
                                                    iR1 += MathKt.b(fA2);
                                                }
                                                if (fA3 < BitmapDescriptorFactory.HUE_RED) {
                                                    iR12 -= MathKt.b(fA3);
                                                }
                                                Placeable.PlacementScope.h(placementScope, placeable, iR1, iR12);
                                                return Unit.f24250a;
                                            }
                                        });
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerImplV.A(objG6);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG6;
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicy, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Modifier modifierB = LayoutIdKt.b(companion, "anchor");
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierB);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
            composableLambdaImpl2.invoke(boxScopeInstance, composerImplV, 54);
            composerImplV.V(true);
            Modifier modifierB2 = LayoutIdKt.b(companion, "badge");
            MeasurePolicy measurePolicyD2 = BoxKt.d(Alignment.Companion.f1719a, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierB2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            composableLambdaImpl.invoke(boxScopeInstance, composerImplV, 54);
            composerImplV.V(true);
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(modifier2, composableLambdaImpl2, i) { // from class: androidx.compose.material3.BadgeKt$BadgedBox$4
                public final /* synthetic */ Modifier i;
                public final /* synthetic */ ComposableLambdaImpl j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(391);
                    BadgeKt.a(this.h, this.i, this.j, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
