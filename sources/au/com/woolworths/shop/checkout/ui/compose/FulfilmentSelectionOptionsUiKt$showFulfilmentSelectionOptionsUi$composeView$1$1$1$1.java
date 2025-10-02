package au.com.woolworths.shop.checkout.ui.compose;

import androidx.compose.runtime.MutableState;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOption;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionsInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionsItem;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionsState;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsGroup;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlot;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsContract;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.compose.FulfilmentSelectionOptionsUiKt$showFulfilmentSelectionOptionsUi$composeView$1$1$1$1", f = "FulfilmentSelectionOptionsUi.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FulfilmentSelectionOptionsUiKt$showFulfilmentSelectionOptionsUi$composeView$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ FulfilmentWindowsViewModel q;
    public final /* synthetic */ FulfilmentWindowsSlot r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableState t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FulfilmentSelectionOptionsUiKt$showFulfilmentSelectionOptionsUi$composeView$1$1$1$1(FulfilmentWindowsViewModel fulfilmentWindowsViewModel, FulfilmentWindowsSlot fulfilmentWindowsSlot, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.q = fulfilmentWindowsViewModel;
        this.r = fulfilmentWindowsSlot;
        this.s = mutableState;
        this.t = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FulfilmentSelectionOptionsUiKt$showFulfilmentSelectionOptionsUi$composeView$1$1$1$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FulfilmentSelectionOptionsUiKt$showFulfilmentSelectionOptionsUi$composeView$1$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = this.q.l;
            final MutableState mutableState = this.s;
            final MutableState mutableState2 = this.t;
            final FulfilmentWindowsSlot fulfilmentWindowsSlot = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.checkout.ui.compose.FulfilmentSelectionOptionsUiKt$showFulfilmentSelectionOptionsUi$composeView$1$1$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Object next;
                    T next2;
                    FulfilmentSlotSelectionOptionsItem fulfilmentSlotSelectionOptionsItem;
                    T next3;
                    FulfilmentWindowsOption fulfilmentWindowsOption = ((FulfilmentWindowsContract.ViewState) obj2).d;
                    if (fulfilmentWindowsOption != null) {
                        int i2 = fulfilmentWindowsSlot.d;
                        List list = fulfilmentWindowsOption.m;
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            CollectionsKt.h(((FulfilmentWindowsGroup) it.next()).f, arrayList);
                        }
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            if (((FulfilmentWindowsSlot) next).d == i2) {
                                break;
                            }
                        }
                        FulfilmentWindowsSlot fulfilmentWindowsSlot2 = (FulfilmentWindowsSlot) next;
                        if (fulfilmentWindowsSlot2 != null) {
                            FulfilmentSlotSelectionOptionsState fulfilmentSlotSelectionOptionsState = fulfilmentWindowsSlot2.k;
                            MutableState mutableState3 = mutableState;
                            FulfilmentSlotSelectionOptionsInfo fulfilmentSlotSelectionOptionsInfo = (FulfilmentSlotSelectionOptionsInfo) mutableState3.getD();
                            List list2 = ((FulfilmentSlotSelectionOptionsInfo) mutableState3.getD()).b;
                            ArrayList arrayList2 = new ArrayList();
                            for (T t : list2) {
                                FulfilmentSlotSelectionOption fulfilmentSlotSelectionOption = (FulfilmentSlotSelectionOption) t;
                                if (fulfilmentSlotSelectionOptionsState != null) {
                                    Iterator<T> it3 = ((Iterable) fulfilmentSlotSelectionOptionsState.f10608a).iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            next3 = (T) null;
                                            break;
                                        }
                                        next3 = it3.next();
                                        if (((FulfilmentSlotSelectionOptionsItem) next3).f10607a == fulfilmentSlotSelectionOption.f10605a) {
                                            break;
                                        }
                                    }
                                    fulfilmentSlotSelectionOptionsItem = next3;
                                } else {
                                    fulfilmentSlotSelectionOptionsItem = null;
                                }
                                if (fulfilmentSlotSelectionOptionsItem != null) {
                                    arrayList2.add(t);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                FulfilmentSlotSelectionOption fulfilmentSlotSelectionOption2 = (FulfilmentSlotSelectionOption) it4.next();
                                if (fulfilmentSlotSelectionOptionsState != null) {
                                    Iterator<T> it5 = ((Iterable) fulfilmentSlotSelectionOptionsState.f10608a).iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            next2 = (T) null;
                                            break;
                                        }
                                        next2 = it5.next();
                                        if (((FulfilmentSlotSelectionOptionsItem) next2).f10607a == fulfilmentSlotSelectionOption2.f10605a) {
                                            break;
                                        }
                                    }
                                    FulfilmentSlotSelectionOptionsItem fulfilmentSlotSelectionOptionsItem2 = next2;
                                    if (fulfilmentSlotSelectionOptionsItem2 != null) {
                                        if (fulfilmentSlotSelectionOptionsItem2.c) {
                                            mutableState2.setValue(fulfilmentSlotSelectionOptionsItem2.f10607a);
                                        }
                                        fulfilmentSlotSelectionOption2 = new FulfilmentSlotSelectionOption(fulfilmentSlotSelectionOption2.f10605a, fulfilmentSlotSelectionOption2.b, fulfilmentSlotSelectionOption2.c, fulfilmentSlotSelectionOption2.d, fulfilmentSlotSelectionOption2.e, fulfilmentSlotSelectionOption2.f, fulfilmentSlotSelectionOption2.g, fulfilmentSlotSelectionOption2.h, fulfilmentSlotSelectionOptionsItem2.b, fulfilmentSlotSelectionOptionsItem2.c);
                                    }
                                }
                                arrayList3.add(fulfilmentSlotSelectionOption2);
                            }
                            mutableState3.setValue(new FulfilmentSlotSelectionOptionsInfo(fulfilmentSlotSelectionOptionsInfo.f10606a, arrayList3));
                        }
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
