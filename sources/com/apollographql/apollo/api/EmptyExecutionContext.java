package com.apollographql.apollo.api;

import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b;
import com.apollographql.apollo.api.ExecutionContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/EmptyExecutionContext;", "Lcom/apollographql/apollo/api/ExecutionContext;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EmptyExecutionContext implements ExecutionContext {

    /* renamed from: a, reason: collision with root package name */
    public static final EmptyExecutionContext f13513a = new EmptyExecutionContext();

    @Override // com.apollographql.apollo.api.ExecutionContext
    public final ExecutionContext a(ExecutionContext.Key key) {
        Intrinsics.h(key, "key");
        return this;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public final Object b(ExecutionContext executionContext, b bVar) {
        return executionContext;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public final ExecutionContext.Element c(ExecutionContext.Key key) {
        return null;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public final ExecutionContext d(ExecutionContext context) {
        Intrinsics.h(context, "context");
        return context;
    }
}
