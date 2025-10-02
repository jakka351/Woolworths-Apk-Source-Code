package okio.internal;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.Metadata;
import okio.AsyncTimeout;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/internal/SocketAsyncTimeout;", "Lokio/AsyncTimeout;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SocketAsyncTimeout extends AsyncTimeout {
    public final Socket n;

    public SocketAsyncTimeout(Socket socket) {
        this.n = socket;
    }

    @Override // okio.AsyncTimeout
    public final void l() throws IOException {
        Socket socket = this.n;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!_JavaIoKt.b(e)) {
                throw e;
            }
            _JavaIoKt.f26790a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            _JavaIoKt.f26790a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    public final IOException m(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
