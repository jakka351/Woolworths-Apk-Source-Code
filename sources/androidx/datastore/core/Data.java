package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/Data;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/State;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Data<T> extends State<T> {
    public final Object b;
    public final int c;

    public Data(int i, int i2, Object obj) {
        super(i2);
        this.b = obj;
        this.c = i;
    }
}
