package au.com.woolworths.shop.checkout.ui.compose;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.layout.OnPlacedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.design.wx.component.bottomsheet.ModalBottomSheetLayoutKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.button.SecondaryButtonKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.shop.checkout.domain.model.idverification.IdVerificationBottomSheet;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.ImageRequest;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isSheetOpened", "shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class IdVerificationBottomSheetKt {
    public static final void a(String str, Modifier modifier, Function0 function0, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Function0 function02;
        ComposerImpl composerImplV = composer.v(-891604278);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            modifier2 = modifier;
            i2 |= composerImplV.n(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            function02 = function0;
            i2 |= composerImplV.I(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            PrimaryButtonKt.a(str, function02, modifier2, false, false, null, null, null, composableLambdaImpl, composerImplV, (i2 & 14) | ((i2 >> 3) & 112) | ((i2 << 3) & 896) | ((i2 << 18) & 1879048192), 504);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.instore.presence.presentation.b(str, modifier, function0, composableLambdaImpl, i);
        }
    }

    public static final void b(final IdVerificationBottomSheet idVerificationBottomSheet, final Function0 function0, final Function0 function02, Function0 function03, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1169166653);
        int i2 = i | (composerImplV.I(idVerificationBottomSheet) ? 4 : 2) | (composerImplV.I(function0) ? 32 : 16) | (composerImplV.I(function02) ? 256 : 128) | (composerImplV.I(function03) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objG;
            ModalBottomSheetState modalBottomSheetStateC = ModalBottomSheetKt.c(ModalBottomSheetValue.d, null, composerImplV, 3078, 6);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG2);
            }
            MutableState mutableState = (MutableState) objG2;
            composerImplV.V(false);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(coroutineScope) | composerImplV.I(modalBottomSheetStateC);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == composer$Companion$Empty$1) {
                objG3 = new i(0, coroutineScope, modalBottomSheetStateC);
                composerImplV.A(objG3);
            }
            Function0 function04 = (Function0) objG3;
            composerImplV.V(false);
            composerImplV.o(-1746271574);
            boolean zI2 = composerImplV.I(coroutineScope) | composerImplV.I(modalBottomSheetStateC);
            Object objG4 = composerImplV.G();
            if (zI2 || objG4 == composer$Companion$Empty$1) {
                objG4 = new j(0, coroutineScope, mutableState, modalBottomSheetStateC);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            ModalBottomSheetLayoutKt.a(ComposableLambdaKt.c(703492459, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.IdVerificationBottomSheetKt$IdVerificationBottomSheet$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ModalBottomSheetLayout = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        IdVerificationBottomSheet idVerificationBottomSheet2 = idVerificationBottomSheet;
                        String str = idVerificationBottomSheet2.d;
                        List list = idVerificationBottomSheet2.f;
                        String str2 = (String) CollectionsKt.F(list);
                        int I = CollectionsKt.I(list);
                        Integer numValueOf = Integer.valueOf(I);
                        if (I < 1) {
                            numValueOf = null;
                        }
                        String strValueOf = String.valueOf(numValueOf);
                        String str3 = idVerificationBottomSheet2.e;
                        ButtonApiData buttonApiData = idVerificationBottomSheet2.g;
                        String label = buttonApiData != null ? buttonApiData.getLabel() : null;
                        ButtonApiData buttonApiData2 = idVerificationBottomSheet2.h;
                        IdVerificationBottomSheetKt.c(str, str2, strValueOf, str3, label, buttonApiData2 != null ? buttonApiData2.getLabel() : null, function0, function02, composer2, 0, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), OnPlacedModifierKt.a(Modifier.Companion.d, (Function1) objG4), modalBottomSheetStateC, BitmapDescriptorFactory.HUE_RED, 0L, 0L, false, ComposableSingletons$IdVerificationBottomSheetKt.f10711a, composerImplV, 12583430, 120);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(function04);
            Object objG5 = composerImplV.G();
            if (zN || objG5 == composer$Companion$Empty$1) {
                objG5 = new c(function04, 2);
                composerImplV.A(objG5);
            }
            composerImplV.V(false);
            BackHandlerKt.a(false, (Function0) objG5, composerImplV, 0, 1);
            Boolean boolValueOf = Boolean.valueOf(modalBottomSheetStateC.d());
            composerImplV.o(-1746271574);
            boolean zI3 = composerImplV.I(modalBottomSheetStateC) | ((i2 & 7168) == 2048);
            Object objG6 = composerImplV.G();
            if (zI3 || objG6 == composer$Companion$Empty$1) {
                objG6 = new IdVerificationBottomSheetKt$IdVerificationBottomSheet$4$1(modalBottomSheetStateC, function03, mutableState, null);
                composerImplV.A(objG6);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, boolValueOf, (Function2) objG6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new k(idVerificationBottomSheet, function0, function02, function03, i);
        }
    }

    public static final void c(String str, String str2, String str3, String str4, String str5, String str6, Function0 function0, Function0 function02, Composer composer, int i, int i2) {
        String str7;
        int i3;
        Function0 function03;
        int i4;
        Function0 function04;
        int i5;
        Function0 function05;
        Function0 function06;
        float f;
        Modifier.Companion companion;
        Function0 function07;
        boolean z;
        Function0 function08;
        Function0 function09;
        ComposerImpl composerImplV = composer.v(-86789177);
        if ((i & 6) == 0) {
            str7 = str;
            i3 = (composerImplV.n(str7) ? 4 : 2) | i;
        } else {
            str7 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(str2) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.n(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.n(str5) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerImplV.n(str6) ? 131072 : 65536;
        }
        int i6 = i2 & 64;
        if (i6 != 0) {
            i4 = i3 | 1572864;
            function03 = function0;
        } else {
            function03 = function0;
            i4 = i3 | (composerImplV.I(function03) ? 1048576 : 524288);
        }
        int i7 = i2 & 128;
        if (i7 != 0) {
            i5 = i4 | 12582912;
            function04 = function02;
        } else {
            function04 = function02;
            i5 = i4 | (composerImplV.I(function04) ? 8388608 : 4194304);
        }
        int i8 = i5;
        if ((i8 & 4793363) == 4793362 && composerImplV.c()) {
            composerImplV.j();
            function09 = function04;
        } else {
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (i6 != 0) {
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == composer$Companion$Empty$1) {
                    objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                    composerImplV.A(objG);
                }
                function05 = (Function0) objG;
                composerImplV.V(false);
            } else {
                function05 = function03;
            }
            if (i7 != 0) {
                composerImplV.o(1849434622);
                Object objG2 = composerImplV.G();
                if (objG2 == composer$Companion$Empty$1) {
                    objG2 = new au.com.woolworths.android.onesite.deeplink.h(20);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                function06 = (Function0) objG2;
            } else {
                function06 = function04;
            }
            Modifier.Companion companion2 = Modifier.Companion.d;
            float f2 = 16;
            Modifier modifierF = PaddingKt.f(SizeKt.e(companion2, 1.0f), f2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i9 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
            ComposeUiNode.e3.getClass();
            Function0 function010 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function010);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i9))) {
                androidx.camera.core.impl.b.B(i9, composerImplV, i9, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            boolean zBooleanValue = ((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue();
            BiasAlignment.Horizontal horizontal = Alignment.Companion.n;
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
            if (zBooleanValue) {
                composerImplV.o(-632138299);
                f = 1.0f;
                ImageKt.a(new ColorPainter(WxTheme.a(composerImplV).f()), null, columnScopeInstance.b(SizeKt.k(companion2, 80), horizontal), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 48, 120);
                composerImplV.V(false);
            } else {
                f = 1.0f;
                composerImplV.o(-631830376);
                if (str2 != null) {
                    ImageRequest.Builder builder = new ImageRequest.Builder((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
                    builder.c = str2;
                    SingletonAsyncImageKt.a(builder.a(), null, columnScopeInstance.b(SizeKt.k(companion2, 80), horizontal), null, null, composerImplV, 48, 2040);
                }
                composerImplV.V(false);
            }
            SpacerKt.a(composerImplV, SizeKt.g(companion2, f2));
            TextKt.b(str7, SizeKt.e(companion2, f), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).i, composerImplV, (i8 & 14) | 48, 0, 65020);
            SpacerKt.a(composerImplV, SizeKt.g(companion2, 8));
            TextKt.b(str4, SizeKt.e(companion2, f), WxTheme.a(composerImplV).f(), 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, ((i8 >> 9) & 14) | 48, 0, 65016);
            SpacerKt.a(composerImplV, SizeKt.g(companion2, 32));
            composerImplV.o(-990179200);
            if (str5 == null) {
                companion = companion2;
                function07 = function05;
            } else {
                companion = companion2;
                int i10 = i8 >> 12;
                Function0 function011 = function05;
                a(str5, SizeKt.e(companion, f), function011, ComposableSingletons$IdVerificationBottomSheetKt.b, composerImplV, (i10 & 14) | 3120 | (i10 & 896));
                function07 = function011;
            }
            composerImplV.V(false);
            composerImplV.o(-990164876);
            if (str6 == null) {
                z = false;
                function08 = function06;
            } else {
                z = false;
                function08 = function06;
                SecondaryButtonKt.b(str6, function08, SizeKt.e(companion, f), false, false, null, null, composerImplV, ((i8 >> 15) & 14) | KyberEngine.KyberPolyBytes | ((i8 >> 18) & 112), 120);
                composerImplV = composerImplV;
            }
            composerImplV.V(z);
            composerImplV.V(true);
            function09 = function08;
            function03 = function07;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.modeselector.ui.e(str, str2, str3, str4, str5, str6, function03, function09, i, i2);
        }
    }

    public static final void d(CheckoutContentFragment checkoutContentFragment, final IdVerificationBottomSheet data, final au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.b bVar, final au.com.woolworths.product.details.d dVar) {
        Intrinsics.h(data, "data");
        View viewFindViewById = checkoutContentFragment.requireActivity().findViewById(R.id.content);
        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        final ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        Context context = viewGroup.getContext();
        Intrinsics.g(context, "getContext(...)");
        final ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.IdVerificationBottomSheetKt$showIdVerificationBottomSheet$composeView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ComposeView composeView2 = composeView;
                    final au.com.woolworths.product.details.d dVar2 = dVar;
                    final IdVerificationBottomSheet idVerificationBottomSheet = data;
                    final au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.b bVar2 = bVar;
                    final ViewGroup viewGroup2 = viewGroup;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-1145386742, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.IdVerificationBottomSheetKt$showIdVerificationBottomSheet$composeView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(-1746271574);
                                final au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.b bVar3 = bVar2;
                                boolean zN = composer2.n(bVar3);
                                final ViewGroup viewGroup3 = viewGroup2;
                                boolean zI = zN | composer2.I(viewGroup3);
                                final ComposeView composeView3 = composeView2;
                                boolean zI2 = zI | composer2.I(composeView3);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI2 || objG == composer$Companion$Empty$1) {
                                    final int i = 0;
                                    objG = new Function0() { // from class: au.com.woolworths.shop.checkout.ui.compose.l
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i) {
                                                case 0:
                                                    ((au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.b) bVar3).invoke(new IdVerificationBottomSheetKt$showIdVerificationBottomSheet$composeView$1$1$1$1$1$1(viewGroup3, composeView3));
                                                    break;
                                                default:
                                                    ((au.com.woolworths.product.details.d) bVar3).invoke(new IdVerificationBottomSheetKt$showIdVerificationBottomSheet$composeView$1$1$1$2$1$1(viewGroup3, composeView3));
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer2.l();
                                composer2.o(-1746271574);
                                final au.com.woolworths.product.details.d dVar3 = dVar2;
                                boolean zN2 = composer2.n(dVar3) | composer2.I(viewGroup3) | composer2.I(composeView3);
                                Object objG2 = composer2.G();
                                if (zN2 || objG2 == composer$Companion$Empty$1) {
                                    final int i2 = 1;
                                    objG2 = new Function0() { // from class: au.com.woolworths.shop.checkout.ui.compose.l
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i2) {
                                                case 0:
                                                    ((au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.b) dVar3).invoke(new IdVerificationBottomSheetKt$showIdVerificationBottomSheet$composeView$1$1$1$1$1$1(viewGroup3, composeView3));
                                                    break;
                                                default:
                                                    ((au.com.woolworths.product.details.d) dVar3).invoke(new IdVerificationBottomSheetKt$showIdVerificationBottomSheet$composeView$1$1$1$2$1$1(viewGroup3, composeView3));
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG2);
                                }
                                Function0 function02 = (Function0) objG2;
                                composer2.l();
                                composer2.o(-1633490746);
                                boolean zI3 = composer2.I(viewGroup3) | composer2.I(composeView3);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    objG3 = new IdVerificationBottomSheetKt$showIdVerificationBottomSheet$composeView$1$1$1$3$1(viewGroup3, composeView3);
                                    composer2.A(objG3);
                                }
                                composer2.l();
                                IdVerificationBottomSheetKt.b(idVerificationBottomSheet, function0, function02, (Function0) ((KFunction) objG3), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -19321150));
        viewGroup.addView(composeView);
    }
}
