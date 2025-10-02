package au.com.woolworths.feature.shared.force.upgrade.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"force-upgrade_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class UpdateFullScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:124:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType r30, kotlin.jvm.functions.Function1 r31, kotlin.jvm.functions.Function2 r32, androidx.compose.runtime.Composer r33, int r34) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shared.force.upgrade.ui.UpdateFullScreenKt.a(au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    public static final void b(UpdateFullScreenType updateFullScreenType, Function1 onAppVersionUpdateClick, Function1 onOsVersionUpdateClick, Function2 onShowRewardsCardClick, Composer composer, int i) {
        Intrinsics.h(onAppVersionUpdateClick, "onAppVersionUpdateClick");
        Intrinsics.h(onOsVersionUpdateClick, "onOsVersionUpdateClick");
        Intrinsics.h(onShowRewardsCardClick, "onShowRewardsCardClick");
        ComposerImpl composerImplV = composer.v(-1717808765);
        int i2 = (composerImplV.n(updateFullScreenType) ? 4 : 2) | i | (composerImplV.I(onAppVersionUpdateClick) ? 32 : 16) | (composerImplV.I(onOsVersionUpdateClick) ? 256 : 128) | (composerImplV.I(onShowRewardsCardClick) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else if (updateFullScreenType instanceof UpdateFullScreenType.AppForceUpdate) {
            composerImplV.o(-705201129);
            a(updateFullScreenType, onAppVersionUpdateClick, onShowRewardsCardClick, composerImplV, ((i2 >> 3) & 896) | (i2 & 112));
            composerImplV.V(false);
        } else {
            if (!(updateFullScreenType instanceof UpdateFullScreenType.OsForceUpdate)) {
                throw au.com.woolworths.android.onesite.a.w(-1546771148, composerImplV, false);
            }
            composerImplV.o(-704983943);
            a(updateFullScreenType, onOsVersionUpdateClick, onShowRewardsCardClick, composerImplV, (i2 >> 3) & 1008);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a(updateFullScreenType, onAppVersionUpdateClick, onOsVersionUpdateClick, onShowRewardsCardClick, i, 13);
        }
    }
}
