package au.com.woolworths.foundation.rewards.onboarding.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\t²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "contentSize", "Landroidx/compose/ui/geometry/Offset;", "contentLocation", "frameSize", "", "frameCenterX", "", "popIdx", "onboarding-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CoachMarkFrameKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f8637a = 8;
    public static final float b = 7;
    public static final float c = 2;
    public static final float d = 5;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CoachMarkFrameAlignment.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CoachMarkFrameAlignment coachMarkFrameAlignment = CoachMarkFrameAlignment.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CoachMarkFrameAlignment coachMarkFrameAlignment2 = CoachMarkFrameAlignment.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final androidx.compose.runtime.internal.ComposableLambdaImpl r29, androidx.compose.ui.Modifier r30, java.lang.String r31, boolean r32, kotlin.jvm.functions.Function0 r33, androidx.compose.ui.window.PopupProperties r34, au.com.woolworths.foundation.rewards.onboarding.ui.CoachMarkFrameAlignment r35, androidx.compose.runtime.internal.ComposableLambdaImpl r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.rewards.onboarding.ui.CoachMarkFrameKt.a(androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.ui.Modifier, java.lang.String, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.window.PopupProperties, au.com.woolworths.foundation.rewards.onboarding.ui.CoachMarkFrameAlignment, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final Modifier modifier, final float f, final boolean z, final boolean z2, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        long jA;
        long jC;
        ComposerImpl composerImplV = composer.v(814838311);
        if (((i | (composerImplV.q(f) ? 32 : 16) | (composerImplV.p(z) ? 256 : 128) | (composerImplV.p(z2) ? 2048 : 1024) | (composerImplV.I(composableLambdaImpl) ? 16384 : 8192)) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final CoachMarkShape coachMarkShape = new CoachMarkShape(f, z);
            if (z2) {
                composerImplV.o(1375582702);
                jA = WxTheme.a(composerImplV).c();
            } else {
                composerImplV.o(1375583761);
                jA = WxTheme.a(composerImplV).a();
            }
            composerImplV.V(false);
            if (z2) {
                composerImplV.o(1375586197);
                jC = WxTheme.a(composerImplV).e();
            } else {
                composerImplV.o(1375587470);
                jC = WxTheme.a(composerImplV).c();
            }
            composerImplV.V(false);
            final long j = jA;
            SurfaceKt.a(modifier, coachMarkShape, 0L, jC, null, 8, ComposableLambdaKt.c(-1987688341, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.onboarding.ui.CoachMarkFrameKt$CoachMarkPopupContent$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    float f2;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierB = BackgroundKt.b(ClipKt.a(Modifier.Companion.d, coachMarkShape), j, RectangleShapeKt.f1779a);
                        float f3 = 12;
                        boolean z3 = z;
                        if (true == z3) {
                            f2 = CoachMarkFrameKt.b;
                        } else {
                            float f4 = CoachMarkFrameKt.f8637a;
                            f2 = 0;
                        }
                        Modifier modifierI = PaddingKt.i(modifierB, f3, (!z3 ? CoachMarkFrameKt.b : 0) + f3, f3, f2 + f3);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierI);
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
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        android.support.v4.media.session.a.x(0, composer2, composableLambdaImpl);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1769478, 20);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(f, z, z2, composableLambdaImpl, i) { // from class: au.com.woolworths.foundation.rewards.onboarding.ui.a
                public final /* synthetic */ float e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ ComposableLambdaImpl h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(7);
                    CoachMarkFrameKt.b(this.d, this.e, this.f, this.g, this.h, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
