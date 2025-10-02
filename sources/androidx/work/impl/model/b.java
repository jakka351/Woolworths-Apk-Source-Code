package androidx.work.impl.model;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ WorkSpecDao_Impl e;

    public /* synthetic */ b(WorkSpecDao_Impl workSpecDao_Impl, int i) {
        this.d = i;
        this.e = workSpecDao_Impl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                this.e.G((HashMap) obj);
                break;
            default:
                this.e.F((HashMap) obj);
                break;
        }
        return Unit.f24250a;
    }
}
