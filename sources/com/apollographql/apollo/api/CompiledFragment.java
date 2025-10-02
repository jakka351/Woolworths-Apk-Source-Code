package com.apollographql.apollo.api;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/CompiledFragment;", "Lcom/apollographql/apollo/api/CompiledSelection;", "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CompiledFragment extends CompiledSelection {

    /* renamed from: a, reason: collision with root package name */
    public final List f13507a;
    public final List b;
    public final List c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/CompiledFragment$Builder;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final String f13508a;
        public final List b;
        public List c;
        public List d;

        public Builder(String str, List list) {
            this.f13508a = str;
            this.b = list;
            EmptyList emptyList = EmptyList.d;
            this.c = emptyList;
            this.d = emptyList;
        }

        public final CompiledFragment a() {
            return new CompiledFragment(this.f13508a, this.b, this.c, this.d);
        }

        public final void b(List selections) {
            Intrinsics.h(selections, "selections");
            this.d = selections;
        }
    }

    public CompiledFragment(String str, List list, List list2, List selections) {
        Intrinsics.h(selections, "selections");
        this.f13507a = list;
        this.b = list2;
        this.c = selections;
    }
}
