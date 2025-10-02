package au.com.woolworths.shop.checkout.data.source;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.ServerError;
import au.com.woolworths.android.onesite.network.ServerErrorCode;
import com.apollographql.apollo.api.Error;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/data/source/MutationErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MutationErrorException extends Exception {
    public final ServerError d;

    public MutationErrorException(List list) {
        Error error;
        super((Throwable) null);
        this.d = (list == null || (error = (Error) CollectionsKt.F(list)) == null) ? new ServerError(ServerErrorCode.d, "Missing errors in GraphQl response") : ExceptionExtKt.g(error);
    }
}
