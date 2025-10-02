package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.util.Util;
import java.util.HashMap;

/* loaded from: classes.dex */
final class LifecycleRequestManagerRetriever {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13952a = new HashMap();
    public final RequestManagerRetriever.RequestManagerFactory b;

    /* loaded from: classes4.dex */
    public final class SupportRequestManagerTreeNode implements RequestManagerTreeNode {
        public SupportRequestManagerTreeNode(LifecycleRequestManagerRetriever lifecycleRequestManagerRetriever, FragmentManager fragmentManager) {
        }
    }

    public LifecycleRequestManagerRetriever(RequestManagerRetriever.RequestManagerFactory requestManagerFactory) {
        this.b = requestManagerFactory;
    }

    public final RequestManager a(Context context, Glide glide, final androidx.lifecycle.Lifecycle lifecycle, FragmentManager fragmentManager, boolean z) {
        Util.a();
        Util.a();
        HashMap map = this.f13952a;
        RequestManager requestManager = (RequestManager) map.get(lifecycle);
        if (requestManager != null) {
            return requestManager;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
        RequestManager requestManagerA = this.b.a(glide, lifecycleLifecycle, new SupportRequestManagerTreeNode(this, fragmentManager), context);
        map.put(lifecycle, requestManagerA);
        lifecycleLifecycle.b(new LifecycleListener() { // from class: com.bumptech.glide.manager.LifecycleRequestManagerRetriever.1
            @Override // com.bumptech.glide.manager.LifecycleListener
            public final void onDestroy() {
                LifecycleRequestManagerRetriever.this.f13952a.remove(lifecycle);
            }

            @Override // com.bumptech.glide.manager.LifecycleListener
            public final void onStart() {
            }

            @Override // com.bumptech.glide.manager.LifecycleListener
            public final void onStop() {
            }
        });
        if (z) {
            requestManagerA.onStart();
        }
        return requestManagerA;
    }
}
