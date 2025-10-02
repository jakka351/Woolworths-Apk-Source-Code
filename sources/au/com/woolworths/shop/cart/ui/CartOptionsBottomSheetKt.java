package au.com.woolworths.shop.cart.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
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
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnPlacedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import au.com.woolworths.design.wx.component.bottomsheet.ModalBottomSheetLayoutKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.f;
import au.com.woolworths.shop.cart.ui.cart.CartContract;
import au.com.woolworths.shop.cart.ui.cart.CartViewModel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isSheetOpened", "shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartOptionsBottomSheetKt {
    public static final void a(final boolean z, final String str, final au.com.woolworths.shop.cart.ui.cart.a aVar, final String str2, final au.com.woolworths.shop.cart.ui.cart.a aVar2, final Function0 function0, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1918209461);
        if (((i | (composerImplV.p(z) ? 4 : 2) | (composerImplV.n(str) ? 32 : 16) | (composerImplV.I(aVar) ? 256 : 128) | (composerImplV.n(str2) ? 2048 : 1024) | (composerImplV.I(aVar2) ? 16384 : 8192) | (composerImplV.I(function0) ? 131072 : 65536)) & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(266760189, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.CartOptionsBottomSheetKt$CartOptionsBottomSheet$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Object objG = composer2.G();
                        Object obj3 = Composer.Companion.f1624a;
                        if (objG == obj3) {
                            objG = android.support.v4.media.session.a.i(composer2.y(), composer2);
                        }
                        final CoroutineScope coroutineScope = (CoroutineScope) objG;
                        final ModalBottomSheetState modalBottomSheetStateC = ModalBottomSheetKt.c(ModalBottomSheetValue.d, null, composer2, 6, 14);
                        composer2.o(1849434622);
                        Object objG2 = composer2.G();
                        if (objG2 == obj3) {
                            objG2 = SnapshotStateKt.f(Boolean.FALSE);
                            composer2.A(objG2);
                        }
                        final MutableState mutableState = (MutableState) objG2;
                        composer2.l();
                        composer2.o(-1633490746);
                        boolean zI = composer2.I(coroutineScope) | composer2.I(modalBottomSheetStateC);
                        Object objG3 = composer2.G();
                        if (zI || objG3 == obj3) {
                            objG3 = new a(0, coroutineScope, modalBottomSheetStateC);
                            composer2.A(objG3);
                        }
                        final Function0 function02 = (Function0) objG3;
                        composer2.l();
                        composer2.o(-1746271574);
                        boolean zI2 = composer2.I(coroutineScope) | composer2.I(modalBottomSheetStateC);
                        Object objG4 = composer2.G();
                        if (zI2 || objG4 == obj3) {
                            objG4 = new Function1() { // from class: au.com.woolworths.shop.cart.ui.b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    LayoutCoordinates it = (LayoutCoordinates) obj4;
                                    Intrinsics.h(it, "it");
                                    mutableState.setValue(Boolean.TRUE);
                                    BuildersKt.c(coroutineScope, null, null, new CartOptionsBottomSheetKt$CartOptionsBottomSheet$1$1$1$1(modalBottomSheetStateC, null), 3);
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG4);
                        }
                        composer2.l();
                        Modifier modifierA = OnPlacedModifierKt.a(Modifier.Companion.d, (Function1) objG4);
                        final String str3 = str2;
                        final au.com.woolworths.shop.cart.ui.cart.a aVar3 = aVar2;
                        final au.com.woolworths.shop.cart.ui.cart.a aVar4 = aVar;
                        final String str4 = str;
                        final boolean z2 = z;
                        ModalBottomSheetLayoutKt.a(ComposableLambdaKt.c(812357775, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.CartOptionsBottomSheetKt$CartOptionsBottomSheet$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                ColumnScope ModalBottomSheetLayout = (ColumnScope) obj4;
                                Composer composer3 = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    composer3.o(-1633490746);
                                    au.com.woolworths.shop.cart.ui.cart.a aVar5 = aVar4;
                                    boolean zN = composer3.n(aVar5);
                                    Function0 function03 = function02;
                                    boolean zN2 = zN | composer3.n(function03);
                                    Object objG5 = composer3.G();
                                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                    if (zN2 || objG5 == composer$Companion$Empty$1) {
                                        objG5 = new a(1, aVar5, function03);
                                        composer3.A(objG5);
                                    }
                                    Function0 function04 = (Function0) objG5;
                                    composer3.l();
                                    composer3.o(-1633490746);
                                    au.com.woolworths.shop.cart.ui.cart.a aVar6 = aVar3;
                                    boolean zN3 = composer3.n(aVar6) | composer3.n(function03);
                                    Object objG6 = composer3.G();
                                    if (zN3 || objG6 == composer$Companion$Empty$1) {
                                        objG6 = new a(2, aVar6, function03);
                                        composer3.A(objG6);
                                    }
                                    composer3.l();
                                    CartOptionsBottomSheetKt.b(z2, str4, function04, str3, (Function0) objG6, composer3, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), modifierA, modalBottomSheetStateC, BitmapDescriptorFactory.HUE_RED, 0L, 0L, false, ComposableSingletons$CartOptionsBottomSheetKt.f10455a, composer2, 12583430, 120);
                        composer2.o(5004770);
                        boolean zN = composer2.n(function02);
                        Object objG5 = composer2.G();
                        if (zN || objG5 == obj3) {
                            objG5 = new f(11, function02);
                            composer2.A(objG5);
                        }
                        composer2.l();
                        BackHandlerKt.a(false, (Function0) objG5, composer2, 0, 1);
                        Boolean boolValueOf = Boolean.valueOf(modalBottomSheetStateC.d());
                        composer2.o(-1746271574);
                        boolean zI3 = composer2.I(modalBottomSheetStateC);
                        Function0 function03 = function0;
                        boolean zN2 = zI3 | composer2.n(function03);
                        Object objG6 = composer2.G();
                        if (zN2 || objG6 == obj3) {
                            objG6 = new CartOptionsBottomSheetKt$CartOptionsBottomSheet$1$4$1(modalBottomSheetStateC, function03, mutableState, null);
                            composer2.A(objG6);
                        }
                        composer2.l();
                        EffectsKt.e(composer2, boolValueOf, (Function2) objG6);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.loadingbutton.a(z, str, aVar, str2, aVar2, function0, i);
        }
    }

    public static final void b(boolean z, String str, Function0 function0, String str2, Function0 function02, Composer composer, int i) {
        int i2;
        String str3;
        ComposerImpl composerImplV = composer.v(1944973462);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function02) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            str3 = str2;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, WindowInsetsKt.d(WindowInsets_androidKt.a(composerImplV), composerImplV).getD(), 7);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            d(i2 & 1022, composerImplV, str, function0, z);
            int i5 = i2 >> 6;
            int i6 = (i2 & 14) | (i5 & 112) | (i5 & 896);
            str3 = str2;
            c(i6, composerImplV, str3, function02, z);
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.a(z, str, function0, str3, function02, i);
        }
    }

    public static final void c(int i, Composer composer, String str, Function0 function0, boolean z) {
        int i2;
        long jD;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1051483522);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function0) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            if (z) {
                composerImplV.o(-1548941223);
                jD = WxTheme.a(composerImplV).c();
                composerImplV.V(false);
            } else {
                composerImplV.o(-1548892367);
                jD = WxTheme.a(composerImplV).d();
                composerImplV.V(false);
            }
            long j = jD;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierT = SizeKt.t(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 56, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            composerImplV.o(5004770);
            boolean z2 = (i2 & 896) == 256;
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                objG = new f(10, function0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierA = TestTagKt.a(ClickableKt.d(modifierT, z, null, null, (Function0) objG, 6), "cart remove all items");
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            float f = 16;
            SpacerKt.a(composerImplV, SizeKt.u(companion, f));
            IconKt.b(VectorResources_androidKt.b(R.drawable.ic_trash, 6, composerImplV), null, SizeKt.q(companion, 20), j, composerImplV, 432, 0);
            SpacerKt.a(composerImplV, SizeKt.u(companion, f));
            TextKt.b(str, null, j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).l, composerImplV, (i2 >> 3) & 14, 0, 65530);
            composerImpl = composerImplV;
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.b(z, str, function0, i, 2);
        }
    }

    public static final void d(int i, Composer composer, String str, Function0 function0, boolean z) {
        int i2;
        long jD;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(72957418);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function0) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            if (z) {
                composerImplV.o(221157837);
                jD = WxTheme.a(composerImplV).c();
                composerImplV.V(false);
            } else {
                composerImplV.o(221206693);
                jD = WxTheme.a(composerImplV).d();
                composerImplV.V(false);
            }
            long j = jD;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierT = SizeKt.t(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 56, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            composerImplV.o(5004770);
            boolean z2 = (i2 & 896) == 256;
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                objG = new f(9, function0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierD = ClickableKt.d(modifierT, z, null, null, (Function0) objG, 6);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierD);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD2, ComposeUiNode.Companion.d);
            float f = 16;
            SpacerKt.a(composerImplV, SizeKt.u(companion, f));
            IconKt.b(VectorResources_androidKt.b(R.drawable.ic_copy_filled, 6, composerImplV), null, SizeKt.q(companion, 20), j, composerImplV, 432, 0);
            SpacerKt.a(composerImplV, SizeKt.u(companion, f));
            TextKt.b(str, null, j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).l, composerImplV, (i2 >> 3) & 14, 0, 65530);
            composerImpl = composerImplV;
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.b(z, str, function0, i, 1);
        }
    }

    public static final void e(Fragment fragment2, final boolean z, final String str, final au.com.woolworths.shop.cart.ui.cart.a aVar, final String str2, final au.com.woolworths.shop.cart.ui.cart.a aVar2) {
        View viewFindViewById = fragment2.requireActivity().findViewById(android.R.id.content);
        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        final ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        Context context = viewGroup.getContext();
        Intrinsics.g(context, "getContext(...)");
        final ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.CartOptionsBottomSheetKt$showCartOptionsBottomSheet$composeView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    ViewModelStoreOwner viewModelStoreOwnerA = LocalViewModelStoreOwner.a(composer);
                    if (viewModelStoreOwnerA == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    boolean z2 = (z && ((CartContract.ViewState) SnapshotStateKt.a(((CartViewModel) ViewModelKt.a(viewModelStoreOwnerA, Reflection.f24268a.b(CartViewModel.class), null, viewModelStoreOwnerA instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.Empty.b)).o, composer).getD()).f10490a) ? false : true;
                    composer.o(-1633490746);
                    ViewGroup viewGroup2 = viewGroup;
                    boolean zI = composer.I(viewGroup2);
                    ComposeView composeView2 = composeView;
                    boolean zI2 = zI | composer.I(composeView2);
                    Object objG = composer.G();
                    if (zI2 || objG == Composer.Companion.f1624a) {
                        objG = new a(3, viewGroup2, composeView2);
                        composer.A(objG);
                    }
                    composer.l();
                    CartOptionsBottomSheetKt.a(z2, str, aVar, str2, aVar2, (Function0) objG, composer, 0);
                }
                return Unit.f24250a;
            }
        }, true, -1118022064));
        viewGroup.addView(composeView);
    }
}
