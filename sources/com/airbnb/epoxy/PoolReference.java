package com.airbnb.epoxy;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/airbnb/epoxy/PoolReference;", "Landroidx/lifecycle/LifecycleObserver;", "", "onContextDestroyed", "()V", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PoolReference implements LifecycleObserver {
    public final RecyclerView.RecycledViewPool d;
    public final ActivityRecyclerPool e;
    public final WeakReference f;

    public PoolReference(Context context, RecyclerView.RecycledViewPool viewPool, ActivityRecyclerPool parent) {
        Intrinsics.h(viewPool, "viewPool");
        Intrinsics.h(parent, "parent");
        this.d = viewPool;
        this.e = parent;
        this.f = new WeakReference(context);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onContextDestroyed() {
        ActivityRecyclerPool activityRecyclerPool = this.e;
        activityRecyclerPool.getClass();
        if (ActivityRecyclerPoolKt.a((Context) this.f.get())) {
            this.d.a();
            activityRecyclerPool.f13303a.remove(this);
        }
    }
}
