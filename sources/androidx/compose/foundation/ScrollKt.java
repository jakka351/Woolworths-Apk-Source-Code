package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ScrollKt {
    public static final ScrollState a(Composer composer) {
        Object[] objArr = new Object[0];
        SaverKt$Saver$1 saverKt$Saver$1 = ScrollState.i;
        boolean zR = composer.r(0);
        Object objG = composer.G();
        if (zR || objG == Composer.Companion.f1624a) {
            objG = new ScrollKt$rememberScrollState$1$1(0);
            composer.A(objG);
        }
        return (ScrollState) RememberSaveableKt.c(objArr, saverKt$Saver$1, (Function0) objG, composer, 0, 4);
    }

    public static Modifier b(Modifier modifier, ScrollState scrollState, boolean z) {
        return ScrollingContainerKt.a(modifier, scrollState, z ? Orientation.d : Orientation.e, true, false, null, scrollState.c, true, null, null).x0(new ScrollingLayoutElement(scrollState, z));
    }
}
