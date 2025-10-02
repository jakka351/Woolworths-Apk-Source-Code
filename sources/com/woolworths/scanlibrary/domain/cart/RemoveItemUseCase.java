package com.woolworths.scanlibrary.domain.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.cart.ui.cart.l;
import com.woolworths.scanlibrary.base.UseCase;
import com.woolworths.scanlibrary.data.ScanNGoRepository;
import com.woolworths.scanlibrary.data.authentication.token.b;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.data.source.remote.ApigeeDataSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleFlatMap;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/domain/cart/RemoveItemUseCase;", "Lcom/woolworths/scanlibrary/base/UseCase;", "Lcom/woolworths/scanlibrary/domain/cart/RemoveItemUseCase$RequestValues;", "Lcom/woolworths/scanlibrary/domain/cart/RemoveItemUseCase$ResponseValue;", "RequestValues", "ResponseValue", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RemoveItemUseCase extends UseCase<RequestValues, ResponseValue> {
    public final ScanNGoRepository c;
    public final Cart d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/cart/RemoveItemUseCase$RequestValues;", "Lcom/woolworths/scanlibrary/base/UseCase$RequestValues;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestValues implements UseCase.RequestValues {

        /* renamed from: a, reason: collision with root package name */
        public final int f21176a;
        public final String b;

        public RequestValues(int i, String lineItemNo) {
            Intrinsics.h(lineItemNo, "lineItemNo");
            this.f21176a = i;
            this.b = lineItemNo;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/cart/RemoveItemUseCase$ResponseValue;", "Lcom/woolworths/scanlibrary/base/UseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ResponseValue implements UseCase.ResponseValue {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveItemUseCase(ScanNGoRepository scanNGoRepository, Cart cart, Scheduler scheduler) {
        super(scheduler, true);
        Intrinsics.h(cart, "cart");
        this.c = scanNGoRepository;
        this.d = cart;
    }

    @Override // com.woolworths.scanlibrary.base.UseCase
    public final Single a(UseCase.RequestValues requestValues) throws UnsupportedEncodingException {
        RequestValues requestValues2 = (RequestValues) requestValues;
        int i = requestValues2.f21176a;
        String lineItemNo = requestValues2.b;
        ScanNGoRepository scanNGoRepository = this.c;
        scanNGoRepository.getClass();
        Intrinsics.h(lineItemNo, "lineItemNo");
        ApigeeDataSource apigeeDataSource = scanNGoRepository.f21149a.f21163a;
        Boolean bool = Boolean.FALSE;
        String strEncode = URLEncoder.encode(lineItemNo, StandardCharsets.UTF_8.name());
        Intrinsics.g(strEncode, "encode(...)");
        return new SingleFlatMap(apigeeDataSource.O(i, "simple", bool, strEncode).h(scanNGoRepository.b), new b(new l(24, this, lineItemNo), 6));
    }
}
