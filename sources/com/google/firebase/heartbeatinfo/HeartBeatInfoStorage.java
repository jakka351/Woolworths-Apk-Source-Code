package com.google.firebase.heartbeatinfo;

import android.content.Context;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.google.firebase.datastorage.JavaDataStorage;
import com.google.firebase.datastorage.JavaDataStorageKt;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
class HeartBeatInfoStorage {
    public static final Preferences.Key b = PreferencesKeys.b("fire-global");
    public static final Preferences.Key c = PreferencesKeys.b("fire-count");
    public static final Preferences.Key d = PreferencesKeys.c("last-used-date");

    /* renamed from: a, reason: collision with root package name */
    public final JavaDataStorage f15607a;

    public HeartBeatInfoStorage(Context context, String str) {
        this.f15607a = new JavaDataStorage(context, YU.a.A("FirebaseHeartBeat", str));
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            for (Map.Entry entry : this.f15607a.b().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(HeartBeatResult.a(((Preferences.Key) entry.getKey()).f2589a, new ArrayList(hashSet)));
                    }
                }
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f15607a.a(new Function1() { // from class: com.google.firebase.heartbeatinfo.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((MutablePreferences) obj).e(HeartBeatInfoStorage.b, Long.valueOf(jCurrentTimeMillis));
                        return null;
                    }
                });
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String b(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized Preferences.Key c(MutablePreferences mutablePreferences, String str) {
        for (Map.Entry entry : mutablePreferences.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return PreferencesKeys.d(((Preferences.Key) entry.getKey()).f2589a);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void d(MutablePreferences mutablePreferences, String str) {
        try {
            Preferences.Key keyC = c(mutablePreferences, str);
            if (keyC == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.a(mutablePreferences, keyC, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                mutablePreferences.d(keyC);
            } else {
                mutablePreferences.f(keyC, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean e(Preferences.Key key, long j) {
        long jLongValue;
        jLongValue = ((Long) this.f15607a.c(key)).longValue();
        synchronized (this) {
        }
        if (b(jLongValue).equals(b(j))) {
            return false;
        }
        this.f15607a.d(key, Long.valueOf(j));
        return true;
    }
}
