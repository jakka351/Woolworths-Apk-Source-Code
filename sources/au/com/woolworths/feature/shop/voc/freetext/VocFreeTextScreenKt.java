package au.com.woolworths.feature.shop.voc.freetext;

import android.R;
import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.design.core.ui.component.experimental.topbar.d;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.button.ButtonTextKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.voc.freetext.VocFreeTextContract;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", TextBundle.TEXT_ENTRY, "voc_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class VocFreeTextScreenKt {
    public static final void a(VocFreeTextContract.ViewState viewState, Function1 onTextChange, Function0 onSubmitComment, Composer composer, int i) {
        boolean z;
        Intrinsics.h(onTextChange, "onTextChange");
        Intrinsics.h(onSubmitComment, "onSubmitComment");
        ComposerImpl composerImplV = composer.v(1155529518);
        int i2 = i | (composerImplV.n(viewState) ? 4 : 2) | (composerImplV.I(onTextChange) ? 32 : 16) | (composerImplV.I(onSubmitComment) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f("");
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = new FocusRequester();
                composerImplV.A(objD);
            }
            FocusRequester focusRequester = (FocusRequester) objD;
            composerImplV.V(false);
            composerImplV.o(5004770);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new VocFreeTextScreenKt$CommentTextInput$1$1(focusRequester, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG2);
            composerImplV.o(-1932650158);
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            composerImplV.o(-1932649294);
            int iL = builder.l(new SpanStyle(ColorKt.b(Extensions.a(R.attr.textColorSecondary, (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b))), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65534));
            try {
                builder.e(StringResources_androidKt.c(composerImplV, com.woolworths.R.string.voc_free_text_characters_left));
                builder.i(iL);
                composerImplV.V(false);
                builder.e(" " + (viewState != null ? viewState.b : 500));
                AnnotatedString annotatedStringM = builder.m();
                composerImplV.V(false);
                Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(4), Alignment.Companion.m, composerImplV, 6);
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
                Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
                Function2 function2 = ComposeUiNode.Companion.j;
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                    androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
                }
                Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
                Modifier modifierA = FocusRequesterModifierKt.a(SizeKt.b(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 200, 1), focusRequester);
                String str = (String) mutableState.getD();
                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f1339a;
                TextFieldColors textFieldColorsF = TextFieldDefaults.f(WxTheme.a(composerImplV).h(), 0L, 0L, WxTheme.a(composerImplV).h(), composerImplV, 2064351);
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, 7, 119);
                composerImplV.o(5004770);
                boolean z2 = (i2 & 896) == 256;
                Object objG3 = composerImplV.G();
                if (z2 || objG3 == composer$Companion$Empty$1) {
                    z = true;
                    objG3 = new a(onSubmitComment, 1);
                    composerImplV.A(objG3);
                } else {
                    z = true;
                }
                composerImplV.V(false);
                KeyboardActions keyboardActions = new KeyboardActions((Function1) objG3, null, null, 62);
                composerImplV.o(-1633490746);
                boolean z3 = (i2 & 112) == 32 ? z : false;
                Object objG4 = composerImplV.G();
                if (z3 || objG4 == composer$Companion$Empty$1) {
                    objG4 = new d(3, mutableState, onTextChange);
                    composerImplV.A(objG4);
                }
                composerImplV.V(false);
                OutlinedTextFieldKt.b(str, (Function1) objG4, modifierA, false, false, null, ComposableSingletons$VocFreeTextScreenKt.f8224a, null, null, null, false, null, keyboardOptions, keyboardActions, false, 0, 0, null, null, textFieldColorsF, composerImplV, 1572864, KyberEngine.KyberPolyBytes, 511928);
                TextKt.c(annotatedStringM, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, WxTheme.b(composerImplV).r, composerImplV, 0, 0, 131070);
                composerImplV = composerImplV;
                composerImplV.V(z);
            } catch (Throwable th) {
                builder.i(iL);
                throw th;
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(viewState, onTextChange, onSubmitComment, i, 8);
        }
    }

    public static final void b(final VocFreeTextContract.ViewState viewState, final Function1 onTextChange, final Function0 onSubmitComment, final Function0 onClose, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(onTextChange, "onTextChange");
        Intrinsics.h(onSubmitComment, "onSubmitComment");
        Intrinsics.h(onClose, "onClose");
        ComposerImpl composerImplV = composer.v(306769005);
        int i2 = (composerImplV.n(viewState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onTextChange) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onSubmitComment) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onClose) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImpl = composerImplV;
            ScaffoldKt.a(SizeKt.c, null, ComposableLambdaKt.c(-1604268920, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.voc.freetext.VocFreeTextScreenKt$VocFreeTextScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final Function0 function0 = onClose;
                        TopNavBarKt.b(StringResources_androidKt.c(composer2, com.woolworths.R.string.voc_free_text_toolbar_title), null, null, StringResources_androidKt.c(composer2, com.woolworths.R.string.voc_free_text_toolbar_title), 0L, 0L, 0L, null, 0, ComposableLambdaKt.c(-1257302249, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.voc.freetext.VocFreeTextScreenKt$VocFreeTextScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVectorA = CloseKt.a();
                                    long jH = WxTheme.a(composer3).h();
                                    String strC = StringResources_androidKt.c(composer3, com.woolworths.R.string.content_description_close_button);
                                    composer3.o(5004770);
                                    Function0 function02 = function0;
                                    boolean zN = composer3.n(function02);
                                    Object objG = composer3.G();
                                    if (zN || objG == Composer.Companion.f1624a) {
                                        objG = new b(function02, 0);
                                        composer3.A(objG);
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVectorA, strC, (Function0) objG, null, false, jH, composer3, 0, 24);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 905969664, 0, 1270);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, WxTheme.a(composerImplV).a(), 0L, null, null, ComposableLambdaKt.c(-831983274, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.voc.freetext.VocFreeTextScreenKt$VocFreeTextScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final StatefulButtonState statefulButtonState;
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        float f = 16;
                        Modifier modifierF = PaddingKt.f(SizeKt.e(companion, 1.0f), f);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(f), Alignment.Companion.m, composer2, 6);
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
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        VocFreeTextContract.ViewState viewState2 = viewState;
                        Function1 function1 = onTextChange;
                        Function0 function02 = onSubmitComment;
                        VocFreeTextScreenKt.a(viewState2, function1, function02, composer2, 0);
                        if (viewState2 == null || (statefulButtonState = viewState2.c) == null) {
                            statefulButtonState = StatefulButtonState.f;
                        }
                        boolean z = statefulButtonState == StatefulButtonState.d;
                        Modifier modifierE = SizeKt.e(companion, 1.0f);
                        composer2.o(5004770);
                        boolean zN = composer2.n(function02);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new b(function02, 1);
                            composer2.A(objG);
                        }
                        composer2.l();
                        PrimaryButtonKt.b((Function0) objG, modifierE, z, null, ComposableLambdaKt.c(-532240829, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.voc.freetext.VocFreeTextScreenKt$VocFreeTextScreen$2$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                RowScope PrimaryButton = (RowScope) obj4;
                                Composer composer3 = (Composer) obj5;
                                int iIntValue2 = ((Number) obj6).intValue();
                                Intrinsics.h(PrimaryButton, "$this$PrimaryButton");
                                if ((iIntValue2 & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else if (statefulButtonState == StatefulButtonState.e) {
                                    composer3.o(1032799052);
                                    ProgressIndicatorKt.b(2, 0, 390, 24, WxTheme.a(composer3).h(), 0L, composer3, SizeKt.q(Modifier.Companion.d, 15));
                                    composer3.l();
                                } else {
                                    composer3.o(1033105363);
                                    ButtonTextKt.b(StringResources_androidKt.c(composer3, com.woolworths.R.string.voc_free_text_submit), null, 0L, false, null, null, composer3, 0, 62);
                                    composer3.l();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 24624, 8);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 390, 954);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.d(i, 26, viewState, onTextChange, onSubmitComment, onClose, false);
        }
    }
}
