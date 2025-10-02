package com.apollographql.apollo.api;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/BPossibleTypes;", "Lcom/apollographql/apollo/api/BTerm;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BPossibleTypes extends BTerm {

    /* renamed from: a, reason: collision with root package name */
    public final Set f13496a;

    public BPossibleTypes(Set set) {
        this.f13496a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BPossibleTypes) && Intrinsics.c(this.f13496a, ((BPossibleTypes) obj).f13496a);
    }

    public final int hashCode() {
        return this.f13496a.hashCode();
    }

    public final String toString() {
        return "BPossibleTypes(possibleTypes=" + this.f13496a + ')';
    }
}
