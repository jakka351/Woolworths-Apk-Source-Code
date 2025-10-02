package com.google.firebase.remoteconfig;

/* loaded from: classes.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    public final int d;

    public FirebaseRemoteConfigServerException(int i, String str) {
        super(str);
        this.d = i;
    }

    public FirebaseRemoteConfigServerException(int i, String str, FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        super(str, firebaseRemoteConfigServerException);
        this.d = i;
    }

    public FirebaseRemoteConfigServerException(int i, String str, int i2) {
        super(str);
        this.d = i;
    }

    public FirebaseRemoteConfigServerException(String str) {
        super(str);
        this.d = -1;
    }
}
