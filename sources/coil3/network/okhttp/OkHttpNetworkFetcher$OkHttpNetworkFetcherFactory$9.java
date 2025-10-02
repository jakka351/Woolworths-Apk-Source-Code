package coil3.network.okhttp;

import coil3.PlatformContext;
import coil3.network.ConnectivityChecker;
import coil3.network.ConnectivityCheckerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$9 extends FunctionReferenceImpl implements Function1<PlatformContext, ConnectivityChecker> {
    public static ConnectivityChecker m(PlatformContext platformContext) {
        return ConnectivityCheckerKt.ConnectivityChecker(platformContext);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m((PlatformContext) obj);
    }
}
