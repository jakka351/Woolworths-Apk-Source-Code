package com.google.firebase.messaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements OnSuccessListener, Continuation, ComponentFactory {
    public final /* synthetic */ Object d;

    public /* synthetic */ h(Object obj) {
        this.d = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object b(ComponentContainer componentContainer) {
        return FirebaseMessagingRegistrar.lambda$getComponents$0((Qualified) this.d, componentContainer);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z;
        TopicsSubscriber topicsSubscriber = (TopicsSubscriber) obj;
        if (!((FirebaseMessaging) this.d).f.a() || topicsSubscriber.h.a() == null) {
            return;
        }
        synchronized (topicsSubscriber) {
            z = topicsSubscriber.g;
        }
        if (z) {
            return;
        }
        topicsSubscriber.f(0L);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws IOException {
        ((GmsRpc) this.d).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
