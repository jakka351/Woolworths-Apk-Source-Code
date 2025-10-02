package com.google.firebase.remoteconfig;

import android.util.Log;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.sessions.EventGDTLogger;
import com.google.firebase.sessions.EventType;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.firebase.sessions.SessionEvent;
import com.google.firebase.sessions.SessionEvents;
import com.swrve.sdk.SwrveLogger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements SuccessContinuation, Transformer, FirebaseAppLifecycleListener, ComponentFactory, OnFailureListener {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        SessionEvent sessionEvent = (SessionEvent) obj;
        String strEncode = SessionEvents.b.encode(sessionEvent);
        Intrinsics.g(strEncode, "encode(...)");
        sessionEvent.getClass();
        EventType eventType = EventType.e;
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = strEncode.getBytes(Charsets.f24671a);
        Intrinsics.g(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object b(ComponentContainer componentContainer) {
        switch (this.d) {
            case 3:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(componentContainer);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(componentContainer);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        SwrveLogger.c("SwrveSDK Couldn't obtain the Firebase registration id for the device", exc, new Object[0]);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(null);
    }

    public /* synthetic */ a(EventGDTLogger eventGDTLogger) {
        this.d = 1;
    }
}
