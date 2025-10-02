package com.apollographql.apollo.api;

import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ Set d;
    public final /* synthetic */ Set e;
    public final /* synthetic */ List f;
    public final /* synthetic */ String g;

    public /* synthetic */ a(Set set, Set set2, List list, String str) {
        this.d = set;
        this.e = set2;
        this.f = list;
        this.g = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r4) {
        /*
            r3 = this;
            com.apollographql.apollo.api.BTerm r4 = (com.apollographql.apollo.api.BTerm) r4
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.h(r4, r0)
            boolean r0 = r4 instanceof com.apollographql.apollo.api.BVariable
            if (r0 == 0) goto L1d
            java.util.Set r0 = r3.d
            r1 = 0
            if (r0 == 0) goto L19
            com.apollographql.apollo.api.BVariable r4 = (com.apollographql.apollo.api.BVariable) r4
            java.lang.String r4 = r4.f13497a
            boolean r4 = r0.contains(r4)
            goto L1a
        L19:
            r4 = r1
        L1a:
            if (r4 != 0) goto L49
            goto L2c
        L1d:
            boolean r0 = r4 instanceof com.apollographql.apollo.api.BLabel
            if (r0 == 0) goto L39
            java.util.List r0 = r3.f
            kotlin.jvm.internal.Intrinsics.e(r0)
            com.apollographql.apollo.api.BLabel r4 = (com.apollographql.apollo.api.BLabel) r4
            java.util.Set r4 = r3.e
            if (r4 != 0) goto L2e
        L2c:
            r1 = 1
            goto L49
        L2e:
            com.apollographql.apollo.api.DeferredFragmentIdentifier r1 = new com.apollographql.apollo.api.DeferredFragmentIdentifier
            r2 = 0
            r1.<init>(r0, r2)
            boolean r1 = r4.contains(r1)
            goto L49
        L39:
            boolean r0 = r4 instanceof com.apollographql.apollo.api.BPossibleTypes
            if (r0 == 0) goto L4e
            com.apollographql.apollo.api.BPossibleTypes r4 = (com.apollographql.apollo.api.BPossibleTypes) r4
            java.util.Set r4 = r4.f13496a
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.String r0 = r3.g
            boolean r1 = kotlin.collections.CollectionsKt.t(r4, r0)
        L49:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
        L4e:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.api.a.invoke(java.lang.Object):java.lang.Object");
    }
}
