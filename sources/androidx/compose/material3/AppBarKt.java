package androidx.compose.material3;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "colorTransitionFraction", "Landroidx/compose/ui/graphics/Color;", "appBarContainerColor", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AppBarKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1396a;
    public static final float b;
    public static final float c;

    static {
        float f = 16;
        float f2 = f - 12;
        f1396a = f2;
        b = f2;
        new CubicBezierEasing(0.8f, BitmapDescriptorFactory.HUE_RED, 0.8f, 0.15f);
        c = f - 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(final androidx.compose.material3.TopAppBarState r9, float r10, androidx.compose.animation.core.DecayAnimationSpec r11, androidx.compose.animation.core.AnimationSpec r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.a(androidx.compose.material3.TopAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(final androidx.compose.material3.BottomAppBarState r9, float r10, androidx.compose.animation.core.DecayAnimationSpec r11, androidx.compose.animation.core.AnimationSpec r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.b(androidx.compose.material3.BottomAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final TopAppBarState c(Composer composer) {
        Object[] objArr = new Object[0];
        SaverKt$Saver$1 saverKt$Saver$1 = TopAppBarState.d;
        boolean zQ = composer.q(-3.4028235E38f) | composer.q(BitmapDescriptorFactory.HUE_RED) | composer.q(BitmapDescriptorFactory.HUE_RED);
        Object objG = composer.G();
        if (zQ || objG == Composer.Companion.f1624a) {
            objG = new AppBarKt$rememberTopAppBarState$1$1(0);
            composer.A(objG);
        }
        return (TopAppBarState) RememberSaveableKt.c(objArr, saverKt$Saver$1, (Function0) objG, composer, 0, 4);
    }
}
