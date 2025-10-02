package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
final class SharedPreferencesQueue {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f15650a;
    public final ScheduledThreadPoolExecutor e;
    public final ArrayDeque d = new ArrayDeque();
    public final String b = "topic_operation_queue";
    public final String c = ",";

    public SharedPreferencesQueue(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f15650a = sharedPreferences;
        this.e = scheduledThreadPoolExecutor;
    }

    public static SharedPreferencesQueue a(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        SharedPreferencesQueue sharedPreferencesQueue = new SharedPreferencesQueue(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (sharedPreferencesQueue.d) {
            try {
                sharedPreferencesQueue.d.clear();
                String string = sharedPreferencesQueue.f15650a.getString(sharedPreferencesQueue.b, "");
                if (!TextUtils.isEmpty(string) && string.contains(sharedPreferencesQueue.c)) {
                    String[] strArrSplit = string.split(sharedPreferencesQueue.c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            sharedPreferencesQueue.d.add(str);
                        }
                    }
                    return sharedPreferencesQueue;
                }
                return sharedPreferencesQueue;
            } finally {
            }
        }
    }
}
