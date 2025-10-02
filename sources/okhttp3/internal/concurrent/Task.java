package okhttp3.internal.concurrent;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/concurrent/Task;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class Task {

    /* renamed from: a, reason: collision with root package name */
    public final String f26706a;
    public final boolean b;
    public TaskQueue c;
    public long d;

    public Task(String name, boolean z) {
        Intrinsics.h(name, "name");
        this.f26706a = name;
        this.b = z;
        this.d = -1L;
    }

    public abstract long a();

    /* renamed from: toString, reason: from getter */
    public final String getF26706a() {
        return this.f26706a;
    }
}
