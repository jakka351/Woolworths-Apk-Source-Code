package com.tealium.core;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import com.tealium.core.Session;
import com.tealium.core.messaging.ActivityObserverListener;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/d;", "Lcom/tealium/core/messaging/ActivityObserverListener;", "a", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d implements ActivityObserverListener {

    /* renamed from: a, reason: collision with root package name */
    public final com.tealium.core.messaging.c f19148a;
    public Session b;
    public final boolean c;
    public final SharedPreferences d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tealium/core/d$a;", "", "", "SESSION_LENGTH_MS", "I", "SESSION_START_WINDOW_LENGTH_MS", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
    }

    public d(TealiumConfig tealiumConfig, com.tealium.core.messaging.c cVar) {
        this.f19148a = cVar;
        Application application = tealiumConfig.f19129a;
        String hexString = Integer.toHexString((tealiumConfig.b + tealiumConfig.c + tealiumConfig.d.d).hashCode());
        StringBuilder sb = new StringBuilder("tealium.sessionpreferences.");
        sb.append(hexString);
        SharedPreferences sessionPreferences = application.getSharedPreferences(sb.toString(), 0);
        this.d = sessionPreferences;
        Intrinsics.g(sessionPreferences, "sessionPreferences");
        long j = sessionPreferences.getLong("tealium_session_id", 0L);
        Session session = new Session(j, sessionPreferences.getInt("tealium_session_event_count", 0), sessionPreferences.getLong("tealium_session_last_event_time", 0L), sessionPreferences.getBoolean("tealium_session_started", false));
        boolean z = Math.max(j, session.b) + ((long) 1800000) < System.currentTimeMillis();
        if (z) {
            this.c = true;
            session = b();
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            Logger.f19124a.h("Tealium-1.6.0", "Found existing session; resuming.");
            this.c = false;
        }
        this.b = session;
    }

    public final Session b() {
        Logger.f19124a.h("Tealium-1.6.0", "Creating new session.");
        this.b = new Session(System.currentTimeMillis(), 0, 0L, false);
        SharedPreferences sessionPreferences = this.d;
        Intrinsics.g(sessionPreferences, "sessionPreferences");
        Session.a.a(sessionPreferences, this.b);
        this.f19148a.f(this.b.f19126a);
        return this.b;
    }

    @Override // com.tealium.core.messaging.ActivityObserverListener
    public final void m(Activity activity, boolean z) {
    }

    @Override // com.tealium.core.messaging.ActivityObserverListener
    public final void onActivityPaused(Activity activity) {
        SharedPreferences sessionPreferences = this.d;
        Intrinsics.g(sessionPreferences, "sessionPreferences");
        Session.a.a(sessionPreferences, this.b);
    }

    @Override // com.tealium.core.messaging.ActivityObserverListener
    public final void onActivityResumed(Activity activity) {
    }
}
