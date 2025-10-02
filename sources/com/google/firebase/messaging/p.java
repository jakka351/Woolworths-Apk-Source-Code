package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.messaging.WithinAppServiceConnection;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                SharedPreferencesQueue sharedPreferencesQueue = (SharedPreferencesQueue) this.e;
                synchronized (sharedPreferencesQueue.d) {
                    SharedPreferences.Editor editorEdit = sharedPreferencesQueue.f15650a.edit();
                    String str = sharedPreferencesQueue.b;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = sharedPreferencesQueue.d.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append(sharedPreferencesQueue.c);
                    }
                    editorEdit.putString(str, sb.toString()).commit();
                }
                return;
            default:
                WithinAppServiceConnection.BindRequest bindRequest = (WithinAppServiceConnection.BindRequest) this.e;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + bindRequest.f15659a.getAction() + " finishing.");
                bindRequest.b.trySetResult(null);
                return;
        }
    }
}
