package au.com.woolworths.feature.shop.wpay.di;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.braintree.MagnesEnvironment;
import dagger.Module;
import dagger.hilt.InstallIn;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/di/ShopWPayAppModule;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
@InstallIn
/* loaded from: classes.dex */
public final class ShopWPayAppModule {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[MagnesEnvironment.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MagnesEnvironment magnesEnvironment = MagnesEnvironment.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
