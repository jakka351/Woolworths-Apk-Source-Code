package androidx.work;

import android.net.Network;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    public UUID f3914a;
    public Data b;
    public HashSet c;
    public RuntimeExtras d;
    public int e;
    public ExecutorService f;
    public CoroutineContext g;
    public WorkManagerTaskExecutor h;
    public WorkerFactory i;
    public WorkProgressUpdater j;
    public WorkForegroundUpdater k;

    @RestrictTo
    public static class RuntimeExtras {

        /* renamed from: a, reason: collision with root package name */
        public List f3915a;
        public List b;
        public Network c;

        public RuntimeExtras() {
            List list = Collections.EMPTY_LIST;
            this.f3915a = list;
            this.b = list;
        }
    }
}
