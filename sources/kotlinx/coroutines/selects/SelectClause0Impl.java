package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/selects/SelectClause0Impl;", "Lkotlinx/coroutines/selects/SelectClause0;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectClause0Impl implements SelectClause0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24742a;
    public final Function3 b;
    public final Function3 c;

    public SelectClause0Impl(Object obj, Function3 function3) {
        this.f24742a = obj;
        this.b = function3;
        Function3 function32 = SelectKt.f24746a;
        this.c = SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1.d;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* renamed from: a */
    public final Function3 getD() {
        return null;
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
    public final Object getF24742a() {
        return this.f24742a;
    }
}
