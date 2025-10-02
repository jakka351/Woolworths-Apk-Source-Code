package com.woolworths.scanlibrary.domain.productsearch;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.pagingutils.NumericPageListing;
import com.woolworths.scanlibrary.domain.productsearch.AutoCompleteUC;
import com.woolworths.scanlibrary.domain.productsearch.ProductSearchUC;
import com.woolworths.scanlibrary.domain.receipt.GetEmailReceiptUC;
import com.woolworths.scanlibrary.domain.receipt.GetParkingReceiptUC;
import com.woolworths.scanlibrary.domain.receipt.GetReceiptWithCartIdUC;
import com.woolworths.scanlibrary.domain.servicemessage.GetServiceMessageUC;
import com.woolworths.scanlibrary.domain.stores.GetAvailableStoresUC;
import com.woolworths.scanlibrary.domain.transaction.GetTransactionListUseCase;
import com.woolworths.scanlibrary.domain.transfertopos.RecallConfirmAtPosUC;
import com.woolworths.scanlibrary.domain.transfertopos.TransferToPosUC;
import com.woolworths.scanlibrary.models.notification.Notifications;
import com.woolworths.scanlibrary.models.product.search.AutocompleteResponseItem;
import com.woolworths.scanlibrary.models.product.search.SearchResponse;
import com.woolworths.scanlibrary.models.receipt.EmailReceiptResponse;
import com.woolworths.scanlibrary.models.receipt.Receipt;
import com.woolworths.scanlibrary.models.store.Store;
import com.woolworths.scanlibrary.models.store.Stores;
import com.woolworths.scanlibrary.models.transactions.TxnList;
import com.woolworths.scanlibrary.models.transferpos.TransferToPosResponse;
import com.woolworths.scanlibrary.ui.productsearch.datasource.PagedKeyProductSearchDataSource;
import com.woolworths.shop.product.ui.boost.BoostingState;
import io.reactivex.Single;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import okhttp3.ResponseBody;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                List list = (List) obj;
                Intrinsics.h(list, "list");
                return list;
            case 1:
                AutocompleteResponseItem autoCompleteItem = (AutocompleteResponseItem) obj;
                Intrinsics.h(autoCompleteItem, "autoCompleteItem");
                return autoCompleteItem.getResult();
            case 2:
                SearchResponse it = (SearchResponse) obj;
                Intrinsics.h(it, "it");
                return new ProductSearchUC.ResponseValue(it);
            case 3:
                SearchResponse it2 = (SearchResponse) obj;
                Intrinsics.h(it2, "it");
                return new ProductSearchUC.ResponseValue(it2);
            case 4:
                EmailReceiptResponse it3 = (EmailReceiptResponse) obj;
                Intrinsics.h(it3, "it");
                return new GetEmailReceiptUC.ResponseValue(it3.getMessage());
            case 5:
                Receipt it4 = (Receipt) obj;
                Intrinsics.h(it4, "it");
                return new GetParkingReceiptUC.ResponseValue(it4);
            case 6:
                Receipt it5 = (Receipt) obj;
                Intrinsics.h(it5, "it");
                return new GetReceiptWithCartIdUC.ResponseValue(it5);
            case 7:
                Notifications it6 = (Notifications) obj;
                Intrinsics.h(it6, "it");
                return new GetServiceMessageUC.ResponseValue(it6);
            case 8:
                Stores it7 = (Stores) obj;
                Intrinsics.h(it7, "it");
                List<Store> stores = it7.getStores();
                Intrinsics.g(stores, "getStores(...)");
                return new GetAvailableStoresUC.ResponseValue(stores);
            case 9:
                TxnList response = (TxnList) obj;
                Intrinsics.h(response, "response");
                return Single.e(new GetTransactionListUseCase.ResponseValue(response));
            case 10:
                Intrinsics.h((ResponseBody) obj, "it");
                return Single.e(new RecallConfirmAtPosUC.ResponseValue());
            case 11:
                TransferToPosResponse it8 = (TransferToPosResponse) obj;
                Intrinsics.h(it8, "it");
                return Single.e(new TransferToPosUC.ResponseValue(it8.getBarcode()));
            case 12:
                NumericPageListing numericPageListing = (NumericPageListing) obj;
                if (numericPageListing != null) {
                    return numericPageListing.f9175a;
                }
                return null;
            case 13:
                NumericPageListing numericPageListing2 = (NumericPageListing) obj;
                if (numericPageListing2 != null) {
                    return numericPageListing2.b;
                }
                return null;
            case 14:
                NumericPageListing numericPageListing3 = (NumericPageListing) obj;
                if (numericPageListing3 != null) {
                    return numericPageListing3.c;
                }
                return null;
            case 15:
                return ((PagedKeyProductSearchDataSource) obj).g;
            case 16:
                return ((PagedKeyProductSearchDataSource) obj).h;
            case 17:
                AutoCompleteUC.ResponseValue it9 = (AutoCompleteUC.ResponseValue) obj;
                Intrinsics.h(it9, "it");
                return new Pair(it9.b, it9.f21196a);
            case 18:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02X", Arrays.copyOf(new Object[]{b}, 1));
            case 19:
                Modifier conditional = (Modifier) obj;
                Intrinsics.h(conditional, "$this$conditional");
                return SizeKt.A(conditional, (3 & 1) != 0 ? Alignment.Companion.n : Alignment.Companion.o, false);
            case 20:
                Modifier conditional2 = (Modifier) obj;
                Intrinsics.h(conditional2, "$this$conditional");
                return SizeKt.u(conditional2, 0);
            case 21:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                return unit;
            case 22:
                BoostingState boostingState = BoostingState.d;
                return unit;
            case 23:
                Intrinsics.h((BoostingState) obj, "it");
                return unit;
            case 24:
                Sequence it10 = (Sequence) obj;
                Intrinsics.h(it10, "it");
                return it10.getF24664a();
            case 25:
                return obj;
            case 26:
                return Boolean.valueOf(obj == null);
            case 27:
                ArraysKt.l(null, obj);
                throw null;
            case 28:
                String line = (String) obj;
                Intrinsics.h(line, "line");
                return line;
            default:
                CharSequence it11 = (CharSequence) obj;
                Intrinsics.h(it11, "it");
                return it11.toString();
        }
    }
}
