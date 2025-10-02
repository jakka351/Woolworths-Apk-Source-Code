package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.security.cert.Certificate;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.concurrent.Immutable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

@Internal
/* loaded from: classes7.dex */
public final class InternalChannelz {
    public static final Logger d = Logger.getLogger(InternalChannelz.class.getName());
    public static final InternalChannelz e = new InternalChannelz();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentSkipListMap f23940a;
    public final ConcurrentHashMap b;
    public final ConcurrentHashMap c;

    @Immutable
    public static final class ChannelStats {

        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            public final List f23941a;
            public final List b;

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.f23941a = list;
                this.b = list;
            }
        }
    }

    @Immutable
    public static final class ChannelTrace {

        public static final class Builder {
        }

        @Immutable
        public static final class Event {

            /* renamed from: a, reason: collision with root package name */
            public final String f23942a;
            public final Severity b;
            public final long c;
            public final InternalWithLogId d;

            public static final class Builder {

                /* renamed from: a, reason: collision with root package name */
                public String f23943a;
                public Severity b;
                public Long c;
                public InternalWithLogId d;

                public final Event a() {
                    Preconditions.j(this.f23943a, lqlqqlq.mmm006Dm006Dm);
                    Preconditions.j(this.b, "severity");
                    Preconditions.j(this.c, "timestampNanos");
                    return new Event(this.f23943a, this.b, this.c.longValue(), this.d);
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Severity {
                public static final Severity d;
                public static final Severity e;
                public static final Severity f;
                public static final /* synthetic */ Severity[] g;

                /* JADX INFO: Fake field, exist only in values array */
                Severity EF0;

                static {
                    Severity severity = new Severity("CT_UNKNOWN", 0);
                    Severity severity2 = new Severity("CT_INFO", 1);
                    d = severity2;
                    Severity severity3 = new Severity("CT_WARNING", 2);
                    e = severity3;
                    Severity severity4 = new Severity("CT_ERROR", 3);
                    f = severity4;
                    g = new Severity[]{severity, severity2, severity3, severity4};
                }

                public static Severity valueOf(String str) {
                    return (Severity) Enum.valueOf(Severity.class, str);
                }

                public static Severity[] values() {
                    return (Severity[]) g.clone();
                }
            }

            public Event(String str, Severity severity, long j, InternalWithLogId internalWithLogId) {
                this.f23942a = str;
                Preconditions.j(severity, "severity");
                this.b = severity;
                this.c = j;
                this.d = internalWithLogId;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return Objects.a(this.f23942a, event.f23942a) && Objects.a(this.b, event.b) && this.c == event.c && Objects.a(null, null) && Objects.a(this.d, event.d);
            }

            public final int hashCode() {
                return Arrays.hashCode(new Object[]{this.f23942a, this.b, Long.valueOf(this.c), null, this.d});
            }

            public final String toString() {
                MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
                toStringHelperB.c(this.f23942a, lqlqqlq.mmm006Dm006Dm);
                toStringHelperB.c(this.b, "severity");
                toStringHelperB.b(this.c, "timestampNanos");
                toStringHelperB.c(null, "channelRef");
                toStringHelperB.c(this.d, "subchannelRef");
                return toStringHelperB.toString();
            }
        }
    }

    public static final class OtherSecurity {
    }

    public static final class RootChannelList {
    }

    public static final class Security {
    }

    public static final class ServerList {
    }

    public static final class ServerSocketMap extends ConcurrentSkipListMap<Long, InternalInstrumented<SocketStats>> {
    }

    public static final class ServerSocketsList {
    }

    @Immutable
    public static final class ServerStats {

        public static final class Builder {
        }
    }

    public static final class SocketOptions {

        public static final class Builder {
        }
    }

    public static final class SocketStats {
    }

    public static final class TcpInfo {

        public static final class Builder {
        }
    }

    @Immutable
    public static final class Tls {
        public Tls(SSLSession sSLSession) throws SSLPeerUnverifiedException {
            sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                Certificate certificate = localCertificates[0];
            }
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    Certificate certificate2 = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e) {
                InternalChannelz.d.log(Level.FINE, "Peer cert not available for peerHost=" + sSLSession.getPeerHost(), (Throwable) e);
            }
        }
    }

    @Immutable
    public static final class TransportStats {
    }

    public InternalChannelz() {
        new ConcurrentSkipListMap();
        this.f23940a = new ConcurrentSkipListMap();
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static void a(AbstractMap abstractMap, InternalInstrumented internalInstrumented) {
    }
}
