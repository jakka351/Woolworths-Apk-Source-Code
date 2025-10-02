package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FlowCollector<T> {
    Object emit(Object obj, Continuation continuation);
}
