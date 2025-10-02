package com.salesforce.marketingcloud.behaviors;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.f;
import com.salesforce.marketingcloud.g;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

@SuppressLint
@RestrictTo
/* loaded from: classes.dex */
public final class LifecycleManager extends f implements LifecycleObserver {

    @VisibleForTesting
    static LifecycleManager g;
    private final Application d;
    private final AtomicBoolean e = new AtomicBoolean(false);

    @VisibleForTesting
    AtomicBoolean f = new AtomicBoolean(false);

    private LifecycleManager(Application application) {
        this.d = application;
    }

    public static synchronized LifecycleManager a(Application application) {
        try {
            if (g == null) {
                g = new LifecycleManager(application);
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public String componentName() {
        return "LifecycleManager";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public JSONObject componentState() {
        return null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onApplicationBackgrounded() {
        if (this.f.getAndSet(false)) {
            g.a(c.k, "Application went into the background.", new Object[0]);
            c.a(this.d, a.BEHAVIOR_APP_BACKGROUNDED, new Bundle());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onApplicationForegrounded() {
        if (this.f.getAndSet(true) || !this.e.get()) {
            return;
        }
        g.a(c.k, "Application came into the foreground.", new Object[0]);
        c.a(this.d, a.BEHAVIOR_APP_FOREGROUNDED, new Bundle());
    }

    @Override // com.salesforce.marketingcloud.f, com.salesforce.marketingcloud.d
    public void tearDown(boolean z) {
        this.e.set(false);
    }

    @Override // com.salesforce.marketingcloud.f
    public void a(@NonNull InitializationStatus.a aVar) {
        this.e.set(true);
        if (this.f.get()) {
            c.a(this.d, a.BEHAVIOR_APP_FOREGROUNDED, null);
        }
    }
}
