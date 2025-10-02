package au.com.woolworths.feature.shop.modeselector;

import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.modeselector.model.Item;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorMutationContentKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel$onModeSelectorOptionSelected$2", f = "ModeSelectorViewModel.kt", l = {370}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ModeSelectorViewModel$onModeSelectorOptionSelected$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ModeSelectorViewModel q;
    public final /* synthetic */ Item r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModeSelectorViewModel$onModeSelectorOptionSelected$2(ModeSelectorViewModel modeSelectorViewModel, Item item, Continuation continuation) {
        super(2, continuation);
        this.q = modeSelectorViewModel;
        this.r = item;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ModeSelectorViewModel$onModeSelectorOptionSelected$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ModeSelectorViewModel$onModeSelectorOptionSelected$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        ModeSelectorViewModel modeSelectorViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                CollectionMode collectionModeA = ShoppingModeSelectorMutationContentKt.a(this.r.f7528a);
                this.p = 1;
                if (ModeSelectorViewModel.r6(modeSelectorViewModel, collectionModeA, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        } catch (NoConnectivityException e) {
            ModeSelectorViewModel.q6(modeSelectorViewModel, e);
        } catch (ServerErrorException e2) {
            ModeSelectorViewModel.q6(modeSelectorViewModel, e2);
        }
        return Unit.f24250a;
    }
}
