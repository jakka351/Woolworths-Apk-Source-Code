package androidx.compose.ui;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ZIndexModifierKt {
    public static final Modifier a(Modifier modifier, float f) {
        return modifier.x0(new ZIndexElement(f));
    }
}
