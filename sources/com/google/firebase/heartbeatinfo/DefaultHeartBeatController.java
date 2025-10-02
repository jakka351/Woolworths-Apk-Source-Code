package com.google.firebase.heartbeatinfo;

import android.content.Context;
import androidx.core.os.UserManagerCompat;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.Lazy;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public class DefaultHeartBeatController implements HeartBeatController, HeartBeatInfo {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f15606a;
    public final Context b;
    public final Provider c;
    public final Set d;
    public final Executor e;

    public DefaultHeartBeatController(final Context context, final String str, Set set, Provider provider, Executor executor) {
        this.f15606a = new Lazy(new Provider() { // from class: com.google.firebase.heartbeatinfo.c
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return new HeartBeatInfoStorage(context, str);
            }
        });
        this.d = set;
        this.e = executor;
        this.c = provider;
        this.b = context;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatController
    public final Task a() {
        if (!UserManagerCompat.a(this.b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.e, new a(this, 0));
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public final synchronized HeartBeatInfo.HeartBeat b() {
        boolean zE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        final HeartBeatInfoStorage heartBeatInfoStorage = (HeartBeatInfoStorage) this.f15606a.get();
        synchronized (heartBeatInfoStorage) {
            zE = heartBeatInfoStorage.e(HeartBeatInfoStorage.b, jCurrentTimeMillis);
        }
        if (!zE) {
            return HeartBeatInfo.HeartBeat.NONE;
        }
        synchronized (heartBeatInfoStorage) {
            final String strB = heartBeatInfoStorage.b(System.currentTimeMillis());
            heartBeatInfoStorage.f15607a.a(new Function1() { // from class: com.google.firebase.heartbeatinfo.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    MutablePreferences mutablePreferences = (MutablePreferences) obj;
                    Preferences.Key key = HeartBeatInfoStorage.b;
                    HeartBeatInfoStorage heartBeatInfoStorage2 = heartBeatInfoStorage;
                    heartBeatInfoStorage2.getClass();
                    Preferences.Key key2 = HeartBeatInfoStorage.d;
                    String str = strB;
                    mutablePreferences.e(key2, str);
                    heartBeatInfoStorage2.d(mutablePreferences, str);
                    return null;
                }
            });
        }
        return HeartBeatInfo.HeartBeat.GLOBAL;
    }

    public final void c() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!UserManagerCompat.a(this.b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.e, new a(this, 1));
        }
    }
}
