package com.google.firebase.iid.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;

@KeepForSdk
/* loaded from: classes.dex */
public interface FirebaseInstanceIdInternal {

    @KeepForSdk
    /* loaded from: classes6.dex */
    public interface NewTokenListener {
    }

    String a();

    void b();

    Task c();
}
