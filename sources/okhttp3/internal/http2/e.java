package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.PushObserver;

/* loaded from: classes8.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Http2Connection e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e(Http2Connection http2Connection, int i, Object obj, int i2) {
        this.d = i2;
        this.e = http2Connection;
        this.f = i;
        this.g = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                Http2Connection http2Connection = this.e;
                int i = this.f;
                ((PushObserver.Companion.PushObserverCancel) http2Connection.n).getClass();
                try {
                    http2Connection.A.e(i, ErrorCode.k);
                    synchronized (http2Connection) {
                        http2Connection.C.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return Unit.f24250a;
            case 1:
                Http2Connection http2Connection2 = this.e;
                int i2 = this.f;
                ((PushObserver.Companion.PushObserverCancel) http2Connection2.n).getClass();
                try {
                    http2Connection2.A.e(i2, ErrorCode.k);
                    synchronized (http2Connection2) {
                        http2Connection2.C.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused2) {
                }
                return Unit.f24250a;
            default:
                Http2Connection http2Connection3 = this.e;
                int i3 = this.f;
                ErrorCode errorCode = (ErrorCode) this.g;
                Http2Connection.Companion companion = Http2Connection.D;
                try {
                    http2Connection3.A.e(i3, errorCode);
                } catch (IOException e) {
                    ErrorCode errorCode2 = ErrorCode.g;
                    http2Connection3.a(errorCode2, errorCode2, e);
                }
                return Unit.f24250a;
        }
    }

    public /* synthetic */ e(Http2Connection http2Connection, int i, List list, boolean z) {
        this.d = 1;
        this.e = http2Connection;
        this.f = i;
        this.g = list;
    }
}
