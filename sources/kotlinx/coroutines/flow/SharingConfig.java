package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/SharingConfig;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class SharingConfig<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Flow f24710a;
    public final int b;
    public final BufferOverflow c;
    public final CoroutineContext d;

    public SharingConfig(int i, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, Flow flow) {
        this.f24710a = flow;
        this.b = i;
        this.c = bufferOverflow;
        this.d = coroutineContext;
    }
}
