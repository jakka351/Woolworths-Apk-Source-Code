package au.com.woolworths.shop.digipay.di;

import android.util.Base64;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.pay.sdk.models.config.Configuration;
import au.com.woolworths.pay.sdk.models.config.Environment;
import au.com.woolworths.shop.digipay.di.DigipaySdkAppModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.nio.charset.Charset;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class DigipaySdkAppModule_ProvideDigitalPayConfigurationFactory implements Factory<Configuration> {
    public static DigipaySdkAppModule$provideDigitalPayConfiguration$1 a(DigipaySdkAppModule digipaySdkAppModule, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl) {
        Pair pair;
        digipaySdkAppModule.getClass();
        if (AppEnvironment.Production.INSTANCE == null) {
            throw new NoWhenBranchMatchedException();
        }
        Environment environment = Environment.PRODUCTION;
        int i = DigipaySdkAppModule.WhenMappings.f10919a[environment.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            byte[] bArrDecode = Base64.decode("emlGeFZBYWd6M2tPMkgyczN1aExHaGhDZlBlZzBtd1E=", 2);
            Intrinsics.g(bArrDecode, "decode(...)");
            Charset charset = Charsets.f24671a;
            String str = new String(bArrDecode, charset);
            byte[] bArrDecode2 = Base64.decode("MzhFVXl4a0l0V0NBemJ4TA==", 2);
            Intrinsics.g(bArrDecode2, "decode(...)");
            pair = new Pair(str, new String(bArrDecode2, charset));
        } else {
            pair = new Pair("", "");
        }
        return new DigipaySdkAppModule$provideDigitalPayConfiguration$1((String) pair.d, (String) pair.e, false, environment);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
