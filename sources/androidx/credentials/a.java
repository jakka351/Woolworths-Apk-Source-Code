package androidx.credentials;

import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.credentials.ClearCredentialStateException;
import android.credentials.CreateCredentialException;
import android.credentials.GetCredentialException;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginCreateCredentialResponse;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.CreateEntry;
import android.service.credentials.RemoteEntry;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ ClearCredentialStateException b(String str, String str2) {
        return new ClearCredentialStateException(str, str2);
    }

    public static /* synthetic */ CreateCredentialException c(String str, String str2) {
        return new CreateCredentialException(str, str2);
    }

    public static /* bridge */ /* synthetic */ android.credentials.CredentialOption d(Object obj) {
        return (android.credentials.CredentialOption) obj;
    }

    public static /* synthetic */ GetCredentialException e(String str, String str2) {
        return new GetCredentialException(str, str2);
    }

    public static /* bridge */ /* synthetic */ GetCredentialException f(Throwable th) {
        return (GetCredentialException) th;
    }

    public static /* bridge */ /* synthetic */ android.credentials.PrepareGetCredentialResponse g(Object obj) {
        return (android.credentials.PrepareGetCredentialResponse) obj;
    }

    public static /* synthetic */ BeginCreateCredentialRequest j(String str, Bundle bundle, CallingAppInfo callingAppInfo) {
        return new BeginCreateCredentialRequest(str, bundle, callingAppInfo);
    }

    public static /* synthetic */ BeginCreateCredentialResponse.Builder k() {
        return new BeginCreateCredentialResponse.Builder();
    }

    public static /* synthetic */ CallingAppInfo m(String str, SigningInfo signingInfo, String str2) {
        return new CallingAppInfo(str, signingInfo, str2);
    }

    public static /* synthetic */ CreateEntry n(Slice slice) {
        return new CreateEntry(slice);
    }

    public static /* synthetic */ RemoteEntry o(Slice slice) {
        return new RemoteEntry(slice);
    }

    public static /* synthetic */ void t() {
    }

    public static /* synthetic */ void z() {
    }
}
