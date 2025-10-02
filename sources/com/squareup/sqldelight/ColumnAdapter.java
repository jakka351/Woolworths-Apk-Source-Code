package com.squareup.sqldelight;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0001¨\u0006\u0004"}, d2 = {"Lcom/squareup/sqldelight/ColumnAdapter;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "S", "runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public interface ColumnAdapter<T, S> {
    Object decode(Object obj);

    Object encode(Object obj);
}
