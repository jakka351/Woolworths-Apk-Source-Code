package au.com.woolworths.android.onesite.network;

import com.apollographql.apollo.ast.ApolloParser;
import com.apollographql.apollo.ast.GQLBooleanValue;
import com.apollographql.apollo.ast.GQLDefinition;
import com.apollographql.apollo.ast.GQLDocument;
import com.apollographql.apollo.ast.GQLFragmentDefinition;
import com.apollographql.apollo.ast.GQLOperationDefinition;
import com.apollographql.apollo.ast.GQLValue;
import com.apollographql.apollo.ast.GQLVariableDefinition;
import com.google.android.gms.actions.SearchIntents;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.ConstrainedOnceSequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;
import okio.Buffer;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/network/GraphQlPreprocessorInterceptor;", "Lokhttp3/Interceptor;", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GraphQlPreprocessorInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final MediaType f4571a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/network/GraphQlPreprocessorInterceptor$Companion;", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/MediaType;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        MediaType.e.getClass();
        f4571a = MediaType.Companion.a("application/json; charset=utf-8");
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) throws JSONException {
        LinkedHashSet linkedHashSet;
        Request request = realInterceptorChain.e;
        HttpUrl httpUrl = request.f26690a;
        RequestBody requestBody = request.d;
        if (!StringsKt.v(httpUrl.b(), "/graphql", false)) {
            return realInterceptorChain.c(request);
        }
        Buffer buffer = new Buffer();
        if (requestBody != null) {
            requestBody.a();
        }
        if (requestBody != null) {
            requestBody.d(buffer);
        }
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.g(UTF_8, "UTF_8");
        JSONObject jSONObject = new JSONObject(buffer.I0(UTF_8));
        String string = jSONObject.getString(SearchIntents.EXTRA_QUERY);
        JSONObject jSONObject2 = jSONObject.getJSONObject("variables");
        Iterator<String> itKeys = jSONObject2.keys();
        Intrinsics.g(itKeys, "keys(...)");
        Sequence sequenceB = SequencesKt.b(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator f24664a = ((ConstrainedOnceSequence) sequenceB).getF24664a();
        while (f24664a.hasNext()) {
            Object next = f24664a.next();
            linkedHashMap.put(next, jSONObject2.get((String) next));
        }
        Intrinsics.e(string);
        GraphQlPreprocessor graphQlPreprocessor = new GraphQlPreprocessor(string, linkedHashMap);
        ArrayList arrayList = ((GQLDocument) ApolloParser.a(string).a()).f13541a;
        for (Object obj : arrayList) {
            if (((GQLDefinition) obj) instanceof GQLOperationDefinition) {
                Intrinsics.f(obj, "null cannot be cast to non-null type com.apollographql.apollo.ast.GQLOperationDefinition");
                GQLOperationDefinition gQLOperationDefinition = (GQLOperationDefinition) obj;
                Object obj2 = gQLOperationDefinition.c;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterable iterable = (Iterable) obj2;
                Iterator it = iterable.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    linkedHashSet = graphQlPreprocessor.d;
                    if (!zHasNext) {
                        break;
                    }
                    GQLVariableDefinition gQLVariableDefinition = (GQLVariableDefinition) it.next();
                    GQLValue c = gQLVariableDefinition.getC();
                    if (c instanceof GQLBooleanValue) {
                        linkedHashMap2.put(gQLVariableDefinition.getF13570a(), Boolean.valueOf(((GQLBooleanValue) c).getF13538a()));
                    } else if (c != null) {
                        linkedHashSet.add(gQLVariableDefinition.getF13570a());
                    }
                }
                for (Map.Entry entry : graphQlPreprocessor.f4570a.entrySet()) {
                    Object value = entry.getValue();
                    Boolean bool = value instanceof Boolean ? (Boolean) value : null;
                    if (bool != null) {
                        linkedHashMap2.put(entry.getKey(), bool);
                    }
                }
                graphQlPreprocessor.a(gQLOperationDefinition, linkedHashMap2);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (obj3 instanceof GQLFragmentDefinition) {
                        arrayList2.add(obj3);
                    }
                }
                int iH = MapsKt.h(CollectionsKt.s(arrayList2, 10));
                if (iH < 16) {
                    iH = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iH);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    linkedHashMap3.put(((GQLFragmentDefinition) next2).f13548a, next2);
                }
                Map mapB = TypeIntrinsics.b(linkedHashMap3);
                while (true) {
                    LinkedHashSet linkedHashSet2 = graphQlPreprocessor.c;
                    if (linkedHashSet2.isEmpty()) {
                        break;
                    }
                    String str = (String) CollectionsKt.C(linkedHashSet2);
                    GQLFragmentDefinition gQLFragmentDefinition = (GQLFragmentDefinition) mapB.remove(str);
                    if (gQLFragmentDefinition != null) {
                        graphQlPreprocessor.a(gQLFragmentDefinition, linkedHashMap2);
                    }
                    linkedHashSet2.remove(str);
                }
                ArrayList arrayList3 = new ArrayList();
                String lowerCase = gQLOperationDefinition.f13562a.toLowerCase(Locale.ROOT);
                Intrinsics.g(lowerCase, "toLowerCase(...)");
                arrayList3.add(lowerCase);
                String str2 = gQLOperationDefinition.b;
                if (str2 != null) {
                    arrayList3.add(str2);
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : iterable) {
                    if (linkedHashSet.contains(((GQLVariableDefinition) obj4).getF13570a())) {
                        arrayList4.add(obj4);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList3.add("(");
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        GQLVariableDefinition gQLVariableDefinition2 = (GQLVariableDefinition) it3.next();
                        GraphQlPreprocessorKt.a(arrayList3, YU.a.A("$", gQLVariableDefinition2.getF13570a()), ":", GraphQlPreprocessor.b(gQLVariableDefinition2.getB()));
                        GQLValue c2 = gQLVariableDefinition2.getC();
                        if (c2 != null) {
                            GraphQlPreprocessorKt.a(arrayList3, "=", graphQlPreprocessor.c(c2));
                        }
                        arrayList3.add(",");
                    }
                    arrayList3.remove(CollectionsKt.I(arrayList3));
                    arrayList3.add(")");
                }
                jSONObject.put(SearchIntents.EXTRA_QUERY, CollectionsKt.M(CollectionsKt.c0(graphQlPreprocessor.b, arrayList3), " ", null, null, null, 62));
                Request.Builder builderB = request.b();
                RequestBody.Companion companion = RequestBody.f26692a;
                String string2 = jSONObject.toString();
                Intrinsics.g(string2, "toString(...)");
                companion.getClass();
                builderB.f(RequestBody.Companion.b(string2, f4571a));
                return realInterceptorChain.c(new Request(builderB));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
