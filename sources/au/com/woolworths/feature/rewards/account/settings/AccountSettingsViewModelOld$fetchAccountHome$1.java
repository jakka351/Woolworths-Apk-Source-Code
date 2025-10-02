package au.com.woolworths.feature.rewards.account.settings;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.account.data.AccountHome;
import au.com.woolworths.feature.rewards.account.data.AccountHomeError;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import au.com.woolworths.sdui.common.alert.model.BasicInsetAlertModel;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.settings.AccountSettingsViewModelOld$fetchAccountHome$1", f = "AccountSettingsViewModelOld.kt", l = {132}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class AccountSettingsViewModelOld$fetchAccountHome$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AccountSettingsViewModelOld q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSettingsViewModelOld$fetchAccountHome$1(AccountSettingsViewModelOld accountSettingsViewModelOld, Continuation continuation) {
        super(2, continuation);
        this.q = accountSettingsViewModelOld;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountSettingsViewModelOld$fetchAccountHome$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountSettingsViewModelOld$fetchAccountHome$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        BasicInsetAlertModel basicInsetAlertModel;
        Object obj2;
        AccountSettingsViewModelOld accountSettingsViewModelOld = this.q;
        FeatureToggleManager featureToggleManager = accountSettingsViewModelOld.i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                AccountSettingsInteractorOld accountSettingsInteractorOld = accountSettingsViewModelOld.f;
                this.p = 1;
                obj = accountSettingsInteractorOld.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            AccountHome accountHome = (AccountHome) obj;
            boolean zC = featureToggleManager.c(RewardsBaseFeature.o);
            Collection collection = EmptyList.d;
            Collection collectionQ = (zC && (basicInsetAlertModel = accountHome.f5697a) != null) ? CollectionsKt.Q(basicInsetAlertModel) : collection;
            Collection collectionQ2 = (featureToggleManager.c(RewardsBaseFeature.g) && (obj2 = accountHome.b) != null) ? CollectionsKt.Q(obj2) : collection;
            Collection collection2 = accountHome.c;
            if (collection2 != null) {
                collection = collection2;
            }
            AccountSettingsViewModelOld.v6(accountSettingsViewModelOld, accountSettingsViewModelOld.n, null, accountSettingsViewModelOld.s6(CollectionsKt.c0(collection, CollectionsKt.c0(collectionQ2, collectionQ))), accountHome.d, false, true, 13);
            String str = accountSettingsViewModelOld.r;
            if (str != null) {
                accountSettingsViewModelOld.r6(str);
            }
        } catch (NoConnectivityException unused) {
            AccountSettingsViewModelOld.v6(accountSettingsViewModelOld, accountSettingsViewModelOld.n, null, CollectionsKt.Q(new AccountHomeError(AccountSettingsErrorStateOld.d)), null, false, false, 13);
        } catch (ServerErrorException unused2) {
            AccountSettingsViewModelOld.v6(accountSettingsViewModelOld, accountSettingsViewModelOld.n, null, CollectionsKt.Q(new AccountHomeError(AccountSettingsErrorStateOld.e)), null, false, false, 13);
        }
        return Unit.f24250a;
    }
}
