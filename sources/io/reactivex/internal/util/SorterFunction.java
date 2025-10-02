package io.reactivex.internal.util;

import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class SorterFunction<T> implements Function<List<T>, List<T>> {
    @Override // io.reactivex.functions.Function
    /* renamed from: apply */
    public final Object mo0apply(Object obj) {
        List list = (List) obj;
        Collections.sort(list, null);
        return list;
    }
}
