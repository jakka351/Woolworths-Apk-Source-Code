package au.com.woolworths.shared.ui.compose.couponbanner;

import android.graphics.DashPathEffect;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.RippleKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathEffect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.android.onesite.modules.couponbanner.EverydayMarketCouponBannerColorTheme;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.d;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shared-ui-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class EverydayMarketCouponBannerKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[EverydayMarketCouponBannerColorTheme.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EverydayMarketCouponBannerColorTheme everydayMarketCouponBannerColorTheme = EverydayMarketCouponBannerColorTheme.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(final String description, final String couponCode, final String couponMinSpend, final String termsAndConditionsText, final String termsAndConditionsUrl, final String accessibleCouponCode, final String str, final EverydayMarketCouponBannerColorTheme colorTheme, final Function2 onTermsAndConditionsClicked, final Function1 onCouponCodeClicked, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        String str2;
        Modifier modifier2;
        int i5;
        EverydayMarketCouponBannerColors everydayMarketCouponBannerColors;
        boolean z;
        ComposerImpl composerImpl;
        Intrinsics.h(description, "description");
        Intrinsics.h(couponCode, "couponCode");
        Intrinsics.h(couponMinSpend, "couponMinSpend");
        Intrinsics.h(termsAndConditionsText, "termsAndConditionsText");
        Intrinsics.h(termsAndConditionsUrl, "termsAndConditionsUrl");
        Intrinsics.h(accessibleCouponCode, "accessibleCouponCode");
        Intrinsics.h(colorTheme, "colorTheme");
        Intrinsics.h(onTermsAndConditionsClicked, "onTermsAndConditionsClicked");
        Intrinsics.h(onCouponCodeClicked, "onCouponCodeClicked");
        ComposerImpl composerImplV = composer.v(2033350740);
        if ((i & 6) == 0) {
            i4 = (composerImplV.n(description) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerImplV.n(couponCode) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.n(couponMinSpend) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= composerImplV.n(termsAndConditionsText) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= composerImplV.n(termsAndConditionsUrl) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= composerImplV.n(accessibleCouponCode) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            str2 = str;
            i4 |= composerImplV.n(str2) ? 1048576 : 524288;
        } else {
            str2 = str;
        }
        if ((12582912 & i) == 0) {
            i4 |= composerImplV.r(colorTheme.ordinal()) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= composerImplV.I(onTermsAndConditionsClicked) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= composerImplV.I(onCouponCodeClicked) ? 536870912 : 268435456;
        }
        int i6 = i3 & 1024;
        if (i6 != 0) {
            modifier2 = modifier;
            i5 = 6;
        } else {
            modifier2 = modifier;
            if ((i2 & 6) == 0) {
                i5 = i2 | (composerImplV.n(modifier2) ? 4 : 2);
            } else {
                i5 = i2;
            }
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Modifier modifier3 = i6 != 0 ? Modifier.Companion.d : modifier2;
            composerImplV.o(-1631022903);
            int iOrdinal = colorTheme.ordinal();
            if (iOrdinal == 0) {
                composerImplV.o(250060437);
                everydayMarketCouponBannerColors = new EverydayMarketCouponBannerColors(CoreTheme.a(composerImplV).b.f4775a.b, CoreTheme.b(composerImplV).e.d.d, CoreTheme.b(composerImplV).e.d.d, CoreTheme.b(composerImplV).f4782a.f4783a.b.b, CoreTheme.b(composerImplV).f4782a.f4783a.b.f4786a, CoreTheme.b(composerImplV).e.d.b);
                z = false;
                composerImplV.V(false);
            } else {
                if (iOrdinal != 1) {
                    throw au.com.woolworths.android.onesite.a.w(250058386, composerImplV, false);
                }
                composerImplV.o(250078193);
                everydayMarketCouponBannerColors = new EverydayMarketCouponBannerColors(CoreTheme.a(composerImplV).b.f4775a.d, CoreTheme.b(composerImplV).e.d.d, CoreTheme.b(composerImplV).e.d.d, CoreTheme.b(composerImplV).f4782a.f4783a.b.b, CoreTheme.b(composerImplV).f4782a.f4783a.b.f4786a, CoreTheme.b(composerImplV).e.d.b);
                z = false;
                composerImplV.V(false);
            }
            composerImplV.V(z);
            final EverydayMarketCouponBannerColors everydayMarketCouponBannerColors2 = everydayMarketCouponBannerColors;
            final String str3 = str2;
            composerImpl = composerImplV;
            CardKt.a(SizeKt.e(modifier3, 1.0f), null, everydayMarketCouponBannerColors2.f10094a, 0L, CoreTheme.c(composerImplV).f4876a, null, ComposableLambdaKt.c(269872961, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shared.ui.compose.couponbanner.EverydayMarketCouponBannerKt$EverydayMarketCouponBanner$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope Card = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(Card, "$this$Card");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierF = PaddingKt.f(SizeKt.e(companion, 1.0f), 16);
                        String str4 = termsAndConditionsText;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierF);
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
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, columnMeasurePolicyA, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        BiasAlignment.Vertical vertical = Alignment.Companion.k;
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical, composer2, 48);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, companion);
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
                        Updater.b(composer2, rowMeasurePolicyA, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
                        Modifier modifierA = rowScopeInstance.a(companion, 1.0f, true);
                        TextStyle textStyle = CoreTheme.f(composer2).e.b.b;
                        EverydayMarketCouponBannerColors everydayMarketCouponBannerColors3 = everydayMarketCouponBannerColors2;
                        TextKt.a(description, textStyle, modifierA, everydayMarketCouponBannerColors3.b, null, 0, 0, false, 0, null, composer2, 0, 1008);
                        float f = 8;
                        EverydayMarketCouponBannerKt.b(couponCode, accessibleCouponCode, everydayMarketCouponBannerColors3.c, everydayMarketCouponBannerColors3.d, everydayMarketCouponBannerColors3.e, onCouponCodeClicked, PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), composer2, 1572864);
                        composer2.f();
                        Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                        RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$Start$1, vertical, composer2, 48);
                        int p3 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer2, modifierJ);
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
                        Updater.b(composer2, rowMeasurePolicyA2, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD3, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                            androidx.camera.core.impl.b.z(p3, composer2, p3, function23);
                        }
                        Updater.b(composer2, modifierD3, function24);
                        float f2 = 48;
                        SingletonAsyncImageKt.b(str3, null, SizeKt.g(SizeKt.u(companion, 100), f2), null, null, null, null, null, null, null, null, null, composer2, 3504, 0, 32752);
                        SpacerKt.a(composer2, rowScopeInstance.a(companion, 1.0f, true));
                        AnnotatedString.Builder builder = new AnnotatedString.Builder();
                        builder.e(couponMinSpend);
                        builder.e(" ");
                        int iL = builder.l(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, 61439));
                        try {
                            builder.e(str4);
                            builder.i(iL);
                            AnnotatedString annotatedStringM = builder.m();
                            Modifier modifierX = SizeKt.x(SizeKt.i(PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), f2, BitmapDescriptorFactory.HUE_RED, 2), Alignment.Companion.k, false);
                            String strC = StringResources_androidKt.c(composer2, R.string.everyday_market_terms_and_conditions_accessibility_click_label);
                            composer2.o(-1746271574);
                            Function2 function25 = onTermsAndConditionsClicked;
                            boolean zN = composer2.n(function25);
                            String str5 = termsAndConditionsUrl;
                            boolean zN2 = zN | composer2.n(str5) | composer2.n(str4);
                            Object objG = composer2.G();
                            if (zN2 || objG == Composer.Companion.f1624a) {
                                objG = new au.com.woolworths.foundation.ui.couponbanner.a(function25, str5, str4, 1);
                                composer2.A(objG);
                            }
                            composer2.l();
                            TextKt.b(annotatedStringM, CoreTheme.f(composer2).f5120a.c.f5124a, ClickableKt.d(modifierX, false, strC, null, (Function0) objG, 5), everydayMarketCouponBannerColors3.f, 6, 0, false, 0, null, null, composer2, 0, 2000);
                            composer2.f();
                            composer2.f();
                        } catch (Throwable th) {
                            builder.i(iL);
                            throw th;
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 1572864, 42);
            modifier2 = modifier3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            final Modifier modifier4 = modifier2;
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.shared.ui.compose.couponbanner.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    EverydayMarketCouponBannerKt.a(description, couponCode, couponMinSpend, termsAndConditionsText, termsAndConditionsUrl, accessibleCouponCode, str, colorTheme, onTermsAndConditionsClicked, onCouponCodeClicked, modifier4, (Composer) obj, iA, iA2, i3);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final String str, final String str2, final long j, final long j2, final long j3, final Function1 function1, final Modifier modifier, Composer composer, final int i) {
        final long j4;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-795305816);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | (composerImplV.s(j) ? 256 : 128) | (composerImplV.s(j2) ? 2048 : 1024) | (composerImplV.s(j3) ? 16384 : 8192) | (composerImplV.I(function1) ? 131072 : 65536);
        if ((599187 & i2) == 599186 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            CompositionLocal compositionLocal = CompositionLocalsKt.h;
            float f = 8;
            final float fT1 = ((Density) composerImplV.x(compositionLocal)).T1(f);
            final Stroke stroke = new Stroke(((Density) composerImplV.x(compositionLocal)).T1(1), BitmapDescriptorFactory.HUE_RED, 0, 0, new AndroidPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, BitmapDescriptorFactory.HUE_RED)), 14);
            long j5 = CoreTheme.a(composerImplV).b.f4775a.d;
            String strB = StringResources_androidKt.b(R.string.everyday_market_coupon_coupon_accessibility_text, new Object[]{str2}, composerImplV);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = InteractionSourceKt.a();
                composerImplV.A(objG);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objG;
            composerImplV.V(false);
            IntrinsicSize intrinsicSize = IntrinsicSize.e;
            Modifier modifierA = ClipKt.a(IntrinsicKt.a(IntrinsicKt.b(modifier, intrinsicSize), intrinsicSize), RoundedCornerShapeKt.b(f));
            String strC = StringResources_androidKt.c(composerImplV, R.string.everyday_market_coupon_coupon_accessibility_click_label);
            IndicationNodeFactory indicationNodeFactoryB = RippleKt.b(BitmapDescriptorFactory.HUE_RED, 3, j3, false);
            composerImplV.o(-1633490746);
            int i3 = i2 & 14;
            boolean z = (i3 == 4) | ((i2 & 458752) == 131072);
            Object objG2 = composerImplV.G();
            if (z || objG2 == obj) {
                objG2 = new d(function1, str, 2);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierB = ClickableKt.b(modifierA, mutableInteractionSource, indicationNodeFactoryB, false, strC, null, (Function0) objG2, 20);
            composerImplV.o(1849434622);
            Object objG3 = composerImplV.G();
            if (objG3 == obj) {
                objG3 = new au.com.woolworths.sdui.legacy.banner.c(13);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            Modifier modifierB2 = SemanticsModifierKt.b(modifierB, true, (Function1) objG3);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(strB);
            Object objG4 = composerImplV.G();
            if (zN || objG4 == obj) {
                objG4 = new au.com.woolworths.shared.ui.compose.a(strB, 3);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            Modifier modifierA2 = SemanticsModifierKt.a(modifierB2, (Function1) objG4);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA2);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            RoundedCornerShape roundedCornerShapeD = RoundedCornerShapeKt.d(f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 6);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierA3 = IntrinsicKt.a(IntrinsicKt.b(BackgroundKt.b(companion, j5, roundedCornerShapeD), intrinsicSize), intrinsicSize);
            BiasAlignment biasAlignment = Alignment.Companion.f1719a;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierA3);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            TextKt.a(str, CoreTheme.f(composerImplV).f5120a.c.c, PaddingKt.g(companion, f, 16), j, null, 0, 0, false, 0, null, composerImplV, i3 | ((i2 << 3) & 7168), 1008);
            Modifier modifierX0 = PaddingKt.f(companion, (float) 0.5d).x0(SizeKt.c);
            composerImplV.o(-1746271574);
            boolean zQ = composerImplV.q(fT1) | ((i2 & 7168) == 2048) | composerImplV.I(stroke);
            Object objG5 = composerImplV.G();
            if (zQ || objG5 == obj) {
                j4 = j2;
                objG5 = new Function1() { // from class: au.com.woolworths.shared.ui.compose.couponbanner.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        DrawScope Canvas = (DrawScope) obj2;
                        Intrinsics.h(Canvas, "$this$Canvas");
                        float f2 = fT1;
                        long jFloatToRawIntBits = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                        AndroidPath androidPathA = AndroidPath_androidKt.a();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.h() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.h() & 4294967295L));
                        Path.k(androidPathA, RoundRectKt.a(RectKt.a((Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), jFloatToRawIntBits, 0L, 0L, jFloatToRawIntBits));
                        DrawScope.Z(Canvas, androidPathA, j4, BitmapDescriptorFactory.HUE_RED, stroke, 52);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG5);
            } else {
                j4 = j2;
            }
            composerImplV.V(false);
            CanvasKt.a(modifierX0, (Function1) objG5, composerImplV, 6);
            composerImplV.V(true);
            Modifier modifierB3 = BackgroundKt.b(SizeKt.c(companion, 1.0f), j4, RoundedCornerShapeKt.d(BitmapDescriptorFactory.HUE_RED, f, f, BitmapDescriptorFactory.HUE_RED, 9));
            MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierB3);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            IconKt.a(PainterResources_androidKt.a(R.drawable.ic_coupon_copy, 0, composerImplV), null, BoxScopeInstance.f944a.g(PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2), Alignment.Companion.e), j5, composerImplV, 48, 0);
            composerImpl = composerImplV;
            composerImpl.V(true);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(str, str2, j, j2, j3, function1, modifier, i) { // from class: au.com.woolworths.shared.ui.compose.couponbanner.c
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ long f;
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Modifier j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = RecomposeScopeImplKt.a(1572865);
                    EverydayMarketCouponBannerKt.b(this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj2, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
