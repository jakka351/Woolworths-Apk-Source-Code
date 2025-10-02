package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.compose.material.ripple.a;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Collections;
import java.util.Set;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes.dex */
public class TransportRuntime implements TransportInternal {
    public static volatile TransportRuntimeComponent e;

    /* renamed from: a, reason: collision with root package name */
    public final Clock f14444a;
    public final Clock b;
    public final Scheduler c;
    public final Uploader d;

    public TransportRuntime(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        this.f14444a = clock;
        this.b = clock2;
        this.c = scheduler;
        this.d = uploader;
        workInitializer.f14478a.execute(new a(workInitializer, 10));
    }

    public static TransportRuntime a() {
        TransportRuntimeComponent transportRuntimeComponent = e;
        if (transportRuntimeComponent != null) {
            return transportRuntimeComponent.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (TransportRuntime.class) {
                try {
                    if (e == null) {
                        DaggerTransportRuntimeComponent.Builder builder = new DaggerTransportRuntimeComponent.Builder();
                        context.getClass();
                        builder.f14438a = context;
                        e = builder.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final TransportFactory c(Destination destination) {
        Set setUnmodifiableSet = destination instanceof EncodedDestination ? Collections.unmodifiableSet(((EncodedDestination) destination).a()) : Collections.singleton(new Encoding("proto"));
        TransportContext.Builder builderA = TransportContext.a();
        destination.getClass();
        ((AutoValue_TransportContext.Builder) builderA).f14437a = "cct";
        ((AutoValue_TransportContext.Builder) builderA).b = destination.getExtras();
        return new TransportFactoryImpl(setUnmodifiableSet, builderA.a(), this);
    }
}
