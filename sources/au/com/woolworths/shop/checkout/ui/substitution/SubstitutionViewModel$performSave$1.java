package au.com.woolworths.shop.checkout.ui.substitution;

import au.com.woolworths.shop.checkout.domain.interactor.SubstitutionInteractor;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreferenceOption;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.bouncycastle.math.Primes;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.substitution.SubstitutionViewModel$performSave$1", f = "SubstitutionViewModel.kt", l = {Primes.SMALL_FACTOR_LIMIT}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class SubstitutionViewModel$performSave$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SubstitutionViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubstitutionViewModel$performSave$1(SubstitutionViewModel substitutionViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = substitutionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SubstitutionViewModel$performSave$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SubstitutionViewModel$performSave$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object objB;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        SubstitutionViewModel substitutionViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                MutableStateFlow mutableStateFlow = substitutionViewModel.j;
                do {
                    value = mutableStateFlow.getValue();
                    objA = (SubstitutionContract.ViewState) value;
                    if (objA instanceof SubstitutionContract.ViewState.Content) {
                        objA = SubstitutionContract.ViewState.Content.a((SubstitutionContract.ViewState.Content) objA, null, SubstitutionContract.ViewState.ButtonState.f, null, false, 27);
                    }
                } while (!mutableStateFlow.d(value, objA));
                Object value2 = substitutionViewModel.j.getValue();
                Intrinsics.f(value2, "null cannot be cast to non-null type au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract.ViewState.Content");
                SubstitutionContract.ViewState.Content content = (SubstitutionContract.ViewState.Content) value2;
                String str = content.b;
                SubstitutionViewModel.q6(substitutionViewModel, content);
                for (Object obj2 : content.f10815a.c.c) {
                    if (((SubstitutionPreferenceOption) obj2).f10666a.equals(str)) {
                        SubstitutionPreferenceOption substitutionPreferenceOption = (SubstitutionPreferenceOption) obj2;
                        SubstitutionInteractor substitutionInteractor = substitutionViewModel.e;
                        String str2 = substitutionViewModel.m;
                        if (str2 == null) {
                            Intrinsics.p("productId");
                            throw null;
                        }
                        Map map = substitutionPreferenceOption.f ? content.d : EmptyMap.d;
                        this.p = 1;
                        objB = substitutionInteractor.b(str2, str, map, this);
                        if (objB == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            objB = ((Result) obj).d;
            ResultKt.b(objB);
            if (((Boolean) objB).booleanValue()) {
                substitutionViewModel.h.f(SubstitutionContract.Action.LeaveScreen.f10812a);
            } else {
                SubstitutionViewModel.p6(substitutionViewModel);
            }
        } catch (Exception unused) {
            SubstitutionViewModel.p6(substitutionViewModel);
        }
        return Unit.f24250a;
    }
}
