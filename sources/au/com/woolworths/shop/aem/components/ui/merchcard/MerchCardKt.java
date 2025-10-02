package au.com.woolworths.shop.aem.components.ui.merchcard;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceBetween$1;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightModifierKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import au.com.woolworths.shop.aem.components.model.merchcard.MerchCardData;
import au.com.woolworths.shop.aem.components.ui.ImagePlaceholderHelperKt;
import au.com.woolworths.shop.aem.components.ui.button.ButtonSectionKt;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MerchCardKt {
    public static final void a(final MerchCardData merchCardData, final Function1 onMerchCardClickEvent, final Function1 onMerchCardImpressionEvent, Modifier modifier, SharedIntrinsicHeightState sharedIntrinsicHeightState, Composer composer, int i, int i2) {
        int i3;
        final SharedIntrinsicHeightState sharedIntrinsicHeightState2;
        Modifier modifier2;
        Intrinsics.h(merchCardData, "merchCardData");
        Intrinsics.h(onMerchCardClickEvent, "onMerchCardClickEvent");
        Intrinsics.h(onMerchCardImpressionEvent, "onMerchCardImpressionEvent");
        ComposerImpl composerImplV = composer.v(-1528312529);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(merchCardData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(onMerchCardClickEvent) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(onMerchCardImpressionEvent) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        if (((i3 | 24576) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            sharedIntrinsicHeightState2 = sharedIntrinsicHeightState;
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            final Modifier modifier3 = modifier;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = d.f(composerImplV);
            }
            sharedIntrinsicHeightState2 = (SharedIntrinsicHeightState) objG;
            composerImplV.V(false);
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(1630617683, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.merchcard.MerchCardKt$MerchCardGrid$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue() & 3;
                    Unit unit = Unit.f24250a;
                    if (iIntValue == 2 && composer2.c()) {
                        composer2.j();
                        return unit;
                    }
                    composer2.o(-1633490746);
                    final MerchCardData merchCardData2 = merchCardData;
                    boolean zI = composer2.I(merchCardData2);
                    Function1 function1 = onMerchCardImpressionEvent;
                    boolean zN = zI | composer2.n(function1);
                    Object objG2 = composer2.G();
                    Object obj3 = Composer.Companion.f1624a;
                    if (zN || objG2 == obj3) {
                        objG2 = new b(merchCardData2, function1, 0);
                        composer2.A(objG2);
                    }
                    composer2.l();
                    EffectsKt.c(unit, (Function1) objG2, composer2);
                    composer2.o(-1633490746);
                    boolean zI2 = composer2.I(merchCardData2);
                    final Function1 function12 = onMerchCardClickEvent;
                    boolean zN2 = zI2 | composer2.n(function12);
                    Object objG3 = composer2.G();
                    if (zN2 || objG3 == obj3) {
                        objG3 = new c(merchCardData2, function12, 0);
                        composer2.A(objG3);
                    }
                    composer2.l();
                    Modifier modifierA = SharedIntrinsicHeightModifierKt.a(ClickableKt.d(modifier3, false, null, null, (Function0) objG3, 7), sharedIntrinsicHeightState2);
                    Arrangement$SpaceBetween$1 arrangement$SpaceBetween$1 = Arrangement.g;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.n;
                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$SpaceBetween$1, horizontal, composer2, 54);
                    int p = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                    Modifier modifierD = ComposedModifierKt.d(composer2, modifierA);
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
                    Modifier.Companion companion = Modifier.Companion.d;
                    Modifier modifierA2 = SizeKt.A(SizeKt.e(companion, 1.0f), (3 & 1) != 0 ? Alignment.Companion.n : Alignment.Companion.o, false);
                    ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.c, horizontal, composer2, 54);
                    int p2 = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                    Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierA2);
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
                    Updater.b(composer2, columnMeasurePolicyA2, function2);
                    Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                        androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                    }
                    Updater.b(composer2, modifierD2, function24);
                    ImageWithAltText imageWithAltText = merchCardData2.f10171a;
                    SingletonAsyncImageKt.b(imageWithAltText.f10141a, imageWithAltText.b, AspectRatioKt.a(BackgroundKt.b(SizeKt.e(companion, 1.0f), CoreTheme.b(composer2).e.f4848a.d, RectangleShapeKt.f1779a), 0.93333334f), ImagePlaceholderHelperKt.a(BitmapDescriptorFactory.HUE_RED, 0, 3, composer2), ImagePlaceholderHelperKt.a(BitmapDescriptorFactory.HUE_RED, 0, 3, composer2), null, null, null, null, null, ContentScale.Companion.b, null, composer2, 0, 6, 31712);
                    String str = merchCardData2.c;
                    TextStyle textStyle = CoreTheme.f(composer2).e.b.b;
                    FontWeight fontWeight = FontWeight.j;
                    float f = 12;
                    float f2 = 16;
                    TextKt.a(str, TextStyle.a(textStyle, 0L, 0L, fontWeight, null, 0L, 0L, null, null, 0, 16777211), PaddingKt.j(SizeKt.z(companion, null, 3), f, f2, f, BitmapDescriptorFactory.HUE_RED, 8), CoreTheme.b(composer2).e.d.d, null, 3, 2, false, 3, null, composer2, 102236160, 656);
                    Composer composer3 = composer2;
                    String str2 = merchCardData2.d;
                    composer3.o(1827489357);
                    if (str2 != null) {
                        TextKt.a(str2, TextStyle.a(CoreTheme.f(composer3).e.b.b, 0L, 0L, fontWeight, null, 0L, 0L, null, null, 0, 16777211), PaddingKt.i(SizeKt.z(companion, null, 3), f, 8, f, f2), CoreTheme.b(composer3).e.d.b, null, 3, 2, false, 3, null, composer3, 102236160, 656);
                        composer3 = composer3;
                    }
                    composer3.l();
                    composer3.f();
                    final ButtonData buttonData = merchCardData2.e;
                    composer3.o(-1245878131);
                    if (buttonData != null) {
                        ThemeKt.b(6, composer3, ComposableLambdaKt.c(-1717545960, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.merchcard.MerchCardKt$MerchCardGrid$2$3$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer4 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer4.c()) {
                                    composer4.j();
                                } else {
                                    composer4.o(-1633490746);
                                    MerchCardData merchCardData3 = merchCardData2;
                                    boolean zI3 = composer4.I(merchCardData3);
                                    Function1 function13 = function12;
                                    boolean zN3 = zI3 | composer4.n(function13);
                                    Object objG4 = composer4.G();
                                    if (zN3 || objG4 == Composer.Companion.f1624a) {
                                        objG4 = new b(merchCardData3, function13, 1);
                                        composer4.A(objG4);
                                    }
                                    composer4.l();
                                    ButtonSectionKt.a(buttonData, (Function1) objG4, PaddingKt.g(SizeKt.e(Modifier.Companion.d, 1.0f), 16, 12), null, composer4, KyberEngine.KyberPolyBytes);
                                }
                                return Unit.f24250a;
                            }
                        }, composer3));
                    }
                    composer3.l();
                    composer3.f();
                    return unit;
                }
            }, composerImplV));
            modifier2 = modifier3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.a(merchCardData, onMerchCardClickEvent, onMerchCardImpressionEvent, modifier2, sharedIntrinsicHeightState2, i, i2, 5);
        }
    }

    public static final void b(final MerchCardData merchCardData, final Function1 onMerchCardClickEvent, final Function1 onMerchCardImpressionEvent, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.h(merchCardData, "merchCardData");
        Intrinsics.h(onMerchCardClickEvent, "onMerchCardClickEvent");
        Intrinsics.h(onMerchCardImpressionEvent, "onMerchCardImpressionEvent");
        ComposerImpl composerImplV = composer.v(-1180288093);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(merchCardData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(onMerchCardClickEvent) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(onMerchCardImpressionEvent) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = i4 != 0 ? Modifier.Companion.d : modifier;
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(910135039, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.merchcard.MerchCardKt$MerchCardList$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue() & 3;
                    Unit unit = Unit.f24250a;
                    if (iIntValue == 2 && composer2.c()) {
                        composer2.j();
                        return unit;
                    }
                    composer2.o(-1633490746);
                    final MerchCardData merchCardData2 = merchCardData;
                    boolean zI = composer2.I(merchCardData2);
                    Function1 function1 = onMerchCardImpressionEvent;
                    boolean zN = zI | composer2.n(function1);
                    Object objG = composer2.G();
                    Object obj3 = Composer.Companion.f1624a;
                    if (zN || objG == obj3) {
                        objG = new b(merchCardData2, function1, 2);
                        composer2.A(objG);
                    }
                    composer2.l();
                    EffectsKt.c(unit, (Function1) objG, composer2);
                    composer2.o(-1633490746);
                    boolean zI2 = composer2.I(merchCardData2);
                    final Function1 function12 = onMerchCardClickEvent;
                    boolean zN2 = zI2 | composer2.n(function12);
                    Object objG2 = composer2.G();
                    if (zN2 || objG2 == obj3) {
                        objG2 = new c(merchCardData2, function12, 1);
                        composer2.A(objG2);
                    }
                    composer2.l();
                    Modifier modifierF = PaddingKt.f(ClickableKt.d(modifier2, false, null, null, (Function0) objG2, 7), 16);
                    RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g, Alignment.Companion.j, composer2, 6);
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
                    Updater.b(composer2, rowMeasurePolicyA, function2);
                    Function2 function22 = ComposeUiNode.Companion.f;
                    Updater.b(composer2, persistentCompositionLocalMapD, function22);
                    Function2 function23 = ComposeUiNode.Companion.j;
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                        androidx.camera.core.impl.b.z(p, composer2, p, function23);
                    }
                    Function2 function24 = ComposeUiNode.Companion.d;
                    Updater.b(composer2, modifierD, function24);
                    ImageWithAltText imageWithAltText = merchCardData2.b;
                    String str = imageWithAltText.f10141a;
                    String str2 = imageWithAltText.b;
                    float fA = PrimitiveResources_androidKt.a(composer2, R.dimen.product_list_image_size);
                    Modifier.Companion companion = Modifier.Companion.d;
                    SingletonAsyncImageKt.b(str, str2, ClipKt.a(AspectRatioKt.a(BackgroundKt.b(SizeKt.u(companion, fA), CoreTheme.b(composer2).e.f4848a.d, RectangleShapeKt.f1779a), 0.776699f), RoundedCornerShapeKt.b(4)), null, ImagePlaceholderHelperKt.a(56, 6, 2, composer2), null, null, null, null, null, ContentScale.Companion.b, null, composer2, 0, 6, 31720);
                    Modifier modifierJ = PaddingKt.j(SizeKt.A(SizeKt.e(companion, 1.0f), (3 & 1) != 0 ? Alignment.Companion.n : Alignment.Companion.o, false), 24, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 54);
                    int p2 = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                    Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierJ);
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
                    Updater.b(composer2, columnMeasurePolicyA, function2);
                    Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                        androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                    }
                    Updater.b(composer2, modifierD2, function24);
                    String str3 = merchCardData2.c;
                    TextStyle textStyle = CoreTheme.f(composer2).e.b.b;
                    FontWeight fontWeight = FontWeight.j;
                    TextKt.a(str3, TextStyle.a(textStyle, 0L, 0L, fontWeight, null, 0L, 0L, null, null, 0, 16777211), SizeKt.e(companion, 1.0f), CoreTheme.b(composer2).e.d.d, null, 5, 2, false, 3, null, composer2, 102236544, 656);
                    Composer composer3 = composer2;
                    String str4 = merchCardData2.d;
                    composer3.o(-280456849);
                    if (str4 != null) {
                        TextKt.a(str4, TextStyle.a(CoreTheme.f(composer3).e.b.b, 0L, 0L, fontWeight, null, 0L, 0L, null, null, 0, 16777211), PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), CoreTheme.b(composer3).e.d.b, null, 5, 2, false, 3, null, composer3, 102236544, 656);
                        composer3 = composer3;
                    }
                    composer3.l();
                    final ButtonData buttonData = merchCardData2.e;
                    composer3.o(-280435387);
                    if (buttonData != null) {
                        ThemeKt.b(6, composer3, ComposableLambdaKt.c(-609090955, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.merchcard.MerchCardKt$MerchCardList$1$3$1$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer4 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer4.c()) {
                                    composer4.j();
                                } else {
                                    composer4.o(-1633490746);
                                    MerchCardData merchCardData3 = merchCardData2;
                                    boolean zI3 = composer4.I(merchCardData3);
                                    Function1 function13 = function12;
                                    boolean zN3 = zI3 | composer4.n(function13);
                                    Object objG3 = composer4.G();
                                    if (zN3 || objG3 == Composer.Companion.f1624a) {
                                        objG3 = new b(merchCardData3, function13, 3);
                                        composer4.A(objG3);
                                    }
                                    composer4.l();
                                    ButtonSectionKt.a(buttonData, (Function1) objG3, PaddingKt.j(SizeKt.z(Modifier.Companion.d, null, 3), 2, 12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12), null, composer4, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer3));
                    }
                    composer3.l();
                    composer3.f();
                    composer3.f();
                    return unit;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.b((Object) merchCardData, (Object) onMerchCardClickEvent, (Object) onMerchCardImpressionEvent, modifier2, i, i2, 17);
        }
    }
}
