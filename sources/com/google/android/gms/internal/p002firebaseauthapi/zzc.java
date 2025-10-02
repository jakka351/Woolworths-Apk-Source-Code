package com.google.android.gms.internal.p002firebaseauthapi;

import com.dynatrace.android.callback.Callback;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes5.dex */
final class zzc extends zza {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zza
    public final URLConnection zza(URL url, String str) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        Callback.v(uRLConnectionOpenConnection);
        return uRLConnectionOpenConnection;
    }

    private zzc() {
    }
}
