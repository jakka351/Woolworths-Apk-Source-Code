package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.graph.AbstractBaseGraph;
import com.google.common.graph.EndpointPair;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Function {
    public final /* synthetic */ int d;

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.d) {
            case 0:
                int i = AbstractBaseGraph.AnonymousClass2.d;
                return new EndpointPair.Ordered(obj, null);
            case 1:
                int i2 = AbstractBaseGraph.AnonymousClass2.d;
                new EndpointPair.Ordered(null, obj);
                throw null;
            default:
                int i3 = AbstractBaseGraph.AnonymousClass2.d;
                return new EndpointPair.Unordered(obj, null);
        }
    }
}
