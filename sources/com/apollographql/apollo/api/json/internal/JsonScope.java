package com.apollographql.apollo.api.json.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/json/internal/JsonScope;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class JsonScope {
    public static ArrayList a(int i, int[] stack, int[] pathIndices, String[] pathNames) {
        String str;
        Intrinsics.h(stack, "stack");
        Intrinsics.h(pathNames, "pathNames");
        Intrinsics.h(pathIndices, "pathIndices");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = stack[i2];
            if (i3 == 1 || i3 == 2) {
                arrayList.add(Integer.valueOf(pathIndices[i2]));
            } else if ((i3 == 3 || i3 == 4 || i3 == 5) && (str = pathNames[i2]) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
