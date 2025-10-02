package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SystemJobInfoConverterExtKt {
    public static final void a(JobInfo.Builder builder, NetworkRequest networkRequest) {
        Intrinsics.h(builder, "builder");
        builder.setRequiredNetwork(networkRequest);
    }
}
