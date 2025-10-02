package au.com.woolworths.shop.lists.ui.snapalist.main;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.compose.utils.preview.PermissionKt;
import au.com.woolworths.design.core.ui.component.experimental.dialog.AlertDialogKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.compose.productfinder.g;
import au.com.woolworths.shop.lists.ui.lottie.CircleAndLoaderLottieKt;
import au.com.woolworths.shop.lists.ui.lottie.GlowLottieKt;
import au.com.woolworths.shop.lists.ui.lottie.StarBurstLottieKt;
import au.com.woolworths.shop.lists.ui.snapalist.dialog.DialogType;
import au.com.woolworths.shop.lists.ui.snapalist.dialog.NoPermissionDialogKt;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract;
import au.com.woolworths.shop.lists.ui.snapalist.ui.SnapAListLoopedLottieKt;
import au.com.woolworths.shop.lists.ui.utils.BitmapRenderer;
import com.google.accompanist.permissions.PermissionState;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProcessorScreenKt {
    public static final void a(DialogType dialogType, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1999717568);
        int i2 = (composerImplV.n(dialogType) ? 4 : 2) | i | (composerImplV.I(function0) ? 2048 : 1024) | (composerImplV.I(function02) ? 16384 : 8192);
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (!(dialogType instanceof DialogType.NoPermissionDialog)) {
                throw new NoWhenBranchMatchedException();
            }
            composerImplV.o(-1633490746);
            boolean z = (i2 & 7168) == 2048;
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z || objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.shop.inbox.ui.b(function1, function0, 2);
                composerImplV.A(objG);
            }
            Function0 function03 = (Function0) objG;
            composerImplV.V(false);
            composerImplV.o(-1633490746);
            boolean z2 = (i2 & 57344) == 16384;
            Object objG2 = composerImplV.G();
            if (z2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.feature.shop.inbox.ui.b(function12, function02, 3);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            NoPermissionDialogKt.a(0, composerImplV, null, function03, (Function0) objG2);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(dialogType, function1, function12, function0, function02, i, 16);
        }
    }

    public static final void b(ProcessorContract.ViewState viewState, final byte[] bitmapByteArray, final ProcessorContract.Listener listener, Function0 onDialogDismissButtonClick, Composer composer, int i) {
        boolean z;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(bitmapByteArray, "bitmapByteArray");
        Intrinsics.h(onDialogDismissButtonClick, "onDialogDismissButtonClick");
        ComposerImpl composerImplV = composer.v(2121240281);
        int i2 = (composerImplV.n(viewState) ? 4 : 2) | i | (composerImplV.I(bitmapByteArray) ? 32 : 16) | (composerImplV.n(listener) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onDialogDismissButtonClick) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = SnapshotStateKt.f(null);
                composerImplV.A(objG);
            }
            final MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            composerImplV.o(-1746271574);
            int i3 = i2 & 896;
            boolean zI = (i3 == 256) | composerImplV.I(context);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == obj) {
                objG2 = new au.com.woolworths.foundation.shop.olive.voice.ui.a(listener, context, mutableState);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            PermissionState permissionStateA = PermissionKt.a("android.permission.CAMERA", (Function1) objG2, composerImplV, 0);
            Boolean boolValueOf = Boolean.valueOf(viewState.b);
            composerImplV.o(-1746271574);
            boolean zN = ((i2 & 14) == 4) | composerImplV.n(permissionStateA) | (i3 == 256);
            Object objG3 = composerImplV.G();
            if (zN || objG3 == obj) {
                objG3 = new ProcessorScreenKt$ProcessorScreen$1$1(viewState, permissionStateA, listener, null);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, boolValueOf, (Function2) objG3);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, Modifier.Companion.d);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            DialogType dialogType = (DialogType) mutableState.getD();
            composerImplV.o(337462014);
            if (dialogType == null) {
                z = false;
            } else {
                composerImplV.o(5004770);
                Object objG4 = composerImplV.G();
                if (objG4 == obj) {
                    final int i5 = 0;
                    objG4 = new Function1() { // from class: au.com.woolworths.shop.lists.ui.snapalist.main.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            DialogType it = (DialogType) obj2;
                            switch (i5) {
                                case 0:
                                    Intrinsics.h(it, "it");
                                    mutableState.setValue(null);
                                    break;
                                default:
                                    Intrinsics.h(it, "it");
                                    mutableState.setValue(null);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG4);
                }
                Function1 function1 = (Function1) objG4;
                Object objD = au.com.woolworths.android.onesite.a.d(5004770, composerImplV, false);
                if (objD == obj) {
                    final int i6 = 1;
                    objD = new Function1() { // from class: au.com.woolworths.shop.lists.ui.snapalist.main.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            DialogType it = (DialogType) obj2;
                            switch (i6) {
                                case 0:
                                    Intrinsics.h(it, "it");
                                    mutableState.setValue(null);
                                    break;
                                default:
                                    Intrinsics.h(it, "it");
                                    mutableState.setValue(null);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objD);
                }
                Function1 function12 = (Function1) objD;
                composerImplV.V(false);
                composerImplV.o(5004770);
                boolean z2 = i3 == 256;
                Object objG5 = composerImplV.G();
                if (z2 || objG5 == obj) {
                    objG5 = new e(listener, 0);
                    composerImplV.A(objG5);
                }
                Function0 function02 = (Function0) objG5;
                composerImplV.V(false);
                composerImplV.o(5004770);
                boolean z3 = i3 == 256;
                Object objG6 = composerImplV.G();
                if (z3 || objG6 == obj) {
                    objG6 = new e(listener, 1);
                    composerImplV.A(objG6);
                }
                z = false;
                composerImplV.V(false);
                a(dialogType, function1, function12, function02, (Function0) objG6, composerImplV, 432);
                composerImplV = composerImplV;
            }
            composerImplV.V(z);
            composerImplV.V(true);
            composerImplV.o(-1597488321);
            if (viewState.f12461a) {
                ComposerImpl composerImpl = composerImplV;
                ScaffoldKt.a(SizeKt.c, null, null, null, Color.j, null, ComposableLambdaKt.c(-181247823, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorScreenKt$ProcessorScreen$3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        PaddingValues it = (PaddingValues) obj2;
                        Composer composer2 = (Composer) obj3;
                        int iIntValue = ((Number) obj4).intValue();
                        Intrinsics.h(it, "it");
                        if ((iIntValue & 17) == 16 && composer2.c()) {
                            composer2.j();
                        } else {
                            composer2.o(5004770);
                            ProcessorContract.Listener listener2 = listener;
                            boolean zI2 = composer2.I(listener2);
                            Object objG7 = composer2.G();
                            if (zI2 || objG7 == Composer.Companion.f1624a) {
                                objG7 = new e(listener2, 2);
                                composer2.A(objG7);
                            }
                            composer2.l();
                            ProcessorScreenKt.c(bitmapByteArray, (Function0) objG7, composer2, 0);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImpl, 12607494, 110);
                composerImplV = composerImpl;
            }
            composerImplV.V(z);
            ProcessorContract.DialogMessage dialogMessage = viewState.c;
            if (dialogMessage != null) {
                AlertDialogKt.a(StringResources_androidKt.c(composerImplV, dialogMessage.f12460a), StringResources_androidKt.c(composerImplV, R.string.shop_lists_snap_error_cta), null, StringResources_androidKt.c(composerImplV, R.string.shop_lists_snap_error_title), null, null, onDialogDismissButtonClick, composerImplV, (i2 << 9) & 3670016, 52);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.instore.presence.presentation.b(viewState, bitmapByteArray, listener, onDialogDismissButtonClick, i);
        }
    }

    public static final void c(byte[] bArr, Function0 function0, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-135934886);
        int i2 = (composerImplV.I(bArr) ? 4 : 2) | i | (composerImplV.I(function0) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
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
            BitmapRenderer.f12485a.a(bArr, composerImplV, (i2 & 14) | 48);
            Modifier modifierB = BackgroundKt.b(fillElement, Color.b(Color.b, 0.7f), RectangleShapeKt.f1779a);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.e, Alignment.Companion.n, composerImplV, 54);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierB);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.shop_lists_snap_scanning_your_list), null, CoreTheme.b(composerImplV).e.d.c.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.f5121a.b, composerImplV, 0, 0, 65530);
            Modifier modifierQ = SizeKt.q(Modifier.Companion.d, 250);
            MeasurePolicy measurePolicyD2 = BoxKt.d(Alignment.Companion.e, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierQ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            GlowLottieKt.a(R.raw.ai_glow, 50, 48, composerImplV);
            StarBurstLottieKt.a(composerImplV, 0);
            CircleAndLoaderLottieKt.a(composerImplV, 0);
            SnapAListLoopedLottieKt.a(composerImplV, 0);
            composerImplV.V(true);
            ButtonKt.c(function0, null, false, null, null, null, null, null, ComposableSingletons$ProcessorScreenKt.f12456a, composerImplV, ((i2 >> 3) & 14) | 805306368, 510);
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(bArr, i, 24, function0);
        }
    }
}
