package au.com.woolworths.feature.shop.wpay.ui.addcreditcard;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.utils.ConnectionManager;
import au.com.woolworths.feature.shop.wpay.data.json.parser.CreditCardFormEventParser;
import au.com.woolworths.feature.shop.wpay.domain.interactor.GetAddCreditCardInteractor;
import au.com.woolworths.feature.shop.wpay.domain.interactor.LinkCreditCardInteractor;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardContract;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardViewModel;", "Landroidx/lifecycle/ViewModel;", "WebOperation", "Factory", "Companion", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AddCreditCardViewModel extends ViewModel {
    public final PaymentFlowTypeData e;
    public final GetAddCreditCardInteractor f;
    public final LinkCreditCardInteractor g;
    public final ConnectionManager h;
    public final AddCreditCardAnalyticsTracker i;
    public final CreditCardFormEventParser j;
    public WebOperation k;
    public final MutableStateFlow l;
    public final BufferedChannel m;
    public final StateFlow n;
    public final Flow o;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardViewModel$Companion;", "", "", "WEB_EVENT_REASON_INVALID_DETAILS", "Ljava/lang/String;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardViewModel$Factory;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        AddCreditCardViewModel a(PaymentFlowTypeData paymentFlowTypeData);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardViewModel$WebOperation;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WebOperation {
        public static final WebOperation d;
        public static final WebOperation e;
        public static final /* synthetic */ WebOperation[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            WebOperation webOperation = new WebOperation("Load", 0);
            d = webOperation;
            WebOperation webOperation2 = new WebOperation("Process", 1);
            e = webOperation2;
            WebOperation[] webOperationArr = {webOperation, webOperation2};
            f = webOperationArr;
            g = EnumEntriesKt.a(webOperationArr);
        }

        public static WebOperation valueOf(String str) {
            return (WebOperation) Enum.valueOf(WebOperation.class, str);
        }

        public static WebOperation[] values() {
            return (WebOperation[]) f.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[WebOperation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WebOperation webOperation = WebOperation.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AddCreditCardViewModel(PaymentFlowTypeData paymentFlowTypeData, GetAddCreditCardInteractor getAddCreditCardInteractor, LinkCreditCardInteractor linkCreditCardInteractor, ConnectionManager connectionManager, AddCreditCardAnalyticsTracker addCreditCardAnalyticsTracker, CreditCardFormEventParser creditCardFormEventParser) {
        Intrinsics.h(connectionManager, "connectionManager");
        this.e = paymentFlowTypeData;
        this.f = getAddCreditCardInteractor;
        this.g = linkCreditCardInteractor;
        this.h = connectionManager;
        this.i = addCreditCardAnalyticsTracker;
        this.j = creditCardFormEventParser;
        this.k = WebOperation.d;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new AddCreditCardContract.ViewState(null, 15));
        this.l = mutableStateFlowA;
        BufferedChannel bufferedChannelA = ChannelKt.a(-2, 4, BufferOverflow.e);
        this.m = bufferedChannelA;
        this.n = mutableStateFlowA;
        this.o = FlowKt.I(bufferedChannelA);
    }
}
