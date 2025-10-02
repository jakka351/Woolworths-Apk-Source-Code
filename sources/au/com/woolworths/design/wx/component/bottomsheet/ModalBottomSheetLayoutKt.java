package au.com.woolworths.design.wx.component.bottomsheet;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.component.experimental.chip.e;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.foundation.ThemeContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"design-wx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ModalBottomSheetLayoutKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ThemeContext.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ThemeContext themeContext = ThemeContext.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final androidx.compose.runtime.internal.ComposableLambdaImpl r23, androidx.compose.ui.Modifier r24, final androidx.compose.material.ModalBottomSheetState r25, float r26, long r27, long r29, boolean r31, final kotlin.jvm.functions.Function2 r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.wx.component.bottomsheet.ModalBottomSheetLayoutKt.a(androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.ui.Modifier, androidx.compose.material.ModalBottomSheetState, float, long, long, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(ModalBottomSheetValue modalBottomSheetValue, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-159944466);
        if ((i & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final ModalBottomSheetState modalBottomSheetStateC = ModalBottomSheetKt.c(modalBottomSheetValue, null, composerImplV, 6, 14);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG;
            a(ComposableSingletons$ModalBottomSheetLayoutKt.d, null, modalBottomSheetStateC, BitmapDescriptorFactory.HUE_RED, 0L, 0L, false, ComposableLambdaKt.c(-637586199, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.wx.component.bottomsheet.ModalBottomSheetLayoutKt$ModalBottomSheetLayoutForPreview$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierF = PaddingKt.f(SizeKt.c, 16);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composer2, 48);
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
                        TextKt.b("Rest of the UI", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 6, 0, 131070);
                        SpacerKt.a(composer2, SizeKt.g(Modifier.Companion.d, 20));
                        composer2.o(-1633490746);
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        boolean zI = composer2.I(coroutineScope2);
                        final ModalBottomSheetState modalBottomSheetState = modalBottomSheetStateC;
                        boolean zI2 = zI | composer2.I(modalBottomSheetState);
                        Object objG2 = composer2.G();
                        if (zI2 || objG2 == Composer.Companion.f1624a) {
                            objG2 = new Function0() { // from class: au.com.woolworths.design.wx.component.bottomsheet.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    BuildersKt.c(coroutineScope2, null, null, new ModalBottomSheetLayoutKt$ModalBottomSheetLayoutForPreview$1$1$1$1$1(modalBottomSheetState, null), 3);
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG2);
                        }
                        composer2.l();
                        PrimaryButtonKt.a("Click to show sheet", (Function0) objG2, null, false, false, null, null, null, null, composer2, 6, 1020);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12583430, 122);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(i, 1, modalBottomSheetValue);
        }
    }
}
