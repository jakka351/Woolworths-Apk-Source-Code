package androidx.lifecycle;

import io.reactivex.Flowable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-reactivestreams_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* loaded from: classes2.dex */
public final class LiveDataReactiveStreams {
    public static final LiveData a(Flowable flowable) {
        return new PublisherLiveData(flowable);
    }
}
