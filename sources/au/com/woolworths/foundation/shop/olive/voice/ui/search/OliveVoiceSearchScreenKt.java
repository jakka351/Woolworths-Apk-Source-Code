package au.com.woolworths.foundation.shop.olive.voice.ui.search;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceContract;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import au.com.woolworths.foundation.shop.olive.voice.ui.dialog.DialogType;
import au.com.woolworths.foundation.shop.olive.voice.ui.dialog.LanguageUnavailableDialogKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.dialog.NoDeviceLevelPermissionDialogKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.dialog.NoPermissionDialogKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.dialog.NoSupportedLanguageDialogKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isClosing", "", "failureCount", "olive-voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OliveVoiceSearchScreenKt {
    public static final void a(DialogType dialogType, final Function1 function1, final Function1 function12, final OliveVoiceViewModel oliveVoiceViewModel, Function0 function0, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-431973581);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(dialogType) : composerImplV.I(dialogType) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(oliveVoiceViewModel) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function0) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z = dialogType instanceof DialogType.NoPermissionDialog;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z) {
                composerImplV.o(-1202592838);
                composerImplV.o(-1633490746);
                boolean z2 = ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
                Object objG = composerImplV.G();
                if (z2 || objG == composer$Companion$Empty$1) {
                    final int i3 = 0;
                    objG = new Function0() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.search.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    function1.invoke(DialogType.NoPermissionDialog.f8841a);
                                    oliveVoiceViewModel.j.f(OliveVoiceContract.Action.OpenAppSettings.f8794a);
                                    break;
                                case 1:
                                    function1.invoke(DialogType.NoDeviceLevelPermissionDialog.f8840a);
                                    oliveVoiceViewModel.s6(VoiceSearchState.Idle.f8832a);
                                    break;
                                case 2:
                                    function1.invoke(DialogType.LanguageUnavailableDialog.f8839a);
                                    oliveVoiceViewModel.j.f(OliveVoiceContract.Action.OpenDeviceSettings.f8795a);
                                    break;
                                case 3:
                                    function1.invoke(DialogType.LanguageUnavailableDialog.f8839a);
                                    oliveVoiceViewModel.s6(VoiceSearchState.Idle.f8832a);
                                    break;
                                case 4:
                                    function1.invoke(DialogType.NoSupportedLanguageDialog.f8842a);
                                    oliveVoiceViewModel.j.f(OliveVoiceContract.Action.OpenDeviceSettings.f8795a);
                                    break;
                                default:
                                    function1.invoke(DialogType.NoSupportedLanguageDialog.f8842a);
                                    oliveVoiceViewModel.s6(VoiceSearchState.Idle.f8832a);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG);
                }
                Function0 function02 = (Function0) objG;
                composerImplV.V(false);
                composerImplV.o(-1633490746);
                boolean z3 = ((i2 & 896) == 256) | ((i2 & 57344) == 16384);
                Object objG2 = composerImplV.G();
                if (z3 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new au.com.woolworths.feature.shop.inbox.ui.b(function12, function0, 1);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                NoPermissionDialogKt.a(0, composerImplV, null, function02, (Function0) objG2);
                composerImplV.V(false);
            } else if (dialogType instanceof DialogType.NoDeviceLevelPermissionDialog) {
                composerImplV.o(-1201893230);
                composerImplV.o(-1633490746);
                boolean z4 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
                Object objG3 = composerImplV.G();
                if (z4 || objG3 == composer$Companion$Empty$1) {
                    final int i4 = 1;
                    objG3 = new Function0() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.search.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i4) {
                                case 0:
                                    function12.invoke(DialogType.NoPermissionDialog.f8841a);
                                    oliveVoiceViewModel.j.f(OliveVoiceContract.Action.OpenAppSettings.f8794a);
                                    break;
                                case 1:
                                    function12.invoke(DialogType.NoDeviceLevelPermissionDialog.f8840a);
                                    oliveVoiceViewModel.s6(VoiceSearchState.Idle.f8832a);
                                    break;
                                case 2:
                                    function12.invoke(DialogType.LanguageUnavailableDialog.f8839a);
                                    oliveVoiceViewModel.j.f(OliveVoiceContract.Action.OpenDeviceSettings.f8795a);
                                    break;
                                case 3:
                                    function12.invoke(DialogType.LanguageUnavailableDialog.f8839a);
                                    oliveVoiceViewModel.s6(VoiceSearchState.Idle.f8832a);
                                    break;
                                case 4:
                                    function12.invoke(DialogType.NoSupportedLanguageDialog.f8842a);
                                    oliveVoiceViewModel.j.f(OliveVoiceContract.Action.OpenDeviceSettings.f8795a);
                                    break;
                                default:
                                    function12.invoke(DialogType.NoSupportedLanguageDialog.f8842a);
                                    oliveVoiceViewModel.s6(VoiceSearchState.Idle.f8832a);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                NoDeviceLevelPermissionDialogKt.a(0, composerImplV, null, (Function0) objG3);
                composerImplV.V(false);
            } else if (dialogType instanceof DialogType.LanguageUnavailableDialog) {
                composerImplV.o(-1201551703);
                composerImplV.o(-1633490746);
                int i5 = i2 & 7168;
                boolean z5 = ((i2 & 112) == 32) | (i5 == 2048);
                Object objG4 = composerImplV.G();
                if (z5 || objG4 == composer$Companion$Empty$1) {
                    final int i6 = 2;
                    objG4 = new Function0() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.search.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    function1.invoke(DialogType.NoPermissionDialog.f8841a);
                                    oliveVoiceViewModel.j.f(OliveVoiceContract.Action.OpenAppSettings.f8794a);
                                    break;
                                case 1:
                                    function1.invoke(DialogType.NoDeviceLevelPermissionDialog.f8840a);
                                    oliveVoiceViewModel.s6(VoiceSearchState.Idle.f8832a);
                                    break;
                                case 2:
                                    function1.invoke(DialogType.LanguageUnavailableDialog.f8839a);
                                    oliveVoiceViewModel.j.f(OliveVoiceContract.Action.OpenDeviceSettings.f8795a);
                                    break;
                                case 3:
                                    function1.invoke(DialogType.LanguageUnavailableDialog.f8839a);
                                    oliveVoiceViewModel.s6(VoiceSearchState.Idle.f8832a);
                                    break;
                                case 4:
                                    function1.invoke(DialogType.NoSupportedLanguageDialog.f8842a);
                                    oliveVoiceViewModel.j.f(OliveVoiceContract.Action.OpenDeviceSettings.f8795a);
                                    break;
                                default:
                                    function1.invoke(DialogType.NoSupportedLanguageDialog.f8842a);
                                    oliveVoiceViewModel.s6(VoiceSearchState.Idle.f8832a);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG4);
                }
                Function0 function03 = (Function0) objG4;
                composerImplV.V(false);
                composerImplV.o(-1633490746);
                boolean z6 = ((i2 & 896) == 256) | (i5 == 2048);
                Object objG5 = composerImplV.G();
                if (z6 || objG5 == composer$Companion$Empty$1) {
                    final int i7 = 3;
                    objG5 = new Function0() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.search.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i7) {
                                case 0:
                                    function12.invoke(DialogType.NoPermissionDialog.f8841a);
                                    oliveVoiceViewModel.j.f(OliveVoiceContract.Action.OpenAppSettings.f8794a);
                                    break;
                                case 1:
                                    function12.invoke(DialogType.NoDeviceLevelPermissionDialog.f8840a);
                                    oliveVoiceViewModel.s6(VoiceSearchState.Idle.f8832a);
                                    break;
                                case 2:
                                    function12.invoke(DialogType.LanguageUnavailableDialog.f8839a);
                                    oliveVoiceViewModel.j.f(OliveVoiceContract.Action.OpenDeviceSettings.f8795a);
                                    break;
                                case 3:
                                    function12.invoke(DialogType.LanguageUnavailableDialog.f8839a);
                                    oliveVoiceViewModel.s6(VoiceSearchState.Idle.f8832a);
                                    break;
                                case 4:
                                    function12.invoke(DialogType.NoSupportedLanguageDialog.f8842a);
                                    oliveVoiceViewModel.j.f(OliveVoiceContract.Action.OpenDeviceSettings.f8795a);
                                    break;
                                default:
                                    function12.invoke(DialogType.NoSupportedLanguageDialog.f8842a);
                                    oliveVoiceViewModel.s6(VoiceSearchState.Idle.f8832a);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG5);
                }
                composerImplV.V(false);
                LanguageUnavailableDialogKt.a(0, composerImplV, null, function03, (Function0) objG5);
                composerImplV.V(false);
            } else {
                if (!(dialogType instanceof DialogType.NoSupportedLanguageDialog)) {
                    throw au.com.woolworths.android.onesite.a.w(1485226839, composerImplV, false);
                }
                composerImplV.o(-1200986263);
                composerImplV.o(-1633490746);
                int i8 = i2 & 7168;
                boolean z7 = ((i2 & 112) == 32) | (i8 == 2048);
                Object objG6 = composerImplV.G();
                if (z7 || objG6 == composer$Companion$Empty$1) {
                    final int i9 = 4;
                    objG6 = new Function0() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.search.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i9) {
                                case 0:
                                    function1.invoke(DialogType.NoPermissionDialog.f8841a);
                                    oliveVoiceViewModel.j.f(OliveVoiceContract.Action.OpenAppSettings.f8794a);
                                    break;
                                case 1:
                                    function1.invoke(DialogType.NoDeviceLevelPermissionDialog.f8840a);
                                    oliveVoiceViewModel.s6(VoiceSearchState.Idle.f8832a);
                                    break;
                                case 2:
                                    function1.invoke(DialogType.LanguageUnavailableDialog.f8839a);
                                    oliveVoiceViewModel.j.f(OliveVoiceContract.Action.OpenDeviceSettings.f8795a);
                                    break;
                                case 3:
                                    function1.invoke(DialogType.LanguageUnavailableDialog.f8839a);
                                    oliveVoiceViewModel.s6(VoiceSearchState.Idle.f8832a);
                                    break;
                                case 4:
                                    function1.invoke(DialogType.NoSupportedLanguageDialog.f8842a);
                                    oliveVoiceViewModel.j.f(OliveVoiceContract.Action.OpenDeviceSettings.f8795a);
                                    break;
                                default:
                                    function1.invoke(DialogType.NoSupportedLanguageDialog.f8842a);
                                    oliveVoiceViewModel.s6(VoiceSearchState.Idle.f8832a);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG6);
                }
                Function0 function04 = (Function0) objG6;
                composerImplV.V(false);
                composerImplV.o(-1633490746);
                boolean z8 = ((i2 & 896) == 256) | (i8 == 2048);
                Object objG7 = composerImplV.G();
                if (z8 || objG7 == composer$Companion$Empty$1) {
                    final int i10 = 5;
                    objG7 = new Function0() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.search.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i10) {
                                case 0:
                                    function12.invoke(DialogType.NoPermissionDialog.f8841a);
                                    oliveVoiceViewModel.j.f(OliveVoiceContract.Action.OpenAppSettings.f8794a);
                                    break;
                                case 1:
                                    function12.invoke(DialogType.NoDeviceLevelPermissionDialog.f8840a);
                                    oliveVoiceViewModel.s6(VoiceSearchState.Idle.f8832a);
                                    break;
                                case 2:
                                    function12.invoke(DialogType.LanguageUnavailableDialog.f8839a);
                                    oliveVoiceViewModel.j.f(OliveVoiceContract.Action.OpenDeviceSettings.f8795a);
                                    break;
                                case 3:
                                    function12.invoke(DialogType.LanguageUnavailableDialog.f8839a);
                                    oliveVoiceViewModel.s6(VoiceSearchState.Idle.f8832a);
                                    break;
                                case 4:
                                    function12.invoke(DialogType.NoSupportedLanguageDialog.f8842a);
                                    oliveVoiceViewModel.j.f(OliveVoiceContract.Action.OpenDeviceSettings.f8795a);
                                    break;
                                default:
                                    function12.invoke(DialogType.NoSupportedLanguageDialog.f8842a);
                                    oliveVoiceViewModel.s6(VoiceSearchState.Idle.f8832a);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG7);
                }
                composerImplV.V(false);
                NoSupportedLanguageDialogKt.a(0, composerImplV, null, function04, (Function0) objG7);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(dialogType, function1, function12, oliveVoiceViewModel, function0, i, 17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x034e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel r24, au.com.woolworths.foundation.shop.olive.voice.analytics.VoiceAnalytics r25, au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState r26, kotlin.jvm.functions.Function0 r27, kotlin.jvm.functions.Function1 r28, kotlin.jvm.functions.Function1 r29, kotlin.jvm.functions.Function0 r30, boolean r31, boolean r32, boolean r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.olive.voice.ui.search.OliveVoiceSearchScreenKt.b(au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel, au.com.woolworths.foundation.shop.olive.voice.analytics.VoiceAnalytics, au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState r24, kotlin.jvm.functions.Function0 r25, kotlin.jvm.functions.Function0 r26, kotlin.jvm.functions.Function0 r27, kotlin.jvm.functions.Function0 r28, kotlin.jvm.functions.Function1 r29, boolean r30, boolean r31, boolean r32, androidx.compose.ui.Modifier r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.olive.voice.ui.search.OliveVoiceSearchScreenKt.c(au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, boolean, boolean, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void d(Function0 function0, final Function0 function02, Modifier modifier, Boolean bool, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(981252084);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function02) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(bool) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.e, Alignment.Companion.n, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            boolean zEquals = bool.equals(Boolean.TRUE);
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-1302674238, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.search.OliveVoiceSearchScreenKt$PageAction$1$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    String upperCase = StringResources_androidKt.c(composer2, R.string.olive_voice_failure_fallback_action).toUpperCase(Locale.ROOT);
                    Intrinsics.g(upperCase, "toUpperCase(...)");
                    PrimaryButtonKt.a(upperCase, function02, Modifier.Companion.d, false, null, null, null, null, composer2, KyberEngine.KyberPolyBytes, 248);
                    return Unit.f24250a;
                }
            }, composerImplV);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
            int i4 = i2;
            AnimatedVisibilityKt.c(columnScopeInstance, zEquals, null, null, null, null, composableLambdaImplC, composerImplV, 1572870, 30);
            Modifier modifierA = columnScopeInstance.a(SizeKt.c, 1.0f, true);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierA);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            ButtonKt.c(function0, BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.e), false, null, null, null, null, null, ComposableSingletons$OliveVoiceSearchScreenKt.f8862a, composerImplV, (i4 & 14) | 805306368, 508);
            composerImplV = composerImplV;
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.instore.presence.presentation.b(i, 2, (Object) function0, (Object) function02, (Object) modifier, (Object) bool, false);
        }
    }

    public static final void e(VoiceSearchState voiceSearchState, Function0 function0, Function0 function02, Function0 function03, Function1 function1, boolean z, boolean z2, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1019548854);
        int i2 = (composerImplV.p(z2) ? 1048576 : 524288) | i | (composerImplV.n(voiceSearchState) ? 4 : 2) | (composerImplV.I(function0) ? 32 : 16) | (composerImplV.I(function02) ? 256 : 128) | (composerImplV.I(function03) ? 2048 : 1024) | (composerImplV.I(function1) ? 16384 : 8192) | (composerImplV.p(z) ? 131072 : 65536);
        if ((599187 & i2) == 599186 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(0);
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            composerImplV.o(-1746271574);
            int i3 = i2 & 14;
            boolean z3 = (i3 == 4) | ((i2 & 57344) == 16384);
            Object objG2 = composerImplV.G();
            if (z3 || objG2 == composer$Companion$Empty$1) {
                objG2 = new OliveVoiceSearchScreenKt$SearchScreen$1$1(voiceSearchState, function1, mutableState, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, voiceSearchState, (Function2) objG2);
            Modifier modifierF = PaddingKt.f(SizeKt.c, 16);
            composerImplV.o(1849434622);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = new a(5);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierF, false, (Function1) objG3);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 60, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
            Modifier modifierA = columnScopeInstance.a(modifierJ, 1.0f, true);
            composerImplV.o(1849434622);
            Object objG4 = composerImplV.G();
            if (objG4 == composer$Companion$Empty$1) {
                objG4 = new a(6);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            int i5 = i2 >> 12;
            composerImpl = composerImplV;
            ContentStateKt.a(voiceSearchState, z, z2, SemanticsModifierKt.b(modifierA, false, (Function1) objG4), composerImpl, i3 | (i5 & 112) | (i5 & 896));
            OliveStateKt.d(voiceSearchState, function0, null, composerImpl, i2 & 126);
            Modifier modifierE = SizeKt.e(columnScopeInstance.a(companion, 1.0f, true), 1.0f);
            boolean z4 = ((Number) mutableState.getD()).intValue() >= 3 && (voiceSearchState instanceof VoiceSearchState.Failure);
            composerImpl.o(-1633490746);
            boolean z5 = (i2 & 7168) == 2048;
            Object objG5 = composerImpl.G();
            if (z5 || objG5 == composer$Companion$Empty$1) {
                objG5 = new au.com.woolworths.feature.shop.homepage.presentation.rewards.d(function03, mutableState, 6);
                composerImpl.A(objG5);
            }
            composerImpl.V(false);
            d(function02, (Function0) objG5, modifierE, Boolean.valueOf(z4), composerImpl, (i2 >> 6) & 14);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.a(voiceSearchState, function0, function02, function03, function1, z, z2, i);
        }
    }
}
