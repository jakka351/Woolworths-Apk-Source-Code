package io.reactivex.internal.util;

import io.reactivex.functions.BiFunction;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ListAddBiConsumer implements BiFunction<List, Object, List> {
    public static final /* synthetic */ ListAddBiConsumer[] d = {new ListAddBiConsumer("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    ListAddBiConsumer EF5;

    public static ListAddBiConsumer valueOf(String str) {
        return (ListAddBiConsumer) Enum.valueOf(ListAddBiConsumer.class, str);
    }

    public static ListAddBiConsumer[] values() {
        return (ListAddBiConsumer[]) d.clone();
    }

    @Override // io.reactivex.functions.BiFunction
    public final Object apply(Object obj, Object obj2) {
        List list = (List) obj;
        list.add(obj2);
        return list;
    }
}
