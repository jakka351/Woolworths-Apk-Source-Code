package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import au.com.woolworths.design.wx.component.bottomsheet.ModalBottomSheetLayoutKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraChoosePlanBottomSheetViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonActionType;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ChangePlanModalBottomSheetKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f6138a = nlnlnnn.xxx00780078x0078;

    public static final void a(final EverydayExtraChoosePlanBottomSheetViewModel everydayExtraChoosePlanBottomSheetViewModel, ModalBottomSheetState modalBottomSheetState, final Function1 onChangePlanSelect, Composer composer, int i) {
        Intrinsics.h(modalBottomSheetState, "modalBottomSheetState");
        Intrinsics.h(onChangePlanSelect, "onChangePlanSelect");
        ComposerImpl composerImplV = composer.v(869990245);
        int i2 = i | (composerImplV.I(everydayExtraChoosePlanBottomSheetViewModel) ? 4 : 2) | (composerImplV.I(modalBottomSheetState) ? 32 : 16) | (composerImplV.I(onChangePlanSelect) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            Object obj2 = (CoroutineScope) objG;
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 112) == 32 || composerImplV.I(modalBottomSheetState)) | composerImplV.I(obj2);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == obj) {
                objG2 = new b(0, obj2, modalBottomSheetState);
                composerImplV.A(objG2);
            }
            final Function0 function0 = (Function0) objG2;
            composerImplV.V(false);
            ModalBottomSheetLayoutKt.a(ComposableLambdaKt.c(47943287, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.ChangePlanModalBottomSheetKt$ChangePlanModalBottomSheet$1

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    static {
                        int[] iArr = new int[EverydayExtrasButtonActionType.values().length];
                        try {
                            iArr[0] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            EverydayExtrasButtonActionType everydayExtrasButtonActionType = EverydayExtrasButtonActionType.d;
                            iArr[1] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            EverydayExtrasButtonActionType everydayExtrasButtonActionType2 = EverydayExtrasButtonActionType.d;
                            iArr[2] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    ColumnScope ModalBottomSheetLayout = (ColumnScope) obj3;
                    Composer composer2 = (Composer) obj4;
                    int iIntValue = ((Number) obj5).intValue();
                    Intrinsics.h(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(-1746271574);
                        EverydayExtraChoosePlanBottomSheetViewModel everydayExtraChoosePlanBottomSheetViewModel2 = everydayExtraChoosePlanBottomSheetViewModel;
                        boolean zI2 = composer2.I(everydayExtraChoosePlanBottomSheetViewModel2);
                        Function1 function1 = onChangePlanSelect;
                        boolean zN = zI2 | composer2.n(function1);
                        Function0 function02 = function0;
                        boolean zN2 = zN | composer2.n(function02);
                        Object objG3 = composer2.G();
                        if (zN2 || objG3 == Composer.Companion.f1624a) {
                            objG3 = new androidx.lifecycle.compose.b(9, everydayExtraChoosePlanBottomSheetViewModel2, function02, function1);
                            composer2.A(objG3);
                        }
                        composer2.l();
                        ChangePlanModalBottomSheetKt.b(everydayExtraChoosePlanBottomSheetViewModel2, (Function1) objG3, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, modalBottomSheetState, BitmapDescriptorFactory.HUE_RED, 0L, 0L, true, ComposableSingletons$ChangePlanModalBottomSheetKt.f6139a, composerImplV, 14156294 | ((i2 << 3) & 896), 58);
            if (modalBottomSheetState.d()) {
                composerImplV.o(5004770);
                boolean zN = composerImplV.n(function0);
                Object objG3 = composerImplV.G();
                if (zN || objG3 == obj) {
                    objG3 = new au.com.woolworths.design.core.ui.component.experimental.dialog.a(17, function0);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                BackHandlerKt.a(false, (Function0) objG3, composerImplV, 0, 1);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(everydayExtraChoosePlanBottomSheetViewModel, modalBottomSheetState, onChangePlanSelect, i, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraChoosePlanBottomSheetViewModel r17, kotlin.jvm.functions.Function1 r18, androidx.compose.runtime.Composer r19, int r20) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.ChangePlanModalBottomSheetKt.b(au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraChoosePlanBottomSheetViewModel, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }
}
