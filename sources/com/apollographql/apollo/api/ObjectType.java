package com.apollographql.apollo.api;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/ObjectType;", "Lcom/apollographql/apollo/api/CompiledNamedType;", "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ObjectType extends CompiledNamedType {
    public final List b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/ObjectType$Builder;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final String f13522a;
        public List b = EmptyList.d;

        public Builder(String str) {
            this.f13522a = str;
        }

        public final ObjectType a() {
            return new ObjectType(this.f13522a, this.b);
        }
    }

    public ObjectType(String str, List list) {
        super(str);
        this.b = list;
    }
}
