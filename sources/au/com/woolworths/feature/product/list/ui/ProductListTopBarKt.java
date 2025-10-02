package au.com.woolworths.feature.product.list.ui;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.compose.productsearch.VoiceProductSearchEntryIconKt;
import au.com.woolworths.shared.ui.compose.shop.CartIconButtonKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListTopBarKt {
    public static final void a(final String str, final boolean z, final boolean z2, final boolean z3, final Function0 onNavigateBackClick, final Function0 onSearchBarClick, final Function0 onClearSearchClick, final Function0 onSearchButtonClick, final Function0 onVoiceSearchClick, final Function0 onCartClick, Modifier modifier, final Integer num, boolean z4, long j, long j2, PaddingValues paddingValues, Composer composer, final int i) {
        PaddingValues paddingValuesImpl;
        Modifier modifier2;
        long j3;
        long j4;
        final boolean z5;
        ComposerImpl composerImpl;
        final boolean z6;
        final long j5;
        final Modifier modifier3;
        final long j6;
        final PaddingValues paddingValues2;
        Intrinsics.h(onNavigateBackClick, "onNavigateBackClick");
        Intrinsics.h(onSearchBarClick, "onSearchBarClick");
        Intrinsics.h(onClearSearchClick, "onClearSearchClick");
        Intrinsics.h(onSearchButtonClick, "onSearchButtonClick");
        Intrinsics.h(onVoiceSearchClick, "onVoiceSearchClick");
        Intrinsics.h(onCartClick, "onCartClick");
        ComposerImpl composerImplV = composer.v(-1443166452);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.p(z2) ? 256 : 128) | (composerImplV.p(z3) ? 2048 : 1024) | (composerImplV.I(onNavigateBackClick) ? 16384 : 8192) | (composerImplV.I(onSearchBarClick) ? 131072 : 65536) | (composerImplV.I(onClearSearchClick) ? 1048576 : 524288) | (composerImplV.I(onSearchButtonClick) ? 8388608 : 4194304) | (composerImplV.I(onVoiceSearchClick) ? 67108864 : 33554432) | (composerImplV.I(onCartClick) ? 536870912 : 268435456);
        int i3 = (composerImplV.n(num) ? ' ' : (char) 16) | 9350;
        if ((i2 & 306783379) == 306783378 && (74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            z6 = z4;
            j6 = j2;
            paddingValues2 = paddingValues;
            composerImpl = composerImplV;
            j5 = j;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                long j7 = CoreTheme.b(composerImplV).e.f4848a.c;
                long j8 = CoreTheme.b(composerImplV).e.c.f4854a;
                float f = 0;
                paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
                modifier2 = Modifier.Companion.d;
                j3 = j8;
                j4 = j7;
                z5 = !z;
            } else {
                composerImplV.j();
                modifier2 = modifier;
                z5 = z4;
                j4 = j;
                j3 = j2;
                paddingValuesImpl = paddingValues;
            }
            composerImplV.W();
            final Modifier modifier4 = modifier2;
            final PaddingValues paddingValues3 = paddingValuesImpl;
            boolean z7 = z5;
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(151958864, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ui.ProductListTopBarKt$ProductListTopBar$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Modifier.Companion companion;
                    Function0 function0;
                    float f2;
                    BiasAlignment.Vertical vertical;
                    Function2 function2;
                    Function2 function22;
                    Function2 function23;
                    Function2 function24;
                    Composer composer2;
                    Function2 function25;
                    Composer composer3 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer3.c()) {
                        composer3.j();
                    } else {
                        PaddingValues paddingValues4 = paddingValues3;
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierX = SizeKt.x(SizeKt.e(TestTagKt.a(PaddingKt.e(companion2, paddingValues4), "ProductListTopBar"), 1.0f), Alignment.Companion.k, false);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        Arrangement$Start$1 arrangement$Start$12 = Arrangement.f934a;
                        BiasAlignment.Vertical vertical2 = Alignment.Companion.k;
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$12, vertical2, composer3, 48);
                        int p = composer3.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                        Modifier modifierD = ComposedModifierKt.d(composer3, modifierX);
                        ComposeUiNode.e3.getClass();
                        Function0 function02 = ComposeUiNode.Companion.b;
                        if (composer3.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer3.i();
                        if (composer3.getO()) {
                            composer3.K(function02);
                        } else {
                            composer3.e();
                        }
                        Function2 function26 = ComposeUiNode.Companion.g;
                        Updater.b(composer3, rowMeasurePolicyA, function26);
                        Function2 function27 = ComposeUiNode.Companion.f;
                        Updater.b(composer3, persistentCompositionLocalMapD, function27);
                        Function2 function28 = ComposeUiNode.Companion.j;
                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                            b.z(p, composer3, p, function28);
                        }
                        Function2 function29 = ComposeUiNode.Companion.d;
                        Updater.b(composer3, modifierD, function29);
                        float f3 = 8;
                        Modifier modifierH = PaddingKt.h(companion2, f3, BitmapDescriptorFactory.HUE_RED, 2);
                        final Function0 function03 = onNavigateBackClick;
                        SurfaceKt.b(modifierH, null, 0L, 0L, null, null, ComposableLambdaKt.c(648008944, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ui.ProductListTopBarKt$ProductListTopBar$1$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer4 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer4.c()) {
                                    composer4.j();
                                } else {
                                    IconButtonKt.c(CoreTheme.e(composer4).e.b, "Back", function03, null, false, null, 0L, composer4, 48, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer3), composer3, 62);
                        boolean z8 = z;
                        Modifier modifier5 = modifier4;
                        String str2 = str;
                        RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
                        if (z8) {
                            composer3.o(1883261888);
                            Modifier modifierA = BorderKt.a(PaddingKt.j(PaddingKt.h(modifier5, BitmapDescriptorFactory.HUE_RED, f3, 1), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, BitmapDescriptorFactory.HUE_RED, 11), 2, CoreTheme.b(composer3).e.b.f4852a, RoundedCornerShapeKt.b(f3));
                            composer3.o(5004770);
                            Function0 function04 = onSearchBarClick;
                            boolean zN = composer3.n(function04);
                            Object objG = composer3.G();
                            if (zN || objG == Composer.Companion.f1624a) {
                                objG = new au.com.woolworths.design.core.ui.component.experimental.dialog.a(9, function04);
                                composer3.A(objG);
                            }
                            composer3.l();
                            Modifier modifierJ = PaddingKt.j(rowScopeInstance.a(ClickableKt.d(modifierA, false, null, null, (Function0) objG, 7), 1.0f, true), f3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                            RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(Arrangement.h(f3, Alignment.Companion.m), vertical2, composer3, 54);
                            int p2 = composer3.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                            Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierJ);
                            if (composer3.w() == null) {
                                ComposablesKt.b();
                                throw null;
                            }
                            composer3.i();
                            if (composer3.getO()) {
                                composer3.K(function02);
                            } else {
                                composer3.e();
                            }
                            Updater.b(composer3, rowMeasurePolicyA2, function26);
                            Updater.b(composer3, persistentCompositionLocalMapD2, function27);
                            if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                                function25 = function28;
                                b.z(p2, composer3, p2, function25);
                            } else {
                                function25 = function28;
                            }
                            Updater.b(composer3, modifierD2, function29);
                            Modifier modifierA2 = rowScopeInstance.a(PaddingKt.h(modifier5, f3, BitmapDescriptorFactory.HUE_RED, 2), 1.0f, true);
                            composer3.o(-1279024214);
                            composer3.l();
                            companion = companion2;
                            vertical = vertical2;
                            function22 = function27;
                            function23 = function25;
                            function24 = function29;
                            f2 = f3;
                            function0 = function02;
                            function2 = function26;
                            TextKt.b(str2, modifierA2, CoreTheme.b(composer3).d.d.f4845a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, CoreTheme.f(composer3).f5120a.b.f5123a, composer3, 0, 3120, 55288);
                            composer2 = composer3;
                            IconButtonKt.c(CoreTheme.e(composer3).f4879a.G, "Clear Search", onClearSearchClick, null, false, null, 0L, composer2, 48, 120);
                            composer2.f();
                            composer2.l();
                        } else {
                            companion = companion2;
                            function0 = function02;
                            f2 = f3;
                            vertical = vertical2;
                            function2 = function26;
                            function22 = function27;
                            function23 = function28;
                            function24 = function29;
                            composer3.o(1884707697);
                            TextKt.b(str2, rowScopeInstance.a(modifier5, 1.0f, true), CoreTheme.b(composer3).e.d.d, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, CoreTheme.f(composer3).d.c.c, composer3, 0, 3120, 55288);
                            composer2 = composer3;
                            composer2.l();
                        }
                        RowMeasurePolicy rowMeasurePolicyA3 = RowKt.a(Arrangement.b, vertical, composer2, 54);
                        int p3 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                        Modifier.Companion companion3 = companion;
                        Modifier modifierD3 = ComposedModifierKt.d(composer2, companion3);
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
                        Updater.b(composer2, rowMeasurePolicyA3, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD3, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                            b.z(p3, composer2, p3, function23);
                        }
                        Updater.b(composer2, modifierD3, function24);
                        composer2.o(-902645628);
                        if (z2) {
                            VoiceProductSearchEntryIconKt.a(48, 0, composer2, SizeKt.q(PaddingKt.f(companion3, f2), 28), onVoiceSearchClick);
                        }
                        composer2.l();
                        composer2.o(-902635524);
                        if (z5) {
                            IconButtonKt.c(CoreTheme.e(composer2).f4879a.w, "Search", onSearchButtonClick, null, false, null, 0L, composer2, 48, 120);
                        }
                        composer2.l();
                        composer2.o(-902626570);
                        if (z3) {
                            final Integer num2 = num;
                            final Function0 function05 = onCartClick;
                            ThemeKt.b(6, composer2, ComposableLambdaKt.c(28058099, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ui.ProductListTopBarKt$ProductListTopBar$1$1$4$1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    Composer composer4 = (Composer) obj3;
                                    if ((((Number) obj4).intValue() & 3) == 2 && composer4.c()) {
                                        composer4.j();
                                    } else {
                                        CartIconButtonKt.a(num2, function05, null, CoreTheme.b(composer4).e.c.f4854a, composer4, 0, 4);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2));
                        }
                        composer2.l();
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            composerImpl = composerImplV;
            long j9 = j4;
            long j10 = j3;
            SurfaceKt.b(modifier4, null, j9, j10, null, null, composableLambdaImplC, composerImpl, 50);
            z6 = z7;
            j5 = j9;
            modifier3 = modifier4;
            j6 = j10;
            paddingValues2 = paddingValues3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(str, z, z2, z3, onNavigateBackClick, onSearchBarClick, onClearSearchClick, onSearchButtonClick, onVoiceSearchClick, onCartClick, modifier3, num, z6, j5, j6, paddingValues2, i) { // from class: au.com.woolworths.feature.product.list.ui.a
                public final /* synthetic */ String d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ Function0 h;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 j;
                public final /* synthetic */ Function0 k;
                public final /* synthetic */ Function0 l;
                public final /* synthetic */ Function0 m;
                public final /* synthetic */ Modifier n;
                public final /* synthetic */ Integer o;
                public final /* synthetic */ boolean p;
                public final /* synthetic */ long q;
                public final /* synthetic */ long r;
                public final /* synthetic */ PaddingValues s;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    ProductListTopBarKt.a(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
