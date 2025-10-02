package au.com.woolworths.android.onesite.logging.dynatrace;

import au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler;
import au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport;
import com.apollographql.apollo.exception.ApolloException;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/logging/dynatrace/ApolloSseTransportDynatraceLogger;", "Lau/com/woolworths/graphql/subscriptions/sse/SseNetworkTransport$Listener;", "Lau/com/woolworths/graphql/subscriptions/sse/ConnectionHandler$Listener;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApolloSseTransportDynatraceLogger implements SseNetworkTransport.Listener, ConnectionHandler.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final TimberDynatraceLogger f4270a;
    public DynatraceAction b;
    public final LinkedHashMap c = new LinkedHashMap();

    public ApolloSseTransportDynatraceLogger(TimberDynatraceLogger timberDynatraceLogger) {
        this.f4270a = timberDynatraceLogger;
    }

    public final void a(ApolloException apolloException) {
        DynatraceAction dynatraceAction = this.b;
        if (dynatraceAction != null) {
            String message = apolloException.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            dynatraceAction.b("Side channel error: ".concat(message), apolloException);
        }
    }
}
