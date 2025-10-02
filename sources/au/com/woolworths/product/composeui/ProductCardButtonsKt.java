package au.com.woolworths.product.composeui;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.button.SecondaryButtonKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.component.text.InlineBadgeKt;
import au.com.woolworths.design.wx.foundation.AccentColors;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.design.wx.utils.MeasureInlineContentPlaceholderKt;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTrolleyData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductCardButtonsKt {
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(int r18, int r19, androidx.compose.runtime.Composer r20, androidx.compose.ui.Modifier r21, au.com.woolworths.product.models.ProductCard r22, kotlin.jvm.functions.Function0 r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.composeui.ProductCardButtonsKt.a(int, int, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier, au.com.woolworths.product.models.ProductCard, kotlin.jvm.functions.Function0, boolean):void");
    }

    public static final void b(ProductCard productCard, Function0 onClick, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        String upperCase;
        Modifier modifier2;
        ButtonApiData button;
        String label;
        Intrinsics.h(productCard, "productCard");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(674386835);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(onClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion.d : modifier;
            InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard.getInStoreAvailabilityInfo();
            if (inStoreAvailabilityInfo == null || (button = inStoreAvailabilityInfo.getButton()) == null || (label = button.getLabel()) == null) {
                upperCase = "";
            } else {
                upperCase = label.toUpperCase(Locale.ROOT);
                Intrinsics.g(upperCase, "toUpperCase(...)");
            }
            f(onClick, upperCase, modifier3, null, composerImplV, ((i3 >> 3) & 14) | (i3 & 896), 8);
            modifier2 = modifier3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(productCard, onClick, modifier2, i, i2, 1);
        }
    }

    public static final void c(int i, int i2, Composer composer, Modifier modifier, Function0 onClick) {
        int i3;
        Modifier modifier2;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-460307755);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = i4 != 0 ? Modifier.Companion.d : modifier;
            f(onClick, StringResources_androidKt.c(composerImplV, R.string.check_other_stores_button), modifier2, null, composerImplV, (i3 & 14) | 3072 | ((i3 << 3) & 896), 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.progressindicator.c(onClick, modifier2, i, i2, 4);
        }
    }

    public static final void d(int i, Composer composer, Modifier modifier, Function0 onClick) {
        int i2;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-353480015);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            PrimaryButtonKt.a(StringResources_androidKt.c(composerImplV, R.string.shop_add_to_list_button_lists), onClick, modifier, false, false, null, null, null, null, composerImplV, (i2 << 3) & 1008, 1016);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.b(onClick, modifier, i, 10);
        }
    }

    public static final void e(int i, Composer composer, Modifier modifier, Function0 onClick) {
        int i2;
        Modifier modifier2;
        Function0 function0;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-1112596834);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            function0 = onClick;
        } else {
            modifier2 = modifier;
            function0 = onClick;
            SecondaryButtonKt.b(StringResources_androidKt.c(composerImplV, R.string.shop_add_to_list_button_lists), function0, modifier2, false, false, null, null, composerImplV, (i2 << 3) & 1008, 120);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.b(function0, modifier2, i, 11);
        }
    }

    public static final void f(Function0 onClick, final String text, Modifier modifier, Integer num, Composer composer, int i, int i2) {
        int i3;
        Integer numValueOf;
        Integer num2;
        Intrinsics.h(onClick, "onClick");
        Intrinsics.h(text, "text");
        ComposerImpl composerImplV = composer.v(-78265083);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(text) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                numValueOf = num;
                int i4 = composerImplV.n(numValueOf) ? 2048 : 1024;
                i3 |= i4;
            } else {
                numValueOf = num;
            }
            i3 |= i4;
        } else {
            numValueOf = num;
        }
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            num2 = numValueOf;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                if ((i2 & 8) != 0) {
                    numValueOf = Integer.valueOf(R.drawable.ic_info_round);
                    i3 &= -7169;
                }
                final Integer num3 = numValueOf;
                composerImplV.W();
                float f = AvailabilityInfoButtonConstants.b;
                long j = AccentColors.b;
                BorderStroke borderStrokeA = BorderStrokeKt.a(j, f);
                PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f1248a;
                composerImplV = composerImplV;
                ButtonKt.b(onClick, modifier, false, null, null, borderStrokeA, ButtonDefaults.c(WxTheme.a(composerImplV).a(), j, 0L, composerImplV, 4), AvailabilityInfoButtonConstants.f9256a, ComposableLambdaKt.c(1656088659, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.product.composeui.ProductCardButtonsKt$OutlinedInfoButton$1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        RowScope OutlinedButton = (RowScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(OutlinedButton, "$this$OutlinedButton");
                        if ((iIntValue & 17) == 16 && composer2.c()) {
                            composer2.j();
                        } else {
                            composer2.o(-1931664683);
                            Integer num4 = num3;
                            if (num4 != null) {
                                IconKt.b(VectorResources_androidKt.b(num4.intValue(), 6, composer2), "", null, 0L, composer2, 48, 12);
                            }
                            composer2.l();
                            Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                            String upperCase = text.toUpperCase(Locale.ROOT);
                            Intrinsics.g(upperCase, "toUpperCase(...)");
                            TextKt.b(upperCase, modifierJ, WxTheme.a(composer2).f(), 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, WxTheme.b(composer2).q, composer2, 48, 432, 59384);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, ((i3 >> 3) & 112) | (i3 & 14) | 905969664, 60);
                num2 = num3;
            } else {
                composerImplV.j();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                final Integer num32 = numValueOf;
                composerImplV.W();
                float f2 = AvailabilityInfoButtonConstants.b;
                long j2 = AccentColors.b;
                BorderStroke borderStrokeA2 = BorderStrokeKt.a(j2, f2);
                PaddingValuesImpl paddingValuesImpl2 = ButtonDefaults.f1248a;
                composerImplV = composerImplV;
                ButtonKt.b(onClick, modifier, false, null, null, borderStrokeA2, ButtonDefaults.c(WxTheme.a(composerImplV).a(), j2, 0L, composerImplV, 4), AvailabilityInfoButtonConstants.f9256a, ComposableLambdaKt.c(1656088659, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.product.composeui.ProductCardButtonsKt$OutlinedInfoButton$1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        RowScope OutlinedButton = (RowScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(OutlinedButton, "$this$OutlinedButton");
                        if ((iIntValue & 17) == 16 && composer2.c()) {
                            composer2.j();
                        } else {
                            composer2.o(-1931664683);
                            Integer num4 = num32;
                            if (num4 != null) {
                                IconKt.b(VectorResources_androidKt.b(num4.intValue(), 6, composer2), "", null, 0L, composer2, 48, 12);
                            }
                            composer2.l();
                            Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                            String upperCase = text.toUpperCase(Locale.ROOT);
                            Intrinsics.g(upperCase, "toUpperCase(...)");
                            TextKt.b(upperCase, modifierJ, WxTheme.a(composer2).f(), 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, WxTheme.b(composer2).q, composer2, 48, 432, 59384);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, ((i3 >> 3) & 112) | (i3 & 14) | 905969664, 60);
                num2 = num32;
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.b(onClick, text, modifier, num2, i, i2, 10);
        }
    }

    public static final void g(int i, int i2, Composer composer, Modifier modifier) {
        Modifier modifier2;
        int i3;
        ComposerImpl composerImplV = composer.v(346135309);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerImplV.n(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion.d : modifier2;
            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f1248a;
            ButtonColors buttonColorsC = ButtonDefaults.c(WxTheme.a(composerImplV).a(), 0L, 0L, composerImplV, 6);
            int i5 = i3;
            PaddingValuesImpl paddingValuesImpl2 = AvailabilityInfoButtonConstants.f9256a;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            int i6 = ((i5 << 3) & 112) | 907542918;
            modifier2 = modifier3;
            ButtonKt.a((Function0) objG, modifier2, false, null, null, null, null, buttonColorsC, paddingValuesImpl2, ComposableSingletons$ProductCardButtonsKt.f9259a, composerImplV, i6, 56);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.settings.v2.ui.d(modifier2, i, i2, 7);
        }
    }

    public static final void h(int i, int i2, Composer composer, Modifier modifier) {
        Modifier modifier2;
        int i3;
        ComposerImpl composerImplV = composer.v(1010972628);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerImplV.n(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion.d : modifier2;
            String strC = StringResources_androidKt.c(composerImplV, R.string.unavailable);
            PaddingValuesImpl paddingValuesImplA = PaddingKt.a(8, BitmapDescriptorFactory.HUE_RED, 2);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            int i5 = ((i3 << 6) & 896) | 199728;
            Modifier modifier4 = modifier3;
            PrimaryButtonKt.a(strC, (Function0) objG, modifier4, false, false, paddingValuesImplA, null, null, null, composerImplV, i5, 976);
            modifier2 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.settings.v2.ui.d(modifier2, i, i2, 6);
        }
    }

    public static final void i(ProductCard productCard, final Function0 onClick, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        String str;
        ComposerImpl composerImpl;
        Unit unit;
        Modifier modifier2;
        Intrinsics.h(productCard, "productCard");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-1602444749);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(onClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(modifier) ? 256 : 128;
        }
        int i5 = i3;
        if ((i5 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            final Modifier modifier3 = i4 != 0 ? Modifier.Companion.d : modifier;
            ProductTrolleyData trolley = productCard.getTrolley();
            if (trolley == null) {
                composerImpl = composerImplV;
            } else {
                String buttonLabel = trolley.getButtonLabel();
                Locale US = Locale.US;
                Intrinsics.g(US, "US");
                final String upperCase = buttonLabel.toUpperCase(US);
                Intrinsics.g(upperCase, "toUpperCase(...)");
                final String buttonQuantity = trolley.getButtonQuantity();
                composerImplV.o(1943868502);
                final ComposableLambdaImpl composableLambdaImplC = buttonQuantity == null ? null : ComposableLambdaKt.c(-1541842383, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.composeui.ProductCardButtonsKt$UpdateCartButton$1$quantityLabelComposable$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                            long jC = TextUnitKt.c(12);
                            float f = 4;
                            float f2 = 2;
                            InlineBadgeKt.a(buttonQuantity, WxTheme.a(composer2).h(), modifierJ, ToneColors.k, true, jC, RoundedCornerShapeKt.b(3), new PaddingValuesImpl(f, f2, f, f2), null, composer2, 12804480, 256);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV);
                composerImplV.V(false);
                composerImplV.o(1943889651);
                if (composableLambdaImplC == null) {
                    unit = null;
                    str = upperCase;
                    composerImpl = composerImplV;
                } else {
                    str = upperCase;
                    composerImpl = composerImplV;
                    MeasureInlineContentPlaceholderKt.a(composableLambdaImplC, modifier3, ComposableLambdaKt.c(1466628634, new Function4<TextUnit, TextUnit, Composer, Integer, Unit>() { // from class: au.com.woolworths.product.composeui.ProductCardButtonsKt$UpdateCartButton$1$1$1
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i6;
                            long j = ((TextUnit) obj).f2204a;
                            long j2 = ((TextUnit) obj2).f2204a;
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Number) obj4).intValue();
                            if ((iIntValue & 6) == 0) {
                                i6 = (composer2.s(j) ? 4 : 2) | iIntValue;
                            } else {
                                i6 = iIntValue;
                            }
                            if ((iIntValue & 48) == 0) {
                                i6 |= composer2.s(j2) ? 32 : 16;
                            }
                            if ((i6 & 147) == 146 && composer2.c()) {
                                composer2.j();
                            } else {
                                Placeholder placeholder = new Placeholder(j, j2, 7);
                                final ComposableLambdaImpl composableLambdaImpl = composableLambdaImplC;
                                Map mapI = MapsKt.i(new Pair("quantityLabel", new InlineTextContent(placeholder, ComposableLambdaKt.c(-1175802568, new Function3<String, Composer, Integer, Unit>() { // from class: au.com.woolworths.product.composeui.ProductCardButtonsKt$UpdateCartButton$1$1$1$inlineContent$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        String it = (String) obj5;
                                        Composer composer3 = (Composer) obj6;
                                        int iIntValue2 = ((Number) obj7).intValue();
                                        Intrinsics.h(it, "it");
                                        if ((iIntValue2 & 17) == 16 && composer3.c()) {
                                            composer3.j();
                                        } else {
                                            composableLambdaImpl.invoke(composer3, 0);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer2))));
                                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                                builder.e(upperCase);
                                InlineTextContentKt.a(builder, "quantityLabel", buttonQuantity);
                                SecondaryButtonKt.a(builder.m(), onClick, modifier3, false, null, null, mapI, composer2, 0, 56);
                            }
                            return Unit.f24250a;
                        }
                    }, composerImplV), composerImpl, ((i5 >> 3) & 112) | KyberEngine.KyberPolyBytes, 0);
                    unit = Unit.f24250a;
                }
                composerImpl.V(false);
                composerImpl.o(1943889046);
                if (unit == null) {
                    ComposerImpl composerImpl2 = composerImpl;
                    SecondaryButtonKt.b(str, onClick, modifier3, false, false, null, null, composerImpl2, i5 & 1008, 120);
                    composerImpl = composerImpl2;
                }
                composerImpl.V(false);
            }
            modifier2 = modifier3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(productCard, onClick, modifier2, i, i2, 0);
        }
    }
}
