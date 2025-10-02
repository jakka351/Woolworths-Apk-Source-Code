package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@VisibleForTesting
/* loaded from: classes5.dex */
final class zaa extends LifecycleCallback {
    private List zaa;

    private zaa(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.zaa = new ArrayList();
        this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
    }

    public static /* synthetic */ zaa zaa(Activity activity) {
        zaa zaaVar;
        synchronized (activity) {
            try {
                LifecycleFragment fragment2 = LifecycleCallback.getFragment(activity);
                zaaVar = (zaa) fragment2.getCallbackOrNull("LifecycleObserverOnStop", zaa.class);
                if (zaaVar == null) {
                    zaaVar = new zaa(fragment2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zaaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zac, reason: merged with bridge method [inline-methods] */
    public final synchronized void zab(Runnable runnable) {
        this.zaa.add(runnable);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @MainThread
    public final void onStop() {
        List list;
        synchronized (this) {
            list = this.zaa;
            this.zaa = new ArrayList();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
