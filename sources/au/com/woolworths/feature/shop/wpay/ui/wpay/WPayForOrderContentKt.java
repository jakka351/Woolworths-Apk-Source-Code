package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.compose.utils.modifier.AlphaShadowKt;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.component.experimental.loadingbutton.PrimaryLoadingButtonKt;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertKt;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle;
import au.com.woolworths.design.core.ui.component.stable.alert.Placement;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonSpec;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.GiftCardItem;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.GiftCardSection;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentTotalDetails;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodSection;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PlaceOrderButton;
import au.com.woolworths.feature.shop.wpay.ui.wpay.GiftCardEdit;
import au.com.woolworths.feature.shop.wpay.ui.wpay.GooglePayUiState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionAddItemKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionExpiredCreditCardItemKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionGiftCardItemKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionGooglePayItemKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionLinkedCreditCardItemKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionLinkedPayPalItemKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionUnlinkedCreditCardItemKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionTitleItemKt;
import au.com.woolworths.foundation.google.pay.ui.PayButtonKt;
import au.com.woolworths.foundation.google.pay.ui.PayButtonType;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "isMarkdownPanelExpanded", "", "expansionProgress", "wpay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class WPayForOrderContentKt {
    public static final void a(int i, Composer composer, Modifier modifier, final Function0 function0, final boolean z) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1634871801);
        if ((((composerImplV.p(z) ? 4 : 2) | i | KyberEngine.KyberPolyBytes) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            final State stateB = AnimateAsStateKt.b(z ? 1.0f : BitmapDescriptorFactory.HUE_RED, null, "expansionProgress", null, composerImplV, 3072, 22);
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(934229859, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContentKt$ExpandOrCollapseButton$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Painter painterA = PainterResources_androidKt.a(R.drawable.ic_chevron_up_circle, 0, composer2);
                        String str = !z ? "Expand" : "Collapse";
                        long j = CoreTheme.b(composer2).e.f4848a.b.c;
                        IconButtonKt.b(painterA, str, function0, RotateKt.a(Modifier.Companion.d, ((Number) stateB.getD()).floatValue() * 180.0f), false, IconButtonSpec.Size.g, j, composer2, 196608, 16);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier2 = Modifier.Companion.d;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.d(z, function0, modifier2, i, 1);
        }
    }

    public static final void b(Throwable th, Function0 function0, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1112445150);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(th) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z = th instanceof NoConnectivityException;
            FullPageMessageUiKt.a(FullPageMessageSpec.Companion.d(PainterResources_androidKt.a(R.drawable.ic_order_server_error, 0, composerImplV), StringResources_androidKt.c(composerImplV, z ? R.string.checkout_wpay_for_order_connection_error_title : R.string.checkout_wpay_for_order_server_error_title), StringResources_androidKt.c(composerImplV, z ? R.string.checkout_wpay_for_order_connection_error_msg : R.string.checkout_wpay_for_order_server_error_msg), StringResources_androidKt.c(composerImplV, R.string.try_again_button_text), function0), null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(th, function0, i, 0);
        }
    }

    public static final void c(final String str, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1077314722);
        if ((((composerImplV.n(str) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(-81467962, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContentKt$MarkdownPanel$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierD = ComposedModifierKt.d(composer2, companion);
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
                        MarkdownCompatKt.a(str, SizeKt.e(PaddingKt.f(companion, 16), 1.0f), new MarkdownTextViewStyle((Density) composer2.x(CompositionLocalsKt.h), CoreTheme.b(composer2).e.d.d, CoreTheme.f(composer2).f5120a.c.b, new TextAlign(1), 16), null, false, null, null, false, null, null, composer2, 48, 1016);
                        DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composer2).e.b.e, composer2, null);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.corerow.impl.b(str, i, 6);
        }
    }

    public static final void d(final PaymentInstrumentsResponse.Success success, final GooglePayUiState googlePayUiState, final Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(590771460);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(success) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(googlePayUiState) : composerImplV.I(googlePayUiState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if (((i2 | 3072) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG);
            }
            final MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(1784424892, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContentKt$PaymentTotalSection$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierA = AlphaShadowKt.a(Modifier.Companion.d, 16);
                        final Function1 function12 = function1;
                        final GooglePayUiState googlePayUiState2 = googlePayUiState;
                        final PaymentInstrumentsResponse.Success success2 = success;
                        final MutableState mutableState2 = mutableState;
                        CardKt.a(modifierA, RectangleShapeKt.f1779a, 0L, 0L, null, null, ComposableLambdaKt.c(1946215023, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContentKt$PaymentTotalSection$1.1
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r8v15 */
                            /* JADX WARN: Type inference failed for: r8v16 */
                            /* JADX WARN: Type inference failed for: r8v17 */
                            /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.String] */
                            /* JADX WARN: Type inference failed for: r8v25 */
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                String str;
                                Function0 function0;
                                PaymentInstrumentTotalDetails paymentInstrumentTotalDetails;
                                Function2 function2;
                                Function2 function22;
                                MutableState mutableState3;
                                Function2 function23;
                                BiasAlignment.Horizontal horizontal;
                                PaymentInstrumentsResponse.Success success3;
                                Arrangement$Top$1 arrangement$Top$1;
                                Function2 function24;
                                Function2 function25;
                                Function2 function26;
                                BiasAlignment.Horizontal horizontal2;
                                Function2 function27;
                                Function0 function02;
                                Function2 function28;
                                Modifier.Companion companion;
                                Function2 function29;
                                Composer$Companion$Empty$1 composer$Companion$Empty$1;
                                Modifier.Companion companion2;
                                GooglePayUiState.Available available;
                                PaymentInstrumentTotalDetails paymentInstrumentTotalDetails2;
                                Composer composer3;
                                float f;
                                ColumnScope Card = (ColumnScope) obj3;
                                Composer composer4 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(Card, "$this$Card");
                                if ((iIntValue & 17) == 16 && composer4.c()) {
                                    composer4.j();
                                } else {
                                    Arrangement$Top$1 arrangement$Top$12 = Arrangement.c;
                                    BiasAlignment.Horizontal horizontal3 = Alignment.Companion.m;
                                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$12, horizontal3, composer4, 0);
                                    int p = composer4.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer4.d();
                                    Modifier.Companion companion3 = Modifier.Companion.d;
                                    Modifier modifierD = ComposedModifierKt.d(composer4, companion3);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function03 = ComposeUiNode.Companion.b;
                                    if (composer4.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer4.i();
                                    if (composer4.getO()) {
                                        composer4.K(function03);
                                    } else {
                                        composer4.e();
                                    }
                                    Function2 function210 = ComposeUiNode.Companion.g;
                                    Updater.b(composer4, columnMeasurePolicyA, function210);
                                    Function2 function211 = ComposeUiNode.Companion.f;
                                    Updater.b(composer4, persistentCompositionLocalMapD, function211);
                                    Function2 function212 = ComposeUiNode.Companion.j;
                                    if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p))) {
                                        androidx.camera.core.impl.b.z(p, composer4, p, function212);
                                    }
                                    Function2 function213 = ComposeUiNode.Companion.d;
                                    Updater.b(composer4, modifierD, function213);
                                    PaymentInstrumentsResponse.Success success4 = success2;
                                    PaymentInstrumentTotalDetails paymentInstrumentTotalDetails3 = success4.c;
                                    final String str2 = paymentInstrumentTotalDetails3.d;
                                    composer4.o(96382532);
                                    MutableState mutableState4 = mutableState2;
                                    if (str2 == null) {
                                        arrangement$Top$1 = arrangement$Top$12;
                                        function22 = function213;
                                        function24 = function212;
                                        function0 = function03;
                                        function2 = function210;
                                        paymentInstrumentTotalDetails = paymentInstrumentTotalDetails3;
                                        str = str2;
                                        horizontal = horizontal3;
                                        mutableState3 = mutableState4;
                                        function23 = function211;
                                        success3 = success4;
                                    } else {
                                        str = str2;
                                        function0 = function03;
                                        paymentInstrumentTotalDetails = paymentInstrumentTotalDetails3;
                                        function2 = function210;
                                        function22 = function213;
                                        mutableState3 = mutableState4;
                                        function23 = function211;
                                        horizontal = horizontal3;
                                        success3 = success4;
                                        arrangement$Top$1 = arrangement$Top$12;
                                        function24 = function212;
                                        AnimatedVisibilityKt.c(ColumnScopeInstance.f948a, ((Boolean) mutableState4.getD()).booleanValue(), null, EnterExitTransitionKt.d(null, 15), EnterExitTransitionKt.l(null, 15), null, ComposableLambdaKt.c(-580697073, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContentKt$PaymentTotalSection$1$1$1$1$1
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj6;
                                                ((Number) obj8).intValue();
                                                Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                                                WPayForOrderContentKt.c(str2, (Composer) obj7, 0);
                                                return Unit.f24250a;
                                            }
                                        }, composer4), composer4, 1600518, 18);
                                    }
                                    composer4.l();
                                    String str3 = success3.e;
                                    composer4.o(96395549);
                                    if (str3 == null) {
                                        function25 = function2;
                                        function26 = function24;
                                        function02 = function0;
                                        horizontal2 = horizontal;
                                        function27 = function22;
                                        function28 = function23;
                                        companion = companion3;
                                    } else {
                                        Modifier modifierE = SizeKt.e(BackgroundKt.b(companion3, CoreTheme.b(composer4).e.f4848a.c, RectangleShapeKt.f1779a), 1.0f);
                                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                        int p2 = composer4.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer4.d();
                                        Modifier modifierD2 = ComposedModifierKt.d(composer4, modifierE);
                                        if (composer4.w() == null) {
                                            ComposablesKt.b();
                                            throw null;
                                        }
                                        composer4.i();
                                        if (composer4.getO()) {
                                            composer4.K(function0);
                                        } else {
                                            composer4.e();
                                        }
                                        Updater.b(composer4, measurePolicyD, function2);
                                        Updater.b(composer4, persistentCompositionLocalMapD2, function23);
                                        if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p2))) {
                                            androidx.camera.core.impl.b.z(p2, composer4, p2, function24);
                                        }
                                        Function2 function214 = function22;
                                        Updater.b(composer4, modifierD2, function214);
                                        function25 = function2;
                                        function26 = function24;
                                        horizontal2 = horizontal;
                                        function27 = function214;
                                        function02 = function0;
                                        function28 = function23;
                                        companion = companion3;
                                        MarkdownCompatKt.a(str3, SizeKt.e(PaddingKt.f(companion3, 12), 1.0f), new MarkdownTextViewStyle((Density) composer4.x(CompositionLocalsKt.h), CoreTheme.b(composer4).e.d.d, CoreTheme.f(composer4).f5120a.c.f5124a, new TextAlign(3), 16), null, false, null, null, false, null, null, composer4, 48, 1016);
                                        composer4.f();
                                        DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composer4).e.b.e, composer4, null);
                                        composer4 = composer4;
                                    }
                                    composer4.l();
                                    float f2 = 16;
                                    Modifier modifierF = PaddingKt.f(companion, f2);
                                    ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal2, composer4, 0);
                                    int p3 = composer4.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer4.d();
                                    Modifier modifierD3 = ComposedModifierKt.d(composer4, modifierF);
                                    if (composer4.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer4.i();
                                    if (composer4.getO()) {
                                        composer4.K(function02);
                                    } else {
                                        composer4.e();
                                    }
                                    Function2 function215 = function25;
                                    Updater.b(composer4, columnMeasurePolicyA2, function215);
                                    Function2 function216 = function28;
                                    Updater.b(composer4, persistentCompositionLocalMapD3, function216);
                                    if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p3))) {
                                        function29 = function26;
                                        androidx.camera.core.impl.b.z(p3, composer4, p3, function29);
                                    } else {
                                        function29 = function26;
                                    }
                                    Function2 function217 = function27;
                                    Updater.b(composer4, modifierD3, function217);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
                                    BiasAlignment.Vertical vertical = Alignment.Companion.k;
                                    Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                                    if (str != null) {
                                        composer4.o(-1338417415);
                                        Modifier modifierE2 = SizeKt.e(companion, 1.0f);
                                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, vertical, composer4, 48);
                                        int p4 = composer4.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD4 = composer4.d();
                                        Modifier modifierD4 = ComposedModifierKt.d(composer4, modifierE2);
                                        if (composer4.w() == null) {
                                            ComposablesKt.b();
                                            throw null;
                                        }
                                        composer4.i();
                                        if (composer4.getO()) {
                                            composer4.K(function02);
                                        } else {
                                            composer4.e();
                                        }
                                        Updater.b(composer4, rowMeasurePolicyA, function215);
                                        Updater.b(composer4, persistentCompositionLocalMapD4, function216);
                                        if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p4))) {
                                            androidx.camera.core.impl.b.z(p4, composer4, p4, function29);
                                        }
                                        Updater.b(composer4, modifierD4, function217);
                                        boolean zBooleanValue = ((Boolean) mutableState3.getD()).booleanValue();
                                        composer4.o(5004770);
                                        Object objG2 = composer4.G();
                                        if (objG2 == composer$Companion$Empty$12) {
                                            objG2 = new au.com.woolworths.feature.rewards.offers.listpage.ui.e(mutableState3, 7);
                                            composer4.A(objG2);
                                        }
                                        composer4.l();
                                        WPayForOrderContentKt.a(48, composer4, null, (Function0) objG2, zBooleanValue);
                                        PaymentInstrumentTotalDetails paymentInstrumentTotalDetails4 = paymentInstrumentTotalDetails;
                                        available = null;
                                        Composer composer5 = composer4;
                                        Modifier.Companion companion4 = companion;
                                        composer$Companion$Empty$1 = composer$Companion$Empty$12;
                                        TextKt.b(paymentInstrumentTotalDetails4.f8301a, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer4).f5120a.f5121a.f5122a, composer5, 0, 0, 65534);
                                        SpacerKt.a(composer5, rowScopeInstance.a(companion4, 1.0f, true));
                                        companion2 = companion4;
                                        TextKt.b(paymentInstrumentTotalDetails4.b, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer5).d.c.b, composer5, 0, 0, 65534);
                                        composer3 = composer5;
                                        composer3.f();
                                        composer3.l();
                                        f = f2;
                                        paymentInstrumentTotalDetails2 = paymentInstrumentTotalDetails4;
                                    } else {
                                        Function0 function04 = function02;
                                        composer$Companion$Empty$1 = composer$Companion$Empty$12;
                                        companion2 = companion;
                                        PaymentInstrumentTotalDetails paymentInstrumentTotalDetails5 = paymentInstrumentTotalDetails;
                                        available = null;
                                        composer4.o(-1337385301);
                                        Modifier modifierE3 = SizeKt.e(companion2, 1.0f);
                                        RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composer4, 0);
                                        int p5 = composer4.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD5 = composer4.d();
                                        Modifier modifierD5 = ComposedModifierKt.d(composer4, modifierE3);
                                        if (composer4.w() == null) {
                                            ComposablesKt.b();
                                            throw null;
                                        }
                                        composer4.i();
                                        if (composer4.getO()) {
                                            composer4.K(function04);
                                        } else {
                                            composer4.e();
                                        }
                                        Updater.b(composer4, rowMeasurePolicyA2, function215);
                                        Updater.b(composer4, persistentCompositionLocalMapD5, function216);
                                        if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p5))) {
                                            androidx.camera.core.impl.b.z(p5, composer4, p5, function29);
                                        }
                                        Updater.b(composer4, modifierD5, function217);
                                        SpacerKt.a(composer4, rowScopeInstance.a(companion2, 1.0f, true));
                                        Composer composer6 = composer4;
                                        paymentInstrumentTotalDetails2 = paymentInstrumentTotalDetails5;
                                        TextKt.b(paymentInstrumentTotalDetails5.f8301a, rowScopeInstance.b(companion2, vertical), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer4).f5120a.b.f5123a, composer6, 0, 0, 65532);
                                        SpacerKt.a(composer6, SizeKt.u(companion2, 8));
                                        TextKt.b(paymentInstrumentTotalDetails2.b, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer6).d.c.b, composer6, 0, 0, 65534);
                                        composer3 = composer6;
                                        SpacerKt.a(composer3, rowScopeInstance.a(companion2, 1.0f, true));
                                        composer3.f();
                                        composer3.l();
                                        f = f2;
                                    }
                                    SpacerKt.a(composer3, SizeKt.g(companion2, f));
                                    final PlaceOrderButton placeOrderButton = paymentInstrumentTotalDetails2.c;
                                    boolean z = placeOrderButton instanceof PlaceOrderButton.Default;
                                    final Function1 function13 = function12;
                                    if (z) {
                                        composer3.o(-1336267658);
                                        Modifier modifierE4 = SizeKt.e(companion2, 1.0f);
                                        PlaceOrderButton.Default r1 = (PlaceOrderButton.Default) placeOrderButton;
                                        String upperCase = r1.f8312a.toUpperCase(Locale.ROOT);
                                        Intrinsics.g(upperCase, "toUpperCase(...)");
                                        boolean z2 = r1.b;
                                        composer3.o(-1633490746);
                                        boolean zN = composer3.n(function13) | composer3.I(placeOrderButton);
                                        Object objG3 = composer3.G();
                                        if (zN || objG3 == composer$Companion$Empty$1) {
                                            final int i3 = 0;
                                            objG3 = new Function0() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.j
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i3) {
                                                        case 0:
                                                            function13.invoke(placeOrderButton);
                                                            break;
                                                        default:
                                                            function13.invoke(placeOrderButton);
                                                            break;
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            };
                                            composer3.A(objG3);
                                        }
                                        composer3.l();
                                        PrimaryLoadingButtonKt.a(upperCase, (Function0) objG3, z2, false, modifierE4, null, null, composer3, 27648, 992);
                                        composer3.l();
                                    } else {
                                        Composer$Companion$Empty$1 composer$Companion$Empty$13 = composer$Companion$Empty$1;
                                        if (!(placeOrderButton instanceof PlaceOrderButton.GooglePay)) {
                                            throw au.com.woolworths.android.onesite.a.x(composer3, 372532519);
                                        }
                                        composer3.o(372551190);
                                        PayButtonType[] payButtonTypeArr = PayButtonType.d;
                                        GooglePayUiState googlePayUiState3 = googlePayUiState2;
                                        GooglePayUiState.Available available2 = googlePayUiState3 instanceof GooglePayUiState.Available ? (GooglePayUiState.Available) googlePayUiState3 : available;
                                        ?? r8 = available2 != null ? available2.c : available;
                                        if (r8 == 0) {
                                            r8 = "";
                                        }
                                        String str4 = r8;
                                        composer3.o(-1633490746);
                                        boolean zN2 = composer3.n(function13) | composer3.I(placeOrderButton);
                                        Object objG4 = composer3.G();
                                        if (zN2 || objG4 == composer$Companion$Empty$13) {
                                            final int i4 = 1;
                                            objG4 = new Function0() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.j
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i4) {
                                                        case 0:
                                                            function13.invoke(placeOrderButton);
                                                            break;
                                                        default:
                                                            function13.invoke(placeOrderButton);
                                                            break;
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            };
                                            composer3.A(objG4);
                                        }
                                        composer3.l();
                                        PayButtonKt.a(str4, (Function0) objG4, SizeKt.e(companion2, 1.0f), BitmapDescriptorFactory.HUE_RED, composer3, 3078);
                                        composer3.l();
                                    }
                                    composer3.f();
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 1572912, 60);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.d(success, googlePayUiState, function1, modifier2, i, 27);
        }
    }

    public static final void e(final PaymentMethodItem.CreditCard creditCard, String str, Map map, boolean z, String str2, CvvActions cvvActions, final Function1 function1, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1876961658);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(creditCard) : composerImplV.I(creditCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(map) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(cvvActions) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(function1) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z2 = creditCard instanceof PaymentMethodItem.CreditCard.Add;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            boolean z3 = true;
            if (z2) {
                composerImplV.o(126125834);
                String title = ((PaymentMethodItem.CreditCard.Add) creditCard).getTitle();
                composerImplV.o(-1633490746);
                boolean z4 = (i2 & 3670016) == 1048576;
                if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composerImplV.I(creditCard))) {
                    z3 = false;
                }
                boolean z5 = z4 | z3;
                Object objG = composerImplV.G();
                if (z5 || objG == composer$Companion$Empty$1) {
                    final int i3 = 0;
                    objG = new Function0() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Add((PaymentMethodItem.CreditCard.Add) creditCard));
                                    break;
                                case 1:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Delete(((PaymentMethodItem.CreditCard.Linked) creditCard).getId(), true));
                                    break;
                                case 2:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Delete(((PaymentMethodItem.CreditCard.Unlinked) creditCard).f8305a, false));
                                    break;
                                default:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Delete(((PaymentMethodItem.CreditCard.Expired) creditCard).getId(), true));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                SectionOptionAddItemKt.a(title, null, null, (Function0) objG, composerImplV, 0, 6);
                composerImplV.V(false);
            } else if (creditCard instanceof PaymentMethodItem.CreditCard.Linked) {
                composerImplV.o(-384755200);
                PaymentMethodItem.CreditCard.Linked linked = (PaymentMethodItem.CreditCard.Linked) creditCard;
                final boolean zC = Intrinsics.c(linked.getId(), str);
                Function1 function12 = cvvActions.f8361a;
                Function0 function0 = cvvActions.b;
                Function2 function2 = cvvActions.c;
                Function0 function02 = cvvActions.d;
                Function2 function22 = cvvActions.e;
                composerImplV.o(-1746271574);
                int i4 = i2 & 3670016;
                int i5 = i2 & 14;
                boolean zP = (i4 == 1048576) | (i5 == 4 || ((i2 & 8) != 0 && composerImplV.I(creditCard))) | composerImplV.p(zC);
                Object objG2 = composerImplV.G();
                if (zP || objG2 == composer$Companion$Empty$1) {
                    final int i6 = 0;
                    objG2 = new Function0() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Select(((PaymentMethodItem.CreditCard.Linked) creditCard).getId(), zC));
                                    break;
                                default:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Select(((PaymentMethodItem.CreditCard.Unlinked) creditCard).f8305a, zC));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG2);
                }
                Function0 function03 = (Function0) objG2;
                composerImplV.V(false);
                composerImplV.o(-1633490746);
                boolean z6 = i4 == 1048576;
                if (i5 != 4 && ((i2 & 8) == 0 || !composerImplV.I(creditCard))) {
                    z3 = false;
                }
                boolean z7 = z6 | z3;
                Object objG3 = composerImplV.G();
                if (z7 || objG3 == composer$Companion$Empty$1) {
                    final int i7 = 1;
                    objG3 = new Function0() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i7) {
                                case 0:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Add((PaymentMethodItem.CreditCard.Add) creditCard));
                                    break;
                                case 1:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Delete(((PaymentMethodItem.CreditCard.Linked) creditCard).getId(), true));
                                    break;
                                case 2:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Delete(((PaymentMethodItem.CreditCard.Unlinked) creditCard).f8305a, false));
                                    break;
                                default:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Delete(((PaymentMethodItem.CreditCard.Expired) creditCard).getId(), true));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                SectionOptionLinkedCreditCardItemKt.a(linked, map, zC, z, str2, function12, function0, function2, function02, function22, function03, (Function0) objG3, composerImplV, (i2 & 57344) | ((i2 >> 3) & 112) | (i2 & 7168));
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else if (creditCard instanceof PaymentMethodItem.CreditCard.Unlinked) {
                composerImplV.o(-383417736);
                PaymentMethodItem.CreditCard.Unlinked unlinked = (PaymentMethodItem.CreditCard.Unlinked) creditCard;
                final boolean zEquals = unlinked.f8305a.equals(str);
                composerImplV.o(-1746271574);
                int i8 = i2 & 3670016;
                int i9 = i2 & 14;
                boolean zP2 = (i8 == 1048576) | (i9 == 4 || ((i2 & 8) != 0 && composerImplV.I(creditCard))) | composerImplV.p(zEquals);
                Object objG4 = composerImplV.G();
                if (zP2 || objG4 == composer$Companion$Empty$1) {
                    final int i10 = 1;
                    objG4 = new Function0() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i10) {
                                case 0:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Select(((PaymentMethodItem.CreditCard.Linked) creditCard).getId(), zEquals));
                                    break;
                                default:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Select(((PaymentMethodItem.CreditCard.Unlinked) creditCard).f8305a, zEquals));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG4);
                }
                Function0 function04 = (Function0) objG4;
                composerImplV.V(false);
                composerImplV.o(-1633490746);
                boolean z8 = i8 == 1048576;
                if (i9 != 4 && ((i2 & 8) == 0 || !composerImplV.I(creditCard))) {
                    z3 = false;
                }
                boolean z9 = z8 | z3;
                Object objG5 = composerImplV.G();
                if (z9 || objG5 == composer$Companion$Empty$1) {
                    final int i11 = 2;
                    objG5 = new Function0() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i11) {
                                case 0:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Add((PaymentMethodItem.CreditCard.Add) creditCard));
                                    break;
                                case 1:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Delete(((PaymentMethodItem.CreditCard.Linked) creditCard).getId(), true));
                                    break;
                                case 2:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Delete(((PaymentMethodItem.CreditCard.Unlinked) creditCard).f8305a, false));
                                    break;
                                default:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Delete(((PaymentMethodItem.CreditCard.Expired) creditCard).getId(), true));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG5);
                }
                composerImplV.V(false);
                SectionOptionUnlinkedCreditCardItemKt.a(unlinked, zEquals, function04, (Function0) objG5, composerImplV, 0);
                composerImplV.V(false);
            } else {
                if (!(creditCard instanceof PaymentMethodItem.CreditCard.Expired)) {
                    throw au.com.woolworths.android.onesite.a.w(126125545, composerImplV, false);
                }
                composerImplV.o(-382517403);
                PaymentMethodItem.CreditCard.Expired expired = (PaymentMethodItem.CreditCard.Expired) creditCard;
                composerImplV.o(-1633490746);
                boolean z10 = (i2 & 3670016) == 1048576;
                if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composerImplV.I(creditCard))) {
                    z3 = false;
                }
                boolean z11 = z10 | z3;
                Object objG6 = composerImplV.G();
                if (z11 || objG6 == composer$Companion$Empty$1) {
                    final int i12 = 3;
                    objG6 = new Function0() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i12) {
                                case 0:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Add((PaymentMethodItem.CreditCard.Add) creditCard));
                                    break;
                                case 1:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Delete(((PaymentMethodItem.CreditCard.Linked) creditCard).getId(), true));
                                    break;
                                case 2:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Delete(((PaymentMethodItem.CreditCard.Unlinked) creditCard).f8305a, false));
                                    break;
                                default:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.CreditCard.Delete(((PaymentMethodItem.CreditCard.Expired) creditCard).getId(), true));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG6);
                }
                composerImplV.V(false);
                SectionOptionExpiredCreditCardItemKt.a(expired, (Function0) objG6, composerImplV, 0);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.legacy.compose.productsearch.a(creditCard, str, map, z, str2, cvvActions, function1, i);
        }
    }

    public static final void f(GiftCardItem giftCardItem, Map map, Map map2, Map map3, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        String str;
        ComposerImpl composerImplV = composer.v(-766749582);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(giftCardItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(map) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(map2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(map3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(modifier) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (giftCardItem instanceof GiftCardItem.AddGiftCard) {
                composerImplV.o(-1600287262);
                String str2 = ((GiftCardItem.AddGiftCard) giftCardItem).f8290a;
                composerImplV.o(-1633490746);
                boolean z = ((57344 & i2) == 16384) | ((i2 & 14) == 4);
                Object objG = composerImplV.G();
                if (z || objG == Composer.Companion.f1624a) {
                    objG = new n(1, function1, giftCardItem);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                SectionOptionAddItemKt.a(str2, modifier, null, (Function0) objG, composerImplV, (i2 >> 12) & 112, 4);
                composerImplV.V(false);
            } else {
                if (giftCardItem instanceof GiftCardItem.LinkedGiftCard) {
                    composerImplV.o(-1599989879);
                    GiftCardItem.LinkedGiftCard linkedGiftCard = (GiftCardItem.LinkedGiftCard) giftCardItem;
                    int i3 = i2;
                    String str3 = linkedGiftCard.f8291a;
                    GiftCardEdit.Linked linked = (GiftCardEdit.Linked) map.get(str3);
                    boolean z2 = linked != null && linked.b;
                    GiftCardEdit.Linked linked2 = (GiftCardEdit.Linked) map.get(str3);
                    str = linked2 != null ? linked2.c : null;
                    if (str == null) {
                        str = "";
                    }
                    SectionOptionGiftCardItemKt.a(str3, linkedGiftCard.b, linkedGiftCard.d, linkedGiftCard.e, true, z2, str, (InsetBannerApiData) map3.get(str3), linkedGiftCard.h, function1, modifier, composerImplV, ((i3 << 15) & 1879048192) | 24576, (i3 >> 15) & 14, 0);
                    composerImplV = composerImplV;
                    composerImplV.V(false);
                } else {
                    int i4 = i2;
                    if (!(giftCardItem instanceof GiftCardItem.UnlinkedGiftCard)) {
                        throw au.com.woolworths.android.onesite.a.w(1888040283, composerImplV, false);
                    }
                    composerImplV.o(-1599144199);
                    GiftCardItem.UnlinkedGiftCard unlinkedGiftCard = (GiftCardItem.UnlinkedGiftCard) giftCardItem;
                    String str4 = unlinkedGiftCard.f8292a;
                    GiftCardEdit.Unlinked unlinked = (GiftCardEdit.Unlinked) map2.get(str4);
                    boolean z3 = unlinked != null && unlinked.c;
                    GiftCardEdit.Unlinked unlinked2 = (GiftCardEdit.Unlinked) map2.get(str4);
                    str = unlinked2 != null ? unlinked2.d : null;
                    if (str == null) {
                        str = "";
                    }
                    SectionOptionGiftCardItemKt.a(str4, unlinkedGiftCard.c, unlinkedGiftCard.e, unlinkedGiftCard.f, false, z3, str, (InsetBannerApiData) map3.get(str4), unlinkedGiftCard.i, function1, null, composerImplV, ((i4 << 15) & 1879048192) | 24576, 0, 1024);
                    composerImplV = composerImplV;
                    composerImplV.V(false);
                }
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.tag.d((Object) giftCardItem, (Object) map, (Object) map2, (Object) map3, function1, modifier, i, 10);
        }
    }

    public static final void g(final PaymentMethodItem.PayPal payPal, String str, final Function1 function1, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1966181947);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(payPal) : composerImplV.I(payPal) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z = payPal instanceof PaymentMethodItem.PayPal.Add;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z) {
                composerImplV.o(-284749313);
                String str2 = ((PaymentMethodItem.PayPal.Add) payPal).b;
                ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(802365372, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContentKt$RenderPayPalItem$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            SingletonAsyncImageKt.b(((PaymentMethodItem.PayPal.Add) payPal).f8307a, null, SizeKt.q(PaddingKt.j(Modifier.Companion.d, 16, BitmapDescriptorFactory.HUE_RED, 9, BitmapDescriptorFactory.HUE_RED, 10), 24), PainterResources_androidKt.a(R.drawable.paypal, 0, composer2), PainterResources_androidKt.a(R.drawable.paypal, 0, composer2), null, null, null, null, null, null, null, composer2, 432, 0, 32736);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV);
                composerImplV.o(-1633490746);
                boolean z2 = ((i2 & 896) == 256) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerImplV.I(payPal)));
                Object objG = composerImplV.G();
                if (z2 || objG == composer$Companion$Empty$1) {
                    final int i3 = 0;
                    objG = new Function0() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.PayPal.Add(((PaymentMethodItem.PayPal.Add) payPal).c));
                                    break;
                                default:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.PayPal.Delete(((PaymentMethodItem.PayPal.Linked) payPal).f8308a));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                SectionOptionAddItemKt.a(str2, null, composableLambdaImplC, (Function0) objG, composerImplV, KyberEngine.KyberPolyBytes, 2);
                composerImplV.V(false);
            } else {
                if (!(payPal instanceof PaymentMethodItem.PayPal.Linked)) {
                    throw au.com.woolworths.android.onesite.a.w(-284750978, composerImplV, false);
                }
                composerImplV.o(-236513684);
                PaymentMethodItem.PayPal.Linked linked = (PaymentMethodItem.PayPal.Linked) payPal;
                boolean zEquals = linked.f8308a.equals(str);
                composerImplV.o(-1746271574);
                int i4 = i2 & 896;
                int i5 = i2 & 14;
                boolean zP = (i4 == 256) | (i5 == 4 || ((i2 & 8) != 0 && composerImplV.I(payPal))) | composerImplV.p(zEquals);
                Object objG2 = composerImplV.G();
                if (zP || objG2 == composer$Companion$Empty$1) {
                    objG2 = new i(function1, 0, payPal, zEquals);
                    composerImplV.A(objG2);
                }
                Function0 function0 = (Function0) objG2;
                composerImplV.V(false);
                composerImplV.o(-1633490746);
                boolean z3 = (i4 == 256) | (i5 == 4 || ((i2 & 8) != 0 && composerImplV.I(payPal)));
                Object objG3 = composerImplV.G();
                if (z3 || objG3 == composer$Companion$Empty$1) {
                    final int i6 = 1;
                    objG3 = new Function0() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.PayPal.Add(((PaymentMethodItem.PayPal.Add) payPal).c));
                                    break;
                                default:
                                    function1.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.PayPal.Delete(((PaymentMethodItem.PayPal.Linked) payPal).f8308a));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                SectionOptionLinkedPayPalItemKt.a(linked, zEquals, function0, (Function0) objG3, null, composerImplV, 0);
                composerImplV = composerImplV;
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(payPal, str, function1, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    public static final void h(PaymentInstrumentsResponse paymentInstrumentsResponse, final String str, final boolean z, final String str2, String str3, final Map map, final Map map2, final Map map3, final GooglePayUiState googlePayUiState, final Function1 function1, final CvvActions cvvActions, final Function1 function12, Function1 function13, ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        ComposerImpl composerImpl;
        String str4;
        Object wPayForOrderContentKt$WPayForOrder$1$1;
        ScrollState scrollState;
        String str5;
        ?? r12;
        final Map map4;
        Modifier.Companion companion;
        final Map map5;
        int i3;
        boolean z2;
        final PaymentInstrumentsResponse paymentInstrumentsResponse2 = paymentInstrumentsResponse;
        final Function1 function14 = function13;
        final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
        ComposerImpl composerImplV = composer.v(-648205497);
        int i4 = (i & 6) == 0 ? (composerImplV.n(paymentInstrumentsResponse2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= composerImplV.n(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= composerImplV.n(str3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= composerImplV.I(map) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= composerImplV.I(map2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= composerImplV.I(map3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= (i & 134217728) == 0 ? composerImplV.n(googlePayUiState) : composerImplV.I(googlePayUiState) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= composerImplV.I(function1) ? 536870912 : 268435456;
        }
        int i5 = i4;
        int i6 = (i2 & 6) == 0 ? i2 | (composerImplV.n(cvvActions) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i6 |= composerImplV.I(function12) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i6 |= composerImplV.I(function14) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i6 |= composerImplV.I(composableLambdaImpl2) ? 2048 : 1024;
        }
        int i7 = i2 & 24576;
        Modifier.Companion companion2 = Modifier.Companion.d;
        if (i7 == 0) {
            i6 |= composerImplV.n(companion2) ? 16384 : 8192;
        }
        int i8 = i6;
        if ((i5 & 306783379) == 306783378 && (i8 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            str4 = str3;
        } else if (paymentInstrumentsResponse2 instanceof PaymentInstrumentsResponse.Success) {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = new LinkedHashMap();
                composerImplV.A(objG);
            }
            Map map6 = (Map) objG;
            composerImplV.V(false);
            ScrollState scrollStateA = ScrollKt.a(composerImplV);
            String str6 = str + map3;
            composerImplV.o(-1224400529);
            boolean zN = ((i5 & 112) == 32) | composerImplV.n(scrollStateA) | ((i5 & 14) == 4) | composerImplV.I(map3) | composerImplV.I(map6);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == obj) {
                scrollState = scrollStateA;
                str5 = str6;
                r12 = 0;
                wPayForOrderContentKt$WPayForOrder$1$1 = new WPayForOrderContentKt$WPayForOrder$1$1(str, scrollState, paymentInstrumentsResponse, map6, map3, null);
                map4 = map6;
                composerImplV.A(wPayForOrderContentKt$WPayForOrder$1$1);
            } else {
                map4 = map6;
                scrollState = scrollStateA;
                wPayForOrderContentKt$WPayForOrder$1$1 = objG2;
                str5 = str6;
                r12 = 0;
            }
            composerImplV.V(r12);
            EffectsKt.e(composerImplV, str5, (Function2) wPayForOrderContentKt$WPayForOrder$1$1);
            Modifier modifierD = WindowInsetsPaddingKt.d(BackgroundKt.b(companion2, CoreTheme.b(composerImplV).f4782a.f4783a.d.b, RectangleShapeKt.f1779a).x0(SizeKt.c), WindowInsets_androidKt.a(composerImplV));
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, r12);
            int i9 = composerImplV.P;
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i9))) {
                androidx.camera.core.impl.b.B(i9, composerImplV, i9, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD2, function24);
            final Ref.IntRef intRef = new Ref.IntRef();
            float f = 16;
            Modifier modifierJ = PaddingKt.j(ColumnScopeInstance.f948a.a(ScrollKt.b(companion2, scrollState, true), 1.0f, true), f, f, f, BitmapDescriptorFactory.HUE_RED, 8);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i10 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierJ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i10))) {
                androidx.camera.core.impl.b.B(i10, composerImplV, i10, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            composerImplV.o(1604093334);
            if (str == null) {
                map5 = map4;
                composerImpl = composerImplV;
                companion = companion2;
                i3 = 32;
            } else {
                final int i11 = 0;
                companion = companion2;
                map5 = map4;
                i3 = 32;
                AlertKt.c(AlertStyle.g, Placement.d, OnGloballyPositionedModifierKt.a(companion2, new Function1() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        LayoutCoordinates it = (LayoutCoordinates) obj2;
                        switch (i11) {
                            case 0:
                                Intrinsics.h(it, "it");
                                Ref.IntRef intRef2 = intRef;
                                int i12 = intRef2.d;
                                intRef2.d = i12 + 1;
                                map4.put(Integer.valueOf(i12), Integer.valueOf((int) Float.intBitsToFloat((int) (LayoutCoordinatesKt.d(it) & 4294967295L))));
                                break;
                            default:
                                Intrinsics.h(it, "it");
                                Ref.IntRef intRef3 = intRef;
                                int i13 = intRef3.d;
                                intRef3.d = i13 + 1;
                                map4.put(Integer.valueOf(i13), Integer.valueOf((int) Float.intBitsToFloat((int) (LayoutCoordinatesKt.d(it) & 4294967295L))));
                                break;
                        }
                        return Unit.f24250a;
                    }
                }), null, str, null, null, composerImplV, 54, 104);
                composerImpl = composerImplV;
            }
            composerImpl.V(false);
            composerImpl.o(1604107687);
            PaymentInstrumentsResponse.Success success = (PaymentInstrumentsResponse.Success) paymentInstrumentsResponse;
            PaymentMethodSection paymentMethodSection = success.b;
            GiftCardSection giftCardSection = success.f8303a;
            List list = giftCardSection.b;
            if (list.isEmpty()) {
                z2 = false;
            } else {
                SpacerKt.a(composerImpl, SizeKt.g(companion, f));
                z2 = false;
                SectionTitleItemKt.a(0, composerImpl, null, giftCardSection.f8293a);
            }
            composerImpl.V(z2);
            composerImpl.o(1604116037);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final int i12 = 1;
                int i13 = ((i5 >> 12) & 8176) | ((i8 << 9) & 57344);
                ComposerImpl composerImpl2 = composerImpl;
                f((GiftCardItem) it.next(), map, map2, map3, function12, OnGloballyPositionedModifierKt.a(companion, new Function1() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        LayoutCoordinates it2 = (LayoutCoordinates) obj2;
                        switch (i12) {
                            case 0:
                                Intrinsics.h(it2, "it");
                                Ref.IntRef intRef2 = intRef;
                                int i122 = intRef2.d;
                                intRef2.d = i122 + 1;
                                map5.put(Integer.valueOf(i122), Integer.valueOf((int) Float.intBitsToFloat((int) (LayoutCoordinatesKt.d(it2) & 4294967295L))));
                                break;
                            default:
                                Intrinsics.h(it2, "it");
                                Ref.IntRef intRef3 = intRef;
                                int i132 = intRef3.d;
                                intRef3.d = i132 + 1;
                                map5.put(Integer.valueOf(i132), Integer.valueOf((int) Float.intBitsToFloat((int) (LayoutCoordinatesKt.d(it2) & 4294967295L))));
                                break;
                        }
                        return Unit.f24250a;
                    }
                }), composerImpl2, i13);
                composerImpl = composerImpl2;
            }
            composerImpl.V(false);
            composerImpl.o(1604135830);
            if (!paymentMethodSection.getPaymentMethods().isEmpty()) {
                SpacerKt.a(composerImpl, SizeKt.g(companion, i3));
                SectionTitleItemKt.a(0, composerImpl, null, paymentMethodSection.getTitle());
            }
            composerImpl.V(false);
            composerImpl.o(1604145977);
            for (PaymentMethodItem paymentMethodItem : paymentMethodSection.getPaymentMethods()) {
                if (paymentMethodItem instanceof PaymentMethodItem.CreditCard) {
                    composerImpl.o(1371916890);
                    int i14 = i5 << 3;
                    int i15 = ((i5 >> 9) & 112) | (i14 & 7168) | (i14 & 57344);
                    int i16 = i8 << 15;
                    ComposerImpl composerImpl3 = composerImpl;
                    e((PaymentMethodItem.CreditCard) paymentMethodItem, str3, success.g, z, str2, cvvActions, function12, composerImpl3, i15 | (458752 & i16) | (i16 & 3670016));
                    composerImpl = composerImpl3;
                    composerImpl.V(false);
                } else if (paymentMethodItem instanceof PaymentMethodItem.PayPal) {
                    composerImpl.o(1371937465);
                    g((PaymentMethodItem.PayPal) paymentMethodItem, str3, function12, composerImpl, ((i5 >> 9) & 112) | ((i8 << 3) & 896));
                    composerImpl.V(false);
                } else {
                    if (!(paymentMethodItem instanceof PaymentMethodItem.GooglePay)) {
                        throw au.com.woolworths.android.onesite.a.w(1371914102, composerImpl, false);
                    }
                    composerImpl.o(-419333318);
                    if (googlePayUiState instanceof GooglePayUiState.Available) {
                        PaymentMethodItem.GooglePay googlePay = (PaymentMethodItem.GooglePay) paymentMethodItem;
                        SectionOptionGooglePayItemKt.a(googlePay, googlePay.f.equals(str3), function12, null, composerImpl, (i8 << 3) & 896);
                    }
                    composerImpl.V(false);
                }
            }
            str4 = str3;
            composerImpl.V(false);
            composerImpl.V(true);
            composableLambdaImpl2 = composableLambdaImpl;
            composableLambdaImpl2.invoke(composerImpl, Integer.valueOf((i8 >> 9) & 14));
            d(success, googlePayUiState, function1, null, composerImpl, (i5 >> 21) & 1008);
            composerImpl.V(true);
            paymentInstrumentsResponse2 = paymentInstrumentsResponse;
            function14 = function13;
        } else {
            composerImpl = composerImplV;
            str4 = str3;
            if (!(paymentInstrumentsResponse2 instanceof PaymentInstrumentsResponse.ValidationFailure)) {
                throw new NoWhenBranchMatchedException();
            }
            function14 = function13;
            function14.invoke(paymentInstrumentsResponse2);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            final String str7 = str4;
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    WPayForOrderContentKt.h(paymentInstrumentsResponse2, str, z, str2, str7, map, map2, map3, googlePayUiState, function1, cvvActions, function12, function14, composableLambdaImpl2, (Composer) obj2, iA, iA2);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(final au.com.woolworths.feature.shop.wpay.domain.model.PageResult r29, final java.lang.String r30, final java.lang.String r31, final java.util.Map r32, final java.util.Map r33, final boolean r34, final java.lang.String r35, final java.util.Map r36, final au.com.woolworths.feature.shop.wpay.ui.wpay.GooglePayUiState r37, final kotlin.jvm.functions.Function0 r38, final kotlin.jvm.functions.Function1 r39, final au.com.woolworths.feature.shop.wpay.ui.wpay.CvvActions r40, final kotlin.jvm.functions.Function1 r41, final kotlin.jvm.functions.Function1 r42, final androidx.compose.runtime.internal.ComposableLambdaImpl r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContentKt.i(au.com.woolworths.feature.shop.wpay.domain.model.PageResult, java.lang.String, java.lang.String, java.util.Map, java.util.Map, boolean, java.lang.String, java.util.Map, au.com.woolworths.feature.shop.wpay.ui.wpay.GooglePayUiState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, au.com.woolworths.feature.shop.wpay.ui.wpay.CvvActions, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }
}
