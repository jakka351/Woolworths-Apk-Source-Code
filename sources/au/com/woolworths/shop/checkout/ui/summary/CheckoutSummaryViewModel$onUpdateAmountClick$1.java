package au.com.woolworths.shop.checkout.ui.summary;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.shop.checkout.data.source.MutationErrorException;
import au.com.woolworths.shop.checkout.data.source.NoProductsException;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.ProgressIdKt;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel;
import au.com.woolworths.shop.checkout.ui.content.CheckoutFullPageErrorState;
import au.com.woolworths.shop.checkout.ui.content.SnackBarErrorType;
import au.com.woolworths.shop.checkout.ui.summary.rewards.RewardsQuantitySelectorActionType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryViewModel$onUpdateAmountClick$1", f = "CheckoutSummaryViewModel.kt", l = {480}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CheckoutSummaryViewModel$onUpdateAmountClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ RewardsAmountSelectorAnalytics.RewardsAmountSelector.Action A;
    public Event p;
    public Event q;
    public CheckoutSummaryViewModel r;
    public String s;
    public CheckoutSummaryViewModel t;
    public int u;
    public int v;
    public final /* synthetic */ CheckoutSummaryViewModel w;
    public final /* synthetic */ RewardsQuantitySelectorActionType x;
    public final /* synthetic */ int y;
    public final /* synthetic */ String z;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[RewardsQuantitySelectorActionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RewardsQuantitySelectorActionType rewardsQuantitySelectorActionType = RewardsQuantitySelectorActionType.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RewardsQuantitySelectorActionType rewardsQuantitySelectorActionType2 = RewardsQuantitySelectorActionType.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutSummaryViewModel$onUpdateAmountClick$1(CheckoutSummaryViewModel checkoutSummaryViewModel, RewardsQuantitySelectorActionType rewardsQuantitySelectorActionType, int i, String str, RewardsAmountSelectorAnalytics.RewardsAmountSelector.Action action, Continuation continuation) {
        super(2, continuation);
        this.w = checkoutSummaryViewModel;
        this.x = rewardsQuantitySelectorActionType;
        this.y = i;
        this.z = str;
        this.A = action;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutSummaryViewModel$onUpdateAmountClick$1(this.w, this.x, this.y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutSummaryViewModel$onUpdateAmountClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CheckoutSummaryViewModel checkoutSummaryViewModel;
        Event event;
        Event event2;
        String str;
        CheckoutSummaryViewModel checkoutSummaryViewModel2;
        int i;
        Event event3;
        Event event4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = this.v;
        if (i2 == 0) {
            ResultKt.b(obj);
            checkoutSummaryViewModel = this.w;
            Screens screensA = ProgressIdKt.a(checkoutSummaryViewModel.q);
            RewardsAmountSelectorAnalytics.RewardsAmountSelector.Action action = this.A;
            RewardsQuantitySelectorActionType rewardsQuantitySelectorActionType = this.x;
            if (screensA != null) {
                int iOrdinal = rewardsQuantitySelectorActionType.ordinal();
                if (iOrdinal == 0) {
                    event4 = (Event) action.c.getD();
                } else if (iOrdinal == 1) {
                    event4 = (Event) action.g.getD();
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    event4 = (Event) action.e.getD();
                }
                event = event4;
            } else {
                event = null;
            }
            if (ProgressIdKt.a(checkoutSummaryViewModel.q) != null) {
                int iOrdinal2 = rewardsQuantitySelectorActionType.ordinal();
                if (iOrdinal2 == 0) {
                    event3 = (Event) action.b.getD();
                } else if (iOrdinal2 == 1) {
                    event3 = (Event) action.f.getD();
                } else {
                    if (iOrdinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    event3 = (Event) action.d.getD();
                }
                event2 = event3;
            } else {
                event2 = null;
            }
            int i3 = rewardsQuantitySelectorActionType == RewardsQuantitySelectorActionType.f ? 0 : this.y;
            str = this.z;
            try {
                CheckoutSummaryInteractor checkoutSummaryInteractor = checkoutSummaryViewModel.o;
                Integer num = new Integer(i3);
                this.p = event;
                this.q = event2;
                this.r = checkoutSummaryViewModel;
                this.s = str;
                this.t = checkoutSummaryViewModel;
                this.u = 1;
                this.v = 1;
                obj = checkoutSummaryInteractor.f10823a.m(num, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                checkoutSummaryViewModel2 = checkoutSummaryViewModel;
                i = 1;
            } catch (NoConnectivityException unused) {
                checkoutSummaryViewModel2 = checkoutSummaryViewModel;
                checkoutSummaryViewModel2.B6(checkoutSummaryViewModel2.j, new SnackBarErrorType.Network(1, event2));
                return Unit.f24250a;
            } catch (ServerErrorException unused2) {
                checkoutSummaryViewModel2 = checkoutSummaryViewModel;
                checkoutSummaryViewModel2.B6(checkoutSummaryViewModel2.j, new SnackBarErrorType.Server(str, null, event, 2));
                return Unit.f24250a;
            } catch (MutationErrorException e) {
                e = e;
                checkoutSummaryViewModel2 = checkoutSummaryViewModel;
                checkoutSummaryViewModel2.B6(checkoutSummaryViewModel2.j, new SnackBarErrorType.Server(e.d.b, null, null, 4));
                return Unit.f24250a;
            } catch (NoProductsException unused3) {
                checkoutSummaryViewModel2 = checkoutSummaryViewModel;
                CheckoutContentViewModel.p6(checkoutSummaryViewModel2, checkoutSummaryViewModel2.j, CheckoutFullPageErrorState.f);
                return Unit.f24250a;
            } catch (IllegalArgumentException e2) {
                e = e2;
                checkoutSummaryViewModel2 = checkoutSummaryViewModel;
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.h), e, null, 12);
                checkoutSummaryViewModel2.B6(checkoutSummaryViewModel2.j, new SnackBarErrorType.Server(null, null, null, 7));
                return Unit.f24250a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.u;
            checkoutSummaryViewModel = this.t;
            str = this.s;
            checkoutSummaryViewModel2 = this.r;
            event2 = this.q;
            event = this.p;
            try {
                ResultKt.b(obj);
            } catch (NoConnectivityException unused4) {
                checkoutSummaryViewModel2.B6(checkoutSummaryViewModel2.j, new SnackBarErrorType.Network(1, event2));
                return Unit.f24250a;
            } catch (ServerErrorException unused5) {
                checkoutSummaryViewModel2.B6(checkoutSummaryViewModel2.j, new SnackBarErrorType.Server(str, null, event, 2));
                return Unit.f24250a;
            } catch (MutationErrorException e3) {
                e = e3;
                checkoutSummaryViewModel2.B6(checkoutSummaryViewModel2.j, new SnackBarErrorType.Server(e.d.b, null, null, 4));
                return Unit.f24250a;
            } catch (NoProductsException unused6) {
                CheckoutContentViewModel.p6(checkoutSummaryViewModel2, checkoutSummaryViewModel2.j, CheckoutFullPageErrorState.f);
                return Unit.f24250a;
            } catch (IllegalArgumentException e4) {
                e = e4;
                Bark.Companion companion2 = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.h), e, null, 12);
                checkoutSummaryViewModel2.B6(checkoutSummaryViewModel2.j, new SnackBarErrorType.Server(null, null, null, 7));
                return Unit.f24250a;
            }
        }
        checkoutSummaryViewModel.y6((Checkout) obj, i != 0);
        return Unit.f24250a;
    }
}
