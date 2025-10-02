package au.com.woolworths.feature.product.list.v2.ui;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
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
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.shared.ui.compose.shop.CartIconButtonKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListTopBarKt {
    public static final void a(final String str, final boolean z, final boolean z2, final boolean z3, final Function1 eventSink, final Integer num, final boolean z4, Modifier modifier, long j, long j2, Composer composer, final int i) {
        Modifier modifier2;
        long j3;
        long j4;
        final long j5;
        ComposerImpl composerImpl;
        final long j6;
        final Modifier modifier3;
        Intrinsics.h(eventSink, "eventSink");
        ComposerImpl composerImplV = composer.v(81011552);
        if (((i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.p(z2) ? 256 : 128) | (composerImplV.p(z3) ? 2048 : 1024) | (composerImplV.I(eventSink) ? 16384 : 8192) | (composerImplV.n(num) ? 131072 : 65536) | (composerImplV.p(z4) ? 1048576 : 524288) | 314572800) & 306783379) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            j5 = j2;
            composerImpl = composerImplV;
            j6 = j;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                long j7 = CoreTheme.b(composerImplV).e.f4848a.c;
                long j8 = CoreTheme.b(composerImplV).e.c.f4854a;
                modifier2 = Modifier.Companion.d;
                j3 = j8;
                j4 = j7;
            } else {
                composerImplV.j();
                modifier2 = modifier;
                j4 = j;
                j3 = j2;
            }
            composerImplV.W();
            final Modifier modifier4 = modifier2;
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-812613988, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.v2.ui.ProductListTopBarKt$ProductListTopBar$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i2;
                    float f;
                    Function2 function2;
                    Function2 function22;
                    Function2 function23;
                    Function2 function24;
                    Modifier.Companion companion;
                    BiasAlignment.Vertical vertical;
                    Composer$Companion$Empty$1 composer$Companion$Empty$1;
                    Composer composer2;
                    Composer$Companion$Empty$1 composer$Companion$Empty$12;
                    Function0 function0;
                    Function2 function25;
                    Composer composer3 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer3.c()) {
                        composer3.j();
                    } else {
                        float f2 = 8;
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierX = SizeKt.x(SizeKt.e(TestTagKt.a(PaddingKt.g(companion2, 4, f2), "ProductListTopBar"), 1.0f), Alignment.Companion.k, false);
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
                            androidx.camera.core.impl.b.z(p, composer3, p, function28);
                        }
                        Function2 function29 = ComposeUiNode.Companion.d;
                        Updater.b(composer3, modifierD, function29);
                        ImageVector imageVector = CoreTheme.e(composer3).e.b;
                        String strC = StringResources_androidKt.c(composer3, R.string.back);
                        composer3.o(5004770);
                        final Function1 function1 = eventSink;
                        boolean zN = composer3.n(function1);
                        Object objG = composer3.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$13 = Composer.Companion.f1624a;
                        if (zN || objG == composer$Companion$Empty$13) {
                            objG = new f(0, function1);
                            composer3.A(objG);
                        }
                        composer3.l();
                        Function0 function03 = function02;
                        IconButtonKt.c(imageVector, strC, (Function0) objG, null, false, null, CoreTheme.b(composer3).e.c.f4854a, composer3, 0, 56);
                        boolean z5 = z;
                        Modifier modifier5 = modifier4;
                        String strC2 = str;
                        RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
                        if (z5) {
                            composer3.o(-1331476108);
                            Modifier modifierA = BorderKt.a(PaddingKt.h(modifier5, f2, BitmapDescriptorFactory.HUE_RED, 2), 1, CoreTheme.b(composer3).d.b.b, RoundedCornerShapeKt.b(f2));
                            composer3.o(5004770);
                            boolean zN2 = composer3.n(function1);
                            Object objG2 = composer3.G();
                            if (zN2 || objG2 == composer$Companion$Empty$13) {
                                objG2 = new f(1, function1);
                                composer3.A(objG2);
                            }
                            composer3.l();
                            Modifier modifierA2 = rowScopeInstance.a(ClickableKt.d(modifierA, false, null, null, (Function0) objG2, 7), 1.0f, true);
                            RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(Arrangement.h(f2, Alignment.Companion.m), vertical2, composer3, 54);
                            int p2 = composer3.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                            Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierA2);
                            if (composer3.w() == null) {
                                ComposablesKt.b();
                                throw null;
                            }
                            composer3.i();
                            if (composer3.getO()) {
                                function0 = function03;
                                composer3.K(function0);
                            } else {
                                function0 = function03;
                                composer3.e();
                            }
                            Updater.b(composer3, rowMeasurePolicyA2, function26);
                            Updater.b(composer3, persistentCompositionLocalMapD2, function27);
                            if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                                function25 = function28;
                                androidx.camera.core.impl.b.z(p2, composer3, p2, function25);
                            } else {
                                function25 = function28;
                            }
                            Updater.b(composer3, modifierD2, function29);
                            Function0 function04 = function0;
                            Modifier modifierA3 = rowScopeInstance.a(PaddingKt.f(companion2, 12), 1.0f, true);
                            composer3.o(1540892531);
                            if (strC2 == null) {
                                strC2 = StringResources_androidKt.c(composer3, R.string.locate_a_product);
                            }
                            composer3.l();
                            function03 = function04;
                            f = f2;
                            function2 = function26;
                            function22 = function27;
                            function23 = function25;
                            function24 = function29;
                            companion = companion2;
                            vertical = vertical2;
                            i2 = 5004770;
                            TextKt.a(strC2, CoreTheme.f(composer3).f5120a.b.f5123a, modifierA3, CoreTheme.b(composer3).d.d.f4845a, null, 0, 2, false, 1, null, composer3, 102236160, 688);
                            composer2 = composer3;
                            ImageVector imageVector2 = CoreTheme.e(composer2).f4879a.G;
                            String strC3 = StringResources_androidKt.c(composer2, R.string.clear_search_content_description);
                            composer2.o(5004770);
                            boolean zN3 = composer2.n(function1);
                            Object objG3 = composer2.G();
                            if (zN3 || objG3 == composer$Companion$Empty$13) {
                                objG3 = new f(2, function1);
                                composer2.A(objG3);
                            }
                            composer2.l();
                            IconButtonKt.c(imageVector2, strC3, (Function0) objG3, null, false, null, 0L, composer2, 0, 120);
                            composer2.f();
                            composer2.l();
                            composer$Companion$Empty$1 = composer$Companion$Empty$13;
                        } else {
                            i2 = 5004770;
                            f = f2;
                            function2 = function26;
                            function22 = function27;
                            function23 = function28;
                            function24 = function29;
                            companion = companion2;
                            vertical = vertical2;
                            composer3.o(-1329930355);
                            Modifier modifierA4 = rowScopeInstance.a(modifier5, 1.0f, true);
                            if (strC2 == null) {
                                strC2 = "";
                            }
                            composer$Companion$Empty$1 = composer$Companion$Empty$13;
                            TextKt.a(strC2, CoreTheme.f(composer3).d.c.c, modifierA4, CoreTheme.b(composer3).e.d.d, null, 0, 2, false, 1, null, composer3, 102236160, 688);
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
                            composer2.K(function03);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, rowMeasurePolicyA3, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD3, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                            androidx.camera.core.impl.b.z(p3, composer2, p3, function23);
                        }
                        Updater.b(composer2, modifierD3, function24);
                        composer2.o(-1304231267);
                        if (z2) {
                            Modifier modifierQ = SizeKt.q(PaddingKt.f(companion3, f), 28);
                            composer2.o(i2);
                            boolean zN4 = composer2.n(function1);
                            Object objG4 = composer2.G();
                            composer$Companion$Empty$12 = composer$Companion$Empty$1;
                            if (zN4 || objG4 == composer$Companion$Empty$12) {
                                objG4 = new f(3, function1);
                                composer2.A(objG4);
                            }
                            composer2.l();
                            VoiceProductSearchEntryIconKt.a(48, 0, composer2, modifierQ, (Function0) objG4);
                        } else {
                            composer$Companion$Empty$12 = composer$Companion$Empty$1;
                        }
                        composer2.l();
                        composer2.o(-1304218156);
                        if (z4) {
                            ImageVector imageVector3 = CoreTheme.e(composer2).f4879a.w;
                            String strC4 = StringResources_androidKt.c(composer2, R.string.search);
                            composer2.o(i2);
                            boolean zN5 = composer2.n(function1);
                            Object objG5 = composer2.G();
                            if (zN5 || objG5 == composer$Companion$Empty$12) {
                                objG5 = new f(4, function1);
                                composer2.A(objG5);
                            }
                            composer2.l();
                            IconButtonKt.c(imageVector3, strC4, (Function0) objG5, null, false, null, 0L, composer2, 0, 120);
                        }
                        composer2.l();
                        composer2.o(-1304205257);
                        if (z3) {
                            final Integer num2 = num;
                            ThemeKt.b(6, composer2, ComposableLambdaKt.c(2002260761, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.v2.ui.ProductListTopBarKt$ProductListTopBar$1$1$4$3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    Composer composer4 = (Composer) obj3;
                                    if ((((Number) obj4).intValue() & 3) == 2 && composer4.c()) {
                                        composer4.j();
                                    } else {
                                        composer4.o(5004770);
                                        Function1 function12 = function1;
                                        boolean zN6 = composer4.n(function12);
                                        Object objG6 = composer4.G();
                                        if (zN6 || objG6 == Composer.Companion.f1624a) {
                                            objG6 = new f(5, function12);
                                            composer4.A(objG6);
                                        }
                                        composer4.l();
                                        CartIconButtonKt.a(num2, (Function0) objG6, null, CoreTheme.b(composer4).e.c.f4854a, composer4, 0, 4);
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
            long j9 = j4;
            long j10 = j3;
            SurfaceKt.b(modifier4, null, j9, j10, null, null, composableLambdaImplC, composerImplV, 50);
            j5 = j10;
            composerImpl = composerImplV;
            j6 = j9;
            modifier3 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(str, z, z2, z3, eventSink, num, z4, modifier3, j6, j5, i) { // from class: au.com.woolworths.feature.product.list.v2.ui.e
                public final /* synthetic */ String d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ Function1 h;
                public final /* synthetic */ Integer i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ Modifier k;
                public final /* synthetic */ long l;
                public final /* synthetic */ long m;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ProductListTopBarKt.a(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, RecomposeScopeImplKt.a(1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
