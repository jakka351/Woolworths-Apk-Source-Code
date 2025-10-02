package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TestTagKt {
    public static final Modifier a(Modifier modifier, String str) {
        return modifier.x0(new TestTagElement(str));
    }
}
