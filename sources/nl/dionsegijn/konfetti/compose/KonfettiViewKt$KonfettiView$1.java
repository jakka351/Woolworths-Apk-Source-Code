package nl.dionsegijn.konfetti.compose;

import android.graphics.Rect;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableState;
import au.com.woolworths.shared.ui.compose.ConfettiKt$Confetti$2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import nl.dionsegijn.konfetti.core.Party;
import nl.dionsegijn.konfetti.core.PartySystem;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "nl.dionsegijn.konfetti.compose.KonfettiViewKt$KonfettiView$1", f = "KonfettiView.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class KonfettiViewKt$KonfettiView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ Ref.ObjectRef q;
    public final /* synthetic */ List r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ ConfettiKt$Confetti$2 u;
    public final /* synthetic */ MutableState v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KonfettiViewKt$KonfettiView$1(Ref.ObjectRef objectRef, List list, MutableState mutableState, MutableState mutableState2, ConfettiKt$Confetti$2 confettiKt$Confetti$2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.q = objectRef;
        this.r = list;
        this.s = mutableState;
        this.t = mutableState2;
        this.u = confettiKt$Confetti$2;
        this.v = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KonfettiViewKt$KonfettiView$1(this.q, this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((KonfettiViewKt$KonfettiView$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function1<Long, Unit> function1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        final Ref.ObjectRef objectRef = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            List list = this.r;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new PartySystem((Party) it.next()));
            }
            objectRef.d = arrayList;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        do {
            final ConfettiKt$Confetti$2 confettiKt$Confetti$2 = this.u;
            final MutableState mutableState = this.v;
            final MutableState mutableState2 = this.s;
            final MutableState mutableState3 = this.t;
            function1 = new Function1<Long, Unit>() { // from class: nl.dionsegijn.konfetti.compose.KonfettiViewKt$KonfettiView$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    RandomAccess randomAccessB;
                    long jLongValue = ((Number) obj2).longValue();
                    MutableState mutableState4 = mutableState2;
                    long jLongValue2 = ((Number) mutableState4.getD()).longValue() > 0 ? jLongValue - ((Number) mutableState4.getD()).longValue() : 0L;
                    mutableState4.setValue(Long.valueOf(jLongValue));
                    Ref.ObjectRef objectRef2 = objectRef;
                    Object obj3 = objectRef2.d;
                    if (obj3 == null) {
                        Intrinsics.p("partySystems");
                        throw null;
                    }
                    List<PartySystem> list2 = (List) obj3;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                    for (PartySystem partySystem : list2) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - partySystem.b;
                        partySystem.f26636a.getClass();
                        int i2 = 0;
                        if (jCurrentTimeMillis < 0) {
                            randomAccessB = EmptyList.d;
                        } else {
                            if (partySystem.a()) {
                                Object obj4 = objectRef2.d;
                                if (obj4 == null) {
                                    Intrinsics.p("partySystems");
                                    throw null;
                                }
                                List list3 = (List) obj4;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    Iterator it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        if (!((PartySystem) it2.next()).a() && (i2 = i2 + 1) < 0) {
                                            CollectionsKt.y0();
                                            throw null;
                                        }
                                    }
                                }
                                if (i2 < 1) {
                                    confettiKt$Confetti$2.f10088a.invoke();
                                }
                            }
                            randomAccessB = partySystem.b(jLongValue2 / 1000.0f, (Rect) mutableState.getD());
                        }
                        arrayList2.add(randomAccessB);
                    }
                    mutableState3.setValue(CollectionsKt.G(arrayList2));
                    return Unit.f24250a;
                }
            };
            this.p = 1;
        } while (MonotonicFrameClockKt.b(function1, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
