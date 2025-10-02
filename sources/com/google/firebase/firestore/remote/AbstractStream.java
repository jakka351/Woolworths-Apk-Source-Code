package com.google.firebase.firestore.remote;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.auth.FirebaseAuthCredentialsProvider;
import com.google.firebase.firestore.remote.Stream;
import com.google.firebase.firestore.remote.Stream.StreamCallback;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.ExponentialBackoff;
import com.google.firebase.firestore.util.Logger;
import com.google.protobuf.GeneratedMessageLite;
import io.grpc.ClientCall;
import io.grpc.ForwardingClientCall;
import io.grpc.ManagedChannel;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;

/* loaded from: classes6.dex */
abstract class AbstractStream<ReqT, RespT, CallbackT extends Stream.StreamCallback> implements Stream<CallbackT> {
    public static final long m;
    public static final long n;
    public static final long o;
    public static final long p;
    public static final long q;
    public static final /* synthetic */ int r = 0;

    /* renamed from: a, reason: collision with root package name */
    public AsyncQueue.DelayedTask f15557a;
    public AsyncQueue.DelayedTask b;
    public final FirestoreChannel c;
    public final MethodDescriptor d;
    public final AsyncQueue f;
    public final AsyncQueue.TimerId g;
    public ClientCall j;
    public final ExponentialBackoff k;
    public final Stream.StreamCallback l;
    public Stream.State h = Stream.State.d;
    public long i = 0;
    public final IdleTimeoutRunnable e = new IdleTimeoutRunnable();

    public class CloseGuardedRunner {

        /* renamed from: a, reason: collision with root package name */
        public final long f15558a;

        public CloseGuardedRunner(long j) {
            this.f15558a = j;
        }

        public final void a(Runnable runnable) {
            AbstractStream abstractStream = AbstractStream.this;
            abstractStream.f.d();
            if (abstractStream.i == this.f15558a) {
                runnable.run();
            } else {
                Logger.a(abstractStream.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
            }
        }
    }

    @VisibleForTesting
    public class IdleTimeoutRunnable implements Runnable {
        public IdleTimeoutRunnable() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = AbstractStream.r;
            AbstractStream abstractStream = AbstractStream.this;
            if (abstractStream.c()) {
                abstractStream.a(Stream.State.d, Status.e);
            }
        }
    }

    public class StreamObserver implements IncomingStreamObserver<RespT> {

        /* renamed from: a, reason: collision with root package name */
        public final CloseGuardedRunner f15559a;
        public int b = 0;

        public StreamObserver(CloseGuardedRunner closeGuardedRunner) {
            this.f15559a = closeGuardedRunner;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        n = timeUnit2.toMillis(1L);
        o = timeUnit2.toMillis(1L);
        p = timeUnit.toMillis(10L);
        q = timeUnit.toMillis(10L);
    }

    public AbstractStream(FirestoreChannel firestoreChannel, MethodDescriptor methodDescriptor, AsyncQueue asyncQueue, AsyncQueue.TimerId timerId, AsyncQueue.TimerId timerId2, Stream.StreamCallback streamCallback) {
        this.c = firestoreChannel;
        this.d = methodDescriptor;
        this.f = asyncQueue;
        this.g = timerId2;
        this.l = streamCallback;
        this.k = new ExponentialBackoff(asyncQueue, timerId, m, n);
    }

