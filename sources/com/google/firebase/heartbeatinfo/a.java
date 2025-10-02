package com.google.firebase.heartbeatinfo;

import android.util.Base64OutputStream;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.google.firebase.datastorage.JavaDataStorageKt;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ DefaultHeartBeatController e;

    public /* synthetic */ a(DefaultHeartBeatController defaultHeartBeatController, int i) {
        this.d = i;
        this.e = defaultHeartBeatController;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.d) {
            case 0:
                DefaultHeartBeatController defaultHeartBeatController = this.e;
                synchronized (defaultHeartBeatController) {
                    try {
                        final HeartBeatInfoStorage heartBeatInfoStorage = (HeartBeatInfoStorage) defaultHeartBeatController.f15606a.get();
                        ArrayList arrayListA = heartBeatInfoStorage.a();
                        synchronized (heartBeatInfoStorage) {
                            heartBeatInfoStorage.f15607a.a(new Function1() { // from class: com.google.firebase.heartbeatinfo.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    MutablePreferences mutablePreferences = (MutablePreferences) obj;
                                    Preferences.Key key = HeartBeatInfoStorage.c;
                                    long j = 0;
                                    for (Map.Entry entry : mutablePreferences.a().entrySet()) {
                                        if (entry.getValue() instanceof Set) {
                                            Preferences.Key key2 = (Preferences.Key) entry.getKey();
                                            Set set = (Set) entry.getValue();
                                            String strB = heartBeatInfoStorage.b(System.currentTimeMillis());
                                            if (set.contains(strB)) {
                                                mutablePreferences.e(key2, com.google.android.gms.common.api.internal.a.k(strB));
                                                j++;
                                            } else {
                                                mutablePreferences.d(key2);
                                            }
                                        }
                                    }
                                    if (j == 0) {
                                        mutablePreferences.d(key);
                                        return null;
                                    }
                                    mutablePreferences.e(key, Long.valueOf(j));
                                    return null;
                                }
                            });
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListA.size(); i++) {
                            HeartBeatResult heartBeatResult = (HeartBeatResult) arrayListA.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", heartBeatResult.c());
                            jSONObject.put("dates", new JSONArray((Collection) heartBeatResult.b()));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return string;
            default:
                DefaultHeartBeatController defaultHeartBeatController2 = this.e;
                synchronized (defaultHeartBeatController2) {
                    final HeartBeatInfoStorage heartBeatInfoStorage2 = (HeartBeatInfoStorage) defaultHeartBeatController2.f15606a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    final String strA = ((UserAgentPublisher) defaultHeartBeatController2.c.get()).a();
                    synchronized (heartBeatInfoStorage2) {
                        final String strB = heartBeatInfoStorage2.b(jCurrentTimeMillis);
                        final Preferences.Key keyD = PreferencesKeys.d(strA);
                        heartBeatInfoStorage2.f15607a.a(new Function1() { // from class: com.google.firebase.heartbeatinfo.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Object obj2;
                                HeartBeatInfoStorage heartBeatInfoStorage3 = heartBeatInfoStorage2;
                                String str = strB;
                                String str2 = strA;
                                Preferences.Key key = keyD;
                                MutablePreferences mutablePreferences = (MutablePreferences) obj;
                                Preferences.Key key2 = HeartBeatInfoStorage.b;
                                Object obj3 = null;
                                if (((String) JavaDataStorageKt.a(mutablePreferences, HeartBeatInfoStorage.d, "")).equals(str)) {
                                    Preferences.Key keyC = heartBeatInfoStorage3.c(mutablePreferences, str);
                                    if (keyC == null || keyC.f2589a.equals(str2)) {
                                        return null;
                                    }
                                    synchronized (heartBeatInfoStorage3) {
                                        heartBeatInfoStorage3.d(mutablePreferences, str);
                                        HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.a(mutablePreferences, key, new HashSet()));
                                        hashSet.add(str);
                                        mutablePreferences.f(key, hashSet);
                                    }
                                    return null;
                                }
                                Preferences.Key key3 = HeartBeatInfoStorage.c;
                                long jLongValue = ((Long) JavaDataStorageKt.a(mutablePreferences, key3, 0L)).longValue();
                                if (jLongValue + 1 == 30) {
                                    synchronized (heartBeatInfoStorage3) {
                                        try {
                                            long jLongValue2 = ((Long) JavaDataStorageKt.a(mutablePreferences, key3, 0L)).longValue();
                                            String str3 = "";
                                            Set hashSet2 = new HashSet();
                                            String str4 = null;
                                            for (Map.Entry entry : mutablePreferences.a().entrySet()) {
                                                if (entry.getValue() instanceof Set) {
                                                    Set<String> set = (Set) entry.getValue();
                                                    for (String str5 : set) {
                                                        Object obj4 = obj3;
                                                        if (str4 == null || str4.compareTo(str5) > 0) {
                                                            str3 = ((Preferences.Key) entry.getKey()).f2589a;
                                                            str4 = str5;
                                                            hashSet2 = set;
                                                        }
                                                        obj3 = obj4;
                                                    }
                                                }
                                                obj3 = obj3;
                                            }
                                            obj2 = obj3;
                                            HashSet hashSet3 = new HashSet(hashSet2);
                                            hashSet3.remove(str4);
                                            mutablePreferences.f(PreferencesKeys.d(str3), hashSet3);
                                            jLongValue = jLongValue2 - 1;
                                            mutablePreferences.e(HeartBeatInfoStorage.c, Long.valueOf(jLongValue));
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                } else {
                                    obj2 = null;
                                }
                                HashSet hashSet4 = new HashSet((Collection) JavaDataStorageKt.a(mutablePreferences, key, new HashSet()));
                                hashSet4.add(str);
                                mutablePreferences.f(key, hashSet4);
                                mutablePreferences.e(HeartBeatInfoStorage.c, Long.valueOf(jLongValue + 1));
                                mutablePreferences.e(HeartBeatInfoStorage.d, str);
                                return obj2;
                            }
                        });
                    }
                }
                return null;
        }
    }
}
