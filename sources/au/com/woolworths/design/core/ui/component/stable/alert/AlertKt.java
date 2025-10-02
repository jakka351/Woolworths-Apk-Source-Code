package au.com.woolworths.design.core.ui.component.stable.alert;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.compose.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AlertKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4743a;

        static {
            int[] iArr = new int[Placement.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Placement placement = Placement.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[AlertStyle.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AlertStyle alertStyle = AlertStyle.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AlertStyle alertStyle2 = AlertStyle.d;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AlertStyle alertStyle3 = AlertStyle.d;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[AlertType.values().length];
            try {
                iArr3[AlertType.h.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            f4743a = iArr3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle r28, au.com.woolworths.design.core.ui.component.stable.alert.AlertType r29, java.lang.String r30, androidx.compose.ui.Modifier r31, au.com.woolworths.design.core.ui.component.stable.alert.AlertSpec.Action r32, java.lang.String r33, androidx.compose.ui.graphics.vector.ImageVector r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.stable.alert.AlertKt.a(au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle, au.com.woolworths.design.core.ui.component.stable.alert.AlertType, java.lang.String, androidx.compose.ui.Modifier, au.com.woolworths.design.core.ui.component.stable.alert.AlertSpec$Action, java.lang.String, androidx.compose.ui.graphics.vector.ImageVector, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(AlertStyle style, String description, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.h(style, "style");
        Intrinsics.h(description, "description");
        ComposerImpl composerImplV = composer.v(-744039226);
        if ((i & 6) == 0) {
            i2 = (composerImplV.r(style.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (composerImplV.n(description) ? 32 : 16);
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            a(style, AlertType.h, description, modifier, null, null, null, composerImplV, ((i3 << 3) & 896) | (i3 & 14) | 48 | 3072, 112);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(style, description, modifier, i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle r19, au.com.woolworths.design.core.ui.component.stable.alert.Placement r20, androidx.compose.ui.Modifier r21, au.com.woolworths.design.core.ui.component.stable.alert.AlertSpec.Action r22, java.lang.String r23, java.lang.String r24, androidx.compose.ui.graphics.vector.ImageVector r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.stable.alert.AlertKt.c(au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle, au.com.woolworths.design.core.ui.component.stable.alert.Placement, androidx.compose.ui.Modifier, au.com.woolworths.design.core.ui.component.stable.alert.AlertSpec$Action, java.lang.String, java.lang.String, androidx.compose.ui.graphics.vector.ImageVector, androidx.compose.runtime.Composer, int, int):void");
    }
}
