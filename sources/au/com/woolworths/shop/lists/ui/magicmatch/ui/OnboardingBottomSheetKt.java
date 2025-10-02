package au.com.woolworths.shop.lists.ui.magicmatch.ui;

import android.content.Context;
import android.view.ViewGroup;
import androidx.activity.compose.BackHandlerKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.DragHandleBehaviour;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.ModalBottomSheetKt;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetStateKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.button.SecondaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.m;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.f;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobSupport;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "isSheetOpened", "Lcom/airbnb/lottie/LottieComposition;", "composition", "shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OnboardingBottomSheetKt {
    public static final void a(final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(615571926);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function03) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function04) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG;
            final SheetState sheetStateA = SheetStateKt.a(6, 0, composerImplV);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == obj) {
                objG2 = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG2);
            }
            final MutableState mutableState = (MutableState) objG2;
            composerImplV.V(false);
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(coroutineScope) | composerImplV.I(sheetStateA) | ((i2 & 57344) == 16384);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == obj) {
                objG3 = new Function0() { // from class: au.com.woolworths.shop.lists.ui.magicmatch.ui.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ((JobSupport) BuildersKt.c(coroutineScope, null, null, new OnboardingBottomSheetKt$OnboardingBottomSheet$hideSheet$1$1$1(sheetStateA, null), 3)).invokeOnCompletion(new m(mutableState, function04));
                    }
                };
                composerImplV.A(objG3);
            }
            final Function0 function05 = (Function0) objG3;
            composerImplV.V(false);
            composerImplV.o(-1633490746);
            boolean zI2 = composerImplV.I(sheetStateA);
            Object objG4 = composerImplV.G();
            if (zI2 || objG4 == obj) {
                objG4 = new OnboardingBottomSheetKt$OnboardingBottomSheet$1$1(sheetStateA, mutableState, null);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG4);
            DragHandleBehaviour dragHandleBehaviour = DragHandleBehaviour.f;
            float f = 16;
            RoundedCornerShape roundedCornerShapeD = RoundedCornerShapeKt.d(f, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(function05);
            Object objG5 = composerImplV.G();
            if (zN || objG5 == obj) {
                objG5 = new f(29, function05);
                composerImplV.A(objG5);
            }
            composerImplV.V(false);
            ModalBottomSheetKt.a((Function0) objG5, null, sheetStateA, roundedCornerShapeD, dragHandleBehaviour, 0L, 0L, ComposableLambdaKt.c(-679646325, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.magicmatch.ui.OnboardingBottomSheetKt$OnboardingBottomSheet$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    ColumnScope ModalBottomSheet = (ColumnScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    Intrinsics.h(ModalBottomSheet, "$this$ModalBottomSheet");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(-1633490746);
                        final Function0 function06 = function05;
                        boolean zN2 = composer2.n(function06);
                        final Function0 function07 = function0;
                        boolean zN3 = zN2 | composer2.n(function07);
                        Object objG6 = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (zN3 || objG6 == composer$Companion$Empty$1) {
                            final int i3 = 0;
                            objG6 = new Function0() { // from class: au.com.woolworths.shop.lists.ui.magicmatch.ui.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i3) {
                                        case 0:
                                            function06.invoke();
                                            function07.invoke();
                                            break;
                                        case 1:
                                            function06.invoke();
                                            function07.invoke();
                                            break;
                                        default:
                                            function06.invoke();
                                            function07.invoke();
                                            break;
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG6);
                        }
                        Function0 function08 = (Function0) objG6;
                        composer2.l();
                        composer2.o(-1633490746);
                        boolean zN4 = composer2.n(function06);
                        final Function0 function09 = function02;
                        boolean zN5 = zN4 | composer2.n(function09);
                        Object objG7 = composer2.G();
                        if (zN5 || objG7 == composer$Companion$Empty$1) {
                            final int i4 = 1;
                            objG7 = new Function0() { // from class: au.com.woolworths.shop.lists.ui.magicmatch.ui.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i4) {
                                        case 0:
                                            function06.invoke();
                                            function09.invoke();
                                            break;
                                        case 1:
                                            function06.invoke();
                                            function09.invoke();
                                            break;
                                        default:
                                            function06.invoke();
                                            function09.invoke();
                                            break;
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG7);
                        }
                        Function0 function010 = (Function0) objG7;
                        composer2.l();
                        composer2.o(-1633490746);
                        boolean zN6 = composer2.n(function06);
                        final Function0 function011 = function03;
                        boolean zN7 = zN6 | composer2.n(function011);
                        Object objG8 = composer2.G();
                        if (zN7 || objG8 == composer$Companion$Empty$1) {
                            final int i5 = 2;
                            objG8 = new Function0() { // from class: au.com.woolworths.shop.lists.ui.magicmatch.ui.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i5) {
                                        case 0:
                                            function06.invoke();
                                            function011.invoke();
                                            break;
                                        case 1:
                                            function06.invoke();
                                            function011.invoke();
                                            break;
                                        default:
                                            function06.invoke();
                                            function011.invoke();
                                            break;
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG8);
                        }
                        composer2.l();
                        OnboardingBottomSheetKt.b(function08, function010, (Function0) objG8, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12607488, 98);
            composerImpl = composerImplV;
            boolean zD = sheetStateA.f4725a.d();
            composerImpl.o(5004770);
            boolean zN2 = composerImpl.n(function05);
            Object objG6 = composerImpl.G();
            if (zN2 || objG6 == obj) {
                objG6 = new c(0, function05);
                composerImpl.A(objG6);
            }
            composerImpl.V(false);
            BackHandlerKt.a(zD, (Function0) objG6, composerImpl, 0, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.instore.presence.presentation.b(function0, function02, function03, function04, i);
        }
    }

    public static final void b(Function0 function0, Function0 function02, Function0 function03, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1070287888);
        int i2 = i | (composerImplV.p(true) ? 4 : 2) | (composerImplV.I(function0) ? 32 : 16) | (composerImplV.I(function02) ? 256 : 128) | (composerImplV.I(function03) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 16;
            Modifier modifierF = PaddingKt.f(SizeKt.e(companion, 1.0f), f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
            ComposeUiNode.e3.getClass();
            Function0 function04 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function04);
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
            composerImplV.o(-1767807799);
            ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_chat_entry_bbs_beta, 0, composerImplV), null, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, f, 5), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
            composerImplV.V(false);
            LottieAnimationKt.a(RememberLottieCompositionKt.c(new LottieCompositionSpec.RawRes(R.raw.magic_match_looped), composerImplV, 0).getD(), SizeKt.q(companion, 38), null, Integer.MAX_VALUE, null, null, null, false, composerImplV, 1572912, 0, 2097084);
            float f2 = 32;
            TextKt.a(StringResources_androidKt.c(composerImplV, R.string.shop_lists_magic_match_onboarding_title), CoreTheme.f(composerImplV).d.b.b, PaddingKt.j(companion, f2, f, f2, BitmapDescriptorFactory.HUE_RED, 8), 0L, null, 3, 0, false, 0, null, composerImplV, 0, 984);
            float f3 = 8;
            TextKt.a(StringResources_androidKt.c(composerImplV, R.string.shop_lists_magic_match_onboarding_body), CoreTheme.f(composerImplV).f5120a.b.f5123a, PaddingKt.j(companion, f2, f3, f2, BitmapDescriptorFactory.HUE_RED, 8), CoreTheme.b(composerImplV).e.d.b, null, 3, 0, false, 0, null, composerImplV, 0, 976);
            PrimaryButtonKt.a(StringResources_androidKt.c(composerImplV, R.string.shop_lists_magic_match_onboarding_primary_cta), function0, PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), false, null, null, null, null, composerImplV, (i2 & 112) | KyberEngine.KyberPolyBytes, 248);
            SecondaryButtonKt.a(StringResources_androidKt.c(composerImplV, R.string.shop_lists_magic_match_onboarding_secondary_cta), function02, PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), false, null, null, null, null, composerImplV, ((i2 >> 3) & 112) | KyberEngine.KyberPolyBytes, 248);
            String strC = StringResources_androidKt.c(composerImplV, R.string.shop_lists_magic_match_onboarding_tertiary_cta);
            TextStyle textStyle = CoreTheme.f(composerImplV).f5120a.b.b;
            Modifier modifierH = PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, f, 1);
            composerImplV.o(5004770);
            boolean z = (i2 & 7168) == 2048;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new f(28, function03);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            TextKt.a(strC, textStyle, ClickableKt.d(modifierH, false, null, null, (Function0) objG, 7), CoreTheme.b(composerImplV).f4782a.d.b.f4798a, null, 3, 0, false, 0, null, composerImplV, 0, 976);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(function0, function02, function03, i, 29);
        }
    }

    public static final void c(AppCompatActivity appCompatActivity, final au.com.woolworths.shop.lists.ui.shoppinglist.sort.a aVar, final au.com.woolworths.shop.lists.ui.shoppinglist.sort.a aVar2, final au.com.woolworths.shop.lists.ui.shoppinglist.sort.a aVar3) {
        Intrinsics.h(appCompatActivity, "<this>");
        final ViewGroup viewGroup = (ViewGroup) appCompatActivity.findViewById(android.R.id.content);
        Context context = viewGroup.getContext();
        Intrinsics.g(context, "getContext(...)");
        final ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.magicmatch.ui.OnboardingBottomSheetKt$showOnboardingBottomSheet$composeView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ViewGroup viewGroup2 = viewGroup;
                    final ComposeView composeView2 = composeView;
                    final au.com.woolworths.shop.lists.ui.shoppinglist.sort.a aVar4 = aVar;
                    final au.com.woolworths.shop.lists.ui.shoppinglist.sort.a aVar5 = aVar2;
                    final au.com.woolworths.shop.lists.ui.shoppinglist.sort.a aVar6 = aVar3;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(725182829, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.magicmatch.ui.OnboardingBottomSheetKt$showOnboardingBottomSheet$composeView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(5004770);
                                Object obj5 = aVar4;
                                boolean zN = composer2.n(obj5);
                                Object objG = composer2.G();
                                Object obj6 = Composer.Companion.f1624a;
                                if (zN || objG == obj6) {
                                    objG = new au.com.woolworths.shop.cart.ui.c(obj5, 19);
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer2.l();
                                composer2.o(5004770);
                                Object obj7 = aVar5;
                                boolean zN2 = composer2.n(obj7);
                                Object objG2 = composer2.G();
                                if (zN2 || objG2 == obj6) {
                                    objG2 = new au.com.woolworths.shop.cart.ui.c(obj7, 20);
                                    composer2.A(objG2);
                                }
                                Function0 function02 = (Function0) objG2;
                                composer2.l();
                                composer2.o(5004770);
                                Object obj8 = aVar6;
                                boolean zN3 = composer2.n(obj8);
                                Object objG3 = composer2.G();
                                if (zN3 || objG3 == obj6) {
                                    objG3 = new au.com.woolworths.shop.cart.ui.c(obj8, 21);
                                    composer2.A(objG3);
                                }
                                Function0 function03 = (Function0) objG3;
                                composer2.l();
                                composer2.o(-1633490746);
                                ViewGroup viewGroup3 = viewGroup2;
                                boolean zI = composer2.I(viewGroup3);
                                ComposeView composeView3 = composeView2;
                                boolean zI2 = zI | composer2.I(composeView3);
                                Object objG4 = composer2.G();
                                if (zI2 || objG4 == obj6) {
                                    objG4 = new OnboardingBottomSheetKt$showOnboardingBottomSheet$composeView$1$1$1$4$1(viewGroup3, composeView3);
                                    composer2.A(objG4);
                                }
                                composer2.l();
                                OnboardingBottomSheetKt.a(function0, function02, function03, (Function0) ((KFunction) objG4), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1806852023));
        viewGroup.addView(composeView);
    }
}
