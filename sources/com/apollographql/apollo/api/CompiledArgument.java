package com.apollographql.apollo.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/CompiledArgument;", "", "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CompiledArgument {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/CompiledArgument$Builder;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        public Builder(CompiledArgumentDefinition definition) {
            Intrinsics.h(definition, "definition");
        }

        public static CompiledArgument a() {
            return new CompiledArgument();
        }
    }
}
