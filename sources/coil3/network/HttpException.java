package coil3.network;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/network/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "coil-network-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HttpException extends RuntimeException {
    public HttpException(NetworkResponse networkResponse) {
        super("HTTP " + networkResponse.f13131a);
    }
}
