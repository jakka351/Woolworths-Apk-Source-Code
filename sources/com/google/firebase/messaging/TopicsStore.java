package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class TopicsStore {
    public static WeakReference c;

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferencesQueue f15655a;
    public final ScheduledThreadPoolExecutor b;

    public TopicsStore(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = scheduledThreadPoolExecutor;
    }

    public final synchronized TopicOperation a() {
        String str;
        TopicOperation topicOperation;
        SharedPreferencesQueue sharedPreferencesQueue = this.f15655a;
        synchronized (sharedPreferencesQueue.d) {
            str = (String) sharedPreferencesQueue.d.peek();
        }
        Pattern pattern = TopicOperation.d;
        topicOperation = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                topicOperation = new TopicOperation(strArrSplit[0], strArrSplit[1]);
            }
        }
        return topicOperation;
    }
}
