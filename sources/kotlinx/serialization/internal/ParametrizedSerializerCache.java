package kotlinx.serialization.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/ParametrizedSerializerCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ParametrizedSerializerCache<T> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    Object a(KClass kClass, ArrayList arrayList);
}
