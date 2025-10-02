package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.StylusHoverIconModifierElement;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class StylusHandwritingKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DpTouchBoundsExpansion f1147a;

    static {
        float f = 40;
        float f2 = 10;
        f1147a = new DpTouchBoundsExpansion(f2, f, f2, f);
    }

    public static final Modifier a(Modifier modifier, boolean z, boolean z2, Function0 function0) {
        if (!z || !StylusHandwriting_androidKt.f1148a) {
            return modifier;
        }
        if (z2) {
            modifier = modifier.x0(new StylusHoverIconModifierElement(f1147a));
        }
        return modifier.x0(new StylusHandwritingElement(function0));
    }
}
