package au.com.woolworths.feature.rewards.account.settings.v2;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.rewards.account.data.AccountHomeAndroidMedalliaItem;
import au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsContract;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaException;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor;
import com.woolworths.R;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsViewModel$onMedalliaItemClick$1", f = "AccountSettingsViewModel.kt", l = {238}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AccountSettingsViewModel$onMedalliaItemClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object p;
    public int q;
    public final /* synthetic */ AccountSettingsViewModel r;
    public final /* synthetic */ AccountHomeAndroidMedalliaItem s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSettingsViewModel$onMedalliaItemClick$1(AccountSettingsViewModel accountSettingsViewModel, AccountHomeAndroidMedalliaItem accountHomeAndroidMedalliaItem, Continuation continuation) {
        super(2, continuation);
        this.r = accountSettingsViewModel;
        this.s = accountHomeAndroidMedalliaItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountSettingsViewModel$onMedalliaItemClick$1(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountSettingsViewModel$onMedalliaItemClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job job;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        AccountSettingsViewModel accountSettingsViewModel = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            AccountHomeAndroidMedalliaItem accountHomeAndroidMedalliaItem = this.s;
            Job jobC = BuildersKt.c(ViewModelKt.a(accountSettingsViewModel), null, null, new AccountSettingsViewModel$logFormEventsToAnalytics$1(accountSettingsViewModel, accountHomeAndroidMedalliaItem.c, null), 3);
            try {
                MedalliaInteractor medalliaInteractor = accountSettingsViewModel.i;
                String str = accountHomeAndroidMedalliaItem.c;
                this.p = jobC;
                this.q = 1;
                medalliaInteractor.getClass();
                if (MedalliaInteractor.d(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (MedalliaException unused) {
                job = jobC;
                accountSettingsViewModel.m.k(new AccountSettingsContract.Action.ShowErrorMessage(new ResText(R.string.default_server_error_description)));
                job.cancel((CancellationException) null);
                return Unit.f24250a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            job = (Job) this.p;
            try {
                ResultKt.b(obj);
            } catch (MedalliaException unused2) {
                accountSettingsViewModel.m.k(new AccountSettingsContract.Action.ShowErrorMessage(new ResText(R.string.default_server_error_description)));
                job.cancel((CancellationException) null);
                return Unit.f24250a;
            }
        }
        return Unit.f24250a;
    }
}
