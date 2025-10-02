package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceConnection;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes6.dex */
public final /* synthetic */ class i implements OnSuccessListener, OnCompleteListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 1:
                WakeLockHolder.a((Intent) obj);
                break;
            case 2:
                int i2 = WithinAppServiceBinder.e;
                ((WithinAppServiceConnection.BindRequest) obj).b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) throws NumberFormatException {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.e;
        CloudMessage cloudMessage = (CloudMessage) obj;
        Store store = FirebaseMessaging.m;
        if (cloudMessage != null) {
            MessagingAnalytics.b(cloudMessage.getIntent());
            firebaseMessaging.d.c.getProxiedNotificationData().addOnSuccessListener(firebaseMessaging.g, new i(firebaseMessaging, 0));
        }
    }
}
