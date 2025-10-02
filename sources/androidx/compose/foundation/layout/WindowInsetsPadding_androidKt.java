package androidx.compose.foundation.layout;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class WindowInsetsPadding_androidKt {
    public static final Modifier a(Modifier modifier) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.a(), new WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$windowInsetsPadding$1(3));
    }

    public static final Modifier b(Modifier modifier) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.a(), new WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$windowInsetsPadding$1(3));
    }
}
