package au.com.woolworths.foundation.shop.instore.presence.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.fragment.app.FragmentActivity;
import au.com.woolworths.design.wx.component.bottomsheet.ModalBottomSheetLayoutKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.button.SecondaryButtonKt;
import au.com.woolworths.design.wx.component.button.TertiaryButtonKt;
import au.com.woolworths.design.wx.foundation.TextColors;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.k;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.n;
import au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePrompt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0016\u0010\u0002\"\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0012\u0004\u0012\u00020\u00010\u0000¨\u0006\u0005²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "", "InstorePromptHideCallback", "", "isSheetOpened", "instore-presence_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class InstorePresencePromptBottomSheetKt {
    public static final void a(String str, Function0 onChangeToInstoreModeClick, Function0 onMaybeLaterClick, Function0 onNeverAgainClick, Composer composer, int i) {
        int i2;
        Intrinsics.h(onChangeToInstoreModeClick, "onChangeToInstoreModeClick");
        Intrinsics.h(onMaybeLaterClick, "onMaybeLaterClick");
        Intrinsics.h(onNeverAgainClick, "onNeverAgainClick");
        ComposerImpl composerImplV = composer.v(-342929499);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onChangeToInstoreModeClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onMaybeLaterClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onNeverAgainClick) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 16;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierI = PaddingKt.i(companion, f, 20, f, f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierI);
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
            c(StringResources_androidKt.c(composerImplV, R.string.location_prompt_enjoy_features), str, onChangeToInstoreModeClick, onMaybeLaterClick, composerImplV, (i3 << 3) & 8176);
            float f2 = 22;
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.location_prompt_access_again), PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), TextColors.b, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).r, composerImplV, 48, 0, 65016);
            TertiaryButtonKt.a(StringResources_androidKt.c(composerImplV, R.string.location_prompt_not_again), onNeverAgainClick, SizeKt.e(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 1.0f), false, false, null, null, composerImplV, ((i3 >> 6) & 112) | KyberEngine.KyberPolyBytes, 120);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(str, onChangeToInstoreModeClick, onMaybeLaterClick, onNeverAgainClick, i, 0);
        }
    }

    public static final void b(final Function0 function0, final ComposableLambdaImpl composableLambdaImpl, final ModalBottomSheetState modalBottomSheetState, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(1783525086);
        if ((((composerImplV.I(function0) ? 4 : 2) | i | (composerImplV.I(composableLambdaImpl) ? 32 : 16) | (composerImplV.I(modalBottomSheetState) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-1100260570, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptBottomSheetKt$PromptBottomSheet$1
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
                        composer2.o(1849434622);
                        Object objG2 = composer2.G();
                        if (objG2 == obj3) {
                            objG2 = SnapshotStateKt.f(Boolean.FALSE);
                            composer2.A(objG2);
                        }
                        final MutableState mutableState = (MutableState) objG2;
                        composer2.l();
                        composer2.o(-1633490746);
                        boolean zI = composer2.I(coroutineScope);
                        final ModalBottomSheetState modalBottomSheetState2 = modalBottomSheetState;
                        boolean zI2 = zI | composer2.I(modalBottomSheetState2);
                        Object objG3 = composer2.G();
                        if (zI2 || objG3 == obj3) {
                            objG3 = new d(1, coroutineScope, modalBottomSheetState2);
                            composer2.A(objG3);
                        }
                        final Function0 function02 = (Function0) objG3;
                        composer2.l();
                        composer2.o(-1746271574);
                        boolean zI3 = composer2.I(coroutineScope) | composer2.I(modalBottomSheetState2);
                        Object objG4 = composer2.G();
                        if (zI3 || objG4 == obj3) {
                            objG4 = new Function1() { // from class: au.com.woolworths.foundation.shop.instore.presence.presentation.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    LayoutCoordinates it = (LayoutCoordinates) obj4;
                                    Intrinsics.h(it, "it");
                                    mutableState.setValue(Boolean.TRUE);
                                    BuildersKt.c(coroutineScope, null, null, new InstorePresencePromptBottomSheetKt$PromptBottomSheet$1$1$1$1(modalBottomSheetState2, null), 3);
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG4);
                        }
                        composer2.l();
                        Modifier modifierA = OnPlacedModifierKt.a(Modifier.Companion.d, (Function1) objG4);
                        final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                        ModalBottomSheetLayoutKt.a(ComposableLambdaKt.c(476022328, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptBottomSheetKt$PromptBottomSheet$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                ColumnScope ModalBottomSheetLayout = (ColumnScope) obj4;
                                Composer composer3 = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    composableLambdaImpl2.invoke(function02, composer3, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), modifierA, modalBottomSheetState, BitmapDescriptorFactory.HUE_RED, 0L, 0L, false, ComposableSingletons$InstorePresencePromptBottomSheetKt.f8749a, composer2, 12583430, 120);
                        composer2.o(5004770);
                        boolean zN = composer2.n(function02);
                        Object objG5 = composer2.G();
                        if (zN || objG5 == obj3) {
                            objG5 = new k(17, function02);
                            composer2.A(objG5);
                        }
                        composer2.l();
                        BackHandlerKt.a(false, (Function0) objG5, composer2, 0, 1);
                        Boolean boolValueOf = Boolean.valueOf(modalBottomSheetState2.d());
                        composer2.o(-1746271574);
                        boolean zI4 = composer2.I(modalBottomSheetState2);
                        Function0 function03 = function0;
                        boolean zN2 = zI4 | composer2.n(function03);
                        Object objG6 = composer2.G();
                        if (zN2 || objG6 == obj3) {
                            objG6 = new InstorePresencePromptBottomSheetKt$PromptBottomSheet$1$4$1(modalBottomSheetState2, function03, mutableState, null);
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
            recomposeScopeImplX.d = new Function2(composableLambdaImpl, modalBottomSheetState, i) { // from class: au.com.woolworths.foundation.shop.instore.presence.presentation.c
                public final /* synthetic */ ComposableLambdaImpl e;
                public final /* synthetic */ ModalBottomSheetState f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(513);
                    InstorePresencePromptBottomSheetKt.b(this.d, this.e, this.f, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(String str, String str2, Function0 function0, Function0 function02, Composer composer, int i) {
        String str3;
        int i2;
        String str4;
        ComposerImpl composerImplV = composer.v(679250992);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (composerImplV.n(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= composerImplV.n(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function02) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a(25);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = SemanticsModifierKt.b(companion, true, (Function1) objG);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
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
            ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_instore_wapple, 0, composerImplV), StringResources_androidKt.c(composerImplV, R.string.woolworths_icon_description), null, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 0, 124);
            float f = 8;
            TextKt.b(str3, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).v, composerImplV, (i2 & 14) | 48, 0, 65532);
            int i4 = i2 >> 3;
            TextKt.b(str4, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).w, composerImplV, (i4 & 14) | 48, 0, 65532);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.location_prompt_change_to_in_store), PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), TextColors.b, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).l, composerImplV, 48, 0, 65016);
            composerImplV.V(true);
            PrimaryButtonKt.a(StringResources_androidKt.c(composerImplV, R.string.location_prompt_yes_please), function0, SizeKt.e(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 32, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 1.0f), false, false, null, null, null, null, composerImplV, (i4 & 112) | KyberEngine.KyberPolyBytes, 1016);
            composerImplV = composerImplV;
            SecondaryButtonKt.b(StringResources_androidKt.c(composerImplV, R.string.location_prompt_maybe_later), function02, SizeKt.e(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 1.0f), false, false, null, null, composerImplV, ((i2 >> 6) & 112) | KyberEngine.KyberPolyBytes, 120);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new n(str, str2, function0, function02, i, 1);
        }
    }

    public static final void d(String str, Function0 onSwitchStoreClick, Function0 onMaybeLaterClick, Composer composer, int i) {
        int i2;
        Intrinsics.h(onSwitchStoreClick, "onSwitchStoreClick");
        Intrinsics.h(onMaybeLaterClick, "onMaybeLaterClick");
        ComposerImpl composerImplV = composer.v(2044960795);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onSwitchStoreClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onMaybeLaterClick) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 16;
            Modifier modifierI = PaddingKt.i(Modifier.Companion.d, f, 20, f, f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierI);
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
            c(StringResources_androidKt.c(composerImplV, R.string.location_prompt_looks_like), str, onSwitchStoreClick, onMaybeLaterClick, composerImplV, (i2 << 3) & 8176);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(i, 5, str, onSwitchStoreClick, onMaybeLaterClick, false);
        }
    }

    public static final Function0 e(final ViewGroup viewGroup, final ComposableLambdaImpl composableLambdaImpl, a aVar, final a aVar2) {
        final View childAt = viewGroup.getChildAt(0);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Context context = viewGroup.getContext();
        Intrinsics.g(context, "getContext(...)");
        final ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptBottomSheetKt$showBottomSheet$composeChildView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    ModalBottomSheetState modalBottomSheetStateC = ModalBottomSheetKt.c(ModalBottomSheetValue.d, null, composer, 3078, 6);
                    composer.o(-1224400529);
                    ViewGroup viewGroup2 = viewGroup;
                    boolean zI = composer.I(viewGroup2);
                    ComposeView composeView2 = composeView;
                    boolean zI2 = zI | composer.I(composeView2);
                    View view = childAt;
                    boolean zI3 = zI2 | composer.I(view);
                    a aVar3 = aVar2;
                    boolean zN = zI3 | composer.n(aVar3);
                    Object objG = composer.G();
                    if (zN || objG == Composer.Companion.f1624a) {
                        androidx.work.impl.utils.b bVar = new androidx.work.impl.utils.b(viewGroup2, composeView2, view, aVar3, 8);
                        composer.A(bVar);
                        objG = bVar;
                    }
                    Function0 function0 = (Function0) objG;
                    composer.l();
                    objectRef.d = function0;
                    if (function0 == null) {
                        Intrinsics.p("hideCallback");
                        throw null;
                    }
                    InstorePresencePromptBottomSheetKt.b(function0, composableLambdaImpl, modalBottomSheetStateC, composer, 512);
                }
                return Unit.f24250a;
            }
        }, true, 561053251));
        viewGroup.addView(composeView);
        childAt.setImportantForAccessibility(4);
        aVar.invoke();
        Object obj = objectRef.d;
        if (obj != null) {
            return (Function0) obj;
        }
        Intrinsics.p("hideCallback");
        throw null;
    }

    public static final Function0 f(FragmentActivity fragmentActivity, InstorePresencePrompt instorePresencePrompt, InstorePresencePromptClickHandler clickHandler) {
        Intrinsics.h(clickHandler, "clickHandler");
        final a aVar = new a(clickHandler, instorePresencePrompt, 0);
        final a aVar2 = new a(clickHandler, instorePresencePrompt, 1);
        final a aVar3 = new a(clickHandler, instorePresencePrompt, 2);
        a aVar4 = new a(clickHandler, instorePresencePrompt, 3);
        a aVar5 = new a(clickHandler, instorePresencePrompt, 4);
        View viewFindViewById = fragmentActivity.findViewById(android.R.id.content);
        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        if (instorePresencePrompt instanceof InstorePresencePrompt.PromptSwitchToInstoreMode) {
            final String name = ((InstorePresencePrompt.PromptSwitchToInstoreMode) instorePresencePrompt).b.getName();
            Intrinsics.g(name, "getName(...)");
            return e(viewGroup, new ComposableLambdaImpl(new Function3<Function0<? extends Job>, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptBottomSheetKt$showSwitchToInstoreModeBottomSheet$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Function0 doHideSheet = (Function0) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(doHideSheet, "doHideSheet");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer.I(doHideSheet) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer.c()) {
                        composer.j();
                    } else {
                        composer.o(-1633490746);
                        a aVar6 = aVar;
                        int i = iIntValue & 14;
                        boolean zN = composer.n(aVar6) | (i == 4);
                        Object objG = composer.G();
                        Object obj4 = Composer.Companion.f1624a;
                        if (zN || objG == obj4) {
                            objG = new f(aVar6, doHideSheet, 1);
                            composer.A(objG);
                        }
                        Function0 function0 = (Function0) objG;
                        composer.l();
                        composer.o(-1633490746);
                        a aVar7 = aVar2;
                        boolean zN2 = composer.n(aVar7) | (i == 4);
                        Object objG2 = composer.G();
                        if (zN2 || objG2 == obj4) {
                            objG2 = new g(aVar7, doHideSheet, 1);
                            composer.A(objG2);
                        }
                        Function0 function02 = (Function0) objG2;
                        composer.l();
                        composer.o(-1633490746);
                        Object obj5 = aVar3;
                        boolean zN3 = composer.n(obj5) | (i == 4);
                        Object objG3 = composer.G();
                        if (zN3 || objG3 == obj4) {
                            objG3 = new d(2, obj5, doHideSheet);
                            composer.A(objG3);
                        }
                        composer.l();
                        InstorePresencePromptBottomSheetKt.a(name, function0, function02, (Function0) objG3, composer, 0);
                    }
                    return Unit.f24250a;
                }
            }, true, 21173223), aVar4, aVar5);
        }
        if (!(instorePresencePrompt instanceof InstorePresencePrompt.PromptSwitchStore)) {
            throw new NoWhenBranchMatchedException();
        }
        final String name2 = ((InstorePresencePrompt.PromptSwitchStore) instorePresencePrompt).b.getName();
        Intrinsics.g(name2, "getName(...)");
        return e(viewGroup, new ComposableLambdaImpl(new Function3<Function0<? extends Job>, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptBottomSheetKt$showSwitchStoreBottomSheet$1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Function0 doHideSheet = (Function0) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                Intrinsics.h(doHideSheet, "doHideSheet");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= composer.I(doHideSheet) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && composer.c()) {
                    composer.j();
                } else {
                    composer.o(-1633490746);
                    a aVar6 = aVar;
                    int i = iIntValue & 14;
                    boolean zN = composer.n(aVar6) | (i == 4);
                    Object objG = composer.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (zN || objG == composer$Companion$Empty$1) {
                        objG = new f(aVar6, doHideSheet, 0);
                        composer.A(objG);
                    }
                    Function0 function0 = (Function0) objG;
                    composer.l();
                    composer.o(-1633490746);
                    a aVar7 = aVar2;
                    boolean zN2 = composer.n(aVar7) | (i == 4);
                    Object objG2 = composer.G();
                    if (zN2 || objG2 == composer$Companion$Empty$1) {
                        objG2 = new g(aVar7, doHideSheet, 0);
                        composer.A(objG2);
                    }
                    composer.l();
                    InstorePresencePromptBottomSheetKt.d(name2, function0, (Function0) objG2, composer, 0);
                }
                return Unit.f24250a;
            }
        }, true, -2042007850), aVar4, aVar5);
    }
}
