package com.google.firebase.firestore.core;

import android.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class ActivityScope {

    public static class CallbackList {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f15438a = new ArrayList();
    }

    public static class StopListenerFragment extends Fragment {
        public CallbackList d = new CallbackList();

        @Override // android.app.Fragment
        public final void onStop() {
            CallbackList callbackList;
            super.onStop();
            synchronized (this.d) {
                callbackList = this.d;
                this.d = new CallbackList();
            }
            Iterator it = callbackList.f15438a.iterator();
            while (it.hasNext()) {
                Runnable runnable = (Runnable) it.next();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public static class StopListenerSupportFragment extends androidx.fragment.app.Fragment {
        public CallbackList d = new CallbackList();

        @Override // androidx.fragment.app.Fragment
        public final void onStop() {
            CallbackList callbackList;
            super.onStop();
            synchronized (this.d) {
                callbackList = this.d;
                this.d = new CallbackList();
            }
            Iterator it = callbackList.f15438a.iterator();
            while (it.hasNext()) {
                Runnable runnable = (Runnable) it.next();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }
}
