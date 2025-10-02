package au.com.woolworths.foundation.ui.shimmers;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shimmers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShimmerKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.Modifier r16, float r17, androidx.compose.ui.unit.Dp r18, androidx.compose.ui.unit.Dp r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.ui.shimmers.ShimmerKt.a(androidx.compose.ui.Modifier, float, androidx.compose.ui.unit.Dp, androidx.compose.ui.unit.Dp, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Modifier b(Composer composer, Modifier modifier) {
        Intrinsics.h(modifier, "<this>");
        composer.o(-1646155840);
        List listR = CollectionsKt.R(new Color(CoreTheme.d(composer).f4872a.d), new Color(CoreTheme.d(composer).f4872a.c), new Color(CoreTheme.d(composer).f4872a.b), new Color(CoreTheme.d(composer).f4872a.c), new Color(CoreTheme.d(composer).f4872a.d));
        InfiniteTransition.TransitionAnimationState transitionAnimationStateA = InfiniteTransitionKt.a(InfiniteTransitionKt.c("", composer, 0), BitmapDescriptorFactory.HUE_RED, 2000, AnimationSpecKt.a(4, 0L, AnimationSpecKt.e(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 0, EasingKt.d, 2), RepeatMode.d), "Shimmer loading animation", composer, 28728, 0);
        Modifier modifierA = BackgroundKt.a(modifier, Brush.Companion.a(listR, (Float.floatToRawIntBits(((Number) ((SnapshotMutableStateImpl) transitionAnimationStateA.g).getD()).floatValue() - 500) << 32) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L), (Float.floatToRawIntBits(((Number) ((SnapshotMutableStateImpl) transitionAnimationStateA.g).getD()).floatValue()) << 32) | (4294967295L & Float.floatToRawIntBits(270.0f)), 8));
        composer.l();
        return modifierA;
    }
}
