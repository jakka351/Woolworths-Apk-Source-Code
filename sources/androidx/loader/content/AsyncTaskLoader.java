package androidx.loader.content;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.ModernAsyncTask;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class AsyncTaskLoader<D> extends Loader<D> {
    private static final boolean DEBUG = false;
    private static final String TAG = "AsyncTaskLoader";
    private volatile AsyncTaskLoader<D>.LoadTask mCancellingTask;
    private Executor mExecutor;
    private Handler mHandler;
    private long mLastLoadCompleteTime;
    private volatile AsyncTaskLoader<D>.LoadTask mTask;
    private long mUpdateThrottle;

    public final class LoadTask extends ModernAsyncTask<D> implements Runnable {
        public boolean i;

        public LoadTask() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final Object a() {
            try {
                return AsyncTaskLoader.this.onLoadInBackground();
            } catch (OperationCanceledException e) {
                if (this.f.get()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void b(Object obj) {
            AsyncTaskLoader.this.dispatchOnCancelled(this, obj);
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void c(Object obj) {
            AsyncTaskLoader.this.dispatchOnLoadComplete(this, obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.i = false;
            AsyncTaskLoader.this.executePendingTask();
        }
    }

    public AsyncTaskLoader(@NonNull Context context) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(AsyncTaskLoader<D>.LoadTask loadTask, D d) {
        onCanceled(d);
        if (this.mCancellingTask == loadTask) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(AsyncTaskLoader<D>.LoadTask loadTask, D d) {
        if (this.mTask != loadTask) {
            dispatchOnCancelled(loadTask, d);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(d);
    }

    @Override // androidx.loader.content.Loader
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.i);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.i);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.mUpdateThrottle)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.mLastLoadCompleteTime == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.mLastLoadCompleteTime));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.i) {
            this.mTask.i = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.i = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
            return;
        }
        if (this.mExecutor == null) {
            this.mExecutor = getExecutor();
        }
        AsyncTaskLoader<D>.LoadTask loadTask = this.mTask;
        Executor executor = this.mExecutor;
        if (loadTask.e == ModernAsyncTask.Status.d) {
            loadTask.e = ModernAsyncTask.Status.e;
            executor.execute(loadTask.d);
            return;
        }
        int iOrdinal = loadTask.e.ordinal();
        if (iOrdinal == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (iOrdinal == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    @NonNull
    public Executor getExecutor() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract Object loadInBackground();

    @Override // androidx.loader.content.Loader
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!isStarted()) {
            onContentChanged();
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.i) {
                this.mTask.i = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.i) {
            this.mTask.i = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        AsyncTaskLoader<D>.LoadTask loadTask = this.mTask;
        loadTask.f.set(true);
        boolean zCancel = loadTask.d.cancel(false);
        if (zCancel) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zCancel;
    }

    public void onCanceled(@Nullable D d) {
    }

    @Override // androidx.loader.content.Loader
    public void onForceLoad() {
        cancelLoad();
        this.mTask = new LoadTask();
        executePendingTask();
    }

    @Nullable
    public D onLoadInBackground() {
        return (D) loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }
}
