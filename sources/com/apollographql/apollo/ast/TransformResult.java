package com.apollographql.apollo.ast;

import com.apollographql.apollo.annotations.ApolloExperimental;
import kotlin.Metadata;

@ApolloExperimental
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/ast/TransformResult;", "", "Delete", "Continue", "Replace", "Lcom/apollographql/apollo/ast/TransformResult$Continue;", "Lcom/apollographql/apollo/ast/TransformResult$Delete;", "Lcom/apollographql/apollo/ast/TransformResult$Replace;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TransformResult {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/TransformResult$Continue;", "Lcom/apollographql/apollo/ast/TransformResult;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Continue implements TransformResult {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/TransformResult$Delete;", "Lcom/apollographql/apollo/ast/TransformResult;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Delete implements TransformResult {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/TransformResult$Replace;", "Lcom/apollographql/apollo/ast/TransformResult;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Replace implements TransformResult {
    }
}
