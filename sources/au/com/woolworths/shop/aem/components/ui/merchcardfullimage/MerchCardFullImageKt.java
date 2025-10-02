package au.com.woolworths.shop.aem.components.ui.merchcardfullimage;

import android.content.Context;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightModifierKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.button.TertiaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.sdui.common.alert.a;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import au.com.woolworths.shop.aem.components.model.merchcardfullimage.MerchCardFullImageData;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MerchCardFullImageKt {
    public static final void a(final MerchCardFullImageData merchCardFullImageData, final Function1 onClick, final SharedIntrinsicHeightState sharedIntrinsicHeightState, Modifier modifier, Composer composer, int i, int i2) {
        final Modifier modifier2;
        Intrinsics.h(onClick, "onClick");
        Intrinsics.h(sharedIntrinsicHeightState, "sharedIntrinsicHeightState");
        ComposerImpl composerImplV = composer.v(1849767402);
        int i3 = (composerImplV.I(merchCardFullImageData) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(onClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(sharedIntrinsicHeightState) ? 256 : 128;
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
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(-1801718258, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.merchcardfullimage.MerchCardFullImageKt$MerchCardFullImage$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierA = TestTagKt.a(SizeKt.o(modifier2, 160), "merchCardFullImage");
                        CoreElevation coreElevation = CoreTheme.c(composer2).f4876a;
                        RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(16);
                        composer2.o(-1633490746);
                        final MerchCardFullImageData merchCardFullImageData2 = merchCardFullImageData;
                        boolean zI = composer2.I(merchCardFullImageData2);
                        final Function1 function1 = onClick;
                        boolean zN = zI | composer2.n(function1);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new a(merchCardFullImageData2, function1);
                            composer2.A(objG);
                        }
                        composer2.l();
                        final SharedIntrinsicHeightState sharedIntrinsicHeightState2 = sharedIntrinsicHeightState;
                        CardKt.b((Function0) objG, modifierA, false, roundedCornerShapeB, 0L, 0L, 0L, 0L, coreElevation, null, null, ComposableLambdaKt.c(-1995796279, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.merchcardfullimage.MerchCardFullImageKt$MerchCardFullImage$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                Composer composer3;
                                Modifier.Companion companion;
                                MerchCardFullImageData merchCardFullImageData3;
                                ColumnScope Card = (ColumnScope) obj3;
                                Composer composer4 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(Card, "$this$Card");
                                if ((iIntValue & 17) == 16 && composer4.c()) {
                                    composer4.j();
                                } else {
                                    SharedIntrinsicHeightState sharedIntrinsicHeightState3 = sharedIntrinsicHeightState2;
                                    Modifier.Companion companion2 = Modifier.Companion.d;
                                    Modifier modifierA2 = SharedIntrinsicHeightModifierKt.a(companion2, sharedIntrinsicHeightState3);
                                    MerchCardFullImageData merchCardFullImageData4 = merchCardFullImageData2;
                                    ImageWithAltText imageWithAltText = merchCardFullImageData4.f10172a;
                                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                    int p = composer4.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer4.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer4, modifierA2);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function0 = ComposeUiNode.Companion.b;
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
                                    Function2 function2 = ComposeUiNode.Companion.g;
                                    Updater.b(composer4, measurePolicyD, function2);
                                    Function2 function22 = ComposeUiNode.Companion.f;
                                    Updater.b(composer4, persistentCompositionLocalMapD, function22);
                                    Function2 function23 = ComposeUiNode.Companion.j;
                                    if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p))) {
                                        b.z(p, composer4, p, function23);
                                    }
                                    Function2 function24 = ComposeUiNode.Companion.d;
                                    Updater.b(composer4, modifierD, function24);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
                                    Modifier modifierI = boxScopeInstance.i();
                                    ImageRequest.Builder builder = new ImageRequest.Builder((Context) composer4.x(AndroidCompositionLocals_androidKt.b));
                                    builder.c = imageWithAltText.f10141a;
                                    ImageRequests_androidKt.d(builder, R.drawable.ic_merchcardfullimage_placeholder);
                                    ImageRequests_androidKt.a(builder, R.drawable.ic_merchcardfullimage_placeholder);
                                    SingletonAsyncImageKt.a(builder.a(), imageWithAltText.b, modifierI, null, ContentScale.Companion.f1880a, composer4, 1572864, 1976);
                                    float f = 12;
                                    Modifier modifierG = boxScopeInstance.g(PaddingKt.j(PaddingKt.h(SizeKt.x(SizeKt.e(companion2, 1.0f), Alignment.Companion.k, false), f, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7), Alignment.Companion.h);
                                    Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(f), Alignment.Companion.m, composer4, 6);
                                    int p2 = composer4.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer4.d();
                                    Modifier modifierD2 = ComposedModifierKt.d(composer4, modifierG);
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
                                    Updater.b(composer4, columnMeasurePolicyA, function2);
                                    Updater.b(composer4, persistentCompositionLocalMapD2, function22);
                                    if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p2))) {
                                        b.z(p2, composer4, p2, function23);
                                    }
                                    Updater.b(composer4, modifierD2, function24);
                                    String str = merchCardFullImageData4.e;
                                    composer4.o(1013454595);
                                    if (str == null) {
                                        composer3 = composer4;
                                        companion = companion2;
                                        merchCardFullImageData3 = merchCardFullImageData4;
                                    } else {
                                        Modifier modifierE = SizeKt.e(companion2, 1.0f);
                                        TextStyle textStyle = CoreTheme.f(composer4).f5120a.b.f5123a;
                                        long j = CoreTheme.b(composer4).e.d.c.b;
                                        composer3 = composer4;
                                        companion = companion2;
                                        merchCardFullImageData3 = merchCardFullImageData4;
                                        TextKt.a(str, textStyle, modifierE, j, null, 3, 2, false, 3, null, composer3, 102236544, 656);
                                    }
                                    composer3.l();
                                    String str2 = merchCardFullImageData3.d;
                                    composer3.o(1013472772);
                                    if (str2 != null) {
                                        TextKt.a(str2, CoreTheme.f(composer3).b.f5125a.b, SizeKt.e(companion, 1.0f), CoreTheme.b(composer3).e.d.c.b, null, 3, 2, false, 3, null, composer3, 102236544, 656);
                                    }
                                    composer3.l();
                                    ButtonData buttonData = merchCardFullImageData3.c;
                                    composer3.o(1013490713);
                                    if (buttonData != null) {
                                        String str3 = buttonData.b;
                                        Modifier modifierE2 = SizeKt.e(companion, 1.0f);
                                        composer3.o(-1633490746);
                                        boolean zI2 = composer3.I(buttonData);
                                        Function1 function12 = function1;
                                        boolean zN2 = zI2 | composer3.n(function12);
                                        Object objG2 = composer3.G();
                                        if (zN2 || objG2 == Composer.Companion.f1624a) {
                                            objG2 = new au.com.woolworths.feature.shop.account.ui.details.components.b(buttonData, function12);
                                            composer3.A(objG2);
                                        }
                                        composer3.l();
                                        TertiaryButtonKt.a(str3, (Function0) objG2, modifierE2, false, null, null, null, composer3, KyberEngine.KyberPolyBytes, 248);
                                    }
                                    composer3.l();
                                    composer3.f();
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 0, 1780);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.b((Object) merchCardFullImageData, (Object) onClick, (Object) sharedIntrinsicHeightState, modifier2, i, i2, 18);
        }
    }
}
