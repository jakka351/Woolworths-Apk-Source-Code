package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "color", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TabKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1509a = PrimaryNavigationTabTokens.c;
    public static final float b = 72;
    public static final float c = 16;
    public static final float d = 14;
    public static final float e = 6;
    public static final long f = TextUnitKt.c(20);

    public static final void a(final Function2 function2, final Function2 function22, Composer composer, final int i) {
        int i2;
        int i3;
        boolean z;
        ComposerImpl composerImplV = composer.v(514131524);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.I(function2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function22) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int i4 = i2 & 14;
            boolean z2 = (i4 == 4) | ((i2 & 112) == 32);
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                objG = new MeasurePolicy() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult c(final MeasureScope measureScope, List list, long j) {
                        final Placeable placeableC0;
                        final Placeable placeableC02;
                        if (function2 != null) {
                            int size = list.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                Measurable measurable = (Measurable) list.get(i5);
                                if (Intrinsics.c(LayoutIdKt.a(measurable), TextBundle.TEXT_ENTRY)) {
                                    placeableC0 = measurable.c0(Constraints.a(j, 0, 0, 0, 0, 11));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeableC0 = null;
                        if (function22 != null) {
                            int size2 = list.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                Measurable measurable2 = (Measurable) list.get(i6);
                                if (Intrinsics.c(LayoutIdKt.a(measurable2), BarcodePickDeserializer.FIELD_ICON)) {
                                    placeableC02 = measurable2.c0(j);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeableC02 = null;
                        final int iMax = Math.max(placeableC0 != null ? placeableC0.d : 0, placeableC02 != null ? placeableC02.d : 0);
                        final int iMax2 = Math.max(measureScope.r1((placeableC0 == null || placeableC02 == null) ? TabKt.f1509a : TabKt.b), measureScope.W1(TabKt.f) + (placeableC02 != null ? placeableC02.e : 0) + (placeableC0 != null ? placeableC0.e : 0));
                        final Integer numValueOf = placeableC0 != null ? Integer.valueOf(placeableC0.d0(AlignmentLineKt.f1871a)) : null;
                        final Integer numValueOf2 = placeableC0 != null ? Integer.valueOf(placeableC0.d0(AlignmentLineKt.b)) : null;
                        return measureScope.L0(iMax, iMax2, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                                Placeable placeable = placeableC02;
                                int i7 = iMax2;
                                Placeable placeable2 = placeableC0;
                                if (placeable2 != null && placeable != null) {
                                    Integer num = numValueOf;
                                    Intrinsics.e(num);
                                    int iIntValue = num.intValue();
                                    Integer num2 = numValueOf2;
                                    Intrinsics.e(num2);
                                    int iIntValue2 = num2.intValue();
                                    float f2 = iIntValue == iIntValue2 ? TabKt.d : TabKt.e;
                                    MeasureScope measureScope2 = measureScope;
                                    int iR1 = measureScope2.r1(PrimaryNavigationTabTokens.f1597a) + measureScope2.r1(f2);
                                    int iW1 = (measureScope2.W1(TabKt.f) + placeable.e) - iIntValue;
                                    int i8 = placeable2.d;
                                    int i9 = iMax;
                                    int i10 = (i7 - iIntValue2) - iR1;
                                    Placeable.PlacementScope.h(placementScope, placeable2, (i9 - i8) / 2, i10);
                                    Placeable.PlacementScope.h(placementScope, placeable, (i9 - placeable.d) / 2, i10 - iW1);
                                } else if (placeable2 != null) {
                                    float f3 = TabKt.f1509a;
                                    Placeable.PlacementScope.h(placementScope, placeable2, 0, (i7 - placeable2.e) / 2);
                                } else if (placeable != null) {
                                    float f4 = TabKt.f1509a;
                                    Placeable.PlacementScope.h(placementScope, placeable, 0, (i7 - placeable.e) / 2);
                                }
                                return Unit.f24250a;
                            }
                        });
                    }
                };
                composerImplV.A(objG);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG;
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function23 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicy, function23);
            Function2 function24 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function24);
            Function2 function25 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function25);
            }
            Function2 function26 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function26);
            composerImplV.o(871566271);
            BiasAlignment biasAlignment = Alignment.Companion.f1719a;
            if (function2 != null) {
                i3 = i2;
                Modifier modifierH = PaddingKt.h(LayoutIdKt.b(companion, TextBundle.TEXT_ENTRY), c, BitmapDescriptorFactory.HUE_RED, 2);
                MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
                int i6 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierH);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD, function23);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function24);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                    androidx.camera.core.impl.b.B(i6, composerImplV, i6, function25);
                }
                Updater.b(composerImplV, modifierD2, function26);
                android.support.v4.media.session.a.z(i4, function2, composerImplV, true);
            } else {
                i3 = i2;
            }
            boolean z3 = false;
            composerImplV.V(false);
            composerImplV.o(871570579);
            if (function22 != null) {
                Modifier modifierB = LayoutIdKt.b(companion, BarcodePickDeserializer.FIELD_ICON);
                MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
                int i7 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
                Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierB);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD2, function23);
                Updater.b(composerImplV, persistentCompositionLocalMapQ3, function24);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                    androidx.camera.core.impl.b.B(i7, composerImplV, i7, function25);
                }
                Updater.b(composerImplV, modifierD3, function26);
                z = true;
                android.support.v4.media.session.a.z((i3 >> 3) & 14, function22, composerImplV, true);
                z3 = false;
            } else {
                z = true;
            }
            composerImplV.V(z3);
            composerImplV.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    TabKt.a(function2, function22, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
