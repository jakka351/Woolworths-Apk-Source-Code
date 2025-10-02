package okhttp3;

import kotlin.Metadata;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealCall$timeout$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lokhttp3/Call;", "", "Factory", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Call extends Cloneable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lokhttp3/Call$Factory;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Factory {
        RealCall a(Request request);
    }

    void U1(Callback callback);

    void cancel();

    Response execute();

    /* renamed from: isCanceled */
    boolean getS();

    /* renamed from: n */
    RealCall$timeout$1 getI();

    /* renamed from: x */
    Request getE();
}
