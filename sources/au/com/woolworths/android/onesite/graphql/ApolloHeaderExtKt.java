package au.com.woolworths.android.onesite.graphql;

import androidx.camera.core.impl.b;
import androidx.navigation.a;
import au.com.woolworths.android.onesite.featuretoggles.Feature;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.http.HttpHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ApolloHeaderExtKt {
    public static final void a(ApolloCall apolloCall, FeatureToggleManager featureManager, Feature... featureArr) {
        String strM;
        HttpHeader httpHeader;
        Object next;
        ApolloRequest.Builder builder = apolloCall.e;
        Intrinsics.h(featureManager, "featureManager");
        ArrayList arrayList = new ArrayList();
        for (Feature feature : featureArr) {
            if (featureManager.c(feature)) {
                arrayList.add(feature);
            }
        }
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = !arrayList.isEmpty() ? arrayList : null;
        if (arrayList3 == null || (strM = CollectionsKt.M(arrayList3, ",", null, null, new a(21), 30)) == null) {
            return;
        }
        List list = builder.h;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.c(((HttpHeader) next).f13528a, "x-enable-feature")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            httpHeader = (HttpHeader) next;
        } else {
            httpHeader = null;
        }
        if (httpHeader == null) {
            apolloCall.a("x-enable-feature", strM);
            return;
        }
        String value = b.o(httpHeader.b, ",", strM);
        List list2 = builder.h;
        if (list2 != null) {
            List<HttpHeader> list3 = list2;
            arrayList2 = new ArrayList(CollectionsKt.s(list3, 10));
            for (HttpHeader httpHeader2 : list3) {
                if (Intrinsics.c(httpHeader2.f13528a, "x-enable-feature")) {
                    String name = httpHeader2.f13528a;
                    Intrinsics.h(name, "name");
                    Intrinsics.h(value, "value");
                    httpHeader2 = new HttpHeader(name, value);
                }
                arrayList2.add(httpHeader2);
            }
        }
        builder.h = arrayList2;
    }
}
