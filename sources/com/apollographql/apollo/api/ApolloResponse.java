package com.apollographql.apollo.api;

import androidx.camera.core.impl.b;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Operation.Data;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloGraphQLException;
import com.apollographql.apollo.exception.DefaultApolloException;
import com.apollographql.apollo.exception.NoDataException;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/apollographql/apollo/api/ApolloResponse;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "", "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApolloResponse<D extends Operation.Data> {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f13494a;
    public final Operation b;
    public final Operation.Data c;
    public final List d;
    public final ApolloException e;
    public final Map f;
    public final ExecutionContext g;
    public final boolean h;

    public ApolloResponse(UUID uuid, Operation operation, Operation.Data data, List list, ApolloException apolloException, Map map, ExecutionContext executionContext, boolean z) {
        this.f13494a = uuid;
        this.b = operation;
        this.c = data;
        this.d = list;
        this.e = apolloException;
        this.f = map;
        this.g = executionContext;
        this.h = z;
    }

    public final Operation.Data a() {
        if (b()) {
            List list = this.d;
            Intrinsics.e(list);
            throw new ApolloGraphQLException((Error) CollectionsKt.D(list));
        }
        ApolloException apolloException = this.e;
        if (apolloException != null) {
            throw new DefaultApolloException(apolloException);
        }
        Operation.Data data = this.c;
        if (data != null) {
            return data;
        }
        throw new NoDataException(apolloException);
    }

    public final boolean b() {
        List list = this.d;
        return !(list == null || list.isEmpty());
    }

    public final Builder c() {
        Builder builder = new Builder(this.b, this.f13494a, this.c, this.d, this.f, this.e);
        ExecutionContext executionContext = this.g;
        Intrinsics.h(executionContext, "executionContext");
        builder.g = builder.g.d(executionContext);
        builder.h = this.h;
        return builder;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ApolloResponse(operationName=");
        Operation operation = this.b;
        sb.append(operation.name());
        sb.append(", data=");
        String strB = "null";
        if (this.c == null) {
            str = "null";
        } else {
            str = operation.name() + ".Data";
        }
        sb.append(str);
        sb.append(", errors=");
        List list = this.d;
        sb.append(list != null ? Integer.valueOf(list.size()) : "null");
        sb.append(", exception=");
        ApolloException apolloException = this.e;
        if (apolloException != null) {
            strB = Reflection.f24268a.b(apolloException.getClass()).B();
            if (strB == null) {
                strB = "true";
            }
        }
        return b.r(sb, strB, ')');
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/api/ApolloResponse$Builder;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder<D extends Operation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public final Operation f13495a;
        public UUID b;
        public Operation.Data c;
        public List d;
        public Map e;
        public ApolloException f;
        public ExecutionContext g;
        public boolean h;

        public Builder(Operation operation, UUID requestUuid, Operation.Data data, List list, Map map, ApolloException apolloException) {
            Intrinsics.h(operation, "operation");
            Intrinsics.h(requestUuid, "requestUuid");
            this.f13495a = operation;
            this.b = requestUuid;
            this.c = data;
            this.d = list;
            this.e = map;
            this.f = apolloException;
            this.g = EmptyExecutionContext.f13513a;
        }

        public final ApolloResponse a() {
            UUID uuid = this.b;
            Operation.Data data = this.c;
            ExecutionContext executionContext = this.g;
            Map map = this.e;
            if (map == null) {
                map = EmptyMap.d;
            }
            List list = this.d;
            ApolloException apolloException = this.f;
            boolean z = this.h;
            return new ApolloResponse(uuid, this.f13495a, data, list, apolloException, map, executionContext, z);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Operation operation, UUID uuid) {
            this(operation, uuid, null, null, null, null);
            Intrinsics.h(operation, "operation");
        }
    }
}
