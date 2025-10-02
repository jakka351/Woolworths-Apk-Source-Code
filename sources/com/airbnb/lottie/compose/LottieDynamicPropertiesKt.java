package com.airbnb.lottie.compose;

import androidx.compose.runtime.Composer;
import com.airbnb.lottie.model.KeyPath;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004¨\u0006\u0007²\u00063\u0010\u0006\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00008\nX\u008a\u0084\u0002"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "frameInfo", "callbackState", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LottieDynamicPropertiesKt {
    public static final LottieDynamicProperties a(LottieDynamicProperty[] lottieDynamicPropertyArr, Composer composer) {
        composer.F(-395574495);
        int iHashCode = Arrays.hashCode(lottieDynamicPropertyArr);
        composer.F(34468001);
        boolean zR = composer.r(iHashCode);
        Object objG = composer.G();
        if (zR || objG == Composer.Companion.f1624a) {
            objG = new LottieDynamicProperties(ArraysKt.l0(lottieDynamicPropertyArr));
            composer.A(objG);
        }
        LottieDynamicProperties lottieDynamicProperties = (LottieDynamicProperties) objG;
        composer.N();
        composer.N();
        return lottieDynamicProperties;
    }

    public static final LottieDynamicProperty b(Object obj, Object obj2, String[] strArr, Composer composer) {
        composer.F(-1788530187);
        composer.F(1613443961);
        boolean zN = composer.n(strArr);
        Object objG = composer.G();
        Object obj3 = Composer.Companion.f1624a;
        if (zN || objG == obj3) {
            objG = new KeyPath((String[]) Arrays.copyOf(strArr, strArr.length));
            composer.A(objG);
        }
        KeyPath keyPath = (KeyPath) objG;
        composer.N();
        composer.F(1613444012);
        boolean zN2 = composer.n(keyPath) | composer.n(obj2);
        Object objG2 = composer.G();
        if (zN2 || objG2 == obj3) {
            objG2 = new LottieDynamicProperty(obj, keyPath, obj2);
            composer.A(objG2);
        }
        LottieDynamicProperty lottieDynamicProperty = (LottieDynamicProperty) objG2;
        composer.N();
        composer.N();
        return lottieDynamicProperty;
    }
}
