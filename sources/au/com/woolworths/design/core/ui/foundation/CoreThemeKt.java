package au.com.woolworths.design.core.ui.foundation;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material.Colors;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.Typography;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import androidx.lifecycle.compose.d;
import au.com.woolworths.design.core.ui.foundation.color.CoreColorTokensKt;
import au.com.woolworths.design.core.ui.foundation.color.CoreThemeColorsKt;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevationTokensKt;
import au.com.woolworths.design.core.ui.foundation.elevation.LocalCoreElevationKt;
import au.com.woolworths.design.core.ui.foundation.icon.CoreIconsKt;
import au.com.woolworths.design.core.ui.foundation.icon.LocalCoreIconsKt;
import au.com.woolworths.design.core.ui.foundation.typography.CoreTypographyKt;
import au.com.woolworths.design.core.ui.foundation.typography.CoreTypographyTokensKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CoreThemeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f4773a = new StaticProvidableCompositionLocal(new d(2));

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

    public static final void a(ThemeContext themeContext, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        Intrinsics.h(themeContext, "themeContext");
        ComposerImpl composerImplV = composer.v(472520956);
        if ((i & 6) == 0) {
            i2 = (composerImplV.r(themeContext.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int iOrdinal = themeContext.ordinal();
            if (iOrdinal == 0) {
                composerImplV.o(-1173889250);
                c((i2 >> 3) & 14, composerImplV, composableLambdaImpl);
                composerImplV.V(false);
            } else {
                if (iOrdinal != 1) {
                    composerImplV.o(-1173890945);
                    composerImplV.V(false);
                    throw new NoWhenBranchMatchedException();
                }
                composerImplV.o(-1173887076);
                b((i2 >> 3) & 14, composerImplV, composableLambdaImpl);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(themeContext, i, 1, composableLambdaImpl);
        }
    }

    public static final void b(int i, Composer composer, final ComposableLambdaImpl composableLambdaImpl) {
        int i2;
        ComposerImpl composerImplV = composer.v(2103164976);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeColorsKt.a(CoreColorTokensKt.c, CoreColorTokensKt.d, CoreColorTokensKt.e, ComposableLambdaKt.c(1452488743, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.foundation.CoreThemeKt$EverydayTheme$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ProvidedValue[] providedValueArr = {CoreTypographyKt.f5119a.b(CoreTypographyTokensKt.b), LocalCoreIconsKt.f4894a.b(CoreIconsKt.f4893a), LocalCoreElevationKt.f4878a.b(CoreElevationTokensKt.a(composer2)), CoreThemeKt.f4773a.b(ThemeContext.e)};
                        final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                        CompositionLocalKt.b(providedValueArr, ComposableLambdaKt.c(1629539175, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.foundation.CoreThemeKt$EverydayTheme$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                                    MaterialThemeKt.a(null, null, null, ComposableLambdaKt.c(1804110611, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.foundation.CoreThemeKt.EverydayTheme.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer4 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                Typography typographyC = MaterialTheme.c(composer4);
                                                TextStyle textStyle = MaterialTheme.c(composer4).f;
                                                PlatformTextStyle platformTextStyle = new PlatformTextStyle(true);
                                                long j = TextUnit.c;
                                                Typography typographyA = Typography.a(typographyC, TextStyle.a(textStyle, 0L, 0L, null, null, 0L, j, platformTextStyle, null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer4).i, 0L, 0L, null, null, 0L, j, new PlatformTextStyle(true), null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer4).j, 0L, 0L, null, null, 0L, j, new PlatformTextStyle(true), null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer4).k, 0L, 0L, null, null, 0L, j, new PlatformTextStyle(true), null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer4).l, 0L, 0L, null, null, 0L, j, new PlatformTextStyle(true), null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer4).m, 0L, 0L, null, null, 0L, j, new PlatformTextStyle(true), null, 0, 16121855));
                                                composer4.o(-1866284438);
                                                Colors colorsA = MaterialTheme.a(composer4);
                                                long j2 = CoreTheme.a(composer4).b.f4775a.c;
                                                long j3 = CoreTheme.a(composer4).b.f4775a.f4776a;
                                                long j4 = CoreTheme.a(composer4).b.f4775a.c;
                                                long j5 = CoreTheme.a(composer4).b.f4775a.f4776a;
                                                long j6 = CoreTheme.b(composer4).e.f4848a.c;
                                                long j7 = CoreTheme.b(composer4).e.f4848a.c;
                                                long j8 = CoreTheme.b(composer4).d.d.e.f4847a;
                                                long j9 = CoreTheme.b(composer4).e.d.c.b;
                                                long j10 = CoreTheme.b(composer4).e.d.c.b;
                                                long j11 = CoreTheme.b(composer4).e.d.d;
                                                long j12 = CoreTheme.b(composer4).e.d.d;
                                                long j13 = CoreTheme.b(composer4).e.d.c.b;
                                                colorsA.getClass();
                                                Colors colors = new Colors(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, true);
                                                composer4.l();
                                                androidx.compose.material.MaterialThemeKt.a(colors, typographyA, null, composableLambdaImpl3, composer4, 0);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), composer3, 3072, 7);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 56);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 3510);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, 0, composableLambdaImpl);
        }
    }

    public static final void c(int i, Composer composer, ComposableLambdaImpl composableLambdaImpl) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1561392471);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-202573453);
            boolean zA = (((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue() || CoreTheme.f4771a) ? DarkThemeKt.a(composerImplV) : false;
            composerImplV.l();
            d(zA, composableLambdaImpl, composerImplV, (i2 << 3) & 112);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(composableLambdaImpl, i, 0);
        }
    }

    public static final void d(final boolean z, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-314774579);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            CoreThemeColorsKt.a(z ? CoreColorTokensKt.b : CoreColorTokensKt.f4781a, CoreColorTokensKt.d, CoreColorTokensKt.e, ComposableLambdaKt.c(-445375740, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.foundation.CoreThemeKt$WoolworthsTheme$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ProvidedValue[] providedValueArr = {CoreTypographyKt.f5119a.b(CoreTypographyTokensKt.f5136a), LocalCoreIconsKt.f4894a.b(CoreIconsKt.b), LocalCoreElevationKt.f4878a.b(CoreElevationTokensKt.a(composer2)), CoreThemeKt.f4773a.b(ThemeContext.d)};
                        final boolean z2 = z;
                        final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                        CompositionLocalKt.b(providedValueArr, ComposableLambdaKt.c(1871879748, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.foundation.CoreThemeKt$WoolworthsTheme$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    final boolean z3 = z2;
                                    final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                                    MaterialThemeKt.a(null, null, null, ComposableLambdaKt.c(-1874872592, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.foundation.CoreThemeKt.WoolworthsTheme.2.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer4 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                Typography typographyC = MaterialTheme.c(composer4);
                                                TextStyle textStyle = MaterialTheme.c(composer4).f;
                                                PlatformTextStyle platformTextStyle = new PlatformTextStyle(true);
                                                long j = TextUnit.c;
                                                Typography typographyA = Typography.a(typographyC, TextStyle.a(textStyle, 0L, 0L, null, null, 0L, j, platformTextStyle, null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer4).i, 0L, 0L, null, null, 0L, j, new PlatformTextStyle(true), null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer4).j, 0L, 0L, null, null, 0L, j, new PlatformTextStyle(true), null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer4).k, 0L, 0L, null, null, 0L, j, new PlatformTextStyle(true), null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer4).l, 0L, 0L, null, null, 0L, j, new PlatformTextStyle(true), null, 0, 16121855), TextStyle.a(MaterialTheme.c(composer4).m, 0L, 0L, null, null, 0L, j, new PlatformTextStyle(true), null, 0, 16121855));
                                                composer4.o(-785500707);
                                                Colors colorsA = MaterialTheme.a(composer4);
                                                long j2 = CoreTheme.a(composer4).f4774a.b.b;
                                                long j3 = CoreTheme.a(composer4).f4774a.b.f4779a;
                                                long j4 = CoreTheme.a(composer4).f4774a.b.b;
                                                long j5 = CoreTheme.a(composer4).f4774a.b.f4779a;
                                                long j6 = CoreTheme.b(composer4).e.f4848a.c;
                                                long j7 = CoreTheme.b(composer4).e.f4848a.c;
                                                long j8 = CoreTheme.b(composer4).d.d.e.f4847a;
                                                long j9 = CoreTheme.b(composer4).e.d.c.b;
                                                long j10 = CoreTheme.b(composer4).e.d.c.b;
                                                long j11 = CoreTheme.b(composer4).e.d.d;
                                                long j12 = CoreTheme.b(composer4).e.d.d;
                                                long j13 = CoreTheme.b(composer4).e.d.c.b;
                                                boolean z4 = !z3;
                                                colorsA.getClass();
                                                Colors colors = new Colors(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z4);
                                                composer4.l();
                                                androidx.compose.material.MaterialThemeKt.a(colors, typographyA, null, composableLambdaImpl3, composer4, 0);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), composer3, 3072, 7);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 56);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 3504);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.design.core.ui.foundation.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    CoreThemeKt.d(z, composableLambdaImpl, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
