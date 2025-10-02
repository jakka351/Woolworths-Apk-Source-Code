package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* loaded from: classes.dex */
class GetAuthTokenListener implements StateListener {

    /* renamed from: a, reason: collision with root package name */
    public final Utils f15614a;
    public final TaskCompletionSource b;

    public GetAuthTokenListener(Utils utils, TaskCompletionSource taskCompletionSource) {
        this.f15614a = utils;
        this.b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.StateListener
    public final boolean b(PersistedInstallationEntry persistedInstallationEntry) {
        if (persistedInstallationEntry.f() != PersistedInstallation.RegistrationStatus.g || this.f15614a.a(persistedInstallationEntry)) {
            return false;
        }
        InstallationTokenResult.Builder builderA = InstallationTokenResult.a();
        builderA.b(persistedInstallationEntry.a());
        builderA.d(persistedInstallationEntry.b());
        builderA.c(persistedInstallationEntry.g());
        this.b.setResult(builderA.a());
        return true;
    }
}
