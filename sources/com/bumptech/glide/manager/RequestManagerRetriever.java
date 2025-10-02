package com.bumptech.glide.manager;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class RequestManagerRetriever implements Handler.Callback {
    public static final RequestManagerFactory i = new AnonymousClass1();
    public volatile RequestManager d;
    public final RequestManagerFactory e;
    public final ArrayMap f = new ArrayMap(0);
    public final FrameWaiter g;
    public final LifecycleRequestManagerRetriever h;

    /* renamed from: com.bumptech.glide.manager.RequestManagerRetriever$1, reason: invalid class name */
    public class AnonymousClass1 implements RequestManagerFactory {
        @Override // com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory
        public final RequestManager a(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
            return new RequestManager(glide, lifecycle, requestManagerTreeNode, context);
        }
    }

    public interface RequestManagerFactory {
        RequestManager a(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context);
    }

    public RequestManagerRetriever() {
        RequestManagerFactory requestManagerFactory = i;
        this.e = requestManagerFactory;
        this.h = new LifecycleRequestManagerRetriever(requestManagerFactory);
        this.g = (HardwareConfigState.f && HardwareConfigState.e) ? new FirstFrameWaiter() : new DoNothingFirstFrameWaiter();
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void b(List list, ArrayMap arrayMap) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null && fragment2.getView() != null) {
                arrayMap.put(fragment2.getView(), fragment2);
                b(fragment2.getChildFragmentManager().N(), arrayMap);
            }
        }
    }

    public final RequestManager c(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = Util.f13989a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return e((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return c(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        this.d = this.e.a(Glide.a(context.getApplicationContext()), new ApplicationLifecycle(), new EmptyRequestManagerTreeNode(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final RequestManager d(View view) {
        char[] cArr = Util.f13989a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(view.getContext().getApplicationContext());
        }
        Preconditions.b(view);
        Preconditions.c(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityA = a(view.getContext());
        if (activityA != null && (activityA instanceof FragmentActivity)) {
            FragmentActivity fragmentActivity = (FragmentActivity) activityA;
            ArrayMap arrayMap = this.f;
            arrayMap.clear();
            b(fragmentActivity.getSupportFragmentManager().N(), arrayMap);
            View viewFindViewById = fragmentActivity.findViewById(R.id.content);
            Fragment fragment2 = null;
            while (!view.equals(viewFindViewById) && (fragment2 = (Fragment) arrayMap.get(view)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            arrayMap.clear();
            if (fragment2 == null) {
                return e(fragmentActivity);
            }
            Preconditions.c(fragment2.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
            if (!(Looper.myLooper() == Looper.getMainLooper())) {
                return c(fragment2.getContext().getApplicationContext());
            }
            if (fragment2.getActivity() != null) {
                this.g.a(fragment2.getActivity());
            }
            FragmentManager childFragmentManager = fragment2.getChildFragmentManager();
            Context context = fragment2.getContext();
            return this.h.a(context, Glide.a(context.getApplicationContext()), fragment2.getD(), childFragmentManager, fragment2.isVisible());
        }
        return c(view.getContext().getApplicationContext());
    }

    public final RequestManager e(FragmentActivity fragmentActivity) {
        char[] cArr = Util.f13989a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(fragmentActivity.getApplicationContext());
        }
        if (fragmentActivity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.g.a(fragmentActivity);
        Activity activityA = a(fragmentActivity);
        return this.h.a(fragmentActivity, Glide.a(fragmentActivity.getApplicationContext()), fragmentActivity.getD(), fragmentActivity.getSupportFragmentManager(), activityA == null || !activityA.isFinishing());
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
