package au.com.woolworths.foundation.ui.couponbanner;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.android.onesite.modules.couponbanner.CouponBannerTermsAndConditions;
import au.com.woolworths.android.onesite.modules.couponbanner.EverydayMarketCouponBannerColorTheme;
import au.com.woolworths.android.onesite.modules.couponbanner.EverydayMarketCouponBannerData;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everydaymarket_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
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

    public static final void a(final EverydayMarketCouponBannerData data, final Function1 onCouponCodeClicked, final Function2 onTAndCsClicked, Modifier modifier, Composer composer, int i) {
        EverydayMarketCouponBannerColors everydayMarketCouponBannerColors;
        boolean z;
        Modifier modifier2;
        Intrinsics.h(data, "data");
        Intrinsics.h(onCouponCodeClicked, "onCouponCodeClicked");
        Intrinsics.h(onTAndCsClicked, "onTAndCsClicked");
        ComposerImpl composerImplV = composer.v(288596897);
        int i2 = (composerImplV.I(data) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onCouponCodeClicked) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onTAndCsClicked) ? 256 : 128;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            EverydayMarketCouponBannerColorTheme couponBannerColorTheme = data.d;
            Intrinsics.h(couponBannerColorTheme, "couponBannerColorTheme");
            composerImplV.o(929715735);
            int iOrdinal = couponBannerColorTheme.ordinal();
            if (iOrdinal == 0) {
                composerImplV.o(103630997);
                everydayMarketCouponBannerColors = new EverydayMarketCouponBannerColors(CoreTheme.b(composerImplV).f.b.f4862a.f4863a.b, CoreTheme.b(composerImplV).e.d.d, CoreTheme.b(composerImplV).f4782a.d.c.b, CoreTheme.b(composerImplV).f.b.f4862a.b.f4865a, CoreTheme.b(composerImplV).f4782a.f4783a.b.f4786a, CoreTheme.b(composerImplV).f.b.f4862a.b.f4865a);
                z = false;
                composerImplV.V(false);
            } else {
                if (iOrdinal != 1) {
                    throw au.com.woolworths.android.onesite.a.w(103628980, composerImplV, false);
                }
                composerImplV.o(103650337);
                everydayMarketCouponBannerColors = new EverydayMarketCouponBannerColors(CoreTheme.a(composerImplV).b.f4775a.d, CoreTheme.b(composerImplV).e.d.d, CoreTheme.b(composerImplV).f4782a.d.c.b, CoreTheme.b(composerImplV).f.b.f4862a.b.f4865a, CoreTheme.b(composerImplV).f4782a.f4783a.b.f4786a, CoreTheme.b(composerImplV).f.b.f4862a.b.f4865a);
                z = false;
                composerImplV.V(false);
            }
            final EverydayMarketCouponBannerColors everydayMarketCouponBannerColors2 = everydayMarketCouponBannerColors;
            composerImplV.V(z);
            modifier2 = modifier;
            CardKt.a(SizeKt.e(modifier2, 1.0f), null, everydayMarketCouponBannerColors2.f8914a, 0L, CoreTheme.c(composerImplV).f4876a, null, ComposableLambdaKt.c(691638484, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.ui.couponbanner.EverydayMarketCouponBannerKt$EverydayMarketCouponBanner$1
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
                        float f = 16;
                        Modifier modifierH = PaddingKt.h(PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), f, BitmapDescriptorFactory.HUE_RED, 2);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierH);
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
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        float f2 = 8;
                        Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, 11);
                        composer2.o(5004770);
                        EverydayMarketCouponBannerData everydayMarketCouponBannerData = data;
                        boolean zI = composer2.I(everydayMarketCouponBannerData);
                        Object objG = composer2.G();
                        if (zI || objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(everydayMarketCouponBannerData, 23);
                            composer2.A(objG);
                        }
                        composer2.l();
                        Modifier modifierB = SemanticsModifierKt.b(modifierJ, false, (Function1) objG);
                        String str = everydayMarketCouponBannerData.e;
                        TextStyle textStyle = CoreTheme.f(composer2).f5120a.f5121a.b;
                        EverydayMarketCouponBannerColors everydayMarketCouponBannerColors3 = everydayMarketCouponBannerColors2;
                        TextKt.a(str, textStyle, modifierB, everydayMarketCouponBannerColors3.b, null, 3, 0, false, 0, null, composer2, 0, 976);
                        Modifier modifierE = SizeKt.e(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 1.0f);
                        String str2 = everydayMarketCouponBannerData.f;
                        long j = everydayMarketCouponBannerColors3.c;
                        long j2 = everydayMarketCouponBannerColors3.d;
                        String str3 = everydayMarketCouponBannerData.i;
                        if (str3 == null) {
                            str3 = "";
                        }
                        EverydayMarketCouponBannerKt.b(str2, j, j2, str3, onCouponCodeClicked, modifierE, composer2, 196608);
                        CouponBannerTermsAndConditions couponBannerTermsAndConditions = everydayMarketCouponBannerData.k;
                        String str4 = couponBannerTermsAndConditions.e;
                        String str5 = couponBannerTermsAndConditions.d;
                        long j3 = everydayMarketCouponBannerColors3.f;
                        String str6 = couponBannerTermsAndConditions.f;
                        EverydayMarketCouponBannerKt.c(str4, str5, j3, str6 == null ? "" : str6, onTAndCsClicked, null, composer2, 0);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572864, 42);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.instore.presence.presentation.b(data, onCouponCodeClicked, onTAndCsClicked, modifier2, i, 3);
        }
    }

    public static final void b(final String str, final long j, final long j2, final String str2, final Function1 function1, Modifier modifier, Composer composer, final int i) {
        Modifier modifier2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(119286595);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.s(j) ? 32 : 16) | (composerImplV.s(j2) ? 256 : 128) | (composerImplV.n(str2) ? 2048 : 1024) | (composerImplV.I(function1) ? 16384 : 8192);
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.foundation.shop.olive.voice.ui.search.a(13);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            modifier2 = modifier;
            Modifier modifierB = SemanticsModifierKt.b(modifier2, true, (Function1) objG);
            composerImplV.o(5004770);
            boolean z = (i2 & 7168) == 2048;
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(str2, 27);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierA = SemanticsModifierKt.a(modifierB, (Function1) objG2);
            composerImplV.o(-1633490746);
            boolean z2 = ((57344 & i2) == 16384) | ((i2 & 14) == 4);
            Object objG3 = composerImplV.G();
            if (z2 || objG3 == composer$Companion$Empty$1) {
                objG3 = new d(function1, str, 1);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            CardKt.a(ClickableKt.d(modifierA, false, null, null, (Function0) objG3, 7), null, j2, 0L, CoreTheme.c(composerImplV).f4876a, null, ComposableLambdaKt.c(-621099600, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.ui.couponbanner.EverydayMarketCouponBannerKt$EverydayMarketCouponCode$4
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
                        Modifier modifierF = PaddingKt.f(SizeKt.e(companion, 1.0f), 6);
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.k, composer2, 54);
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
                        Updater.b(composer2, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        TextStyle textStyle = CoreTheme.f(composer2).f5120a.b.b;
                        String str3 = str;
                        long j3 = j;
                        TextKt.a(str3, textStyle, null, j3, null, 0, 0, false, 0, null, composer2, 0, 1012);
                        IconKt.b(CoreTheme.e(composer2).f4879a.f, null, PaddingKt.j(companion, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), j3, composer2, 432, 0);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, (i2 & 896) | 1572864, 42);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            final Modifier modifier3 = modifier2;
            recomposeScopeImplX.d = new Function2(str, j, j2, str2, function1, modifier3, i) { // from class: au.com.woolworths.foundation.ui.couponbanner.c
                public final /* synthetic */ String d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ String g;
                public final /* synthetic */ Function1 h;
                public final /* synthetic */ Modifier i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(196609);
                    EverydayMarketCouponBannerKt.b(this.d, this.e, this.f, this.g, this.h, this.i, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(final String str, final String str2, final long j, final String str3, final Function2 function2, Modifier modifier, Composer composer, final int i) {
        ComposerImpl composerImpl;
        final Modifier modifier2;
        ComposerImpl composerImplV = composer.v(594267879);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | (composerImplV.s(j) ? 256 : 128) | (composerImplV.n(str3) ? 2048 : 1024) | (composerImplV.I(function2) ? 16384 : 8192) | 196608;
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierI = SizeKt.i(companion, 48, BitmapDescriptorFactory.HUE_RED, 2);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.foundation.shop.olive.voice.ui.search.a(12);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierI, true, (Function1) objG);
            composerImplV.o(5004770);
            boolean z = (i2 & 7168) == 2048;
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(str3, 26);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierA = SemanticsModifierKt.a(modifierB, (Function1) objG2);
            composerImplV.o(-1746271574);
            int i3 = i2 & 14;
            boolean z2 = (i3 == 4) | ((i2 & 112) == 32) | ((57344 & i2) == 16384);
            Object objG3 = composerImplV.G();
            if (z2 || objG3 == composer$Companion$Empty$1) {
                objG3 = new a(function2, str2, str, 0);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            Modifier modifierD = ClickableKt.d(modifierA, false, null, null, (Function0) objG3, 7);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierD);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function22 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function22);
            }
            Updater.b(composerImplV, modifierD2, ComposeUiNode.Companion.d);
            int i5 = (i2 << 3) & 7168;
            composerImpl = composerImplV;
            TextKt.a(str, CoreTheme.f(composerImplV).f5120a.c.b, null, j, null, 0, 0, false, 0, null, composerImpl, i3 | i5, 1012);
            IconKt.b(CoreTheme.e(composerImpl).e.p, null, PaddingKt.j(companion, 2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), j, composerImpl, i5 | 432, 0);
            composerImpl.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(str, str2, j, str3, function2, modifier2, i) { // from class: au.com.woolworths.foundation.ui.couponbanner.b
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ long f;
                public final /* synthetic */ String g;
                public final /* synthetic */ Function2 h;
                public final /* synthetic */ Modifier i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    EverydayMarketCouponBannerKt.c(this.d, this.e, this.f, this.g, this.h, this.i, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
