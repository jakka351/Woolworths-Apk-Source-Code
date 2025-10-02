package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public interface zabv {
    BaseImplementation.ApiMethodImpl zab(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl);

    BaseImplementation.ApiMethodImpl zac(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl);

    @Nullable
    ConnectionResult zad(@NonNull Api api);

    void zae();

    ConnectionResult zaf();

    ConnectionResult zag(long j, TimeUnit timeUnit);

    void zah();

    boolean zai();

    boolean zaj();

    boolean zak(SignInConnectionListener signInConnectionListener);

    void zal();

    void zam();

    void zan(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr);
}
