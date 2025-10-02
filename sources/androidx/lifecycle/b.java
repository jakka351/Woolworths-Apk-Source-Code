package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MediatorLiveData e;

    public /* synthetic */ b(MediatorLiveData mediatorLiveData, int i) {
        this.d = i;
        this.e = mediatorLiveData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                this.e.m(obj);
                break;
            default:
                this.e.m(obj);
                break;
        }
        return Unit.f24250a;
    }
}
