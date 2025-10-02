package au.com.woolworths.foundation.shop.olive.voice.ui.permission;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.navigation.internal.c;
import au.com.woolworths.compose.utils.preview.PermissionKt;
import au.com.woolworths.feature.shop.homepage.presentation.rewards.d;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStatus;
import com.google.accompanist.permissions.PermissionsUtilKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"olive-voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OliveVoicePermissionScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final com.google.accompanist.permissions.PermissionState r20, final kotlin.jvm.functions.Function2 r21, kotlin.jvm.functions.Function0 r22, kotlin.jvm.functions.Function0 r23, kotlin.jvm.functions.Function0 r24, kotlin.jvm.functions.Function1 r25, androidx.compose.ui.Modifier r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.olive.voice.ui.permission.OliveVoicePermissionScreenKt.a(com.google.accompanist.permissions.PermissionState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(boolean z, Function0 onPermissionOnboardingContinue, Function0 onPermissionGranted, Function0 onPermissionDenied, Function2 onClose, Function0 onPermissionScreenShown, Function0 onPermissionRationaleShown, Function1 onPermissionRationaleAction, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object cVar;
        Object obj;
        MutableState mutableState;
        MutableState mutableState2;
        Modifier modifier3;
        ComposerImpl composerImpl;
        Intrinsics.h(onPermissionOnboardingContinue, "onPermissionOnboardingContinue");
        Intrinsics.h(onPermissionGranted, "onPermissionGranted");
        Intrinsics.h(onPermissionDenied, "onPermissionDenied");
        Intrinsics.h(onClose, "onClose");
        Intrinsics.h(onPermissionScreenShown, "onPermissionScreenShown");
        Intrinsics.h(onPermissionRationaleShown, "onPermissionRationaleShown");
        Intrinsics.h(onPermissionRationaleAction, "onPermissionRationaleAction");
        ComposerImpl composerImplV = composer.v(-598728574);
        if ((i & 6) == 0) {
            i3 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(onPermissionOnboardingContinue) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(onPermissionGranted) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.I(onPermissionDenied) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.I(onClose) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerImplV.I(onPermissionScreenShown) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerImplV.I(onPermissionRationaleShown) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerImplV.I(onPermissionRationaleAction) ? 8388608 : 4194304;
        }
        int i5 = i2 & 256;
        if (i5 != 0) {
            i3 |= 100663296;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 100663296) == 0) {
                i3 |= composerImplV.n(modifier2) ? 67108864 : 33554432;
            }
        }
        if ((i3 & 38347923) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier3 = modifier2;
        } else {
            if (i5 != 0) {
                modifier2 = Modifier.Companion.d;
            }
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj2 = Composer.Companion.f1624a;
            if (objG == obj2) {
                objG = SnapshotStateKt.f(Boolean.valueOf(z));
                composerImplV.A(objG);
            }
            MutableState mutableState3 = (MutableState) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == obj2) {
                objD = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objD);
            }
            MutableState mutableState4 = (MutableState) objD;
            composerImplV.V(false);
            composerImplV.o(-1224400529);
            boolean z2 = ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objG2 = composerImplV.G();
            if (z2 || objG2 == obj2) {
                i4 = i3;
                obj = obj2;
                mutableState = mutableState4;
                mutableState2 = mutableState3;
                cVar = new c(onPermissionGranted, mutableState2, mutableState, onPermissionDenied, 6);
                composerImplV.A(cVar);
            } else {
                mutableState = mutableState4;
                mutableState2 = mutableState3;
                i4 = i3;
                cVar = objG2;
                obj = obj2;
            }
            composerImplV.V(false);
            PermissionState permissionStateA = PermissionKt.a("android.permission.RECORD_AUDIO", (Function1) cVar, composerImplV, 0);
            PermissionStatus status = permissionStateA.getStatus();
            composerImplV.o(-1633490746);
            boolean zN = composerImplV.n(permissionStateA);
            Object objG3 = composerImplV.G();
            if (zN || objG3 == obj) {
                objG3 = new OliveVoicePermissionScreenKt$OliveVoicePermissionScreen$1$1(permissionStateA, mutableState, null);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, status, (Function2) objG3);
            composerImplV.o(-1633490746);
            boolean z3 = (i4 & 112) == 32;
            Object objG4 = composerImplV.G();
            if (z3 || objG4 == obj) {
                objG4 = new d(mutableState2, onPermissionOnboardingContinue, 5);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            int i6 = (i4 >> 9) & 112;
            int i7 = i4 >> 6;
            modifier3 = modifier2;
            composerImpl = composerImplV;
            a(permissionStateA, onClose, (Function0) objG4, onPermissionScreenShown, onPermissionRationaleShown, onPermissionRationaleAction, modifier3, composerImpl, (i7 & 3670016) | i6 | (i7 & 7168) | (57344 & i7) | (458752 & i7), 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.corerow.d(z, onPermissionOnboardingContinue, onPermissionGranted, onPermissionDenied, onClose, onPermissionScreenShown, onPermissionRationaleShown, onPermissionRationaleAction, modifier3, i, i2);
        }
    }

    public static final void c(final PermissionState permissionState, final PaddingValues paddingValues, final Function0 function0, final Function0 function02, final Function0 function03, final Function1 function1, final Function2 function2, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(566358834);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(permissionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(paddingValues) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function03) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(function2) ? 1048576 : 524288;
        }
        if ((i2 & 599187) == 599186 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImpl = composerImplV;
            AnimatedContentKt.b(Boolean.valueOf(PermissionsUtilKt.d(permissionState.getStatus())), null, null, null, "", null, ComposableLambdaKt.c(105738485, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.permission.OliveVoicePermissionScreenKt$PermissionContent$1
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    Composer composer2 = (Composer) obj3;
                    ((Number) obj4).intValue();
                    Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                    PermissionState permissionState2 = permissionState;
                    if (zBooleanValue) {
                        composer2.o(-1464528402);
                        PermissionRationaleContentKt.a(paddingValues, permissionState2, function03, function1, function2, composer2, 0);
                        composer2.l();
                    } else {
                        composer2.o(-1464520789);
                        PermissionDescContentKt.c(paddingValues, permissionState2, function0, function02, composer2, 0);
                        composer2.l();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 1597440, 46);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.a(permissionState, paddingValues, function0, function02, function03, function1, function2, i);
        }
    }
}
