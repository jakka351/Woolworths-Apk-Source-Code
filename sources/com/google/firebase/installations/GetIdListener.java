package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* loaded from: classes.dex */
class GetIdListener implements StateListener {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f15615a;

    public GetIdListener(TaskCompletionSource taskCompletionSource) {
        this.f15615a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.StateListener
    public final boolean b(PersistedInstallationEntry persistedInstallationEntry) {
        if (persistedInstallationEntry.f() != PersistedInstallation.RegistrationStatus.f && persistedInstallationEntry.f() != PersistedInstallation.RegistrationStatus.g && persistedInstallationEntry.f() != PersistedInstallation.RegistrationStatus.h) {
            return false;
        }
        this.f15615a.trySetResult(persistedInstallationEntry.c());
        return true;
    }
}
