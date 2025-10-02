package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import java.util.Collection;

/* loaded from: classes6.dex */
public final /* synthetic */ class f implements Function, Maps.EntryTransformer {
    public final /* synthetic */ Object d;

    public /* synthetic */ f(Object obj) {
        this.d = obj;
    }

    @Override // com.google.common.collect.Maps.EntryTransformer
    public Object a(Object obj, Object obj2) {
        return ((Multimaps.TransformedEntriesMultimap) this.d).h(obj, (Collection) obj2);
    }

    @Override // com.google.common.base.Function
    public Object apply(Object obj) {
        return Multimaps.AsMap.this.g.get(obj);
    }
}
