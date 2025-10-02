package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ConfigSharedPrefsClient {
    public static final Date e = new Date(-1);
    public static final Date f = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f15770a;
    public final Object b = new Object();
    public final Object c = new Object();
    public final Object d = new Object();

    public static class BackoffMetadata {

        /* renamed from: a, reason: collision with root package name */
        public int f15771a;
        public Date b;
    }

    public static class RealtimeBackoffMetadata {

        /* renamed from: a, reason: collision with root package name */
        public int f15772a;
        public Date b;
    }

    public ConfigSharedPrefsClient(SharedPreferences sharedPreferences) {
        this.f15770a = sharedPreferences;
    }

    public final BackoffMetadata a() {
        BackoffMetadata backoffMetadata;
        synchronized (this.c) {
            int i = this.f15770a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f15770a.getLong("backoff_end_time_in_millis", -1L));
            backoffMetadata = new BackoffMetadata();
            backoffMetadata.f15771a = i;
            backoffMetadata.b = date;
        }
        return backoffMetadata;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f15770a.getString("customSignals", "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public final RealtimeBackoffMetadata c() {
        RealtimeBackoffMetadata realtimeBackoffMetadata;
        synchronized (this.d) {
            int i = this.f15770a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f15770a.getLong("realtime_backoff_end_time_in_millis", -1L));
            realtimeBackoffMetadata = new RealtimeBackoffMetadata();
            realtimeBackoffMetadata.f15772a = i;
            realtimeBackoffMetadata.b = date;
        }
        return realtimeBackoffMetadata;
    }

    public final void d(int i, Date date) {
        synchronized (this.c) {
            this.f15770a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(int i, Date date) {
        synchronized (this.d) {
            this.f15770a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
