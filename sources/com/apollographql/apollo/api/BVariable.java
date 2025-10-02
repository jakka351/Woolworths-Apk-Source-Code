package com.apollographql.apollo.api;

import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/BVariable;", "Lcom/apollographql/apollo/api/BTerm;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BVariable extends BTerm {

    /* renamed from: a, reason: collision with root package name */
    public final String f13497a;

    public BVariable(String str) {
        this.f13497a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BVariable) && Intrinsics.c(this.f13497a, ((BVariable) obj).f13497a);
    }

    public final int hashCode() {
        return this.f13497a.hashCode();
    }

    public final String toString() {
        return b.r(new StringBuilder("BVariable(name="), this.f13497a, ')');
    }
}
