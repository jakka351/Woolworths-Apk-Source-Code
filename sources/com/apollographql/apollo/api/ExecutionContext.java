package com.apollographql.apollo.api;

import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/ExecutionContext;", "", "Key", "Element", "Companion", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ExecutionContext {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcom/apollographql/apollo/api/ExecutionContext$Companion;", "", "Lcom/apollographql/apollo/api/ExecutionContext;", "Empty", "Lcom/apollographql/apollo/api/ExecutionContext;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/ExecutionContext$Element;", "Lcom/apollographql/apollo/api/ExecutionContext;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Element extends ExecutionContext {
        @Override // com.apollographql.apollo.api.ExecutionContext
        default ExecutionContext a(Key key) {
            Intrinsics.h(key, "key");
            return getKey().equals(key) ? EmptyExecutionContext.f13513a : this;
        }

        @Override // com.apollographql.apollo.api.ExecutionContext
        default Object b(ExecutionContext executionContext, b bVar) {
            return bVar.invoke(executionContext, this);
        }

        @Override // com.apollographql.apollo.api.ExecutionContext
        default Element c(Key key) {
            Intrinsics.h(key, "key");
            if (getKey().equals(key)) {
                return this;
            }
            return null;
        }

        Key getKey();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/ExecutionContext$Key;", "E", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Key<E extends Element> {
    }

    ExecutionContext a(Key key);

    Object b(ExecutionContext executionContext, b bVar);

    Element c(Key key);

    default ExecutionContext d(ExecutionContext context) {
        Intrinsics.h(context, "context");
        return context == EmptyExecutionContext.f13513a ? this : (ExecutionContext) context.b(this, new b(9));
    }
}
