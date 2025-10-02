package com.google.firebase.firestore.remote;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.firestore.auth.FirebaseAppCheckTokenProvider;
import com.google.firebase.firestore.auth.FirebaseAuthCredentialsProvider;
import com.google.firebase.firestore.util.Executors;
import io.grpc.CallCredentials;
import io.grpc.Metadata;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class FirestoreCallCredentials extends CallCredentials {
    public static final Metadata.Key c;
    public static final Metadata.Key d;

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseAuthCredentialsProvider f15570a;
    public final FirebaseAppCheckTokenProvider b;

    static {
        Metadata.AsciiMarshaller asciiMarshaller = Metadata.d;
        c = Metadata.Key.a("Authorization", asciiMarshaller);
        d = Metadata.Key.a("x-firebase-appcheck", asciiMarshaller);
    }

    public FirestoreCallCredentials(FirebaseAuthCredentialsProvider firebaseAuthCredentialsProvider, FirebaseAppCheckTokenProvider firebaseAppCheckTokenProvider) {
        this.f15570a = firebaseAuthCredentialsProvider;
        this.b = firebaseAppCheckTokenProvider;
    }

    @Override // io.grpc.CallCredentials
    public final void a(CallCredentials.RequestInfo requestInfo, Executor executor, CallCredentials.MetadataApplier metadataApplier) {
        Task taskForException;
        Task taskA = this.f15570a.a();
        FirebaseAppCheckTokenProvider firebaseAppCheckTokenProvider = this.b;
        synchronized (firebaseAppCheckTokenProvider) {
            InteropAppCheckTokenProvider interopAppCheckTokenProvider = firebaseAppCheckTokenProvider.b;
            taskForException = interopAppCheckTokenProvider == null ? Tasks.forException(new FirebaseApiNotAvailableException("AppCheck is not available")) : interopAppCheckTokenProvider.a().continueWithTask(Executors.b, new com.google.common.net.a(6));
        }
        Tasks.whenAll((Task<?>[]) new Task[]{taskA, taskForException}).addOnCompleteListener(Executors.b, new e(taskA, metadataApplier, taskForException));
    }
}
