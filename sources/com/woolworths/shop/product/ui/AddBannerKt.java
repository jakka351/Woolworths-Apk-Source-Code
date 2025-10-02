package com.woolworths.shop.product.ui;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.compose.utils.modifier.ConditionalModifierKt;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.compose.filter.e;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import coil3.compose.SingletonAsyncImageKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "adImageAvailable", "product-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AddBannerKt {
    public static final void a(final ActionableCard actionableCard, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(626047661);
        if ((((composerImplV.I(actionableCard) ? 4 : 2) | i | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = Modifier.Companion.d;
            Modifier modifierG = PaddingKt.g(modifier2, 16, 8);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.j, composerImplV, 6);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Object objF = au.com.woolworths.android.onesite.a.f(composerImplV, modifierD, ComposeUiNode.Companion.d, 1849434622);
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objF == composer$Companion$Empty$1) {
                objF = new com.woolworths.scanlibrary.domain.productsearch.a(19);
                composerImplV.A(objF);
            }
            Function1 function1 = (Function1) objF;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zR = composerImplV.r(0);
            Object objG = composerImplV.G();
            if (zR || objG == composer$Companion$Empty$1) {
                objG = new com.woolworths.scanlibrary.domain.productsearch.a(20);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            CardKt.a(AspectRatioKt.a(ConditionalModifierKt.a(modifier2, true, function1, (Function1) objG), actionableCard.getHeight().getG()), null, 0L, 0L, CoreTheme.c(composerImplV).f4876a, BorderStrokeKt.a(CoreTheme.b(composerImplV).e.b.e, 1), ComposableLambdaKt.c(1907819396, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.woolworths.shop.product.ui.AddBannerKt$AddBanner$1$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope Card = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(Card, "$this$Card");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(1849434622);
                        Object objG2 = composer2.G();
                        ActionableCard actionableCard2 = actionableCard;
                        Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                        if (objG2 == composer$Companion$Empty$12) {
                            objG2 = SnapshotStateKt.f(Boolean.valueOf(!StringsKt.D(actionableCard2.getImageUrl())));
                            composer2.A(objG2);
                        }
                        MutableState mutableState = (MutableState) objG2;
                        composer2.l();
                        long j = CoreTheme.b(composer2).e.f4848a.d;
                        FillElement fillElement = SizeKt.c;
                        boolean zBooleanValue = ((Boolean) mutableState.getD()).booleanValue();
                        composer2.o(5004770);
                        boolean zS = composer2.s(j);
                        Object objG3 = composer2.G();
                        if (zS || objG3 == composer$Companion$Empty$12) {
                            objG3 = new e(j, 9);
                            composer2.A(objG3);
                        }
                        composer2.l();
                        Modifier modifierB = ConditionalModifierKt.b(fillElement, zBooleanValue, null, (Function1) objG3, 2);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierB);
                        ComposeUiNode.e3.getClass();
                        Function0 function02 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function02);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function22 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function22);
                        }
                        Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                        if (((Boolean) mutableState.getD()).booleanValue()) {
                            composer2.o(-1463188884);
                            String imageUrl = actionableCard2.getImageUrl();
                            String altText = actionableCard2.getAltText();
                            composer2.o(5004770);
                            Object objG4 = composer2.G();
                            if (objG4 == composer$Companion$Empty$12) {
                                objG4 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState, 27);
                                composer2.A(objG4);
                            }
                            composer2.l();
                            SingletonAsyncImageKt.b(imageUrl, altText, fillElement, null, null, null, null, null, (Function1) objG4, null, ContentScale.Companion.b, null, composer2, 100663680, 6, 31480);
                            composer2.l();
                        } else {
                            composer2.o(-1462729712);
                            TextKt.b(actionableCard2.getAltText(), PaddingKt.g(SizeKt.z(Modifier.Companion.d, null, 3), 8, 4), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).b.f5125a.f5126a, composer2, 48, 0, 65532);
                            composer2 = composer2;
                            composer2.l();
                        }
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572864, 14);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.productcard.ui.components.b(actionableCard, i, 10, modifier2);
        }
    }
}
