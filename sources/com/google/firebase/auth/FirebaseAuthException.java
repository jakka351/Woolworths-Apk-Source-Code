package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;

/* loaded from: classes6.dex */
public class FirebaseAuthException extends FirebaseException {
    public final String d;

    public FirebaseAuthException(String str, String str2) {
        super(str2);
        this.d = Preconditions.checkNotEmpty(str);
    }
}
