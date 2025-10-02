package com.apollographql.apollo.api;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Operation.Data;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.api.http.HttpMethod;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/apollographql/apollo/api/ApolloRequest;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ExecutionOptions;", "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApolloRequest<D extends Operation.Data> implements ExecutionOptions {
    public final Operation d;
    public final UUID e;
    public final ExecutionContext f;
    public final HttpMethod g;
    public final List h;
    public final Boolean i;
    public final Boolean j;
    public final Boolean k;
    public final Boolean l;
    public final Boolean m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/MutableExecutionOptions;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder<D extends Operation.Data> implements MutableExecutionOptions<Builder<D>> {
        public final Operation d;
        public UUID e;
        public ExecutionContext f = EmptyExecutionContext.f13513a;
        public HttpMethod g;
        public List h;
        public Boolean i;
        public Boolean j;
        public Boolean k;
        public Boolean l;
        public Boolean m;

        public Builder(Operation operation) {
            this.d = operation;
        }

        public final void a(String str, String value) {
            Intrinsics.h(value, "value");
            Collection collection = this.h;
            if (collection == null) {
                collection = EmptyList.d;
            }
            this.h = CollectionsKt.d0(new HttpHeader(str, value), collection);
        }

        public final ApolloRequest b() {
            UUID uuidRandomUUID = this.e;
            if (uuidRandomUUID == null) {
                uuidRandomUUID = UUID.randomUUID();
                Intrinsics.g(uuidRandomUUID, "randomUUID(...)");
            }
            return new ApolloRequest(this.d, uuidRandomUUID, this.f, this.g, this.h, this.j, this.k, this.i, this.l, this.m);
        }
    }

    public ApolloRequest(Operation operation, UUID uuid, ExecutionContext executionContext, HttpMethod httpMethod, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.d = operation;
        this.e = uuid;
        this.f = executionContext;
        this.g = httpMethod;
        this.h = list;
        this.i = bool;
        this.j = bool2;
        this.k = bool3;
        this.l = bool4;
        this.m = bool5;
    }

    public final Builder a() {
        Builder builder = new Builder(this.d);
        builder.e = this.e;
        ExecutionContext executionContext = this.f;
        Intrinsics.h(executionContext, "executionContext");
        builder.f = executionContext;
        builder.g = this.g;
        builder.h = this.h;
        builder.j = this.i;
        builder.k = this.j;
        builder.i = this.k;
        builder.l = this.l;
        builder.m = this.m;
        return builder;
    }
}
