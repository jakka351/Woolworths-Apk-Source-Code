package com.google.android.gms.location;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* loaded from: classes5.dex */
public interface ActivityRecognitionClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    @NonNull
    @RequiresPermission
    Task<Void> removeActivityTransitionUpdates(@NonNull PendingIntent pendingIntent);

    @NonNull
    @RequiresPermission
    Task<Void> removeActivityUpdates(@NonNull PendingIntent pendingIntent);

    @NonNull
    Task<Void> removeSleepSegmentUpdates(@NonNull PendingIntent pendingIntent);

    @NonNull
    @RequiresPermission
    Task<Void> requestActivityTransitionUpdates(@NonNull ActivityTransitionRequest activityTransitionRequest, @NonNull PendingIntent pendingIntent);

    @NonNull
    @RequiresPermission
    Task<Void> requestActivityUpdates(long j, @NonNull PendingIntent pendingIntent);

    @NonNull
    @RequiresPermission
    Task<Void> requestSleepSegmentUpdates(@NonNull PendingIntent pendingIntent, @NonNull SleepSegmentRequest sleepSegmentRequest);
}
