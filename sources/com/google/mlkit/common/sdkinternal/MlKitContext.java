package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentRuntime;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes.dex */
public class MlKitContext {
    public static final Object b = new Object();
    public static MlKitContext c;

    /* renamed from: a, reason: collision with root package name */
    public ComponentRuntime f15982a;

    public static MlKitContext c() {
        MlKitContext mlKitContext;
        synchronized (b) {
            Preconditions.checkState(c != null, "MlKitContext has not been initialized");
            mlKitContext = (MlKitContext) Preconditions.checkNotNull(c);
        }
        return mlKitContext;
    }

    public static MlKitContext d(Context context, Executor executor) {
        MlKitContext mlKitContext;
        synchronized (b) {
            Preconditions.checkState(c == null, "MlKitContext is already initialized");
            MlKitContext mlKitContext2 = new MlKitContext();
            c = mlKitContext2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayListA = ComponentDiscovery.b(context, MlKitComponentDiscoveryService.class).a();
            ComponentRuntime.Builder builder = new ComponentRuntime.Builder(executor);
            builder.b.addAll(arrayListA);
            builder.a(Component.c(context, Context.class, new Class[0]));
            builder.a(Component.c(mlKitContext2, MlKitContext.class, new Class[0]));
            ComponentRuntime componentRuntime = new ComponentRuntime(builder.f15227a, builder.b, builder.c, builder.d);
            mlKitContext2.f15982a = componentRuntime;
            componentRuntime.k(true);
            mlKitContext = c;
        }
        return mlKitContext;
    }

    public final Object a(Class cls) {
        Preconditions.checkState(c == this, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.f15982a);
        return this.f15982a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
