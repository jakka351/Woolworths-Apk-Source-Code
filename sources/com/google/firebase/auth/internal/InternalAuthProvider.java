package com.google.firebase.auth.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.auth.a;
import com.google.firebase.internal.InternalTokenProvider;

@KeepForSdk
/* loaded from: classes.dex */
public interface InternalAuthProvider extends InternalTokenProvider {
    String a();

    void b(a aVar);

    Task c(boolean z);
}
