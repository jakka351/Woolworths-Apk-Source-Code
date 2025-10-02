package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketWriter;

/* loaded from: classes8.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.e;
        switch (i) {
            case 0:
                Http2Connection http2Connection = (Http2Connection) obj;
                Http2Connection.Companion companion = Http2Connection.D;
                http2Connection.getClass();
                try {
                    http2Connection.A.J(2, 0, false);
                    break;
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.g;
                    http2Connection.a(errorCode, errorCode, e);
                    break;
                }
            case 1:
                List list = RealWebSocket.B;
                RealCall realCall = ((RealWebSocket) obj).l;
                Intrinsics.e(realCall);
                realCall.cancel();
                break;
            default:
                List list2 = RealWebSocket.B;
                _UtilCommonKt.b((WebSocketWriter) obj);
                break;
        }
        return unit;
        return unit;
    }
}
