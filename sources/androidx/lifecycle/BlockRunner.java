package androidx.lifecycle;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/BlockRunner;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "lifecycle-livedata_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlockRunner<T> {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineLiveData f2780a;
    public final Function2 b;
    public final ContextScope c;
    public final a d;
    public Job e;
    public Job f;

    public BlockRunner(CoroutineLiveData coroutineLiveData, Function2 function2, ContextScope contextScope, a aVar) {
        this.f2780a = coroutineLiveData;
        this.b = function2;
        this.c = contextScope;
        this.d = aVar;
    }
}
