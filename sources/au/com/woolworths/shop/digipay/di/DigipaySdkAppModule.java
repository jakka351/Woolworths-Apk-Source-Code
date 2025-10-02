package au.com.woolworths.shop.digipay.di;

import au.com.woolworths.pay.sdk.models.config.Environment;
import dagger.Module;
import dagger.hilt.InstallIn;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/digipay/di/DigipaySdkAppModule;", "", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
@InstallIn
/* loaded from: classes.dex */
public final class DigipaySdkAppModule {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10919a;

        static {
            int[] iArr = new int[Environment.values().length];
            try {
                iArr[Environment.WOOLWORTHS_DEV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Environment.PRODUCTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Environment.WOOLWORTHS_UAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Environment.WOOLWORTHS_TEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10919a = iArr;
        }
    }
}
