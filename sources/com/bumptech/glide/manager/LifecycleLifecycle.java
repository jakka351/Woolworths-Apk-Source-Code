package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bumptech.glide.util.Util;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class LifecycleLifecycle implements Lifecycle, LifecycleObserver {
    public final HashSet d = new HashSet();
    public final androidx.lifecycle.Lifecycle e;

    public LifecycleLifecycle(androidx.lifecycle.Lifecycle lifecycle) {
        this.e = lifecycle;
        lifecycle.a(this);
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public final void a(LifecycleListener lifecycleListener) {
        this.d.remove(lifecycleListener);
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public final void b(LifecycleListener lifecycleListener) {
        this.d.add(lifecycleListener);
        androidx.lifecycle.Lifecycle lifecycle = this.e;
        if (lifecycle.getD() == Lifecycle.State.d) {
            lifecycleListener.onDestroy();
        } else if (lifecycle.getD().compareTo(Lifecycle.State.g) >= 0) {
            lifecycleListener.onStart();
        } else {
            lifecycleListener.onStop();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = Util.e(this.d).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onDestroy();
        }
        lifecycleOwner.getD().c(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = Util.e(this.d).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = Util.e(this.d).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStop();
        }
    }
}
