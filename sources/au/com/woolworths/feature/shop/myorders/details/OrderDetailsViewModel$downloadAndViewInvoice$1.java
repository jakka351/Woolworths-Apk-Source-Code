package au.com.woolworths.feature.shop.myorders.details;

import android.net.Uri;
import androidx.core.content.FileProvider;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract;
import au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions;
import au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceDownloader;
import au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceFailureException;
import com.woolworths.R;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel$downloadAndViewInvoice$1", f = "OrderDetailsViewModel.kt", l = {806}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OrderDetailsViewModel$downloadAndViewInvoice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OrderDetailsViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailsViewModel$downloadAndViewInvoice$1(OrderDetailsViewModel orderDetailsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = orderDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderDetailsViewModel$downloadAndViewInvoice$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderDetailsViewModel$downloadAndViewInvoice$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OrderDetailsViewModel orderDetailsViewModel = this.q;
        SharedFlowImpl sharedFlowImpl = orderDetailsViewModel.u;
        AnalyticsManager analyticsManager = orderDetailsViewModel.i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                analyticsManager.c(OrderDetailsActions.Y);
                sharedFlowImpl.f(new OrderDetailsContract.Actions.ShowLoadingDialog(new ResText(R.string.progress_dialog)));
                OrderInvoiceDownloader orderInvoiceDownloader = orderDetailsViewModel.l;
                File cacheDir = orderDetailsViewModel.p6().getCacheDir();
                Intrinsics.g(cacheDir, "getCacheDir(...)");
                String strValueOf = String.valueOf(orderDetailsViewModel.A);
                this.p = 1;
                obj = orderInvoiceDownloader.a(cacheDir, strValueOf, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            Uri uriD = FileProvider.d(orderDetailsViewModel.p6(), orderDetailsViewModel.p6().getPackageName() + ".fileprovider", (File) obj);
            Intrinsics.g(uriD, "getUriForFile(...)");
            sharedFlowImpl.f(new OrderDetailsContract.Actions.OpenInvoice(uriD));
        } catch (ServerErrorException unused) {
            analyticsManager.c(OrderDetailsActions.V);
            sharedFlowImpl.f(new OrderDetailsContract.Actions.ShowInvoiceErrorMessage(new ResText(R.string.order_details_invoice_server_error)));
        } catch (OrderInvoiceFailureException e) {
            Throwable cause = e.getCause();
            boolean z = cause instanceof IOException;
            Text text = e.d;
            if (z) {
                analyticsManager.c(OrderDetailsActions.Z);
            } else if (cause == null) {
                analyticsManager.j(OrderDetailsActions.a0, TrackingMetadata.Companion.a(TrackableValue.o0, text.getText(orderDetailsViewModel.p6())));
            } else {
                analyticsManager.c(OrderDetailsActions.V);
            }
            sharedFlowImpl.f(new OrderDetailsContract.Actions.ShowInvoiceErrorMessage(text));
        } catch (Throwable th) {
            Timber.f27013a.a(YU.a.d(orderDetailsViewModel.A, "Unhandled error when downloading invoice #"), th, new Object[0]);
            analyticsManager.c(OrderDetailsActions.H);
            sharedFlowImpl.f(new OrderDetailsContract.Actions.ShowInvoiceErrorMessage(new ResText(R.string.order_details_invoice_download_error)));
        }
        return Unit.f24250a;
    }
}
