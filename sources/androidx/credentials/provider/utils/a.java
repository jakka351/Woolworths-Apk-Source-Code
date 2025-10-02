package androidx.credentials.provider.utils;

import android.app.slice.Slice;
import android.os.Bundle;
import android.service.credentials.Action;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.BeginGetCredentialResponse;
import android.service.credentials.CreateEntry;
import android.service.credentials.CredentialEntry;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ Action d(Slice slice) {
        return new Action(slice);
    }

    public static /* synthetic */ BeginGetCredentialOption f(Bundle bundle, String str, String str2) {
        return new BeginGetCredentialOption(str, str2, bundle);
    }

    public static /* bridge */ /* synthetic */ BeginGetCredentialOption g(Object obj) {
        return (BeginGetCredentialOption) obj;
    }

    public static /* synthetic */ BeginGetCredentialOption h(String str, String str2) {
        return new BeginGetCredentialOption(str, str2, Bundle.EMPTY);
    }

    public static /* synthetic */ BeginGetCredentialRequest.Builder i() {
        return new BeginGetCredentialRequest.Builder();
    }

    public static /* synthetic */ BeginGetCredentialResponse.Builder l() {
        return new BeginGetCredentialResponse.Builder();
    }

    public static /* bridge */ /* synthetic */ CreateEntry o(Object obj) {
        return (CreateEntry) obj;
    }

    public static /* synthetic */ CredentialEntry p(BeginGetCredentialOption beginGetCredentialOption, Slice slice) {
        return new CredentialEntry(beginGetCredentialOption, slice);
    }

    public static /* synthetic */ void s() {
    }

    public static /* synthetic */ void y() {
    }
}
