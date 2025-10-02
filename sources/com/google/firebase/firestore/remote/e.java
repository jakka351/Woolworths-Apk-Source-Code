package com.google.firebase.firestore.remote;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.firestore.remote.AbstractStream;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;
import io.grpc.CallCredentials;
import io.grpc.ClientCall;
import io.grpc.Metadata;
import io.grpc.Status;

/* loaded from: classes6.dex */
public final /* synthetic */ class e implements OnCompleteListener {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e(Task task, CallCredentials.MetadataApplier metadataApplier, Task task2) {
        this.e = task;
        this.g = metadataApplier;
        this.f = task2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i = 0;
        switch (this.d) {
            case 0:
                Task task2 = (Task) this.e;
                CallCredentials.MetadataApplier metadataApplier = (CallCredentials.MetadataApplier) this.g;
                Task task3 = (Task) this.f;
                Metadata.Key key = FirestoreCallCredentials.c;
                Metadata metadata = new Metadata();
                if (!task2.isSuccessful()) {
                    Exception exception = task2.getException();
                    if (!(exception instanceof FirebaseApiNotAvailableException)) {
                        if (!(exception instanceof FirebaseNoSignedInUserException)) {
                            Logger.c("FirestoreCallCredentials", "Failed to get auth token: %s.", exception);
                            metadataApplier.b(Status.j.h(exception));
                            break;
                        } else {
                            Logger.a("FirestoreCallCredentials", "No user signed in, not using authentication.", new Object[0]);
                        }
                    } else {
                        Logger.a("FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", new Object[0]);
                    }
                } else {
                    String str = (String) task2.getResult();
                    Logger.a("FirestoreCallCredentials", "Successfully fetched auth token.", new Object[0]);
                    if (str != null) {
                        metadata.f(FirestoreCallCredentials.c, "Bearer ".concat(str));
                    }
                }
                if (!task3.isSuccessful()) {
                    Exception exception2 = task3.getException();
                    if (!(exception2 instanceof FirebaseApiNotAvailableException)) {
                        Logger.c("FirestoreCallCredentials", "Failed to get AppCheck token: %s.", exception2);
                        metadataApplier.b(Status.j.h(exception2));
                        break;
                    } else {
                        Logger.a("FirestoreCallCredentials", "Firebase AppCheck API not available.", new Object[0]);
                    }
                } else {
                    String str2 = (String) task3.getResult();
                    if (str2 != null && !str2.isEmpty()) {
                        Logger.a("FirestoreCallCredentials", "Successfully fetched AppCheck token.", new Object[0]);
                        metadata.f(FirestoreCallCredentials.d, str2);
                    }
                }
                metadataApplier.a(metadata);
                break;
            default:
                final FirestoreChannel firestoreChannel = (FirestoreChannel) this.e;
                final ClientCall[] clientCallArr = (ClientCall[]) this.f;
                final AbstractStream.StreamObserver streamObserver = (AbstractStream.StreamObserver) this.g;
                Metadata.Key key2 = FirestoreChannel.g;
                firestoreChannel.getClass();
                ClientCall clientCall = (ClientCall) task.getResult();
                clientCallArr[0] = clientCall;
                ClientCall.Listener<Object> listener = new ClientCall.Listener<Object>() { // from class: com.google.firebase.firestore.remote.FirestoreChannel.1

                    /* renamed from: a */
                    public final /* synthetic */ AbstractStream.StreamObserver f15572a;
                    public final /* synthetic */ ClientCall[] b;
                    public final /* synthetic */ FirestoreChannel c;

                    public AnonymousClass1(final AbstractStream.StreamObserver streamObserver2, final FirestoreChannel firestoreChannel2, final ClientCall[] clientCallArr2) {
                        firestoreChannel = firestoreChannel2;
                        streamObserver = streamObserver2;
                        clientCallArr = clientCallArr2;
                    }

                    @Override // io.grpc.ClientCall.Listener
                    public final void a(Status status, Metadata metadata2) {
                        try {
                            AbstractStream.StreamObserver streamObserver2 = streamObserver;
                            streamObserver2.f15559a.a(new c(1, streamObserver2, status));
                        } catch (Throwable th) {
                            firestoreChannel.f15571a.c(th);
                        }
                    }

                    @Override // io.grpc.ClientCall.Listener
                    public final void b(Metadata metadata2) {
                        try {
                            AbstractStream.StreamObserver streamObserver2 = streamObserver;
                            streamObserver2.f15559a.a(new c(0, streamObserver2, metadata2));
                        } catch (Throwable th) {
                            firestoreChannel.f15571a.c(th);
                        }
                    }

                    @Override // io.grpc.ClientCall.Listener
                    public final void c(final Object obj) {
                        try {
                            final AbstractStream.StreamObserver streamObserver2 = streamObserver;
                            final int i2 = streamObserver2.b + 1;
                            streamObserver2.f15559a.a(new Runnable() { // from class: com.google.firebase.firestore.remote.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AbstractStream abstractStream = AbstractStream.this;
                                    String simpleName = abstractStream.getClass().getSimpleName();
                                    Integer numValueOf = Integer.valueOf(System.identityHashCode(abstractStream));
                                    int i3 = i2;
                                    Integer numValueOf2 = Integer.valueOf(i3);
                                    Object obj2 = obj;
                                    Logger.a(simpleName, "(%x) Stream received (%s): %s", numValueOf, numValueOf2, obj2);
                                    if (i3 == 1) {
                                        abstractStream.e(obj2);
                                    } else {
                                        abstractStream.f(obj2);
                                    }
                                }
                            });
                            streamObserver2.b = i2;
                            clientCallArr[0].c();
                        } catch (Throwable th) {
                            firestoreChannel.f15571a.c(th);
                        }
                    }

                    @Override // io.grpc.ClientCall.Listener
                    public final void d() {
                    }
                };
                Metadata metadata2 = new Metadata();
                metadata2.f(FirestoreChannel.g, FirestoreChannel.j + " fire/26.0.0 grpc/");
                metadata2.f(FirestoreChannel.h, firestoreChannel2.e);
                metadata2.f(FirestoreChannel.i, firestoreChannel2.e);
                GrpcMetadataProvider grpcMetadataProvider = firestoreChannel2.f;
                if (grpcMetadataProvider != null) {
                    grpcMetadataProvider.a(metadata2);
                }
                clientCall.e(listener, metadata2);
                streamObserver2.f15559a.a(new d(streamObserver2, i));
                clientCallArr2[0].c();
                break;
        }
    }

    public /* synthetic */ e(AbstractStream.StreamObserver streamObserver, FirestoreChannel firestoreChannel, ClientCall[] clientCallArr) {
        this.e = firestoreChannel;
        this.f = clientCallArr;
        this.g = streamObserver;
    }
}
