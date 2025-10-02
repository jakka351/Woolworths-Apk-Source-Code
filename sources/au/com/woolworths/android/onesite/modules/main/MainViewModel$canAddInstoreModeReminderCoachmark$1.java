package au.com.woolworths.android.onesite.modules.main;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.main.MainViewModel", f = "MainViewModel.kt", l = {309}, m = "canAddInstoreModeReminderCoachmark")
/* loaded from: classes3.dex */
final class MainViewModel$canAddInstoreModeReminderCoachmark$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ MainViewModel q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$canAddInstoreModeReminderCoachmark$1(MainViewModel mainViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return MainViewModel.p6(this.q, null, this);
    }
}
