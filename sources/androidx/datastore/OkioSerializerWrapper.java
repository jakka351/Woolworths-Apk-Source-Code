package androidx.datastore;

import androidx.datastore.core.Serializer;
import androidx.datastore.core.okio.OkioSerializer;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okio.RealBufferedSource;
import okio.RealBufferedSource$inputStream$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/OkioSerializerWrapper;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/okio/OkioSerializer;", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OkioSerializerWrapper<T> implements OkioSerializer<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Serializer f2558a;

    public OkioSerializerWrapper(Serializer serializer) {
        this.f2558a = serializer;
    }

    public final Object a(RealBufferedSource realBufferedSource, Continuation continuation) {
        return this.f2558a.readFrom(new RealBufferedSource$inputStream$1(realBufferedSource), continuation);
    }
}
