package me.oriient.internal.services.dataManager.utils;

import com.squareup.sqldelight.ColumnAdapter;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes7.dex */
public final class a implements ColumnAdapter {
    @Override // com.squareup.sqldelight.ColumnAdapter
    public final Object decode(Object obj) {
        String databaseValue = (String) obj;
        Intrinsics.h(databaseValue, "databaseValue");
        return databaseValue.length() == 0 ? EmptyList.d : StringsKt.T(databaseValue, new String[]{","}, 6);
    }

    @Override // com.squareup.sqldelight.ColumnAdapter
    public final Object encode(Object obj) {
        List value = (List) obj;
        Intrinsics.h(value, "value");
        return CollectionsKt.M(value, ",", null, null, null, 62);
    }
}
