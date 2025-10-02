package au.com.woolworths.feature.shop.account.ui.delete;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.compose.utils.modifier.VerticalShadowModifierKt;
import au.com.woolworths.compose.utils.modifier.i;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.account.model.delete.DeleteAccountTnCData;
import au.com.woolworths.markdown.RichTextMarkdownKt;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DeleteAccountTnCContentKt {
    public static final void a(final DeleteAccountTnCData content, final Function1 onTermsAcceptanceCheckChanged, Function0 onConfirmationButtonClick, boolean z, Composer composer, int i, int i2) {
        boolean z2;
        int i3;
        boolean z3;
        Intrinsics.h(content, "content");
        Intrinsics.h(onTermsAcceptanceCheckChanged, "onTermsAcceptanceCheckChanged");
        Intrinsics.h(onConfirmationButtonClick, "onConfirmationButtonClick");
        ComposerImpl composerImplV = composer.v(1117469477);
        int i4 = (composerImplV.n(content) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= composerImplV.I(onTermsAcceptanceCheckChanged) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.I(onConfirmationButtonClick) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (composerImplV.p(z2) ? 2048 : 1024);
        }
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            z3 = z2;
        } else {
            final boolean z4 = i5 != 0 ? false : z2;
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG);
            }
            final MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            FillElement fillElement = SizeKt.c;
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(24);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierH = PaddingKt.h(ColumnScopeInstance.f948a.a(SizeKt.e(companion, 1.0f), 1.0f, true), 16, BitmapDescriptorFactory.HUE_RED, 2);
            composerImplV.o(-1224400529);
            boolean z5 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((i3 & 112) == 32);
            Object objG2 = composerImplV.G();
            if (z5 || objG2 == composer$Companion$Empty$1) {
                objG2 = new Function1() { // from class: au.com.woolworths.feature.shop.account.ui.delete.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final DeleteAccountTnCData deleteAccountTnCData = content;
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountTnCContentKt$DeleteAccountTnCContent$1$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    TextKt.b(deleteAccountTnCData.f6573a, PaddingKt.j(ColumnScopeInstance.f948a.b(Modifier.Companion.d, Alignment.Companion.n), BitmapDescriptorFactory.HUE_RED, 32, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).d.b.b, composer2, 0, 0, 65020);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1507441850), 3);
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountTnCContentKt$DeleteAccountTnCContent$1$1$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    RichTextMarkdownKt.b(deleteAccountTnCData.b, null, null, false, composer2, 0, 14);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -159647261), 3);
                        final MutableState mutableState2 = mutableState;
                        final boolean z6 = z4;
                        final Function1 function1 = onTermsAcceptanceCheckChanged;
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountTnCContentKt$DeleteAccountTnCContent$1$1$1$3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    String str = deleteAccountTnCData.c;
                                    MutableState mutableState3 = mutableState2;
                                    boolean zBooleanValue = ((Boolean) mutableState3.getD()).booleanValue();
                                    boolean z7 = !z6;
                                    composer2.o(-1633490746);
                                    Function1 function12 = function1;
                                    boolean zN = composer2.n(function12);
                                    Object objG3 = composer2.G();
                                    if (zN || objG3 == Composer.Companion.f1624a) {
                                        objG3 = new au.com.woolworths.design.core.ui.component.experimental.topbar.d(1, mutableState3, function12);
                                        composer2.A(objG3);
                                    }
                                    composer2.l();
                                    DeleteAccountAcceptConditionsKt.a(str, zBooleanValue, z7, (Function1) objG3, composer2, 0, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1209019262), 3);
                        LazyListScope.i(LazyColumn, null, null, ComposableSingletons$DeleteAccountTnCContentKt.f6581a, 3);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            boolean z6 = z4;
            LazyDslKt.b(modifierH, lazyListStateA, null, false, spacedAlignedG, null, null, false, null, (Function1) objG2, composerImplV, 24576, 492);
            long jA = ColorResources_androidKt.a(composerImplV, R.color.color_black_100);
            int i7 = VerticalShadowModifierKt.b;
            Modifier modifierB = DrawModifierKt.b(companion, new i(jA, 4, -1));
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i8 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierB);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                androidx.camera.core.impl.b.B(i8, composerImplV, i8, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            DeleteAccountTnCActionFooterUiKt.a(((i3 << 3) & 7168) | KyberEngine.KyberPolyBytes, 0, composerImplV, SizeKt.x(SizeKt.e(companion, 1.0f), Alignment.Companion.k, false), content.d.f6574a, onConfirmationButtonClick, ((Boolean) mutableState.getD()).booleanValue() && !z6);
            composerImplV.V(true);
            composerImplV.V(true);
            z3 = z6;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.a(content, onTermsAcceptanceCheckChanged, onConfirmationButtonClick, z3, i, i2, 4);
        }
    }
}
