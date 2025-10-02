package com.google.firebase.perf.application;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.v1.ApplicationProcessState;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class AppStateUpdateHandler implements AppStateMonitor.AppStateCallback {
    private final AppStateMonitor appStateMonitor;
    private boolean isRegisteredForAppState = false;
    private ApplicationProcessState currentAppState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
    private final WeakReference<AppStateMonitor.AppStateCallback> appStateCallback = new WeakReference<>(this);

    public AppStateUpdateHandler(AppStateMonitor appStateMonitor) {
        this.appStateMonitor = appStateMonitor;
    }

    public ApplicationProcessState getAppState() {
        return this.currentAppState;
    }

    @VisibleForTesting
    public WeakReference<AppStateMonitor.AppStateCallback> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.k.addAndGet(i);
    }

    @Override // com.google.firebase.perf.application.AppStateMonitor.AppStateCallback
    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        ApplicationProcessState applicationProcessState2 = this.currentAppState;
        ApplicationProcessState applicationProcessState3 = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (applicationProcessState2 == applicationProcessState3) {
            this.currentAppState = applicationProcessState;
        } else {
            if (applicationProcessState2 == applicationProcessState || applicationProcessState == applicationProcessState3) {
                return;
            }
            this.currentAppState = ApplicationProcessState.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        AppStateMonitor appStateMonitor = this.appStateMonitor;
        this.currentAppState = appStateMonitor.r;
        WeakReference<AppStateMonitor.AppStateCallback> weakReference = this.appStateCallback;
        synchronized (appStateMonitor.i) {
            appStateMonitor.i.add(weakReference);
        }
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            AppStateMonitor appStateMonitor = this.appStateMonitor;
            WeakReference<AppStateMonitor.AppStateCallback> weakReference = this.appStateCallback;
            synchronized (appStateMonitor.i) {
                appStateMonitor.i.remove(weakReference);
            }
            this.isRegisteredForAppState = false;
        }
    }
}
