package au.com.woolworths.design.wx.component;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ChipDefaults;
import androidx.compose.material.ChipKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.RippleConfiguration;
import androidx.compose.material.RippleKt;
import androidx.compose.material.SelectableChipColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import au.com.woolworths.design.wx.foundation.ThemeContext;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.TintColors;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"design-wx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FilterChipKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ThemeContext.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ThemeContext themeContext = ThemeContext.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(final boolean z, final boolean z2, final Function0 onClick, final Modifier modifier, Shape shape, long j, long j2, SelectableChipColors selectableChipColors, Function2 function2, Function2 function22, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        Shape shape2;
        long j3;
        final long jB;
        SelectableChipColors selectableChipColors2;
        Function2 function23;
        int i5;
        int i6;
        long jB2;
        Shape shape3;
        int i7;
        ComposerImpl composerImpl;
        SelectableChipColors selectableChipColorsB;
        Function2 function24;
        long j4;
        ComposerImpl composerImpl2;
        final Shape shape4;
        final long j5;
        final SelectableChipColors selectableChipColors3;
        final Function2 function25;
        final Function2 function26;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(1841050800);
        if ((i & 6) == 0) {
            i4 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerImplV.p(z2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.I(onClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= composerImplV.n(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        if ((i & 24576) == 0) {
            if ((i3 & 16) == 0) {
                shape2 = shape;
                int i8 = composerImplV.n(shape2) ? 16384 : 8192;
                i4 |= i8;
            } else {
                shape2 = shape;
            }
            i4 |= i8;
        } else {
            shape2 = shape;
        }
        if ((196608 & i) == 0) {
            if ((i3 & 32) == 0) {
                j3 = j;
                int i9 = composerImplV.s(j3) ? 131072 : 65536;
                i4 |= i9;
            } else {
                j3 = j;
            }
            i4 |= i9;
        } else {
            j3 = j;
        }
        if ((1572864 & i) == 0) {
            jB = j2;
            i4 |= ((i3 & 64) == 0 && composerImplV.s(jB)) ? 1048576 : 524288;
        } else {
            jB = j2;
        }
        if ((i & 12582912) == 0) {
            if ((i3 & 128) == 0) {
                selectableChipColors2 = selectableChipColors;
                int i10 = composerImplV.I(selectableChipColors2) ? 8388608 : 4194304;
                i4 |= i10;
            } else {
                selectableChipColors2 = selectableChipColors;
            }
            i4 |= i10;
        } else {
            selectableChipColors2 = selectableChipColors;
        }
        int i11 = i3 & 256;
        if (i11 != 0) {
            i4 |= 100663296;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 100663296) == 0) {
                i4 |= composerImplV.I(function23) ? 67108864 : 33554432;
            }
        }
        int i12 = i4 | 805306368;
        int i13 = i3 & 1024;
        if (i13 != 0) {
            i6 = i2 | 6;
            i5 = i13;
        } else {
            i5 = i13;
            if ((i2 & 6) == 0) {
                i6 = i2 | (composerImplV.I(function22) ? 4 : 2);
            } else {
                i6 = i2;
            }
        }
        if ((i2 & 48) == 0) {
            i6 |= composerImplV.I(composableLambdaImpl) ? 32 : 16;
        }
        if ((i12 & 306783379) == 306783378 && (i6 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            long j6 = j3;
            function25 = function23;
            j5 = j6;
            function26 = function22;
            composerImpl2 = composerImplV;
            shape4 = shape2;
            selectableChipColors3 = selectableChipColors2;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                Shape shapeB = (i3 & 16) != 0 ? RoundedCornerShapeKt.b(4) : shape2;
                if ((i3 & 32) == 0) {
                    jB2 = j3;
                } else if (z2 && z) {
                    composerImplV.o(-276697129);
                    jB2 = WxTheme.a(composerImplV).h();
                    composerImplV.V(false);
                } else if (z2 && !z) {
                    composerImplV.o(-276694941);
                    jB2 = Color.b(WxTheme.a(composerImplV).h(), 0.38f);
                    composerImplV.V(false);
                } else if (z) {
                    composerImplV.o(-276691528);
                    composerImplV.V(false);
                    jB2 = ToneColors.h;
                } else {
                    composerImplV.o(-276693021);
                    composerImplV.V(false);
                    jB2 = Color.b(ToneColors.h, 0.38f);
                }
                if ((i3 & 64) != 0) {
                    jB = Color.b(ToneColors.c, z ? 1.0f : 0.5f);
                }
                if ((i3 & 128) != 0) {
                    float f = ChipDefaults.f1251a;
                    long jA = WxTheme.a(composerImplV).a();
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentColorKt.f1261a;
                    i7 = i11;
                    long j7 = ((Color) composerImplV.x(dynamicProvidableCompositionLocal)).f1766a;
                    long jA2 = WxTheme.a(composerImplV).a();
                    long jD = WxTheme.a(composerImplV).d();
                    int iOrdinal = ((ThemeContext) composerImplV.x(ThemeKt.f5160a)).ordinal();
                    if (iOrdinal != 0) {
                        shape3 = shapeB;
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j4 = TintColors.c;
                    } else {
                        shape3 = shapeB;
                        j4 = TintColors.e;
                    }
                    selectableChipColorsB = ChipDefaults.b(jA, j7, jA2, jD, j4, ((Color) composerImplV.x(dynamicProvidableCompositionLocal)).f1766a, composerImplV, 292);
                    composerImpl = composerImplV;
                } else {
                    shape3 = shapeB;
                    i7 = i11;
                    composerImpl = composerImplV;
                    selectableChipColorsB = selectableChipColors2;
                }
                if (i7 != 0) {
                    function23 = null;
                }
                function24 = i5 == 0 ? function22 : null;
                j3 = jB2;
                shape2 = shape3;
            } else {
                composerImplV.j();
                function24 = function22;
                composerImpl = composerImplV;
                selectableChipColorsB = selectableChipColors2;
            }
            composerImpl.W();
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = RippleKt.f1315a;
            composerImpl.o(1734830517);
            long jH = WxTheme.a(composerImpl).h();
            composerImpl.o(1849434622);
            Object objG = composerImpl.G();
            final SelectableChipColors selectableChipColors4 = selectableChipColorsB;
            if (objG == Composer.Companion.f1624a) {
                objG = new RippleConfiguration(jH, 2);
                composerImpl.A(objG);
            }
            composerImpl.V(false);
            composerImpl.V(false);
            ProvidedValue providedValueB = dynamicProvidableCompositionLocal2.b((RippleConfiguration) objG);
            composerImpl2 = composerImpl;
            final Modifier modifier3 = modifier2;
            final Shape shape5 = shape2;
            final long j8 = j3;
            final Function2 function27 = function24;
            final long j9 = jB;
            final Function2 function28 = function23;
            CompositionLocalKt.a(providedValueB, ComposableLambdaKt.c(-1788586000, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.wx.component.FilterChipKt$FilterChip$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        BorderStroke borderStrokeA = BorderStrokeKt.a(j8, 1);
                        final long j10 = j9;
                        final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                        ChipKt.b(z2, onClick, modifier3, z, shape5, borderStrokeA, selectableChipColors4, function28, function27, ComposableLambdaKt.c(95433327, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.design.wx.component.FilterChipKt$FilterChip$1.1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                final RowScope MaterialFilterChip = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(MaterialFilterChip, "$this$MaterialFilterChip");
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer3.n(MaterialFilterChip) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ProvidedValue providedValueG = androidx.camera.core.impl.b.g(j10, ContentColorKt.f1261a);
                                    final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                                    CompositionLocalKt.a(providedValueG, ComposableLambdaKt.c(1762842031, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.wx.component.FilterChipKt.FilterChip.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            Composer composer4 = (Composer) obj6;
                                            if ((((Number) obj7).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                composableLambdaImpl3.invoke(MaterialFilterChip, composer4, 0);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), composer3, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImpl2), composerImpl2, 56);
            shape4 = shape5;
            j5 = j8;
            selectableChipColors3 = selectableChipColors4;
            function25 = function28;
            function26 = function27;
            jB = j9;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.design.wx.component.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    FilterChipKt.a(z, z2, onClick, modifier, shape4, j5, jB, selectableChipColors3, function25, function26, composableLambdaImpl, (Composer) obj, iA, iA2, i3);
                    return Unit.f24250a;
                }
            };
        }
    }
}
