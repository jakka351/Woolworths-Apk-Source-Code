package okhttp3;

import kotlin.Metadata;
import okhttp3.internal.authenticator.JavaNetAuthenticator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lokhttp3/Authenticator;", "", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Authenticator {

    /* renamed from: a, reason: collision with root package name */
    public static final Authenticator f26660a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\b"}, d2 = {"Lokhttp3/Authenticator$Companion;", "", "<init>", "()V", "NONE", "Lokhttp3/Authenticator;", "JAVA_NET_AUTHENTICATOR", "AuthenticatorNone", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f26661a = 0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Authenticator$Companion$AuthenticatorNone;", "Lokhttp3/Authenticator;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class AuthenticatorNone implements Authenticator {
            @Override // okhttp3.Authenticator
            public final Request a(Route route, Response response) {
                return null;
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i = Companion.f26661a;
        f26660a = new Companion.AuthenticatorNone();
        new JavaNetAuthenticator(0);
    }

    Request a(Route route, Response response);
}
