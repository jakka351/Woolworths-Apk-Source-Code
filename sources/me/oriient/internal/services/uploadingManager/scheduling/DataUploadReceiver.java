package me.oriient.internal.services.uploadingManager.scheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.GlobalScope;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Companion", "me/oriient/internal/services/uploadingManager/scheduling/a", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataUploadReceiver extends BroadcastReceiver {

    @NotNull
    public static final a Companion = new a();

    @NotNull
    public static final String RECEIVER_ACTION_CHARGER = "me.oriient.services.uploadingmanager.UPLOAD_CHARGER";

    @NotNull
    public static final String RECEIVER_ACTION_CONTROL = "me.oriient.services.uploadingmanager.UPLOAD_CONTROL";

    @NotNull
    private static final String TAG = "DataUploadReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        DataUploadScheduler.WakeUpReason wakeUpReason;
        Intrinsics.h(context, "context");
        Intrinsics.h(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -494528722) {
                if (iHashCode != -282048435 || !action.equals(RECEIVER_ACTION_CONTROL)) {
                    return;
                } else {
                    wakeUpReason = DataUploadScheduler.WakeUpReason.CONTROL_RECEIVER;
                }
            } else if (!action.equals(RECEIVER_ACTION_CHARGER)) {
                return;
            } else {
                wakeUpReason = DataUploadScheduler.WakeUpReason.CHARGER_RECEIVER;
            }
            BuildersKt.c(GlobalScope.d, null, null, new b(context, intent, wakeUpReason, null), 3);
        }
    }
}
