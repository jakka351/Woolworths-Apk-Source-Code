package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

@ObsoleteCoroutinesApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannel;", "E", "Lkotlinx/coroutines/channels/SendChannel;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public interface BroadcastChannel<E> extends SendChannel<E> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
    }
}
