package com.google.firebase.firestore.remote;

import com.google.firebase.FirebaseOptions;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import io.grpc.Metadata;

/* loaded from: classes6.dex */
public class FirebaseClientGrpcMetadataProvider implements GrpcMetadataProvider {
    public static final Metadata.Key d;
    public static final Metadata.Key e;
    public static final Metadata.Key f;

    /* renamed from: a, reason: collision with root package name */
    public final Provider f15569a;
    public final Provider b;
    public final FirebaseOptions c;

    static {
        Metadata.AsciiMarshaller asciiMarshaller = Metadata.d;
        d = Metadata.Key.a("x-firebase-client-log-type", asciiMarshaller);
        e = Metadata.Key.a("x-firebase-client", asciiMarshaller);
        f = Metadata.Key.a("x-firebase-gmpid", asciiMarshaller);
    }

    public FirebaseClientGrpcMetadataProvider(Provider provider, Provider provider2, FirebaseOptions firebaseOptions) {
        this.b = provider;
        this.f15569a = provider2;
        this.c = firebaseOptions;
    }

    @Override // com.google.firebase.firestore.remote.GrpcMetadataProvider
    public final void a(Metadata metadata) {
        Provider provider = this.f15569a;
        if (provider.get() != null) {
            Provider provider2 = this.b;
            if (provider2.get() == null) {
                return;
            }
            int i = ((HeartBeatInfo) provider.get()).b().d;
            if (i != 0) {
                metadata.f(d, Integer.toString(i));
            }
            metadata.f(e, ((UserAgentPublisher) provider2.get()).a());
            FirebaseOptions firebaseOptions = this.c;
            if (firebaseOptions == null) {
                return;
            }
            String str = firebaseOptions.b;
            if (str.length() != 0) {
                metadata.f(f, str);
            }
        }
    }
}
