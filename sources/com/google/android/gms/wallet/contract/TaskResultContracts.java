package com.google.android.gms.wallet.contract;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;

/* loaded from: classes2.dex */
public final class TaskResultContracts {

    public static abstract class GetApiTaskResult<T> extends ResolveApiTaskResult<T, ApiTaskResult<T>> {
        @Override // com.google.android.gms.wallet.contract.TaskResultContracts.ResolveApiTaskResult
        @NonNull
        public ApiTaskResult<T> outputFromTask(@NonNull Task<T> task) {
            if (task.isSuccessful()) {
                return new ApiTaskResult<>(task.getResult(), Status.RESULT_SUCCESS);
            }
            if (task.isCanceled()) {
                return new ApiTaskResult<>(new Status(16, "The task has been canceled."));
            }
            Status status = this.zza;
            return status != null ? new ApiTaskResult<>(status) : new ApiTaskResult<>(Status.RESULT_INTERNAL_ERROR);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public ApiTaskResult<T> parseResult(int i, @Nullable Intent intent) {
            if (i != -1) {
                return i != 0 ? new ApiTaskResult<>(null, Status.RESULT_INTERNAL_ERROR) : new ApiTaskResult<>(null, Status.RESULT_CANCELED);
            }
            T tTaskResultFromIntent = intent != null ? taskResultFromIntent(intent) : null;
            return tTaskResultFromIntent != null ? new ApiTaskResult<>(tTaskResultFromIntent, Status.RESULT_SUCCESS) : new ApiTaskResult<>(null, Status.RESULT_INTERNAL_ERROR);
        }

        @Nullable
        public abstract T taskResultFromIntent(@NonNull Intent intent);
    }

    public static final class GetPaymentData extends UnpackApiTaskResult<PaymentData> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public PaymentData parseResult(int i, @Nullable Intent intent) {
            if (intent != null) {
                return PaymentData.getFromIntent(intent);
            }
            return null;
        }
    }

    public static final class GetPaymentDataResult extends GetApiTaskResult<PaymentData> {
        @Override // com.google.android.gms.wallet.contract.TaskResultContracts.GetApiTaskResult, androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public ApiTaskResult<PaymentData> parseResult(int i, @Nullable Intent intent) {
            if (i != 1) {
                return super.parseResult(i, intent);
            }
            Status statusFromIntent = AutoResolveHelper.getStatusFromIntent(intent);
            if (statusFromIntent == null) {
                statusFromIntent = Status.RESULT_INTERNAL_ERROR;
            }
            return new ApiTaskResult<>(statusFromIntent);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.gms.wallet.contract.TaskResultContracts.GetApiTaskResult
        @Nullable
        public PaymentData taskResultFromIntent(@NonNull Intent intent) {
            return PaymentData.getFromIntent(intent);
        }
    }

    public static abstract class ResolveApiTaskResult<I, O> extends ActivityResultContract<Task<I>, O> {
        Status zza;
        private PendingIntent zzb;

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public Intent createIntent(@NonNull Context context, @NonNull Task<I> task) {
            return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", new IntentSenderRequest.Builder(this.zzb).a());
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public ActivityResultContract.SynchronousResult<O> getSynchronousResult(@NonNull Context context, @NonNull Task<I> task) {
            if (!task.isComplete()) {
                throw new IllegalArgumentException("The task has to be executed before using this API to resolve its result.");
            }
            Exception exception = task.getException();
            if (exception instanceof ApiException) {
                this.zza = ((ApiException) exception).getStatus();
                if (exception instanceof ResolvableApiException) {
                    this.zzb = ((ResolvableApiException) exception).getResolution();
                }
            }
            if (this.zzb == null) {
                return new ActivityResultContract.SynchronousResult<>(outputFromTask(task));
            }
            return null;
        }

        public abstract O outputFromTask(@NonNull Task<I> task);
    }

    public static abstract class UnpackApiTaskResult<T> extends ResolveApiTaskResult<T, T> {
        @Override // com.google.android.gms.wallet.contract.TaskResultContracts.ResolveApiTaskResult
        @Nullable
        public T outputFromTask(@NonNull Task<T> task) {
            if (task.isSuccessful()) {
                return task.getResult();
            }
            return null;
        }
    }

    private TaskResultContracts() {
    }
}
