package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
/* loaded from: classes5.dex */
public class TaskUtil {
    @KeepForSdk
    public static void setResultOrApiException(@NonNull Status status, @NonNull TaskCompletionSource<Void> taskCompletionSource) {
        setResultOrApiException(status, (Object) null, taskCompletionSource);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static Task<Void> toVoidTaskThatFailsOnFalse(@NonNull Task<Boolean> task) {
        return task.continueWith(new zacp());
    }

    @KeepForSdk
    public static <ResultT> boolean trySetResultOrApiException(@NonNull Status status, @Nullable ResultT resultt, @NonNull TaskCompletionSource<ResultT> taskCompletionSource) {
        return status.isSuccess() ? taskCompletionSource.trySetResult(resultt) : taskCompletionSource.trySetException(ApiExceptionUtil.fromStatus(status));
    }

    @KeepForSdk
    public static void setResultOrApiException(@NonNull Status status, @NonNull TaskCompletionSource<Void> taskCompletionSource, @Nullable ApiMetadata apiMetadata) {
        setResultOrApiException(status, taskCompletionSource);
    }

    @KeepForSdk
    public static <ResultT> void setResultOrApiException(@NonNull Status status, @Nullable ResultT resultt, @NonNull TaskCompletionSource<ResultT> taskCompletionSource) {
        if (status.isSuccess()) {
            taskCompletionSource.setResult(resultt);
        } else {
            taskCompletionSource.setException(ApiExceptionUtil.fromStatus(status));
        }
    }

    @KeepForSdk
    public static <ResultT> boolean trySetResultOrApiException(@NonNull Status status, @Nullable ResultT resultt, @NonNull TaskCompletionSource<ResultT> taskCompletionSource, @Nullable ApiMetadata apiMetadata) {
        return trySetResultOrApiException(status, resultt, taskCompletionSource);
    }

    @KeepForSdk
    public static <ResultT> void setResultOrApiException(@NonNull Status status, @Nullable ResultT resultt, @NonNull TaskCompletionSource<ResultT> taskCompletionSource, @Nullable ApiMetadata apiMetadata) {
        setResultOrApiException(status, resultt, taskCompletionSource);
    }
}
