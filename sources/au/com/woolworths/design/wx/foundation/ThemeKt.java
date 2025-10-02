package au.com.woolworths.design.wx.foundation;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.material.Colors;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.material.Typography;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import androidx.lifecycle.compose.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"design-wx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThemeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f5160a = new StaticProvidableCompositionLocal(new d(10));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
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

    public static final void a(final int i, Composer composer, final ComposableLambdaImpl composableLambdaImpl) {
        ComposerImpl composerImplV = composer.v(1428832322);
        if (((i | 6) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ColorSchemeKt.f5155a;
            long jA = RewardsColors.a();
            long jA2 = RewardsColors.a();
            long j = ToneColors.k;
            ColorSchemeKt.a(new ColorScheme(jA, jA2, j, ToneColors.j, RewardsColors.b(), TextColors.f5159a, TextColors.b, TextColors.c, j, AccentColors.f5153a), ComposableLambdaKt.c(-31768242, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.wx.foundation.ThemeKt$RewardsTheme$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ProvidedValue[] providedValueArr = {ThemeKt.f5160a.b(ThemeContext.e), TypeKt.b.b(TypeKt.f5163a)};
                        final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                        CompositionLocalKt.b(providedValueArr, ComposableLambdaKt.c(1257534606, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.wx.foundation.ThemeKt$RewardsTheme$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Typography typographyC = MaterialTheme.c(composer3);
                                    TextStyle textStyle = MaterialTheme.c(composer3).f;
                                    PlatformTextStyle platformTextStyle = new PlatformTextStyle(true);
                                    long j2 = TextUnit.c;
                                    Typography typographyA = Typography.a(typographyC, TextStyle.a(textStyle, 0L, 0L, null, null, 0L, j2, platformTextStyle, null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer3).i, 0L, 0L, null, null, 0L, j2, new PlatformTextStyle(true), null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer3).j, 0L, 0L, null, null, 0L, j2, new PlatformTextStyle(true), null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer3).k, 0L, 0L, null, null, 0L, j2, new PlatformTextStyle(true), null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer3).l, 0L, 0L, null, null, 0L, j2, new PlatformTextStyle(true), null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer3).m, 0L, 0L, null, null, 0L, j2, new PlatformTextStyle(true), null, 0, 16121855));
                                    Colors colorsA = WxMaterialThemeAdapterKt.a(WxTheme.a(composer3), composer3);
                                    final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                                    MaterialThemeKt.a(colorsA, typographyA, null, ComposableLambdaKt.c(-1004082630, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.wx.foundation.ThemeKt.RewardsTheme.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer4 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                CompositionLocalKt.a(IndicationKt.f838a.b(new RippleNodeFactory(WxTheme.a(composer4).h())), composableLambdaImpl3, composer4, 8);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), composer3, 3072);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 56);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 48);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(i) { // from class: au.com.woolworths.design.wx.foundation.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ThemeKt.a(RecomposeScopeImplKt.a(49), (Composer) obj, this.d);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(int i, Composer composer, final ComposableLambdaImpl composableLambdaImpl) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1594390984);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ColorSchemeKt.f5155a;
            long j = WoolworthsColors.f5164a;
            long j2 = WoolworthsColors.b;
            long j3 = ToneColors.k;
            ColorSchemeKt.a(new ColorScheme(j, j2, j3, ToneColors.j, j, TextColors.f5159a, TextColors.b, TextColors.c, j3, AccentColors.f5153a), ComposableLambdaKt.c(-2028161876, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.wx.foundation.ThemeKt$ShopTheme$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ProvidedValue[] providedValueArr = {ThemeKt.f5160a.b(ThemeContext.d), TypeKt.b.b(TypeKt.f5163a)};
                        final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                        CompositionLocalKt.b(providedValueArr, ComposableLambdaKt.c(503515500, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.wx.foundation.ThemeKt$ShopTheme$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Typography typographyC = MaterialTheme.c(composer3);
                                    TextStyle textStyle = MaterialTheme.c(composer3).f;
                                    PlatformTextStyle platformTextStyle = new PlatformTextStyle(true);
                                    long j4 = TextUnit.c;
                                    MaterialThemeKt.a(WxMaterialThemeAdapterKt.a(WxTheme.a(composer3), composer3), Typography.a(typographyC, TextStyle.a(textStyle, 0L, 0L, null, null, 0L, j4, platformTextStyle, null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer3).i, 0L, 0L, null, null, 0L, j4, new PlatformTextStyle(true), null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer3).j, 0L, 0L, null, null, 0L, j4, new PlatformTextStyle(true), null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer3).k, 0L, 0L, null, null, 0L, j4, new PlatformTextStyle(true), null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer3).l, 0L, 0L, null, null, 0L, j4, new PlatformTextStyle(true), null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer3).m, 0L, 0L, null, null, 0L, j4, new PlatformTextStyle(true), null, 0, 16121855)), null, composableLambdaImpl2, composer3, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 56);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 48);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.foundation.b(composableLambdaImpl, i, 1);
        }
    }

    public static final void c(ThemeContext themeContext, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        Intrinsics.h(themeContext, "themeContext");
        ComposerImpl composerImplV = composer.v(-495700829);
        if ((((composerImplV.r(themeContext.ordinal()) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int iOrdinal = themeContext.ordinal();
            if (iOrdinal == 0) {
                composerImplV.o(372878325);
                b(6, composerImplV, composableLambdaImpl);
                composerImplV.V(false);
            } else {
                if (iOrdinal != 1) {
                    composerImplV.o(372876814);
                    composerImplV.V(false);
                    throw new NoWhenBranchMatchedException();
                }
                composerImplV.o(372879970);
                a(48, composerImplV, composableLambdaImpl);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.navigation.compose.d(themeContext, i, 8, composableLambdaImpl);
        }
    }
}
