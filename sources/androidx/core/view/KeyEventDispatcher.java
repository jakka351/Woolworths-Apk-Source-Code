package androidx.core.view;

import android.view.KeyEvent;
import androidx.annotation.RestrictTo;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes2.dex */
public class KeyEventDispatcher {

    /* loaded from: classes.dex */
    public interface Component {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    public static void a() {
        WeakHashMap weakHashMap = ViewCompat.f2488a;
    }

    public static boolean b(Component component, KeyEvent keyEvent) {
        if (component == null) {
            return false;
        }
        return component.superDispatchKeyEvent(keyEvent);
    }
}
