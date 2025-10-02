package com.apollographql.apollo.ast;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"apollo-ast"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GqlfieldKt {
    static {
        GQLNonNullType gQLNonNullType = new GQLNonNullType(new GQLNamedType("String"));
        EmptyList emptyList = EmptyList.d;
        new GQLFieldDefinition("__typename", emptyList, gQLNonNullType, emptyList);
        new GQLFieldDefinition("__schema", emptyList, new GQLNonNullType(new GQLNamedType("__Schema")), emptyList);
        new GQLFieldDefinition("__type", CollectionsKt.Q(new GQLInputValueDefinition(AppMeasurementSdk.ConditionalUserProperty.NAME, emptyList, new GQLNonNullType(new GQLNamedType("String")), null)), new GQLNonNullType(new GQLNamedType("__Type")), emptyList);
    }
}
