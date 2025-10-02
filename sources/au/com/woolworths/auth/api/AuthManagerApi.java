package au.com.woolworths.auth.api;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/auth/api/AuthManagerApi;", "", "auth-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AuthManagerApi {
    Object a(Continuation continuation);

    Object b(ContinuationImpl continuationImpl);

    Object c(Context context, SuspendLambda suspendLambda);

    Object d(Context context, String str, Boolean bool, Map map, Continuation continuation);

    Object e(ContinuationImpl continuationImpl);

    Object f(Context context, Map map, Continuation continuation);
}
