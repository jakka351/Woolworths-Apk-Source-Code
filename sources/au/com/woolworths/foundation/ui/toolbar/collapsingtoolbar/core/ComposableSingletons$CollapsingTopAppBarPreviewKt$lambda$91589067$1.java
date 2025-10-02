package au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.core;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.CollapsingTopAppBarKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.core.ComposableSingletons$CollapsingTopAppBarPreviewKt$lambda$-91589067$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$CollapsingTopAppBarPreviewKt$lambda$91589067$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            final TopAppBarScrollBehavior topAppBarScrollBehaviorB = TopAppBarDefaults.b(composer);
            ScaffoldKt.a(NestedScrollModifierKt.a(Modifier.Companion.d, topAppBarScrollBehaviorB.a(), null), ComposableLambdaKt.c(1437374705, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.core.ComposableSingletons$CollapsingTopAppBarPreviewKt$lambda$-91589067$1.1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Composer composer2 = (Composer) obj3;
                    if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                        long j = CoreTheme.b(composer2).e.d.f4856a;
                        CollapsingTopAppBarKt.a(topAppBarScrollBehaviorB, ComposableSingletons$CollapsingTopAppBarPreviewKt.f8930a, modifierE, ComposableSingletons$CollapsingTopAppBarPreviewKt.c, null, ComposableSingletons$CollapsingTopAppBarPreviewKt.d, null, j, 0L, 0L, null, composer2, 200112, 1872);
                    }
                    return Unit.f24250a;
                }
            }, composer), null, null, 0L, null, ComposableLambdaKt.c(1950294280, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.core.ComposableSingletons$CollapsingTopAppBarPreviewKt$lambda$-91589067$1.2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    PaddingValues paddingValues = (PaddingValues) obj3;
                    Composer composer2 = (Composer) obj4;
                    int iIntValue = ((Number) obj5).intValue();
                    Intrinsics.h(paddingValues, "paddingValues");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(paddingValues) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = PaddingKt.e(SizeKt.c, paddingValues);
                        composer2.o(5004770);
                        final TopAppBarScrollBehavior topAppBarScrollBehavior = topAppBarScrollBehaviorB;
                        boolean zN = composer2.n(topAppBarScrollBehavior);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new Function1() { // from class: au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.core.a
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    LazyListScope LazyColumn = (LazyListScope) obj6;
                                    Intrinsics.h(LazyColumn, "$this$LazyColumn");
                                    final TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                    LazyListScope.e(LazyColumn, null, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.core.ComposableSingletons$CollapsingTopAppBarPreviewKt$lambda$-91589067$1$2$1$1$1
                                        @Override // kotlin.jvm.functions.Function4
                                        public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                                            LazyItemScope stickyHeader = (LazyItemScope) obj7;
                                            ((Number) obj8).intValue();
                                            Composer composer3 = (Composer) obj9;
                                            int iIntValue2 = ((Number) obj10).intValue();
                                            Intrinsics.h(stickyHeader, "$this$stickyHeader");
                                            if ((iIntValue2 & 129) == 128 && composer3.c()) {
                                                composer3.j();
                                            } else {
                                                ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer3, 0);
                                                int p = composer3.getP();
                                                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                                Modifier.Companion companion = Modifier.Companion.d;
                                                Modifier modifierD = ComposedModifierKt.d(composer3, companion);
                                                ComposeUiNode.e3.getClass();
                                                Function0 function0 = ComposeUiNode.Companion.b;
                                                if (composer3.w() == null) {
                                                    ComposablesKt.b();
                                                    throw null;
                                                }
                                                composer3.i();
                                                if (composer3.getO()) {
                                                    composer3.K(function0);
                                                } else {
                                                    composer3.e();
                                                }
                                                Updater.b(composer3, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                                                Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                                Function2 function2 = ComposeUiNode.Companion.j;
                                                if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                                    b.z(p, composer3, p, function2);
                                                }
                                                Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                                                TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                                String str = "Height offset: " + topAppBarScrollBehavior3.getF1443a().b();
                                                Modifier modifierE2 = SizeKt.e(companion, 1.0f);
                                                long j = Color.f;
                                                RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
                                                float f = 24;
                                                TextKt.b(str, PaddingKt.f(BackgroundKt.b(modifierE2, j, rectangleShapeKt$RectangleShape$1), f), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 48, 0, 131068);
                                                TextKt.b("Collapsed fraction: " + topAppBarScrollBehavior3.getF1443a().a(), PaddingKt.f(BackgroundKt.b(SizeKt.e(companion, 1.0f), j, rectangleShapeKt$RectangleShape$1), f), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 48, 0, 131068);
                                                composer3.f();
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, true, -1759142231), 3);
                                    for (final int i = 0; i < 100; i++) {
                                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.core.ComposableSingletons$CollapsingTopAppBarPreviewKt$lambda$-91589067$1$2$1$1$2$1
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                LazyItemScope item = (LazyItemScope) obj7;
                                                Composer composer3 = (Composer) obj8;
                                                int iIntValue2 = ((Number) obj9).intValue();
                                                Intrinsics.h(item, "$this$item");
                                                if ((iIntValue2 & 17) == 16 && composer3.c()) {
                                                    composer3.j();
                                                } else {
                                                    TextKt.b(YU.a.d(i, "Row "), PaddingKt.f(Modifier.Companion.d, 24), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 48, 0, 131068);
                                                }
                                                return Unit.f24250a;
                                            }
                                        }, true, -1063867413), 3);
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG);
                        }
                        composer2.l();
                        LazyDslKt.b(modifierE, null, null, false, null, null, null, false, null, (Function1) objG, composer2, 0, 510);
                    }
                    return Unit.f24250a;
                }
            }, composer), composer, 12582960, 124);
        }
        return Unit.f24250a;
    }
}
