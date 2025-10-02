package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes.dex */
class MetadataBackendRegistry implements BackendRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final BackendFactoryProvider f14452a;
    public final CreationContextFactory b;
    public final HashMap c;

    public static class BackendFactoryProvider {

        /* renamed from: a, reason: collision with root package name */
        public final Context f14453a;
        public Map b = null;

        public BackendFactoryProvider(Context context) {
            this.f14453a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.google.android.datatransport.runtime.backends.BackendFactory a(java.lang.String r14) throws android.content.pm.PackageManager.NameNotFoundException {
            /*
                Method dump skipped, instructions count: 267
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.BackendFactoryProvider.a(java.lang.String):com.google.android.datatransport.runtime.backends.BackendFactory");
        }
    }

    public MetadataBackendRegistry(Context context, CreationContextFactory creationContextFactory) {
        BackendFactoryProvider backendFactoryProvider = new BackendFactoryProvider(context);
        this.c = new HashMap();
        this.f14452a = backendFactoryProvider;
        this.b = creationContextFactory;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRegistry
    public final synchronized TransportBackend b(String str) {
        if (this.c.containsKey(str)) {
            return (TransportBackend) this.c.get(str);
        }
        BackendFactory backendFactoryA = this.f14452a.a(str);
        if (backendFactoryA == null) {
            return null;
        }
        CreationContextFactory creationContextFactory = this.b;
        TransportBackend transportBackendCreate = backendFactoryA.create(new AutoValue_CreationContext(creationContextFactory.f14450a, creationContextFactory.b, creationContextFactory.c, str));
        this.c.put(str, transportBackendCreate);
        return transportBackendCreate;
    }
}
