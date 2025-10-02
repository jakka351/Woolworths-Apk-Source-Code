package com.otaliastudios.zoom.internal;

import android.view.MotionEvent;
import com.otaliastudios.zoom.ZoomLogger;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/otaliastudios/zoom/internal/StateController;", "", "Callback", "Companion", "State", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class StateController {
    public static final ZoomLogger c = new ZoomLogger("StateController");

    /* renamed from: a, reason: collision with root package name */
    public final Callback f16816a;
    public int b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/zoom/internal/StateController$Callback;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Callback {
        void a();

        void b();

        boolean c(MotionEvent motionEvent);

        void g(int i);

        boolean h();

        boolean j(MotionEvent motionEvent);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u001c\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004¨\u0006\u0013"}, d2 = {"Lcom/otaliastudios/zoom/internal/StateController$Companion;", "", "", "ANIMATING", "I", "FLINGING", "IDLE", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "PINCHING", "SCROLLING", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "TOUCH_LISTEN", "TOUCH_NO", "TOUCH_STEAL", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/zoom/internal/StateController$State;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface State {
    }

    public StateController(Callback callback) {
        this.f16816a = callback;
    }

    public static String c(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "FLINGING" : "ANIMATING" : "PINCHING" : "SCROLLING" : "IDLE";
    }

    public final int a(MotionEvent motionEvent) {
        int actionMasked;
        ZoomLogger zoomLogger = c;
        zoomLogger.d("processTouchEvent:", "start.");
        if (this.b == 3) {
            return 2;
        }
        Callback callback = this.f16816a;
        boolean zJ = callback.j(motionEvent);
        zoomLogger.d("processTouchEvent:", "scaleResult:", Boolean.valueOf(zJ));
        if (this.b != 2) {
            zJ |= callback.c(motionEvent);
            zoomLogger.d("processTouchEvent:", "flingResult:", Boolean.valueOf(zJ));
        }
        if (this.b == 1 && ((actionMasked = motionEvent.getActionMasked()) == 1 || actionMasked == 3)) {
            zoomLogger.b("processTouchEvent:", "up event while scrolling, dispatching endScrollGesture.");
            callback.b();
        }
        if (zJ && this.b != 0) {
            zoomLogger.d("processTouchEvent:", "returning: TOUCH_STEAL");
            return 2;
        }
        if (zJ) {
            zoomLogger.d("processTouchEvent:", "returning: TOUCH_LISTEN");
            return 1;
        }
        zoomLogger.d("processTouchEvent:", "returning: TOUCH_NO");
        b(0);
        return 0;
    }

    public final boolean b(int i) {
        Object[] objArr = {"trySetState:", c(i)};
        ZoomLogger zoomLogger = c;
        zoomLogger.d(objArr);
        Callback callback = this.f16816a;
        if (!callback.h()) {
            return false;
        }
        int i2 = this.b;
        if (i == i2 && i != 3) {
            return true;
        }
        if (i == 0) {
            callback.a();
        } else if (i != 1) {
            if (i != 2) {
                if (i == 4 && i2 == 3) {
                    return false;
                }
            } else if (i2 == 3) {
                return false;
            }
        } else if (i2 == 2 || i2 == 3) {
            return false;
        }
        callback.g(i2);
        zoomLogger.b("setState:", c(i));
        this.b = i;
        return true;
    }
}
