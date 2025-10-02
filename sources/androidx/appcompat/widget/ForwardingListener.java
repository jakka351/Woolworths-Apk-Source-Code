package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ShowableListMenu;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

@RestrictTo
/* loaded from: classes2.dex */
public abstract class ForwardingListener implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float d;
    public final int e;
    public final int f;
    public final View g;
    public Runnable h;
    public Runnable i;
    public boolean j;
    public int k;
    public final int[] l = new int[2];

    public class DisallowIntercept implements Runnable {
        public DisallowIntercept() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = ForwardingListener.this.g.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class TriggerLongPress implements Runnable {
        public TriggerLongPress() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ForwardingListener forwardingListener = ForwardingListener.this;
            forwardingListener.b();
            View view = forwardingListener.g;
            if (view.isEnabled() && !view.isLongClickable() && forwardingListener.d()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                forwardingListener.j = true;
            }
        }
    }

    public ForwardingListener(View view) {
        this.g = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.d = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.e = tapTimeout;
        this.f = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void b() {
        Runnable runnable = this.i;
        View view = this.g;
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.h;
        if (runnable2 != null) {
            view.removeCallbacks(runnable2);
        }
    }

    public abstract ShowableListMenu c();

    public boolean d() {
        ShowableListMenu showableListMenuC = c();
        if (showableListMenuC == null || showableListMenuC.b()) {
            return true;
        }
        showableListMenuC.a();
        return true;
    }

    public boolean e() {
        ShowableListMenu showableListMenuC = c();
        if (showableListMenuC == null || !showableListMenuC.b()) {
            return true;
        }
        showableListMenuC.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ForwardingListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.j = false;
        this.k = -1;
        Runnable runnable = this.h;
        if (runnable != null) {
            this.g.removeCallbacks(runnable);
        }
    }
}
