package androidx.compose.ui.input.key;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Landroid/view/KeyEvent;", "NativeKeyEvent", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KeyEvent_androidKt {
    public static final long a(android.view.KeyEvent keyEvent) {
        return Key_androidKt.a(keyEvent.getKeyCode());
    }

    public static final int b(android.view.KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final boolean c(android.view.KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static final boolean d(android.view.KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
