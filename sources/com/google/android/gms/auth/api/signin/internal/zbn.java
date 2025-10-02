package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes5.dex */
public final class zbn {

    @Nullable
    private static zbn zbd;

    @VisibleForTesting
    final Storage zba;

    @Nullable
    @VisibleForTesting
    GoogleSignInAccount zbb;

    @Nullable
    @VisibleForTesting
    GoogleSignInOptions zbc;

    private zbn(Context context) {
        Storage storage = Storage.getInstance(context);
        this.zba = storage;
        this.zbb = storage.getSavedDefaultGoogleSignInAccount();
        this.zbc = storage.getSavedDefaultGoogleSignInOptions();
    }

    public static synchronized zbn zba(@NonNull Context context) {
        return zbf(context.getApplicationContext());
    }

    private static synchronized zbn zbf(Context context) {
        zbn zbnVar = zbd;
        if (zbnVar != null) {
            return zbnVar;
        }
        zbn zbnVar2 = new zbn(context);
        zbd = zbnVar2;
        return zbnVar2;
    }

    public final synchronized void zbb() {
        this.zba.clear();
        this.zbb = null;
        this.zbc = null;
    }

    public final synchronized void zbc(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.zba.saveDefaultGoogleSignInAccount(googleSignInAccount, googleSignInOptions);
        this.zbb = googleSignInAccount;
        this.zbc = googleSignInOptions;
    }

    @Nullable
    public final synchronized GoogleSignInAccount zbd() {
        return this.zbb;
    }

    @Nullable
    public final synchronized GoogleSignInOptions zbe() {
        return this.zbc;
    }
}
