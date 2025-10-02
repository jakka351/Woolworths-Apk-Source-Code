package com.apollographql.apollo.api;

import com.apollographql.apollo.api.Executable;
import com.apollographql.apollo.api.Operation.Data;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/Operation;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/Executable;", "Data", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Operation<D extends Data> extends Executable<D> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/Operation$Data;", "Lcom/apollographql/apollo/api/Executable$Data;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Data extends Executable.Data {
    }

    String document();

    String id();

    String name();
}
