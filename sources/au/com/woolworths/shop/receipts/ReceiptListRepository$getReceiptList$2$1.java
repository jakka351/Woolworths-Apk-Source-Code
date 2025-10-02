package au.com.woolworths.shop.receipts;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.shop.receipts.ReceiptsListingQuery;
import au.com.woolworths.shop.receipts.data.ReceiptListGroupHeader;
import au.com.woolworths.shop.receipts.data.ReceiptListItem;
import au.com.woolworths.shop.receipts.data.ReceiptListPageInfo;
import au.com.woolworths.shop.receipts.data.ReceiptListResponse;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Optional;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/receipts/data/ReceiptListResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.receipts.ReceiptListRepository$getReceiptList$2$1", f = "ReceiptListRepository.kt", l = {43}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ReceiptListRepository$getReceiptList$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ReceiptListResponse>, Object> {
    public int p;
    public final /* synthetic */ ReceiptListRepository q;
    public final /* synthetic */ Integer r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptListRepository$getReceiptList$2$1(ReceiptListRepository receiptListRepository, Integer num, Continuation continuation) {
        super(2, continuation);
        this.q = receiptListRepository;
        this.r = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReceiptListRepository$getReceiptList$2$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReceiptListRepository$getReceiptList$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [au.com.woolworths.shop.receipts.data.ReceiptListItem] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ReceiptListGroupHeader receiptListItem;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ApolloClient apolloClient = this.q.f12825a;
            ReceiptsListingQuery receiptsListingQuery = new ReceiptsListingQuery(Optional.Companion.a(this.r));
            apolloClient.getClass();
            ApolloCall apolloCall = new ApolloCall(apolloClient, receiptsListingQuery);
            this.p = 1;
            obj = apolloCall.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ApolloResponse apolloResponse = (ApolloResponse) obj;
        ReceiptsListingQuery.Receipts receipts = ((ReceiptsListingQuery.Data) ExceptionExtKt.k(apolloResponse)).f12827a;
        ReceiptListResponse receiptListResponse = null;
        if (receipts != null) {
            ArrayList<ReceiptsListingQuery.Item> arrayList = receipts.f12832a;
            ArrayList arrayList2 = new ArrayList();
            for (ReceiptsListingQuery.Item item : arrayList) {
                ReceiptsListingQuery.OnReceiptFeedGroupHeader onReceiptFeedGroupHeader = item.b;
                if (onReceiptFeedGroupHeader != null) {
                    receiptListItem = new ReceiptListGroupHeader(onReceiptFeedGroupHeader.f12829a);
                } else {
                    ReceiptsListingQuery.OnReceiptItem onReceiptItem = item.c;
                    receiptListItem = onReceiptItem != null ? new ReceiptListItem(onReceiptItem.f12830a, onReceiptItem.b, onReceiptItem.c) : null;
                }
                if (receiptListItem != null) {
                    arrayList2.add(receiptListItem);
                }
            }
            receiptListResponse = new ReceiptListResponse(arrayList2, new ReceiptListPageInfo(receipts.b.f12831a));
        }
        if (receiptListResponse != null) {
            return receiptListResponse;
        }
        throw ExceptionExtKt.i(apolloResponse.d);
    }
}
