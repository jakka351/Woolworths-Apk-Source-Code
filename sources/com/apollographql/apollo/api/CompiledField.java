package com.apollographql.apollo.api;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/CompiledField;", "Lcom/apollographql/apollo/api/CompiledSelection;", "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CompiledField extends CompiledSelection {

    /* renamed from: a, reason: collision with root package name */
    public final List f13505a;
    public final List b;
    public final List c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/CompiledField$Builder;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final String f13506a;
        public final CompiledType b;
        public List c;
        public List d;
        public List e;

        public Builder(String str, CompiledType type) {
            Intrinsics.h(type, "type");
            this.f13506a = str;
            this.b = type;
            EmptyList emptyList = EmptyList.d;
            this.c = emptyList;
            this.d = emptyList;
            this.e = emptyList;
        }

        public final void a(String str) {
        }

        public final void b(List list) {
            this.d = list;
        }

        public final CompiledField c() {
            return new CompiledField(this.f13506a, this.b, this.c, this.d, this.e);
        }

        public final void d(List list) {
            this.c = list;
        }

        public final void e(List selections) {
            Intrinsics.h(selections, "selections");
            this.e = selections;
        }
    }

    public CompiledField(String str, CompiledType type, List list, List list2, List selections) {
        Intrinsics.h(type, "type");
        Intrinsics.h(selections, "selections");
        this.f13505a = list;
        this.b = list2;
        this.c = selections;
    }
}
