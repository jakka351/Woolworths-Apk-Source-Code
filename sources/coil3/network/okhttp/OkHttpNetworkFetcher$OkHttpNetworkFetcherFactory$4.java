package coil3.network.okhttp;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import okhttp3.OkHttpClient;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$4 extends FunctionReferenceImpl implements Function0<OkHttpClient> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new OkHttpClient();
    }
}
