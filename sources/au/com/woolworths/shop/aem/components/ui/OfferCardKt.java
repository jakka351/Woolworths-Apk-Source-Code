package au.com.woolworths.shop.aem.components.ui;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightModifierKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardData;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardPriceInfo;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardTextColor;
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
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OfferCardKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[OfferCardTextColor.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OfferCardTextColor offerCardTextColor = OfferCardTextColor.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(final OfferCardData offerCardData, final Function1 onClick, Modifier modifier, final boolean z, SharedIntrinsicHeightState sharedIntrinsicHeightState, Composer composer, int i, int i2) {
        SharedIntrinsicHeightState sharedIntrinsicHeightState2;
        Modifier modifier2;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(1500734652);
        int i3 = (composerImplV.I(offerCardData) ? 4 : 2) | i | (composerImplV.I(onClick) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if (((i3 | (composerImplV.p(z) ? 2048 : 1024) | 24576) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            sharedIntrinsicHeightState2 = sharedIntrinsicHeightState;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion.d : modifier;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = au.com.woolworths.dynamic.page.ui.content.d.f(composerImplV);
            }
            final SharedIntrinsicHeightState sharedIntrinsicHeightState3 = (SharedIntrinsicHeightState) objG;
            composerImplV.V(false);
            final float f = ((float) (((Configuration) composerImplV.x(AndroidCompositionLocals_androidKt.f1950a)).smallestScreenWidthDp * 0.9d)) - 16;
            final Modifier modifier4 = modifier3;
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(-1884315680, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.OfferCardKt$OfferCard$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierA = SharedIntrinsicHeightModifierKt.a(SizeKt.o(modifier4, f), sharedIntrinsicHeightState3);
                        composer2.o(5004770);
                        final OfferCardData offerCardData2 = offerCardData;
                        boolean zI = composer2.I(offerCardData2);
                        Object objG2 = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (zI || objG2 == composer$Companion$Empty$1) {
                            objG2 = new au.com.woolworths.product.details.d(offerCardData2, 6);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        Modifier modifierB = SemanticsModifierKt.b(modifierA, true, (Function1) objG2);
                        RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(12);
                        composer2.o(-1633490746);
                        Function1 function1 = onClick;
                        boolean zN = composer2.n(function1) | composer2.I(offerCardData2);
                        Object objG3 = composer2.G();
                        if (zN || objG3 == composer$Companion$Empty$1) {
                            objG3 = new au.com.woolworths.sdui.common.alert.a(7, function1, offerCardData2);
                            composer2.A(objG3);
                        }
                        composer2.l();
                        final boolean z2 = z;
                        CardKt.b((Function0) objG3, modifierB, false, roundedCornerShapeB, 0L, 0L, 0L, 0L, null, null, null, ComposableLambdaKt.c(1788759771, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.OfferCardKt$OfferCard$2.3
                            /* JADX WARN: Removed duplicated region for block: B:50:0x0184  */
                            /* JADX WARN: Removed duplicated region for block: B:85:0x02cb  */
                            @Override // kotlin.jvm.functions.Function3
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object invoke(java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
                                /*
                                    Method dump skipped, instructions count: 723
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.aem.components.ui.OfferCardKt$OfferCard$2.AnonymousClass3.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }, composer2), composer2, 0, 2036);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            sharedIntrinsicHeightState2 = sharedIntrinsicHeightState3;
            modifier2 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.inbox.ui.component.a(offerCardData, onClick, modifier2, z, sharedIntrinsicHeightState2, i, i2, 3);
        }
    }

    public static final void b(ImageWithAltText imageWithAltText, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(189836093);
        if ((((composerImplV.n(imageWithAltText) ? 4 : 2) | i | (composerImplV.n(modifier) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierF = PaddingKt.f(modifier, 16);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            SingletonAsyncImageKt.b(imageWithAltText != null ? imageWithAltText.f10141a : null, null, SizeKt.g(Modifier.Companion.d, 80), null, g(composerImplV), null, null, null, null, null, ContentScale.Companion.c, null, composerImplV, 432, 6, 31720);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(imageWithAltText, i, 8, modifier);
        }
    }

    public static final void c(final ImageWithAltText imageWithAltText, final String str, final long j, final boolean z, final Modifier modifier, Composer composer, final int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-313035887);
        int i2 = i | (composerImplV.n(imageWithAltText) ? 4 : 2) | (composerImplV.n(str) ? 32 : 16) | (composerImplV.s(j) ? 256 : 128) | (composerImplV.p(z) ? 2048 : 1024) | (composerImplV.n(modifier) ? 16384 : 8192);
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            float f = 16;
            Modifier modifierF = PaddingKt.f(modifier, f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(f), Alignment.Companion.k, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
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
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(1726286001);
            Modifier.Companion companion = Modifier.Companion.d;
            if (z) {
                SingletonAsyncImageKt.b(imageWithAltText != null ? imageWithAltText.f10141a : null, null, SizeKt.q(companion, 80), null, g(composerImplV), null, null, null, null, null, null, null, composerImplV, 432, 0, 32744);
            }
            composerImplV.V(false);
            TextKt.b(str, RowScopeInstance.f974a.a(companion, 1.0f, true), j, 0L, null, 0L, null, new TextAlign(z ? 6 : 3), 0L, 2, false, 2, 0, null, CoreTheme.f(composerImplV).d.c.b, composerImplV, ((i2 >> 3) & 14) | (i2 & 896), 3120, 54776);
            composerImpl = composerImplV;
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(str, j, z, modifier, i) { // from class: au.com.woolworths.shop.aem.components.ui.c
                public final /* synthetic */ String e;
                public final /* synthetic */ long f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ Modifier h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    OfferCardKt.c(this.d, this.e, this.f, this.g, this.h, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void d(ImageWithAltText imageWithAltText, String str, long j, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1206675);
        int i2 = i | (composerImplV.n(imageWithAltText) ? 4 : 2) | (composerImplV.n(str) ? 32 : 16) | (composerImplV.s(j) ? 256 : 128) | (composerImplV.n(modifier) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            SingletonAsyncImageKt.b(imageWithAltText.f10141a, null, SizeKt.c, null, g(composerImplV), null, null, null, null, null, ContentScale.Companion.f1880a, null, composerImplV, 432, 6, 31720);
            composerImplV.o(-1005299395);
            if (!StringsKt.D(str)) {
                TextKt.b(str, null, j, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, CoreTheme.f(composerImplV).d.c.b, composerImplV, ((i2 >> 3) & 14) | (i2 & 896), 3120, 55290);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.a(imageWithAltText, str, j, modifier, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    public static final void e(final OfferCardPriceInfo offerCardPriceInfo, Composer composer, final int i) {
        Function2 function2;
        Arrangement$Top$1 arrangement$Top$1;
        Function0 function0;
        Function2 function22;
        String str;
        Modifier.Companion companion;
        BiasAlignment.Horizontal horizontal;
        Function2 function23;
        BiasAlignment.Vertical vertical;
        Function2 function24;
        int i2;
        ?? r4;
        ComposerImpl composerImpl;
        Function0 function02;
        Function2 function25;
        final OfferCardPriceInfo offerCardPriceInfo2;
        ComposerImpl composerImpl2;
        ComposerImpl composerImplV = composer.v(1921566998);
        if ((((composerImplV.n(offerCardPriceInfo) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            offerCardPriceInfo2 = offerCardPriceInfo;
            composerImpl2 = composerImplV;
        } else {
            if (offerCardPriceInfo == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i3 = 0;
                    recomposeScopeImplX.d = new Function2(offerCardPriceInfo, i, i3) { // from class: au.com.woolworths.shop.aem.components.ui.b
                        public final /* synthetic */ int d;
                        public final /* synthetic */ OfferCardPriceInfo e;

                        {
                            this.d = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.d;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    OfferCardKt.e(this.e, composer2, RecomposeScopeImplKt.a(1));
                                    break;
                                default:
                                    OfferCardKt.e(this.e, composer2, RecomposeScopeImplKt.a(1));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            String str2 = offerCardPriceInfo.f10176a;
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierF = PaddingKt.f(companion2, 8);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.sdui.legacy.banner.c(26);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierA = SemanticsModifierKt.a(modifierF, (Function1) objG);
            Arrangement$Top$1 arrangement$Top$12 = Arrangement.c;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$12, horizontal2, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Function2 function26 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function26);
            Function2 function27 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function27);
            Function2 function28 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function28);
            }
            Function2 function29 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function29);
            String str3 = offerCardPriceInfo.c;
            composerImplV.o(-489756164);
            BiasAlignment.Vertical vertical2 = Alignment.Companion.j;
            if (str3 == null) {
                composerImpl = composerImplV;
                function24 = function29;
                str = str2;
                vertical = vertical2;
                companion = companion2;
                arrangement$Top$1 = arrangement$Top$12;
                r4 = 0;
                horizontal = horizontal2;
                function2 = function27;
                function23 = function28;
                function0 = function03;
                function22 = function26;
                i2 = 1;
            } else {
                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, vertical2, composerImplV, 0);
                int i5 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion2);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function03);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA, function26);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function27);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                    androidx.camera.core.impl.b.B(i5, composerImplV, i5, function28);
                }
                Updater.b(composerImplV, modifierD2, function29);
                TextStyle textStyle = CoreTheme.f(composerImplV).d.c.b;
                function2 = function27;
                arrangement$Top$1 = arrangement$Top$12;
                function0 = function03;
                function22 = function26;
                str = str2;
                companion = companion2;
                horizontal = horizontal2;
                function23 = function28;
                vertical = vertical2;
                function24 = function29;
                i2 = 1;
                TextKt.b(str3, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composerImplV, 0, 0, 65534);
                ComposerImpl composerImpl3 = composerImplV;
                composerImpl3.V(true);
                r4 = 0;
                composerImpl = composerImpl3;
            }
            composerImpl.V(r4);
            Modifier modifierC = OffsetKt.c(companion, BitmapDescriptorFactory.HUE_RED, -4, i2);
            RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(Arrangement.f934a, vertical, composerImpl, r4);
            int i6 = composerImpl.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImpl.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImpl, modifierC);
            composerImpl.i();
            if (composerImpl.O) {
                function02 = function0;
                composerImpl.K(function02);
            } else {
                function02 = function0;
                composerImpl.e();
            }
            Function2 function210 = function22;
            Updater.b(composerImpl, rowMeasurePolicyA2, function210);
            Function2 function211 = function2;
            Updater.b(composerImpl, persistentCompositionLocalMapQ3, function211);
            if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(i6))) {
                function25 = function23;
                androidx.camera.core.impl.b.B(i6, composerImpl, i6, function25);
            } else {
                function25 = function23;
            }
            Function2 function212 = function24;
            Updater.b(composerImpl, modifierD3, function212);
            String str4 = offerCardPriceInfo.d;
            String str5 = str4 == null ? "" : str4;
            float f = 2;
            Modifier.Companion companion3 = companion;
            Function0 function04 = function02;
            Function2 function213 = function25;
            ComposerImpl composerImpl4 = composerImpl;
            offerCardPriceInfo2 = offerCardPriceInfo;
            TextKt.b(str5, PaddingKt.j(companion3, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImpl).e.b.b, composerImpl4, 48, 0, 65532);
            TextKt.b("$", PaddingKt.j(companion3, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImpl4).d.c.b, composerImpl4, 54, 0, 65532);
            TextKt.b((str == null || StringsKt.D(str)) ? "0" : str, OffsetKt.c(PaddingKt.j(companion3, i2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), BitmapDescriptorFactory.HUE_RED, -9, i2), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImpl4).c.f5127a.f5128a, composerImpl4, 48, 0, 65532);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composerImpl4, 0);
            int i7 = composerImpl4.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImpl4.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImpl4, companion3);
            composerImpl4.i();
            if (composerImpl4.O) {
                composerImpl4.K(function04);
            } else {
                composerImpl4.e();
            }
            Updater.b(composerImpl4, columnMeasurePolicyA2, function210);
            Updater.b(composerImpl4, persistentCompositionLocalMapQ4, function211);
            if (composerImpl4.O || !Intrinsics.c(composerImpl4.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImpl4, i7, function213);
            }
            Updater.b(composerImpl4, modifierD4, function212);
            String str6 = offerCardPriceInfo2.b;
            if (str6 == null) {
                str6 = "";
            }
            TextKt.b(str6, PaddingKt.j(companion3, BitmapDescriptorFactory.HUE_RED, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImpl4).e.b.b, composerImpl4, 48, 0, 65532);
            String str7 = offerCardPriceInfo2.e;
            TextKt.b(str7 == null ? "" : str7, OffsetKt.c(companion3, BitmapDescriptorFactory.HUE_RED, -5, 1), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImpl4).f5120a.c.f5124a, composerImpl4, 48, 0, 65532);
            composerImpl2 = composerImpl4;
            android.support.v4.media.session.a.C(composerImpl2, true, true, true);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImpl2.X();
        if (recomposeScopeImplX2 != null) {
            final int i8 = 1;
            recomposeScopeImplX2.d = new Function2(offerCardPriceInfo2, i, i8) { // from class: au.com.woolworths.shop.aem.components.ui.b
                public final /* synthetic */ int d;
                public final /* synthetic */ OfferCardPriceInfo e;

                {
                    this.d = i8;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.d;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            OfferCardKt.e(this.e, composer2, RecomposeScopeImplKt.a(1));
                            break;
                        default:
                            OfferCardKt.e(this.e, composer2, RecomposeScopeImplKt.a(1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final long f(OfferCardTextColor offerCardTextColor, Composer composer) {
        long j;
        composer.o(-965629719);
        int iOrdinal = offerCardTextColor.ordinal();
        if (iOrdinal == 0) {
            composer.o(-257218673);
            j = CoreTheme.b(composer).e.d.c.b;
            composer.l();
        } else {
            if (iOrdinal != 1) {
                throw au.com.woolworths.android.onesite.a.x(composer, -257221506);
            }
            composer.o(-257216273);
            j = CoreTheme.b(composer).e.d.d;
            composer.l();
        }
        composer.l();
        return j;
    }

    public static final Painter g(Composer composer) {
        composer.o(-561902616);
        Painter painterA = ((Boolean) composer.x(InspectionModeKt.f1972a)).booleanValue() ? PainterResources_androidKt.a(R.drawable.ic_image_placeholder, 0, composer) : null;
        composer.l();
        return painterA;
    }
}
