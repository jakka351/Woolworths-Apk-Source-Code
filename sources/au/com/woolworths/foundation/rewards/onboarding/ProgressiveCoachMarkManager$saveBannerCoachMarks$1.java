package au.com.woolworths.foundation.rewards.onboarding;

import android.app.Application;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$saveBannerCoachMarks$1", f = "ProgressiveCoachMarkManager.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ProgressiveCoachMarkManager$saveBannerCoachMarks$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ProgressiveCoachMarkManager p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressiveCoachMarkManager$saveBannerCoachMarks$1(ProgressiveCoachMarkManager progressiveCoachMarkManager, String str, Continuation continuation) {
        super(2, continuation);
        this.p = progressiveCoachMarkManager;
        this.q = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProgressiveCoachMarkManager$saveBannerCoachMarks$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ProgressiveCoachMarkManager$saveBannerCoachMarks$1 progressiveCoachMarkManager$saveBannerCoachMarks$1 = (ProgressiveCoachMarkManager$saveBannerCoachMarks$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        progressiveCoachMarkManager$saveBannerCoachMarks$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        try {
            Application application = this.p.f8634a;
            SharedPreferences sharedPreferences = application.getSharedPreferences(application.getPackageName() + ".progressive_onboarding", 0);
            Intrinsics.g(sharedPreferences, "access$getSharedPreferences(...)");
            String str = this.q;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("steps", str);
            editorEdit.apply();
        } catch (Exception e) {
            Timber.f27013a.f(e);
        }
        return Unit.f24250a;
    }
}
