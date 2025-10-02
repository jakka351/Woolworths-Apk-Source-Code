package au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.OutlinedTextFieldKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import au.com.woolworths.android.onesite.deeplink.i;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertKt;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle;
import au.com.woolworths.design.core.ui.component.stable.alert.Placement;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.wpay.ui.wpay.CurrencyVisualTransformationKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionHeaderIconType;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionHeaderSelectionType;
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

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003¨\u0006\u0003²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "hasInitialized", "previousVisible", "wpay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SectionOptionGiftCardItemKt {
    public static final void a(final String str, final String str2, final String str3, final String str4, final boolean z, final boolean z2, final String str5, final InsetBannerApiData insetBannerApiData, final String str6, final Function1 onUiEvent, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        ComposerImpl composerImpl;
        final Modifier modifier3;
        Intrinsics.h(onUiEvent, "onUiEvent");
        ComposerImpl composerImplV = composer.v(-395591477);
        if ((i & 6) == 0) {
            i4 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerImplV.n(str2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.n(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= composerImplV.n(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= composerImplV.p(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= composerImplV.p(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= composerImplV.n(str5) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= composerImplV.I(insetBannerApiData) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= composerImplV.n(str6) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= composerImplV.I(onUiEvent) ? 536870912 : 268435456;
        }
        int i6 = i4;
        int i7 = i3 & 1024;
        if (i7 != 0) {
            modifier2 = modifier;
            i5 = i2 | 6;
        } else {
            modifier2 = modifier;
            if ((i2 & 6) == 0) {
                i5 = i2 | (composerImplV.n(modifier2) ? 4 : 2);
            } else {
                i5 = i2;
            }
        }
        if ((i6 & 306783379) == 306783378 && (i5 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier3 = modifier2;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifier4 = i7 != 0 ? companion : modifier2;
            final VisualTransformation visualTransformationA = CurrencyVisualTransformationKt.a(composerImplV);
            final FocusManager focusManager = (FocusManager) composerImplV.x(CompositionLocalsKt.i);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new FocusRequester();
                composerImplV.A(objG);
            }
            final FocusRequester focusRequester = (FocusRequester) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objD);
            }
            final MutableState mutableState = (MutableState) objD;
            Object objD2 = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD2 == composer$Companion$Empty$1) {
                objD2 = SnapshotStateKt.f(Boolean.valueOf(z2));
                composerImplV.A(objD2);
            }
            final MutableState mutableState2 = (MutableState) objD2;
            composerImplV.V(false);
            Modifier modifierB = BackgroundKt.b(ClipKt.a(modifier4, RoundedCornerShapeKt.b(12)), CoreTheme.b(composerImplV).e.f4848a.c, RectangleShapeKt.f1779a);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i8 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            Modifier modifier5 = modifier4;
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                androidx.camera.core.impl.b.B(i8, composerImplV, i8, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-1746271574);
            int i9 = i6 & 1879048192;
            int i10 = i6 & 14;
            int i11 = i6 & 234881024;
            boolean z3 = (i11 == 67108864) | (i9 == 536870912) | (i10 == 4);
            Object objG2 = composerImplV.G();
            if (z3 || objG2 == composer$Companion$Empty$1) {
                objG2 = new a(onUiEvent, str, str6, 0);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            SectionOptionHeaderSelectionType.CheckBox checkBox = new SectionOptionHeaderSelectionType.CheckBox((Function1) objG2, z2);
            SectionOptionHeaderIconType.Resource resource = new SectionOptionHeaderIconType.Resource(R.drawable.ic_gift_card);
            composerImplV.o(-1224400529);
            boolean z4 = (i9 == 536870912) | (i10 == 4) | (i11 == 67108864) | ((i6 & 458752) == 131072);
            Object objG3 = composerImplV.G();
            if (z4 || objG3 == composer$Companion$Empty$1) {
                objG3 = new i(onUiEvent, str, str6, z2);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            Modifier modifierD2 = ClickableKt.d(companion, false, null, null, (Function0) objG3, 7);
            composerImplV.o(-1746271574);
            boolean z5 = (i9 == 536870912) | (i10 == 4) | ((i6 & 57344) == 16384);
            Object objG4 = composerImplV.G();
            if (z5 || objG4 == composer$Companion$Empty$1) {
                objG4 = new au.com.woolworths.feature.shop.wpay.ui.wpay.i(onUiEvent, 1, str, z);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            SectionOptionHeaderTileKt.a(checkBox, resource, str2, null, modifierD2, (Function0) objG4, composerImplV, ((i6 << 3) & 896) | 3072, 0);
            AnimatedVisibilityKt.c(ColumnScopeInstance.f948a, z2, null, EnterExitTransitionKt.d(AnimationSpecKt.e(200, 0, null, 6), 14), EnterExitTransitionKt.l(AnimationSpecKt.e(200, 0, null, 6), 14), null, ComposableLambdaKt.c(-810015427, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionGiftCardItemKt$SectionOptionGiftCardItem$1$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Function2 function22;
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                    ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 0);
                    int p = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                    Modifier.Companion companion2 = Modifier.Companion.d;
                    Modifier modifierD3 = ComposedModifierKt.d(composer2, companion2);
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
                    Function2 function23 = ComposeUiNode.Companion.g;
                    Updater.b(composer2, columnMeasurePolicyA2, function23);
                    Function2 function24 = ComposeUiNode.Companion.f;
                    Updater.b(composer2, persistentCompositionLocalMapD, function24);
                    Function2 function25 = ComposeUiNode.Companion.j;
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                        androidx.camera.core.impl.b.z(p, composer2, p, function25);
                    }
                    Function2 function26 = ComposeUiNode.Companion.d;
                    Updater.b(composer2, modifierD3, function26);
                    float f = 16;
                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composer2, PaddingKt.j(companion2, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
                    Modifier modifierF = PaddingKt.f(companion2, f);
                    RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composer2, 0);
                    int p2 = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                    Modifier modifierD4 = ComposedModifierKt.d(composer2, modifierF);
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
                    Updater.b(composer2, rowMeasurePolicyA, function23);
                    Updater.b(composer2, persistentCompositionLocalMapD2, function24);
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                        function22 = function25;
                        androidx.camera.core.impl.b.z(p2, composer2, p2, function22);
                    } else {
                        function22 = function25;
                    }
                    Updater.b(composer2, modifierD4, function26);
                    BiasAlignment.Vertical vertical = Alignment.Companion.k;
                    RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
                    Modifier modifierB2 = rowScopeInstance.b(companion2, vertical);
                    ColumnMeasurePolicy columnMeasurePolicyA3 = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 0);
                    int p3 = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                    Modifier modifierD5 = ComposedModifierKt.d(composer2, modifierB2);
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
                    Updater.b(composer2, columnMeasurePolicyA3, function23);
                    Updater.b(composer2, persistentCompositionLocalMapD3, function24);
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                        androidx.camera.core.impl.b.z(p3, composer2, p3, function22);
                    }
                    Updater.b(composer2, modifierD5, function26);
                    boolean z6 = false;
                    TextKt.b(str3, null, CoreTheme.b(composer2).e.d.b, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, CoreTheme.f(composer2).f5120a.b.b, composer2, 0, 432, 59386);
                    TextKt.b(str4, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, CoreTheme.f(composer2).f5120a.b.b, composer2, 0, 432, 59390);
                    composer2.f();
                    SpacerKt.a(composer2, rowScopeInstance.a(companion2, 1.0f, true));
                    Modifier modifierG = SizeKt.g(SizeKt.u(companion2, 110), 50);
                    FocusRequester focusRequester2 = focusRequester;
                    Modifier modifierA = FocusRequesterModifierKt.a(modifierG, focusRequester2);
                    composer2.o(-1746271574);
                    Function1 function1 = onUiEvent;
                    boolean zN = composer2.n(function1);
                    String str7 = str;
                    boolean zN2 = zN | composer2.n(str7);
                    Object objG5 = composer2.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                    MutableState mutableState3 = mutableState2;
                    if (zN2 || objG5 == composer$Companion$Empty$12) {
                        objG5 = new androidx.lifecycle.compose.b(function1, str7, mutableState3, 26);
                        composer2.A(objG5);
                    }
                    composer2.l();
                    Modifier modifierA2 = FocusChangedModifierKt.a(modifierA, (Function1) objG5);
                    TextStyle textStyle = CoreTheme.f(composer2).f5120a.b.f5123a;
                    KeyboardOptions keyboardOptions = new KeyboardOptions(9, 7, 115);
                    composer2.o(5004770);
                    FocusManager focusManager2 = focusManager;
                    boolean zI = composer2.I(focusManager2);
                    Object objG6 = composer2.G();
                    if (zI || objG6 == composer$Companion$Empty$12) {
                        objG6 = new c(focusManager2, 0);
                        composer2.A(objG6);
                    }
                    composer2.l();
                    KeyboardActions keyboardActions = new KeyboardActions((Function1) objG6, null, null, 62);
                    InsetBannerApiData insetBannerApiData2 = insetBannerApiData;
                    if (insetBannerApiData2 != null) {
                        z6 = true;
                    }
                    composer2.o(-1746271574);
                    boolean zN3 = composer2.n(function1) | composer2.n(str7);
                    String str8 = str5;
                    boolean zN4 = zN3 | composer2.n(str8);
                    Object objG7 = composer2.G();
                    if (zN4 || objG7 == composer$Companion$Empty$12) {
                        objG7 = new a(function1, str7, str8, 1);
                        composer2.A(objG7);
                    }
                    composer2.l();
                    OutlinedTextFieldKt.b(str8, (Function1) objG7, modifierA2, false, false, textStyle, null, null, null, null, z6, visualTransformationA, keyboardOptions, keyboardActions, true, 0, 0, null, null, null, composer2, 0, 24960, 1016792);
                    Composer composer3 = composer2;
                    composer3.f();
                    composer3.o(1990431642);
                    if (insetBannerApiData2 != null) {
                        AlertKt.c(AlertStyle.g, Placement.d, PaddingKt.j(companion2, f, BitmapDescriptorFactory.HUE_RED, f, f, 2), null, insetBannerApiData2.getMessage(), null, null, composer3, 438, 104);
                        composer3 = composer3;
                    }
                    composer3.l();
                    boolean z7 = z2;
                    Boolean boolValueOf = Boolean.valueOf(z7);
                    composer3.o(-1224400529);
                    boolean zP = composer3.p(z7) | composer3.n(function1) | composer3.n(str7);
                    Object objG8 = composer3.G();
                    if (zP || objG8 == composer$Companion$Empty$12) {
                        SectionOptionGiftCardItemKt$SectionOptionGiftCardItem$1$4$1$3$1 sectionOptionGiftCardItemKt$SectionOptionGiftCardItem$1$4$1$3$1 = new SectionOptionGiftCardItemKt$SectionOptionGiftCardItem$1$4$1$3$1(z7, function1, str7, focusRequester2, mutableState, mutableState3, null);
                        composer3.A(sectionOptionGiftCardItemKt$SectionOptionGiftCardItem$1$4$1$3$1);
                        objG8 = sectionOptionGiftCardItemKt$SectionOptionGiftCardItem$1$4$1$3$1;
                    }
                    composer3.l();
                    EffectsKt.e(composer3, boolValueOf, (Function2) objG8);
                    composer3.f();
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1600518 | ((i6 >> 12) & 112), 18);
            composerImpl = composerImplV;
            composerImpl.V(true);
            SpacerKt.a(composerImpl, SizeKt.g(companion, 8));
            mutableState.setValue(Boolean.TRUE);
            modifier3 = modifier5;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    SectionOptionGiftCardItemKt.a(str, str2, str3, str4, z, z2, str5, insetBannerApiData, str6, onUiEvent, modifier3, (Composer) obj, iA, iA2, i3);
                    return Unit.f24250a;
                }
            };
        }
    }
}
