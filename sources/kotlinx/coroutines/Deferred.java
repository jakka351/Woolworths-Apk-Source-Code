package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.SubclassOptInRequired;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.selects.SelectClause1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/Deferred;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SubclassOptInRequired
/* loaded from: classes.dex */
public interface Deferred<T> extends Job {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
    }

    Object await(Continuation continuation);

    Object getCompleted();

    Throwable getCompletionExceptionOrNull();

    SelectClause1 getOnAwait();
}
