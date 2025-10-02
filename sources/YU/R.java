package YU;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.cyberfend.cyfsecurity.CircleProgressBar;
import java.util.Observable;

/* loaded from: classes.dex */
public class R extends Observable implements Window.Callback {
    public static final HandlerThread e = new HandlerThread(CircleProgressBar.a("Z\\Y[B\\OCo@N~aAP"));
    public static boolean f = false;
    public final Window.Callback d;

    class G implements Runnable {
        public final /* synthetic */ MotionEvent d;
        public final /* synthetic */ int e;

        public G(MotionEvent motionEvent, int i) {
            this.d = motionEvent;
            this.e = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Q.c = 1;
            Q.d = 1;
            R r = R.this;
            r.setChanged();
            int i = this.e;
            r.notifyObservers(new UX(this.d, i != 1 ? 0 : 1, i));
        }
    }

    public R(Window.Callback callback) {
        this.d = callback;
        if (f) {
            HandlerThread handlerThread = e;
            if (handlerThread.isAlive()) {
                return;
            }
            handlerThread.start();
        }
    }

    public final void a(MotionEvent motionEvent, int i) {
        try {
            if (f) {
                HandlerThread handlerThread = e;
                if (handlerThread.isAlive()) {
                    new Handler(handlerThread.getLooper()).post(new G(motionEvent, i));
                    return;
                }
            }
            int i2 = 1;
            Q.c = 1;
            Q.d = 1;
            setChanged();
            if (i != 1) {
                i2 = 0;
            }
            notifyObservers(new UX(motionEvent, i2, i));
        } catch (Exception e2) {
            UB.a(e2);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.d.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.d.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.d.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.d.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Window.Callback callback = this.d;
        if (action == 0) {
            a(motionEventObtain, 2);
        } else if (action == 1) {
            a(motionEventObtain, 3);
        } else if (action != 2) {
            if (action != 5) {
                if (action != 6) {
                    return callback.dispatchTouchEvent(motionEvent);
                }
                a(motionEventObtain, 3);
            }
            a(motionEventObtain, 2);
        } else {
            a(motionEventObtain, 1);
        }
        return callback.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.d.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.d.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.d.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.d.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.d.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        return this.d.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.d.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.d.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.d.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        return this.d.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        this.d.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        return this.d.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.d.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.d.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.d.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.d.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.d.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.d.onWindowStartingActionMode(callback, i);
    }
}
