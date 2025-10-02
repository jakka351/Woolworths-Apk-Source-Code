package androidx.navigation.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DialogHostKt$DialogHost$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ DialogNavigator q;
    public final /* synthetic */ SnapshotStateList r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$2$1(MutableState mutableState, DialogNavigator dialogNavigator, SnapshotStateList snapshotStateList, Continuation continuation) {
        super(2, continuation);
        this.p = mutableState;
        this.q = dialogNavigator;
        this.r = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DialogHostKt$DialogHost$2$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        DialogHostKt$DialogHost$2$1 dialogHostKt$DialogHost$2$1 = (DialogHostKt$DialogHost$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        dialogHostKt$DialogHost$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        for (NavBackStackEntry navBackStackEntry : (Set) this.p.getD()) {
            DialogNavigator dialogNavigator = this.q;
            if (!((List) dialogNavigator.b().e.getValue()).contains(navBackStackEntry) && !this.r.contains(navBackStackEntry)) {
                dialogNavigator.b().b(navBackStackEntry);
            }
        }
        return Unit.f24250a;
    }
}
