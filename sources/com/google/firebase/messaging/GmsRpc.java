package com.google.firebase.messaging;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
class GmsRpc {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseApp f15644a;
    public final Metadata b;
    public final Rpc c;
    public final Provider d;
    public final Provider e;
    public final FirebaseInstallationsApi f;

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        firebaseApp.a();
        Rpc rpc = new Rpc(firebaseApp.f15169a);
        this.f15644a = firebaseApp;
        this.b = metadata;
        this.c = rpc;
        this.d = provider;
        this.e = provider2;
        this.f = firebaseInstallationsApi;
    }

    public final Task a(Task task) {
        return task.continueWith(new androidx.arch.core.executor.a(2), new h(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.os.Bundle r2, java.lang.String r3, java.lang.String r4) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.GmsRpc.b(android.os.Bundle, java.lang.String, java.lang.String):void");
    }

    public final Task c(Bundle bundle, String str, String str2) {
        try {
            b(bundle, str, str2);
            return this.c.send(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }
}
