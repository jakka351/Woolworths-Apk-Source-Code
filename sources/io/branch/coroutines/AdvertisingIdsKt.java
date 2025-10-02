package io.branch.coroutines;

import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"Branch-SDK_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AdvertisingIdsKt {
    public static final void a(Context context, Continuation continuation) {
        BuildersKt.f(Dispatchers.f24691a, new AdvertisingIdsKt$getAmazonFireAdvertisingInfoObject$2(context, null), continuation);
    }

    public static final void b(Context context, Continuation continuation) {
        BuildersKt.f(Dispatchers.f24691a, new AdvertisingIdsKt$getGoogleAdvertisingInfoObject$2(context, null), continuation);
    }

    public static final void c(Context context, Continuation continuation) {
        BuildersKt.f(Dispatchers.f24691a, new AdvertisingIdsKt$getHuaweiAdvertisingInfoObject$2(context, null), continuation);
    }
}
