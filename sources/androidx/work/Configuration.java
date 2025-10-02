package androidx.work;

import androidx.work.impl.DefaultRunnableScheduler;
import au.com.woolworths.shop.lists.data.di.ShoppingListsSyncWorkerFactory;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/Configuration;", "", "Builder", "Companion", "Provider", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Configuration {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f3891a = ConfigurationKt.a(false);
    public final DefaultScheduler b = Dispatchers.f24691a;
    public final ExecutorService c = ConfigurationKt.a(true);
    public final SystemClock d = new SystemClock();
    public final WorkerFactory e;
    public final NoOpInputMergerFactory f;
    public final DefaultRunnableScheduler g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final ConfigurationKt$createDefaultTracer$tracer$1 m;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/Configuration$Builder;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public ShoppingListsSyncWorkerFactory f3892a;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/Configuration$Companion;", "", "", "MIN_SCHEDULER_LIMIT", "I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/work/Configuration$Provider;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Provider {
        Configuration g();
    }

    public Configuration(Builder builder) {
        WorkerFactory workerFactory = builder.f3892a;
        this.e = workerFactory == null ? DefaultWorkerFactory.f3899a : workerFactory;
        this.f = NoOpInputMergerFactory.f3905a;
        this.g = new DefaultRunnableScheduler();
        this.h = 4;
        this.i = Integer.MAX_VALUE;
        this.k = 20;
        this.j = 8;
        this.l = true;
        this.m = new ConfigurationKt$createDefaultTracer$tracer$1();
    }
}
