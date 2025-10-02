package ovh.plrapps.mapcompose.core;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.channels.BufferedChannel;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/core/TileCollector;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TileCollector {

    /* renamed from: a, reason: collision with root package name */
    public final int f26936a;
    public final boolean b;
    public final int c;
    public volatile boolean d = true;
    public final ThreadPoolExecutor e;
    public final ExecutorCoroutineDispatcherImpl f;

    public TileCollector(int i, boolean z, int i2) {
        this.f26936a = i;
        this.b = z;
        this.c = i2;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.e = threadPoolExecutor;
        this.f = new ExecutorCoroutineDispatcherImpl(threadPoolExecutor);
    }

    public final Object a(BufferedChannel bufferedChannel, BufferedChannel bufferedChannel2, List list, Continuation continuation) {
        return CoroutineScopeKt.c(new TileCollector$collectTiles$2(this, bufferedChannel, bufferedChannel2, list, null), continuation);
    }
}
