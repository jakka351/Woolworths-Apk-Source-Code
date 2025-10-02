package au.com.woolworths.android.onesite.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/network/ServerErrorException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ServerErrorException extends RuntimeException {
    public final List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerErrorException(ServerError serverError) {
        super((Throwable) null);
        List listQ = CollectionsKt.Q(serverError);
        this.d = listQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerErrorException(ServerError serverError, RuntimeException runtimeException) {
        super(runtimeException);
        List listQ = CollectionsKt.Q(serverError);
        this.d = listQ;
    }

    public ServerErrorException() {
        super((Throwable) null);
        this.d = EmptyList.d;
    }

    public ServerErrorException(List list, Throwable th) {
        super(th);
        this.d = list;
    }
}
