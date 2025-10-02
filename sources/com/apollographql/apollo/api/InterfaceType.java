package com.apollographql.apollo.api;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/InterfaceType;", "Lcom/apollographql/apollo/api/CompiledNamedType;", "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InterfaceType extends CompiledNamedType {
    public final List b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/InterfaceType$Builder;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final String f13517a;
        public List b = EmptyList.d;

        public Builder(String str) {
            this.f13517a = str;
        }

        public final InterfaceType a() {
            return new InterfaceType(this.f13517a, this.b);
        }
    }

    public InterfaceType(String str, List list) {
        super(str);
        this.b = list;
    }
}
