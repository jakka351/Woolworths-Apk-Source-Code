package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-livedata_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* loaded from: classes2.dex */
public final class Transformations {
    public static final MediatorLiveData a(MediatorLiveData mediatorLiveData) {
        MediatorLiveData mediatorLiveData2;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.d = true;
        if (mediatorLiveData.e != LiveData.k) {
            booleanRef.d = false;
            mediatorLiveData2 = new MediatorLiveData(mediatorLiveData.e());
        } else {
            mediatorLiveData2 = new MediatorLiveData();
        }
        mediatorLiveData2.n(mediatorLiveData, new Transformations$sam$androidx_lifecycle_Observer$0(new f(1, mediatorLiveData2, booleanRef)));
        return mediatorLiveData2;
    }

    public static final MediatorLiveData b(MutableLiveData mutableLiveData, Function1 function1) {
        Intrinsics.h(mutableLiveData, "<this>");
        MediatorLiveData mediatorLiveData = mutableLiveData.e != LiveData.k ? new MediatorLiveData(function1.invoke(mutableLiveData.e())) : new MediatorLiveData();
        mediatorLiveData.n(mutableLiveData, new Transformations$sam$androidx_lifecycle_Observer$0(new f(0, (Object) mediatorLiveData, (Object) function1)));
        return mediatorLiveData;
    }

    public static final MediatorLiveData c(LiveData liveData, final Function1 transform) {
        LiveData liveData2;
        Intrinsics.h(liveData, "<this>");
        Intrinsics.h(transform, "transform");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object obj = liveData.e;
        Object obj2 = LiveData.k;
        final MediatorLiveData mediatorLiveData = (obj == obj2 || (liveData2 = (LiveData) transform.invoke(liveData.e())) == null || liveData2.e == obj2) ? new MediatorLiveData() : new MediatorLiveData(liveData2.e());
        mediatorLiveData.n(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: androidx.lifecycle.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                LiveData liveData3 = (LiveData) transform.invoke(obj3);
                Ref.ObjectRef objectRef2 = objectRef;
                Object obj4 = objectRef2.d;
                if (obj4 != liveData3) {
                    MediatorLiveData mediatorLiveData2 = mediatorLiveData;
                    if (obj4 != null) {
                        mediatorLiveData2.o((LiveData) obj4);
                    }
                    objectRef2.d = liveData3;
                    if (liveData3 != null) {
                        mediatorLiveData2.n(liveData3, new Transformations$sam$androidx_lifecycle_Observer$0(new b(mediatorLiveData2, 1)));
                    }
                }
                return Unit.f24250a;
            }
        }));
        return mediatorLiveData;
    }
}
