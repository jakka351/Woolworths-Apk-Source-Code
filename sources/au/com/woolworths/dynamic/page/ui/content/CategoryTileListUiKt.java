package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.compose.utils.graphics.ForwardingPainterKt;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.dynamic.page.data.CategoryTileData;
import au.com.woolworths.dynamic.page.data.CategoryTileListData;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"dynamic-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CategoryTileListUiKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f5199a = 104;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static final void a(CategoryTileListData data, Modifier modifier, Function2 function2, Composer composer, int i, int i2) {
        Function2 function22;
        int i3;
        Modifier.Companion companion;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        float f;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1;
        ComposerImpl composerImpl;
        ?? r0;
        ComposerImpl composerImpl2;
        Modifier modifier2;
        Intrinsics.h(data, "data");
        ComposerImpl composerImplV = composer.v(319903641);
        int i4 = i | (composerImplV.I(data) ? 4 : 2);
        int i5 = i4 | 48;
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i4 | 432;
            function22 = function2;
        } else {
            function22 = function2;
            i3 = i5 | (composerImplV.I(function22) ? 256 : 128);
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl2 = composerImplV;
        } else {
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (i6 != 0) {
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == composer$Companion$Empty$12) {
                    objG = new androidx.navigation.compose.h(12, (byte) 0);
                    composerImplV.A(objG);
                }
                function22 = (Function2) objG;
                composerImplV.V(false);
            }
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion2, 1.0f);
            long jA = WxTheme.a(composerImplV).a();
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$12 = RectangleShapeKt.f1779a;
            Modifier modifierB = BackgroundKt.b(modifierE, jA, rectangleShapeKt$RectangleShape$12);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function23);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(113003472);
            String str = data.f5180a;
            if (str == null || str.length() == 0) {
                companion = companion2;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                f = 1.0f;
                rectangleShapeKt$RectangleShape$1 = rectangleShapeKt$RectangleShape$12;
                composerImpl = composerImplV;
                r0 = 0;
            } else {
                String str2 = data.f5180a;
                TextStyle textStyle = WxTheme.b(composerImplV).i;
                rectangleShapeKt$RectangleShape$1 = rectangleShapeKt$RectangleShape$12;
                f = 1.0f;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                companion = companion2;
                r0 = 0;
                TextKt.b(str2, PaddingKt.f(companion2, 16), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composerImplV, 0, 0, 65532);
                composerImpl = composerImplV;
            }
            composerImpl.V(r0);
            Modifier modifierJ = PaddingKt.j(BackgroundKt.b(SizeKt.e(companion, f), WxTheme.a(composerImpl).a(), rectangleShapeKt$RectangleShape$1), BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, 4, 5);
            PaddingValuesImpl paddingValuesImplA = PaddingKt.a(16, BitmapDescriptorFactory.HUE_RED, 2);
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(10);
            composerImpl.o(-1633490746);
            boolean zI = ((i3 & 896) == 256 ? true : r0) | composerImpl.I(data);
            Object objG2 = composerImpl.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new f(data, function22, r0);
                composerImpl.A(objG2);
            }
            composerImpl.V(r0);
            composerImpl2 = composerImpl;
            LazyDslKt.d(modifierJ, null, paddingValuesImplA, false, spacedAlignedG, null, null, false, null, (Function1) objG2, composerImpl2, 24960, 490);
            composerImpl2.V(true);
            modifier2 = companion;
        }
        Function2 function24 = function22;
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.lifecycle.compose.c(i, i2, 9, modifier2, data, function24);
        }
    }

    public static final void b(final CategoryTileData data, final Function1 onClick, float f, float f2, Composer composer, final int i) {
        final float f3;
        final float f4;
        Intrinsics.h(data, "data");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-567474795);
        int i2 = i | (composerImplV.n(data) ? 4 : 2) | (composerImplV.I(onClick) ? 32 : 16) | 3456;
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            f3 = f;
            f4 = f2;
        } else {
            float f5 = 12;
            float f6 = 2;
            Modifier modifierA = AspectRatioKt.a(SizeKt.u(Modifier.Companion.d, f5199a), 1.0f);
            RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(f5);
            composerImplV.o(-1633490746);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new g(0, onClick, data);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            CardKt.b((Function0) objG, modifierA, false, roundedCornerShapeB, 0L, 0L, null, f6, null, ComposableLambdaKt.c(936694139, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.content.CategoryTileListUiKt$CategoryTileUi$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Painter painterA = PainterResources_androidKt.a(R.drawable.ic_dynamic_page_image_placeholder, 0, composer2);
                        composer2.o(1849434622);
                        Object objG2 = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (objG2 == composer$Companion$Empty$1) {
                            objG2 = new androidx.navigation.compose.h(13, (byte) 0);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        Painter painterA2 = ForwardingPainterKt.a(painterA, null, (Function2) objG2, 6);
                        composer2.o(1849434622);
                        Object objG3 = composer2.G();
                        if (objG3 == composer$Companion$Empty$1) {
                            objG3 = Brush.Companion.c(new Pair[]{new Pair(Float.valueOf(BitmapDescriptorFactory.HUE_RED), new Color(Color.j)), new Pair(Float.valueOf(1.0f), new Color(ColorKt.d(2566914048L)))});
                            composer2.A(objG3);
                        }
                        Brush brush = (Brush) objG3;
                        composer2.l();
                        CategoryTileData categoryTileData = data;
                        String str = categoryTileData.b;
                        String str2 = categoryTileData.c;
                        if (str2 == null || str2.length() == 0) {
                            str2 = categoryTileData.f5179a;
                        }
                        SingletonAsyncImageKt.b(str, str2, null, painterA2, painterA2, null, null, null, null, null, ContentScale.Companion.b, null, composer2, 0, 6, 31716);
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierA2 = BackgroundKt.a(companion, brush);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierA2);
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
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        float f7 = 8;
                        Modifier modifierJ = PaddingKt.j(BoxScopeInstance.f944a.g(companion, Alignment.Companion.g), f7, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f7, 6);
                        composer2.o(1849434622);
                        Object objG4 = composer2.G();
                        if (objG4 == composer$Companion$Empty$1) {
                            objG4 = new au.com.woolworths.design.core.ui.component.stable.corerow.c(13);
                            composer2.A(objG4);
                        }
                        composer2.l();
                        TextKt.b(categoryTileData.f5179a, SemanticsModifierKt.a(modifierJ, (Function1) objG4), WxTheme.a(composer2).e(), 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, WxTheme.b(composer2).o, composer2, 0, 3120, 55288);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 817889328, 372);
            f3 = f5;
            f4 = f6;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(onClick, f3, f4, i) { // from class: au.com.woolworths.dynamic.page.ui.content.h
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ float f;
                public final /* synthetic */ float g;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    CategoryTileListUiKt.b(this.d, this.e, this.f, this.g, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
