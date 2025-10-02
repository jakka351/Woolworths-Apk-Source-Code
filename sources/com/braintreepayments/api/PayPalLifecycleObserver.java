package com.braintreepayments.api;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes4.dex */
class PayPalLifecycleObserver implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            FragmentActivity activity = lifecycleOwner instanceof FragmentActivity ? (FragmentActivity) lifecycleOwner : lifecycleOwner instanceof Fragment ? ((Fragment) lifecycleOwner).getActivity() : null;
            if (activity != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable(activity) { // from class: com.braintreepayments.api.PayPalLifecycleObserver.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        throw null;
                    }
                });
            }
        }
    }
}
