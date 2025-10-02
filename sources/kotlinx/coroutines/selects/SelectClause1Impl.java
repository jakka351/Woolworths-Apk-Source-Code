package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/selects/SelectClause1Impl;", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectClause1Impl<Q> implements SelectClause1<Q> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24743a;
    public final Function3 b;
    public final Function3 c;
    public final Function3 d;

    public /* synthetic */ SelectClause1Impl(Object obj, Function3 function3, Function3 function32) {
        this(obj, function3, function32, null);
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* renamed from: a, reason: from getter */
    public final Function3 getD() {
        return this.d;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* renamed from: b, reason: from getter */
    public final Function3 getC() {
        return this.c;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* renamed from: c, reason: from getter */
    public final Function3 getB() {
        return this.b;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* renamed from: d, reason: from getter */
    public final Object getF24743a() {
        return this.f24743a;
    }

    public SelectClause1Impl(Object obj, Function3 function3, Function3 function32, kotlinx.coroutines.channels.a aVar) {
        this.f24743a = obj;
        this.b = function3;
        this.c = function32;
        this.d = aVar;
    }
}
