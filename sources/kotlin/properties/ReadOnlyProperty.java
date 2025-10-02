package kotlin.properties;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/properties/ReadOnlyProperty;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ReadOnlyProperty<T, V> {
    Object getValue(Object obj, KProperty kProperty);
}
