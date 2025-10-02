package au.com.woolworths.foundation.rewards.cart.info.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.BadgeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.wx.foundation.WxTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"cart-info_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class NotificationBadgeKt {
    public static final void a(final String text, final String str, final long j, final long j2, Modifier modifier, final long j3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        final Modifier modifier4;
        Intrinsics.h(text, "text");
        ComposerImpl composerImplV = composer.v(-901027896);
        if ((i & 6) == 0) {
            i3 = i | (composerImplV.n(text) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i3 | (composerImplV.s(j) ? 256 : 128) | (composerImplV.s(j2) ? 2048 : 1024);
        int i6 = i2 & 16;
        if (i6 != 0) {
            i4 = i5 | 24576;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i5 | (composerImplV.n(modifier2) ? 16384 : 8192);
        }
        int i7 = i4 | (composerImplV.s(j3) ? 131072 : 65536);
        if ((74899 & i7) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier4 = modifier2;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                if (i6 != 0) {
                    modifier3 = Modifier.Companion.d;
                }
                composerImplV.W();
                float f = 2;
                BadgeKt.a(BorderKt.a(BackgroundKt.b(ClipKt.a(modifier3, RoundedCornerShapeKt.b(f)), j3, RectangleShapeKt.f1779a), 1, j2, RoundedCornerShapeKt.b(f)), j3, 0L, ComposableLambdaKt.c(1876434235, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.cart.info.ui.components.NotificationBadgeKt$NotificationBadge$1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.Modifier] */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Modifier.Companion companionB;
                        RowScope Badge = (RowScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(Badge, "$this$Badge");
                        if ((iIntValue & 17) == 16 && composer2.c()) {
                            composer2.j();
                        } else {
                            TextStyle textStyle = WxTheme.b(composer2).s;
                            composer2.o(-632958650);
                            Modifier.Companion companion = Modifier.Companion.d;
                            String str2 = str;
                            if (str2 == null) {
                                companionB = null;
                            } else {
                                composer2.o(5004770);
                                boolean zN = composer2.n(str2);
                                Object objG = composer2.G();
                                if (zN || objG == Composer.Companion.f1624a) {
                                    objG = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(str2, 15);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                companionB = SemanticsModifierKt.b(companion, false, (Function1) objG);
                            }
                            composer2.l();
                            if (companionB != null) {
                                companion = companionB;
                            }
                            TextKt.b(text, companion, j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer2, 0, 0, 65528);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, ((i7 >> 12) & 112) | 3072, 4);
                modifier4 = modifier3;
            } else {
                composerImplV.j();
            }
            modifier3 = modifier2;
            composerImplV.W();
            float f2 = 2;
            BadgeKt.a(BorderKt.a(BackgroundKt.b(ClipKt.a(modifier3, RoundedCornerShapeKt.b(f2)), j3, RectangleShapeKt.f1779a), 1, j2, RoundedCornerShapeKt.b(f2)), j3, 0L, ComposableLambdaKt.c(1876434235, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.cart.info.ui.components.NotificationBadgeKt$NotificationBadge$1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.Modifier] */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Modifier.Companion companionB;
                    RowScope Badge = (RowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(Badge, "$this$Badge");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        TextStyle textStyle = WxTheme.b(composer2).s;
                        composer2.o(-632958650);
                        Modifier.Companion companion = Modifier.Companion.d;
                        String str2 = str;
                        if (str2 == null) {
                            companionB = null;
                        } else {
                            composer2.o(5004770);
                            boolean zN = composer2.n(str2);
                            Object objG = composer2.G();
                            if (zN || objG == Composer.Companion.f1624a) {
                                objG = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(str2, 15);
                                composer2.A(objG);
                            }
                            composer2.l();
                            companionB = SemanticsModifierKt.b(companion, false, (Function1) objG);
                        }
                        composer2.l();
                        if (companionB != null) {
                            companion = companionB;
                        }
                        TextKt.b(text, companion, j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer2, 0, 0, 65528);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i7 >> 12) & 112) | 3072, 4);
            modifier4 = modifier3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.foundation.rewards.cart.info.ui.components.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    NotificationBadgeKt.a(text, str, j, j2, modifier4, j3, (Composer) obj, RecomposeScopeImplKt.a(i | 1), i2);
                    return Unit.f24250a;
                }
            };
        }
    }
}
