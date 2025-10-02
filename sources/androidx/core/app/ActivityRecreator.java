package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@RestrictTo
/* loaded from: classes2.dex */
final class ActivityRecreator {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f2388a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Handler f = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.ActivityRecreator$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: androidx.core.app.ActivityRecreator$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class LifecycleCheckCallbacks implements Application.ActivityLifecycleCallbacks {
        public boolean d;
        public boolean e;
        public boolean f;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (activity == null) {
                this.e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (!this.e || this.f || this.d) {
                return;
            }
            try {
                final Object obj = ActivityRecreator.c.get(activity);
                if (obj == null && activity.hashCode() == 0) {
                    final Object obj2 = ActivityRecreator.b.get(activity);
                    ActivityRecreator.f.postAtFrontOfQueue(new Runnable() { // from class: androidx.core.app.ActivityRecreator.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                Method method = ActivityRecreator.d;
                                Object obj3 = obj;
                                Object obj4 = obj2;
                                if (method != null) {
                                    method.invoke(obj4, obj3, Boolean.FALSE, "AppCompat recreation");
                                } else {
                                    ActivityRecreator.e.invoke(obj4, obj3, Boolean.FALSE);
                                }
                            } catch (RuntimeException e) {
                                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                                    throw e;
                                }
                            } catch (Throwable th) {
                                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                            }
                        }
                    });
                    this.f = true;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (activity == null) {
                this.d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f2388a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        c = declaredField2;
        Class cls2 = f2388a;
        Class cls3 = Boolean.TYPE;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, cls3, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
        }
        d = declaredMethod;
        Class cls4 = f2388a;
        if (cls4 != null) {
            try {
                Method declaredMethod2 = cls4.getDeclaredMethod("performStopActivity", IBinder.class, cls3);
                declaredMethod2.setAccessible(true);
                method = declaredMethod2;
            } catch (Throwable unused5) {
            }
        }
        e = method;
    }
}
