package au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem;

import android.webkit.WebView;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionHeaderIconType;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionHeaderSelectionType;
import com.woolworths.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroid/webkit/WebView;", "webView", "wpay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SectionOptionLinkedCreditCardItemKt {
    public static final void a(final PaymentMethodItem.CreditCard.Linked linked, final Map headers, final boolean z, final boolean z2, final String str, final Function1 onCvvWebViewCreated, final Function0 onCvvLoaded, final Function2 onCvvLoadError, final Function0 onCvvLoadTryAgain, final Function2 onCvvPostMessage, final Function0 onItemSelected, final Function0 onDeleteClicked, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImpl;
        Intrinsics.h(headers, "headers");
        Intrinsics.h(onCvvWebViewCreated, "onCvvWebViewCreated");
        Intrinsics.h(onCvvLoaded, "onCvvLoaded");
        Intrinsics.h(onCvvLoadError, "onCvvLoadError");
        Intrinsics.h(onCvvLoadTryAgain, "onCvvLoadTryAgain");
        Intrinsics.h(onCvvPostMessage, "onCvvPostMessage");
        Intrinsics.h(onItemSelected, "onItemSelected");
        Intrinsics.h(onDeleteClicked, "onDeleteClicked");
        ComposerImpl composerImplV = composer.v(715146137);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(linked) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(headers) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(str) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= composerImplV.I(onCvvWebViewCreated) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= composerImplV.I(onCvvLoaded) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerImplV.I(onCvvLoadError) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= composerImplV.I(onCvvLoadTryAgain) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= composerImplV.I(onCvvPostMessage) ? 536870912 : 268435456;
        }
        int i3 = (composerImplV.I(onItemSelected) ? 4 : 2) | (composerImplV.I(onDeleteClicked) ? 32 : 16);
        if ((306783379 & i2) == 306783378 && (i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(12);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(ClipKt.a(companion, roundedCornerShapeB), CoreTheme.b(composerImplV).e.f4848a.c, RectangleShapeKt.f1779a);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            SectionOptionHeaderTileKt.a(new SectionOptionHeaderSelectionType.Radio(z, true, onItemSelected), new SectionOptionHeaderIconType.ImageUrl(linked.getIcon(), R.drawable.ic_card_type), linked.getTitle(), linked.getSubtitle(), ClickableKt.d(companion, false, null, null, onItemSelected, 7), onDeleteClicked, composerImplV, (i3 << 12) & 458752, 0);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(null);
                composerImplV.A(objG);
            }
            final MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            if (!linked.getIsSelected() || z2) {
                WebView webView = (WebView) mutableState.getD();
                if (webView != null) {
                    webView.destroy();
                }
                mutableState.setValue(null);
            }
            AnimatedVisibilityKt.c(ColumnScopeInstance.f948a, linked.getIsSelected(), null, EnterExitTransitionKt.d(AnimationSpecKt.e(200, 0, null, 6), 14), EnterExitTransitionKt.l(AnimationSpecKt.e(200, 0, null, 6), 14), null, ComposableLambdaKt.c(-1451036149, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionLinkedCreditCardItemKt$SectionOptionLinkedCreditCardItem$1$1
                /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x01be  */
                @Override // kotlin.jvm.functions.Function3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instructions count: 663
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionLinkedCreditCardItemKt$SectionOptionLinkedCreditCardItem$1$1.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerImplV), composerImplV, 1600518, 18);
            composerImpl = composerImplV;
            composerImpl.o(5004770);
            Object objG2 = composerImpl.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState, 20);
                composerImpl.A(objG2);
            }
            composerImpl.V(false);
            EffectsKt.c(Unit.f24250a, (Function1) objG2, composerImpl);
            composerImpl.V(true);
            SpacerKt.a(composerImpl, SizeKt.g(companion, 8));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    SectionOptionLinkedCreditCardItemKt.a(linked, headers, z, z2, str, onCvvWebViewCreated, onCvvLoaded, onCvvLoadError, onCvvLoadTryAgain, onCvvPostMessage, onItemSelected, onDeleteClicked, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
