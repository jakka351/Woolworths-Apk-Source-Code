package com.apollographql.apollo.ast;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005\u0082\u0001\u0006\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/apollographql/apollo/ast/GQLTypeDefinition;", "Lcom/apollographql/apollo/ast/GQLDefinition;", "Lcom/apollographql/apollo/ast/GQLNamed;", "Lcom/apollographql/apollo/ast/GQLDescribed;", "Lcom/apollographql/apollo/ast/GQLHasDirectives;", "Companion", "Lcom/apollographql/apollo/ast/GQLEnumTypeDefinition;", "Lcom/apollographql/apollo/ast/GQLInputObjectTypeDefinition;", "Lcom/apollographql/apollo/ast/GQLInterfaceTypeDefinition;", "Lcom/apollographql/apollo/ast/GQLObjectTypeDefinition;", "Lcom/apollographql/apollo/ast/GQLScalarTypeDefinition;", "Lcom/apollographql/apollo/ast/GQLUnionTypeDefinition;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class GQLTypeDefinition implements GQLDefinition, GQLNamed, GQLDescribed, GQLHasDirectives {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f13568a = ArraysKt.r0(new String[]{"Int", "Float", "String", "Boolean", "ID", "__Schema", "__Type", "__Field", "__InputValue", "__EnumValue", "__TypeKind", "__Directive", "__DirectiveLocation"});

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/GQLTypeDefinition$Companion;", "", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }
}
