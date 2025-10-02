package kotlin.properties;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/properties/ReadWriteProperty;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "Lkotlin/properties/ReadOnlyProperty;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ReadWriteProperty<T, V> extends ReadOnlyProperty<T, V> {
    void setValue(Object obj, KProperty kProperty, Object obj2);
}
