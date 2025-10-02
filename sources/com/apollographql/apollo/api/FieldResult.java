package com.apollographql.apollo.api;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/FieldResult;", "V", "", "Success", "Failure", "Lcom/apollographql/apollo/api/FieldResult$Failure;", "Lcom/apollographql/apollo/api/FieldResult$Success;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface FieldResult<V> {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/FieldResult$Failure;", "Lcom/apollographql/apollo/api/FieldResult;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Failure implements FieldResult {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/FieldResult$Success;", "V", "Lcom/apollographql/apollo/api/FieldResult;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success<V> implements FieldResult<V> {
    }
}
