package au.com.woolworths.foundation.shop.olive.voice.data;

import au.com.woolworths.foundation.shop.olive.voice.VoiceSearchQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"olive-voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class VoiceSearchQueryVoiceSearchExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public static final VoiceSearchResultData a(VoiceSearchQuery.VoiceSearch voiceSearch) {
        ?? arrayList;
        Intrinsics.h(voiceSearch, "<this>");
        String str = voiceSearch.f8817a;
        List list = voiceSearch.b;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = EmptyList.d;
        }
        return new VoiceSearchResultData(str, arrayList);
    }
}
