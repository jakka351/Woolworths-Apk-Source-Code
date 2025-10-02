package au.com.woolworths.shop.product.details.ui.everydaymarket;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.base.shopapp.data.models.InfoSectionFooter;
import au.com.woolworths.base.shopapp.data.models.InfoSectionItem;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.shop.product.details.ui.f;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AboutEverydayMarketKt {
    public static final void a(String iconUrl, String title, String description, Composer composer, int i) {
        Intrinsics.h(iconUrl, "iconUrl");
        Intrinsics.h(title, "title");
        Intrinsics.h(description, "description");
        ComposerImpl composerImplV = composer.v(-1511791940);
        int i2 = i | (composerImplV.n(iconUrl) ? 4 : 2) | (composerImplV.n(title) ? 32 : 16) | (composerImplV.n(description) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            SingletonAsyncImageKt.b(iconUrl, null, SizeKt.q(companion, 24), null, PainterResources_androidKt.a(R.drawable.ic_about_edm_placeholder, 0, composerImplV), null, null, null, null, null, null, null, composerImplV, (i2 & 14) | 432, 0, 32744);
            composerImplV = composerImplV;
            Modifier modifierJ = PaddingKt.j(companion, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierJ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            TextKt.a(title, CoreTheme.f(composerImplV).d.c.b, null, CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, (i2 >> 3) & 14, 1012);
            TextKt.a(description, CoreTheme.f(composerImplV).f5120a.b.f5123a, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, ((i2 >> 6) & 14) | KyberEngine.KyberPolyBytes, 1008);
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new f(i, 2, iconUrl, title, description);
        }
    }

    public static final void b(String str, String str2, String str3, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(1785245942);
        if (((i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | (composerImplV.n(str3) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1929403986);
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            builder.e(str);
            int iJ = builder.j(new LinkAnnotation.Url(str3, new TextLinkStyles(new SpanStyle(CoreTheme.b(composerImplV).f4782a.d.b.f4798a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65534), null, 14)));
            try {
                builder.e(" ");
                builder.e(str2);
                builder.i(iJ);
                AnnotatedString annotatedStringM = builder.m();
                composerImplV.V(false);
                composerImpl = composerImplV;
                TextKt.b(annotatedStringM, CoreTheme.f(composerImplV).f5120a.b.b, null, 0L, 0, 0, false, 0, null, null, composerImpl, 0, 2044);
            } catch (Throwable th) {
                builder.i(iJ);
                throw th;
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new f(i, 1, str, str2, str3);
        }
    }

    public static final void c(final InfoSection infoSection, final Function0 onNavigateUp, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(infoSection, "infoSection");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(1203113651);
        int i2 = (composerImplV.I(infoSection) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onNavigateUp) ? 32 : 16;
        }
        if (((i2 | KyberEngine.KyberPolyBytes) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(-2108347889, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.everydaymarket.AboutEverydayMarketKt$AboutEverydayMarketScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final Function0 function0 = onNavigateUp;
                        final InfoSection infoSection2 = infoSection;
                        ScaffoldKt.a(null, ComposableLambdaKt.c(2086615507, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.everydaymarket.AboutEverydayMarketKt$AboutEverydayMarketScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    String title = infoSection2.getTitle();
                                    final Function0 function02 = function0;
                                    TopNavBarKt.a(title, null, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(274587845, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.everydaymarket.AboutEverydayMarketKt.AboutEverydayMarketScreen.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer4 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                ImageVector imageVector = CoreTheme.e(composer4).e.b;
                                                String strC = StringResources_androidKt.c(composer4, R.string.content_description_back_button);
                                                composer4.o(5004770);
                                                final Function0 function03 = function02;
                                                boolean zN = composer4.n(function03);
                                                Object objG = composer4.G();
                                                if (zN || objG == Composer.Companion.f1624a) {
                                                    objG = new Function0() { // from class: au.com.woolworths.shop.product.details.ui.everydaymarket.a
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            function03.invoke();
                                                            return Unit.f24250a;
                                                        }
                                                    };
                                                    composer4.A(objG);
                                                }
                                                composer4.l();
                                                IconButtonKt.c(imageVector, strC, (Function0) objG, null, false, null, 0L, composer4, 0, 120);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), null, composer3, 100663296, 766);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, null, 0L, null, ComposableLambdaKt.c(-10646180, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.everydaymarket.AboutEverydayMarketKt$AboutEverydayMarketScreen$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                PaddingValues paddingVals = (PaddingValues) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(paddingVals, "paddingVals");
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer3.n(paddingVals) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier modifierE = PaddingKt.e(Modifier.Companion.d, paddingVals);
                                    float f = 16;
                                    PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
                                    Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                                    Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(32);
                                    composer3.o(5004770);
                                    final InfoSection infoSection3 = infoSection2;
                                    boolean zI = composer3.I(infoSection3);
                                    Object objG = composer3.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        objG = new Function1() { // from class: au.com.woolworths.shop.product.details.ui.everydaymarket.b
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj6) {
                                                LazyListScope LazyColumn = (LazyListScope) obj6;
                                                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                                                final InfoSection infoSection4 = infoSection3;
                                                for (final InfoSectionItem infoSectionItem : infoSection4.getItems()) {
                                                    LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.everydaymarket.AboutEverydayMarketKt$AboutEverydayMarketScreen$1$2$1$1$1$1
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                            LazyItemScope item = (LazyItemScope) obj7;
                                                            Composer composer4 = (Composer) obj8;
                                                            int iIntValue2 = ((Number) obj9).intValue();
                                                            Intrinsics.h(item, "$this$item");
                                                            if ((iIntValue2 & 17) == 16 && composer4.c()) {
                                                                composer4.j();
                                                            } else {
                                                                InfoSectionItem infoSectionItem2 = infoSectionItem;
                                                                AboutEverydayMarketKt.a(infoSectionItem2.getImageUrl(), infoSectionItem2.getTitle(), infoSectionItem2.getDescription(), composer4, 0);
                                                            }
                                                            return Unit.f24250a;
                                                        }
                                                    }, true, -1776932140), 3);
                                                }
                                                LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.everydaymarket.AboutEverydayMarketKt$AboutEverydayMarketScreen$1$2$1$1$2
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                        LazyItemScope item = (LazyItemScope) obj7;
                                                        Composer composer4 = (Composer) obj8;
                                                        int iIntValue2 = ((Number) obj9).intValue();
                                                        Intrinsics.h(item, "$this$item");
                                                        if ((iIntValue2 & 17) == 16 && composer4.c()) {
                                                            composer4.j();
                                                        } else {
                                                            InfoSection infoSection5 = infoSection4;
                                                            InfoSectionFooter footer = infoSection5.getFooter();
                                                            String title = footer != null ? footer.getTitle() : null;
                                                            if (title == null) {
                                                                title = "";
                                                            }
                                                            InfoSectionFooter footer2 = infoSection5.getFooter();
                                                            String linkUrl = footer2 != null ? footer2.getLinkUrl() : null;
                                                            if (linkUrl == null) {
                                                                linkUrl = "";
                                                            }
                                                            InfoSectionFooter footer3 = infoSection5.getFooter();
                                                            String subtitle = footer3 != null ? footer3.getSubtitle() : null;
                                                            AboutEverydayMarketKt.b(title, subtitle != null ? subtitle : "", linkUrl, composer4, 0);
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                }, true, 1898246567), 3);
                                                return Unit.f24250a;
                                            }
                                        };
                                        composer3.A(objG);
                                    }
                                    composer3.l();
                                    LazyDslKt.b(modifierE, null, paddingValuesImpl, false, spacedAlignedG, null, null, false, null, (Function1) objG, composer3, 24960, 490);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 12582960, 125);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(i, 25, infoSection, onNavigateUp, modifier2, false);
        }
    }
}
