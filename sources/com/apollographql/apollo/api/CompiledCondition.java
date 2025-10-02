package com.apollographql.apollo.api;

import androidx.camera.core.impl.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/CompiledCondition;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CompiledCondition {

    /* renamed from: a, reason: collision with root package name */
    public final String f13504a;
    public final boolean b;

    public CompiledCondition(String str, boolean z) {
        this.f13504a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompiledCondition)) {
            return false;
        }
        CompiledCondition compiledCondition = (CompiledCondition) obj;
        return this.f13504a.equals(compiledCondition.f13504a) && this.b == compiledCondition.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f13504a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompiledCondition(name=");
        sb.append(this.f13504a);
        sb.append(", inverted=");
        return b.s(sb, this.b, ')');
    }
}
