package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;

@Deprecated
@InternalCoroutinesApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/ParentJob;", "Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ParentJob extends Job {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
    }

    CancellationException F();
}
