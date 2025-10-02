package com.google.firebase.sessions;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/EventGDTLogger;", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EventGDTLogger implements EventGDTLoggerInterface {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f15796a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/firebase/sessions/EventGDTLogger$Companion;", "", "", "AQS_LOG_SOURCE", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public EventGDTLogger(Provider transportFactoryProvider) {
        Intrinsics.h(transportFactoryProvider, "transportFactoryProvider");
        this.f15796a = transportFactoryProvider;
    }

    @Override // com.google.firebase.sessions.EventGDTLoggerInterface
    public final void a(SessionEvent sessionEvent) {
        ((TransportFactory) this.f15796a.get()).a("FIREBASE_APPQUALITY_SESSION", new Encoding("json"), new com.google.firebase.remoteconfig.a(this)).b(Event.g(sessionEvent));
    }
}
