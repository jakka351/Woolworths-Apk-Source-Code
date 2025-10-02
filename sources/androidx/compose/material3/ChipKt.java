package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ChipKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1411a;

    static {
        float f = 8;
        f1411a = f;
        PaddingKt.a(f, BitmapDescriptorFactory.HUE_RED, 2);
        PaddingKt.a(f, BitmapDescriptorFactory.HUE_RED, 2);
        PaddingKt.a(f, BitmapDescriptorFactory.HUE_RED, 2);
    }

    public static final void a(final Function2 function2, final TextStyle textStyle, final long j, final Function2 function22, final Function2 function23, final Function2 function24, final long j2, final long j3, final float f, final PaddingValues paddingValues, Composer composer, final int i) {
        int i2;
        Function2 function25;
        Function2 function26;
        Function2 function27;
        long j4;
        long j5;
        float f2;
        ComposerImpl composerImplV = composer.v(-782878228);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(textStyle) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.s(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function25 = function22;
            i2 |= composerImplV.I(function25) ? 2048 : 1024;
        } else {
            function25 = function22;
        }
        if ((i & 24576) == 0) {
            function26 = function23;
            i2 |= composerImplV.I(function26) ? 16384 : 8192;
        } else {
            function26 = function23;
        }
        if ((196608 & i) == 0) {
            function27 = function24;
            i2 |= composerImplV.I(function27) ? 131072 : 65536;
        } else {
            function27 = function24;
        }
        if ((1572864 & i) == 0) {
            j4 = j2;
            i2 |= composerImplV.s(j4) ? 1048576 : 524288;
        } else {
            j4 = j2;
        }
        if ((12582912 & i) == 0) {
            j5 = j3;
            i2 |= composerImplV.s(j5) ? 8388608 : 4194304;
        } else {
            j5 = j3;
        }
        if ((100663296 & i) == 0) {
            f2 = f;
            i2 |= composerImplV.q(f2) ? 67108864 : 33554432;
        } else {
            f2 = f;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerImplV.n(paddingValues) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) == 306783378 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final Function2 function28 = function25;
            final Function2 function29 = function26;
            final Function2 function210 = function27;
            final long j6 = j4;
            final long j7 = j5;
            final float f3 = f2;
            CompositionLocalKt.b(new ProvidedValue[]{androidx.camera.core.impl.b.g(j, ContentColorKt.f1427a), TextKt.f1518a.b(textStyle)}, ComposableLambdaKt.c(1748799148, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ChipContent$1

                @Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", CryptoServicesPermission.CONSTRAINTS, "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: androidx.compose.material3.ChipKt$ChipContent$1$1, reason: invalid class name */
                final class AnonymousClass1 implements MeasurePolicy {

                    /* renamed from: a, reason: collision with root package name */
                    public static final AnonymousClass1 f1412a = new AnonymousClass1();

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
                        Object obj;
                        Object obj2;
                        int size = list.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                obj = null;
                                break;
                            }
                            obj = list.get(i);
                            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj), "leadingIcon")) {
                                break;
                            }
                            i++;
                        }
                        Measurable measurable = (Measurable) obj;
                        final Placeable placeableC0 = measurable != null ? measurable.c0(Constraints.a(j, 0, 0, 0, 0, 10)) : null;
                        float f = TextFieldImplKt.b;
                        int i2 = placeableC0 != null ? placeableC0.d : 0;
                        final int i3 = placeableC0 != null ? placeableC0.e : 0;
                        int size2 = list.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list.get(i4);
                            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj2), "trailingIcon")) {
                                break;
                            }
                            i4++;
                        }
                        Measurable measurable2 = (Measurable) obj2;
                        final Placeable placeableC02 = measurable2 != null ? measurable2.c0(Constraints.a(j, 0, 0, 0, 0, 10)) : null;
                        int i5 = placeableC02 != null ? placeableC02.d : 0;
                        final int i6 = placeableC02 != null ? placeableC02.e : 0;
                        int size3 = list.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            Measurable measurable3 = (Measurable) list.get(i7);
                            if (Intrinsics.c(LayoutIdKt.a(measurable3), AnnotatedPrivateKey.LABEL)) {
                                final Placeable placeableC03 = measurable3.c0(ConstraintsKt.j(-(i2 + i5), 0, 2, j));
                                int i8 = placeableC03.d + i2 + i5;
                                final int iMax = Math.max(i3, Math.max(placeableC03.e, i6));
                                final int i9 = i2;
                                return measureScope.L0(i8, iMax, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ChipKt.ChipContent.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj3;
                                        int i10 = iMax;
                                        BiasAlignment.Vertical vertical = Alignment.Companion.k;
                                        Placeable placeable = placeableC0;
                                        if (placeable != null) {
                                            Placeable.PlacementScope.h(placementScope, placeable, 0, vertical.a(i3, i10));
                                        }
                                        Placeable placeable2 = placeableC03;
                                        int i11 = i9;
                                        Placeable.PlacementScope.h(placementScope, placeable2, i11, 0);
                                        Placeable placeable3 = placeableC02;
                                        if (placeable3 != null) {
                                            Placeable.PlacementScope.h(placementScope, placeable3, i11 + placeable2.d, vertical.a(i6, i10));
                                        }
                                        return Unit.f24250a;
                                    }
                                });
                            }
                            i7++;
                            i2 = i2;
                            i3 = i3;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws Throwable {
                    Throwable th;
                    BiasAlignment biasAlignment;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f4 = f3;
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierE = PaddingKt.e(SizeKt.b(companion, BitmapDescriptorFactory.HUE_RED, f4, 1), paddingValues);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Function2 function211 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, AnonymousClass1.f1412a, function211);
                        Function2 function212 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function212);
                        Function2 function213 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function213);
                        }
                        Function2 function214 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function214);
                        composer2.o(-1293169671);
                        BiasAlignment biasAlignment2 = Alignment.Companion.e;
                        Function2 function215 = function29;
                        Function2 function216 = function28;
                        if (function215 == null && function216 == null) {
                            biasAlignment = biasAlignment2;
                            th = null;
                        } else {
                            Modifier modifierB = LayoutIdKt.b(companion, "leadingIcon");
                            th = null;
                            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment2, false);
                            int p2 = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                            Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierB);
                            if (composer2.w() == null) {
                                ComposablesKt.b();
                                throw null;
                            }
                            composer2.i();
                            if (composer2.getO()) {
                                composer2.K(function0);
                            } else {
                                composer2.e();
                            }
                            Updater.b(composer2, measurePolicyD, function211);
                            Updater.b(composer2, persistentCompositionLocalMapD2, function212);
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                                androidx.camera.core.impl.b.z(p2, composer2, p2, function213);
                            }
                            Updater.b(composer2, modifierD2, function214);
                            if (function215 != null) {
                                composer2.o(832680499);
                                function215.invoke(composer2, 0);
                                composer2.l();
                                biasAlignment = biasAlignment2;
                            } else if (function216 != null) {
                                composer2.o(832788565);
                                biasAlignment = biasAlignment2;
                                CompositionLocalKt.a(androidx.camera.core.impl.b.g(j6, ContentColorKt.f1427a), function216, composer2, 8);
                                composer2.l();
                            } else {
                                biasAlignment = biasAlignment2;
                                composer2.o(833040347);
                                composer2.l();
                            }
                            composer2.f();
                        }
                        composer2.l();
                        Modifier modifierG = PaddingKt.g(LayoutIdKt.b(companion, AnnotatedPrivateKey.LABEL), ChipKt.f1411a, 0);
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer2, 54);
                        int p3 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer2, modifierG);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw th;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, rowMeasurePolicyA, function211);
                        Updater.b(composer2, persistentCompositionLocalMapD3, function212);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                            androidx.camera.core.impl.b.z(p3, composer2, p3, function213);
                        }
                        Updater.b(composer2, modifierD3, function214);
                        function2.invoke(composer2, 0);
                        composer2.f();
                        composer2.o(-1293135324);
                        Function2 function217 = function210;
                        if (function217 != null) {
                            Modifier modifierB2 = LayoutIdKt.b(companion, "trailingIcon");
                            MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
                            int p4 = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD4 = composer2.d();
                            Modifier modifierD4 = ComposedModifierKt.d(composer2, modifierB2);
                            if (composer2.w() == null) {
                                ComposablesKt.b();
                                throw th;
                            }
                            composer2.i();
                            if (composer2.getO()) {
                                composer2.K(function0);
                            } else {
                                composer2.e();
                            }
                            Updater.b(composer2, measurePolicyD2, function211);
                            Updater.b(composer2, persistentCompositionLocalMapD4, function212);
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p4))) {
                                androidx.camera.core.impl.b.z(p4, composer2, p4, function213);
                            }
                            Updater.b(composer2, modifierD4, function214);
                            CompositionLocalKt.a(androidx.camera.core.impl.b.g(j7, ContentColorKt.f1427a), function217, composer2, 8);
                            composer2.f();
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ChipContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    ChipKt.a(function2, textStyle, j, function22, function23, function24, j2, j3, f, paddingValues, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
