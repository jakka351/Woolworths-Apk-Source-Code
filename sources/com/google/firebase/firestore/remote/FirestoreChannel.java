package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.auth.FirebaseAppCheckTokenProvider;
import com.google.firebase.firestore.auth.FirebaseAuthCredentialsProvider;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.util.AsyncQueue;
import io.grpc.ClientCall;
import io.grpc.Metadata;
import io.grpc.Status;

/* loaded from: classes6.dex */
public class FirestoreChannel {
    public static final Metadata.Key g;
    public static final Metadata.Key h;
    public static final Metadata.Key i;
    public static volatile String j;

    /* renamed from: a, reason: collision with root package name */
    public final AsyncQueue f15571a;
    public final FirebaseAuthCredentialsProvider b;
    public final FirebaseAppCheckTokenProvider c;
    public final GrpcCallProvider d;
    public final String e;
    public final GrpcMetadataProvider f;

    /* renamed from: com.google.firebase.firestore.remote.FirestoreChannel$3, reason: invalid class name */
    class AnonymousClass3 extends ClientCall.Listener<Object> {
        @Override // io.grpc.ClientCall.Listener
        public final void a(Status status, Metadata metadata) {
            throw null;
        }

        @Override // io.grpc.ClientCall.Listener
        public final void c(Object obj) {
            throw null;
        }
    }

    /* renamed from: com.google.firebase.firestore.remote.FirestoreChannel$4, reason: invalid class name */
    class AnonymousClass4 extends ClientCall.Listener<Object> {
        @Override // io.grpc.ClientCall.Listener
        public final void a(Status status, Metadata metadata) {
            if (status.f()) {
                throw null;
            }
            Metadata.Key key = FirestoreChannel.g;
            throw null;
        }

        @Override // io.grpc.ClientCall.Listener
        public final void c(Object obj) {
            throw null;
        }
    }

    public static abstract class StreamingListener<T> {
    }

    static {
        Metadata.AsciiMarshaller asciiMarshaller = Metadata.d;
        g = Metadata.Key.a("x-goog-api-client", asciiMarshaller);
        h = Metadata.Key.a("google-cloud-resource-prefix", asciiMarshaller);
        i = Metadata.Key.a("x-goog-request-params", asciiMarshaller);
        j = "gl-java/";
    }

    public FirestoreChannel(AsyncQueue asyncQueue, FirebaseAuthCredentialsProvider firebaseAuthCredentialsProvider, FirebaseAppCheckTokenProvider firebaseAppCheckTokenProvider, DatabaseId databaseId, GrpcMetadataProvider grpcMetadataProvider, GrpcCallProvider grpcCallProvider) {
        this.f15571a = asyncQueue;
        this.f = grpcMetadataProvider;
        this.b = firebaseAuthCredentialsProvider;
        this.c = firebaseAppCheckTokenProvider;
        this.d = grpcCallProvider;
        this.e = YU.a.i("projects/", databaseId.d, "/databases/", databaseId.e);
    }
}
