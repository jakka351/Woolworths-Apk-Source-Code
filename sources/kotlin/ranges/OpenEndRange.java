package kotlin.ranges;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;

@SinceKotlin
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0000\bg\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/OpenEndRange;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@WasExperimental
/* loaded from: classes.dex */
public interface OpenEndRange<T extends Comparable<? super T>> {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
    }

    boolean contains(Comparable comparable);
}
