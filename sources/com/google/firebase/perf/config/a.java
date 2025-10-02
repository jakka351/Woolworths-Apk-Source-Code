package com.google.firebase.perf.config;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements OnSuccessListener, OnFailureListener {
    public final /* synthetic */ RemoteConfigManager d;

    public /* synthetic */ a(RemoteConfigManager remoteConfigManager) {
        this.d = remoteConfigManager;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.d.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.d.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
    }
}
