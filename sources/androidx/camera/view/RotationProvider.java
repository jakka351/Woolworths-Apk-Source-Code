package androidx.camera.view;

import android.content.Context;
import android.view.OrientationEventListener;
import androidx.annotation.NonNull;
import androidx.camera.view.RotationProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class RotationProvider {
    public final OrientationEventListener b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f653a = new Object();
    public final HashMap c = new HashMap();

    public interface Listener {
        void a(int i);
    }

    public static class ListenerWrapper {

        /* renamed from: a, reason: collision with root package name */
        public final Listener f655a;
        public final Executor b;
        public final AtomicBoolean c = new AtomicBoolean(true);

        public ListenerWrapper(e eVar, Executor executor) {
            this.f655a = eVar;
            this.b = executor;
        }
    }

    public RotationProvider(@NonNull Context context) {
        this.b = new OrientationEventListener(context) { // from class: androidx.camera.view.RotationProvider.1

            /* renamed from: a, reason: collision with root package name */
            public int f654a = -1;

            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i) {
                ArrayList arrayList;
                if (i == -1) {
                    return;
                }
                final int i2 = (i >= 315 || i < 45) ? 0 : i >= 225 ? 1 : i >= 135 ? 2 : 3;
                if (this.f654a != i2) {
                    this.f654a = i2;
                    synchronized (RotationProvider.this.f653a) {
                        arrayList = new ArrayList(RotationProvider.this.c.values());
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        final ListenerWrapper listenerWrapper = (ListenerWrapper) it.next();
                        listenerWrapper.b.execute(new Runnable() { // from class: androidx.camera.view.i
                            @Override // java.lang.Runnable
                            public final void run() {
                                RotationProvider.ListenerWrapper listenerWrapper2 = listenerWrapper;
                                if (listenerWrapper2.c.get()) {
                                    listenerWrapper2.f655a.a(i2);
                                }
                            }
                        });
                    }
                }
            }
        };
    }
}
