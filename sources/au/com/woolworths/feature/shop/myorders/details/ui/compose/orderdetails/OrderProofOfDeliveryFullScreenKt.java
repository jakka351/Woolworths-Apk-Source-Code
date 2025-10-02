package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
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
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderProofOfDeliveryFullScreenKt {
    public static final void a(final String title, final String str, final String str2, final Function0 onBackButtonPressed, Composer composer, int i) {
        int i2;
        Intrinsics.h(title, "title");
        Intrinsics.h(onBackButtonPressed, "onBackButtonPressed");
        ComposerImpl composerImplV = composer.v(948732160);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(title) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onBackButtonPressed) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(-1536975940, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderProofOfDeliveryFullScreenKt$ProofOfDeliveryScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final Function0 function0 = onBackButtonPressed;
                        TopNavBarKt.a(title, null, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(422982666, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderProofOfDeliveryFullScreenKt$ProofOfDeliveryScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), "Back", function0, null, false, null, 0L, composer3, 48, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663296, 766);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(-778096173, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderProofOfDeliveryFullScreenKt$ProofOfDeliveryScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(it) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = PaddingKt.e(Modifier.Companion.d, it);
                        final String str3 = title;
                        final String str4 = str2;
                        final String str5 = str;
                        SurfaceKt.b(modifierE, null, 0L, 0L, null, null, ComposableLambdaKt.c(-1505711857, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderProofOfDeliveryFullScreenKt$ProofOfDeliveryScreen$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3;
                                Composer composer4 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer4.c()) {
                                    composer4.j();
                                } else {
                                    Modifier.Companion companion = Modifier.Companion.d;
                                    Modifier modifierF = PaddingKt.f(ScrollKt.b(SizeKt.e(companion, 1.0f), ScrollKt.a(composer4), true), 16);
                                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer4, 0);
                                    int p = composer4.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer4.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer4, modifierF);
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
                                    Updater.b(composer4, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                                    Updater.b(composer4, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                    Function2 function2 = ComposeUiNode.Companion.j;
                                    if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p))) {
                                        androidx.camera.core.impl.b.z(p, composer4, p, function2);
                                    }
                                    Updater.b(composer4, modifierD, ComposeUiNode.Companion.d);
                                    SingletonSubcomposeAsyncImageKt.b(str5, str3, SizeKt.e(companion, 1.0f), ComposableSingletons$OrderProofOfDeliveryFullScreenKt.f7794a, ComposableSingletons$OrderProofOfDeliveryFullScreenKt.b, null, ContentScale.Companion.d, composer4, 1597824, 48, 63400);
                                    SpacerKt.a(composer4, SizeKt.g(companion, 8));
                                    composer4.o(-212345832);
                                    String str6 = str4;
                                    if (str6 == null) {
                                        composer3 = composer4;
                                    } else {
                                        composer3 = composer4;
                                        TextKt.b(str6, null, CoreTheme.b(composer4).e.d.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer4).f5120a.c.f5124a, composer3, 0, 0, 65530);
                                    }
                                    composer3.l();
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 62);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582966, 124);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new o(title, str, str2, onBackButtonPressed, i, 0);
        }
    }
}
