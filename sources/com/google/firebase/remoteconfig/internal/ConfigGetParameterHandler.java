package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.camera.core.processing.g;
import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes.dex */
public class ConfigGetParameterHandler {
    public static final Pattern e;
    public static final Pattern f;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f15766a = new HashSet();
    public final Executor b;
    public final ConfigCacheClient c;
    public final ConfigCacheClient d;

    static {
        Charset.forName("UTF-8");
        e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public ConfigGetParameterHandler(Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        this.b = executor;
        this.c = configCacheClient;
        this.d = configCacheClient2;
    }

    public static HashSet a(ConfigCacheClient configCacheClient) {
        HashSet hashSet = new HashSet();
        ConfigContainer configContainerC = configCacheClient.c();
        if (configContainerC != null) {
            Iterator<String> itKeys = configContainerC.b.keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    public final FirebaseRemoteConfigValueImpl b(String str) throws JSONException {
        String string;
        ConfigContainer configContainerC = this.c.c();
        String string2 = null;
        if (configContainerC == null) {
            string = null;
        } else {
            try {
                string = configContainerC.b.getString(str);
            } catch (JSONException unused) {
            }
        }
        if (string == null) {
            ConfigContainer configContainerC2 = this.d.c();
            if (configContainerC2 != null) {
                try {
                    string2 = configContainerC2.b.getString(str);
                } catch (JSONException unused2) {
                }
            }
            if (string2 != null) {
                return new FirebaseRemoteConfigValueImpl(string2, 1);
            }
            Log.w("FirebaseRemoteConfig", "No value of type 'FirebaseRemoteConfigValue' exists for parameter key '" + str + "'.");
            return new FirebaseRemoteConfigValueImpl("", 0);
        }
        ConfigContainer configContainerC3 = this.c.c();
        if (configContainerC3 != null) {
            synchronized (this.f15766a) {
                try {
                    Iterator it = this.f15766a.iterator();
                    while (it.hasNext()) {
                        this.b.execute(new g(20, (BiConsumer) it.next(), str, configContainerC3));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new FirebaseRemoteConfigValueImpl(string, 2);
    }
}
