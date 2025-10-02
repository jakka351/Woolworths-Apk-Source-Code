package au.com.woolworths.feature.shop.wpay.data.source;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.wpay.domain.FraudPreventionRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lib.android.paypal.com.magnessdk.MagnesSDK;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/data/source/FraudPreventionDataRepository;", "Lau/com/woolworths/feature/shop/wpay/domain/FraudPreventionRepository;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FraudPreventionDataRepository implements FraudPreventionRepository {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8266a;
    public final MagnesSDK b;

    public FraudPreventionDataRepository(Context context, MagnesSDK magnesSDK) {
        Intrinsics.h(context, "context");
        this.f8266a = context;
        this.b = magnesSDK;
    }
}
