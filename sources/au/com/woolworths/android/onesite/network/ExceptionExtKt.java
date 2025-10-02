package au.com.woolworths.android.onesite.network;

import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Error;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.ApolloWebSocketClosedException;
import com.apollographql.apollo.exception.ApolloWebSocketForceCloseException;
import com.apollographql.apollo.exception.JsonEncodingException;
import com.apollographql.apollo.exception.SubscriptionConnectionException;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import retrofit2.HttpException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ExceptionExtKt {
    /* JADX WARN: Removed duplicated region for block: B:112:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final au.com.woolworths.android.onesite.network.AkamaiServerErrorType a(au.com.woolworths.android.onesite.network.ServerErrorException r5) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.network.ExceptionExtKt.a(au.com.woolworths.android.onesite.network.ServerErrorException):au.com.woolworths.android.onesite.network.AkamaiServerErrorType");
    }

    public static final boolean b(ServerErrorException serverErrorException) {
        Throwable cause = serverErrorException.getCause();
        Integer numE = cause != null ? e(cause) : null;
        int d = AkamaiCustomStatusCode.e.getD();
        if (numE != null && numE.intValue() == d) {
            return false;
        }
        int d2 = AkamaiCustomStatusCode.g.getD();
        if (numE != null && numE.intValue() == d2) {
            return false;
        }
        int d3 = AkamaiCustomStatusCode.f.getD();
        if (numE != null && numE.intValue() == d3) {
            return false;
        }
        int d4 = AkamaiCustomStatusCode.h.getD();
        if (numE != null && numE.intValue() == d4) {
            return false;
        }
        return numE == null || numE.intValue() != AkamaiCustomStatusCode.i.getD();
    }

    public static final Text c(ServerErrorException serverErrorException, String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            return new PlainText(str2);
        }
        Throwable cause = serverErrorException.getCause();
        Integer numE = cause != null ? e(cause) : null;
        int d = AkamaiCustomStatusCode.e.getD();
        if (numE != null && numE.intValue() == d) {
            return new ResText(R.string.akamai_unusual_activity_error);
        }
        int d2 = AkamaiCustomStatusCode.f.getD();
        if (numE != null && numE.intValue() == d2) {
            return new ResText(R.string.akamai_unexpected_error);
        }
        int d3 = AkamaiCustomStatusCode.g.getD();
        if (numE != null && numE.intValue() == d3) {
            return StringsKt.y(str, "WAT", true) ? new ResText(R.string.akamai_unusual_activity_error) : new ResText(R.string.akamai_generic_error);
        }
        int d4 = AkamaiCustomStatusCode.h.getD();
        if (numE != null && numE.intValue() == d4) {
            return new ResText(R.string.akamai_trouble_processing_error);
        }
        int d5 = AkamaiCustomStatusCode.i.getD();
        if (numE != null && numE.intValue() == d5) {
            return new ResText(R.string.akamai_not_available_in_region_error);
        }
        return null;
    }

    public static final ServerError d(List list, ServerErrorCode... serverErrorCodeArr) {
        Object next;
        Intrinsics.h(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (ArraysKt.l(serverErrorCodeArr, ((ServerError) next).f4576a)) {
                break;
            }
        }
        return (ServerError) next;
    }

    public static final Integer e(Throwable th) {
        if (th instanceof ApolloHttpException) {
            return Integer.valueOf(((ApolloHttpException) th).d);
        }
        if (th instanceof HttpException) {
            return Integer.valueOf(((HttpException) th).d);
        }
        return null;
    }

    public static final GraphQlException f(List list) {
        if (list == null) {
            list = CollectionsKt.Q(new Error("Missing errors in GraphQl response", null, null, null, null));
        }
        return new GraphQlException(list);
    }

    public static final ServerError g(Error error) {
        Intrinsics.h(error, "<this>");
        Map mapA = error.getD();
        Object obj = mapA != null ? mapA.get("code") : null;
        String str = obj instanceof String ? (String) obj : null;
        return new ServerError(Intrinsics.c(str, GraphQlErrorCode.e.getD()) ? ServerErrorCode.e : Intrinsics.c(str, GraphQlErrorCode.f.getD()) ? ServerErrorCode.g : Intrinsics.c(str, GraphQlErrorCode.g.getD()) ? ServerErrorCode.h : Intrinsics.c(str, GraphQlErrorCode.h.getD()) ? ServerErrorCode.f : ServerErrorCode.d, error.getF13514a());
    }

    public static final ServerErrorException h(GraphQlException graphQlException) {
        List list = graphQlException.d;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(g((Error) it.next()));
        }
        return new ServerErrorException(arrayList, graphQlException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    public static final ServerErrorException i(List list) {
        ?? Q;
        if (list != null) {
            List list2 = list;
            Q = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                Q.add(g((Error) it.next()));
            }
        } else {
            Q = CollectionsKt.Q(new ServerError(ServerErrorCode.d, "Missing errors in GraphQl response"));
        }
        return new ServerErrorException((List) Q, (Throwable) null);
    }

    public static final Exception j(ApolloException apolloException) {
        if (apolloException instanceof ApolloHttpException) {
            return new ServerErrorException(new ServerError(ServerErrorCode.e, apolloException.getMessage()), apolloException);
        }
        if (!(apolloException instanceof JsonEncodingException)) {
            return ((apolloException instanceof SubscriptionConnectionException) || (apolloException instanceof ApolloWebSocketClosedException) || (apolloException instanceof ApolloWebSocketForceCloseException) || (apolloException instanceof ApolloNetworkException)) ? new NoConnectivityException(apolloException) : new ServerErrorException(new ServerError(ServerErrorCode.d, apolloException.getMessage()), apolloException);
        }
        ServerError serverError = new ServerError(ServerErrorCode.d, apolloException.getMessage());
        Bark.Companion companion = Bark.f8483a;
        Bark.Barker.c(ReportOwner.Squad.d.a(), apolloException, "Invalid GraphQL JSON response", 8);
        return new ServerErrorException(serverError, apolloException);
    }

    public static final Operation.Data k(ApolloResponse apolloResponse) {
        Intrinsics.h(apolloResponse, "<this>");
        Operation.Data data = apolloResponse.c;
        if (data != null) {
            return data;
        }
        ApolloException apolloException = apolloResponse.e;
        if (apolloException == null) {
            throw i(apolloResponse.d);
        }
        throw apolloException;
    }
}
