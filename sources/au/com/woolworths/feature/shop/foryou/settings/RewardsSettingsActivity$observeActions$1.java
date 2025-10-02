package au.com.woolworths.feature.shop.foryou.settings;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsContract;
import au.com.woolworths.feature.shop.foryou.settings.analytics.RewardsSettingsActionData;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsActivity$observeActions$1", f = "RewardsSettingsActivity.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsSettingsActivity$observeActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsSettingsActivity q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsActivity$observeActions$1$1", f = "RewardsSettingsActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsActivity$observeActions$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<RewardsSettingsContract.Actions, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ RewardsSettingsActivity q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RewardsSettingsActivity rewardsSettingsActivity, Continuation continuation) {
            super(2, continuation);
            this.q = rewardsSettingsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((RewardsSettingsContract.Actions) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            RewardsSettingsContract.Actions actions = (RewardsSettingsContract.Actions) this.p;
            int i = RewardsSettingsActivity.C;
            boolean zC = Intrinsics.c(actions, RewardsSettingsContract.Actions.DisplayRedemptionSettings.f7139a);
            final RewardsSettingsActivity rewardsSettingsActivity = this.q;
            if (zC) {
                rewardsSettingsActivity.O4().c(RewardsSettingsActionData.f);
                try {
                    rewardsSettingsActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("com.woolworths.rewards://redemptionSettings")));
                } catch (ActivityNotFoundException unused) {
                    rewardsSettingsActivity.startActivity(ActivityNavigatorKt.a(Activities.RewardsPromoApp.f4521a, ApplicationType.e));
                }
            } else {
                int i2 = 4;
                if (actions instanceof RewardsSettingsContract.Actions.RemoveCardServerError) {
                    new AlertDialog.Builder(rewardsSettingsActivity).setTitle(R.string.server_error_heading).setMessage(R.string.rewards_unable_to_remove_card_error).setPositiveButton(android.R.string.ok, new au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.a(rewardsSettingsActivity, RewardsSettingsActionData.p, i2)).show();
                } else if (actions instanceof RewardsSettingsContract.Actions.RemoveCardNetworkError) {
                    new AlertDialog.Builder(rewardsSettingsActivity).setTitle(R.string.no_network_heading).setMessage(R.string.rewards_unable_to_remove_card_error).setPositiveButton(android.R.string.ok, new au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.a(rewardsSettingsActivity, RewardsSettingsActionData.n, i2)).show();
                } else if (actions instanceof RewardsSettingsContract.Actions.NavigateToUrl) {
                    RewardsSettingsContract.Actions.NavigateToUrl navigateToUrl = (RewardsSettingsContract.Actions.NavigateToUrl) actions;
                    RewardsSettingsActionData rewardsSettingsActionData = navigateToUrl.b;
                    if (rewardsSettingsActionData != null) {
                        rewardsSettingsActivity.O4().c(rewardsSettingsActionData);
                    }
                    String str = navigateToUrl.f7140a;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    rewardsSettingsActivity.startActivity(intent);
                } else if (Intrinsics.c(actions, RewardsSettingsContract.Actions.RemoveRewardsCards.f7141a)) {
                    rewardsSettingsActivity.O4().c(RewardsSettingsActionData.i);
                    rewardsSettingsActivity.O4().c(RewardsSettingsActionData.j);
                    final int i3 = 1;
                    AlertDialog.Builder negativeButton = new AlertDialog.Builder(rewardsSettingsActivity).setTitle(R.string.rewards_settings_remove_rewards_card).setMessage(R.string.rewards_settings_remove_rewards_card_message).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.feature.shop.foryou.settings.b
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            int i5 = i3;
                            RewardsSettingsActivity rewardsSettingsActivity2 = rewardsSettingsActivity;
                            switch (i5) {
                                case 0:
                                    int i6 = RewardsSettingsActivity.C;
                                    RewardsSettingsViewModel rewardsSettingsViewModelP4 = rewardsSettingsActivity2.P4();
                                    BuildersKt.c(ViewModelKt.a(rewardsSettingsViewModelP4), null, null, new RewardsSettingsViewModel$removeRewardsCard$1(rewardsSettingsViewModelP4, null), 3);
                                    rewardsSettingsActivity2.O4().c(RewardsSettingsActionData.k);
                                    break;
                                default:
                                    int i7 = RewardsSettingsActivity.C;
                                    rewardsSettingsActivity2.O4().c(RewardsSettingsActionData.l);
                                    break;
                            }
                        }
                    });
                    final int i4 = 0;
                    negativeButton.setPositiveButton(R.string.remove, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.feature.shop.foryou.settings.b
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i42) {
                            int i5 = i4;
                            RewardsSettingsActivity rewardsSettingsActivity2 = rewardsSettingsActivity;
                            switch (i5) {
                                case 0:
                                    int i6 = RewardsSettingsActivity.C;
                                    RewardsSettingsViewModel rewardsSettingsViewModelP4 = rewardsSettingsActivity2.P4();
                                    BuildersKt.c(ViewModelKt.a(rewardsSettingsViewModelP4), null, null, new RewardsSettingsViewModel$removeRewardsCard$1(rewardsSettingsViewModelP4, null), 3);
                                    rewardsSettingsActivity2.O4().c(RewardsSettingsActionData.k);
                                    break;
                                default:
                                    int i7 = RewardsSettingsActivity.C;
                                    rewardsSettingsActivity2.O4().c(RewardsSettingsActionData.l);
                                    break;
                            }
                        }
                    }).show();
                } else {
                    if (!Intrinsics.c(actions, RewardsSettingsContract.Actions.CloseRewards.f7138a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rewardsSettingsActivity.startActivity(ActivityNavigatorKt.a(Activities.MainActivity.f4487a, ApplicationType.e).addFlags(67108864));
                }
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsSettingsActivity$observeActions$1(RewardsSettingsActivity rewardsSettingsActivity, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsSettingsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsSettingsActivity$observeActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsSettingsActivity$observeActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = RewardsSettingsActivity.C;
            RewardsSettingsActivity rewardsSettingsActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(rewardsSettingsActivity, null), FlowExtKt.a(rewardsSettingsActivity.P4().i, rewardsSettingsActivity.getD(), Lifecycle.State.h));
            this.p = 1;
            if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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
