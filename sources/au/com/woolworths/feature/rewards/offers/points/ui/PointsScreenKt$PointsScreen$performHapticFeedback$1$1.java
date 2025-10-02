package au.com.woolworths.feature.rewards.offers.points.ui;

import androidx.appcompat.app.AppCompatActivity;
import au.com.woolworths.android.onesite.haptic.HapticExtKt;
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
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.points.ui.PointsScreenKt$PointsScreen$performHapticFeedback$1$1", f = "PointsScreen.kt", l = {117}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PointsScreenKt$PointsScreen$performHapticFeedback$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ AppCompatActivity r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointsScreenKt$PointsScreen$performHapticFeedback$1$1(boolean z, AppCompatActivity appCompatActivity, Continuation continuation) {
        super(2, continuation);
        this.q = z;
        this.r = appCompatActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PointsScreenKt$PointsScreen$performHapticFeedback$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PointsScreenKt$PointsScreen$performHapticFeedback$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            boolean z = this.q;
            AppCompatActivity appCompatActivity = this.r;
            if (z) {
                HapticExtKt.c(appCompatActivity);
            } else {
                this.p = 1;
                if (HapticExtKt.b(appCompatActivity, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
