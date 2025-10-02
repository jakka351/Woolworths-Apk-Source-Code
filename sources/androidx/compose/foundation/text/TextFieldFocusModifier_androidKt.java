package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextFieldFocusModifier_androidKt {
    public static final boolean a(int i, KeyEvent keyEvent) {
        return ((int) (KeyEvent_androidKt.a(keyEvent) >> 32)) == i;
    }
}
