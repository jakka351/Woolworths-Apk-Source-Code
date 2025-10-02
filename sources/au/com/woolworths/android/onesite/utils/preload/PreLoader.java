package au.com.woolworths.android.onesite.utils.preload;

import au.com.woolworths.android.onesite.utils.coroutines.ControlledRunner;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/utils/preload/PreLoader;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PreLoader<T> {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f4602a;
    public final ControlledRunner b;
    public Object c;
    public final AtomicBoolean d;

    public PreLoader() {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f;
        JobImpl jobImplA = JobKt.a();
        defaultIoScheduler.getClass();
        CoroutineContext loaderCoroutineContext = CoroutineContext.Element.DefaultImpls.c(defaultIoScheduler, jobImplA);
        Intrinsics.h(loaderCoroutineContext, "loaderCoroutineContext");
        this.f4602a = loaderCoroutineContext;
        this.b = new ControlledRunner();
        this.d = new AtomicBoolean(false);
    }

    public final Object S(ContinuationImpl continuationImpl) {
        Object obj = this.c;
        if (obj != null) {
            this.c = null;
            return obj;
        }
        this.d.set(true);
        return BuildersKt.f(this.f4602a, new PreLoader$load$2(this, null), continuationImpl);
    }

    public abstract Object T(ContinuationImpl continuationImpl);
}
