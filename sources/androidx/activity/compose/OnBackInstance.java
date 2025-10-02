package androidx.activity.compose;

import androidx.activity.OnBackPressedCallback;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/compose/OnBackInstance;", "", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OnBackInstance {

    /* renamed from: a, reason: collision with root package name */
    public boolean f70a;
    public final BufferedChannel b = ChannelKt.a(-2, 4, BufferOverflow.d);
    public final Job c;

    public OnBackInstance(CoroutineScope coroutineScope, boolean z, Function2 function2, OnBackPressedCallback onBackPressedCallback) {
        this.f70a = z;
        this.c = BuildersKt.c(coroutineScope, null, null, new OnBackInstance$job$1(onBackPressedCallback, function2, this, null), 3);
    }

    public final void a() {
        this.b.i(new CancellationException("onBack cancelled"));
        ((JobSupport) this.c).cancel((CancellationException) null);
    }
}
