package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/paging/SeparatorState;", "", "R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SeparatorState<R, T extends R> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TerminalSeparatorType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static TransformablePage a(TransformablePage transformablePage) {
        int[] iArr = transformablePage.f3590a;
        List list = transformablePage.b;
        List listR = CollectionsKt.R(CollectionsKt.D(list), CollectionsKt.O(list));
        int i = transformablePage.c;
        List list2 = transformablePage.d;
        return new TransformablePage(iArr, listR, i, CollectionsKt.R(Integer.valueOf(list2 != null ? ((Number) CollectionsKt.D(list2)).intValue() : 0), Integer.valueOf(list2 != null ? ((Number) CollectionsKt.O(list2)).intValue() : CollectionsKt.I(list))));
    }
}
