package au.com.woolworths.feature.shop.myorders.details;

import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRatingSurveyInput;
import au.com.woolworths.feature.shop.myorders.details.models.StarCount;
import com.woolworths.R;
import com.woolworths.feature.shop.myorders.SubmitDriverRatingSurveyMutation;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel$onInputFeedbackButtonClick$1", f = "OrderDetailsViewModel.kt", l = {1021}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class OrderDetailsViewModel$onInputFeedbackButtonClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OrderDetailsViewModel q;
    public final /* synthetic */ DriverRatingSurveyInput r;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[StarCount.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StarCount.Companion companion = StarCount.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StarCount.Companion companion2 = StarCount.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                StarCount.Companion companion3 = StarCount.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                StarCount.Companion companion4 = StarCount.e;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                StarCount.Companion companion5 = StarCount.e;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailsViewModel$onInputFeedbackButtonClick$1(OrderDetailsViewModel orderDetailsViewModel, DriverRatingSurveyInput driverRatingSurveyInput, Continuation continuation) {
        super(2, continuation);
        this.q = orderDetailsViewModel;
        this.r = driverRatingSurveyInput;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderDetailsViewModel$onInputFeedbackButtonClick$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderDetailsViewModel$onInputFeedbackButtonClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        Object objA2;
        Object value3;
        Object objA3;
        Object value4;
        Object objA4;
        Object value5;
        Object objA5;
        OrderDetailsViewModel orderDetailsViewModel = this.q;
        SharedFlowImpl sharedFlowImpl = orderDetailsViewModel.u;
        MutableStateFlow mutableStateFlow = orderDetailsViewModel.t;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        DriverRatingSurveyInput driverRatingSurveyInput = this.r;
        try {
            try {
                try {
                    if (i == 0) {
                        ResultKt.b(obj);
                        do {
                            value4 = mutableStateFlow.getValue();
                            objA4 = (OrderDetailsContract.DriverRatingState) value4;
                            if (objA4 instanceof OrderDetailsContract.DriverRatingState.FeedbackInput) {
                                objA4 = OrderDetailsContract.DriverRatingState.FeedbackInput.a((OrderDetailsContract.DriverRatingState.FeedbackInput) objA4, null, null, true, 7);
                            }
                        } while (!mutableStateFlow.d(value4, objA4));
                        SubmitDriverRatingSurveyInteractor submitDriverRatingSurveyInteractor = orderDetailsViewModel.r;
                        this.p = 1;
                        obj = submitDriverRatingSurveyInteractor.f7683a.a(driverRatingSurveyInput, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    }
                    SubmitDriverRatingSurveyMutation.SubmitDriverRatingSurvey submitDriverRatingSurvey = ((SubmitDriverRatingSurveyMutation.Data) obj).f20019a;
                    if (submitDriverRatingSurvey.f20021a) {
                        StarCount.Companion companion = StarCount.e;
                        int i2 = driverRatingSurveyInput.b;
                        companion.getClass();
                        int iOrdinal = StarCount.Companion.a(i2).ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1 || iOrdinal == 2) {
                                mutableStateFlow.setValue(OrderDetailsContract.DriverRatingState.ThankYou.d);
                            } else if (iOrdinal == 3 || iOrdinal == 4) {
                                mutableStateFlow.setValue(OrderDetailsContract.DriverRatingState.ThankYou.e);
                            } else {
                                if (iOrdinal != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                mutableStateFlow.setValue(OrderDetailsContract.DriverRatingState.ThankYou.f);
                            }
                        }
                    } else {
                        sharedFlowImpl.f(new OrderDetailsContract.Actions.ShowErrorMessage(new PlainText(submitDriverRatingSurvey.b)));
                    }
                    do {
                        value5 = mutableStateFlow.getValue();
                        objA5 = (OrderDetailsContract.DriverRatingState) value5;
                        if (objA5 instanceof OrderDetailsContract.DriverRatingState.FeedbackInput) {
                            objA5 = OrderDetailsContract.DriverRatingState.FeedbackInput.a((OrderDetailsContract.DriverRatingState.FeedbackInput) objA5, null, null, false, 7);
                        }
                    } while (!mutableStateFlow.d(value5, objA5));
                } catch (ServerErrorException unused) {
                    sharedFlowImpl.f(new OrderDetailsContract.Actions.ShowErrorMessage(new ResText(R.string.order_details_driver_rating_server_error)));
                    do {
                        value = mutableStateFlow.getValue();
                        objA = (OrderDetailsContract.DriverRatingState) value;
                        if (objA instanceof OrderDetailsContract.DriverRatingState.FeedbackInput) {
                            objA = OrderDetailsContract.DriverRatingState.FeedbackInput.a((OrderDetailsContract.DriverRatingState.FeedbackInput) objA, null, null, false, 7);
                        }
                    } while (!mutableStateFlow.d(value, objA));
                }
            } catch (NoConnectivityException unused2) {
                sharedFlowImpl.f(new OrderDetailsContract.Actions.ShowErrorMessage(new ResText(R.string.error_no_network)));
                do {
                    value2 = mutableStateFlow.getValue();
                    objA2 = (OrderDetailsContract.DriverRatingState) value2;
                    if (objA2 instanceof OrderDetailsContract.DriverRatingState.FeedbackInput) {
                        objA2 = OrderDetailsContract.DriverRatingState.FeedbackInput.a((OrderDetailsContract.DriverRatingState.FeedbackInput) objA2, null, null, false, 7);
                    }
                } while (!mutableStateFlow.d(value2, objA2));
            }
            return Unit.f24250a;
        } catch (Throwable th) {
            do {
                value3 = mutableStateFlow.getValue();
                objA3 = (OrderDetailsContract.DriverRatingState) value3;
                if (objA3 instanceof OrderDetailsContract.DriverRatingState.FeedbackInput) {
                    objA3 = OrderDetailsContract.DriverRatingState.FeedbackInput.a((OrderDetailsContract.DriverRatingState.FeedbackInput) objA3, null, null, false, 7);
                }
            } while (!mutableStateFlow.d(value3, objA3));
            throw th;
        }
    }
}