    public final void a(Stream.State state, Status status) {
        ExponentialBackoff exponentialBackoff = this.k;
        Assert.b(d(), "Only started streams should be closed.", new Object[0]);
        Stream.State state2 = Stream.State.h;
        Assert.b(state == state2 || status.f(), "Can't provide an error when not in an error state.", new Object[0]);
        this.f.d();
        HashSet hashSet = Datastore.d;
        Status.Code code = status.f23971a;
        Throwable th = status.c;
        if (th instanceof SSLHandshakeException) {
            th.getMessage().contains("no ciphers available");
        }
        AsyncQueue.DelayedTask delayedTask = this.b;
        if (delayedTask != null) {
            delayedTask.a();
            this.b = null;
        }
        AsyncQueue.DelayedTask delayedTask2 = this.f15557a;
        if (delayedTask2 != null) {
            delayedTask2.a();
            this.f15557a = null;
        }
        AsyncQueue.DelayedTask delayedTask3 = exponentialBackoff.h;
        if (delayedTask3 != null) {
            delayedTask3.a();
            exponentialBackoff.h = null;
        }
        this.i++;
        Status.Code code2 = status.f23971a;
        if (code2 == Status.Code.OK) {
            exponentialBackoff.f = 0L;
        } else if (code2 == Status.Code.RESOURCE_EXHAUSTED) {
            Logger.a(getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            exponentialBackoff.f = exponentialBackoff.e;
        } else if (code2 == Status.Code.UNAUTHENTICATED && this.h != Stream.State.g) {
            FirestoreChannel firestoreChannel = this.c;
            FirebaseAuthCredentialsProvider firebaseAuthCredentialsProvider = firestoreChannel.b;
            synchronized (firebaseAuthCredentialsProvider) {
                firebaseAuthCredentialsProvider.e = true;
            }
            synchronized (firestoreChannel.c) {
            }
        } else if (code2 == Status.Code.UNAVAILABLE && ((th instanceof UnknownHostException) || (th instanceof ConnectException))) {
            exponentialBackoff.e = q;
        }
        if (state != state2) {
            Logger.a(getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            h();
        }
        if (this.j != null) {
            if (status.f()) {
                Logger.a(getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                try {
                    this.j.b();
                } catch (IllegalStateException e) {
                    Logger.a(getClass().getSimpleName(), "(%x) Closing stream client-side result in exception: [%s]", Integer.valueOf(System.identityHashCode(this)), e);
                }
            }
            this.j = null;
        }
        this.h = state;
        this.l.c(status);
    }

    public void b() {
        Assert.b(!d(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.f.d();
        this.h = Stream.State.d;
        this.k.f = 0L;
    }

    public boolean c() {
        this.f.d();
        Stream.State state = this.h;
        return state == Stream.State.f || state == Stream.State.g;
    }

    public boolean d() {
        this.f.d();
        Stream.State state = this.h;
        return state == Stream.State.e || state == Stream.State.i || c();
    }

    public abstract void e(Object obj);

    public abstract void f(Object obj);

    public void g() {
        this.f.d();
        Assert.b(this.j == null, "Last call still set", new Object[0]);
        Assert.b(this.b == null, "Idle timer still set", new Object[0]);
        Stream.State state = this.h;
        Stream.State state2 = Stream.State.h;
        if (state != state2) {
            Assert.b(state == Stream.State.d, "Already started", new Object[0]);
            StreamObserver streamObserver = new StreamObserver(new CloseGuardedRunner(this.i));
            final ClientCall[] clientCallArr = {null};
            final FirestoreChannel firestoreChannel = this.c;
            final GrpcCallProvider grpcCallProvider = firestoreChannel.d;
            Task task = grpcCallProvider.f15574a;
            AsyncQueue.SynchronizedShutdownAwareExecutor synchronizedShutdownAwareExecutor = grpcCallProvider.b.f15594a;
            final MethodDescriptor methodDescriptor = this.d;
            final Task taskContinueWithTask = task.continueWithTask(synchronizedShutdownAwareExecutor, new Continuation() { // from class: com.google.firebase.firestore.remote.f
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    GrpcCallProvider grpcCallProvider2 = grpcCallProvider;
                    grpcCallProvider2.getClass();
                    return Tasks.forResult(((ManagedChannel) task2.getResult()).h(methodDescriptor, grpcCallProvider2.c));
                }
            });
            taskContinueWithTask.addOnCompleteListener(firestoreChannel.f15571a.f15594a, new e(streamObserver, firestoreChannel, clientCallArr));
            this.j = new ForwardingClientCall<Object, Object>() { // from class: com.google.firebase.firestore.remote.FirestoreChannel.2
                @Override // io.grpc.PartialForwardingClientCall, io.grpc.ClientCall
                public final void b() {
                    if (clientCallArr[0] != null) {
                        super.b();
                        return;
                    }
                    taskContinueWithTask.addOnSuccessListener(FirestoreChannel.this.f15571a.f15594a, new com.google.common.net.a(8));
                }

                @Override // io.grpc.PartialForwardingClientCall
                public final ClientCall f() {
                    ClientCall[] clientCallArr2 = clientCallArr;
                    Assert.b(clientCallArr2[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
                    return clientCallArr2[0];
                }
            };
            this.h = Stream.State.e;
            return;
        }
        Assert.b(state == state2, "Should only perform backoff in an error state", new Object[0]);
        this.h = Stream.State.i;
        a aVar = new a(this, 0);
        ExponentialBackoff exponentialBackoff = this.k;
        AsyncQueue.DelayedTask delayedTask = exponentialBackoff.h;
        if (delayedTask != null) {
            delayedTask.a();
            exponentialBackoff.h = null;
        }
        long jRandom = exponentialBackoff.f + ((long) ((Math.random() - 0.5d) * exponentialBackoff.f));
        long jMax = Math.max(0L, new Date().getTime() - exponentialBackoff.g);
        long jMax2 = Math.max(0L, jRandom - jMax);
        if (exponentialBackoff.f > 0) {
            Logger.a(exponentialBackoff.getClass().getSimpleName(), "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)", Long.valueOf(jMax2), Long.valueOf(exponentialBackoff.f), Long.valueOf(jRandom), Long.valueOf(jMax));
        }
        exponentialBackoff.h = exponentialBackoff.f15601a.a(exponentialBackoff.b, jMax2, new com.google.firebase.firestore.util.d(3, exponentialBackoff, aVar));
        long j = (long) (exponentialBackoff.f * 1.5d);
        exponentialBackoff.f = j;
        long j2 = exponentialBackoff.c;
        if (j < j2) {
            exponentialBackoff.f = j2;
        } else {
            long j3 = exponentialBackoff.e;
            if (j > j3) {
                exponentialBackoff.f = j3;
            }
        }
        exponentialBackoff.e = exponentialBackoff.d;
    }

    public void h() {
    }

    public final void i(GeneratedMessageLite generatedMessageLite) {
        this.f.d();
        Logger.a(getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), generatedMessageLite);
        AsyncQueue.DelayedTask delayedTask = this.b;
        if (delayedTask != null) {
            delayedTask.a();
            this.b = null;
        }
        this.j.d(generatedMessageLite);
    }
}
