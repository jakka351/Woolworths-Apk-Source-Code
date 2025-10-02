package com.apollographql.apollo.api;

import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b;
import com.apollographql.apollo.api.ExecutionContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/CombinedExecutionContext;", "Lcom/apollographql/apollo/api/ExecutionContext;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CombinedExecutionContext implements ExecutionContext {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutionContext f13503a;
    public final ExecutionContext.Element b;

    public CombinedExecutionContext(ExecutionContext left, ExecutionContext.Element element) {
        Intrinsics.h(left, "left");
        Intrinsics.h(element, "element");
        this.f13503a = left;
        this.b = element;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public final ExecutionContext a(ExecutionContext.Key key) {
        Intrinsics.h(key, "key");
        ExecutionContext.Element element = this.b;
        ExecutionContext.Element elementC = element.c(key);
        ExecutionContext executionContext = this.f13503a;
        if (elementC != null) {
            return executionContext;
        }
        ExecutionContext executionContextA = executionContext.a(key);
        return executionContextA == executionContext ? this : executionContextA == EmptyExecutionContext.f13513a ? element : new CombinedExecutionContext(executionContextA, element);
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public final Object b(ExecutionContext executionContext, b bVar) {
        return bVar.invoke(this.f13503a.b(executionContext, bVar), this.b);
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public final ExecutionContext.Element c(ExecutionContext.Key key) {
        CombinedExecutionContext combinedExecutionContext = this;
        while (true) {
            ExecutionContext.Element elementC = combinedExecutionContext.b.c(key);
            if (elementC != null) {
                return elementC;
            }
            ExecutionContext executionContext = combinedExecutionContext.f13503a;
            if (!(executionContext instanceof CombinedExecutionContext)) {
                return executionContext.c(key);
            }
            combinedExecutionContext = (CombinedExecutionContext) executionContext;
        }
    }
}
