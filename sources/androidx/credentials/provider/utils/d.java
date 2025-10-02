package androidx.credentials.provider.utils;

import android.net.http.NetworkException;
import android.net.http.UrlResponseInfo;
import android.service.credentials.Action;
import android.service.credentials.CredentialEntry;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class d {
    public static /* bridge */ /* synthetic */ NetworkException f(Object obj) {
        return (NetworkException) obj;
    }

    public static /* bridge */ /* synthetic */ UrlResponseInfo j(Object obj) {
        return (UrlResponseInfo) obj;
    }

    public static /* bridge */ /* synthetic */ Action k(Object obj) {
        return (Action) obj;
    }

    public static /* bridge */ /* synthetic */ CredentialEntry m(Object obj) {
        return (CredentialEntry) obj;
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof NetworkException;
    }
}
