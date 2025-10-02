package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextFieldKeyEventHandler_androidKt {
    public static final boolean a(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }
}
