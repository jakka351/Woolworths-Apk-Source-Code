package com.apollographql.apollo.api;

import com.apollographql.apollo.api.ExecutionContext;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/api/CustomScalarAdapters;", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "Key", "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CustomScalarAdapters implements ExecutionContext.Element {
    public static final Key f = new Key();
    public static final CustomScalarAdapters g = new Builder().a();

    /* renamed from: a, reason: collision with root package name */
    public final Set f13510a;
    public final Set b;
    public final List c;
    public final boolean d;
    public final Map e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/CustomScalarAdapters$Builder;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f13511a = new LinkedHashMap();
        public boolean b;
        public Set c;
        public Set d;
        public Object e;

        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
        public final CustomScalarAdapters a() {
            return new CustomScalarAdapters(this.f13511a, this.c, this.d, this.e, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/apollographql/apollo/api/CustomScalarAdapters$Key;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "Empty", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Key implements ExecutionContext.Key<CustomScalarAdapters> {
    }

    static {
        Builder builder = new Builder();
        builder.b = true;
        builder.a();
    }

    public CustomScalarAdapters(LinkedHashMap linkedHashMap, Set set, Set set2, List list, boolean z) {
        this.f13510a = set;
        this.b = set2;
        this.c = list;
        this.d = z;
        this.e = linkedHashMap;
    }

    public final Adapter e(CustomScalarType customScalar) {
        Adapter passThroughAdapter;
        Intrinsics.h(customScalar, "customScalar");
        String str = customScalar.b;
        String str2 = customScalar.f13509a;
        Map map = this.e;
        if (map.get(str2) != null) {
            passThroughAdapter = (Adapter) map.get(str2);
        } else if (str.equals("com.apollographql.apollo.api.Upload")) {
            passThroughAdapter = Adapters.h;
        } else if (CollectionsKt.R("kotlin.String", "java.lang.String").contains(str)) {
            passThroughAdapter = Adapters.f13493a;
        } else if (CollectionsKt.R("kotlin.Boolean", "java.lang.Boolean").contains(str)) {
            passThroughAdapter = Adapters.f;
        } else if (CollectionsKt.R("kotlin.Int", "java.lang.Int").contains(str)) {
            passThroughAdapter = Adapters.b;
        } else if (CollectionsKt.R("kotlin.Double", "java.lang.Double").contains(str)) {
            passThroughAdapter = Adapters.c;
        } else if (CollectionsKt.R("kotlin.Long", "java.lang.Long").contains(str)) {
            passThroughAdapter = Adapters.e;
        } else if (CollectionsKt.R("kotlin.Float", "java.lang.Float").contains(str)) {
            passThroughAdapter = Adapters.d;
        } else if (CollectionsKt.R("kotlin.Any", "java.lang.Object").contains(str)) {
            passThroughAdapter = Adapters.g;
        } else {
            if (!this.d) {
                throw new IllegalStateException(("Can't map GraphQL type: `" + str2 + "` to: `" + str + "`. Did you forget to add a scalar Adapter?").toString());
            }
            passThroughAdapter = new PassThroughAdapter();
        }
        Intrinsics.f(passThroughAdapter, "null cannot be cast to non-null type com.apollographql.apollo.api.Adapter<T of com.apollographql.apollo.api.CustomScalarAdapters.responseAdapterFor>");
        return passThroughAdapter;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext.Element
    public final ExecutionContext.Key getKey() {
        return f;
    }
}
