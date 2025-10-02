package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.processing.f;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.impl.utils.SerialExecutorImpl;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class ListenableWorker {

    @NonNull
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;

    @NonNull
    private WorkerParameters mWorkerParams;

    public static abstract class Result {

        @RestrictTo
        /* loaded from: classes2.dex */
        public static final class Failure extends Result {

            /* renamed from: a, reason: collision with root package name */
            public final Data f3902a = Data.b;

            public final Data b() {
                return this.f3902a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || Failure.class != obj.getClass()) {
                    return false;
                }
                return this.f3902a.equals(((Failure) obj).f3902a);
            }

            public final int hashCode() {
                return this.f3902a.hashCode() + 846803280;
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f3902a + '}';
            }
        }

        @RestrictTo
        public static final class Retry extends Result {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && Retry.class == obj.getClass();
            }

            public final int hashCode() {
                return 25945934;
            }

            public final String toString() {
                return "Retry";
            }
        }

        @RestrictTo
        public static final class Success extends Result {

            /* renamed from: a, reason: collision with root package name */
            public final Data f3903a;

            public Success(Data data) {
                this.f3903a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || Success.class != obj.getClass()) {
                    return false;
                }
                return this.f3903a.equals(((Success) obj).f3903a);
            }

            public final int hashCode() {
                return this.f3903a.hashCode() - 1876823561;
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f3903a + '}';
            }
        }

        public static Success a() {
            return new Success(Data.b);
        }
    }

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    @RestrictTo
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    public ListenableFuture getForegroundInfoAsync() {
        return CallbackToFutureAdapter.a(new androidx.media3.extractor.a(17));
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.f3914a;
    }

    @NonNull
    public final Data getInputData() {
        return this.mWorkerParams.b;
    }

    @Nullable
    @RequiresApi
    public final Network getNetwork() {
        return this.mWorkerParams.d.c;
    }

    @IntRange
    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    @RequiresApi
    public final int getStopReason() {
        return this.mStopReason.get();
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    @NonNull
    @RestrictTo
    public TaskExecutor getTaskExecutor() {
        return this.mWorkerParams.h;
    }

    @NonNull
    @RequiresApi
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.d.f3915a;
    }

    @NonNull
    @RequiresApi
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.d.b;
    }

    @NonNull
    @RestrictTo
    public WorkerFactory getWorkerFactory() {
        return this.mWorkerParams.i;
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    @RestrictTo
    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    @NonNull
    public final ListenableFuture<Void> setForegroundAsync(@NonNull ForegroundInfo foregroundInfo) {
        return this.mWorkerParams.k.a(getApplicationContext(), getId(), foregroundInfo);
    }

    @NonNull
    public ListenableFuture<Void> setProgressAsync(@NonNull Data data) {
        WorkProgressUpdater workProgressUpdater = this.mWorkerParams.j;
        getApplicationContext();
        UUID id = getId();
        SerialExecutorImpl serialExecutorImpl = workProgressUpdater.b.f4014a;
        androidx.work.impl.utils.c cVar = new androidx.work.impl.utils.c(0, workProgressUpdater, id, data);
        Intrinsics.h(serialExecutorImpl, "<this>");
        return CallbackToFutureAdapter.a(new f(4, serialExecutorImpl, "updateProgress", cVar));
    }

    @RestrictTo
    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ListenableFuture startWork();

    @RestrictTo
    public final void stop(int i) {
        if (this.mStopReason.compareAndSet(-256, i)) {
            onStopped();
        }
    }
}
