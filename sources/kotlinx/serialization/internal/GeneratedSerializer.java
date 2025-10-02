package kotlinx.serialization.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/GeneratedSerializer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InternalSerializationApi
/* loaded from: classes.dex */
public interface GeneratedSerializer<T> extends KSerializer<T> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
    }

    KSerializer[] childSerializers();

    KSerializer[] typeParametersSerializers();
}
